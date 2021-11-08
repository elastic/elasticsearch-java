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

// typedef: xpack.usage.MlInferenceIngestProcessorCount
@JsonpDeserializable
public class MlInferenceIngestProcessorCount implements JsonpSerializable {
	private final long max;

	private final long sum;

	private final long min;

	// ---------------------------------------------------------------------------------------------

	private MlInferenceIngestProcessorCount(Builder builder) {

		this.max = ModelTypeHelper.requireNonNull(builder.max, this, "max");
		this.sum = ModelTypeHelper.requireNonNull(builder.sum, this, "sum");
		this.min = ModelTypeHelper.requireNonNull(builder.min, this, "min");

	}

	public static MlInferenceIngestProcessorCount of(
			Function<Builder, ObjectBuilder<MlInferenceIngestProcessorCount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code max}
	 */
	public final long max() {
		return this.max;
	}

	/**
	 * Required - API name: {@code sum}
	 */
	public final long sum() {
		return this.sum;
	}

	/**
	 * Required - API name: {@code min}
	 */
	public final long min() {
		return this.min;
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

		generator.writeKey("max");
		generator.write(this.max);

		generator.writeKey("sum");
		generator.write(this.sum);

		generator.writeKey("min");
		generator.write(this.min);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceIngestProcessorCount}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MlInferenceIngestProcessorCount> {
		private Long max;

		private Long sum;

		private Long min;

		/**
		 * Required - API name: {@code max}
		 */
		public final Builder max(long value) {
			this.max = value;
			return this;
		}

		/**
		 * Required - API name: {@code sum}
		 */
		public final Builder sum(long value) {
			this.sum = value;
			return this;
		}

		/**
		 * Required - API name: {@code min}
		 */
		public final Builder min(long value) {
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
			_checkSingleUse();

			return new MlInferenceIngestProcessorCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInferenceIngestProcessorCount}
	 */
	public static final JsonpDeserializer<MlInferenceIngestProcessorCount> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlInferenceIngestProcessorCount::setupMlInferenceIngestProcessorCountDeserializer,
					Builder::build);

	protected static void setupMlInferenceIngestProcessorCountDeserializer(
			DelegatingDeserializer<MlInferenceIngestProcessorCount.Builder> op) {

		op.add(Builder::max, JsonpDeserializer.longDeserializer(), "max");
		op.add(Builder::sum, JsonpDeserializer.longDeserializer(), "sum");
		op.add(Builder::min, JsonpDeserializer.longDeserializer(), "min");

	}

}
