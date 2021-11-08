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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.RealmCache
@JsonpDeserializable
public class RealmCache implements JsonpSerializable {
	private final long size;

	// ---------------------------------------------------------------------------------------------

	private RealmCache(Builder builder) {

		this.size = ModelTypeHelper.requireNonNull(builder.size, this, "size");

	}

	public static RealmCache of(Function<Builder, ObjectBuilder<RealmCache>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code size}
	 */
	public final long size() {
		return this.size;
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

		generator.writeKey("size");
		generator.write(this.size);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RealmCache}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RealmCache> {
		private Long size;

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(long value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link RealmCache}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RealmCache build() {
			_checkSingleUse();

			return new RealmCache(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RealmCache}
	 */
	public static final JsonpDeserializer<RealmCache> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RealmCache::setupRealmCacheDeserializer, Builder::build);

	protected static void setupRealmCacheDeserializer(DelegatingDeserializer<RealmCache.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.longDeserializer(), "size");

	}

}
