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

package co.elastic.clients.elasticsearch.core.get_script_context;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.get_script_context.ContextMethod
@JsonpDeserializable
public final class ContextMethod implements JsonpSerializable {
	private final String name;

	private final String returnType;

	private final List<ContextMethodParam> params;

	// ---------------------------------------------------------------------------------------------

	public ContextMethod(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.returnType = Objects.requireNonNull(builder.returnType, "return_type");
		this.params = ModelTypeHelper.unmodifiableNonNull(builder.params, "params");

	}

	public ContextMethod(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code return_type}
	 */
	public String returnType() {
		return this.returnType;
	}

	/**
	 * Required - API name: {@code params}
	 */
	public List<ContextMethodParam> params() {
		return this.params;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("return_type");
		generator.write(this.returnType);

		generator.writeKey("params");
		generator.writeStartArray();
		for (ContextMethodParam item0 : this.params) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ContextMethod}.
	 */
	public static class Builder implements ObjectBuilder<ContextMethod> {
		private String name;

		private String returnType;

		private List<ContextMethodParam> params;

		/**
		 * Required - API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code return_type}
		 */
		public Builder returnType(String value) {
			this.returnType = value;
			return this;
		}

		/**
		 * Required - API name: {@code params}
		 */
		public Builder params(List<ContextMethodParam> value) {
			this.params = value;
			return this;
		}

		/**
		 * Required - API name: {@code params}
		 */
		public Builder params(ContextMethodParam... value) {
			this.params = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #params(List)}, creating the list if needed.
		 */
		public Builder addParams(ContextMethodParam value) {
			if (this.params == null) {
				this.params = new ArrayList<>();
			}
			this.params.add(value);
			return this;
		}

		/**
		 * Set {@link #params(List)} to a singleton list.
		 */
		public Builder params(Function<ContextMethodParam.Builder, ObjectBuilder<ContextMethodParam>> fn) {
			return this.params(fn.apply(new ContextMethodParam.Builder()).build());
		}

		/**
		 * Add a value to {@link #params(List)}, creating the list if needed.
		 */
		public Builder addParams(Function<ContextMethodParam.Builder, ObjectBuilder<ContextMethodParam>> fn) {
			return this.addParams(fn.apply(new ContextMethodParam.Builder()).build());
		}

		/**
		 * Builds a {@link ContextMethod}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ContextMethod build() {

			return new ContextMethod(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ContextMethod}
	 */
	public static final JsonpDeserializer<ContextMethod> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ContextMethod::setupContextMethodDeserializer, Builder::build);

	protected static void setupContextMethodDeserializer(DelegatingDeserializer<ContextMethod.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::returnType, JsonpDeserializer.stringDeserializer(), "return_type");
		op.add(Builder::params, JsonpDeserializer.arrayDeserializer(ContextMethodParam._DESERIALIZER), "params");

	}

}
