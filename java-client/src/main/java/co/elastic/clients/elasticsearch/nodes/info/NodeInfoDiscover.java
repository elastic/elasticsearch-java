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

package co.elastic.clients.elasticsearch.nodes.info;

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
import java.util.HashMap;
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

// typedef: nodes.info.NodeInfoDiscover

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.info.NodeInfoDiscover">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoDiscover implements JsonpSerializable {
	private final Map<String, JsonData> settings;

	private final List<String> seedHosts;

	@Nullable
	private final String type;

	private final List<String> seedProviders;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoDiscover(Builder builder) {

		this.settings = ApiTypeHelper.unmodifiable(builder.settings);

		this.seedHosts = ApiTypeHelper.unmodifiable(builder.seedHosts);
		this.type = builder.type;
		this.seedProviders = ApiTypeHelper.unmodifiable(builder.seedProviders);

	}

	public static NodeInfoDiscover of(Function<Builder, ObjectBuilder<NodeInfoDiscover>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Additional or alternative settings
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * API name: {@code seed_hosts}
	 */
	public final List<String> seedHosts() {
		return this.seedHosts;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code seed_providers}
	 */
	public final List<String> seedProviders() {
		return this.seedProviders;
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

		for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}

		if (ApiTypeHelper.isDefined(this.seedHosts)) {
			generator.writeKey("seed_hosts");
			generator.writeStartArray();
			for (String item0 : this.seedHosts) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

		}
		if (ApiTypeHelper.isDefined(this.seedProviders)) {
			generator.writeKey("seed_providers");
			generator.writeStartArray();
			for (String item0 : this.seedProviders) {
				generator.write(item0);

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
	 * Builder for {@link NodeInfoDiscover}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeInfoDiscover> {
		@Nullable
		private Map<String, JsonData> settings = new HashMap<>();

		/**
		 * Additional or alternative settings
		 * <p>
		 * Adds all entries of <code>map</code> to <code>settings</code>.
		 */
		public final Builder settings(Map<String, JsonData> map) {
			this.settings = _mapPutAll(this.settings, map);
			return this;
		}

		/**
		 * Additional or alternative settings
		 * <p>
		 * Adds an entry to <code>settings</code>.
		 */
		public final Builder settings(String key, JsonData value) {
			this.settings = _mapPut(this.settings, key, value);
			return this;
		}

		@Nullable
		private List<String> seedHosts;

		@Nullable
		private String type;

		@Nullable
		private List<String> seedProviders;

		/**
		 * API name: {@code seed_hosts}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>seedHosts</code>.
		 */
		public final Builder seedHosts(List<String> list) {
			this.seedHosts = _listAddAll(this.seedHosts, list);
			return this;
		}

		/**
		 * API name: {@code seed_hosts}
		 * <p>
		 * Adds one or more values to <code>seedHosts</code>.
		 */
		public final Builder seedHosts(String value, String... values) {
			this.seedHosts = _listAdd(this.seedHosts, value, values);
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code seed_providers}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>seedProviders</code>.
		 */
		public final Builder seedProviders(List<String> list) {
			this.seedProviders = _listAddAll(this.seedProviders, list);
			return this;
		}

		/**
		 * API name: {@code seed_providers}
		 * <p>
		 * Adds one or more values to <code>seedProviders</code>.
		 */
		public final Builder seedProviders(String value, String... values) {
			this.seedProviders = _listAdd(this.seedProviders, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoDiscover}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoDiscover build() {
			_checkSingleUse();

			return new NodeInfoDiscover(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoDiscover}
	 */
	public static final JsonpDeserializer<NodeInfoDiscover> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoDiscover::setupNodeInfoDiscoverDeserializer);

	protected static void setupNodeInfoDiscoverDeserializer(ObjectDeserializer<NodeInfoDiscover.Builder> op) {

		op.add(Builder::seedHosts, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"seed_hosts");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::seedProviders, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"seed_providers");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.settings(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
