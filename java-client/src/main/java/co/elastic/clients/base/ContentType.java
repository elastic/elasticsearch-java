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

package co.elastic.clients.base;

/**
 * Wraps a {@link MediaType} in the context of an HTTP
 * <em>Content-Type</em> header.
 */
public class ContentType implements ConvertibleToHeader {

    public static ContentType forMediaType(MediaType mediaType) {
        return new ContentType(mediaType);
    }

    private final MediaType mediaType;

    private ContentType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public MediaType mediaType() {
        return mediaType;
    }

    @Override
    public Header toHeader() {
        return Header.raw("Content-Type", mediaType);
    }

}
