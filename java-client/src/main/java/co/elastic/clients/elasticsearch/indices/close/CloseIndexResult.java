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

package co.elastic.clients.elasticsearch.indices.close;

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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.close.CloseIndexResult

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.close.CloseIndexResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class CloseIndexResult implements JsonpSerializable {
	private final boolean closed;

	private final Map<String, CloseShardResult> shards;

	// ---------------------------------------------------------------------------------------------

	private CloseIndexResult(Builder builder) {

		this.closed = ApiTypeHelper.requireNonNull(builder.closed, this, "closed");
		this.shards = ApiTypeHelper.unmodifiable(builder.shards);

	}

	public static CloseIndexResult of(Function<Builder, ObjectBuilder<CloseIndexResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code closed}
	 */
	public final boolean closed() {
		return this.closed;
	}

	/**
	 * API name: {@code shards}
	 */
	public final Map<String, CloseShardResult> shards() {
		return this.shards;
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

		generator.writeKey("closed");
		generator.write(this.closed);

		if (ApiTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartObject();
			for (Map.Entry<String, CloseShardResult> item0 : this.shards.entrySet()) {
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
	 * Builder for {@link CloseIndexResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CloseIndexResult> {
		private Boolean closed;

		@Nullable
		private Map<String, CloseShardResult> shards;

		/**
		 * Required - API name: {@code closed}
		 */
		public final Builder closed(boolean value) {
			this.closed = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>shards</code>.
		 */
		public final Builder shards(Map<String, CloseShardResult> map) {
			this.shards = _mapPutAll(this.shards, map);
			return this;
		}

		/**
		 * API name: {@code shards}
		 * <p>
		 * Adds an entry to <code>shards</code>.
		 */
		public final Builder shards(String key, CloseShardResult value) {
			this.shards = _mapPut(this.shards, key, value);
			return this;
		}

		/**
		 * API name: {@code shards}
		 * <p>
		 * Adds an entry to <code>shards</code> using a builder lambda.
		 */
		public final Builder shards(String key,
				Function<CloseShardResult.Builder, ObjectBuilder<CloseShardResult>> fn) {
			return shards(key, fn.apply(new CloseShardResult.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CloseIndexResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseIndexResult build() {
			_checkSingleUse();

			return new CloseIndexResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CloseIndexResult}
	 */
	public static final JsonpDeserializer<CloseIndexResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CloseIndexResult::setupCloseIndexResultDeserializer);

	protected static void setupCloseIndexResultDeserializer(ObjectDeserializer<CloseIndexResult.Builder> op) {

		op.add(Builder::closed, JsonpDeserializer.booleanDeserializer(), "closed");
		op.add(Builder::shards, JsonpDeserializer.stringMapDeserializer(CloseShardResult._DESERIALIZER), "shards");

	}

}
