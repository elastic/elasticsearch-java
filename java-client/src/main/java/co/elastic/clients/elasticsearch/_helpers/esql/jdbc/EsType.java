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

import java.sql.SQLType;
import java.sql.Types;

enum EsType implements SQLType {

    NULL(Types.NULL),
    UNSUPPORTED(Types.OTHER),
    BOOLEAN(Types.BOOLEAN),
    BYTE(Types.TINYINT),
    SHORT(Types.SMALLINT),
    INTEGER(Types.INTEGER),
    LONG(Types.BIGINT),
    DOUBLE(Types.DOUBLE),
    FLOAT(Types.REAL),
    HALF_FLOAT(Types.FLOAT),
    SCALED_FLOAT(Types.FLOAT),
    KEYWORD(Types.VARCHAR),
    TEXT(Types.VARCHAR),
    OBJECT(Types.STRUCT),
    NESTED(Types.STRUCT),
    BINARY(Types.VARBINARY),
    DATE(Types.DATE),
    TIME(Types.TIME),
    DATETIME(Types.TIMESTAMP),
    IP(Types.VARCHAR),
    INTERVAL_YEAR(ExtraTypes.INTERVAL_YEAR),
    INTERVAL_MONTH(ExtraTypes.INTERVAL_MONTH),
    INTERVAL_YEAR_TO_MONTH(ExtraTypes.INTERVAL_YEAR_MONTH),
    INTERVAL_DAY(ExtraTypes.INTERVAL_DAY),
    INTERVAL_HOUR(ExtraTypes.INTERVAL_HOUR),
    INTERVAL_MINUTE(ExtraTypes.INTERVAL_MINUTE),
    INTERVAL_SECOND(ExtraTypes.INTERVAL_SECOND),
    INTERVAL_DAY_TO_HOUR(ExtraTypes.INTERVAL_DAY_HOUR),
    INTERVAL_DAY_TO_MINUTE(ExtraTypes.INTERVAL_DAY_MINUTE),
    INTERVAL_DAY_TO_SECOND(ExtraTypes.INTERVAL_DAY_SECOND),
    INTERVAL_HOUR_TO_MINUTE(ExtraTypes.INTERVAL_HOUR_MINUTE),
    INTERVAL_HOUR_TO_SECOND(ExtraTypes.INTERVAL_HOUR_SECOND),
    INTERVAL_MINUTE_TO_SECOND(ExtraTypes.INTERVAL_MINUTE_SECOND),
    GEO_POINT(ExtraTypes.GEOMETRY),
    GEO_SHAPE(ExtraTypes.GEOMETRY),
    SHAPE(ExtraTypes.GEOMETRY),
    UNSIGNED_LONG(Types.NUMERIC),
    VERSION(Types.VARCHAR);

    private final Integer type;

    EsType(int type) {
        this.type = Integer.valueOf(type);
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public String getVendor() {
        return "co.elastic.clients";
    }

    @Override
    public Integer getVendorTypeNumber() {
        return type;
    }
}
