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

// typedef: _global.search_shards.ShardStoreIndex

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search_shards.ShardStoreIndex">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardStoreIndex implements JsonpSerializable {
	private final List<String> aliases;

	@Nullable
	private final Query filter;

	// ---------------------------------------------------------------------------------------------

	private ShardStoreIndex(Builder builder) {

		this.aliases = ApiTypeHelper.unmodifiable(builder.aliases);
		this.filter = builder.filter;

	}

	public static ShardStoreIndex of(Function<Builder, ObjectBuilder<ShardStoreIndex>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code aliases}
	 */
	public final List<String> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStoreIndex}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardStoreIndex> {
		@Nullable
		private List<String> aliases;

		@Nullable
		private Query filter;

		/**
		 * API name: {@code aliases}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>aliases</code>.
		 */
		public final Builder aliases(List<String> list) {
			this.aliases = _listAddAll(this.aliases, list);
			return this;
		}

		/**
		 * API name: {@code aliases}
		 * <p>
		 * Adds one or more values to <code>aliases</code>.
		 */
		public final Builder aliases(String value, String... values) {
			this.aliases = _listAdd(this.aliases, value, values);
			return this;
		}

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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardStoreIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStoreIndex build() {
			_checkSingleUse();

			return new ShardStoreIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStoreIndex}
	 */
	public static final JsonpDeserializer<ShardStoreIndex> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardStoreIndex::setupShardStoreIndexDeserializer);

	protected static void setupShardStoreIndexDeserializer(ObjectDeserializer<ShardStoreIndex.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"aliases");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");

	}

}
