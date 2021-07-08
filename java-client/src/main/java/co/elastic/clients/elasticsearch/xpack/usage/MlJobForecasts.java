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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlJobForecasts
public final class MlJobForecasts implements ToJsonp {
	private final Number total;

	private final Number forecastedJobs;

	// ---------------------------------------------------------------------------------------------

	protected MlJobForecasts(Builder builder) {

		this.total = Objects.requireNonNull(builder.total, "total");
		this.forecastedJobs = Objects.requireNonNull(builder.forecastedJobs, "forecasted_jobs");

	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code forecasted_jobs}
	 */
	public Number forecastedJobs() {
		return this.forecastedJobs;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		generator.writeKey("forecasted_jobs");
		generator.write(this.forecastedJobs.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlJobForecasts}.
	 */
	public static class Builder implements ObjectBuilder<MlJobForecasts> {
		private Number total;

		private Number forecastedJobs;

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code forecasted_jobs}
		 */
		public Builder forecastedJobs(Number value) {
			this.forecastedJobs = value;
			return this;
		}

		/**
		 * Builds a {@link MlJobForecasts}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlJobForecasts build() {

			return new MlJobForecasts(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MlJobForecasts
	 */
	public static final JsonpDeserializer<MlJobForecasts> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MlJobForecasts::setupMlJobForecastsDeserializer);

	protected static void setupMlJobForecastsDeserializer(DelegatingDeserializer<MlJobForecasts.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::forecastedJobs, JsonpDeserializer.numberDeserializer(), "forecasted_jobs");

	}

}
