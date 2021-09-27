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
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.CompareCondition
@JsonpDeserializable
public final class CompareCondition implements ConditionVariant, JsonpSerializable {
	@Nullable
	private final String comparison;

	@Nullable
	private final String path;

	@Nullable
	private final JsonData value;

	@Nullable
	private final CompareContextPayloadCondition ctxPayloadMatch;

	@Nullable
	private final CompareContextPayloadCondition ctxPayloadValue;

	// ---------------------------------------------------------------------------------------------

	public CompareCondition(Builder builder) {

		this.comparison = builder.comparison;
		this.path = builder.path;
		this.value = builder.value;
		this.ctxPayloadMatch = builder.ctxPayloadMatch;
		this.ctxPayloadValue = builder.ctxPayloadValue;

	}

	/**
	 * {@link Condition} variant type
	 */
	@Override
	public String _variantType() {
		return "compare";
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
	public JsonData value() {
		return this.value;
	}

	/**
	 * API name: {@code ctx.payload.match}
	 */
	@Nullable
	public CompareContextPayloadCondition ctxPayloadMatch() {
		return this.ctxPayloadMatch;
	}

	/**
	 * API name: {@code ctx.payload.value}
	 */
	@Nullable
	public CompareContextPayloadCondition ctxPayloadValue() {
		return this.ctxPayloadValue;
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
			this.value.serialize(generator, mapper);

		}
		if (this.ctxPayloadMatch != null) {

			generator.writeKey("ctx.payload.match");
			this.ctxPayloadMatch.serialize(generator, mapper);

		}
		if (this.ctxPayloadValue != null) {

			generator.writeKey("ctx.payload.value");
			this.ctxPayloadValue.serialize(generator, mapper);

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
		private JsonData value;

		@Nullable
		private CompareContextPayloadCondition ctxPayloadMatch;

		@Nullable
		private CompareContextPayloadCondition ctxPayloadValue;

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
		public Builder value(@Nullable JsonData value) {
			this.value = value;
			return this;
		}

		/**
		 * API name: {@code ctx.payload.match}
		 */
		public Builder ctxPayloadMatch(@Nullable CompareContextPayloadCondition value) {
			this.ctxPayloadMatch = value;
			return this;
		}

		/**
		 * API name: {@code ctx.payload.match}
		 */
		public Builder ctxPayloadMatch(
				Function<CompareContextPayloadCondition.Builder, ObjectBuilder<CompareContextPayloadCondition>> fn) {
			return this.ctxPayloadMatch(fn.apply(new CompareContextPayloadCondition.Builder()).build());
		}

		/**
		 * API name: {@code ctx.payload.value}
		 */
		public Builder ctxPayloadValue(@Nullable CompareContextPayloadCondition value) {
			this.ctxPayloadValue = value;
			return this;
		}

		/**
		 * API name: {@code ctx.payload.value}
		 */
		public Builder ctxPayloadValue(
				Function<CompareContextPayloadCondition.Builder, ObjectBuilder<CompareContextPayloadCondition>> fn) {
			return this.ctxPayloadValue(fn.apply(new CompareContextPayloadCondition.Builder()).build());
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
	 * Json deserializer for {@link CompareCondition}
	 */
	public static final JsonpDeserializer<CompareCondition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CompareCondition::setupCompareConditionDeserializer, Builder::build);

	protected static void setupCompareConditionDeserializer(DelegatingDeserializer<CompareCondition.Builder> op) {

		op.add(Builder::comparison, JsonpDeserializer.stringDeserializer(), "comparison");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::value, JsonData._DESERIALIZER, "value");
		op.add(Builder::ctxPayloadMatch, CompareContextPayloadCondition._DESERIALIZER, "ctx.payload.match");
		op.add(Builder::ctxPayloadValue, CompareContextPayloadCondition._DESERIALIZER, "ctx.payload.value");

	}

}
