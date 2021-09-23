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

import co.elastic.clients.elasticsearch._types.LifecycleOperationMode;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ClusterStateIndexLifecycle
public final class ClusterStateIndexLifecycle implements JsonpSerializable {
	private final Map<String, ClusterStateIndexLifecycleSummary> policies;

	private final LifecycleOperationMode operationMode;

	// ---------------------------------------------------------------------------------------------

	public ClusterStateIndexLifecycle(Builder builder) {

		this.policies = Objects.requireNonNull(builder.policies, "policies");
		this.operationMode = Objects.requireNonNull(builder.operationMode, "operation_mode");

	}

	/**
	 * API name: {@code policies}
	 */
	public Map<String, ClusterStateIndexLifecycleSummary> policies() {
		return this.policies;
	}

	/**
	 * API name: {@code operation_mode}
	 */
	public LifecycleOperationMode operationMode() {
		return this.operationMode;
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

		generator.writeKey("policies");
		generator.writeStartObject();
		for (Map.Entry<String, ClusterStateIndexLifecycleSummary> item0 : this.policies.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("operation_mode");
		this.operationMode.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateIndexLifecycle}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateIndexLifecycle> {
		private Map<String, ClusterStateIndexLifecycleSummary> policies;

		private LifecycleOperationMode operationMode;

		/**
		 * API name: {@code policies}
		 */
		public Builder policies(Map<String, ClusterStateIndexLifecycleSummary> value) {
			this.policies = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #policies(Map)}, creating the map if needed.
		 */
		public Builder putPolicies(String key, ClusterStateIndexLifecycleSummary value) {
			if (this.policies == null) {
				this.policies = new HashMap<>();
			}
			this.policies.put(key, value);
			return this;
		}

		/**
		 * Set {@link #policies(Map)} to a singleton map.
		 */
		public Builder policies(String key,
				Function<ClusterStateIndexLifecycleSummary.Builder, ObjectBuilder<ClusterStateIndexLifecycleSummary>> fn) {
			return this.policies(
					Collections.singletonMap(key, fn.apply(new ClusterStateIndexLifecycleSummary.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #policies(Map)}, creating the map if needed.
		 */
		public Builder putPolicies(String key,
				Function<ClusterStateIndexLifecycleSummary.Builder, ObjectBuilder<ClusterStateIndexLifecycleSummary>> fn) {
			return this.putPolicies(key, fn.apply(new ClusterStateIndexLifecycleSummary.Builder()).build());
		}

		/**
		 * API name: {@code operation_mode}
		 */
		public Builder operationMode(LifecycleOperationMode value) {
			this.operationMode = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterStateIndexLifecycle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateIndexLifecycle build() {

			return new ClusterStateIndexLifecycle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStateIndexLifecycle}
	 */
	public static final JsonpDeserializer<ClusterStateIndexLifecycle> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterStateIndexLifecycle::setupClusterStateIndexLifecycleDeserializer);

	protected static void setupClusterStateIndexLifecycleDeserializer(
			DelegatingDeserializer<ClusterStateIndexLifecycle.Builder> op) {

		op.add(Builder::policies,
				JsonpDeserializer.stringMapDeserializer(ClusterStateIndexLifecycleSummary.DESERIALIZER), "policies");
		op.add(Builder::operationMode, LifecycleOperationMode.DESERIALIZER, "operation_mode");

	}

}
