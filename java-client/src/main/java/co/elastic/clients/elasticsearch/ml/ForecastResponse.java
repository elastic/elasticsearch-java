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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.forecast.Response
public final class ForecastResponse extends AcknowledgedResponseBase {
	private final String forecastId;

	// ---------------------------------------------------------------------------------------------

	protected ForecastResponse(Builder builder) {
		super(builder);
		this.forecastId = Objects.requireNonNull(builder.forecastId, "forecast_id");

	}

	/**
	 * API name: {@code forecast_id}
	 */
	public String forecastId() {
		return this.forecastId;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

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
		 * API name: {@code forecast_id}
		 */
		public Builder forecastId(String value) {
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

			return new ForecastResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ForecastResponse
	 */
	public static final JsonpDeserializer<ForecastResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ForecastResponse::setupForecastResponseDeserializer);

	protected static void setupForecastResponseDeserializer(DelegatingDeserializer<ForecastResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::forecastId, JsonpDeserializer.stringDeserializer(), "forecast_id");

	}

}
