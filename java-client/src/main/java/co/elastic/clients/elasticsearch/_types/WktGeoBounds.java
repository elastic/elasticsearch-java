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

package co.elastic.clients.elasticsearch._types;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.WktGeoBounds

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.WktGeoBounds">API
 *      specification</a>
 */
@JsonpDeserializable
public class WktGeoBounds implements JsonpSerializable {
	private final String wkt;

	// ---------------------------------------------------------------------------------------------

	private WktGeoBounds(Builder builder) {

		this.wkt = ApiTypeHelper.requireNonNull(builder.wkt, this, "wkt");

	}

	public static WktGeoBounds of(Function<Builder, ObjectBuilder<WktGeoBounds>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code wkt}
	 */
	public final String wkt() {
		return this.wkt;
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

		generator.writeKey("wkt");
		generator.write(this.wkt);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WktGeoBounds}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<WktGeoBounds> {
		private String wkt;

		/**
		 * Required - API name: {@code wkt}
		 */
		public final Builder wkt(String value) {
			this.wkt = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WktGeoBounds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WktGeoBounds build() {
			_checkSingleUse();

			return new WktGeoBounds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WktGeoBounds}
	 */
	public static final JsonpDeserializer<WktGeoBounds> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WktGeoBounds::setupWktGeoBoundsDeserializer);

	protected static void setupWktGeoBoundsDeserializer(ObjectDeserializer<WktGeoBounds.Builder> op) {

		op.add(Builder::wkt, JsonpDeserializer.stringDeserializer(), "wkt");

	}

}
