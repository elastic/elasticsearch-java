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

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm._types.Phase

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm._types.Phase">API
 *      specification</a>
 */
@JsonpDeserializable
public class Phase implements JsonpSerializable {
	@Nullable
	private final JsonData actions;

	@Nullable
	private final Time minAge;

	@Nullable
	private final Configurations configurations;

	// ---------------------------------------------------------------------------------------------

	private Phase(Builder builder) {

		this.actions = builder.actions;
		this.minAge = builder.minAge;
		this.configurations = builder.configurations;

	}

	public static Phase of(Function<Builder, ObjectBuilder<Phase>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code actions}
	 */
	@Nullable
	public final JsonData actions() {
		return this.actions;
	}

	/**
	 * API name: {@code min_age}
	 */
	@Nullable
	public final Time minAge() {
		return this.minAge;
	}

	/**
	 * API name: {@code configurations}
	 */
	@Nullable
	public final Configurations configurations() {
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
			this.actions.serialize(generator, mapper);

		}
		if (this.minAge != null) {
			generator.writeKey("min_age");
			this.minAge.serialize(generator, mapper);

		}
		if (this.configurations != null) {
			generator.writeKey("configurations");
			this.configurations.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Phase}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Phase> {
		@Nullable
		private JsonData actions;

		@Nullable
		private Time minAge;

		@Nullable
		private Configurations configurations;

		/**
		 * API name: {@code actions}
		 */
		public final Builder actions(@Nullable JsonData value) {
			this.actions = value;
			return this;
		}

		/**
		 * API name: {@code min_age}
		 */
		public final Builder minAge(@Nullable Time value) {
			this.minAge = value;
			return this;
		}

		/**
		 * API name: {@code min_age}
		 */
		public final Builder minAge(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.minAge(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code configurations}
		 */
		public final Builder configurations(@Nullable Configurations value) {
			this.configurations = value;
			return this;
		}

		/**
		 * API name: {@code configurations}
		 */
		public final Builder configurations(Function<Configurations.Builder, ObjectBuilder<Configurations>> fn) {
			return this.configurations(fn.apply(new Configurations.Builder()).build());
		}

		@Override
		protected Builder self() {
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
			Phase::setupPhaseDeserializer);

	protected static void setupPhaseDeserializer(ObjectDeserializer<Phase.Builder> op) {

		op.add(Builder::actions, JsonData._DESERIALIZER, "actions");
		op.add(Builder::minAge, Time._DESERIALIZER, "min_age");
		op.add(Builder::configurations, Configurations._DESERIALIZER, "configurations");

	}

}
