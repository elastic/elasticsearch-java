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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.Alias
@JsonpDeserializable
public class Alias implements JsonpSerializable {
	@Nullable
	private final Query filter;

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

	// ---------------------------------------------------------------------------------------------

	private Alias(Builder builder) {

		this.filter = builder.filter;
		this.indexRouting = builder.indexRouting;
		this.isHidden = builder.isHidden;
		this.isWriteIndex = builder.isWriteIndex;
		this.routing = builder.routing;
		this.searchRouting = builder.searchRouting;

	}

	public static Alias of(Function<Builder, ObjectBuilder<Alias>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
	}

	/**
	 * API name: {@code index_routing}
	 */
	@Nullable
	public final String indexRouting() {
		return this.indexRouting;
	}

	/**
	 * API name: {@code is_hidden}
	 */
	@Nullable
	public final Boolean isHidden() {
		return this.isHidden;
	}

	/**
	 * API name: {@code is_write_index}
	 */
	@Nullable
	public final Boolean isWriteIndex() {
		return this.isWriteIndex;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code search_routing}
	 */
	@Nullable
	public final String searchRouting() {
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Alias}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Alias> {
		@Nullable
		private Query filter;

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

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code index_routing}
		 */
		public final Builder indexRouting(@Nullable String value) {
			this.indexRouting = value;
			return this;
		}

		/**
		 * API name: {@code is_hidden}
		 */
		public final Builder isHidden(@Nullable Boolean value) {
			this.isHidden = value;
			return this;
		}

		/**
		 * API name: {@code is_write_index}
		 */
		public final Builder isWriteIndex(@Nullable Boolean value) {
			this.isWriteIndex = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code search_routing}
		 */
		public final Builder searchRouting(@Nullable String value) {
			this.searchRouting = value;
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
			Alias::setupAliasDeserializer, Builder::build);

	protected static void setupAliasDeserializer(DelegatingDeserializer<Alias.Builder> op) {

		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::indexRouting, JsonpDeserializer.stringDeserializer(), "index_routing");
		op.add(Builder::isHidden, JsonpDeserializer.booleanDeserializer(), "is_hidden");
		op.add(Builder::isWriteIndex, JsonpDeserializer.booleanDeserializer(), "is_write_index");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::searchRouting, JsonpDeserializer.stringDeserializer(), "search_routing");

	}

}
