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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: _types.aggregations.DiversifiedSamplerAggregation
public final class DiversifiedSamplerAggregation extends BucketAggregationBase {
	@Nullable
	private final JsonValue executionHint;

	@Nullable
	private final Number maxDocsPerValue;

	@Nullable
	private final JsonValue script;

	@Nullable
	private final Number shardSize;

	@Nullable
	private final String field;

	// ---------------------------------------------------------------------------------------------

	protected DiversifiedSamplerAggregation(Builder builder) {
		super(builder);
		this.executionHint = builder.executionHint;
		this.maxDocsPerValue = builder.maxDocsPerValue;
		this.script = builder.script;
		this.shardSize = builder.shardSize;
		this.field = builder.field;

	}

	/**
	 * API name: {@code execution_hint}
	 */
	@Nullable
	public JsonValue executionHint() {
		return this.executionHint;
	}

	/**
	 * API name: {@code max_docs_per_value}
	 */
	@Nullable
	public Number maxDocsPerValue() {
		return this.maxDocsPerValue;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue script() {
		return this.script;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public Number shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.executionHint != null) {

			generator.writeKey("execution_hint");
			generator.write(this.executionHint);

		}
		if (this.maxDocsPerValue != null) {

			generator.writeKey("max_docs_per_value");
			generator.write(this.maxDocsPerValue.doubleValue());

		}
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.shardSize != null) {

			generator.writeKey("shard_size");
			generator.write(this.shardSize.doubleValue());

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
		private JsonValue executionHint;

		@Nullable
		private Number maxDocsPerValue;

		@Nullable
		private JsonValue script;

		@Nullable
		private Number shardSize;

		@Nullable
		private String field;

		/**
		 * API name: {@code execution_hint}
		 */
		public Builder executionHint(@Nullable JsonValue value) {
			this.executionHint = value;
			return this;
		}

		/**
		 * API name: {@code max_docs_per_value}
		 */
		public Builder maxDocsPerValue(@Nullable Number value) {
			this.maxDocsPerValue = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable JsonValue value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code shard_size}
		 */
		public Builder shardSize(@Nullable Number value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
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

			return new DiversifiedSamplerAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DiversifiedSamplerAggregation
	 */
	public static final JsonpDeserializer<DiversifiedSamplerAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DiversifiedSamplerAggregation::setupDiversifiedSamplerAggregationDeserializer);

	protected static void setupDiversifiedSamplerAggregationDeserializer(
			DelegatingDeserializer<DiversifiedSamplerAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::executionHint, JsonpDeserializer.jsonValueDeserializer(), "execution_hint");
		op.add(Builder::maxDocsPerValue, JsonpDeserializer.numberDeserializer(), "max_docs_per_value");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::shardSize, JsonpDeserializer.numberDeserializer(), "shard_size");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");

	}

}
