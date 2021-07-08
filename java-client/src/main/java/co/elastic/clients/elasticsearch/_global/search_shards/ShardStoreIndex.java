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

package co.elastic.clients.elasticsearch._global.search_shards;

import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search_shards.ShardStoreIndex
public final class ShardStoreIndex implements ToJsonp {
	@Nullable
	private final List<String> aliases;

	@Nullable
	private final QueryContainer filter;

	// ---------------------------------------------------------------------------------------------

	protected ShardStoreIndex(Builder builder) {

		this.aliases = builder.aliases;
		this.filter = builder.filter;

	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public List<String> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public QueryContainer filter() {
		return this.filter;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartArray();
			for (String item0 : this.aliases) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStoreIndex}.
	 */
	public static class Builder implements ObjectBuilder<ShardStoreIndex> {
		@Nullable
		private List<String> aliases;

		@Nullable
		private QueryContainer filter;

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(@Nullable List<String> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(String... value) {
			this.aliases = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #aliases(List)}, creating the list if needed.
		 */
		public Builder addAliases(String value) {
			if (this.aliases == null) {
				this.aliases = new ArrayList<>();
			}
			this.aliases.add(value);
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable QueryContainer value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * Builds a {@link ShardStoreIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStoreIndex build() {

			return new ShardStoreIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardStoreIndex
	 */
	public static final JsonpDeserializer<ShardStoreIndex> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardStoreIndex::setupShardStoreIndexDeserializer);

	protected static void setupShardStoreIndexDeserializer(DelegatingDeserializer<ShardStoreIndex.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"aliases");
		op.add(Builder::filter, QueryContainer.DESERIALIZER, "filter");

	}

}
