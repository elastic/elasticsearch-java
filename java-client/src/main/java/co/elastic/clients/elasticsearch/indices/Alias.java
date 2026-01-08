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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
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
import java.lang.String;
import java.util.List;
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

// typedef: indices._types.Alias

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.Alias">API
 *      specification</a>
 */
@JsonpDeserializable
public class Alias implements JsonpSerializable {
	@Nullable
	private final Query filter;

	private final List<String> indexRouting;

	@Nullable
	private final Boolean isHidden;

	@Nullable
	private final Boolean isWriteIndex;

	private final List<String> routing;

	private final List<String> searchRouting;

	// ---------------------------------------------------------------------------------------------

	private Alias(Builder builder) {

		this.filter = builder.filter;
		this.indexRouting = ApiTypeHelper.unmodifiable(builder.indexRouting);
		this.isHidden = builder.isHidden;
		this.isWriteIndex = builder.isWriteIndex;
		this.routing = ApiTypeHelper.unmodifiable(builder.routing);
		this.searchRouting = ApiTypeHelper.unmodifiable(builder.searchRouting);

	}

	public static Alias of(Function<Builder, ObjectBuilder<Alias>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query used to limit documents the alias can access.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
	}

	/**
	 * Value used to route indexing operations to a specific shard. If specified,
	 * this overwrites the <code>routing</code> value for indexing operations.
	 * <p>
	 * API name: {@code index_routing}
	 */
	public final List<String> indexRouting() {
		return this.indexRouting;
	}

	/**
	 * If <code>true</code>, the alias is hidden. All indices for the alias must
	 * have the same <code>is_hidden</code> value.
	 * <p>
	 * API name: {@code is_hidden}
	 */
	@Nullable
	public final Boolean isHidden() {
		return this.isHidden;
	}

	/**
	 * If <code>true</code>, the index is the write index for the alias.
	 * <p>
	 * API name: {@code is_write_index}
	 */
	@Nullable
	public final Boolean isWriteIndex() {
		return this.isWriteIndex;
	}

	/**
	 * Value used to route indexing and search operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	public final List<String> routing() {
		return this.routing;
	}

	/**
	 * Value used to route search operations to a specific shard. If specified, this
	 * overwrites the <code>routing</code> value for search operations.
	 * <p>
	 * API name: {@code search_routing}
	 */
	public final List<String> searchRouting() {
		return this.searchRouting;
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

		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.indexRouting)) {
			generator.writeKey("index_routing");
			generator.writeStartArray();
			for (String item0 : this.indexRouting) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.isHidden != null) {
			generator.writeKey("is_hidden");
			generator.write(this.isHidden);

		}
		if (this.isWriteIndex != null) {
			generator.writeKey("is_write_index");
			generator.write(this.isWriteIndex);

		}
		if (ApiTypeHelper.isDefined(this.routing)) {
			generator.writeKey("routing");
			generator.writeStartArray();
			for (String item0 : this.routing) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.searchRouting)) {
			generator.writeKey("search_routing");
			generator.writeStartArray();
			for (String item0 : this.searchRouting) {
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
	 * Builder for {@link Alias}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Alias> {
		@Nullable
		private Query filter;

		@Nullable
		private List<String> indexRouting;

		@Nullable
		private Boolean isHidden;

		@Nullable
		private Boolean isWriteIndex;

		@Nullable
		private List<String> routing;

		@Nullable
		private List<String> searchRouting;

		/**
		 * Query used to limit documents the alias can access.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * Query used to limit documents the alias can access.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Query used to limit documents the alias can access.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(QueryVariant value) {
			this.filter = value._toQuery();
			return this;
		}

		/**
		 * Value used to route indexing operations to a specific shard. If specified,
		 * this overwrites the <code>routing</code> value for indexing operations.
		 * <p>
		 * API name: {@code index_routing}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indexRouting</code>.
		 */
		public final Builder indexRouting(List<String> list) {
			this.indexRouting = _listAddAll(this.indexRouting, list);
			return this;
		}

		/**
		 * Value used to route indexing operations to a specific shard. If specified,
		 * this overwrites the <code>routing</code> value for indexing operations.
		 * <p>
		 * API name: {@code index_routing}
		 * <p>
		 * Adds one or more values to <code>indexRouting</code>.
		 */
		public final Builder indexRouting(String value, String... values) {
			this.indexRouting = _listAdd(this.indexRouting, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, the alias is hidden. All indices for the alias must
		 * have the same <code>is_hidden</code> value.
		 * <p>
		 * API name: {@code is_hidden}
		 */
		public final Builder isHidden(@Nullable Boolean value) {
			this.isHidden = value;
			return this;
		}

		/**
		 * If <code>true</code>, the index is the write index for the alias.
		 * <p>
		 * API name: {@code is_write_index}
		 */
		public final Builder isWriteIndex(@Nullable Boolean value) {
			this.isWriteIndex = value;
			return this;
		}

		/**
		 * Value used to route indexing and search operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>routing</code>.
		 */
		public final Builder routing(List<String> list) {
			this.routing = _listAddAll(this.routing, list);
			return this;
		}

		/**
		 * Value used to route indexing and search operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 * <p>
		 * Adds one or more values to <code>routing</code>.
		 */
		public final Builder routing(String value, String... values) {
			this.routing = _listAdd(this.routing, value, values);
			return this;
		}

		/**
		 * Value used to route search operations to a specific shard. If specified, this
		 * overwrites the <code>routing</code> value for search operations.
		 * <p>
		 * API name: {@code search_routing}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>searchRouting</code>.
		 */
		public final Builder searchRouting(List<String> list) {
			this.searchRouting = _listAddAll(this.searchRouting, list);
			return this;
		}

		/**
		 * Value used to route search operations to a specific shard. If specified, this
		 * overwrites the <code>routing</code> value for search operations.
		 * <p>
		 * API name: {@code search_routing}
		 * <p>
		 * Adds one or more values to <code>searchRouting</code>.
		 */
		public final Builder searchRouting(String value, String... values) {
			this.searchRouting = _listAdd(this.searchRouting, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Alias}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Alias build() {
			_checkSingleUse();

			return new Alias(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Alias}
	 */
	public static final JsonpDeserializer<Alias> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Alias::setupAliasDeserializer);

	protected static void setupAliasDeserializer(ObjectDeserializer<Alias.Builder> op) {

		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::indexRouting, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_routing");
		op.add(Builder::isHidden, JsonpDeserializer.booleanDeserializer(), "is_hidden");
		op.add(Builder::isWriteIndex, JsonpDeserializer.booleanDeserializer(), "is_write_index");
		op.add(Builder::routing, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"routing");
		op.add(Builder::searchRouting, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"search_routing");

	}

}
