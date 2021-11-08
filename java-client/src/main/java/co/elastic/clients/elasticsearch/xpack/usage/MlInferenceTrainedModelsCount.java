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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.MlInferenceTrainedModelsCount
@JsonpDeserializable
public class MlInferenceTrainedModelsCount implements JsonpSerializable {
	private final long total;

	private final long prepackaged;

	private final long other;

	private final long regression;

	private final long classification;

	// ---------------------------------------------------------------------------------------------

	private MlInferenceTrainedModelsCount(Builder builder) {

		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.prepackaged = ModelTypeHelper.requireNonNull(builder.prepackaged, this, "prepackaged");
		this.other = ModelTypeHelper.requireNonNull(builder.other, this, "other");
		this.regression = ModelTypeHelper.requireNonNull(builder.regression, this, "regression");
		this.classification = ModelTypeHelper.requireNonNull(builder.classification, this, "classification");

	}

	public static MlInferenceTrainedModelsCount of(Function<Builder, ObjectBuilder<MlInferenceTrainedModelsCount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code prepackaged}
	 */
	public final long prepackaged() {
		return this.prepackaged;
	}

	/**
	 * Required - API name: {@code other}
	 */
	public final long other() {
		return this.other;
	}

	/**
	 * Required - API name: {@code regression}
	 */
	public final long regression() {
		return this.regression;
	}

	/**
	 * Required - API name: {@code classification}
	 */
	public final long classification() {
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
		generator.write(this.total);

		generator.writeKey("prepackaged");
		generator.write(this.prepackaged);

		generator.writeKey("other");
		generator.write(this.other);

		generator.writeKey("regression");
		generator.write(this.regression);

		generator.writeKey("classification");
		generator.write(this.classification);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceTrainedModelsCount}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MlInferenceTrainedModelsCount> {
		private Long total;

		private Long prepackaged;

		private Long other;

		private Long regression;

		private Long classification;

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(long value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code prepackaged}
		 */
		public final Builder prepackaged(long value) {
			this.prepackaged = value;
			return this;
		}

		/**
		 * Required - API name: {@code other}
		 */
		public final Builder other(long value) {
			this.other = value;
			return this;
		}

		/**
		 * Required - API name: {@code regression}
		 */
		public final Builder regression(long value) {
			this.regression = value;
			return this;
		}

		/**
		 * Required - API name: {@code classification}
		 */
		public final Builder classification(long value) {
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
			_checkSingleUse();

			return new MlInferenceTrainedModelsCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInferenceTrainedModelsCount}
	 */
	public static final JsonpDeserializer<MlInferenceTrainedModelsCount> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, MlInferenceTrainedModelsCount::setupMlInferenceTrainedModelsCountDeserializer,
			Builder::build);

	protected static void setupMlInferenceTrainedModelsCountDeserializer(
			DelegatingDeserializer<MlInferenceTrainedModelsCount.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::prepackaged, JsonpDeserializer.longDeserializer(), "prepackaged");
		op.add(Builder::other, JsonpDeserializer.longDeserializer(), "other");
		op.add(Builder::regression, JsonpDeserializer.longDeserializer(), "regression");
		op.add(Builder::classification, JsonpDeserializer.longDeserializer(), "classification");

	}

}
