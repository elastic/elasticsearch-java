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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.NodeAllocationExplanation
@JsonpDeserializable
public class NodeAllocationExplanation implements JsonpSerializable {
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

	private NodeAllocationExplanation(Builder builder) {

		this.deciders = ModelTypeHelper.unmodifiableRequired(builder.deciders, this, "deciders");
		this.nodeAttributes = ModelTypeHelper.unmodifiableRequired(builder.nodeAttributes, this, "nodeAttributes");
		this.nodeDecision = ModelTypeHelper.requireNonNull(builder.nodeDecision, this, "nodeDecision");
		this.nodeId = ModelTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");
		this.nodeName = ModelTypeHelper.requireNonNull(builder.nodeName, this, "nodeName");
		this.store = builder.store;
		this.transportAddress = ModelTypeHelper.requireNonNull(builder.transportAddress, this, "transportAddress");
		this.weightRanking = ModelTypeHelper.requireNonNull(builder.weightRanking, this, "weightRanking");

	}

	public static NodeAllocationExplanation of(Function<Builder, ObjectBuilder<NodeAllocationExplanation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code deciders}
	 */
	public final List<AllocationDecision> deciders() {
		return this.deciders;
	}

	/**
	 * Required - API name: {@code node_attributes}
	 */
	public final Map<String, String> nodeAttributes() {
		return this.nodeAttributes;
	}

	/**
	 * Required - API name: {@code node_decision}
	 */
	public final Decision nodeDecision() {
		return this.nodeDecision;
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code node_name}
	 */
	public final String nodeName() {
		return this.nodeName;
	}

	/**
	 * API name: {@code store}
	 */
	@Nullable
	public final AllocationStore store() {
		return this.store;
	}

	/**
	 * Required - API name: {@code transport_address}
	 */
	public final String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * Required - API name: {@code weight_ranking}
	 */
	public final int weightRanking() {
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

		if (ModelTypeHelper.isDefined(this.deciders)) {
			generator.writeKey("deciders");
			generator.writeStartArray();
			for (AllocationDecision item0 : this.deciders) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.nodeAttributes)) {
			generator.writeKey("node_attributes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.nodeAttributes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeAllocationExplanation> {
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
		 * Required - API name: {@code deciders}
		 */
		public final Builder deciders(List<AllocationDecision> value) {
			this.deciders = value;
			return this;
		}

		/**
		 * Required - API name: {@code deciders}
		 */
		public final Builder deciders(AllocationDecision... value) {
			this.deciders = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code deciders}
		 */
		@SafeVarargs
		public final Builder deciders(Function<AllocationDecision.Builder, ObjectBuilder<AllocationDecision>>... fns) {
			this.deciders = new ArrayList<>(fns.length);
			for (Function<AllocationDecision.Builder, ObjectBuilder<AllocationDecision>> fn : fns) {
				this.deciders.add(fn.apply(new AllocationDecision.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code node_attributes}
		 */
		public final Builder nodeAttributes(Map<String, String> value) {
			this.nodeAttributes = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_decision}
		 */
		public final Builder nodeDecision(Decision value) {
			this.nodeDecision = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_name}
		 */
		public final Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * API name: {@code store}
		 */
		public final Builder store(@Nullable AllocationStore value) {
			this.store = value;
			return this;
		}

		/**
		 * API name: {@code store}
		 */
		public final Builder store(Function<AllocationStore.Builder, ObjectBuilder<AllocationStore>> fn) {
			return this.store(fn.apply(new AllocationStore.Builder()).build());
		}

		/**
		 * Required - API name: {@code transport_address}
		 */
		public final Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * Required - API name: {@code weight_ranking}
		 */
		public final Builder weightRanking(int value) {
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
			_checkSingleUse();

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
