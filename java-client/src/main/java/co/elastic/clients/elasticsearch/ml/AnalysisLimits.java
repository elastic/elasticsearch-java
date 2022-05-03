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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.AnalysisLimits

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.AnalysisLimits">API
 *      specification</a>
 */
@JsonpDeserializable
public class AnalysisLimits implements JsonpSerializable {
	@Nullable
	private final Long categorizationExamplesLimit;

	@Nullable
	private final String modelMemoryLimit;

	// ---------------------------------------------------------------------------------------------

	private AnalysisLimits(Builder builder) {

		this.categorizationExamplesLimit = builder.categorizationExamplesLimit;
		this.modelMemoryLimit = builder.modelMemoryLimit;

	}

	public static AnalysisLimits of(Function<Builder, ObjectBuilder<AnalysisLimits>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The maximum number of examples stored per category in memory and in the
	 * results data store. If you increase this value, more examples are available,
	 * however it requires that you have more storage available. If you set this
	 * value to 0, no examples are stored. NOTE: The
	 * <code>categorization_examples_limit</code> applies only to analysis that uses
	 * categorization.
	 * <p>
	 * API name: {@code categorization_examples_limit}
	 */
	@Nullable
	public final Long categorizationExamplesLimit() {
		return this.categorizationExamplesLimit;
	}

	/**
	 * The approximate maximum amount of memory resources that are required for
	 * analytical processing. Once this limit is approached, data pruning becomes
	 * more aggressive. Upon exceeding this limit, new entities are not modeled. If
	 * the <code>xpack.ml.max_model_memory_limit</code> setting has a value greater
	 * than 0 and less than 1024mb, that value is used instead of the default. The
	 * default value is relatively small to ensure that high resource usage is a
	 * conscious decision. If you have jobs that are expected to analyze high
	 * cardinality fields, you will likely need to use a higher value. If you
	 * specify a number instead of a string, the units are assumed to be MiB.
	 * Specifying a string is recommended for clarity. If you specify a byte size
	 * unit of <code>b</code> or <code>kb</code> and the number does not equate to a
	 * discrete number of megabytes, it is rounded down to the closest MiB. The
	 * minimum valid value is 1 MiB. If you specify a value less than 1 MiB, an
	 * error occurs. If you specify a value for the
	 * <code>xpack.ml.max_model_memory_limit</code> setting, an error occurs when
	 * you try to create jobs that have <code>model_memory_limit</code> values
	 * greater than that setting value.
	 * <p>
	 * API name: {@code model_memory_limit}
	 */
	@Nullable
	public final String modelMemoryLimit() {
		return this.modelMemoryLimit;
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

		if (this.categorizationExamplesLimit != null) {
			generator.writeKey("categorization_examples_limit");
			generator.write(this.categorizationExamplesLimit);

		}
		if (this.modelMemoryLimit != null) {
			generator.writeKey("model_memory_limit");
			generator.write(this.modelMemoryLimit);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalysisLimits}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AnalysisLimits> {
		@Nullable
		private Long categorizationExamplesLimit;

		@Nullable
		private String modelMemoryLimit;

		/**
		 * The maximum number of examples stored per category in memory and in the
		 * results data store. If you increase this value, more examples are available,
		 * however it requires that you have more storage available. If you set this
		 * value to 0, no examples are stored. NOTE: The
		 * <code>categorization_examples_limit</code> applies only to analysis that uses
		 * categorization.
		 * <p>
		 * API name: {@code categorization_examples_limit}
		 */
		public final Builder categorizationExamplesLimit(@Nullable Long value) {
			this.categorizationExamplesLimit = value;
			return this;
		}

		/**
		 * The approximate maximum amount of memory resources that are required for
		 * analytical processing. Once this limit is approached, data pruning becomes
		 * more aggressive. Upon exceeding this limit, new entities are not modeled. If
		 * the <code>xpack.ml.max_model_memory_limit</code> setting has a value greater
		 * than 0 and less than 1024mb, that value is used instead of the default. The
		 * default value is relatively small to ensure that high resource usage is a
		 * conscious decision. If you have jobs that are expected to analyze high
		 * cardinality fields, you will likely need to use a higher value. If you
		 * specify a number instead of a string, the units are assumed to be MiB.
		 * Specifying a string is recommended for clarity. If you specify a byte size
		 * unit of <code>b</code> or <code>kb</code> and the number does not equate to a
		 * discrete number of megabytes, it is rounded down to the closest MiB. The
		 * minimum valid value is 1 MiB. If you specify a value less than 1 MiB, an
		 * error occurs. If you specify a value for the
		 * <code>xpack.ml.max_model_memory_limit</code> setting, an error occurs when
		 * you try to create jobs that have <code>model_memory_limit</code> values
		 * greater than that setting value.
		 * <p>
		 * API name: {@code model_memory_limit}
		 */
		public final Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AnalysisLimits}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalysisLimits build() {
			_checkSingleUse();

			return new AnalysisLimits(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalysisLimits}
	 */
	public static final JsonpDeserializer<AnalysisLimits> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AnalysisLimits::setupAnalysisLimitsDeserializer);

	protected static void setupAnalysisLimitsDeserializer(ObjectDeserializer<AnalysisLimits.Builder> op) {

		op.add(Builder::categorizationExamplesLimit, JsonpDeserializer.longDeserializer(),
				"categorization_examples_limit");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");

	}

}
