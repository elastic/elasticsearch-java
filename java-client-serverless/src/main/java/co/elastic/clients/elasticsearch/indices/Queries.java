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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.Queries

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.Queries">API
 *      specification</a>
 */
@JsonpDeserializable
public class Queries implements JsonpSerializable {
	@Nullable
	private final CacheQueries cache;

	// ---------------------------------------------------------------------------------------------

	private Queries(Builder builder) {

		this.cache = builder.cache;

	}

	public static Queries of(Function<Builder, ObjectBuilder<Queries>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code cache}
	 */
	@Nullable
	public final CacheQueries cache() {
		return this.cache;
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

		if (this.cache != null) {
			generator.writeKey("cache");
			this.cache.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Queries}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Queries> {
		@Nullable
		private CacheQueries cache;

		/**
		 * API name: {@code cache}
		 */
		public final Builder cache(@Nullable CacheQueries value) {
			this.cache = value;
			return this;
		}

		/**
		 * API name: {@code cache}
		 */
		public final Builder cache(Function<CacheQueries.Builder, ObjectBuilder<CacheQueries>> fn) {
			return this.cache(fn.apply(new CacheQueries.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Queries}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Queries build() {
			_checkSingleUse();

			return new Queries(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Queries}
	 */
	public static final JsonpDeserializer<Queries> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Queries::setupQueriesDeserializer);

	protected static void setupQueriesDeserializer(ObjectDeserializer<Queries.Builder> op) {

		op.add(Builder::cache, CacheQueries._DESERIALIZER, "cache");

	}

}
