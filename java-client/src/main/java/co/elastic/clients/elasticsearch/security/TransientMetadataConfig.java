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

package co.elastic.clients.elasticsearch.security;

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

// typedef: security._types.TransientMetadataConfig

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.TransientMetadataConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransientMetadataConfig implements JsonpSerializable {
	private final boolean enabled;

	// ---------------------------------------------------------------------------------------------

	private TransientMetadataConfig(Builder builder) {

		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled");

	}

	public static TransientMetadataConfig of(Function<Builder, ObjectBuilder<TransientMetadataConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
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

		generator.writeKey("enabled");
		generator.write(this.enabled);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransientMetadataConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TransientMetadataConfig> {
		private Boolean enabled;

		/**
		 * Required - API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransientMetadataConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransientMetadataConfig build() {
			_checkSingleUse();

			return new TransientMetadataConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransientMetadataConfig}
	 */
	public static final JsonpDeserializer<TransientMetadataConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransientMetadataConfig::setupTransientMetadataConfigDeserializer);

	protected static void setupTransientMetadataConfigDeserializer(
			ObjectDeserializer<TransientMetadataConfig.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
