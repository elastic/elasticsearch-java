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

// typedef: cluster.stats.ClusterSnapshotStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterSnapshotStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterSnapshotStats implements JsonpSerializable {
	private final SnapshotCurrentCounts currentCounts;

	private final Map<String, PerRepositoryStats> repositories;

	// ---------------------------------------------------------------------------------------------

	private ClusterSnapshotStats(Builder builder) {

		this.currentCounts = ApiTypeHelper.requireNonNull(builder.currentCounts, this, "currentCounts");
		this.repositories = ApiTypeHelper.unmodifiableRequired(builder.repositories, this, "repositories");

	}

	public static ClusterSnapshotStats of(Function<Builder, ObjectBuilder<ClusterSnapshotStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code current_counts}
	 */
	public final SnapshotCurrentCounts currentCounts() {
		return this.currentCounts;
	}

	/**
	 * Required - API name: {@code repositories}
	 */
	public final Map<String, PerRepositoryStats> repositories() {
		return this.repositories;
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

		generator.writeKey("current_counts");
		this.currentCounts.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.repositories)) {
			generator.writeKey("repositories");
			generator.writeStartObject();
			for (Map.Entry<String, PerRepositoryStats> item0 : this.repositories.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link ClusterSnapshotStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterSnapshotStats> {
		private SnapshotCurrentCounts currentCounts;

		private Map<String, PerRepositoryStats> repositories;

		/**
		 * Required - API name: {@code current_counts}
		 */
		public final Builder currentCounts(SnapshotCurrentCounts value) {
			this.currentCounts = value;
			return this;
		}

		/**
		 * Required - API name: {@code current_counts}
		 */
		public final Builder currentCounts(
				Function<SnapshotCurrentCounts.Builder, ObjectBuilder<SnapshotCurrentCounts>> fn) {
			return this.currentCounts(fn.apply(new SnapshotCurrentCounts.Builder()).build());
		}

		/**
		 * Required - API name: {@code repositories}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>repositories</code>.
		 */
		public final Builder repositories(Map<String, PerRepositoryStats> map) {
			this.repositories = _mapPutAll(this.repositories, map);
			return this;
		}

		/**
		 * Required - API name: {@code repositories}
		 * <p>
		 * Adds an entry to <code>repositories</code>.
		 */
		public final Builder repositories(String key, PerRepositoryStats value) {
			this.repositories = _mapPut(this.repositories, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code repositories}
		 * <p>
		 * Adds an entry to <code>repositories</code> using a builder lambda.
		 */
		public final Builder repositories(String key,
				Function<PerRepositoryStats.Builder, ObjectBuilder<PerRepositoryStats>> fn) {
			return repositories(key, fn.apply(new PerRepositoryStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterSnapshotStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterSnapshotStats build() {
			_checkSingleUse();

			return new ClusterSnapshotStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterSnapshotStats}
	 */
	public static final JsonpDeserializer<ClusterSnapshotStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterSnapshotStats::setupClusterSnapshotStatsDeserializer);

	protected static void setupClusterSnapshotStatsDeserializer(ObjectDeserializer<ClusterSnapshotStats.Builder> op) {

		op.add(Builder::currentCounts, SnapshotCurrentCounts._DESERIALIZER, "current_counts");
		op.add(Builder::repositories, JsonpDeserializer.stringMapDeserializer(PerRepositoryStats._DESERIALIZER),
				"repositories");

	}

}
