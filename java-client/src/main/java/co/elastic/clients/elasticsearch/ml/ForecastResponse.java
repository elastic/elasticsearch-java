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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: ml.forecast.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.forecast.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ForecastResponse extends AcknowledgedResponseBase {
	private final String forecastId;

	// ---------------------------------------------------------------------------------------------

	private ForecastResponse(Builder builder) {
		super(builder);

		this.forecastId = ApiTypeHelper.requireNonNull(builder.forecastId, this, "forecastId");

	}

	public static ForecastResponse of(Function<Builder, ObjectBuilder<ForecastResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code forecast_id}
	 */
	public final String forecastId() {
		return this.forecastId;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("forecast_id");
		generator.write(this.forecastId);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ForecastResponse}.
	 */

	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ForecastResponse> {
		private String forecastId;

		/**
		 * Required - API name: {@code forecast_id}
		 */
		public final Builder forecastId(String value) {
			this.forecastId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ForecastResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForecastResponse build() {
			_checkSingleUse();

			return new ForecastResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ForecastResponse}
	 */
	public static final JsonpDeserializer<ForecastResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ForecastResponse::setupForecastResponseDeserializer);

	protected static void setupForecastResponseDeserializer(ObjectDeserializer<ForecastResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::forecastId, JsonpDeserializer.stringDeserializer(), "forecast_id");

	}

}
