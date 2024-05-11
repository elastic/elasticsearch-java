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

package co.elastic.clients.elasticsearch.core.get_script_context;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _global.get_script_context.Context

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.get_script_context.Context">API
 *      specification</a>
 */
@JsonpDeserializable
public class Context implements JsonpSerializable {
	private final List<ContextMethod> methods;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	private Context(Builder builder) {

		this.methods = ApiTypeHelper.unmodifiableRequired(builder.methods, this, "methods");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static Context of(Function<Builder, ObjectBuilder<Context>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code methods}
	 */
	public final List<ContextMethod> methods() {
		return this.methods;
	}

	/**
	 * Required - API name: {@code name}
	 */
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

		if (ApiTypeHelper.isDefined(this.methods)) {
			generator.writeKey("methods");
			generator.writeStartArray();
			for (ContextMethod item0 : this.methods) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("name");
		generator.write(this.name);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Context}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Context> {
		private List<ContextMethod> methods;

		private String name;

		/**
		 * Required - API name: {@code methods}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>methods</code>.
		 */
		public final Builder methods(List<ContextMethod> list) {
			this.methods = _listAddAll(this.methods, list);
			return this;
		}

		/**
		 * Required - API name: {@code methods}
		 * <p>
		 * Adds one or more values to <code>methods</code>.
		 */
		public final Builder methods(ContextMethod value, ContextMethod... values) {
			this.methods = _listAdd(this.methods, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code methods}
		 * <p>
		 * Adds a value to <code>methods</code> using a builder lambda.
		 */
		public final Builder methods(Function<ContextMethod.Builder, ObjectBuilder<ContextMethod>> fn) {
			return methods(fn.apply(new ContextMethod.Builder()).build());
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Context}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Context build() {
			_checkSingleUse();

			return new Context(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Context}
	 */
	public static final JsonpDeserializer<Context> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Context::setupContextDeserializer);

	protected static void setupContextDeserializer(ObjectDeserializer<Context.Builder> op) {

		op.add(Builder::methods, JsonpDeserializer.arrayDeserializer(ContextMethod._DESERIALIZER), "methods");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
