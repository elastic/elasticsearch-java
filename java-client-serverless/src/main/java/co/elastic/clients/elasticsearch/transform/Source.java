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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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

// typedef: transform._types.Source

/**
 *
 * @see <a href="../doc-files/api-spec.html#transform._types.Source">API
 *      specification</a>
 */
@JsonpDeserializable
public class Source implements JsonpSerializable {
	private final List<String> index;

	@Nullable
	private final Query query;

	private final Map<String, RuntimeField> runtimeMappings;

	// ---------------------------------------------------------------------------------------------

	private Source(Builder builder) {

		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.query = builder.query;
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);

	}

	public static Source of(Function<Builder, ObjectBuilder<Source>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The source indices for the transform. It can be a single index, an
	 * index pattern (for example, <code>&quot;my-index-*&quot;&quot;</code>), an
	 * array of indices (for example,
	 * <code>[&quot;my-index-000001&quot;, &quot;my-index-000002&quot;]</code>), or
	 * an array of index patterns (for example,
	 * <code>[&quot;my-index-*&quot;, &quot;my-other-index-*&quot;]</code>. For
	 * remote indices use the syntax
	 * <code>&quot;remote_name:index_name&quot;</code>. If any indices are in remote
	 * clusters then the master node and at least one transform node must have the
	 * <code>remote_cluster_client</code> node role.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * A query clause that retrieves a subset of data from the source index.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Definitions of search-time runtime fields that can be used by the transform.
	 * For search runtime fields all data nodes, including remote nodes, must be
	 * 7.12 or later.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
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

		if (ApiTypeHelper.isDefined(this.index)) {
			generator.writeKey("index");
			generator.writeStartArray();
			for (String item0 : this.index) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
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
	 * Builder for {@link Source}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Source> {
		private List<String> index;

		@Nullable
		private Query query;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		/**
		 * Required - The source indices for the transform. It can be a single index, an
		 * index pattern (for example, <code>&quot;my-index-*&quot;&quot;</code>), an
		 * array of indices (for example,
		 * <code>[&quot;my-index-000001&quot;, &quot;my-index-000002&quot;]</code>), or
		 * an array of index patterns (for example,
		 * <code>[&quot;my-index-*&quot;, &quot;my-other-index-*&quot;]</code>. For
		 * remote indices use the syntax
		 * <code>&quot;remote_name:index_name&quot;</code>. If any indices are in remote
		 * clusters then the master node and at least one transform node must have the
		 * <code>remote_cluster_client</code> node role.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - The source indices for the transform. It can be a single index, an
		 * index pattern (for example, <code>&quot;my-index-*&quot;&quot;</code>), an
		 * array of indices (for example,
		 * <code>[&quot;my-index-000001&quot;, &quot;my-index-000002&quot;]</code>), or
		 * an array of index patterns (for example,
		 * <code>[&quot;my-index-*&quot;, &quot;my-other-index-*&quot;]</code>. For
		 * remote indices use the syntax
		 * <code>&quot;remote_name:index_name&quot;</code>. If any indices are in remote
		 * clusters then the master node and at least one transform node must have the
		 * <code>remote_cluster_client</code> node role.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * A query clause that retrieves a subset of data from the source index.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * A query clause that retrieves a subset of data from the source index.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Definitions of search-time runtime fields that can be used by the transform.
		 * For search runtime fields all data nodes, including remote nodes, must be
		 * 7.12 or later.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(Map<String, RuntimeField> map) {
			this.runtimeMappings = _mapPutAll(this.runtimeMappings, map);
			return this;
		}

		/**
		 * Definitions of search-time runtime fields that can be used by the transform.
		 * For search runtime fields all data nodes, including remote nodes, must be
		 * 7.12 or later.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(String key, RuntimeField value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
		}

		/**
		 * Definitions of search-time runtime fields that can be used by the transform.
		 * For search runtime fields all data nodes, including remote nodes, must be
		 * 7.12 or later.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code> using a builder lambda.
		 */
		public final Builder runtimeMappings(String key,
				Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Source}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Source build() {
			_checkSingleUse();

			return new Source(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Source}
	 */
	public static final JsonpDeserializer<Source> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Source::setupSourceDeserializer);

	protected static void setupSourceDeserializer(ObjectDeserializer<Source.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "index");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");

	}

}
