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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes._types.ExtendedMemoryStats
public final class ExtendedMemoryStats extends MemoryStats {
	private final Number freePercent;

	private final Number usedPercent;

	private final Number totalInBytes;

	private final Number freeInBytes;

	private final Number usedInBytes;

	// ---------------------------------------------------------------------------------------------

	protected ExtendedMemoryStats(Builder builder) {
		super(builder);
		this.freePercent = Objects.requireNonNull(builder.freePercent, "free_percent");
		this.usedPercent = Objects.requireNonNull(builder.usedPercent, "used_percent");
		this.totalInBytes = Objects.requireNonNull(builder.totalInBytes, "total_in_bytes");
		this.freeInBytes = Objects.requireNonNull(builder.freeInBytes, "free_in_bytes");
		this.usedInBytes = Objects.requireNonNull(builder.usedInBytes, "used_in_bytes");

	}

	/**
	 * API name: {@code free_percent}
	 */
	public Number freePercent() {
		return this.freePercent;
	}

	/**
	 * API name: {@code used_percent}
	 */
	public Number usedPercent() {
		return this.usedPercent;
	}

	/**
	 * API name: {@code total_in_bytes}
	 */
	public Number totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * API name: {@code free_in_bytes}
	 */
	public Number freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * API name: {@code used_in_bytes}
	 */
	public Number usedInBytes() {
		return this.usedInBytes;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("free_percent");
		generator.write(this.freePercent.doubleValue());

		generator.writeKey("used_percent");
		generator.write(this.usedPercent.doubleValue());

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes.doubleValue());

		generator.writeKey("free_in_bytes");
		generator.write(this.freeInBytes.doubleValue());

		generator.writeKey("used_in_bytes");
		generator.write(this.usedInBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExtendedMemoryStats}.
	 */
	public static class Builder extends MemoryStats.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExtendedMemoryStats> {
		private Number freePercent;

		private Number usedPercent;

		private Number totalInBytes;

		private Number freeInBytes;

		private Number usedInBytes;

		/**
		 * API name: {@code free_percent}
		 */
		public Builder freePercent(Number value) {
			this.freePercent = value;
			return this;
		}

		/**
		 * API name: {@code used_percent}
		 */
		public Builder usedPercent(Number value) {
			this.usedPercent = value;
			return this;
		}

		/**
		 * API name: {@code total_in_bytes}
		 */
		public Builder totalInBytes(Number value) {
			this.totalInBytes = value;
			return this;
		}

		/**
		 * API name: {@code free_in_bytes}
		 */
		public Builder freeInBytes(Number value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code used_in_bytes}
		 */
		public Builder usedInBytes(Number value) {
			this.usedInBytes = value;
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
	 * Json parser for ExtendedMemoryStats
	 */
	public static final JsonpValueParser<ExtendedMemoryStats> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ExtendedMemoryStats::setupExtendedMemoryStatsParser);

	protected static void setupExtendedMemoryStatsParser(DelegatingJsonpValueParser<ExtendedMemoryStats.Builder> op) {
		MemoryStats.setupMemoryStatsParser(op);
		op.add(Builder::freePercent, JsonpValueParser.numberParser(), "free_percent");
		op.add(Builder::usedPercent, JsonpValueParser.numberParser(), "used_percent");
		op.add(Builder::totalInBytes, JsonpValueParser.numberParser(), "total_in_bytes");
		op.add(Builder::freeInBytes, JsonpValueParser.numberParser(), "free_in_bytes");
		op.add(Builder::usedInBytes, JsonpValueParser.numberParser(), "used_in_bytes");

	}

}
