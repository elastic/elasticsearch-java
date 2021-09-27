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

package co.elastic.clients.elasticsearch._core.get_script_context;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.get_script_context.Context
@JsonpDeserializable
public final class Context implements JsonpSerializable {
	private final List<ContextMethod> methods;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	public Context(Builder builder) {

		this.methods = Objects.requireNonNull(builder.methods, "methods");
		this.name = Objects.requireNonNull(builder.name, "name");

	}

	/**
	 * API name: {@code methods}
	 */
	public List<ContextMethod> methods() {
		return this.methods;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
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

		generator.writeKey("methods");
		generator.writeStartArray();
		for (ContextMethod item0 : this.methods) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("name");
		generator.write(this.name);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Context}.
	 */
	public static class Builder implements ObjectBuilder<Context> {
		private List<ContextMethod> methods;

		private String name;

		/**
		 * API name: {@code methods}
		 */
		public Builder methods(List<ContextMethod> value) {
			this.methods = value;
			return this;
		}

		/**
		 * API name: {@code methods}
		 */
		public Builder methods(ContextMethod... value) {
			this.methods = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #methods(List)}, creating the list if needed.
		 */
		public Builder addMethods(ContextMethod value) {
			if (this.methods == null) {
				this.methods = new ArrayList<>();
			}
			this.methods.add(value);
			return this;
		}

		/**
		 * Set {@link #methods(List)} to a singleton list.
		 */
		public Builder methods(Function<ContextMethod.Builder, ObjectBuilder<ContextMethod>> fn) {
			return this.methods(fn.apply(new ContextMethod.Builder()).build());
		}

		/**
		 * Add a value to {@link #methods(List)}, creating the list if needed.
		 */
		public Builder addMethods(Function<ContextMethod.Builder, ObjectBuilder<ContextMethod>> fn) {
			return this.addMethods(fn.apply(new ContextMethod.Builder()).build());
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link Context}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Context build() {

			return new Context(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Context}
	 */
	public static final JsonpDeserializer<Context> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Context::setupContextDeserializer, Builder::build);

	protected static void setupContextDeserializer(DelegatingDeserializer<Context.Builder> op) {

		op.add(Builder::methods, JsonpDeserializer.arrayDeserializer(ContextMethod._DESERIALIZER), "methods");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
