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

// typedef: _global.get_script_context.ContextMethod

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.get_script_context.ContextMethod">API
 *      specification</a>
 */
@JsonpDeserializable
public class ContextMethod implements JsonpSerializable {
	private final String name;

	private final String returnType;

	private final List<ContextMethodParam> params;

	// ---------------------------------------------------------------------------------------------

	private ContextMethod(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.returnType = ApiTypeHelper.requireNonNull(builder.returnType, this, "returnType");
		this.params = ApiTypeHelper.unmodifiableRequired(builder.params, this, "params");

	}

	public static ContextMethod of(Function<Builder, ObjectBuilder<ContextMethod>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code return_type}
	 */
	public final String returnType() {
		return this.returnType;
	}

	/**
	 * Required - API name: {@code params}
	 */
	public final List<ContextMethodParam> params() {
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

		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartArray();
			for (ContextMethodParam item0 : this.params) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ContextMethod}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ContextMethod> {
		private String name;

		private String returnType;

		private List<ContextMethodParam> params;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code return_type}
		 */
		public final Builder returnType(String value) {
			this.returnType = value;
			return this;
		}

		/**
		 * Required - API name: {@code params}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>params</code>.
		 */
		public final Builder params(List<ContextMethodParam> list) {
			this.params = _listAddAll(this.params, list);
			return this;
		}

		/**
		 * Required - API name: {@code params}
		 * <p>
		 * Adds one or more values to <code>params</code>.
		 */
		public final Builder params(ContextMethodParam value, ContextMethodParam... values) {
			this.params = _listAdd(this.params, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code params}
		 * <p>
		 * Adds a value to <code>params</code> using a builder lambda.
		 */
		public final Builder params(Function<ContextMethodParam.Builder, ObjectBuilder<ContextMethodParam>> fn) {
			return params(fn.apply(new ContextMethodParam.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ContextMethod}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ContextMethod build() {
			_checkSingleUse();

			return new ContextMethod(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ContextMethod}
	 */
	public static final JsonpDeserializer<ContextMethod> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ContextMethod::setupContextMethodDeserializer);

	protected static void setupContextMethodDeserializer(ObjectDeserializer<ContextMethod.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::returnType, JsonpDeserializer.stringDeserializer(), "return_type");
		op.add(Builder::params, JsonpDeserializer.arrayDeserializer(ContextMethodParam._DESERIALIZER), "params");

	}

}
