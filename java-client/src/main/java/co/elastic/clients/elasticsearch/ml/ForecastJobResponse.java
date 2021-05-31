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
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.forecast_job.Response
public final class ForecastJobResponse extends AcknowledgedResponseBase {
	private final String forecastId;

	// ---------------------------------------------------------------------------------------------

	protected ForecastJobResponse(Builder builder) {
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
	 * Builder for {@link ForecastJobResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ForecastJobResponse> {
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
		 * Builds a {@link ForecastJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForecastJobResponse build() {

			return new ForecastJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ForecastJobResponse
	 */
	public static final JsonpValueParser<ForecastJobResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ForecastJobResponse::setupForecastJobResponseParser);

	protected static void setupForecastJobResponseParser(DelegatingJsonpValueParser<ForecastJobResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseParser(op);
		op.add(Builder::forecastId, JsonpValueParser.stringParser(), "forecast_id");

	}

}
