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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.DiversifiedSamplerAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.DiversifiedSamplerAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class DiversifiedSamplerAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final SamplerAggregationExecutionHint executionHint;

	@Nullable
	private final Integer maxDocsPerValue;

	@Nullable
	private final Script script;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final String field;

	// ---------------------------------------------------------------------------------------------

	private DiversifiedSamplerAggregation(Builder builder) {
		super(builder);

		this.executionHint = builder.executionHint;
		this.maxDocsPerValue = builder.maxDocsPerValue;
		this.script = builder.script;
		this.shardSize = builder.shardSize;
		this.field = builder.field;

	}

	public static DiversifiedSamplerAggregation of(Function<Builder, ObjectBuilder<DiversifiedSamplerAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.DiversifiedSampler;
	}

	/**
	 * The type of value used for de-duplication.
	 * <p>
	 * API name: {@code execution_hint}
	 */
	@Nullable
	public final SamplerAggregationExecutionHint executionHint() {
		return this.executionHint;
	}

	/**
	 * Limits how many documents are permitted per choice of de-duplicating value.
	 * <p>
	 * API name: {@code max_docs_per_value}
	 */
	@Nullable
	public final Integer maxDocsPerValue() {
		return this.maxDocsPerValue;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * Limits how many top-scoring documents are collected in the sample processed
	 * on each shard.
	 * <p>
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	/**
	 * The field used to provide values used for de-duplication.
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.executionHint != null) {
			generator.writeKey("execution_hint");
			this.executionHint.serialize(generator, mapper);
		}
		if (this.maxDocsPerValue != null) {
			generator.writeKey("max_docs_per_value");
			generator.write(this.maxDocsPerValue);

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DiversifiedSamplerAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DiversifiedSamplerAggregation> {
		@Nullable
		private SamplerAggregationExecutionHint executionHint;

		@Nullable
		private Integer maxDocsPerValue;

		@Nullable
		private Script script;

		@Nullable
		private Integer shardSize;

		@Nullable
		private String field;

		/**
		 * The type of value used for de-duplication.
		 * <p>
		 * API name: {@code execution_hint}
		 */
		public final Builder executionHint(@Nullable SamplerAggregationExecutionHint value) {
			this.executionHint = value;
			return this;
		}

		/**
		 * Limits how many documents are permitted per choice of de-duplicating value.
		 * <p>
		 * API name: {@code max_docs_per_value}
		 */
		public final Builder maxDocsPerValue(@Nullable Integer value) {
			this.maxDocsPerValue = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * Limits how many top-scoring documents are collected in the sample processed
		 * on each shard.
		 * <p>
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * The field used to provide values used for de-duplication.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DiversifiedSamplerAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DiversifiedSamplerAggregation build() {
			_checkSingleUse();

			return new DiversifiedSamplerAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DiversifiedSamplerAggregation}
	 */
	public static final JsonpDeserializer<DiversifiedSamplerAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DiversifiedSamplerAggregation::setupDiversifiedSamplerAggregationDeserializer);

	protected static void setupDiversifiedSamplerAggregationDeserializer(
			ObjectDeserializer<DiversifiedSamplerAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::executionHint, SamplerAggregationExecutionHint._DESERIALIZER, "execution_hint");
		op.add(Builder::maxDocsPerValue, JsonpDeserializer.integerDeserializer(), "max_docs_per_value");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");

	}

}
