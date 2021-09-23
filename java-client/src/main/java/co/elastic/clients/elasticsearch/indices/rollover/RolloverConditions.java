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

package co.elastic.clients.elasticsearch.indices.rollover;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.rollover.RolloverConditions
public final class RolloverConditions implements JsonpSerializable {
	@Nullable
	private final JsonValue maxAge;

	@Nullable
	private final Number maxDocs;

	@Nullable
	private final String maxSize;

	@Nullable
	private final JsonValue maxPrimaryShardSize;

	// ---------------------------------------------------------------------------------------------

	public RolloverConditions(Builder builder) {

		this.maxAge = builder.maxAge;
		this.maxDocs = builder.maxDocs;
		this.maxSize = builder.maxSize;
		this.maxPrimaryShardSize = builder.maxPrimaryShardSize;

	}

	/**
	 * API name: {@code max_age}
	 */
	@Nullable
	public JsonValue maxAge() {
		return this.maxAge;
	}

	/**
	 * API name: {@code max_docs}
	 */
	@Nullable
	public Number maxDocs() {
		return this.maxDocs;
	}

	/**
	 * API name: {@code max_size}
	 */
	@Nullable
	public String maxSize() {
		return this.maxSize;
	}

	/**
	 * API name: {@code max_primary_shard_size}
	 */
	@Nullable
	public JsonValue maxPrimaryShardSize() {
		return this.maxPrimaryShardSize;
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

		if (this.maxAge != null) {

			generator.writeKey("max_age");
			generator.write(this.maxAge);

		}
		if (this.maxDocs != null) {

			generator.writeKey("max_docs");
			generator.write(this.maxDocs.doubleValue());

		}
		if (this.maxSize != null) {

			generator.writeKey("max_size");
			generator.write(this.maxSize);

		}
		if (this.maxPrimaryShardSize != null) {

			generator.writeKey("max_primary_shard_size");
			generator.write(this.maxPrimaryShardSize);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RolloverConditions}.
	 */
	public static class Builder implements ObjectBuilder<RolloverConditions> {
		@Nullable
		private JsonValue maxAge;

		@Nullable
		private Number maxDocs;

		@Nullable
		private String maxSize;

		@Nullable
		private JsonValue maxPrimaryShardSize;

		/**
		 * API name: {@code max_age}
		 */
		public Builder maxAge(@Nullable JsonValue value) {
			this.maxAge = value;
			return this;
		}

		/**
		 * API name: {@code max_docs}
		 */
		public Builder maxDocs(@Nullable Number value) {
			this.maxDocs = value;
			return this;
		}

		/**
		 * API name: {@code max_size}
		 */
		public Builder maxSize(@Nullable String value) {
			this.maxSize = value;
			return this;
		}

		/**
		 * API name: {@code max_primary_shard_size}
		 */
		public Builder maxPrimaryShardSize(@Nullable JsonValue value) {
			this.maxPrimaryShardSize = value;
			return this;
		}

		/**
		 * Builds a {@link RolloverConditions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RolloverConditions build() {

			return new RolloverConditions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RolloverConditions}
	 */
	public static final JsonpDeserializer<RolloverConditions> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RolloverConditions::setupRolloverConditionsDeserializer);

	protected static void setupRolloverConditionsDeserializer(DelegatingDeserializer<RolloverConditions.Builder> op) {

		op.add(Builder::maxAge, JsonpDeserializer.jsonValueDeserializer(), "max_age");
		op.add(Builder::maxDocs, JsonpDeserializer.numberDeserializer(), "max_docs");
		op.add(Builder::maxSize, JsonpDeserializer.stringDeserializer(), "max_size");
		op.add(Builder::maxPrimaryShardSize, JsonpDeserializer.jsonValueDeserializer(), "max_primary_shard_size");

	}

}
