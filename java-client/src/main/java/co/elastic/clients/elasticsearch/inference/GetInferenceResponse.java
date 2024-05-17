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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference.get.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#inference.get.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetInferenceResponse implements JsonpSerializable {
	private final List<InferenceEndpointInfo> endpoints;

	// ---------------------------------------------------------------------------------------------

	private GetInferenceResponse(Builder builder) {

		this.endpoints = ApiTypeHelper.unmodifiableRequired(builder.endpoints, this, "endpoints");

	}

	public static GetInferenceResponse of(Function<Builder, ObjectBuilder<GetInferenceResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code endpoints}
	 */
	public final List<InferenceEndpointInfo> endpoints() {
		return this.endpoints;
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

		if (ApiTypeHelper.isDefined(this.endpoints)) {
			generator.writeKey("endpoints");
			generator.writeStartArray();
			for (InferenceEndpointInfo item0 : this.endpoints) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetInferenceResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetInferenceResponse> {
		private List<InferenceEndpointInfo> endpoints;

		/**
		 * Required - API name: {@code endpoints}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>endpoints</code>.
		 */
		public final Builder endpoints(List<InferenceEndpointInfo> list) {
			this.endpoints = _listAddAll(this.endpoints, list);
			return this;
		}

		/**
		 * Required - API name: {@code endpoints}
		 * <p>
		 * Adds one or more values to <code>endpoints</code>.
		 */
		public final Builder endpoints(InferenceEndpointInfo value, InferenceEndpointInfo... values) {
			this.endpoints = _listAdd(this.endpoints, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code endpoints}
		 * <p>
		 * Adds a value to <code>endpoints</code> using a builder lambda.
		 */
		public final Builder endpoints(
				Function<InferenceEndpointInfo.Builder, ObjectBuilder<InferenceEndpointInfo>> fn) {
			return endpoints(fn.apply(new InferenceEndpointInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetInferenceResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetInferenceResponse build() {
			_checkSingleUse();

			return new GetInferenceResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetInferenceResponse}
	 */
	public static final JsonpDeserializer<GetInferenceResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetInferenceResponse::setupGetInferenceResponseDeserializer);

	protected static void setupGetInferenceResponseDeserializer(ObjectDeserializer<GetInferenceResponse.Builder> op) {

		op.add(Builder::endpoints, JsonpDeserializer.arrayDeserializer(InferenceEndpointInfo._DESERIALIZER),
				"endpoints");

	}

}
