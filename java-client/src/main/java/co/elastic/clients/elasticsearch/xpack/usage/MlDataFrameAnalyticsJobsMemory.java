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

// typedef: xpack.usage.MlDataFrameAnalyticsJobsMemory

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.MlDataFrameAnalyticsJobsMemory">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlDataFrameAnalyticsJobsMemory implements JsonpSerializable {
	private final JobStatistics peakUsageBytes;

	// ---------------------------------------------------------------------------------------------

	private MlDataFrameAnalyticsJobsMemory(Builder builder) {

		this.peakUsageBytes = ApiTypeHelper.requireNonNull(builder.peakUsageBytes, this, "peakUsageBytes");

	}

	public static MlDataFrameAnalyticsJobsMemory of(
			Function<Builder, ObjectBuilder<MlDataFrameAnalyticsJobsMemory>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code peak_usage_bytes}
	 */
	public final JobStatistics peakUsageBytes() {
		return this.peakUsageBytes;
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

		generator.writeKey("peak_usage_bytes");
		this.peakUsageBytes.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsJobsMemory}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlDataFrameAnalyticsJobsMemory> {
		private JobStatistics peakUsageBytes;

		/**
		 * Required - API name: {@code peak_usage_bytes}
		 */
		public final Builder peakUsageBytes(JobStatistics value) {
			this.peakUsageBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code peak_usage_bytes}
		 */
		public final Builder peakUsageBytes(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.peakUsageBytes(fn.apply(new JobStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsJobsMemory}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsJobsMemory build() {
			_checkSingleUse();

			return new MlDataFrameAnalyticsJobsMemory(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlDataFrameAnalyticsJobsMemory}
	 */
	public static final JsonpDeserializer<MlDataFrameAnalyticsJobsMemory> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlDataFrameAnalyticsJobsMemory::setupMlDataFrameAnalyticsJobsMemoryDeserializer);

	protected static void setupMlDataFrameAnalyticsJobsMemoryDeserializer(
			ObjectDeserializer<MlDataFrameAnalyticsJobsMemory.Builder> op) {

		op.add(Builder::peakUsageBytes, JobStatistics._DESERIALIZER, "peak_usage_bytes");

	}

}
