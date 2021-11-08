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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.SearchTransform
@JsonpDeserializable
public class SearchTransform implements TransformVariant, JsonpSerializable {
	private final SearchInputRequestDefinition request;

	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	private SearchTransform(Builder builder) {

		this.request = ModelTypeHelper.requireNonNull(builder.request, this, "request");
		this.timeout = ModelTypeHelper.requireNonNull(builder.timeout, this, "timeout");

	}

	public static SearchTransform of(Function<Builder, ObjectBuilder<SearchTransform>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Transform} variant type
	 */
	@Override
	public String _variantType() {
		return "search";
	}

	/**
	 * Required - API name: {@code request}
	 */
	public final SearchInputRequestDefinition request() {
		return this.request;
	}

	/**
	 * Required - API name: {@code timeout}
	 */
	public final String timeout() {
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

		generator.writeKey("request");
		this.request.serialize(generator, mapper);

		generator.writeKey("timeout");
		generator.write(this.timeout);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchTransform}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SearchTransform> {
		private SearchInputRequestDefinition request;

		private String timeout;

		/**
		 * Required - API name: {@code request}
		 */
		public final Builder request(SearchInputRequestDefinition value) {
			this.request = value;
			return this;
		}

		/**
		 * Required - API name: {@code request}
		 */
		public final Builder request(
				Function<SearchInputRequestDefinition.Builder, ObjectBuilder<SearchInputRequestDefinition>> fn) {
			return this.request(fn.apply(new SearchInputRequestDefinition.Builder()).build());
		}

		/**
		 * Required - API name: {@code timeout}
		 */
		public final Builder timeout(String value) {
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
			_checkSingleUse();

			return new SearchTransform(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchTransform}
	 */
	public static final JsonpDeserializer<SearchTransform> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchTransform::setupSearchTransformDeserializer, Builder::build);

	protected static void setupSearchTransformDeserializer(DelegatingDeserializer<SearchTransform.Builder> op) {

		op.add(Builder::request, SearchInputRequestDefinition._DESERIALIZER, "request");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");

	}

}
