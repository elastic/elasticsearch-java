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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpDeserializerBase;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import javax.annotation.Nullable;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.util.EnumSet;
import java.util.Locale;

/**
 * A date-time that can be represented either as a string or a number of milliseconds since the Epoch.
 * <p>
 * The string for can also be used to represent date-math expressions where applicable.
 */
@JsonpDeserializable
public class DateTime implements JsonpSerializable {

    private final long millis;
    @Nullable
    private final String str;

    // Visible for testing
    @Nullable
    final DateTimeFormatter formatter;

    private DateTime(long epochMillis, String str, DateTimeFormatter format) {
        this.millis = epochMillis;
        this.str = str;
        this.formatter = format;
    }

    /**
     * Create a new date-time from Epoch milliseconds. It will be serialized to JSON as a string.
     *
     * @param epochMilli the timestamp
     * @param format the format used to format the date-time as a JSON string
     */
    public static DateTime ofEpochMilli(long epochMilli, DateTimeFormatter format) {
        return new DateTime(epochMilli, null, format);
    }

    /**
     * Create a new date-time from Epoch milliseconds. It will be serialized to JSON as a number.
     *
     * @param epochMilli the timestamp
     */
    public static DateTime ofEpochMilli(long epochMilli) {
        return ofEpochMilli(epochMilli, null);
    }

    /**
     * Create a new date-time or a date-math expression from a string. It will be serialized to JSON as is,
     * conversion to an <code>Instant</code> will use the default parsers.
     *
     * @param text the date-time as a string, or a date-math expression. If a date-math expression,
     *             the result will fail to be converted to another type.
     */
    public static DateTime of(String text) {
        return of(text, null);
    }

    /**
     * Create a new date-time from a string and parser. It will be serialized to JSON as is.
     *
     * @param text the date-time as a string
     * @param parser the parser used to convert the date-time to an <code>Instant</code>
     */
    public static DateTime of(String text, DateTimeFormatter parser) {
        return new DateTime(0, text, parser);
    }

    /**
     * Create a new date-time from a <code>Temporal</code> object. It will be serialized to JSON as milliseconds since the Epoch.
     *
     * @param instant the date-time
     */
    public static DateTime of(Temporal instant) {
        return of(instant, null);
    }

    /**
     * Create a new date-time from a <code>Temporal</code> object. It will be serialized to JSON as a string.
     *
     * @param instant the date-time
     * @param format the format used to convert to a JSON string
     */
    public static DateTime of(Temporal instant, DateTimeFormatter format) {
        long millis = instant.getLong(ChronoField.INSTANT_SECONDS)*1000L + instant.getLong(ChronoField.MILLI_OF_SECOND);
        return new DateTime(millis, null, format);
    }

    /**
     * Get the string that was used to create this date-time, or <code>null</code>
     * if it was created with a number of milliseconds.
     */
    @Nullable
    public String getString() {
        return str;
    }

    /**
     * Get the formatter associated with this date-time, if any.
     */
    @Nullable
    DateTimeFormatter getFormatter() {
        return formatter;
    }

    /**
     * Converts this object to an <code>Instant</code>.
     *
     * @throws DateTimeParseException if this object was created from a string which can not be parsed
     */
    public Instant toInstant() {
        if (str == null) {
            return Instant.ofEpochMilli(millis);
        } else {
            if (formatter == null) {
                try {
                    ZonedDateTime zdt = DateTimeUtil.from(
                        DateTimeUtil.STRICT_DATE_OPTIONAL_TIME_FORMATTER.parse(str),
                        Locale.ROOT,
                        ZoneOffset.UTC
                    );
                    return zdt.toInstant();
                } catch(DateTimeParseException dtpe) {
                    // Ignore
                }

                // Try milliseconds as string
                try {
                    long ms = Long.parseLong(str);
                    return Instant.ofEpochMilli(ms);
                } catch(NumberFormatException nfe) {
                    throw new DateTimeParseException(
                        "Cannot parse date-time with format [strict_date_optional_time||epoch_millis]", str, 0
                    );
                }
            } else {
                return formatter.parse(str, Instant::from);
            }
        }
    }

    /**
     * Converts this object to an <code>Instant</code>, using a given format.
     *
     * @param parser the parser to use if this object was created from a string
     * @throws DateTimeParseException if this object was created from a string which can not be parsed
     */
    public Instant toInstant(DateTimeFormatter parser) {
        if (str == null) {
            return Instant.ofEpochMilli(millis);
        } else {
            return parser.parse(str, Instant::from);
        }
    }

    /**
     * Converts this object to an <code>ZonedDateTime</code>.
     *
     * @throws DateTimeParseException if this object was created from a string which can not be parsed
     */
    public ZonedDateTime toZonedDateTime() {
        if (str == null) {
            return ZonedDateTime.ofInstant(toInstant(), ZoneOffset.UTC);
        } else {
            try {
                return DateTimeUtil.from(
                    DateTimeUtil.STRICT_DATE_OPTIONAL_TIME_FORMATTER.parse(str),
                    Locale.ROOT,
                    ZoneOffset.UTC
                );
            } catch(DateTimeParseException dtpe) {
                // Ignore
            }

            // Try milliseconds as string
            try {
                long ms = Long.parseLong(str);
                return ZonedDateTime.ofInstant(Instant.ofEpochMilli(ms), ZoneOffset.UTC);
            } catch(NumberFormatException nfe) {
                throw new DateTimeParseException("Cannot parse date-time with format [strict_date_optional_time||epoch_millis]", str, 0);
            }
        }
    }

    /**
     * Converts this object to an <code>ZonedDateTime</code>, using a given format.
     *
     * @param parser the parser to use if this object was created from a string
     * @throws DateTimeParseException if this object was created from a string which can not be parsed
     */
    public ZonedDateTime toZonedDateTime(DateTimeFormatter parser) {
        if (str == null) {
            return ZonedDateTime.ofInstant(toInstant(), ZoneOffset.UTC);
        } else {
            return parser.parse(str, ZonedDateTime::from);
        }
    }

    /**
     * Get the milliseconds since the Epoch for represented by this object. If it was created from a string,
     * it is first converted using {@link #toInstant()}.
     *
     * @throws DateTimeParseException if this object was created from a string which can not be parsed
     */
    public long toEpochMilli() {
        if (str == null) {
            return millis;
        } else {
            return toInstant().toEpochMilli();
        }
    }

    /**
     * Get the milliseconds since the Epoch for represented by this object. If it was created from a string,
     * it is first converted using {@link #toInstant(DateTimeFormatter)}.
     *
     * @param format the parser to use if this object was created from a string
     * @throws DateTimeParseException if this object was created from a string which can not be parsed
     */
    public long toEpochMilli(DateTimeFormatter format) {
        if (str == null) {
            return millis;
        } else {
            return toInstant(format).toEpochMilli();
        }
    }

    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        if (str == null) {
            if (formatter == null) {
                generator.write(millis);
            } else {
                generator.write(formatter.format(Instant.ofEpochMilli(millis).atZone(ZoneOffset.UTC)));
            }
        } else {
            generator.write(str);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.toInstant().equals(((DateTime) o).toInstant());
    }

    @Override
    public int hashCode() {
        return toInstant().hashCode();
    }

    @Override
    public String toString() {
        if (str == null) {
            if (formatter == null) {
                return String.valueOf(millis);
            } else {
                return formatter.format(Instant.ofEpochMilli(millis).atZone(ZoneOffset.UTC));
            }
        } else {
            return str;
        }
    }

    public static JsonpDeserializer<DateTime> _DESERIALIZER = new TimestampDeserializer();

    private static class TimestampDeserializer extends JsonpDeserializerBase<DateTime> {
        TimestampDeserializer() {
            super(EnumSet.of(JsonParser.Event.VALUE_NUMBER, JsonParser.Event.VALUE_STRING));
        }

        @Override
        public DateTime deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
            if (event == JsonParser.Event.VALUE_NUMBER) {
                return DateTime.ofEpochMilli(parser.getLong());
            } else {
                return DateTime.of(parser.getString());
            }
        }
    }
}
