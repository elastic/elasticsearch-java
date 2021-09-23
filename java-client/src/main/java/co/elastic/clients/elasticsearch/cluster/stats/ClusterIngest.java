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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterIngest
public final class ClusterIngest implements JsonpSerializable {
	private final Number numberOfPipelines;

	private final Map<String, ClusterProcessor> processorStats;

	// ---------------------------------------------------------------------------------------------

	public ClusterIngest(Builder builder) {

		this.numberOfPipelines = Objects.requireNonNull(builder.numberOfPipelines, "number_of_pipelines");
		this.processorStats = Objects.requireNonNull(builder.processorStats, "processor_stats");

	}

	/**
	 * API name: {@code number_of_pipelines}
	 */
	public Number numberOfPipelines() {
		return this.numberOfPipelines;
	}

	/**
	 * API name: {@code processor_stats}
	 */
	public Map<String, ClusterProcessor> processorStats() {
		return this.processorStats;
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

		generator.writeKey("number_of_pipelines");
		generator.write(this.numberOfPipelines.doubleValue());

		generator.writeKey("processor_stats");
		generator.writeStartObject();
		for (Map.Entry<String, ClusterProcessor> item0 : this.processorStats.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterIngest}.
	 */
	public static class Builder implements ObjectBuilder<ClusterIngest> {
		private Number numberOfPipelines;

		private Map<String, ClusterProcessor> processorStats;

		/**
		 * API name: {@code number_of_pipelines}
		 */
		public Builder numberOfPipelines(Number value) {
			this.numberOfPipelines = value;
			return this;
		}

		/**
		 * API name: {@code processor_stats}
		 */
		public Builder processorStats(Map<String, ClusterProcessor> value) {
			this.processorStats = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #processorStats(Map)}, creating the map if needed.
		 */
		public Builder putProcessorStats(String key, ClusterProcessor value) {
			if (this.processorStats == null) {
				this.processorStats = new HashMap<>();
			}
			this.processorStats.put(key, value);
			return this;
		}

		/**
		 * Set {@link #processorStats(Map)} to a singleton map.
		 */
		public Builder processorStats(String key,
				Function<ClusterProcessor.Builder, ObjectBuilder<ClusterProcessor>> fn) {
			return this.processorStats(Collections.singletonMap(key, fn.apply(new ClusterProcessor.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #processorStats(Map)}, creating the map if needed.
		 */
		public Builder putProcessorStats(String key,
				Function<ClusterProcessor.Builder, ObjectBuilder<ClusterProcessor>> fn) {
			return this.putProcessorStats(key, fn.apply(new ClusterProcessor.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterIngest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterIngest build() {

			return new ClusterIngest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterIngest}
	 */
	public static final JsonpDeserializer<ClusterIngest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterIngest::setupClusterIngestDeserializer);

	protected static void setupClusterIngestDeserializer(DelegatingDeserializer<ClusterIngest.Builder> op) {

		op.add(Builder::numberOfPipelines, JsonpDeserializer.numberDeserializer(), "number_of_pipelines");
		op.add(Builder::processorStats, JsonpDeserializer.stringMapDeserializer(ClusterProcessor.DESERIALIZER),
				"processor_stats");

	}

}
