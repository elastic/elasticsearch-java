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

package co.elastic.clients.elasticsearch._types.mapping;

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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.mapping.RoutingField

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.mapping.RoutingField">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoutingField implements JsonpSerializable {
	private final boolean required;

	// ---------------------------------------------------------------------------------------------

	private RoutingField(Builder builder) {

		this.required = ApiTypeHelper.requireNonNull(builder.required, this, "required");

	}

	public static RoutingField of(Function<Builder, ObjectBuilder<RoutingField>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code required}
	 */
	public final boolean required() {
		return this.required;
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

		generator.writeKey("required");
		generator.write(this.required);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoutingField}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RoutingField> {
		private Boolean required;

		/**
		 * Required - API name: {@code required}
		 */
		public final Builder required(boolean value) {
			this.required = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RoutingField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoutingField build() {
			_checkSingleUse();

			return new RoutingField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoutingField}
	 */
	public static final JsonpDeserializer<RoutingField> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RoutingField::setupRoutingFieldDeserializer);

	protected static void setupRoutingFieldDeserializer(ObjectDeserializer<RoutingField.Builder> op) {

		op.add(Builder::required, JsonpDeserializer.booleanDeserializer(), "required");

	}

}
