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
import java.lang.Long;
import java.lang.String;
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

// typedef: cluster.stats.PerRepositoryStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.PerRepositoryStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class PerRepositoryStats implements JsonpSerializable {
	private final String type;

	private final long oldestStartTimeMillis;

	@Nullable
	private final String oldestStartTime;

	private final RepositoryStatsCurrentCounts currentCounts;

	// ---------------------------------------------------------------------------------------------

	private PerRepositoryStats(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.oldestStartTimeMillis = ApiTypeHelper.requireNonNull(builder.oldestStartTimeMillis, this,
				"oldestStartTimeMillis", 0);
		this.oldestStartTime = builder.oldestStartTime;
		this.currentCounts = ApiTypeHelper.requireNonNull(builder.currentCounts, this, "currentCounts");

	}

	public static PerRepositoryStats of(Function<Builder, ObjectBuilder<PerRepositoryStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code oldest_start_time_millis}
	 */
	public final long oldestStartTimeMillis() {
		return this.oldestStartTimeMillis;
	}

	/**
	 * API name: {@code oldest_start_time}
	 */
	@Nullable
	public final String oldestStartTime() {
		return this.oldestStartTime;
	}

	/**
	 * Required - API name: {@code current_counts}
	 */
	public final RepositoryStatsCurrentCounts currentCounts() {
		return this.currentCounts;
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

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("oldest_start_time_millis");
		generator.write(this.oldestStartTimeMillis);

		if (this.oldestStartTime != null) {
			generator.writeKey("oldest_start_time");
			generator.write(this.oldestStartTime);

		}
		generator.writeKey("current_counts");
		this.currentCounts.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PerRepositoryStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PerRepositoryStats> {
		private String type;

		private Long oldestStartTimeMillis;

		@Nullable
		private String oldestStartTime;

		private RepositoryStatsCurrentCounts currentCounts;

		public Builder() {
		}
		private Builder(PerRepositoryStats instance) {
			this.type = instance.type;
			this.oldestStartTimeMillis = instance.oldestStartTimeMillis;
			this.oldestStartTime = instance.oldestStartTime;
			this.currentCounts = instance.currentCounts;

		}
		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code oldest_start_time_millis}
		 */
		public final Builder oldestStartTimeMillis(long value) {
			this.oldestStartTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code oldest_start_time}
		 */
		public final Builder oldestStartTime(@Nullable String value) {
			this.oldestStartTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code current_counts}
		 */
		public final Builder currentCounts(RepositoryStatsCurrentCounts value) {
			this.currentCounts = value;
			return this;
		}

		/**
		 * Required - API name: {@code current_counts}
		 */
		public final Builder currentCounts(
				Function<RepositoryStatsCurrentCounts.Builder, ObjectBuilder<RepositoryStatsCurrentCounts>> fn) {
			return this.currentCounts(fn.apply(new RepositoryStatsCurrentCounts.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PerRepositoryStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PerRepositoryStats build() {
			_checkSingleUse();

			return new PerRepositoryStats(this);
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
	 * Json deserializer for {@link PerRepositoryStats}
	 */
	public static final JsonpDeserializer<PerRepositoryStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PerRepositoryStats::setupPerRepositoryStatsDeserializer);

	protected static void setupPerRepositoryStatsDeserializer(ObjectDeserializer<PerRepositoryStats.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::oldestStartTimeMillis, JsonpDeserializer.longDeserializer(), "oldest_start_time_millis");
		op.add(Builder::oldestStartTime, JsonpDeserializer.stringDeserializer(), "oldest_start_time");
		op.add(Builder::currentCounts, RepositoryStatsCurrentCounts._DESERIALIZER, "current_counts");

	}

}
