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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.close.CloseIndexResult
@JsonpDeserializable
public class CloseIndexResult implements JsonpSerializable {
	private final boolean closed;

	private final Map<String, CloseShardResult> shards;

	// ---------------------------------------------------------------------------------------------

	private CloseIndexResult(Builder builder) {

		this.closed = ModelTypeHelper.requireNonNull(builder.closed, this, "closed");
		this.shards = ModelTypeHelper.unmodifiable(builder.shards);

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

		if (ModelTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartObject();
			for (Map.Entry<String, CloseShardResult> item0 : this.shards.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseIndexResult}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CloseIndexResult> {
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
		 */
		public final Builder shards(@Nullable Map<String, CloseShardResult> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Set {@link #shards(Map)} to a singleton map.
		 */
		public Builder shards(String key, Function<CloseShardResult.Builder, ObjectBuilder<CloseShardResult>> fn) {
			return this.shards(Collections.singletonMap(key, fn.apply(new CloseShardResult.Builder()).build()));
		}

		public final Builder shards(
				Function<MapBuilder<String, CloseShardResult, CloseShardResult.Builder>, ObjectBuilder<Map<String, CloseShardResult>>> fn) {
			return shards(fn.apply(new MapBuilder<>(CloseShardResult.Builder::new)).build());
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
			CloseIndexResult::setupCloseIndexResultDeserializer, Builder::build);

	protected static void setupCloseIndexResultDeserializer(DelegatingDeserializer<CloseIndexResult.Builder> op) {

		op.add(Builder::closed, JsonpDeserializer.booleanDeserializer(), "closed");
		op.add(Builder::shards, JsonpDeserializer.stringMapDeserializer(CloseShardResult._DESERIALIZER), "shards");

	}

}
