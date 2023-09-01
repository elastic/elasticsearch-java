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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.EwmaModelSettings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.EwmaModelSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class EwmaModelSettings implements JsonpSerializable {
	@Nullable
	private final Float alpha;

	// ---------------------------------------------------------------------------------------------

	private EwmaModelSettings(Builder builder) {

		this.alpha = builder.alpha;

	}

	public static EwmaModelSettings of(Function<Builder, ObjectBuilder<EwmaModelSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code alpha}
	 */
	@Nullable
	public final Float alpha() {
		return this.alpha;
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

		if (this.alpha != null) {
			generator.writeKey("alpha");
			generator.write(this.alpha);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EwmaModelSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EwmaModelSettings> {
		@Nullable
		private Float alpha;

		/**
		 * API name: {@code alpha}
		 */
		public final Builder alpha(@Nullable Float value) {
			this.alpha = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EwmaModelSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EwmaModelSettings build() {
			_checkSingleUse();

			return new EwmaModelSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EwmaModelSettings}
	 */
	public static final JsonpDeserializer<EwmaModelSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EwmaModelSettings::setupEwmaModelSettingsDeserializer);

	protected static void setupEwmaModelSettingsDeserializer(ObjectDeserializer<EwmaModelSettings.Builder> op) {

		op.add(Builder::alpha, JsonpDeserializer.floatDeserializer(), "alpha");

	}

}
