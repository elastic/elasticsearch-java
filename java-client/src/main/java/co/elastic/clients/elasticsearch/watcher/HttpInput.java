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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.HttpInput
@JsonpDeserializable
public class HttpInput implements InputVariant, JsonpSerializable {
	@Nullable
	private final HttpInput http;

	private final List<String> extract;

	@Nullable
	private final HttpInputRequestDefinition request;

	@Nullable
	private final ResponseContentType responseContentType;

	// ---------------------------------------------------------------------------------------------

	private HttpInput(Builder builder) {

		this.http = builder.http;
		this.extract = ModelTypeHelper.unmodifiable(builder.extract);
		this.request = builder.request;
		this.responseContentType = builder.responseContentType;

	}

	public static HttpInput of(Function<Builder, ObjectBuilder<HttpInput>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Input} variant type
	 */
	@Override
	public String _variantType() {
		return "http";
	}

	/**
	 * API name: {@code http}
	 */
	@Nullable
	public final HttpInput http() {
		return this.http;
	}

	/**
	 * API name: {@code extract}
	 */
	public final List<String> extract() {
		return this.extract;
	}

	/**
	 * API name: {@code request}
	 */
	@Nullable
	public final HttpInputRequestDefinition request() {
		return this.request;
	}

	/**
	 * API name: {@code response_content_type}
	 */
	@Nullable
	public final ResponseContentType responseContentType() {
		return this.responseContentType;
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

		if (this.http != null) {
			generator.writeKey("http");
			this.http.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.extract)) {
			generator.writeKey("extract");
			generator.writeStartArray();
			for (String item0 : this.extract) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.request != null) {
			generator.writeKey("request");
			this.request.serialize(generator, mapper);

		}
		if (this.responseContentType != null) {
			generator.writeKey("response_content_type");
			this.responseContentType.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpInput}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HttpInput> {
		@Nullable
		private HttpInput http;

		@Nullable
		private List<String> extract;

		@Nullable
		private HttpInputRequestDefinition request;

		@Nullable
		private ResponseContentType responseContentType;

		/**
		 * API name: {@code http}
		 */
		public final Builder http(@Nullable HttpInput value) {
			this.http = value;
			return this;
		}

		/**
		 * API name: {@code http}
		 */
		public final Builder http(Function<HttpInput.Builder, ObjectBuilder<HttpInput>> fn) {
			return this.http(fn.apply(new HttpInput.Builder()).build());
		}

		/**
		 * API name: {@code extract}
		 */
		public final Builder extract(@Nullable List<String> value) {
			this.extract = value;
			return this;
		}

		/**
		 * API name: {@code extract}
		 */
		public final Builder extract(String... value) {
			this.extract = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public final Builder request(@Nullable HttpInputRequestDefinition value) {
			this.request = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public final Builder request(
				Function<HttpInputRequestDefinition.Builder, ObjectBuilder<HttpInputRequestDefinition>> fn) {
			return this.request(fn.apply(new HttpInputRequestDefinition.Builder()).build());
		}

		/**
		 * API name: {@code response_content_type}
		 */
		public final Builder responseContentType(@Nullable ResponseContentType value) {
			this.responseContentType = value;
			return this;
		}

		/**
		 * Builds a {@link HttpInput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpInput build() {
			_checkSingleUse();

			return new HttpInput(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpInput}
	 */
	public static final JsonpDeserializer<HttpInput> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HttpInput::setupHttpInputDeserializer, Builder::build);

	protected static void setupHttpInputDeserializer(DelegatingDeserializer<HttpInput.Builder> op) {

		op.add(Builder::http, HttpInput._DESERIALIZER, "http");
		op.add(Builder::extract, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"extract");
		op.add(Builder::request, HttpInputRequestDefinition._DESERIALIZER, "request");
		op.add(Builder::responseContentType, ResponseContentType._DESERIALIZER, "response_content_type");

	}

}
