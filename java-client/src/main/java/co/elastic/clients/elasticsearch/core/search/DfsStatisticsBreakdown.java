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

package co.elastic.clients.elasticsearch.core.search;

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
import java.util.Objects;
import java.util.function.Function;

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

// typedef: _global.search._types.DfsStatisticsBreakdown

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.DfsStatisticsBreakdown">API
 *      specification</a>
 */
@JsonpDeserializable
public class DfsStatisticsBreakdown implements JsonpSerializable {
	private final long collectionStatistics;

	private final long collectionStatisticsCount;

	private final long createWeight;

	private final long createWeightCount;

	private final long rewrite;

	private final long rewriteCount;

	private final long termStatistics;

	private final long termStatisticsCount;

	// ---------------------------------------------------------------------------------------------

	private DfsStatisticsBreakdown(Builder builder) {

		this.collectionStatistics = ApiTypeHelper.requireNonNull(builder.collectionStatistics, this,
				"collectionStatistics");
		this.collectionStatisticsCount = ApiTypeHelper.requireNonNull(builder.collectionStatisticsCount, this,
				"collectionStatisticsCount");
		this.createWeight = ApiTypeHelper.requireNonNull(builder.createWeight, this, "createWeight");
		this.createWeightCount = ApiTypeHelper.requireNonNull(builder.createWeightCount, this, "createWeightCount");
		this.rewrite = ApiTypeHelper.requireNonNull(builder.rewrite, this, "rewrite");
		this.rewriteCount = ApiTypeHelper.requireNonNull(builder.rewriteCount, this, "rewriteCount");
		this.termStatistics = ApiTypeHelper.requireNonNull(builder.termStatistics, this, "termStatistics");
		this.termStatisticsCount = ApiTypeHelper.requireNonNull(builder.termStatisticsCount, this,
				"termStatisticsCount");

	}

	public static DfsStatisticsBreakdown of(Function<Builder, ObjectBuilder<DfsStatisticsBreakdown>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code collection_statistics}
	 */
	public final long collectionStatistics() {
		return this.collectionStatistics;
	}

	/**
	 * Required - API name: {@code collection_statistics_count}
	 */
	public final long collectionStatisticsCount() {
		return this.collectionStatisticsCount;
	}

	/**
	 * Required - API name: {@code create_weight}
	 */
	public final long createWeight() {
		return this.createWeight;
	}

	/**
	 * Required - API name: {@code create_weight_count}
	 */
	public final long createWeightCount() {
		return this.createWeightCount;
	}

	/**
	 * Required - API name: {@code rewrite}
	 */
	public final long rewrite() {
		return this.rewrite;
	}

	/**
	 * Required - API name: {@code rewrite_count}
	 */
	public final long rewriteCount() {
		return this.rewriteCount;
	}

	/**
	 * Required - API name: {@code term_statistics}
	 */
	public final long termStatistics() {
		return this.termStatistics;
	}

	/**
	 * Required - API name: {@code term_statistics_count}
	 */
	public final long termStatisticsCount() {
		return this.termStatisticsCount;
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

		generator.writeKey("collection_statistics");
		generator.write(this.collectionStatistics);

		generator.writeKey("collection_statistics_count");
		generator.write(this.collectionStatisticsCount);

		generator.writeKey("create_weight");
		generator.write(this.createWeight);

		generator.writeKey("create_weight_count");
		generator.write(this.createWeightCount);

		generator.writeKey("rewrite");
		generator.write(this.rewrite);

		generator.writeKey("rewrite_count");
		generator.write(this.rewriteCount);

		generator.writeKey("term_statistics");
		generator.write(this.termStatistics);

		generator.writeKey("term_statistics_count");
		generator.write(this.termStatisticsCount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DfsStatisticsBreakdown}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DfsStatisticsBreakdown> {
		private Long collectionStatistics;

		private Long collectionStatisticsCount;

		private Long createWeight;

		private Long createWeightCount;

		private Long rewrite;

		private Long rewriteCount;

		private Long termStatistics;

		private Long termStatisticsCount;

		/**
		 * Required - API name: {@code collection_statistics}
		 */
		public final Builder collectionStatistics(long value) {
			this.collectionStatistics = value;
			return this;
		}

		/**
		 * Required - API name: {@code collection_statistics_count}
		 */
		public final Builder collectionStatisticsCount(long value) {
			this.collectionStatisticsCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code create_weight}
		 */
		public final Builder createWeight(long value) {
			this.createWeight = value;
			return this;
		}

		/**
		 * Required - API name: {@code create_weight_count}
		 */
		public final Builder createWeightCount(long value) {
			this.createWeightCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code rewrite}
		 */
		public final Builder rewrite(long value) {
			this.rewrite = value;
			return this;
		}

		/**
		 * Required - API name: {@code rewrite_count}
		 */
		public final Builder rewriteCount(long value) {
			this.rewriteCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code term_statistics}
		 */
		public final Builder termStatistics(long value) {
			this.termStatistics = value;
			return this;
		}

		/**
		 * Required - API name: {@code term_statistics_count}
		 */
		public final Builder termStatisticsCount(long value) {
			this.termStatisticsCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DfsStatisticsBreakdown}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DfsStatisticsBreakdown build() {
			_checkSingleUse();

			return new DfsStatisticsBreakdown(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DfsStatisticsBreakdown}
	 */
	public static final JsonpDeserializer<DfsStatisticsBreakdown> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DfsStatisticsBreakdown::setupDfsStatisticsBreakdownDeserializer);

	protected static void setupDfsStatisticsBreakdownDeserializer(
			ObjectDeserializer<DfsStatisticsBreakdown.Builder> op) {

		op.add(Builder::collectionStatistics, JsonpDeserializer.longDeserializer(), "collection_statistics");
		op.add(Builder::collectionStatisticsCount, JsonpDeserializer.longDeserializer(), "collection_statistics_count");
		op.add(Builder::createWeight, JsonpDeserializer.longDeserializer(), "create_weight");
		op.add(Builder::createWeightCount, JsonpDeserializer.longDeserializer(), "create_weight_count");
		op.add(Builder::rewrite, JsonpDeserializer.longDeserializer(), "rewrite");
		op.add(Builder::rewriteCount, JsonpDeserializer.longDeserializer(), "rewrite_count");
		op.add(Builder::termStatistics, JsonpDeserializer.longDeserializer(), "term_statistics");
		op.add(Builder::termStatisticsCount, JsonpDeserializer.longDeserializer(), "term_statistics_count");

	}

}
