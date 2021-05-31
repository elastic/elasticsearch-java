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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlInferenceIngestProcessorCount
public final class MlInferenceIngestProcessorCount implements ToJsonp {
	private final Number max;

	private final Number sum;

	private final Number min;

	// ---------------------------------------------------------------------------------------------

	protected MlInferenceIngestProcessorCount(Builder builder) {

		this.max = Objects.requireNonNull(builder.max, "max");
		this.sum = Objects.requireNonNull(builder.sum, "sum");
		this.min = Objects.requireNonNull(builder.min, "min");

	}

	/**
	 * API name: {@code max}
	 */
	public Number max() {
		return this.max;
	}

	/**
	 * API name: {@code sum}
	 */
	public Number sum() {
		return this.sum;
	}

	/**
	 * API name: {@code min}
	 */
	public Number min() {
		return this.min;
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

		generator.writeKey("max");
		generator.write(this.max.doubleValue());

		generator.writeKey("sum");
		generator.write(this.sum.doubleValue());

		generator.writeKey("min");
		generator.write(this.min.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceIngestProcessorCount}.
	 */
	public static class Builder implements ObjectBuilder<MlInferenceIngestProcessorCount> {
		private Number max;

		private Number sum;

		private Number min;

		/**
		 * API name: {@code max}
		 */
		public Builder max(Number value) {
			this.max = value;
			return this;
		}

		/**
		 * API name: {@code sum}
		 */
		public Builder sum(Number value) {
			this.sum = value;
			return this;
		}

		/**
		 * API name: {@code min}
		 */
		public Builder min(Number value) {
			this.min = value;
			return this;
		}

		/**
		 * Builds a {@link MlInferenceIngestProcessorCount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInferenceIngestProcessorCount build() {

			return new MlInferenceIngestProcessorCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for MlInferenceIngestProcessorCount
	 */
	public static final JsonpValueParser<MlInferenceIngestProcessorCount> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, MlInferenceIngestProcessorCount::setupMlInferenceIngestProcessorCountParser);

	protected static void setupMlInferenceIngestProcessorCountParser(
			DelegatingJsonpValueParser<MlInferenceIngestProcessorCount.Builder> op) {

		op.add(Builder::max, JsonpValueParser.numberParser(), "max");
		op.add(Builder::sum, JsonpValueParser.numberParser(), "sum");
		op.add(Builder::min, JsonpValueParser.numberParser(), "min");

	}

}
