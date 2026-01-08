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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices.get_sample_configuration.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.get_sample_configuration.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetSampleConfigurationResponse implements JsonpSerializable {
	private final String index;

	private final SamplingConfiguration configuration;

	// ---------------------------------------------------------------------------------------------

	private GetSampleConfigurationResponse(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.configuration = ApiTypeHelper.requireNonNull(builder.configuration, this, "configuration");

	}

	public static GetSampleConfigurationResponse of(
			Function<Builder, ObjectBuilder<GetSampleConfigurationResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code configuration}
	 */
	public final SamplingConfiguration configuration() {
		return this.configuration;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("configuration");
		this.configuration.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSampleConfigurationResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetSampleConfigurationResponse> {
		private String index;

		private SamplingConfiguration configuration;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code configuration}
		 */
		public final Builder configuration(SamplingConfiguration value) {
			this.configuration = value;
			return this;
		}

		/**
		 * Required - API name: {@code configuration}
		 */
		public final Builder configuration(
				Function<SamplingConfiguration.Builder, ObjectBuilder<SamplingConfiguration>> fn) {
			return this.configuration(fn.apply(new SamplingConfiguration.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSampleConfigurationResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSampleConfigurationResponse build() {
			_checkSingleUse();

			return new GetSampleConfigurationResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetSampleConfigurationResponse}
	 */
	public static final JsonpDeserializer<GetSampleConfigurationResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetSampleConfigurationResponse::setupGetSampleConfigurationResponseDeserializer);

	protected static void setupGetSampleConfigurationResponseDeserializer(
			ObjectDeserializer<GetSampleConfigurationResponse.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::configuration, SamplingConfiguration._DESERIALIZER, "configuration");

	}

}
