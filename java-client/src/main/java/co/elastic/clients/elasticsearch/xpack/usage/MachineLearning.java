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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.MachineLearning

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/xpack/usage/types.ts#L332-L340">API
 *      specification</a>
 */
@JsonpDeserializable
public class MachineLearning extends Base {
	private final Map<String, Datafeed> datafeeds;

	private final Jobs jobs;

	private final int nodeCount;

	private final MlDataFrameAnalyticsJobs dataFrameAnalyticsJobs;

	private final MlInference inference;

	// ---------------------------------------------------------------------------------------------

	private MachineLearning(Builder builder) {
		super(builder);

		this.datafeeds = ApiTypeHelper.unmodifiableRequired(builder.datafeeds, this, "datafeeds");
		this.jobs = ApiTypeHelper.requireNonNull(builder.jobs, this, "jobs");
		this.nodeCount = ApiTypeHelper.requireNonNull(builder.nodeCount, this, "nodeCount");
		this.dataFrameAnalyticsJobs = ApiTypeHelper.requireNonNull(builder.dataFrameAnalyticsJobs, this,
				"dataFrameAnalyticsJobs");
		this.inference = ApiTypeHelper.requireNonNull(builder.inference, this, "inference");

	}

	public static MachineLearning of(Function<Builder, ObjectBuilder<MachineLearning>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code datafeeds}
	 */
	public final Map<String, Datafeed> datafeeds() {
		return this.datafeeds;
	}

	/**
	 * Required - API name: {@code jobs}
	 */
	public final Jobs jobs() {
		return this.jobs;
	}

	/**
	 * Required - API name: {@code node_count}
	 */
	public final int nodeCount() {
		return this.nodeCount;
	}

	/**
	 * Required - API name: {@code data_frame_analytics_jobs}
	 */
	public final MlDataFrameAnalyticsJobs dataFrameAnalyticsJobs() {
		return this.dataFrameAnalyticsJobs;
	}

	/**
	 * Required - API name: {@code inference}
	 */
	public final MlInference inference() {
		return this.inference;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.datafeeds)) {
			generator.writeKey("datafeeds");
			generator.writeStartObject();
			for (Map.Entry<String, Datafeed> item0 : this.datafeeds.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("jobs");
		this.jobs.serialize(generator, mapper);

		generator.writeKey("node_count");
		generator.write(this.nodeCount);

		generator.writeKey("data_frame_analytics_jobs");
		this.dataFrameAnalyticsJobs.serialize(generator, mapper);

		generator.writeKey("inference");
		this.inference.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MachineLearning}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<MachineLearning> {
		private Map<String, Datafeed> datafeeds;

		private Jobs jobs;

		private Integer nodeCount;

		private MlDataFrameAnalyticsJobs dataFrameAnalyticsJobs;

		private MlInference inference;

		/**
		 * Required - API name: {@code datafeeds}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>datafeeds</code>.
		 */
		public final Builder datafeeds(Map<String, Datafeed> map) {
			this.datafeeds = _mapPutAll(this.datafeeds, map);
			return this;
		}

		/**
		 * Required - API name: {@code datafeeds}
		 * <p>
		 * Adds an entry to <code>datafeeds</code>.
		 */
		public final Builder datafeeds(String key, Datafeed value) {
			this.datafeeds = _mapPut(this.datafeeds, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code datafeeds}
		 * <p>
		 * Adds an entry to <code>datafeeds</code> using a builder lambda.
		 */
		public final Builder datafeeds(String key, Function<Datafeed.Builder, ObjectBuilder<Datafeed>> fn) {
			return datafeeds(key, fn.apply(new Datafeed.Builder()).build());
		}

		/**
		 * Required - API name: {@code jobs}
		 */
		public final Builder jobs(Jobs value) {
			this.jobs = value;
			return this;
		}

		/**
		 * Required - API name: {@code jobs}
		 */
		public final Builder jobs(Function<Jobs.Builder, ObjectBuilder<Jobs>> fn) {
			return this.jobs(fn.apply(new Jobs.Builder()).build());
		}

		/**
		 * Required - API name: {@code node_count}
		 */
		public final Builder nodeCount(int value) {
			this.nodeCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_frame_analytics_jobs}
		 */
		public final Builder dataFrameAnalyticsJobs(MlDataFrameAnalyticsJobs value) {
			this.dataFrameAnalyticsJobs = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_frame_analytics_jobs}
		 */
		public final Builder dataFrameAnalyticsJobs(
				Function<MlDataFrameAnalyticsJobs.Builder, ObjectBuilder<MlDataFrameAnalyticsJobs>> fn) {
			return this.dataFrameAnalyticsJobs(fn.apply(new MlDataFrameAnalyticsJobs.Builder()).build());
		}

		/**
		 * Required - API name: {@code inference}
		 */
		public final Builder inference(MlInference value) {
			this.inference = value;
			return this;
		}

		/**
		 * Required - API name: {@code inference}
		 */
		public final Builder inference(Function<MlInference.Builder, ObjectBuilder<MlInference>> fn) {
			return this.inference(fn.apply(new MlInference.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MachineLearning}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MachineLearning build() {
			_checkSingleUse();

			return new MachineLearning(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MachineLearning}
	 */
	public static final JsonpDeserializer<MachineLearning> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MachineLearning::setupMachineLearningDeserializer);

	protected static void setupMachineLearningDeserializer(ObjectDeserializer<MachineLearning.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::datafeeds, JsonpDeserializer.stringMapDeserializer(Datafeed._DESERIALIZER), "datafeeds");
		op.add(Builder::jobs, Jobs._DESERIALIZER, "jobs");
		op.add(Builder::nodeCount, JsonpDeserializer.integerDeserializer(), "node_count");
		op.add(Builder::dataFrameAnalyticsJobs, MlDataFrameAnalyticsJobs._DESERIALIZER, "data_frame_analytics_jobs");
		op.add(Builder::inference, MlInference._DESERIALIZER, "inference");

	}

}
