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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
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

// typedef: watcher._types.HttpInputResponseResult

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.HttpInputResponseResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class HttpInputResponseResult implements JsonpSerializable {
	private final String body;

	private final Map<String, List<String>> headers;

	private final int status;

	// ---------------------------------------------------------------------------------------------

	private HttpInputResponseResult(Builder builder) {

		this.body = ApiTypeHelper.requireNonNull(builder.body, this, "body");
		this.headers = ApiTypeHelper.unmodifiableRequired(builder.headers, this, "headers");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static HttpInputResponseResult of(Function<Builder, ObjectBuilder<HttpInputResponseResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code body}
	 */
	public final String body() {
		return this.body;
	}

	/**
	 * Required - API name: {@code headers}
	 */
	public final Map<String, List<String>> headers() {
		return this.headers;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final int status() {
		return this.status;
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

		generator.writeKey("body");
		generator.write(this.body);

		if (ApiTypeHelper.isDefined(this.headers)) {
			generator.writeKey("headers");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.headers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("status");
		generator.write(this.status);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpInputResponseResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<HttpInputResponseResult> {
		private String body;

		private Map<String, List<String>> headers;

		private Integer status;

		/**
		 * Required - API name: {@code body}
		 */
		public final Builder body(String value) {
			this.body = value;
			return this;
		}

		/**
		 * Required - API name: {@code headers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>headers</code>.
		 */
		public final Builder headers(Map<String, List<String>> map) {
			this.headers = _mapPutAll(this.headers, map);
			return this;
		}

		/**
		 * Required - API name: {@code headers}
		 * <p>
		 * Adds an entry to <code>headers</code>.
		 */
		public final Builder headers(String key, List<String> value) {
			this.headers = _mapPut(this.headers, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(int value) {
			this.status = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HttpInputResponseResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpInputResponseResult build() {
			_checkSingleUse();

			return new HttpInputResponseResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpInputResponseResult}
	 */
	public static final JsonpDeserializer<HttpInputResponseResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HttpInputResponseResult::setupHttpInputResponseResultDeserializer);

	protected static void setupHttpInputResponseResultDeserializer(
			ObjectDeserializer<HttpInputResponseResult.Builder> op) {

		op.add(Builder::body, JsonpDeserializer.stringDeserializer(), "body");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "headers");
		op.add(Builder::status, JsonpDeserializer.integerDeserializer(), "status");

	}

}
