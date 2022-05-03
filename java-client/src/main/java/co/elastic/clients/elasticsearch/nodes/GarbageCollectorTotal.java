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

package co.elastic.clients.elasticsearch.nodes;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.GarbageCollectorTotal

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes._types.GarbageCollectorTotal">API
 *      specification</a>
 */
@JsonpDeserializable
public class GarbageCollectorTotal implements JsonpSerializable {
	@Nullable
	private final Long collectionCount;

	@Nullable
	private final String collectionTime;

	@Nullable
	private final Long collectionTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	private GarbageCollectorTotal(Builder builder) {

		this.collectionCount = builder.collectionCount;
		this.collectionTime = builder.collectionTime;
		this.collectionTimeInMillis = builder.collectionTimeInMillis;

	}

	public static GarbageCollectorTotal of(Function<Builder, ObjectBuilder<GarbageCollectorTotal>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code collection_count}
	 */
	@Nullable
	public final Long collectionCount() {
		return this.collectionCount;
	}

	/**
	 * API name: {@code collection_time}
	 */
	@Nullable
	public final String collectionTime() {
		return this.collectionTime;
	}

	/**
	 * API name: {@code collection_time_in_millis}
	 */
	@Nullable
	public final Long collectionTimeInMillis() {
		return this.collectionTimeInMillis;
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

		if (this.collectionCount != null) {
			generator.writeKey("collection_count");
			generator.write(this.collectionCount);

		}
		if (this.collectionTime != null) {
			generator.writeKey("collection_time");
			generator.write(this.collectionTime);

		}
		if (this.collectionTimeInMillis != null) {
			generator.writeKey("collection_time_in_millis");
			generator.write(this.collectionTimeInMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GarbageCollectorTotal}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GarbageCollectorTotal> {
		@Nullable
		private Long collectionCount;

		@Nullable
		private String collectionTime;

		@Nullable
		private Long collectionTimeInMillis;

		/**
		 * API name: {@code collection_count}
		 */
		public final Builder collectionCount(@Nullable Long value) {
			this.collectionCount = value;
			return this;
		}

		/**
		 * API name: {@code collection_time}
		 */
		public final Builder collectionTime(@Nullable String value) {
			this.collectionTime = value;
			return this;
		}

		/**
		 * API name: {@code collection_time_in_millis}
		 */
		public final Builder collectionTimeInMillis(@Nullable Long value) {
			this.collectionTimeInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GarbageCollectorTotal}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GarbageCollectorTotal build() {
			_checkSingleUse();

			return new GarbageCollectorTotal(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GarbageCollectorTotal}
	 */
	public static final JsonpDeserializer<GarbageCollectorTotal> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GarbageCollectorTotal::setupGarbageCollectorTotalDeserializer);

	protected static void setupGarbageCollectorTotalDeserializer(ObjectDeserializer<GarbageCollectorTotal.Builder> op) {

		op.add(Builder::collectionCount, JsonpDeserializer.longDeserializer(), "collection_count");
		op.add(Builder::collectionTime, JsonpDeserializer.stringDeserializer(), "collection_time");
		op.add(Builder::collectionTimeInMillis, JsonpDeserializer.longDeserializer(), "collection_time_in_millis");

	}

}
