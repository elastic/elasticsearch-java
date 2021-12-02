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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: nodes._types.ExtendedMemoryStats

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/nodes/_types/Stats.ts#L128-L131">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExtendedMemoryStats extends MemoryStats {
	private final int freePercent;

	private final int usedPercent;

	// ---------------------------------------------------------------------------------------------

	private ExtendedMemoryStats(Builder builder) {
		super(builder);

		this.freePercent = ApiTypeHelper.requireNonNull(builder.freePercent, this, "freePercent");
		this.usedPercent = ApiTypeHelper.requireNonNull(builder.usedPercent, this, "usedPercent");

	}

	public static ExtendedMemoryStats of(Function<Builder, ObjectBuilder<ExtendedMemoryStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code free_percent}
	 */
	public final int freePercent() {
		return this.freePercent;
	}

	/**
	 * Required - API name: {@code used_percent}
	 */
	public final int usedPercent() {
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
		 * Required - API name: {@code free_percent}
		 */
		public final Builder freePercent(int value) {
			this.freePercent = value;
			return this;
		}

		/**
		 * Required - API name: {@code used_percent}
		 */
		public final Builder usedPercent(int value) {
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
			_checkSingleUse();

			return new ExtendedMemoryStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExtendedMemoryStats}
	 */
	public static final JsonpDeserializer<ExtendedMemoryStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExtendedMemoryStats::setupExtendedMemoryStatsDeserializer);

	protected static void setupExtendedMemoryStatsDeserializer(ObjectDeserializer<ExtendedMemoryStats.Builder> op) {
		MemoryStats.setupMemoryStatsDeserializer(op);
		op.add(Builder::freePercent, JsonpDeserializer.integerDeserializer(), "free_percent");
		op.add(Builder::usedPercent, JsonpDeserializer.integerDeserializer(), "used_percent");

	}

}
