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

package co.elastic.clients.json;

import jakarta.json.stream.JsonLocation;

class JsonLocationImpl implements JsonLocation {

    private final long columnNo;
    private final long lineNo;
    private final long offset;

    JsonLocationImpl(long lineNo, long columnNo, long streamOffset) {
        this.lineNo = lineNo;
        this.columnNo = columnNo;
        this.offset = streamOffset;
    }

    @Override
    public long getLineNumber() {
        return lineNo;
    }

    @Override
    public long getColumnNumber() {
        return columnNo;
    }

    @Override
    public long getStreamOffset() {
        return offset;
    }

    @Override
    public String toString() {
        return "(line no=" + lineNo + ", column no=" + columnNo + ", offset=" + offset + ")";
    }
}
