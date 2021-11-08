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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm._types.Phase
@JsonpDeserializable
public class Phase implements JsonpSerializable {
	@Nullable
	private final JsonValue /*
							 * Union(Array<internal.string> | Dictionary<internal.string,
							 * ilm._types.Action>)
							 */ actions;

	@Nullable
	private final String minAge;

	private final Map<String, Map<String, String>> configurations;

	// ---------------------------------------------------------------------------------------------

	private Phase(Builder builder) {

		this.actions = builder.actions;
		this.minAge = builder.minAge;
		this.configurations = ModelTypeHelper.unmodifiable(builder.configurations);

	}

	public static Phase of(Function<Builder, ObjectBuilder<Phase>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code actions}
	 */
	@Nullable
	public final JsonValue /*
							 * Union(Array<internal.string> | Dictionary<internal.string,
							 * ilm._types.Action>)
							 */ actions() {
		return this.actions;
	}

	/**
	 * API name: {@code min_age}
	 */
	@Nullable
	public final String minAge() {
		return this.minAge;
	}

	/**
	 * API name: {@code configurations}
	 */
	public final Map<String, Map<String, String>> configurations() {
		return this.configurations;
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

		if (this.actions != null) {
			generator.writeKey("actions");
			generator.write(this.actions);

		}
		if (this.minAge != null) {
			generator.writeKey("min_age");
			generator.write(this.minAge);

		}
		if (ModelTypeHelper.isDefined(this.configurations)) {
			generator.writeKey("configurations");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, String>> item0 : this.configurations.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, String> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Phase}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Phase> {
		@Nullable
		private JsonValue /*
							 * Union(Array<internal.string> | Dictionary<internal.string,
							 * ilm._types.Action>)
							 */ actions;

		@Nullable
		private String minAge;

		@Nullable
		private Map<String, Map<String, String>> configurations;

		/**
		 * API name: {@code actions}
		 */
		public final Builder actions(@Nullable JsonValue /*
															 * Union(Array<internal.string> |
															 * Dictionary<internal.string, ilm._types.Action>)
															 */ value) {
			this.actions = value;
			return this;
		}

		/**
		 * API name: {@code min_age}
		 */
		public final Builder minAge(@Nullable String value) {
			this.minAge = value;
			return this;
		}

		/**
		 * API name: {@code configurations}
		 */
		public final Builder configurations(@Nullable Map<String, Map<String, String>> value) {
			this.configurations = value;
			return this;
		}

		/**
		 * Builds a {@link Phase}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Phase build() {
			_checkSingleUse();

			return new Phase(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Phase}
	 */
	public static final JsonpDeserializer<Phase> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Phase::setupPhaseDeserializer, Builder::build);

	protected static void setupPhaseDeserializer(DelegatingDeserializer<Phase.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.jsonValueDeserializer(), "actions");
		op.add(Builder::minAge, JsonpDeserializer.stringDeserializer(), "min_age");
		op.add(Builder::configurations,
				JsonpDeserializer.stringMapDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer())),
				"configurations");

	}

}
