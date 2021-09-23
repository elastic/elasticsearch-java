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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ClusterStateIngest
public final class ClusterStateIngest implements JsonpSerializable {
	private final List<ClusterStateIngestPipeline> pipeline;

	// ---------------------------------------------------------------------------------------------

	public ClusterStateIngest(Builder builder) {

		this.pipeline = Objects.requireNonNull(builder.pipeline, "pipeline");

	}

	/**
	 * API name: {@code pipeline}
	 */
	public List<ClusterStateIngestPipeline> pipeline() {
		return this.pipeline;
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

		generator.writeKey("pipeline");
		generator.writeStartArray();
		for (ClusterStateIngestPipeline item0 : this.pipeline) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateIngest}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateIngest> {
		private List<ClusterStateIngestPipeline> pipeline;

		/**
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(List<ClusterStateIngestPipeline> value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(ClusterStateIngestPipeline... value) {
			this.pipeline = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #pipeline(List)}, creating the list if needed.
		 */
		public Builder addPipeline(ClusterStateIngestPipeline value) {
			if (this.pipeline == null) {
				this.pipeline = new ArrayList<>();
			}
			this.pipeline.add(value);
			return this;
		}

		/**
		 * Set {@link #pipeline(List)} to a singleton list.
		 */
		public Builder pipeline(
				Function<ClusterStateIngestPipeline.Builder, ObjectBuilder<ClusterStateIngestPipeline>> fn) {
			return this.pipeline(fn.apply(new ClusterStateIngestPipeline.Builder()).build());
		}

		/**
		 * Add a value to {@link #pipeline(List)}, creating the list if needed.
		 */
		public Builder addPipeline(
				Function<ClusterStateIngestPipeline.Builder, ObjectBuilder<ClusterStateIngestPipeline>> fn) {
			return this.addPipeline(fn.apply(new ClusterStateIngestPipeline.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterStateIngest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateIngest build() {

			return new ClusterStateIngest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStateIngest}
	 */
	public static final JsonpDeserializer<ClusterStateIngest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterStateIngest::setupClusterStateIngestDeserializer);

	protected static void setupClusterStateIngestDeserializer(DelegatingDeserializer<ClusterStateIngest.Builder> op) {

		op.add(Builder::pipeline, JsonpDeserializer.arrayDeserializer(ClusterStateIngestPipeline.DESERIALIZER),
				"pipeline");

	}

}
