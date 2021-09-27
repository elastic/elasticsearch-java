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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm._types.Phases
@JsonpDeserializable
public final class Phases implements JsonpSerializable {
	@Nullable
	private final Phase cold;

	@Nullable
	private final Phase delete;

	@Nullable
	private final Phase hot;

	@Nullable
	private final Phase warm;

	// ---------------------------------------------------------------------------------------------

	public Phases(Builder builder) {

		this.cold = builder.cold;
		this.delete = builder.delete;
		this.hot = builder.hot;
		this.warm = builder.warm;

	}

	/**
	 * API name: {@code cold}
	 */
	@Nullable
	public Phase cold() {
		return this.cold;
	}

	/**
	 * API name: {@code delete}
	 */
	@Nullable
	public Phase delete() {
		return this.delete;
	}

	/**
	 * API name: {@code hot}
	 */
	@Nullable
	public Phase hot() {
		return this.hot;
	}

	/**
	 * API name: {@code warm}
	 */
	@Nullable
	public Phase warm() {
		return this.warm;
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

		if (this.cold != null) {

			generator.writeKey("cold");
			this.cold.serialize(generator, mapper);

		}
		if (this.delete != null) {

			generator.writeKey("delete");
			this.delete.serialize(generator, mapper);

		}
		if (this.hot != null) {

			generator.writeKey("hot");
			this.hot.serialize(generator, mapper);

		}
		if (this.warm != null) {

			generator.writeKey("warm");
			this.warm.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Phases}.
	 */
	public static class Builder implements ObjectBuilder<Phases> {
		@Nullable
		private Phase cold;

		@Nullable
		private Phase delete;

		@Nullable
		private Phase hot;

		@Nullable
		private Phase warm;

		/**
		 * API name: {@code cold}
		 */
		public Builder cold(@Nullable Phase value) {
			this.cold = value;
			return this;
		}

		/**
		 * API name: {@code cold}
		 */
		public Builder cold(Function<Phase.Builder, ObjectBuilder<Phase>> fn) {
			return this.cold(fn.apply(new Phase.Builder()).build());
		}

		/**
		 * API name: {@code delete}
		 */
		public Builder delete(@Nullable Phase value) {
			this.delete = value;
			return this;
		}

		/**
		 * API name: {@code delete}
		 */
		public Builder delete(Function<Phase.Builder, ObjectBuilder<Phase>> fn) {
			return this.delete(fn.apply(new Phase.Builder()).build());
		}

		/**
		 * API name: {@code hot}
		 */
		public Builder hot(@Nullable Phase value) {
			this.hot = value;
			return this;
		}

		/**
		 * API name: {@code hot}
		 */
		public Builder hot(Function<Phase.Builder, ObjectBuilder<Phase>> fn) {
			return this.hot(fn.apply(new Phase.Builder()).build());
		}

		/**
		 * API name: {@code warm}
		 */
		public Builder warm(@Nullable Phase value) {
			this.warm = value;
			return this;
		}

		/**
		 * API name: {@code warm}
		 */
		public Builder warm(Function<Phase.Builder, ObjectBuilder<Phase>> fn) {
			return this.warm(fn.apply(new Phase.Builder()).build());
		}

		/**
		 * Builds a {@link Phases}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Phases build() {

			return new Phases(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Phases}
	 */
	public static final JsonpDeserializer<Phases> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Phases::setupPhasesDeserializer, Builder::build);

	protected static void setupPhasesDeserializer(DelegatingDeserializer<Phases.Builder> op) {

		op.add(Builder::cold, Phase._DESERIALIZER, "cold");
		op.add(Builder::delete, Phase._DESERIALIZER, "delete");
		op.add(Builder::hot, Phase._DESERIALIZER, "hot");
		op.add(Builder::warm, Phase._DESERIALIZER, "warm");

	}

}
