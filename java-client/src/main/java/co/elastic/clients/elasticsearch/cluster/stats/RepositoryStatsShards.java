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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
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

// typedef: cluster.stats.RepositoryStatsShards

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.RepositoryStatsShards">API
 *      specification</a>
 */
@JsonpDeserializable
public class RepositoryStatsShards implements JsonpSerializable {
	private final int total;

	private final int complete;

	private final int incomplete;

	private final Map<String, Integer> states;

	// ---------------------------------------------------------------------------------------------

	private RepositoryStatsShards(Builder builder) {

		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total", 0);
		this.complete = ApiTypeHelper.requireNonNull(builder.complete, this, "complete", 0);
		this.incomplete = ApiTypeHelper.requireNonNull(builder.incomplete, this, "incomplete", 0);
		this.states = ApiTypeHelper.unmodifiableRequired(builder.states, this, "states");

	}

	public static RepositoryStatsShards of(Function<Builder, ObjectBuilder<RepositoryStatsShards>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final int total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code complete}
	 */
	public final int complete() {
		return this.complete;
	}

	/**
	 * Required - API name: {@code incomplete}
	 */
	public final int incomplete() {
		return this.incomplete;
	}

	/**
	 * Required - API name: {@code states}
	 */
	public final Map<String, Integer> states() {
		return this.states;
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

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("complete");
		generator.write(this.complete);

		generator.writeKey("incomplete");
		generator.write(this.incomplete);

		if (ApiTypeHelper.isDefined(this.states)) {
			generator.writeKey("states");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.states.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
	 * Builder for {@link RepositoryStatsShards}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RepositoryStatsShards> {
		private Integer total;

		private Integer complete;

		private Integer incomplete;

		private Map<String, Integer> states;

		public Builder() {
		}
		private Builder(RepositoryStatsShards instance) {
			this.total = instance.total;
			this.complete = instance.complete;
			this.incomplete = instance.incomplete;
			this.states = instance.states;

		}
		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code complete}
		 */
		public final Builder complete(int value) {
			this.complete = value;
			return this;
		}

		/**
		 * Required - API name: {@code incomplete}
		 */
		public final Builder incomplete(int value) {
			this.incomplete = value;
			return this;
		}

		/**
		 * Required - API name: {@code states}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>states</code>.
		 */
		public final Builder states(Map<String, Integer> map) {
			this.states = _mapPutAll(this.states, map);
			return this;
		}

		/**
		 * Required - API name: {@code states}
		 * <p>
		 * Adds an entry to <code>states</code>.
		 */
		public final Builder states(String key, Integer value) {
			this.states = _mapPut(this.states, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RepositoryStatsShards}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoryStatsShards build() {
			_checkSingleUse();

			return new RepositoryStatsShards(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RepositoryStatsShards}
	 */
	public static final JsonpDeserializer<RepositoryStatsShards> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RepositoryStatsShards::setupRepositoryStatsShardsDeserializer);

	protected static void setupRepositoryStatsShardsDeserializer(ObjectDeserializer<RepositoryStatsShards.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::complete, JsonpDeserializer.integerDeserializer(), "complete");
		op.add(Builder::incomplete, JsonpDeserializer.integerDeserializer(), "incomplete");
		op.add(Builder::states, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"states");

	}

}
