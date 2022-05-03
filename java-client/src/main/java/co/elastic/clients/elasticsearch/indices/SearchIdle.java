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

import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: indices._types.SearchIdle

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.SearchIdle">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchIdle implements JsonpSerializable {
	@Nullable
	private final Time after;

	// ---------------------------------------------------------------------------------------------

	private SearchIdle(Builder builder) {

		this.after = builder.after;

	}

	public static SearchIdle of(Function<Builder, ObjectBuilder<SearchIdle>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code after}
	 */
	@Nullable
	public final Time after() {
		return this.after;
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

		if (this.after != null) {
			generator.writeKey("after");
			this.after.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchIdle}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SearchIdle> {
		@Nullable
		private Time after;

		/**
		 * API name: {@code after}
		 */
		public final Builder after(@Nullable Time value) {
			this.after = value;
			return this;
		}

		/**
		 * API name: {@code after}
		 */
		public final Builder after(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.after(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchIdle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchIdle build() {
			_checkSingleUse();

			return new SearchIdle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchIdle}
	 */
	public static final JsonpDeserializer<SearchIdle> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchIdle::setupSearchIdleDeserializer);

	protected static void setupSearchIdleDeserializer(ObjectDeserializer<SearchIdle.Builder> op) {

		op.add(Builder::after, Time._DESERIALIZER, "after");

	}

}
