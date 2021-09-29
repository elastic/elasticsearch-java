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

package co.elastic.clients.elasticsearch.autoscaling.get_autoscaling_capacity;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: autoscaling.get_autoscaling_capacity.AutoscalingDeciders
@JsonpDeserializable
public final class AutoscalingDeciders implements JsonpSerializable {
	private final AutoscalingCapacity requiredCapacity;

	private final AutoscalingCapacity currentCapacity;

	private final List<AutoscalingNode> currentNodes;

	private final Map<String, AutoscalingDecider> deciders;

	// ---------------------------------------------------------------------------------------------

	public AutoscalingDeciders(Builder builder) {

		this.requiredCapacity = Objects.requireNonNull(builder.requiredCapacity, "required_capacity");
		this.currentCapacity = Objects.requireNonNull(builder.currentCapacity, "current_capacity");
		this.currentNodes = ModelTypeHelper.unmodifiableNonNull(builder.currentNodes, "current_nodes");
		this.deciders = ModelTypeHelper.unmodifiableNonNull(builder.deciders, "deciders");

	}

	public AutoscalingDeciders(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code required_capacity}
	 */
	public AutoscalingCapacity requiredCapacity() {
		return this.requiredCapacity;
	}

	/**
	 * API name: {@code current_capacity}
	 */
	public AutoscalingCapacity currentCapacity() {
		return this.currentCapacity;
	}

	/**
	 * API name: {@code current_nodes}
	 */
	public List<AutoscalingNode> currentNodes() {
		return this.currentNodes;
	}

	/**
	 * API name: {@code deciders}
	 */
	public Map<String, AutoscalingDecider> deciders() {
		return this.deciders;
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

		generator.writeKey("required_capacity");
		this.requiredCapacity.serialize(generator, mapper);

		generator.writeKey("current_capacity");
		this.currentCapacity.serialize(generator, mapper);

		generator.writeKey("current_nodes");
		generator.writeStartArray();
		for (AutoscalingNode item0 : this.currentNodes) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("deciders");
		generator.writeStartObject();
		for (Map.Entry<String, AutoscalingDecider> item0 : this.deciders.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoscalingDeciders}.
	 */
	public static class Builder implements ObjectBuilder<AutoscalingDeciders> {
		private AutoscalingCapacity requiredCapacity;

		private AutoscalingCapacity currentCapacity;

		private List<AutoscalingNode> currentNodes;

		private Map<String, AutoscalingDecider> deciders;

		/**
		 * API name: {@code required_capacity}
		 */
		public Builder requiredCapacity(AutoscalingCapacity value) {
			this.requiredCapacity = value;
			return this;
		}

		/**
		 * API name: {@code required_capacity}
		 */
		public Builder requiredCapacity(Function<AutoscalingCapacity.Builder, ObjectBuilder<AutoscalingCapacity>> fn) {
			return this.requiredCapacity(fn.apply(new AutoscalingCapacity.Builder()).build());
		}

		/**
		 * API name: {@code current_capacity}
		 */
		public Builder currentCapacity(AutoscalingCapacity value) {
			this.currentCapacity = value;
			return this;
		}

		/**
		 * API name: {@code current_capacity}
		 */
		public Builder currentCapacity(Function<AutoscalingCapacity.Builder, ObjectBuilder<AutoscalingCapacity>> fn) {
			return this.currentCapacity(fn.apply(new AutoscalingCapacity.Builder()).build());
		}

		/**
		 * API name: {@code current_nodes}
		 */
		public Builder currentNodes(List<AutoscalingNode> value) {
			this.currentNodes = value;
			return this;
		}

		/**
		 * API name: {@code current_nodes}
		 */
		public Builder currentNodes(AutoscalingNode... value) {
			this.currentNodes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #currentNodes(List)}, creating the list if needed. 4
		 */
		public Builder addCurrentNodes(AutoscalingNode value) {
			if (this.currentNodes == null) {
				this.currentNodes = new ArrayList<>();
			}
			this.currentNodes.add(value);
			return this;
		}

		/**
		 * Set {@link #currentNodes(List)} to a singleton list.
		 */
		public Builder currentNodes(Function<AutoscalingNode.Builder, ObjectBuilder<AutoscalingNode>> fn) {
			return this.currentNodes(fn.apply(new AutoscalingNode.Builder()).build());
		}

		/**
		 * Add a value to {@link #currentNodes(List)}, creating the list if needed. 5
		 */
		public Builder addCurrentNodes(Function<AutoscalingNode.Builder, ObjectBuilder<AutoscalingNode>> fn) {
			return this.addCurrentNodes(fn.apply(new AutoscalingNode.Builder()).build());
		}

		/**
		 * API name: {@code deciders}
		 */
		public Builder deciders(Map<String, AutoscalingDecider> value) {
			this.deciders = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #deciders(Map)}, creating the map if needed.
		 */
		public Builder putDeciders(String key, AutoscalingDecider value) {
			if (this.deciders == null) {
				this.deciders = new HashMap<>();
			}
			this.deciders.put(key, value);
			return this;
		}

		/**
		 * Set {@link #deciders(Map)} to a singleton map.
		 */
		public Builder deciders(String key,
				Function<AutoscalingDecider.Builder, ObjectBuilder<AutoscalingDecider>> fn) {
			return this.deciders(Collections.singletonMap(key, fn.apply(new AutoscalingDecider.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #deciders(Map)}, creating the map if needed.
		 */
		public Builder putDeciders(String key,
				Function<AutoscalingDecider.Builder, ObjectBuilder<AutoscalingDecider>> fn) {
			return this.putDeciders(key, fn.apply(new AutoscalingDecider.Builder()).build());
		}

		/**
		 * Builds a {@link AutoscalingDeciders}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoscalingDeciders build() {

			return new AutoscalingDeciders(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoscalingDeciders}
	 */
	public static final JsonpDeserializer<AutoscalingDeciders> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoscalingDeciders::setupAutoscalingDecidersDeserializer, Builder::build);

	protected static void setupAutoscalingDecidersDeserializer(DelegatingDeserializer<AutoscalingDeciders.Builder> op) {

		op.add(Builder::requiredCapacity, AutoscalingCapacity._DESERIALIZER, "required_capacity");
		op.add(Builder::currentCapacity, AutoscalingCapacity._DESERIALIZER, "current_capacity");
		op.add(Builder::currentNodes, JsonpDeserializer.arrayDeserializer(AutoscalingNode._DESERIALIZER),
				"current_nodes");
		op.add(Builder::deciders, JsonpDeserializer.stringMapDeserializer(AutoscalingDecider._DESERIALIZER),
				"deciders");

	}

}
