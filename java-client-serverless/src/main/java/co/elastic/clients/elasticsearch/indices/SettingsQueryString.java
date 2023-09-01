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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices._types.SettingsQueryString

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsQueryString">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsQueryString implements JsonpSerializable {
	private final boolean lenient;

	// ---------------------------------------------------------------------------------------------

	private SettingsQueryString(Builder builder) {

		this.lenient = ApiTypeHelper.requireNonNull(builder.lenient, this, "lenient");

	}

	public static SettingsQueryString of(Function<Builder, ObjectBuilder<SettingsQueryString>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code lenient}
	 */
	public final boolean lenient() {
		return this.lenient;
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

		generator.writeKey("lenient");
		generator.write(this.lenient);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsQueryString}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsQueryString> {
		private Boolean lenient;

		/**
		 * Required - API name: {@code lenient}
		 */
		public final Builder lenient(boolean value) {
			this.lenient = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsQueryString}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsQueryString build() {
			_checkSingleUse();

			return new SettingsQueryString(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsQueryString}
	 */
	public static final JsonpDeserializer<SettingsQueryString> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsQueryString::setupSettingsQueryStringDeserializer);

	protected static void setupSettingsQueryStringDeserializer(ObjectDeserializer<SettingsQueryString.Builder> op) {

		op.add(Builder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");

	}

}
