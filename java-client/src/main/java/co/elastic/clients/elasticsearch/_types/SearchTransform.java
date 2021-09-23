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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.elasticsearch.watcher.SearchInputRequestDefinition;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.SearchTransform
public final class SearchTransform implements Transform, JsonpSerializable {
	private final SearchInputRequestDefinition request;

	private final JsonValue timeout;

	// ---------------------------------------------------------------------------------------------

	public SearchTransform(Builder builder) {

		this.request = Objects.requireNonNull(builder.request, "request");
		this.timeout = Objects.requireNonNull(builder.timeout, "timeout");

	}

	/**
	 * {@link Transform} variant type
	 */
	@Override
	public String _type() {
		return "search";
	}

	/**
	 * API name: {@code request}
	 */
	public SearchInputRequestDefinition request() {
		return this.request;
	}

	/**
	 * API name: {@code timeout}
	 */
	public JsonValue timeout() {
		return this.timeout;
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
		generator.writeStartObject(_type());

		generator.writeKey("request");
		this.request.serialize(generator, mapper);

		generator.writeKey("timeout");
		generator.write(this.timeout);

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchTransform}.
	 */
	public static class Builder implements ObjectBuilder<SearchTransform> {
		private SearchInputRequestDefinition request;

		private JsonValue timeout;

		/**
		 * API name: {@code request}
		 */
		public Builder request(SearchInputRequestDefinition value) {
			this.request = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public Builder request(
				Function<SearchInputRequestDefinition.Builder, ObjectBuilder<SearchInputRequestDefinition>> fn) {
			return this.request(fn.apply(new SearchInputRequestDefinition.Builder()).build());
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link SearchTransform}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchTransform build() {

			return new SearchTransform(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<SearchTransform.Builder, SearchTransform.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(SearchTransform::setupSearchTransformDeserializer);

	protected static void setupSearchTransformDeserializer(DelegatingDeserializer<SearchTransform.Builder> op) {

		op.add(Builder::request, SearchInputRequestDefinition.DESERIALIZER, "request");
		op.add(Builder::timeout, JsonpDeserializer.jsonValueDeserializer(), "timeout");

	}

}
