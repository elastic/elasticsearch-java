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

import co.elastic.clients.elasticsearch.indices.get_all_sample_configuration.IndexSamplingConfiguration;
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

// typedef: indices.get_all_sample_configuration.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.get_all_sample_configuration.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetAllSampleConfigurationResponse implements JsonpSerializable {
	private final List<IndexSamplingConfiguration> configurations;

	// ---------------------------------------------------------------------------------------------

	private GetAllSampleConfigurationResponse(Builder builder) {

		this.configurations = ApiTypeHelper.unmodifiableRequired(builder.configurations, this, "configurations");

	}

	public static GetAllSampleConfigurationResponse of(
			Function<Builder, ObjectBuilder<GetAllSampleConfigurationResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code configurations}
	 */
	public final List<IndexSamplingConfiguration> configurations() {
		return this.configurations;
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

		if (ApiTypeHelper.isDefined(this.configurations)) {
			generator.writeKey("configurations");
			generator.writeStartArray();
			for (IndexSamplingConfiguration item0 : this.configurations) {
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
	 * Builder for {@link GetAllSampleConfigurationResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetAllSampleConfigurationResponse> {
		private List<IndexSamplingConfiguration> configurations;

		/**
		 * Required - API name: {@code configurations}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>configurations</code>.
		 */
		public final Builder configurations(List<IndexSamplingConfiguration> list) {
			this.configurations = _listAddAll(this.configurations, list);
			return this;
		}

		/**
		 * Required - API name: {@code configurations}
		 * <p>
		 * Adds one or more values to <code>configurations</code>.
		 */
		public final Builder configurations(IndexSamplingConfiguration value, IndexSamplingConfiguration... values) {
			this.configurations = _listAdd(this.configurations, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code configurations}
		 * <p>
		 * Adds a value to <code>configurations</code> using a builder lambda.
		 */
		public final Builder configurations(
				Function<IndexSamplingConfiguration.Builder, ObjectBuilder<IndexSamplingConfiguration>> fn) {
			return configurations(fn.apply(new IndexSamplingConfiguration.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetAllSampleConfigurationResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetAllSampleConfigurationResponse build() {
			_checkSingleUse();

			return new GetAllSampleConfigurationResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetAllSampleConfigurationResponse}
	 */
	public static final JsonpDeserializer<GetAllSampleConfigurationResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetAllSampleConfigurationResponse::setupGetAllSampleConfigurationResponseDeserializer);

	protected static void setupGetAllSampleConfigurationResponseDeserializer(
			ObjectDeserializer<GetAllSampleConfigurationResponse.Builder> op) {

		op.add(Builder::configurations, JsonpDeserializer.arrayDeserializer(IndexSamplingConfiguration._DESERIALIZER),
				"configurations");

	}

}
