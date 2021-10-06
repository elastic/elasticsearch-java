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

package co.elastic.clients.elasticsearch.indices.segments;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.segments.ShardSegmentRouting
@JsonpDeserializable
public final class ShardSegmentRouting implements JsonpSerializable {
	private final String node;

	private final boolean primary;

	private final String state;

	// ---------------------------------------------------------------------------------------------

	public ShardSegmentRouting(Builder builder) {

		this.node = Objects.requireNonNull(builder.node, "node");
		this.primary = Objects.requireNonNull(builder.primary, "primary");
		this.state = Objects.requireNonNull(builder.state, "state");

	}

	public ShardSegmentRouting(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code node}
	 */
	public String node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code primary}
	 */
	public boolean primary() {
		return this.primary;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public String state() {
		return this.state;
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

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("primary");
		generator.write(this.primary);

		generator.writeKey("state");
		generator.write(this.state);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardSegmentRouting}.
	 */
	public static class Builder implements ObjectBuilder<ShardSegmentRouting> {
		private String node;

		private Boolean primary;

		private String state;

		/**
		 * Required - API name: {@code node}
		 */
		public Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - API name: {@code primary}
		 */
		public Builder primary(boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public Builder state(String value) {
			this.state = value;
			return this;
		}

		/**
		 * Builds a {@link ShardSegmentRouting}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardSegmentRouting build() {

			return new ShardSegmentRouting(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardSegmentRouting}
	 */
	public static final JsonpDeserializer<ShardSegmentRouting> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardSegmentRouting::setupShardSegmentRoutingDeserializer, Builder::build);

	protected static void setupShardSegmentRoutingDeserializer(DelegatingDeserializer<ShardSegmentRouting.Builder> op) {

		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");

	}

}
