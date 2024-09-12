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

package co.elastic.clients.elasticsearch.core.search_shards;

import co.elastic.clients.elasticsearch._types.NodeRole;
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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
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

// typedef: _global.search_shards.SearchShardsNodeAttributes

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search_shards.SearchShardsNodeAttributes">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchShardsNodeAttributes implements JsonpSerializable {
	private final String name;

	private final String ephemeralId;

	private final String transportAddress;

	private final String externalId;

	private final Map<String, String> attributes;

	private final List<NodeRole> roles;

	private final String version;

	private final int minIndexVersion;

	private final int maxIndexVersion;

	// ---------------------------------------------------------------------------------------------

	private SearchShardsNodeAttributes(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.ephemeralId = ApiTypeHelper.requireNonNull(builder.ephemeralId, this, "ephemeralId");
		this.transportAddress = ApiTypeHelper.requireNonNull(builder.transportAddress, this, "transportAddress");
		this.externalId = ApiTypeHelper.requireNonNull(builder.externalId, this, "externalId");
		this.attributes = ApiTypeHelper.unmodifiableRequired(builder.attributes, this, "attributes");
		this.roles = ApiTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.minIndexVersion = ApiTypeHelper.requireNonNull(builder.minIndexVersion, this, "minIndexVersion");
		this.maxIndexVersion = ApiTypeHelper.requireNonNull(builder.maxIndexVersion, this, "maxIndexVersion");

	}

	public static SearchShardsNodeAttributes of(Function<Builder, ObjectBuilder<SearchShardsNodeAttributes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The human-readable identifier of the node.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The ephemeral ID of the node.
	 * <p>
	 * API name: {@code ephemeral_id}
	 */
	public final String ephemeralId() {
		return this.ephemeralId;
	}

	/**
	 * Required - The host and port where transport HTTP connections are accepted.
	 * <p>
	 * API name: {@code transport_address}
	 */
	public final String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * Required - API name: {@code external_id}
	 */
	public final String externalId() {
		return this.externalId;
	}

	/**
	 * Required - Lists node attributes.
	 * <p>
	 * API name: {@code attributes}
	 */
	public final Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * Required - API name: {@code roles}
	 */
	public final List<NodeRole> roles() {
		return this.roles;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final String version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code min_index_version}
	 */
	public final int minIndexVersion() {
		return this.minIndexVersion;
	}

	/**
	 * Required - API name: {@code max_index_version}
	 */
	public final int maxIndexVersion() {
		return this.maxIndexVersion;
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

		generator.writeKey("ephemeral_id");
		generator.write(this.ephemeralId);

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

		generator.writeKey("external_id");
		generator.write(this.externalId);

		if (ApiTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (NodeRole item0 : this.roles) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("min_index_version");
		generator.write(this.minIndexVersion);

		generator.writeKey("max_index_version");
		generator.write(this.maxIndexVersion);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchShardsNodeAttributes}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SearchShardsNodeAttributes> {
		private String name;

		private String ephemeralId;

		private String transportAddress;

		private String externalId;

		private Map<String, String> attributes;

		private List<NodeRole> roles;

		private String version;

		private Integer minIndexVersion;

		private Integer maxIndexVersion;

		/**
		 * Required - The human-readable identifier of the node.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The ephemeral ID of the node.
		 * <p>
		 * API name: {@code ephemeral_id}
		 */
		public final Builder ephemeralId(String value) {
			this.ephemeralId = value;
			return this;
		}

		/**
		 * Required - The host and port where transport HTTP connections are accepted.
		 * <p>
		 * API name: {@code transport_address}
		 */
		public final Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * Required - API name: {@code external_id}
		 */
		public final Builder externalId(String value) {
			this.externalId = value;
			return this;
		}

		/**
		 * Required - Lists node attributes.
		 * <p>
		 * API name: {@code attributes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>attributes</code>.
		 */
		public final Builder attributes(Map<String, String> map) {
			this.attributes = _mapPutAll(this.attributes, map);
			return this;
		}

		/**
		 * Required - Lists node attributes.
		 * <p>
		 * API name: {@code attributes}
		 * <p>
		 * Adds an entry to <code>attributes</code>.
		 */
		public final Builder attributes(String key, String value) {
			this.attributes = _mapPut(this.attributes, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final Builder roles(List<NodeRole> list) {
			this.roles = _listAddAll(this.roles, list);
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final Builder roles(NodeRole value, NodeRole... values) {
			this.roles = _listAdd(this.roles, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code min_index_version}
		 */
		public final Builder minIndexVersion(int value) {
			this.minIndexVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_index_version}
		 */
		public final Builder maxIndexVersion(int value) {
			this.maxIndexVersion = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchShardsNodeAttributes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchShardsNodeAttributes build() {
			_checkSingleUse();

			return new SearchShardsNodeAttributes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchShardsNodeAttributes}
	 */
	public static final JsonpDeserializer<SearchShardsNodeAttributes> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchShardsNodeAttributes::setupSearchShardsNodeAttributesDeserializer);

	protected static void setupSearchShardsNodeAttributesDeserializer(
			ObjectDeserializer<SearchShardsNodeAttributes.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::ephemeralId, JsonpDeserializer.stringDeserializer(), "ephemeral_id");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");
		op.add(Builder::externalId, JsonpDeserializer.stringDeserializer(), "external_id");
		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(NodeRole._DESERIALIZER), "roles");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::minIndexVersion, JsonpDeserializer.integerDeserializer(), "min_index_version");
		op.add(Builder::maxIndexVersion, JsonpDeserializer.integerDeserializer(), "max_index_version");

	}

}
