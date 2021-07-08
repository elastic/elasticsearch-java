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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.CompareCondition
public final class CompareCondition implements ToJsonp {
	@Nullable
	private final String comparison;

	@Nullable
	private final String path;

	@Nullable
	private final JsonValue value;

	@Nullable
	private final CompareContextPayloadCondition ctx_payload_match;

	@Nullable
	private final CompareContextPayloadCondition ctx_payload_value;

	// ---------------------------------------------------------------------------------------------

	protected CompareCondition(Builder builder) {

		this.comparison = builder.comparison;
		this.path = builder.path;
		this.value = builder.value;
		this.ctx_payload_match = builder.ctx_payload_match;
		this.ctx_payload_value = builder.ctx_payload_value;

	}

	/**
	 * API name: {@code comparison}
	 */
	@Nullable
	public String comparison() {
		return this.comparison;
	}

	/**
	 * API name: {@code path}
	 */
	@Nullable
	public String path() {
		return this.path;
	}

	/**
	 * API name: {@code value}
	 */
	@Nullable
	public JsonValue value() {
		return this.value;
	}

	/**
	 * API name: {@code ctx.payload.match}
	 */
	@Nullable
	public CompareContextPayloadCondition ctx_payload_match() {
		return this.ctx_payload_match;
	}

	/**
	 * API name: {@code ctx.payload.value}
	 */
	@Nullable
	public CompareContextPayloadCondition ctx_payload_value() {
		return this.ctx_payload_value;
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

		if (this.comparison != null) {

			generator.writeKey("comparison");
			generator.write(this.comparison);

		}
		if (this.path != null) {

			generator.writeKey("path");
			generator.write(this.path);

		}
		if (this.value != null) {

			generator.writeKey("value");
			generator.write(this.value);

		}
		if (this.ctx_payload_match != null) {

			generator.writeKey("ctx.payload.match");
			this.ctx_payload_match.toJsonp(generator, mapper);

		}
		if (this.ctx_payload_value != null) {

			generator.writeKey("ctx.payload.value");
			this.ctx_payload_value.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompareCondition}.
	 */
	public static class Builder implements ObjectBuilder<CompareCondition> {
		@Nullable
		private String comparison;

		@Nullable
		private String path;

		@Nullable
		private JsonValue value;

		@Nullable
		private CompareContextPayloadCondition ctx_payload_match;

		@Nullable
		private CompareContextPayloadCondition ctx_payload_value;

		/**
		 * API name: {@code comparison}
		 */
		public Builder comparison(@Nullable String value) {
			this.comparison = value;
			return this;
		}

		/**
		 * API name: {@code path}
		 */
		public Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(@Nullable JsonValue value) {
			this.value = value;
			return this;
		}

		/**
		 * API name: {@code ctx.payload.match}
		 */
		public Builder ctx_payload_match(@Nullable CompareContextPayloadCondition value) {
			this.ctx_payload_match = value;
			return this;
		}

		/**
		 * API name: {@code ctx.payload.match}
		 */
		public Builder ctx_payload_match(
				Function<CompareContextPayloadCondition.Builder, ObjectBuilder<CompareContextPayloadCondition>> fn) {
			return this.ctx_payload_match(fn.apply(new CompareContextPayloadCondition.Builder()).build());
		}

		/**
		 * API name: {@code ctx.payload.value}
		 */
		public Builder ctx_payload_value(@Nullable CompareContextPayloadCondition value) {
			this.ctx_payload_value = value;
			return this;
		}

		/**
		 * API name: {@code ctx.payload.value}
		 */
		public Builder ctx_payload_value(
				Function<CompareContextPayloadCondition.Builder, ObjectBuilder<CompareContextPayloadCondition>> fn) {
			return this.ctx_payload_value(fn.apply(new CompareContextPayloadCondition.Builder()).build());
		}

		/**
		 * Builds a {@link CompareCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompareCondition build() {

			return new CompareCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CompareCondition
	 */
	public static final JsonpDeserializer<CompareCondition> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CompareCondition::setupCompareConditionDeserializer);

	protected static void setupCompareConditionDeserializer(DelegatingDeserializer<CompareCondition.Builder> op) {

		op.add(Builder::comparison, JsonpDeserializer.stringDeserializer(), "comparison");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::value, JsonpDeserializer.jsonValueDeserializer(), "value");
		op.add(Builder::ctx_payload_match, CompareContextPayloadCondition.DESERIALIZER, "ctx.payload.match");
		op.add(Builder::ctx_payload_value, CompareContextPayloadCondition.DESERIALIZER, "ctx.payload.value");

	}

}
