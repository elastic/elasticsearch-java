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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: watcher._types.HttpInput

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.HttpInput">API
 *      specification</a>
 */
@JsonpDeserializable
public class HttpInput implements InputVariant, JsonpSerializable {
	private final List<String> extract;

	@Nullable
	private final HttpInputRequestDefinition request;

	@Nullable
	private final ResponseContentType responseContentType;

	// ---------------------------------------------------------------------------------------------

	private HttpInput(Builder builder) {

		this.extract = ApiTypeHelper.unmodifiable(builder.extract);
		this.request = builder.request;
		this.responseContentType = builder.responseContentType;

	}

	public static HttpInput of(Function<Builder, ObjectBuilder<HttpInput>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Input variant kind.
	 */
	@Override
	public Input.Kind _inputKind() {
		return Input.Kind.Http;
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

		if (ApiTypeHelper.isDefined(this.extract)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpInput}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<HttpInput> {
		@Nullable
		private List<String> extract;

		@Nullable
		private HttpInputRequestDefinition request;

		@Nullable
		private ResponseContentType responseContentType;

		/**
		 * API name: {@code extract}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>extract</code>.
		 */
		public final Builder extract(List<String> list) {
			this.extract = _listAddAll(this.extract, list);
			return this;
		}

		/**
		 * API name: {@code extract}
		 * <p>
		 * Adds one or more values to <code>extract</code>.
		 */
		public final Builder extract(String value, String... values) {
			this.extract = _listAdd(this.extract, value, values);
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

		@Override
		protected Builder self() {
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
			HttpInput::setupHttpInputDeserializer);

	protected static void setupHttpInputDeserializer(ObjectDeserializer<HttpInput.Builder> op) {

		op.add(Builder::extract, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"extract");
		op.add(Builder::request, HttpInputRequestDefinition._DESERIALIZER, "request");
		op.add(Builder::responseContentType, ResponseContentType._DESERIALIZER, "response_content_type");

	}

}
