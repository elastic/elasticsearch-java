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

package co.elastic.clients.elasticsearch.indices.shard_stores;

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

// typedef: indices.shard_stores.ShardStoreWrapper

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.shard_stores.ShardStoreWrapper">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardStoreWrapper implements JsonpSerializable {
	private final List<ShardStore> stores;

	// ---------------------------------------------------------------------------------------------

	private ShardStoreWrapper(Builder builder) {

		this.stores = ApiTypeHelper.unmodifiableRequired(builder.stores, this, "stores");

	}

	public static ShardStoreWrapper of(Function<Builder, ObjectBuilder<ShardStoreWrapper>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code stores}
	 */
	public final List<ShardStore> stores() {
		return this.stores;
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

		if (ApiTypeHelper.isDefined(this.stores)) {
			generator.writeKey("stores");
			generator.writeStartArray();
			for (ShardStore item0 : this.stores) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link ShardStoreWrapper}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardStoreWrapper> {
		private List<ShardStore> stores;

		/**
		 * Required - API name: {@code stores}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>stores</code>.
		 */
		public final Builder stores(List<ShardStore> list) {
			this.stores = _listAddAll(this.stores, list);
			return this;
		}

		/**
		 * Required - API name: {@code stores}
		 * <p>
		 * Adds one or more values to <code>stores</code>.
		 */
		public final Builder stores(ShardStore value, ShardStore... values) {
			this.stores = _listAdd(this.stores, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code stores}
		 * <p>
		 * Adds a value to <code>stores</code> using a builder lambda.
		 */
		public final Builder stores(Function<ShardStore.Builder, ObjectBuilder<ShardStore>> fn) {
			return stores(fn.apply(new ShardStore.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardStoreWrapper}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStoreWrapper build() {
			_checkSingleUse();

			return new ShardStoreWrapper(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStoreWrapper}
	 */
	public static final JsonpDeserializer<ShardStoreWrapper> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardStoreWrapper::setupShardStoreWrapperDeserializer);

	protected static void setupShardStoreWrapperDeserializer(ObjectDeserializer<ShardStoreWrapper.Builder> op) {

		op.add(Builder::stores, JsonpDeserializer.arrayDeserializer(ShardStore._DESERIALIZER), "stores");

	}

}
