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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlInferenceTrainedModelsCount
public final class MlInferenceTrainedModelsCount implements JsonpSerializable {
	private final Number total;

	private final Number prepackaged;

	private final Number other;

	private final Number regression;

	private final Number classification;

	// ---------------------------------------------------------------------------------------------

	public MlInferenceTrainedModelsCount(Builder builder) {

		this.total = Objects.requireNonNull(builder.total, "total");
		this.prepackaged = Objects.requireNonNull(builder.prepackaged, "prepackaged");
		this.other = Objects.requireNonNull(builder.other, "other");
		this.regression = Objects.requireNonNull(builder.regression, "regression");
		this.classification = Objects.requireNonNull(builder.classification, "classification");

	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code prepackaged}
	 */
	public Number prepackaged() {
		return this.prepackaged;
	}

	/**
	 * API name: {@code other}
	 */
	public Number other() {
		return this.other;
	}

	/**
	 * API name: {@code regression}
	 */
	public Number regression() {
		return this.regression;
	}

	/**
	 * API name: {@code classification}
	 */
	public Number classification() {
		return this.classification;
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

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		generator.writeKey("prepackaged");
		generator.write(this.prepackaged.doubleValue());

		generator.writeKey("other");
		generator.write(this.other.doubleValue());

		generator.writeKey("regression");
		generator.write(this.regression.doubleValue());

		generator.writeKey("classification");
		generator.write(this.classification.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceTrainedModelsCount}.
	 */
	public static class Builder implements ObjectBuilder<MlInferenceTrainedModelsCount> {
		private Number total;

		private Number prepackaged;

		private Number other;

		private Number regression;

		private Number classification;

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code prepackaged}
		 */
		public Builder prepackaged(Number value) {
			this.prepackaged = value;
			return this;
		}

		/**
		 * API name: {@code other}
		 */
		public Builder other(Number value) {
			this.other = value;
			return this;
		}

		/**
		 * API name: {@code regression}
		 */
		public Builder regression(Number value) {
			this.regression = value;
			return this;
		}

		/**
		 * API name: {@code classification}
		 */
		public Builder classification(Number value) {
			this.classification = value;
			return this;
		}

		/**
		 * Builds a {@link MlInferenceTrainedModelsCount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInferenceTrainedModelsCount build() {

			return new MlInferenceTrainedModelsCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInferenceTrainedModelsCount}
	 */
	public static final JsonpDeserializer<MlInferenceTrainedModelsCount> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					MlInferenceTrainedModelsCount::setupMlInferenceTrainedModelsCountDeserializer);

	protected static void setupMlInferenceTrainedModelsCountDeserializer(
			DelegatingDeserializer<MlInferenceTrainedModelsCount.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::prepackaged, JsonpDeserializer.numberDeserializer(), "prepackaged");
		op.add(Builder::other, JsonpDeserializer.numberDeserializer(), "other");
		op.add(Builder::regression, JsonpDeserializer.numberDeserializer(), "regression");
		op.add(Builder::classification, JsonpDeserializer.numberDeserializer(), "classification");

	}

}
