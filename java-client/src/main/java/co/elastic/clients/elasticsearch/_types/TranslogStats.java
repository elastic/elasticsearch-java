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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.TranslogStats
public final class TranslogStats implements ToJsonp {
	private final Number earliestLastModifiedAge;

	private final Number operations;

	@Nullable
	private final String size;

	private final Number sizeInBytes;

	private final Number uncommittedOperations;

	@Nullable
	private final String uncommittedSize;

	private final Number uncommittedSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	protected TranslogStats(Builder builder) {

		this.earliestLastModifiedAge = Objects.requireNonNull(builder.earliestLastModifiedAge,
				"earliest_last_modified_age");
		this.operations = Objects.requireNonNull(builder.operations, "operations");
		this.size = builder.size;
		this.sizeInBytes = Objects.requireNonNull(builder.sizeInBytes, "size_in_bytes");
		this.uncommittedOperations = Objects.requireNonNull(builder.uncommittedOperations, "uncommitted_operations");
		this.uncommittedSize = builder.uncommittedSize;
		this.uncommittedSizeInBytes = Objects.requireNonNull(builder.uncommittedSizeInBytes,
				"uncommitted_size_in_bytes");

	}

	/**
	 * API name: {@code earliest_last_modified_age}
	 */
	public Number earliestLastModifiedAge() {
		return this.earliestLastModifiedAge;
	}

	/**
	 * API name: {@code operations}
	 */
	public Number operations() {
		return this.operations;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public String size() {
		return this.size;
	}

	/**
	 * API name: {@code size_in_bytes}
	 */
	public Number sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * API name: {@code uncommitted_operations}
	 */
	public Number uncommittedOperations() {
		return this.uncommittedOperations;
	}

	/**
	 * API name: {@code uncommitted_size}
	 */
	@Nullable
	public String uncommittedSize() {
		return this.uncommittedSize;
	}

	/**
	 * API name: {@code uncommitted_size_in_bytes}
	 */
	public Number uncommittedSizeInBytes() {
		return this.uncommittedSizeInBytes;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("earliest_last_modified_age");
		generator.write(this.earliestLastModifiedAge.doubleValue());

		generator.writeKey("operations");
		generator.write(this.operations.doubleValue());

		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes.doubleValue());

		generator.writeKey("uncommitted_operations");
		generator.write(this.uncommittedOperations.doubleValue());

		if (this.uncommittedSize != null) {

			generator.writeKey("uncommitted_size");
			generator.write(this.uncommittedSize);

		}

		generator.writeKey("uncommitted_size_in_bytes");
		generator.write(this.uncommittedSizeInBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TranslogStats}.
	 */
	public static class Builder implements ObjectBuilder<TranslogStats> {
		private Number earliestLastModifiedAge;

		private Number operations;

		@Nullable
		private String size;

		private Number sizeInBytes;

		private Number uncommittedOperations;

		@Nullable
		private String uncommittedSize;

		private Number uncommittedSizeInBytes;

		/**
		 * API name: {@code earliest_last_modified_age}
		 */
		public Builder earliestLastModifiedAge(Number value) {
			this.earliestLastModifiedAge = value;
			return this;
		}

		/**
		 * API name: {@code operations}
		 */
		public Builder operations(Number value) {
			this.operations = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code size_in_bytes}
		 */
		public Builder sizeInBytes(Number value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code uncommitted_operations}
		 */
		public Builder uncommittedOperations(Number value) {
			this.uncommittedOperations = value;
			return this;
		}

		/**
		 * API name: {@code uncommitted_size}
		 */
		public Builder uncommittedSize(@Nullable String value) {
			this.uncommittedSize = value;
			return this;
		}

		/**
		 * API name: {@code uncommitted_size_in_bytes}
		 */
		public Builder uncommittedSizeInBytes(Number value) {
			this.uncommittedSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link TranslogStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TranslogStats build() {

			return new TranslogStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for TranslogStats
	 */
	public static final JsonpValueParser<TranslogStats> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, TranslogStats::setupTranslogStatsParser);

	protected static void setupTranslogStatsParser(DelegatingJsonpValueParser<TranslogStats.Builder> op) {

		op.add(Builder::earliestLastModifiedAge, JsonpValueParser.numberParser(), "earliest_last_modified_age");
		op.add(Builder::operations, JsonpValueParser.numberParser(), "operations");
		op.add(Builder::size, JsonpValueParser.stringParser(), "size");
		op.add(Builder::sizeInBytes, JsonpValueParser.numberParser(), "size_in_bytes");
		op.add(Builder::uncommittedOperations, JsonpValueParser.numberParser(), "uncommitted_operations");
		op.add(Builder::uncommittedSize, JsonpValueParser.stringParser(), "uncommitted_size");
		op.add(Builder::uncommittedSizeInBytes, JsonpValueParser.numberParser(), "uncommitted_size_in_bytes");

	}

}
