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

package co.elastic.clients.elasticsearch._helpers.esql.jdbc;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.function.Function;

import static co.elastic.clients.elasticsearch._helpers.esql.jdbc.StringUtils.ISO_DATETIME_WITH_NANOS;
import static co.elastic.clients.elasticsearch._helpers.esql.jdbc.StringUtils.ISO_TIME_WITH_NANOS;

/**
 * JDBC specific datetime specific utility methods. Because of lack of visibility, this class borrows code
 * from {@code org.elasticsearch.xpack.sql.util.DateUtils} and {@code org.elasticsearch.xpack.sql.proto.StringUtils}.
 */
class JdbcDateUtils {

    private JdbcDateUtils() {}

    // In Java 8 LocalDate.EPOCH is not available, introduced with later Java versions
    private static final LocalDate EPOCH = LocalDate.of(1970, 1, 1);

    static ZonedDateTime asZonedDateTime(String date) {
        return ISO_DATETIME_WITH_NANOS.parse(date, ZonedDateTime::from);
    }

    static long dateTimeAsMillisSinceEpoch(String date) {
        return asZonedDateTime(date).toInstant().toEpochMilli();
    }

    static long timeAsMillisSinceEpoch(String date) {
        return ISO_TIME_WITH_NANOS.parse(date, OffsetTime::from).atDate(EPOCH).toInstant().toEpochMilli();
    }

    static Date asDate(String date) {
        ZonedDateTime zdt = asZonedDateTime(date);
        return new Date(zdt.toLocalDate().atStartOfDay(zdt.getZone()).toInstant().toEpochMilli());
    }

    static Time asTime(String date) {
        ZonedDateTime zdt = asZonedDateTime(date);
        return new Time(zdt.toLocalTime().atDate(EPOCH).atZone(zdt.getZone()).toInstant().toEpochMilli());
    }

    static Time timeAsTime(String date) {
        OffsetTime ot = ISO_TIME_WITH_NANOS.parse(date, OffsetTime::from);
        return new Time(ot.atDate(EPOCH).toInstant().toEpochMilli());
    }

    static Timestamp asTimestamp(long millisSinceEpoch) {
        return new Timestamp(millisSinceEpoch);
    }

    static Timestamp asTimestamp(String date) {
        ZonedDateTime zdt = asZonedDateTime(date);
        Timestamp timestamp = new Timestamp(zdt.toInstant().toEpochMilli());
        timestamp.setNanos(zdt.getNano());
        return timestamp;
    }

    static Timestamp timeAsTimestamp(String date) {
        return new Timestamp(timeAsMillisSinceEpoch(date));
    }

    /*
     * Handles the value received as parameter, as either String (a ZonedDateTime formatted in ISO 8601 standard with millis) -
     * date fields being returned formatted like this. Or a Long value, in case of Histograms.
     */
    static <R> R asDateTimeField(Object value, Function<String, R> asDateTimeMethod, Function<Long, R> ctor) {
        if (value instanceof String) {
            return asDateTimeMethod.apply((String) value);
        } else {
            return ctor.apply(((Number) value).longValue());
        }
    }
}
