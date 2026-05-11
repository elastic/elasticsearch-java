/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.WeekFields;
import java.util.Locale;


// Borrowed from Elasticsearch's JavaDateFormatter & EpochTime
class DateTimeUtil {

    private static final DateTimeFormatter TIME_ZONE_FORMATTER_NO_COLON = new DateTimeFormatterBuilder().appendOffset("+HHmm", "Z")
        .toFormatter(Locale.ROOT)
        .withResolverStyle(ResolverStyle.STRICT);

    private static final DateTimeFormatter STRICT_YEAR_MONTH_DAY_FORMATTER = new DateTimeFormatterBuilder().appendValue(
            ChronoField.YEAR,
            4,
            4,
            SignStyle.EXCEEDS_PAD
        )
        .optionalStart()
        .appendLiteral("-")
        .appendValue(ChronoField.MONTH_OF_YEAR, 2, 2, SignStyle.NOT_NEGATIVE)
        .optionalStart()
        .appendLiteral('-')
        .appendValue(ChronoField.DAY_OF_MONTH, 2, 2, SignStyle.NOT_NEGATIVE)
        .optionalEnd()
        .optionalEnd()
        .toFormatter(Locale.ROOT)
        .withResolverStyle(ResolverStyle.STRICT);

    static final DateTimeFormatter STRICT_DATE_OPTIONAL_TIME_FORMATTER = new DateTimeFormatterBuilder().append(
            STRICT_YEAR_MONTH_DAY_FORMATTER
        )
        .optionalStart()
        .appendLiteral('T')
        .optionalStart()
        .appendValue(ChronoField.HOUR_OF_DAY, 2, 2, SignStyle.NOT_NEGATIVE)
        .optionalStart()
        .appendLiteral(':')
        .appendValue(ChronoField.MINUTE_OF_HOUR, 2, 2, SignStyle.NOT_NEGATIVE)
        .optionalStart()
        .appendLiteral(':')
        .appendValue(ChronoField.SECOND_OF_MINUTE, 2, 2, SignStyle.NOT_NEGATIVE)
        .optionalStart()
        .appendFraction(ChronoField.NANO_OF_SECOND, 1, 9, true)
        .optionalEnd()
        .optionalStart()
        .appendLiteral(',')
        .appendFraction(ChronoField.NANO_OF_SECOND, 1, 9, false)
        .optionalEnd()
        .optionalEnd()
        .optionalEnd()
        .optionalStart()
        .appendZoneOrOffsetId()
        .optionalEnd()
        .optionalStart()
        .append(TIME_ZONE_FORMATTER_NO_COLON)
        .optionalEnd()
        .optionalEnd()
        .optionalEnd()
        .toFormatter(Locale.ROOT)
        .withResolverStyle(ResolverStyle.STRICT);

    //---------------------------------------------

    private static final LocalDate LOCALDATE_EPOCH = LocalDate.of(1970, 1, 1);

    private static int getYear(TemporalAccessor accessor) {
        if (accessor.isSupported(ChronoField.YEAR)) {
            return accessor.get(ChronoField.YEAR);
        }
        if (accessor.isSupported(ChronoField.YEAR_OF_ERA)) {
            return accessor.get(ChronoField.YEAR_OF_ERA);
        }
        return 1970;
    }

    static final TemporalQuery<LocalDate> LOCAL_DATE_QUERY = new TemporalQuery<LocalDate>() {
        @Override
        public LocalDate queryFrom(TemporalAccessor temporal) {
            if (temporal.isSupported(ChronoField.EPOCH_DAY)) {
                return LocalDate.ofEpochDay(temporal.getLong(ChronoField.EPOCH_DAY));
            } else if (temporal.isSupported(ChronoField.YEAR_OF_ERA) || temporal.isSupported(ChronoField.YEAR)) {
                int year = getYear(temporal);
                if (temporal.isSupported(ChronoField.MONTH_OF_YEAR) && temporal.isSupported(ChronoField.DAY_OF_MONTH)) {
                    return LocalDate.of(year, temporal.get(ChronoField.MONTH_OF_YEAR), temporal.get(ChronoField.DAY_OF_MONTH));
                } else if (temporal.isSupported(ChronoField.DAY_OF_YEAR)) {
                    return LocalDate.ofYearDay(year, temporal.get(ChronoField.DAY_OF_YEAR));
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return "LocalDate";
        }
    };

    private static ZonedDateTime of(LocalDate localDate, LocalTime localTime, ZoneId zoneId) {
        return ZonedDateTime.of(localDate, localTime, zoneId);
    }

    private static LocalDate localDateFromWeekBasedDate(TemporalAccessor accessor, Locale locale) {
        WeekFields weekFields = WeekFields.of(locale);
        if (accessor.isSupported(weekFields.weekOfWeekBasedYear())) {
            return LocalDate.ofEpochDay(0)
                .with(weekFields.weekBasedYear(), accessor.get(weekFields.weekBasedYear()))
                .with(weekFields.weekOfWeekBasedYear(), accessor.get(weekFields.weekOfWeekBasedYear()))
                .with(TemporalAdjusters.previousOrSame(weekFields.getFirstDayOfWeek()));
        } else {
            return LocalDate.ofEpochDay(0)
                .with(weekFields.weekBasedYear(), accessor.get(weekFields.weekBasedYear()))
                .with(TemporalAdjusters.previousOrSame(weekFields.getFirstDayOfWeek()));

        }
    }

    private static LocalDate getLocalDate(TemporalAccessor accessor, Locale locale) {
        if (accessor.isSupported(WeekFields.of(locale).weekBasedYear())) {
            return localDateFromWeekBasedDate(accessor, locale);
        } else if (accessor.isSupported(ChronoField.MONTH_OF_YEAR)) {
            int year = getYear(accessor);
            if (accessor.isSupported(ChronoField.DAY_OF_MONTH)) {
                return LocalDate.of(year, accessor.get(ChronoField.MONTH_OF_YEAR), accessor.get(ChronoField.DAY_OF_MONTH));
            } else {
                return LocalDate.of(year, accessor.get(ChronoField.MONTH_OF_YEAR), 1);
            }
        }

        return LOCALDATE_EPOCH;
    }

    private static LocalDate getFirstOfMonth(TemporalAccessor accessor) {
        return LocalDate.of(getYear(accessor), accessor.get(ChronoField.MONTH_OF_YEAR), 1);
    }

    public static ZonedDateTime from(TemporalAccessor accessor, Locale locale, ZoneId defaultZone) {
        if (accessor instanceof ZonedDateTime) {
            return (ZonedDateTime) accessor;
        }

        ZoneId zoneId = accessor.query(TemporalQueries.zone());
        if (zoneId == null) {
            zoneId = defaultZone;
        }

        LocalDate localDate = accessor.query(LOCAL_DATE_QUERY);
        LocalTime localTime = accessor.query(TemporalQueries.localTime());
        boolean isLocalDateSet = localDate != null;
        boolean isLocalTimeSet = localTime != null;

        // the first two cases are the most common, so this allows us to exit early when parsing dates
        if (isLocalDateSet && isLocalTimeSet) {
            return of(localDate, localTime, zoneId);
        } else if (accessor.isSupported(ChronoField.INSTANT_SECONDS) && accessor.isSupported(ChronoField.NANO_OF_SECOND)) {
            return Instant.from(accessor).atZone(zoneId);
        } else if (isLocalDateSet) {
            return localDate.atStartOfDay(zoneId);
        } else if (isLocalTimeSet) {
            return of(getLocalDate(accessor, locale), localTime, zoneId);
        } else if (accessor.isSupported(ChronoField.YEAR) || accessor.isSupported(ChronoField.YEAR_OF_ERA)) {
            if (accessor.isSupported(ChronoField.MONTH_OF_YEAR)) {
                return getFirstOfMonth(accessor).atStartOfDay(zoneId);
            } else {
                int year = getYear(accessor);
                return Year.of(year).atDay(1).atStartOfDay(zoneId);
            }
        } else if (accessor.isSupported(ChronoField.MONTH_OF_YEAR)) {
            // missing year, falling back to the epoch and then filling
            return getLocalDate(accessor, locale).atStartOfDay(zoneId);
        } else if (accessor.isSupported(WeekFields.of(locale).weekBasedYear())) {
            return localDateFromWeekBasedDate(accessor, locale).atStartOfDay(zoneId);
        }

        // we should not reach this piece of code, everything being parsed we should be able to
        // convert to a zoned date time! If not, we have to extend the above methods
        throw new IllegalArgumentException("temporal accessor [" + accessor + "] cannot be converted to zoned date time");
    }
}
