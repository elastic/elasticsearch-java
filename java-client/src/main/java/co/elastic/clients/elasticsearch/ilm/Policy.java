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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm._types.Policy
@JsonpDeserializable
public class Policy implements JsonpSerializable {
	private final Phases phases;

	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	private Policy(Builder builder) {

		this.phases = ModelTypeHelper.requireNonNull(builder.phases, this, "phases");
		this.name = builder.name;

	}

	public static Policy of(Function<Builder, ObjectBuilder<Policy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code phases}
	 */
	public final Phases phases() {
		return this.phases;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
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

		generator.writeKey("phases");
		this.phases.serialize(generator, mapper);

		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Policy}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Policy> {
		private Phases phases;

		@Nullable
		private String name;

		/**
		 * Required - API name: {@code phases}
		 */
		public final Builder phases(Phases value) {
			this.phases = value;
			return this;
		}

		/**
		 * Required - API name: {@code phases}
		 */
		public final Builder phases(Function<Phases.Builder, ObjectBuilder<Phases>> fn) {
			return this.phases(fn.apply(new Phases.Builder()).build());
		}

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link Policy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Policy build() {
			_checkSingleUse();

			return new Policy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Policy}
	 */
	public static final JsonpDeserializer<Policy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Policy::setupPolicyDeserializer, Builder::build);

	protected static void setupPolicyDeserializer(DelegatingDeserializer<Policy.Builder> op) {

		op.add(Builder::phases, Phases._DESERIALIZER, "phases");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
