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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.elasticsearch.ml.JobStatistics;
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
import java.lang.Long;
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

// typedef: xpack.usage.JobUsage

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.JobUsage">API
 *      specification</a>
 */
@JsonpDeserializable
public class JobUsage implements JsonpSerializable {
	private final int count;

	private final Map<String, Long> createdBy;

	private final JobStatistics detectors;

	private final MlJobForecasts forecasts;

	private final JobStatistics modelSize;

	// ---------------------------------------------------------------------------------------------

	private JobUsage(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.createdBy = ApiTypeHelper.unmodifiableRequired(builder.createdBy, this, "createdBy");
		this.detectors = ApiTypeHelper.requireNonNull(builder.detectors, this, "detectors");
		this.forecasts = ApiTypeHelper.requireNonNull(builder.forecasts, this, "forecasts");
		this.modelSize = ApiTypeHelper.requireNonNull(builder.modelSize, this, "modelSize");

	}

	public static JobUsage of(Function<Builder, ObjectBuilder<JobUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code created_by}
	 */
	public final Map<String, Long> createdBy() {
		return this.createdBy;
	}

	/**
	 * Required - API name: {@code detectors}
	 */
	public final JobStatistics detectors() {
		return this.detectors;
	}

	/**
	 * Required - API name: {@code forecasts}
	 */
	public final MlJobForecasts forecasts() {
		return this.forecasts;
	}

	/**
	 * Required - API name: {@code model_size}
	 */
	public final JobStatistics modelSize() {
		return this.modelSize;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ApiTypeHelper.isDefined(this.createdBy)) {
			generator.writeKey("created_by");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.createdBy.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("detectors");
		this.detectors.serialize(generator, mapper);

		generator.writeKey("forecasts");
		this.forecasts.serialize(generator, mapper);

		generator.writeKey("model_size");
		this.modelSize.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobUsage}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<JobUsage> {
		private Integer count;

		private Map<String, Long> createdBy;

		private JobStatistics detectors;

		private MlJobForecasts forecasts;

		private JobStatistics modelSize;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code created_by}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>createdBy</code>.
		 */
		public final Builder createdBy(Map<String, Long> map) {
			this.createdBy = _mapPutAll(this.createdBy, map);
			return this;
		}

		/**
		 * Required - API name: {@code created_by}
		 * <p>
		 * Adds an entry to <code>createdBy</code>.
		 */
		public final Builder createdBy(String key, Long value) {
			this.createdBy = _mapPut(this.createdBy, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code detectors}
		 */
		public final Builder detectors(JobStatistics value) {
			this.detectors = value;
			return this;
		}

		/**
		 * Required - API name: {@code detectors}
		 */
		public final Builder detectors(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.detectors(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code forecasts}
		 */
		public final Builder forecasts(MlJobForecasts value) {
			this.forecasts = value;
			return this;
		}

		/**
		 * Required - API name: {@code forecasts}
		 */
		public final Builder forecasts(Function<MlJobForecasts.Builder, ObjectBuilder<MlJobForecasts>> fn) {
			return this.forecasts(fn.apply(new MlJobForecasts.Builder()).build());
		}

		/**
		 * Required - API name: {@code model_size}
		 */
		public final Builder modelSize(JobStatistics value) {
			this.modelSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_size}
		 */
		public final Builder modelSize(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.modelSize(fn.apply(new JobStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JobUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobUsage build() {
			_checkSingleUse();

			return new JobUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JobUsage}
	 */
	public static final JsonpDeserializer<JobUsage> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JobUsage::setupJobUsageDeserializer);

	protected static void setupJobUsageDeserializer(ObjectDeserializer<JobUsage.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::createdBy, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"created_by");
		op.add(Builder::detectors, JobStatistics._DESERIALIZER, "detectors");
		op.add(Builder::forecasts, MlJobForecasts._DESERIALIZER, "forecasts");
		op.add(Builder::modelSize, JobStatistics._DESERIALIZER, "model_size");

	}

}
