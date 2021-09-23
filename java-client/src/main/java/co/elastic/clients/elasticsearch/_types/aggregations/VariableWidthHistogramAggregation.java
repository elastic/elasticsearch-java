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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.VariableWidthHistogramAggregation
public final class VariableWidthHistogramAggregation implements JsonpSerializable {
	@Nullable
	private final String field;

	@Nullable
	private final Number buckets;

	@Nullable
	private final Number shardSize;

	@Nullable
	private final Number initialBuffer;

	// ---------------------------------------------------------------------------------------------

	public VariableWidthHistogramAggregation(Builder builder) {

		this.field = builder.field;
		this.buckets = builder.buckets;
		this.shardSize = builder.shardSize;
		this.initialBuffer = builder.initialBuffer;

	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code buckets}
	 */
	@Nullable
	public Number buckets() {
		return this.buckets;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public Number shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code initial_buffer}
	 */
	@Nullable
	public Number initialBuffer() {
		return this.initialBuffer;
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

		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.buckets != null) {

			generator.writeKey("buckets");
			generator.write(this.buckets.doubleValue());

		}
		if (this.shardSize != null) {

			generator.writeKey("shard_size");
			generator.write(this.shardSize.doubleValue());

		}
		if (this.initialBuffer != null) {

			generator.writeKey("initial_buffer");
			generator.write(this.initialBuffer.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VariableWidthHistogramAggregation}.
	 */
	public static class Builder implements ObjectBuilder<VariableWidthHistogramAggregation> {
		@Nullable
		private String field;

		@Nullable
		private Number buckets;

		@Nullable
		private Number shardSize;

		@Nullable
		private Number initialBuffer;

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code buckets}
		 */
		public Builder buckets(@Nullable Number value) {
			this.buckets = value;
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
		 * API name: {@code initial_buffer}
		 */
		public Builder initialBuffer(@Nullable Number value) {
			this.initialBuffer = value;
			return this;
		}

		/**
		 * Builds a {@link VariableWidthHistogramAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VariableWidthHistogramAggregation build() {

			return new VariableWidthHistogramAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VariableWidthHistogramAggregation}
	 */
	public static final JsonpDeserializer<VariableWidthHistogramAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					VariableWidthHistogramAggregation::setupVariableWidthHistogramAggregationDeserializer);

	protected static void setupVariableWidthHistogramAggregationDeserializer(
			DelegatingDeserializer<VariableWidthHistogramAggregation.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::buckets, JsonpDeserializer.numberDeserializer(), "buckets");
		op.add(Builder::shardSize, JsonpDeserializer.numberDeserializer(), "shard_size");
		op.add(Builder::initialBuffer, JsonpDeserializer.numberDeserializer(), "initial_buffer");

	}

}
