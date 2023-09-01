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

// typedef: indices._types.SlowlogTresholds

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.SlowlogTresholds">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlowlogTresholds implements JsonpSerializable {
	@Nullable
	private final SlowlogTresholdLevels query;

	@Nullable
	private final SlowlogTresholdLevels fetch;

	// ---------------------------------------------------------------------------------------------

	private SlowlogTresholds(Builder builder) {

		this.query = builder.query;
		this.fetch = builder.fetch;

	}

	public static SlowlogTresholds of(Function<Builder, ObjectBuilder<SlowlogTresholds>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public final SlowlogTresholdLevels query() {
		return this.query;
	}

	/**
	 * API name: {@code fetch}
	 */
	@Nullable
	public final SlowlogTresholdLevels fetch() {
		return this.fetch;
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

		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.fetch != null) {
			generator.writeKey("fetch");
			this.fetch.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlowlogTresholds}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SlowlogTresholds> {
		@Nullable
		private SlowlogTresholdLevels query;

		@Nullable
		private SlowlogTresholdLevels fetch;

		/**
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable SlowlogTresholdLevels value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public final Builder query(Function<SlowlogTresholdLevels.Builder, ObjectBuilder<SlowlogTresholdLevels>> fn) {
			return this.query(fn.apply(new SlowlogTresholdLevels.Builder()).build());
		}

		/**
		 * API name: {@code fetch}
		 */
		public final Builder fetch(@Nullable SlowlogTresholdLevels value) {
			this.fetch = value;
			return this;
		}

		/**
		 * API name: {@code fetch}
		 */
		public final Builder fetch(Function<SlowlogTresholdLevels.Builder, ObjectBuilder<SlowlogTresholdLevels>> fn) {
			return this.fetch(fn.apply(new SlowlogTresholdLevels.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlowlogTresholds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlowlogTresholds build() {
			_checkSingleUse();

			return new SlowlogTresholds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlowlogTresholds}
	 */
	public static final JsonpDeserializer<SlowlogTresholds> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SlowlogTresholds::setupSlowlogTresholdsDeserializer);

	protected static void setupSlowlogTresholdsDeserializer(ObjectDeserializer<SlowlogTresholds.Builder> op) {

		op.add(Builder::query, SlowlogTresholdLevels._DESERIALIZER, "query");
		op.add(Builder::fetch, SlowlogTresholdLevels._DESERIALIZER, "fetch");

	}

}
