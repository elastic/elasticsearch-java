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

import co.elastic.clients.elasticsearch.ilm.Phases;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ClusterStateIndexLifecyclePolicy
@JsonpDeserializable
public final class ClusterStateIndexLifecyclePolicy implements JsonpSerializable {
	private final Phases phases;

	// ---------------------------------------------------------------------------------------------

	public ClusterStateIndexLifecyclePolicy(Builder builder) {

		this.phases = Objects.requireNonNull(builder.phases, "phases");

	}

	/**
	 * API name: {@code phases}
	 */
	public Phases phases() {
		return this.phases;
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

		generator.writeKey("phases");
		this.phases.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateIndexLifecyclePolicy}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateIndexLifecyclePolicy> {
		private Phases phases;

		/**
		 * API name: {@code phases}
		 */
		public Builder phases(Phases value) {
			this.phases = value;
			return this;
		}

		/**
		 * API name: {@code phases}
		 */
		public Builder phases(Function<Phases.Builder, ObjectBuilder<Phases>> fn) {
			return this.phases(fn.apply(new Phases.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterStateIndexLifecyclePolicy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateIndexLifecyclePolicy build() {

			return new ClusterStateIndexLifecyclePolicy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStateIndexLifecyclePolicy}
	 */
	public static final JsonpDeserializer<ClusterStateIndexLifecyclePolicy> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterStateIndexLifecyclePolicy::setupClusterStateIndexLifecyclePolicyDeserializer,
					Builder::build);

	protected static void setupClusterStateIndexLifecyclePolicyDeserializer(
			DelegatingDeserializer<ClusterStateIndexLifecyclePolicy.Builder> op) {

		op.add(Builder::phases, Phases._DESERIALIZER, "phases");

	}

}
