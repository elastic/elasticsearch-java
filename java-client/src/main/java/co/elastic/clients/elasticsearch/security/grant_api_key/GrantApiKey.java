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

package co.elastic.clients.elasticsearch.security.grant_api_key;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.grant_api_key.GrantApiKey

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.grant_api_key.GrantApiKey">API
 *      specification</a>
 */
@JsonpDeserializable
public class GrantApiKey implements JsonpSerializable {
	private final String name;

	@Nullable
	private final Time expiration;

	private final List<Map<String, JsonData>> roleDescriptors;

	// ---------------------------------------------------------------------------------------------

	private GrantApiKey(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.expiration = builder.expiration;
		this.roleDescriptors = ApiTypeHelper.unmodifiable(builder.roleDescriptors);

	}

	public static GrantApiKey of(Function<Builder, ObjectBuilder<GrantApiKey>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Time expiration() {
		return this.expiration;
	}

	/**
	 * API name: {@code role_descriptors}
	 */
	public final List<Map<String, JsonData>> roleDescriptors() {
		return this.roleDescriptors;
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

		if (this.expiration != null) {
			generator.writeKey("expiration");
			this.expiration.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.roleDescriptors)) {
			generator.writeKey("role_descriptors");
			generator.writeStartArray();
			for (Map<String, JsonData> item0 : this.roleDescriptors) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, JsonData> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

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
	 * Builder for {@link GrantApiKey}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GrantApiKey> {
		private String name;

		@Nullable
		private Time expiration;

		@Nullable
		private List<Map<String, JsonData>> roleDescriptors;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Time value) {
			this.expiration = value;
			return this;
		}

		/**
		 * API name: {@code expiration}
		 */
		public final Builder expiration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.expiration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code role_descriptors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roleDescriptors</code>.
		 */
		public final Builder roleDescriptors(List<Map<String, JsonData>> list) {
			this.roleDescriptors = _listAddAll(this.roleDescriptors, list);
			return this;
		}

		/**
		 * API name: {@code role_descriptors}
		 * <p>
		 * Adds one or more values to <code>roleDescriptors</code>.
		 */
		public final Builder roleDescriptors(Map<String, JsonData> value, Map<String, JsonData>... values) {
			this.roleDescriptors = _listAdd(this.roleDescriptors, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GrantApiKey}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GrantApiKey build() {
			_checkSingleUse();

			return new GrantApiKey(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GrantApiKey}
	 */
	public static final JsonpDeserializer<GrantApiKey> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GrantApiKey::setupGrantApiKeyDeserializer);

	protected static void setupGrantApiKeyDeserializer(ObjectDeserializer<GrantApiKey.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::expiration, Time._DESERIALIZER, "expiration");
		op.add(Builder::roleDescriptors,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER)),
				"role_descriptors");

	}

}
