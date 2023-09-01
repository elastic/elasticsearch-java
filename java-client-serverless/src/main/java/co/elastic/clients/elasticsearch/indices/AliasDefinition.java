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

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.AliasDefinition

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.AliasDefinition">API
 *      specification</a>
 */
@JsonpDeserializable
public class AliasDefinition implements JsonpSerializable {
	@Nullable
	private final Query filter;

	@Nullable
	private final String indexRouting;

	@Nullable
	private final Boolean isWriteIndex;

	@Nullable
	private final String routing;

	@Nullable
	private final String searchRouting;

	@Nullable
	private final Boolean isHidden;

	// ---------------------------------------------------------------------------------------------

	private AliasDefinition(Builder builder) {

		this.filter = builder.filter;
		this.indexRouting = builder.indexRouting;
		this.isWriteIndex = builder.isWriteIndex;
		this.routing = builder.routing;
		this.searchRouting = builder.searchRouting;
		this.isHidden = builder.isHidden;

	}

	public static AliasDefinition of(Function<Builder, ObjectBuilder<AliasDefinition>> fn) {
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
	@Nullable
	public final String indexRouting() {
		return this.indexRouting;
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
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Value used to route search operations to a specific shard. If specified, this
	 * overwrites the <code>routing</code> value for search operations.
	 * <p>
	 * API name: {@code search_routing}
	 */
	@Nullable
	public final String searchRouting() {
		return this.searchRouting;
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
		if (this.indexRouting != null) {
			generator.writeKey("index_routing");
			generator.write(this.indexRouting);

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
		if (this.isHidden != null) {
			generator.writeKey("is_hidden");
			generator.write(this.isHidden);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AliasDefinition}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AliasDefinition> {
		@Nullable
		private Query filter;

		@Nullable
		private String indexRouting;

		@Nullable
		private Boolean isWriteIndex;

		@Nullable
		private String routing;

		@Nullable
		private String searchRouting;

		@Nullable
		private Boolean isHidden;

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
		 * Value used to route indexing operations to a specific shard. If specified,
		 * this overwrites the <code>routing</code> value for indexing operations.
		 * <p>
		 * API name: {@code index_routing}
		 */
		public final Builder indexRouting(@Nullable String value) {
			this.indexRouting = value;
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
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Value used to route search operations to a specific shard. If specified, this
		 * overwrites the <code>routing</code> value for search operations.
		 * <p>
		 * API name: {@code search_routing}
		 */
		public final Builder searchRouting(@Nullable String value) {
			this.searchRouting = value;
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AliasDefinition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AliasDefinition build() {
			_checkSingleUse();

			return new AliasDefinition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AliasDefinition}
	 */
	public static final JsonpDeserializer<AliasDefinition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AliasDefinition::setupAliasDefinitionDeserializer);

	protected static void setupAliasDefinitionDeserializer(ObjectDeserializer<AliasDefinition.Builder> op) {

		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::indexRouting, JsonpDeserializer.stringDeserializer(), "index_routing");
		op.add(Builder::isWriteIndex, JsonpDeserializer.booleanDeserializer(), "is_write_index");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::searchRouting, JsonpDeserializer.stringDeserializer(), "search_routing");
		op.add(Builder::isHidden, JsonpDeserializer.booleanDeserializer(), "is_hidden");

	}

}
