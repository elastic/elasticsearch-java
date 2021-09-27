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

import co.elastic.clients.elasticsearch.ml.Job;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.MachineLearning
@JsonpDeserializable
public final class MachineLearning extends Base {
	private final Map<String, Datafeed> datafeeds;

	private final Map<String, Job> jobs;

	private final Integer nodeCount;

	private final MlDataFrameAnalyticsJobs dataFrameAnalyticsJobs;

	private final MlInference inference;

	// ---------------------------------------------------------------------------------------------

	public MachineLearning(Builder builder) {
		super(builder);

		this.datafeeds = Objects.requireNonNull(builder.datafeeds, "datafeeds");
		this.jobs = Objects.requireNonNull(builder.jobs, "jobs");
		this.nodeCount = Objects.requireNonNull(builder.nodeCount, "node_count");
		this.dataFrameAnalyticsJobs = Objects.requireNonNull(builder.dataFrameAnalyticsJobs,
				"data_frame_analytics_jobs");
		this.inference = Objects.requireNonNull(builder.inference, "inference");

	}

	/**
	 * API name: {@code datafeeds}
	 */
	public Map<String, Datafeed> datafeeds() {
		return this.datafeeds;
	}

	/**
	 * API name: {@code jobs}
	 */
	public Map<String, Job> jobs() {
		return this.jobs;
	}

	/**
	 * API name: {@code node_count}
	 */
	public Integer nodeCount() {
		return this.nodeCount;
	}

	/**
	 * API name: {@code data_frame_analytics_jobs}
	 */
	public MlDataFrameAnalyticsJobs dataFrameAnalyticsJobs() {
		return this.dataFrameAnalyticsJobs;
	}

	/**
	 * API name: {@code inference}
	 */
	public MlInference inference() {
		return this.inference;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("datafeeds");
		generator.writeStartObject();
		for (Map.Entry<String, Datafeed> item0 : this.datafeeds.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("jobs");
		generator.writeStartObject();
		for (Map.Entry<String, Job> item0 : this.jobs.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

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

		private Map<String, Job> jobs;

		private Integer nodeCount;

		private MlDataFrameAnalyticsJobs dataFrameAnalyticsJobs;

		private MlInference inference;

		/**
		 * API name: {@code datafeeds}
		 */
		public Builder datafeeds(Map<String, Datafeed> value) {
			this.datafeeds = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #datafeeds(Map)}, creating the map if needed.
		 */
		public Builder putDatafeeds(String key, Datafeed value) {
			if (this.datafeeds == null) {
				this.datafeeds = new HashMap<>();
			}
			this.datafeeds.put(key, value);
			return this;
		}

		/**
		 * Set {@link #datafeeds(Map)} to a singleton map.
		 */
		public Builder datafeeds(String key, Function<Datafeed.Builder, ObjectBuilder<Datafeed>> fn) {
			return this.datafeeds(Collections.singletonMap(key, fn.apply(new Datafeed.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #datafeeds(Map)}, creating the map if needed.
		 */
		public Builder putDatafeeds(String key, Function<Datafeed.Builder, ObjectBuilder<Datafeed>> fn) {
			return this.putDatafeeds(key, fn.apply(new Datafeed.Builder()).build());
		}

		/**
		 * API name: {@code jobs}
		 */
		public Builder jobs(Map<String, Job> value) {
			this.jobs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #jobs(Map)}, creating the map if needed.
		 */
		public Builder putJobs(String key, Job value) {
			if (this.jobs == null) {
				this.jobs = new HashMap<>();
			}
			this.jobs.put(key, value);
			return this;
		}

		/**
		 * Set {@link #jobs(Map)} to a singleton map.
		 */
		public Builder jobs(String key, Function<Job.Builder, ObjectBuilder<Job>> fn) {
			return this.jobs(Collections.singletonMap(key, fn.apply(new Job.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #jobs(Map)}, creating the map if needed.
		 */
		public Builder putJobs(String key, Function<Job.Builder, ObjectBuilder<Job>> fn) {
			return this.putJobs(key, fn.apply(new Job.Builder()).build());
		}

		/**
		 * API name: {@code node_count}
		 */
		public Builder nodeCount(Integer value) {
			this.nodeCount = value;
			return this;
		}

		/**
		 * API name: {@code data_frame_analytics_jobs}
		 */
		public Builder dataFrameAnalyticsJobs(MlDataFrameAnalyticsJobs value) {
			this.dataFrameAnalyticsJobs = value;
			return this;
		}

		/**
		 * API name: {@code data_frame_analytics_jobs}
		 */
		public Builder dataFrameAnalyticsJobs(
				Function<MlDataFrameAnalyticsJobs.Builder, ObjectBuilder<MlDataFrameAnalyticsJobs>> fn) {
			return this.dataFrameAnalyticsJobs(fn.apply(new MlDataFrameAnalyticsJobs.Builder()).build());
		}

		/**
		 * API name: {@code inference}
		 */
		public Builder inference(MlInference value) {
			this.inference = value;
			return this;
		}

		/**
		 * API name: {@code inference}
		 */
		public Builder inference(Function<MlInference.Builder, ObjectBuilder<MlInference>> fn) {
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

			return new MachineLearning(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MachineLearning}
	 */
	public static final JsonpDeserializer<MachineLearning> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MachineLearning::setupMachineLearningDeserializer, Builder::build);

	protected static void setupMachineLearningDeserializer(DelegatingDeserializer<MachineLearning.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::datafeeds, JsonpDeserializer.stringMapDeserializer(Datafeed._DESERIALIZER), "datafeeds");
		op.add(Builder::jobs, JsonpDeserializer.stringMapDeserializer(Job._DESERIALIZER), "jobs");
		op.add(Builder::nodeCount, JsonpDeserializer.integerDeserializer(), "node_count");
		op.add(Builder::dataFrameAnalyticsJobs, MlDataFrameAnalyticsJobs._DESERIALIZER, "data_frame_analytics_jobs");
		op.add(Builder::inference, MlInference._DESERIALIZER, "inference");

	}

}
