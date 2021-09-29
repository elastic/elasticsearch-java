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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: nodes._types.ExtendedMemoryStats
@JsonpDeserializable
public final class ExtendedMemoryStats extends MemoryStats {
	private final int freePercent;

	private final int usedPercent;

	// ---------------------------------------------------------------------------------------------

	public ExtendedMemoryStats(Builder builder) {
		super(builder);

		this.freePercent = Objects.requireNonNull(builder.freePercent, "free_percent");
		this.usedPercent = Objects.requireNonNull(builder.usedPercent, "used_percent");

	}

	public ExtendedMemoryStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code free_percent}
	 */
	public int freePercent() {
		return this.freePercent;
	}

	/**
	 * API name: {@code used_percent}
	 */
	public int usedPercent() {
		return this.usedPercent;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("free_percent");
		generator.write(this.freePercent);

		generator.writeKey("used_percent");
		generator.write(this.usedPercent);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExtendedMemoryStats}.
	 */
	public static class Builder extends MemoryStats.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExtendedMemoryStats> {
		private Integer freePercent;

		private Integer usedPercent;

		/**
		 * API name: {@code free_percent}
		 */
		public Builder freePercent(int value) {
			this.freePercent = value;
			return this;
		}

		/**
		 * API name: {@code used_percent}
		 */
		public Builder usedPercent(int value) {
			this.usedPercent = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExtendedMemoryStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedMemoryStats build() {

			return new ExtendedMemoryStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExtendedMemoryStats}
	 */
	public static final JsonpDeserializer<ExtendedMemoryStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExtendedMemoryStats::setupExtendedMemoryStatsDeserializer, Builder::build);

	protected static void setupExtendedMemoryStatsDeserializer(DelegatingDeserializer<ExtendedMemoryStats.Builder> op) {
		MemoryStats.setupMemoryStatsDeserializer(op);
		op.add(Builder::freePercent, JsonpDeserializer.integerDeserializer(), "free_percent");
		op.add(Builder::usedPercent, JsonpDeserializer.integerDeserializer(), "used_percent");

	}

}
