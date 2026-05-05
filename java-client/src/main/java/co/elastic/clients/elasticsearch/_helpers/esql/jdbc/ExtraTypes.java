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

import java.sql.JDBCType;
import java.sql.Types;

/**
 * Provides ODBC-based codes for the missing SQL data types from {@link Types}/{@link JDBCType}.
 */
final class ExtraTypes {

    private ExtraTypes() {}

    static final int INTERVAL_YEAR = 101;
    static final int INTERVAL_MONTH = 102;
    static final int INTERVAL_DAY = 103;
    static final int INTERVAL_HOUR = 104;
    static final int INTERVAL_MINUTE = 105;
    static final int INTERVAL_SECOND = 106;
    static final int INTERVAL_YEAR_MONTH = 107;
    static final int INTERVAL_DAY_HOUR = 108;
    static final int INTERVAL_DAY_MINUTE = 109;
    static final int INTERVAL_DAY_SECOND = 110;
    static final int INTERVAL_HOUR_MINUTE = 111;
    static final int INTERVAL_HOUR_SECOND = 112;
    static final int INTERVAL_MINUTE_SECOND = 113;
    static final int GEOMETRY = 114;

}
