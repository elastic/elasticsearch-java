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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterIngest
@JsonpDeserializable
public class ClusterIngest implements JsonpSerializable {
	private final int numberOfPipelines;

	private final Map<String, ClusterProcessor> processorStats;

	// ---------------------------------------------------------------------------------------------

	private ClusterIngest(Builder builder) {

		this.numberOfPipelines = ModelTypeHelper.requireNonNull(builder.numberOfPipelines, this, "numberOfPipelines");
		this.processorStats = ModelTypeHelper.unmodifiableRequired(builder.processorStats, this, "processorStats");

	}

	public static ClusterIngest of(Function<Builder, ObjectBuilder<ClusterIngest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code number_of_pipelines}
	 */
	public final int numberOfPipelines() {
		return this.numberOfPipelines;
	}

	/**
	 * Required - API name: {@code processor_stats}
	 */
	public final Map<String, ClusterProcessor> processorStats() {
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
		generator.write(this.numberOfPipelines);

		if (ModelTypeHelper.isDefined(this.processorStats)) {
			generator.writeKey("processor_stats");
			generator.writeStartObject();
			for (Map.Entry<String, ClusterProcessor> item0 : this.processorStats.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterIngest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClusterIngest> {
		private Integer numberOfPipelines;

		private Map<String, ClusterProcessor> processorStats;

		/**
		 * Required - API name: {@code number_of_pipelines}
		 */
		public final Builder numberOfPipelines(int value) {
			this.numberOfPipelines = value;
			return this;
		}

		/**
		 * Required - API name: {@code processor_stats}
		 */
		public final Builder processorStats(Map<String, ClusterProcessor> value) {
			this.processorStats = value;
			return this;
		}

		/**
		 * Set {@link #processorStats(Map)} to a singleton map.
		 */
		public Builder processorStats(String key,
				Function<ClusterProcessor.Builder, ObjectBuilder<ClusterProcessor>> fn) {
			return this.processorStats(Collections.singletonMap(key, fn.apply(new ClusterProcessor.Builder()).build()));
		}

		public final Builder processorStats(
				Function<MapBuilder<String, ClusterProcessor, ClusterProcessor.Builder>, ObjectBuilder<Map<String, ClusterProcessor>>> fn) {
			return processorStats(fn.apply(new MapBuilder<>(ClusterProcessor.Builder::new)).build());
		}

		/**
		 * Builds a {@link ClusterIngest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterIngest build() {
			_checkSingleUse();

			return new ClusterIngest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterIngest}
	 */
	public static final JsonpDeserializer<ClusterIngest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterIngest::setupClusterIngestDeserializer, Builder::build);

	protected static void setupClusterIngestDeserializer(DelegatingDeserializer<ClusterIngest.Builder> op) {

		op.add(Builder::numberOfPipelines, JsonpDeserializer.integerDeserializer(), "number_of_pipelines");
		op.add(Builder::processorStats, JsonpDeserializer.stringMapDeserializer(ClusterProcessor._DESERIALIZER),
				"processor_stats");

	}

}
