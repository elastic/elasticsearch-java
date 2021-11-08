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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.WeightedAverageValue
@JsonpDeserializable
public class WeightedAverageValue implements JsonpSerializable {
	@Nullable
	private final String field;

	@Nullable
	private final Double missing;

	@Nullable
	private final JsonValue /* _types.Script */ script;

	// ---------------------------------------------------------------------------------------------

	private WeightedAverageValue(Builder builder) {

		this.field = builder.field;
		this.missing = builder.missing;
		this.script = builder.script;

	}

	public static WeightedAverageValue of(Function<Builder, ObjectBuilder<WeightedAverageValue>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final Double missing() {
		return this.missing;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final JsonValue /* _types.Script */ script() {
		return this.script;
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
		if (this.missing != null) {
			generator.writeKey("missing");
			generator.write(this.missing);

		}
		if (this.script != null) {
			generator.writeKey("script");
			generator.write(this.script);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WeightedAverageValue}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<WeightedAverageValue> {
		@Nullable
		private String field;

		@Nullable
		private Double missing;

		@Nullable
		private JsonValue /* _types.Script */ script;

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable Double value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		/**
		 * Builds a {@link WeightedAverageValue}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WeightedAverageValue build() {
			_checkSingleUse();

			return new WeightedAverageValue(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WeightedAverageValue}
	 */
	public static final JsonpDeserializer<WeightedAverageValue> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WeightedAverageValue::setupWeightedAverageValueDeserializer, Builder::build);

	protected static void setupWeightedAverageValueDeserializer(
			DelegatingDeserializer<WeightedAverageValue.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::missing, JsonpDeserializer.doubleDeserializer(), "missing");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");

	}

}
