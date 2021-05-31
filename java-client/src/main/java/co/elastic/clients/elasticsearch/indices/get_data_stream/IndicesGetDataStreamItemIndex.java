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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices.get_data_stream;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.get_data_stream.IndicesGetDataStreamItemIndex
public final class IndicesGetDataStreamItemIndex implements ToJsonp {
	private final String indexName;

	private final String indexUuid;

	// ---------------------------------------------------------------------------------------------

	protected IndicesGetDataStreamItemIndex(Builder builder) {

		this.indexName = Objects.requireNonNull(builder.indexName, "index_name");
		this.indexUuid = Objects.requireNonNull(builder.indexUuid, "index_uuid");

	}

	/**
	 * API name: {@code index_name}
	 */
	public String indexName() {
		return this.indexName;
	}

	/**
	 * API name: {@code index_uuid}
	 */
	public String indexUuid() {
		return this.indexUuid;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("index_name");
		generator.write(this.indexName);

		generator.writeKey("index_uuid");
		generator.write(this.indexUuid);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesGetDataStreamItemIndex}.
	 */
	public static class Builder implements ObjectBuilder<IndicesGetDataStreamItemIndex> {
		private String indexName;

		private String indexUuid;

		/**
		 * API name: {@code index_name}
		 */
		public Builder indexName(String value) {
			this.indexName = value;
			return this;
		}

		/**
		 * API name: {@code index_uuid}
		 */
		public Builder indexUuid(String value) {
			this.indexUuid = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesGetDataStreamItemIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesGetDataStreamItemIndex build() {

			return new IndicesGetDataStreamItemIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for IndicesGetDataStreamItemIndex
	 */
	public static final JsonpValueParser<IndicesGetDataStreamItemIndex> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, IndicesGetDataStreamItemIndex::setupIndicesGetDataStreamItemIndexParser);

	protected static void setupIndicesGetDataStreamItemIndexParser(
			DelegatingJsonpValueParser<IndicesGetDataStreamItemIndex.Builder> op) {

		op.add(Builder::indexName, JsonpValueParser.stringParser(), "index_name");
		op.add(Builder::indexUuid, JsonpValueParser.stringParser(), "index_uuid");

	}

}
