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

import java.math.BigInteger;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Collections;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.unmodifiableMap;

final class TypeUtils {

    private TypeUtils() {}

    private static final Map<Class<?>, EsType> CLASS_TO_TYPE;
    private static final Map<EsType, Class<?>> TYPE_TO_CLASS;
    private static final Map<String, EsType> ENUM_NAME_TO_TYPE;

    private static final Set<EsType> SIGNED_TYPE = EnumSet.of(
        EsType.BYTE,
        EsType.SHORT,
        EsType.INTEGER,
        EsType.LONG,
        EsType.FLOAT,
        EsType.HALF_FLOAT,
        EsType.SCALED_FLOAT,
        EsType.DOUBLE,
        EsType.DATETIME
    );

    public static final int LONG_MAX_LENGTH = String.valueOf(Long.MAX_VALUE).length(); // type length value as defined in ES

    static {
        // Note: keep in sync with org.elasticsearch.xpack.sql.qa.jdbc.JdbcTestUtils#CLASS_TO_ES_TYPE
        Map<Class<?>, EsType> aMap = new LinkedHashMap<>();
        aMap.put(Boolean.class, EsType.BOOLEAN);
        aMap.put(Byte.class, EsType.BYTE);
        aMap.put(Short.class, EsType.SHORT);
        aMap.put(Integer.class, EsType.INTEGER);
        aMap.put(Long.class, EsType.LONG);
        aMap.put(BigInteger.class, EsType.UNSIGNED_LONG);
        aMap.put(Float.class, EsType.FLOAT);
        aMap.put(Double.class, EsType.DOUBLE);
        aMap.put(String.class, EsType.KEYWORD);
        aMap.put(byte[].class, EsType.BINARY);
        aMap.put(Timestamp.class, EsType.DATETIME);

        // apart from the mappings in {@code DataType} three more Java classes can be mapped to a {@code JDBCType.TIMESTAMP}
        // according to B-4 table from the jdbc4.2 spec
        aMap.put(Calendar.class, EsType.DATETIME);
        aMap.put(GregorianCalendar.class, EsType.DATETIME);
        aMap.put(java.util.Date.class, EsType.DATETIME);
        aMap.put(java.sql.Date.class, EsType.DATETIME);
        aMap.put(java.sql.Time.class, EsType.TIME);
        aMap.put(LocalDateTime.class, EsType.DATETIME);
        CLASS_TO_TYPE = Collections.unmodifiableMap(aMap);

        Map<EsType, Class<?>> types = new LinkedHashMap<>();
        types.put(EsType.BOOLEAN, Boolean.class);
        types.put(EsType.BYTE, Byte.class);
        types.put(EsType.SHORT, Short.class);
        types.put(EsType.INTEGER, Integer.class);
        types.put(EsType.LONG, Long.class);
        types.put(EsType.UNSIGNED_LONG, BigInteger.class);
        types.put(EsType.DOUBLE, Double.class);
        types.put(EsType.FLOAT, Float.class);
        types.put(EsType.HALF_FLOAT, Double.class);
        types.put(EsType.SCALED_FLOAT, Double.class);
        types.put(EsType.KEYWORD, String.class);
        types.put(EsType.TEXT, String.class);
        types.put(EsType.BINARY, byte[].class);
        types.put(EsType.DATETIME, Timestamp.class);
        types.put(EsType.IP, String.class);
        types.put(EsType.VERSION, String.class);
        types.put(EsType.INTERVAL_YEAR, Period.class);
        types.put(EsType.INTERVAL_MONTH, Period.class);
        types.put(EsType.INTERVAL_YEAR_TO_MONTH, Period.class);
        types.put(EsType.INTERVAL_DAY, Duration.class);
        types.put(EsType.INTERVAL_HOUR, Duration.class);
        types.put(EsType.INTERVAL_MINUTE, Duration.class);
        types.put(EsType.INTERVAL_SECOND, Duration.class);
        types.put(EsType.INTERVAL_DAY_TO_HOUR, Duration.class);
        types.put(EsType.INTERVAL_DAY_TO_MINUTE, Duration.class);
        types.put(EsType.INTERVAL_DAY_TO_SECOND, Duration.class);
        types.put(EsType.INTERVAL_HOUR_TO_MINUTE, Duration.class);
        types.put(EsType.INTERVAL_HOUR_TO_SECOND, Duration.class);
        types.put(EsType.INTERVAL_MINUTE_TO_SECOND, Duration.class);
        types.put(EsType.GEO_POINT, String.class);
        types.put(EsType.GEO_SHAPE, String.class);
        types.put(EsType.SHAPE, String.class);

        TYPE_TO_CLASS = unmodifiableMap(types);

        Map<String, EsType> strings = new LinkedHashMap<>();

        for (EsType dataType : EsType.values()) {
            strings.put(dataType.getName().toLowerCase(Locale.ROOT), dataType);
        }

        ENUM_NAME_TO_TYPE = unmodifiableMap(strings);
    }

    static boolean isSigned(EsType type) {
        return SIGNED_TYPE.contains(type);
    }

    static Class<?> classOf(EsType type) {
        return TYPE_TO_CLASS.get(type);
    }

    static EsType of(String name) throws SQLException {
        EsType dataType = ENUM_NAME_TO_TYPE.get(name);
        if (dataType == null) {
            throw new SQLFeatureNotSupportedException("Unsupported Data type [" + name + "]");
        }
        return dataType;
    }
}
