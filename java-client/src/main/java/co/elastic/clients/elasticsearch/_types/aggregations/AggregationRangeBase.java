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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
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

// typedef: _types.aggregations.AggregationRangeBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.AggregationRangeBase">API
 *      specification</a>
 */

public abstract class AggregationRangeBase<T> implements JsonpSerializable {
	@Nullable
	private final T from;

	@Nullable
	private final String key;

	@Nullable
	private final T to;

	@Nullable
	private final JsonpSerializer<T> tSerializer;

	// ---------------------------------------------------------------------------------------------

	protected AggregationRangeBase(AbstractBuilder<T, ?> builder) {

		this.from = builder.from;
		this.key = builder.key;
		this.to = builder.to;
		this.tSerializer = builder.tSerializer;

	}

	/**
	 * Start of the range (inclusive).
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final T from() {
		return this.from;
	}

	/**
	 * Custom key to return the range with.
	 * <p>
	 * API name: {@code key}
	 */
	@Nullable
	public final String key() {
		return this.key;
	}

	/**
	 * End of the range (exclusive).
	 * <p>
	 * API name: {@code to}
	 */
	@Nullable
	public final T to() {
		return this.to;
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

		if (this.from != null) {
			generator.writeKey("from");
			JsonpUtils.serialize(this.from, generator, tSerializer, mapper);

		}
		if (this.key != null) {
			generator.writeKey("key");
			generator.write(this.key);

		}
		if (this.to != null) {
			generator.writeKey("to");
			JsonpUtils.serialize(this.to, generator, tSerializer, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<T, BuilderT extends AbstractBuilder<T, BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private T from;

		@Nullable
		private String key;

		@Nullable
		private T to;

		@Nullable
		private JsonpSerializer<T> tSerializer;

		/**
		 * Start of the range (inclusive).
		 * <p>
		 * API name: {@code from}
		 */
		public final BuilderT from(@Nullable T value) {
			this.from = value;
			return self();
		}

		/**
		 * Custom key to return the range with.
		 * <p>
		 * API name: {@code key}
		 */
		public final BuilderT key(@Nullable String value) {
			this.key = value;
			return self();
		}

		/**
		 * End of the range (exclusive).
		 * <p>
		 * API name: {@code to}
		 */
		public final BuilderT to(@Nullable T value) {
			this.to = value;
			return self();
		}

		/**
		 * Serializer for T. If not set, an attempt will be made to find a serializer
		 * from the JSON context.
		 */
		public final BuilderT tSerializer(@Nullable JsonpSerializer<T> value) {
			this.tSerializer = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <T, BuilderT extends AbstractBuilder<T, BuilderT>> void setupAggregationRangeBaseDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<T> tDeserializer) {

		op.add(AbstractBuilder::from, tDeserializer, "from");
		op.add(AbstractBuilder::key, JsonpDeserializer.stringDeserializer(), "key");
		op.add(AbstractBuilder::to, tDeserializer, "to");

	}

}
