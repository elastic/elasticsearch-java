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

package co.elastic.clients.elasticsearch.cluster.reroute;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.reroute.RerouteParameters
public final class RerouteParameters implements ToJsonp {
	private final Boolean allowPrimary;

	private final String index;

	private final String node;

	private final Number shard;

	@Nullable
	private final String fromNode;

	@Nullable
	private final String toNode;

	// ---------------------------------------------------------------------------------------------

	protected RerouteParameters(Builder builder) {

		this.allowPrimary = Objects.requireNonNull(builder.allowPrimary, "allow_primary");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.node = Objects.requireNonNull(builder.node, "node");
		this.shard = Objects.requireNonNull(builder.shard, "shard");
		this.fromNode = builder.fromNode;
		this.toNode = builder.toNode;

	}

	/**
	 * API name: {@code allow_primary}
	 */
	public Boolean allowPrimary() {
		return this.allowPrimary;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code node}
	 */
	public String node() {
		return this.node;
	}

	/**
	 * API name: {@code shard}
	 */
	public Number shard() {
		return this.shard;
	}

	/**
	 * API name: {@code from_node}
	 */
	@Nullable
	public String fromNode() {
		return this.fromNode;
	}

	/**
	 * API name: {@code to_node}
	 */
	@Nullable
	public String toNode() {
		return this.toNode;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("allow_primary");
		generator.write(this.allowPrimary);

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("shard");
		generator.write(this.shard.doubleValue());

		if (this.fromNode != null) {

			generator.writeKey("from_node");
			generator.write(this.fromNode);

		}
		if (this.toNode != null) {

			generator.writeKey("to_node");
			generator.write(this.toNode);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerouteParameters}.
	 */
	public static class Builder implements ObjectBuilder<RerouteParameters> {
		private Boolean allowPrimary;

		private String index;

		private String node;

		private Number shard;

		@Nullable
		private String fromNode;

		@Nullable
		private String toNode;

		/**
		 * API name: {@code allow_primary}
		 */
		public Builder allowPrimary(Boolean value) {
			this.allowPrimary = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code shard}
		 */
		public Builder shard(Number value) {
			this.shard = value;
			return this;
		}

		/**
		 * API name: {@code from_node}
		 */
		public Builder fromNode(@Nullable String value) {
			this.fromNode = value;
			return this;
		}

		/**
		 * API name: {@code to_node}
		 */
		public Builder toNode(@Nullable String value) {
			this.toNode = value;
			return this;
		}

		/**
		 * Builds a {@link RerouteParameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteParameters build() {

			return new RerouteParameters(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RerouteParameters
	 */
	public static final JsonpDeserializer<RerouteParameters> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RerouteParameters::setupRerouteParametersDeserializer);

	protected static void setupRerouteParametersDeserializer(DelegatingDeserializer<RerouteParameters.Builder> op) {

		op.add(Builder::allowPrimary, JsonpDeserializer.booleanDeserializer(), "allow_primary");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::shard, JsonpDeserializer.numberDeserializer(), "shard");
		op.add(Builder::fromNode, JsonpDeserializer.stringDeserializer(), "from_node");
		op.add(Builder::toNode, JsonpDeserializer.stringDeserializer(), "to_node");

	}

}
