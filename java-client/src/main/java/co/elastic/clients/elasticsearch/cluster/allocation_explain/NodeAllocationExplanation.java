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

package co.elastic.clients.elasticsearch.cluster.allocation_explain;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.NodeAllocationExplanation
@JsonpDeserializable
public final class NodeAllocationExplanation implements JsonpSerializable {
	private final List<AllocationDecision> deciders;

	private final Map<String, String> nodeAttributes;

	private final Decision nodeDecision;

	private final String nodeId;

	private final String nodeName;

	@Nullable
	private final AllocationStore store;

	private final String transportAddress;

	private final int weightRanking;

	// ---------------------------------------------------------------------------------------------

	public NodeAllocationExplanation(Builder builder) {

		this.deciders = Objects.requireNonNull(builder.deciders, "deciders");
		this.nodeAttributes = Objects.requireNonNull(builder.nodeAttributes, "node_attributes");
		this.nodeDecision = Objects.requireNonNull(builder.nodeDecision, "node_decision");
		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");
		this.nodeName = Objects.requireNonNull(builder.nodeName, "node_name");
		this.store = builder.store;
		this.transportAddress = Objects.requireNonNull(builder.transportAddress, "transport_address");
		this.weightRanking = Objects.requireNonNull(builder.weightRanking, "weight_ranking");

	}

	/**
	 * API name: {@code deciders}
	 */
	public List<AllocationDecision> deciders() {
		return this.deciders;
	}

	/**
	 * API name: {@code node_attributes}
	 */
	public Map<String, String> nodeAttributes() {
		return this.nodeAttributes;
	}

	/**
	 * API name: {@code node_decision}
	 */
	public Decision nodeDecision() {
		return this.nodeDecision;
	}

	/**
	 * API name: {@code node_id}
	 */
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code node_name}
	 */
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * API name: {@code store}
	 */
	@Nullable
	public AllocationStore store() {
		return this.store;
	}

	/**
	 * API name: {@code transport_address}
	 */
	public String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * API name: {@code weight_ranking}
	 */
	public int weightRanking() {
		return this.weightRanking;
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

		generator.writeKey("deciders");
		generator.writeStartArray();
		for (AllocationDecision item0 : this.deciders) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("node_attributes");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.nodeAttributes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("node_decision");
		this.nodeDecision.serialize(generator, mapper);

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("node_name");
		generator.write(this.nodeName);

		if (this.store != null) {

			generator.writeKey("store");
			this.store.serialize(generator, mapper);

		}

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

		generator.writeKey("weight_ranking");
		generator.write(this.weightRanking);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeAllocationExplanation}.
	 */
	public static class Builder implements ObjectBuilder<NodeAllocationExplanation> {
		private List<AllocationDecision> deciders;

		private Map<String, String> nodeAttributes;

		private Decision nodeDecision;

		private String nodeId;

		private String nodeName;

		@Nullable
		private AllocationStore store;

		private String transportAddress;

		private Integer weightRanking;

		/**
		 * API name: {@code deciders}
		 */
		public Builder deciders(List<AllocationDecision> value) {
			this.deciders = value;
			return this;
		}

		/**
		 * API name: {@code deciders}
		 */
		public Builder deciders(AllocationDecision... value) {
			this.deciders = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #deciders(List)}, creating the list if needed.
		 */
		public Builder addDeciders(AllocationDecision value) {
			if (this.deciders == null) {
				this.deciders = new ArrayList<>();
			}
			this.deciders.add(value);
			return this;
		}

		/**
		 * Set {@link #deciders(List)} to a singleton list.
		 */
		public Builder deciders(Function<AllocationDecision.Builder, ObjectBuilder<AllocationDecision>> fn) {
			return this.deciders(fn.apply(new AllocationDecision.Builder()).build());
		}

		/**
		 * Add a value to {@link #deciders(List)}, creating the list if needed.
		 */
		public Builder addDeciders(Function<AllocationDecision.Builder, ObjectBuilder<AllocationDecision>> fn) {
			return this.addDeciders(fn.apply(new AllocationDecision.Builder()).build());
		}

		/**
		 * API name: {@code node_attributes}
		 */
		public Builder nodeAttributes(Map<String, String> value) {
			this.nodeAttributes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodeAttributes(Map)}, creating the map if needed.
		 */
		public Builder putNodeAttributes(String key, String value) {
			if (this.nodeAttributes == null) {
				this.nodeAttributes = new HashMap<>();
			}
			this.nodeAttributes.put(key, value);
			return this;
		}

		/**
		 * API name: {@code node_decision}
		 */
		public Builder nodeDecision(Decision value) {
			this.nodeDecision = value;
			return this;
		}

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code node_name}
		 */
		public Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * API name: {@code store}
		 */
		public Builder store(@Nullable AllocationStore value) {
			this.store = value;
			return this;
		}

		/**
		 * API name: {@code store}
		 */
		public Builder store(Function<AllocationStore.Builder, ObjectBuilder<AllocationStore>> fn) {
			return this.store(fn.apply(new AllocationStore.Builder()).build());
		}

		/**
		 * API name: {@code transport_address}
		 */
		public Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * API name: {@code weight_ranking}
		 */
		public Builder weightRanking(int value) {
			this.weightRanking = value;
			return this;
		}

		/**
		 * Builds a {@link NodeAllocationExplanation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeAllocationExplanation build() {

			return new NodeAllocationExplanation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeAllocationExplanation}
	 */
	public static final JsonpDeserializer<NodeAllocationExplanation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeAllocationExplanation::setupNodeAllocationExplanationDeserializer, Builder::build);

	protected static void setupNodeAllocationExplanationDeserializer(
			DelegatingDeserializer<NodeAllocationExplanation.Builder> op) {

		op.add(Builder::deciders, JsonpDeserializer.arrayDeserializer(AllocationDecision._DESERIALIZER), "deciders");
		op.add(Builder::nodeAttributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"node_attributes");
		op.add(Builder::nodeDecision, Decision._DESERIALIZER, "node_decision");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");
		op.add(Builder::store, AllocationStore._DESERIALIZER, "store");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");
		op.add(Builder::weightRanking, JsonpDeserializer.integerDeserializer(), "weight_ranking");

	}

}
