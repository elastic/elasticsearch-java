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

// typedef: indices._types.IndexingSlowlogTresholds

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexingSlowlogTresholds">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexingSlowlogTresholds implements JsonpSerializable {
	@Nullable
	private final SlowlogTresholdLevels index;

	// ---------------------------------------------------------------------------------------------

	private IndexingSlowlogTresholds(Builder builder) {

		this.index = builder.index;

	}

	public static IndexingSlowlogTresholds of(Function<Builder, ObjectBuilder<IndexingSlowlogTresholds>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The indexing slow log, similar in functionality to the search slow log. The
	 * log file name ends with <code>_index_indexing_slowlog.json</code>. Log and
	 * the thresholds are configured in the same way as the search slowlog.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final SlowlogTresholdLevels index() {
		return this.index;
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

		if (this.index != null) {
			generator.writeKey("index");
			this.index.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexingSlowlogTresholds}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexingSlowlogTresholds> {
		@Nullable
		private SlowlogTresholdLevels index;

		/**
		 * The indexing slow log, similar in functionality to the search slow log. The
		 * log file name ends with <code>_index_indexing_slowlog.json</code>. Log and
		 * the thresholds are configured in the same way as the search slowlog.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable SlowlogTresholdLevels value) {
			this.index = value;
			return this;
		}

		/**
		 * The indexing slow log, similar in functionality to the search slow log. The
		 * log file name ends with <code>_index_indexing_slowlog.json</code>. Log and
		 * the thresholds are configured in the same way as the search slowlog.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(Function<SlowlogTresholdLevels.Builder, ObjectBuilder<SlowlogTresholdLevels>> fn) {
			return this.index(fn.apply(new SlowlogTresholdLevels.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexingSlowlogTresholds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexingSlowlogTresholds build() {
			_checkSingleUse();

			return new IndexingSlowlogTresholds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexingSlowlogTresholds}
	 */
	public static final JsonpDeserializer<IndexingSlowlogTresholds> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexingSlowlogTresholds::setupIndexingSlowlogTresholdsDeserializer);

	protected static void setupIndexingSlowlogTresholdsDeserializer(
			ObjectDeserializer<IndexingSlowlogTresholds.Builder> op) {

		op.add(Builder::index, SlowlogTresholdLevels._DESERIALIZER, "index");

	}

}
