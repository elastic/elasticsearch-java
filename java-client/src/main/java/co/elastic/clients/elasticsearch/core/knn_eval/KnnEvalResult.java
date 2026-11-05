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

package co.elastic.clients.elasticsearch.core.knn_eval;

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
import java.lang.Double;
import java.lang.Long;
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

// typedef: _global.knn_eval.KnnEvalResult

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.knn_eval.KnnEvalResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnEvalResult implements JsonpSerializable {
	private final KnnEvalReportedSettings knnSettings;

	@Nullable
	private final Double recall;

	private final long includedQueries;

	private final long excludedQueries;

	private final long tookMs;

	private final long vectorOps;

	// ---------------------------------------------------------------------------------------------

	private KnnEvalResult(Builder builder) {

		this.knnSettings = ApiTypeHelper.requireNonNull(builder.knnSettings, this, "knnSettings");
		this.recall = builder.recall;
		this.includedQueries = ApiTypeHelper.requireNonNull(builder.includedQueries, this, "includedQueries", 0);
		this.excludedQueries = ApiTypeHelper.requireNonNull(builder.excludedQueries, this, "excludedQueries", 0);
		this.tookMs = ApiTypeHelper.requireNonNull(builder.tookMs, this, "tookMs", 0);
		this.vectorOps = ApiTypeHelper.requireNonNull(builder.vectorOps, this, "vectorOps", 0);

	}

	public static KnnEvalResult of(Function<Builder, ObjectBuilder<KnnEvalResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The evaluated settings.
	 * <p>
	 * API name: {@code knn_settings}
	 */
	public final KnnEvalReportedSettings knnSettings() {
		return this.knnSettings;
	}

	/**
	 * The mean recall of the included queries, or <code>null</code> if no query is
	 * included.
	 * <p>
	 * API name: {@code recall}
	 */
	@Nullable
	public final Double recall() {
		return this.recall;
	}

	/**
	 * Required - The number of queries included in the mean recall.
	 * <p>
	 * API name: {@code included_queries}
	 */
	public final long includedQueries() {
		return this.includedQueries;
	}

	/**
	 * Required - The number of queries excluded from the mean recall, because the
	 * search found a document scoring above the baseline's lowest top
	 * <code>k</code> score.
	 * <p>
	 * API name: {@code excluded_queries}
	 */
	public final long excludedQueries() {
		return this.excludedQueries;
	}

	/**
	 * Required - The time the searches took, in milliseconds.
	 * <p>
	 * API name: {@code took_ms}
	 */
	public final long tookMs() {
		return this.tookMs;
	}

	/**
	 * Required - The number of vector operations of the searches.
	 * <p>
	 * API name: {@code vector_ops}
	 */
	public final long vectorOps() {
		return this.vectorOps;
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

		generator.writeKey("knn_settings");
		this.knnSettings.serialize(generator, mapper);

		if (this.recall != null) {
			generator.writeKey("recall");
			generator.write(this.recall);

		}
		generator.writeKey("included_queries");
		generator.write(this.includedQueries);

		generator.writeKey("excluded_queries");
		generator.write(this.excludedQueries);

		generator.writeKey("took_ms");
		generator.write(this.tookMs);

		generator.writeKey("vector_ops");
		generator.write(this.vectorOps);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnEvalResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<KnnEvalResult> {
		private KnnEvalReportedSettings knnSettings;

		@Nullable
		private Double recall;

		private Long includedQueries;

		private Long excludedQueries;

		private Long tookMs;

		private Long vectorOps;

		public Builder() {
		}
		private Builder(KnnEvalResult instance) {
			this.knnSettings = instance.knnSettings;
			this.recall = instance.recall;
			this.includedQueries = instance.includedQueries;
			this.excludedQueries = instance.excludedQueries;
			this.tookMs = instance.tookMs;
			this.vectorOps = instance.vectorOps;

		}
		/**
		 * Required - The evaluated settings.
		 * <p>
		 * API name: {@code knn_settings}
		 */
		public final Builder knnSettings(KnnEvalReportedSettings value) {
			this.knnSettings = value;
			return this;
		}

		/**
		 * Required - The evaluated settings.
		 * <p>
		 * API name: {@code knn_settings}
		 */
		public final Builder knnSettings(
				Function<KnnEvalReportedSettings.Builder, ObjectBuilder<KnnEvalReportedSettings>> fn) {
			return this.knnSettings(fn.apply(new KnnEvalReportedSettings.Builder()).build());
		}

		/**
		 * The mean recall of the included queries, or <code>null</code> if no query is
		 * included.
		 * <p>
		 * API name: {@code recall}
		 */
		public final Builder recall(@Nullable Double value) {
			this.recall = value;
			return this;
		}

		/**
		 * Required - The number of queries included in the mean recall.
		 * <p>
		 * API name: {@code included_queries}
		 */
		public final Builder includedQueries(long value) {
			this.includedQueries = value;
			return this;
		}

		/**
		 * Required - The number of queries excluded from the mean recall, because the
		 * search found a document scoring above the baseline's lowest top
		 * <code>k</code> score.
		 * <p>
		 * API name: {@code excluded_queries}
		 */
		public final Builder excludedQueries(long value) {
			this.excludedQueries = value;
			return this;
		}

		/**
		 * Required - The time the searches took, in milliseconds.
		 * <p>
		 * API name: {@code took_ms}
		 */
		public final Builder tookMs(long value) {
			this.tookMs = value;
			return this;
		}

		/**
		 * Required - The number of vector operations of the searches.
		 * <p>
		 * API name: {@code vector_ops}
		 */
		public final Builder vectorOps(long value) {
			this.vectorOps = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnEvalResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnEvalResult build() {
			_checkSingleUse();

			return new KnnEvalResult(this);
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
	 * Json deserializer for {@link KnnEvalResult}
	 */
	public static final JsonpDeserializer<KnnEvalResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KnnEvalResult::setupKnnEvalResultDeserializer);

	protected static void setupKnnEvalResultDeserializer(ObjectDeserializer<KnnEvalResult.Builder> op) {

		op.add(Builder::knnSettings, KnnEvalReportedSettings._DESERIALIZER, "knn_settings");
		op.add(Builder::recall, JsonpDeserializer.doubleDeserializer(), "recall");
		op.add(Builder::includedQueries, JsonpDeserializer.longDeserializer(), "included_queries");
		op.add(Builder::excludedQueries, JsonpDeserializer.longDeserializer(), "excluded_queries");
		op.add(Builder::tookMs, JsonpDeserializer.longDeserializer(), "took_ms");
		op.add(Builder::vectorOps, JsonpDeserializer.longDeserializer(), "vector_ops");

	}

}
