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

package co.elastic.clients.elasticsearch.indices.update_aliases;

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
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.update_aliases.AddAction

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.update_aliases.AddAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class AddAction implements ActionVariant, JsonpSerializable {
	@Nullable
	private final String alias;

	private final List<String> aliases;

	@Nullable
	private final Query filter;

	@Nullable
	private final String index;

	private final List<String> indices;

	@Nullable
	private final String indexRouting;

	@Nullable
	private final Boolean isHidden;

	@Nullable
	private final Boolean isWriteIndex;

	@Nullable
	private final String routing;

	@Nullable
	private final String searchRouting;

	@Nullable
	private final Boolean mustExist;

	// ---------------------------------------------------------------------------------------------

	private AddAction(Builder builder) {

		this.alias = builder.alias;
		this.aliases = ApiTypeHelper.unmodifiable(builder.aliases);
		this.filter = builder.filter;
		this.index = builder.index;
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.indexRouting = builder.indexRouting;
		this.isHidden = builder.isHidden;
		this.isWriteIndex = builder.isWriteIndex;
		this.routing = builder.routing;
		this.searchRouting = builder.searchRouting;
		this.mustExist = builder.mustExist;

	}

	public static AddAction of(Function<Builder, ObjectBuilder<AddAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Action variant kind.
	 */
	@Override
	public Action.Kind _actionKind() {
		return Action.Kind.Add;
	}

	/**
	 * Alias for the action. Index alias names support date math.
	 * <p>
	 * API name: {@code alias}
	 */
	@Nullable
	public final String alias() {
		return this.alias;
	}

	/**
	 * Aliases for the action. Index alias names support date math.
	 * <p>
	 * API name: {@code aliases}
	 */
	public final List<String> aliases() {
		return this.aliases;
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
	 * Data stream or index for the action. Supports wildcards (<code>*</code>).
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * Data streams or indices for the action. Supports wildcards (<code>*</code>).
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * Value used to route indexing operations to a specific shard. If specified,
	 * this overwrites the <code>routing</code> value for indexing operations. Data
	 * stream aliases don’t support this parameter.
	 * <p>
	 * API name: {@code index_routing}
	 */
	@Nullable
	public final String indexRouting() {
		return this.indexRouting;
	}

	/**
	 * If <code>true</code>, the alias is hidden.
	 * <p>
	 * API name: {@code is_hidden}
	 */
	@Nullable
	public final Boolean isHidden() {
		return this.isHidden;
	}

	/**
	 * If <code>true</code>, sets the write index or data stream for the alias.
	 * <p>
	 * API name: {@code is_write_index}
	 */
	@Nullable
	public final Boolean isWriteIndex() {
		return this.isWriteIndex;
	}

	/**
	 * Value used to route indexing and search operations to a specific shard. Data
	 * stream aliases don’t support this parameter.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Value used to route search operations to a specific shard. If specified, this
	 * overwrites the <code>routing</code> value for search operations. Data stream
	 * aliases don’t support this parameter.
	 * <p>
	 * API name: {@code search_routing}
	 */
	@Nullable
	public final String searchRouting() {
		return this.searchRouting;
	}

	/**
	 * If <code>true</code>, the alias must exist to perform the action.
	 * <p>
	 * API name: {@code must_exist}
	 */
	@Nullable
	public final Boolean mustExist() {
		return this.mustExist;
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

		if (this.alias != null) {
			generator.writeKey("alias");
			generator.write(this.alias);

		}
		if (ApiTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartArray();
			for (String item0 : this.aliases) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.indexRouting != null) {
			generator.writeKey("index_routing");
			generator.write(this.indexRouting);

		}
		if (this.isHidden != null) {
			generator.writeKey("is_hidden");
			generator.write(this.isHidden);

		}
		if (this.isWriteIndex != null) {
			generator.writeKey("is_write_index");
			generator.write(this.isWriteIndex);

		}
		if (this.routing != null) {
			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.searchRouting != null) {
			generator.writeKey("search_routing");
			generator.write(this.searchRouting);

		}
		if (this.mustExist != null) {
			generator.writeKey("must_exist");
			generator.write(this.mustExist);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AddAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AddAction> {
		@Nullable
		private String alias;

		@Nullable
		private List<String> aliases;

		@Nullable
		private Query filter;

		@Nullable
		private String index;

		@Nullable
		private List<String> indices;

		@Nullable
		private String indexRouting;

		@Nullable
		private Boolean isHidden;

		@Nullable
		private Boolean isWriteIndex;

		@Nullable
		private String routing;

		@Nullable
		private String searchRouting;

		@Nullable
		private Boolean mustExist;

		/**
		 * Alias for the action. Index alias names support date math.
		 * <p>
		 * API name: {@code alias}
		 */
		public final Builder alias(@Nullable String value) {
			this.alias = value;
			return this;
		}

		/**
		 * Aliases for the action. Index alias names support date math.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>aliases</code>.
		 */
		public final Builder aliases(List<String> list) {
			this.aliases = _listAddAll(this.aliases, list);
			return this;
		}

		/**
		 * Aliases for the action. Index alias names support date math.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds one or more values to <code>aliases</code>.
		 */
		public final Builder aliases(String value, String... values) {
			this.aliases = _listAdd(this.aliases, value, values);
			return this;
		}

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
		 * Data stream or index for the action. Supports wildcards (<code>*</code>).
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Data streams or indices for the action. Supports wildcards (<code>*</code>).
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Data streams or indices for the action. Supports wildcards (<code>*</code>).
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Value used to route indexing operations to a specific shard. If specified,
		 * this overwrites the <code>routing</code> value for indexing operations. Data
		 * stream aliases don’t support this parameter.
		 * <p>
		 * API name: {@code index_routing}
		 */
		public final Builder indexRouting(@Nullable String value) {
			this.indexRouting = value;
			return this;
		}

		/**
		 * If <code>true</code>, the alias is hidden.
		 * <p>
		 * API name: {@code is_hidden}
		 */
		public final Builder isHidden(@Nullable Boolean value) {
			this.isHidden = value;
			return this;
		}

		/**
		 * If <code>true</code>, sets the write index or data stream for the alias.
		 * <p>
		 * API name: {@code is_write_index}
		 */
		public final Builder isWriteIndex(@Nullable Boolean value) {
			this.isWriteIndex = value;
			return this;
		}

		/**
		 * Value used to route indexing and search operations to a specific shard. Data
		 * stream aliases don’t support this parameter.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Value used to route search operations to a specific shard. If specified, this
		 * overwrites the <code>routing</code> value for search operations. Data stream
		 * aliases don’t support this parameter.
		 * <p>
		 * API name: {@code search_routing}
		 */
		public final Builder searchRouting(@Nullable String value) {
			this.searchRouting = value;
			return this;
		}

		/**
		 * If <code>true</code>, the alias must exist to perform the action.
		 * <p>
		 * API name: {@code must_exist}
		 */
		public final Builder mustExist(@Nullable Boolean value) {
			this.mustExist = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AddAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AddAction build() {
			_checkSingleUse();

			return new AddAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AddAction}
	 */
	public static final JsonpDeserializer<AddAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AddAction::setupAddActionDeserializer);

	protected static void setupAddActionDeserializer(ObjectDeserializer<AddAction.Builder> op) {

		op.add(Builder::alias, JsonpDeserializer.stringDeserializer(), "alias");
		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"aliases");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::indexRouting, JsonpDeserializer.stringDeserializer(), "index_routing");
		op.add(Builder::isHidden, JsonpDeserializer.booleanDeserializer(), "is_hidden");
		op.add(Builder::isWriteIndex, JsonpDeserializer.booleanDeserializer(), "is_write_index");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::searchRouting, JsonpDeserializer.stringDeserializer(), "search_routing");
		op.add(Builder::mustExist, JsonpDeserializer.booleanDeserializer(), "must_exist");

	}

}
