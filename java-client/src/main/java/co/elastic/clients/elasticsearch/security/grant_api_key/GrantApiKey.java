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
import co.elastic.clients.elasticsearch.security.RoleDescriptor;
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

	private final List<Map<String, RoleDescriptor>> roleDescriptors;

	private final Map<String, JsonData> metadata;

	// ---------------------------------------------------------------------------------------------

	private GrantApiKey(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.expiration = builder.expiration;
		this.roleDescriptors = ApiTypeHelper.unmodifiable(builder.roleDescriptors);
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);

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
	 * Expiration time for the API key. By default, API keys never expire.
	 * <p>
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Time expiration() {
		return this.expiration;
	}

	/**
	 * The role descriptors for this API key. This parameter is optional. When it is
	 * not specified or is an empty array, the API key has a point in time snapshot
	 * of permissions of the specified user or access token. If you supply role
	 * descriptors, the resultant permissions are an intersection of API keys
	 * permissions and the permissions of the user or access token.
	 * <p>
	 * API name: {@code role_descriptors}
	 */
	public final List<Map<String, RoleDescriptor>> roleDescriptors() {
		return this.roleDescriptors;
	}

	/**
	 * Arbitrary metadata that you want to associate with the API key. It supports
	 * nested data structure. Within the <code>metadata</code> object, keys
	 * beginning with <code>_</code> are reserved for system usage.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
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
			for (Map<String, RoleDescriptor> item0 : this.roleDescriptors) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, RoleDescriptor> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
		private List<Map<String, RoleDescriptor>> roleDescriptors;

		@Nullable
		private Map<String, JsonData> metadata;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Expiration time for the API key. By default, API keys never expire.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Time value) {
			this.expiration = value;
			return this;
		}

		/**
		 * Expiration time for the API key. By default, API keys never expire.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.expiration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The role descriptors for this API key. This parameter is optional. When it is
		 * not specified or is an empty array, the API key has a point in time snapshot
		 * of permissions of the specified user or access token. If you supply role
		 * descriptors, the resultant permissions are an intersection of API keys
		 * permissions and the permissions of the user or access token.
		 * <p>
		 * API name: {@code role_descriptors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roleDescriptors</code>.
		 */
		public final Builder roleDescriptors(List<Map<String, RoleDescriptor>> list) {
			this.roleDescriptors = _listAddAll(this.roleDescriptors, list);
			return this;
		}

		/**
		 * The role descriptors for this API key. This parameter is optional. When it is
		 * not specified or is an empty array, the API key has a point in time snapshot
		 * of permissions of the specified user or access token. If you supply role
		 * descriptors, the resultant permissions are an intersection of API keys
		 * permissions and the permissions of the user or access token.
		 * <p>
		 * API name: {@code role_descriptors}
		 * <p>
		 * Adds one or more values to <code>roleDescriptors</code>.
		 */
		public final Builder roleDescriptors(Map<String, RoleDescriptor> value, Map<String, RoleDescriptor>... values) {
			this.roleDescriptors = _listAdd(this.roleDescriptors, value, values);
			return this;
		}

		/**
		 * Arbitrary metadata that you want to associate with the API key. It supports
		 * nested data structure. Within the <code>metadata</code> object, keys
		 * beginning with <code>_</code> are reserved for system usage.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Arbitrary metadata that you want to associate with the API key. It supports
		 * nested data structure. Within the <code>metadata</code> object, keys
		 * beginning with <code>_</code> are reserved for system usage.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
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
		op.add(Builder::roleDescriptors, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(RoleDescriptor._DESERIALIZER)), "role_descriptors");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");

	}

}
