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
import javax.annotation.Nullable;

// typedef: watcher._types.CompareContextPayloadCondition
public final class CompareContextPayloadCondition implements ToJsonp {
	@Nullable
	private final JsonValue eq;

	@Nullable
	private final JsonValue lt;

	@Nullable
	private final JsonValue gt;

	@Nullable
	private final JsonValue lte;

	@Nullable
	private final JsonValue gte;

	// ---------------------------------------------------------------------------------------------

	protected CompareContextPayloadCondition(Builder builder) {

		this.eq = builder.eq;
		this.lt = builder.lt;
		this.gt = builder.gt;
		this.lte = builder.lte;
		this.gte = builder.gte;

	}

	/**
	 * API name: {@code eq}
	 */
	@Nullable
	public JsonValue eq() {
		return this.eq;
	}

	/**
	 * API name: {@code lt}
	 */
	@Nullable
	public JsonValue lt() {
		return this.lt;
	}

	/**
	 * API name: {@code gt}
	 */
	@Nullable
	public JsonValue gt() {
		return this.gt;
	}

	/**
	 * API name: {@code lte}
	 */
	@Nullable
	public JsonValue lte() {
		return this.lte;
	}

	/**
	 * API name: {@code gte}
	 */
	@Nullable
	public JsonValue gte() {
		return this.gte;
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

		if (this.eq != null) {

			generator.writeKey("eq");
			generator.write(this.eq);

		}
		if (this.lt != null) {

			generator.writeKey("lt");
			generator.write(this.lt);

		}
		if (this.gt != null) {

			generator.writeKey("gt");
			generator.write(this.gt);

		}
		if (this.lte != null) {

			generator.writeKey("lte");
			generator.write(this.lte);

		}
		if (this.gte != null) {

			generator.writeKey("gte");
			generator.write(this.gte);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompareContextPayloadCondition}.
	 */
	public static class Builder implements ObjectBuilder<CompareContextPayloadCondition> {
		@Nullable
		private JsonValue eq;

		@Nullable
		private JsonValue lt;

		@Nullable
		private JsonValue gt;

		@Nullable
		private JsonValue lte;

		@Nullable
		private JsonValue gte;

		/**
		 * API name: {@code eq}
		 */
		public Builder eq(@Nullable JsonValue value) {
			this.eq = value;
			return this;
		}

		/**
		 * API name: {@code lt}
		 */
		public Builder lt(@Nullable JsonValue value) {
			this.lt = value;
			return this;
		}

		/**
		 * API name: {@code gt}
		 */
		public Builder gt(@Nullable JsonValue value) {
			this.gt = value;
			return this;
		}

		/**
		 * API name: {@code lte}
		 */
		public Builder lte(@Nullable JsonValue value) {
			this.lte = value;
			return this;
		}

		/**
		 * API name: {@code gte}
		 */
		public Builder gte(@Nullable JsonValue value) {
			this.gte = value;
			return this;
		}

		/**
		 * Builds a {@link CompareContextPayloadCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompareContextPayloadCondition build() {

			return new CompareContextPayloadCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CompareContextPayloadCondition
	 */
	public static final JsonpDeserializer<CompareContextPayloadCondition> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					CompareContextPayloadCondition::setupCompareContextPayloadConditionDeserializer);

	protected static void setupCompareContextPayloadConditionDeserializer(
			DelegatingDeserializer<CompareContextPayloadCondition.Builder> op) {

		op.add(Builder::eq, JsonpDeserializer.jsonValueDeserializer(), "eq");
		op.add(Builder::lt, JsonpDeserializer.jsonValueDeserializer(), "lt");
		op.add(Builder::gt, JsonpDeserializer.jsonValueDeserializer(), "gt");
		op.add(Builder::lte, JsonpDeserializer.jsonValueDeserializer(), "lte");
		op.add(Builder::gte, JsonpDeserializer.jsonValueDeserializer(), "gte");

	}

}
