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

// typedef: cluster.stats.CCSUsageClusterStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.CCSUsageClusterStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class CCSUsageClusterStats implements JsonpSerializable {
	private final int total;

	private final int skipped;

	private final CCSUsageTimeValue took;

	// ---------------------------------------------------------------------------------------------

	private CCSUsageClusterStats(Builder builder) {

		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total", 0);
		this.skipped = ApiTypeHelper.requireNonNull(builder.skipped, this, "skipped", 0);
		this.took = ApiTypeHelper.requireNonNull(builder.took, this, "took");

	}

	public static CCSUsageClusterStats of(Function<Builder, ObjectBuilder<CCSUsageClusterStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The total number of successful (not skipped) cross-cluster search
	 * requests that were executed against this cluster. This may include requests
	 * where partial results were returned, but not requests in which the cluster
	 * has been skipped entirely.
	 * <p>
	 * API name: {@code total}
	 */
	public final int total() {
		return this.total;
	}

	/**
	 * Required - The total number of cross-cluster search requests for which this
	 * cluster was skipped.
	 * <p>
	 * API name: {@code skipped}
	 */
	public final int skipped() {
		return this.skipped;
	}

	/**
	 * Required - Statistics about the time taken to execute requests against this
	 * cluster.
	 * <p>
	 * API name: {@code took}
	 */
	public final CCSUsageTimeValue took() {
		return this.took;
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

		generator.writeKey("skipped");
		generator.write(this.skipped);

		generator.writeKey("took");
		this.took.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CCSUsageClusterStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CCSUsageClusterStats> {
		private Integer total;

		private Integer skipped;

		private CCSUsageTimeValue took;

		/**
		 * Required - The total number of successful (not skipped) cross-cluster search
		 * requests that were executed against this cluster. This may include requests
		 * where partial results were returned, but not requests in which the cluster
		 * has been skipped entirely.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - The total number of cross-cluster search requests for which this
		 * cluster was skipped.
		 * <p>
		 * API name: {@code skipped}
		 */
		public final Builder skipped(int value) {
			this.skipped = value;
			return this;
		}

		/**
		 * Required - Statistics about the time taken to execute requests against this
		 * cluster.
		 * <p>
		 * API name: {@code took}
		 */
		public final Builder took(CCSUsageTimeValue value) {
			this.took = value;
			return this;
		}

		/**
		 * Required - Statistics about the time taken to execute requests against this
		 * cluster.
		 * <p>
		 * API name: {@code took}
		 */
		public final Builder took(Function<CCSUsageTimeValue.Builder, ObjectBuilder<CCSUsageTimeValue>> fn) {
			return this.took(fn.apply(new CCSUsageTimeValue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CCSUsageClusterStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CCSUsageClusterStats build() {
			_checkSingleUse();

			return new CCSUsageClusterStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CCSUsageClusterStats}
	 */
	public static final JsonpDeserializer<CCSUsageClusterStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CCSUsageClusterStats::setupCCSUsageClusterStatsDeserializer);

	protected static void setupCCSUsageClusterStatsDeserializer(ObjectDeserializer<CCSUsageClusterStats.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::skipped, JsonpDeserializer.integerDeserializer(), "skipped");
		op.add(Builder::took, CCSUsageTimeValue._DESERIALIZER, "took");

	}

}
