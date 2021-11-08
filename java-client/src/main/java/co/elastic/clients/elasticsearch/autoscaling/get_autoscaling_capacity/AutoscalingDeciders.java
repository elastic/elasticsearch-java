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
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: autoscaling.get_autoscaling_capacity.AutoscalingDeciders
@JsonpDeserializable
public class AutoscalingDeciders implements JsonpSerializable {
	private final AutoscalingCapacity requiredCapacity;

	private final AutoscalingCapacity currentCapacity;

	private final List<AutoscalingNode> currentNodes;

	private final Map<String, AutoscalingDecider> deciders;

	// ---------------------------------------------------------------------------------------------

	private AutoscalingDeciders(Builder builder) {

		this.requiredCapacity = ModelTypeHelper.requireNonNull(builder.requiredCapacity, this, "requiredCapacity");
		this.currentCapacity = ModelTypeHelper.requireNonNull(builder.currentCapacity, this, "currentCapacity");
		this.currentNodes = ModelTypeHelper.unmodifiableRequired(builder.currentNodes, this, "currentNodes");
		this.deciders = ModelTypeHelper.unmodifiableRequired(builder.deciders, this, "deciders");

	}

	public static AutoscalingDeciders of(Function<Builder, ObjectBuilder<AutoscalingDeciders>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code required_capacity}
	 */
	public final AutoscalingCapacity requiredCapacity() {
		return this.requiredCapacity;
	}

	/**
	 * Required - API name: {@code current_capacity}
	 */
	public final AutoscalingCapacity currentCapacity() {
		return this.currentCapacity;
	}

	/**
	 * Required - API name: {@code current_nodes}
	 */
	public final List<AutoscalingNode> currentNodes() {
		return this.currentNodes;
	}

	/**
	 * Required - API name: {@code deciders}
	 */
	public final Map<String, AutoscalingDecider> deciders() {
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

		if (ModelTypeHelper.isDefined(this.currentNodes)) {
			generator.writeKey("current_nodes");
			generator.writeStartArray();
			for (AutoscalingNode item0 : this.currentNodes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.deciders)) {
			generator.writeKey("deciders");
			generator.writeStartObject();
			for (Map.Entry<String, AutoscalingDecider> item0 : this.deciders.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoscalingDeciders}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AutoscalingDeciders> {
		private AutoscalingCapacity requiredCapacity;

		private AutoscalingCapacity currentCapacity;

		private List<AutoscalingNode> currentNodes;

		private Map<String, AutoscalingDecider> deciders;

		/**
		 * Required - API name: {@code required_capacity}
		 */
		public final Builder requiredCapacity(AutoscalingCapacity value) {
			this.requiredCapacity = value;
			return this;
		}

		/**
		 * Required - API name: {@code required_capacity}
		 */
		public final Builder requiredCapacity(
				Function<AutoscalingCapacity.Builder, ObjectBuilder<AutoscalingCapacity>> fn) {
			return this.requiredCapacity(fn.apply(new AutoscalingCapacity.Builder()).build());
		}

		/**
		 * Required - API name: {@code current_capacity}
		 */
		public final Builder currentCapacity(AutoscalingCapacity value) {
			this.currentCapacity = value;
			return this;
		}

		/**
		 * Required - API name: {@code current_capacity}
		 */
		public final Builder currentCapacity(
				Function<AutoscalingCapacity.Builder, ObjectBuilder<AutoscalingCapacity>> fn) {
			return this.currentCapacity(fn.apply(new AutoscalingCapacity.Builder()).build());
		}

		/**
		 * Required - API name: {@code current_nodes}
		 */
		public final Builder currentNodes(List<AutoscalingNode> value) {
			this.currentNodes = value;
			return this;
		}

		/**
		 * Required - API name: {@code current_nodes}
		 */
		public final Builder currentNodes(AutoscalingNode... value) {
			this.currentNodes = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code current_nodes}
		 */
		@SafeVarargs
		public final Builder currentNodes(Function<AutoscalingNode.Builder, ObjectBuilder<AutoscalingNode>>... fns) {
			this.currentNodes = new ArrayList<>(fns.length);
			for (Function<AutoscalingNode.Builder, ObjectBuilder<AutoscalingNode>> fn : fns) {
				this.currentNodes.add(fn.apply(new AutoscalingNode.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code deciders}
		 */
		public final Builder deciders(Map<String, AutoscalingDecider> value) {
			this.deciders = value;
			return this;
		}

		/**
		 * Set {@link #deciders(Map)} to a singleton map.
		 */
		public Builder deciders(String key,
				Function<AutoscalingDecider.Builder, ObjectBuilder<AutoscalingDecider>> fn) {
			return this.deciders(Collections.singletonMap(key, fn.apply(new AutoscalingDecider.Builder()).build()));
		}

		public final Builder deciders(
				Function<MapBuilder<String, AutoscalingDecider, AutoscalingDecider.Builder>, ObjectBuilder<Map<String, AutoscalingDecider>>> fn) {
			return deciders(fn.apply(new MapBuilder<>(AutoscalingDecider.Builder::new)).build());
		}

		/**
		 * Builds a {@link AutoscalingDeciders}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoscalingDeciders build() {
			_checkSingleUse();

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
