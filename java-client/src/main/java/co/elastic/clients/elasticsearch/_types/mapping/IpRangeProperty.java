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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.mapping.IpRangeProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.IpRangeProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class IpRangeProperty extends RangePropertyBase implements PropertyVariant {
	// ---------------------------------------------------------------------------------------------

	private IpRangeProperty(Builder builder) {
		super(builder);

	}

	public static IpRangeProperty of(Function<Builder, ObjectBuilder<IpRangeProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.IpRange;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "ip_range");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IpRangeProperty}.
	 */

	public static class Builder extends RangePropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IpRangeProperty> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IpRangeProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpRangeProperty build() {
			_checkSingleUse();

			return new IpRangeProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IpRangeProperty}
	 */
	public static final JsonpDeserializer<IpRangeProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IpRangeProperty::setupIpRangePropertyDeserializer);

	protected static void setupIpRangePropertyDeserializer(ObjectDeserializer<IpRangeProperty.Builder> op) {
		RangePropertyBase.setupRangePropertyBaseDeserializer(op);

		op.ignore("type");
	}

}
