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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.IndexResult
public final class IndexResult implements JsonpSerializable {
	private final IndexResultSummary response;

	// ---------------------------------------------------------------------------------------------

	public IndexResult(Builder builder) {

		this.response = Objects.requireNonNull(builder.response, "response");

	}

	/**
	 * API name: {@code response}
	 */
	public IndexResultSummary response() {
		return this.response;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("response");
		this.response.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexResult}.
	 */
	public static class Builder implements ObjectBuilder<IndexResult> {
		private IndexResultSummary response;

		/**
		 * API name: {@code response}
		 */
		public Builder response(IndexResultSummary value) {
			this.response = value;
			return this;
		}

		/**
		 * API name: {@code response}
		 */
		public Builder response(Function<IndexResultSummary.Builder, ObjectBuilder<IndexResultSummary>> fn) {
			return this.response(fn.apply(new IndexResultSummary.Builder()).build());
		}

		/**
		 * Builds a {@link IndexResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexResult build() {

			return new IndexResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexResult}
	 */
	public static final JsonpDeserializer<IndexResult> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexResult::setupIndexResultDeserializer);

	protected static void setupIndexResultDeserializer(DelegatingDeserializer<IndexResult.Builder> op) {

		op.add(Builder::response, IndexResultSummary.DESERIALIZER, "response");

	}

}
