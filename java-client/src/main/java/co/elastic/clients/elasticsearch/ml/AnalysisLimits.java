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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.AnalysisLimits
public final class AnalysisLimits implements ToJsonp {
	@Nullable
	private final Number categorizationExamplesLimit;

	private final String modelMemoryLimit;

	// ---------------------------------------------------------------------------------------------

	protected AnalysisLimits(Builder builder) {

		this.categorizationExamplesLimit = builder.categorizationExamplesLimit;
		this.modelMemoryLimit = Objects.requireNonNull(builder.modelMemoryLimit, "model_memory_limit");

	}

	/**
	 * API name: {@code categorization_examples_limit}
	 */
	@Nullable
	public Number categorizationExamplesLimit() {
		return this.categorizationExamplesLimit;
	}

	/**
	 * API name: {@code model_memory_limit}
	 */
	public String modelMemoryLimit() {
		return this.modelMemoryLimit;
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

		if (this.categorizationExamplesLimit != null) {

			generator.writeKey("categorization_examples_limit");
			generator.write(this.categorizationExamplesLimit.doubleValue());

		}

		generator.writeKey("model_memory_limit");
		generator.write(this.modelMemoryLimit);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalysisLimits}.
	 */
	public static class Builder implements ObjectBuilder<AnalysisLimits> {
		@Nullable
		private Number categorizationExamplesLimit;

		private String modelMemoryLimit;

		/**
		 * API name: {@code categorization_examples_limit}
		 */
		public Builder categorizationExamplesLimit(@Nullable Number value) {
			this.categorizationExamplesLimit = value;
			return this;
		}

		/**
		 * API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * Builds a {@link AnalysisLimits}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalysisLimits build() {

			return new AnalysisLimits(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AnalysisLimits
	 */
	public static final JsonpDeserializer<AnalysisLimits> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AnalysisLimits::setupAnalysisLimitsDeserializer);

	protected static void setupAnalysisLimitsDeserializer(DelegatingDeserializer<AnalysisLimits.Builder> op) {

		op.add(Builder::categorizationExamplesLimit, JsonpDeserializer.numberDeserializer(),
				"categorization_examples_limit");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");

	}

}
