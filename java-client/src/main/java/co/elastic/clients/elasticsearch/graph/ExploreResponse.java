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

package co.elastic.clients.elasticsearch.graph;

import co.elastic.clients.elasticsearch._types.ShardFailure;
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
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: graph.explore.Response
@JsonpDeserializable
public final class ExploreResponse implements JsonpSerializable {
	private final List<Connection> connections;

	private final List<ShardFailure> failures;

	private final Boolean timedOut;

	private final Long took;

	private final List<Vertex> vertices;

	// ---------------------------------------------------------------------------------------------

	public ExploreResponse(Builder builder) {

		this.connections = Objects.requireNonNull(builder.connections, "connections");
		this.failures = Objects.requireNonNull(builder.failures, "failures");
		this.timedOut = Objects.requireNonNull(builder.timedOut, "timed_out");
		this.took = Objects.requireNonNull(builder.took, "took");
		this.vertices = Objects.requireNonNull(builder.vertices, "vertices");

	}

	/**
	 * API name: {@code connections}
	 */
	public List<Connection> connections() {
		return this.connections;
	}

	/**
	 * API name: {@code failures}
	 */
	public List<ShardFailure> failures() {
		return this.failures;
	}

	/**
	 * API name: {@code timed_out}
	 */
	public Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code took}
	 */
	public Long took() {
		return this.took;
	}

	/**
	 * API name: {@code vertices}
	 */
	public List<Vertex> vertices() {
		return this.vertices;
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

		generator.writeKey("connections");
		generator.writeStartArray();
		for (Connection item0 : this.connections) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("failures");
		generator.writeStartArray();
		for (ShardFailure item0 : this.failures) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		generator.writeKey("took");
		generator.write(this.took);

		generator.writeKey("vertices");
		generator.writeStartArray();
		for (Vertex item0 : this.vertices) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExploreResponse}.
	 */
	public static class Builder implements ObjectBuilder<ExploreResponse> {
		private List<Connection> connections;

		private List<ShardFailure> failures;

		private Boolean timedOut;

		private Long took;

		private List<Vertex> vertices;

		/**
		 * API name: {@code connections}
		 */
		public Builder connections(List<Connection> value) {
			this.connections = value;
			return this;
		}

		/**
		 * API name: {@code connections}
		 */
		public Builder connections(Connection... value) {
			this.connections = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #connections(List)}, creating the list if needed.
		 */
		public Builder addConnections(Connection value) {
			if (this.connections == null) {
				this.connections = new ArrayList<>();
			}
			this.connections.add(value);
			return this;
		}

		/**
		 * Set {@link #connections(List)} to a singleton list.
		 */
		public Builder connections(Function<Connection.Builder, ObjectBuilder<Connection>> fn) {
			return this.connections(fn.apply(new Connection.Builder()).build());
		}

		/**
		 * Add a value to {@link #connections(List)}, creating the list if needed.
		 */
		public Builder addConnections(Function<Connection.Builder, ObjectBuilder<Connection>> fn) {
			return this.addConnections(fn.apply(new Connection.Builder()).build());
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(List<ShardFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(ShardFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(ShardFailure value) {
			if (this.failures == null) {
				this.failures = new ArrayList<>();
			}
			this.failures.add(value);
			return this;
		}

		/**
		 * Set {@link #failures(List)} to a singleton list.
		 */
		public Builder failures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.failures(fn.apply(new ShardFailure.Builder()).build());
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.addFailures(fn.apply(new ShardFailure.Builder()).build());
		}

		/**
		 * API name: {@code timed_out}
		 */
		public Builder timedOut(Boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public Builder took(Long value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code vertices}
		 */
		public Builder vertices(List<Vertex> value) {
			this.vertices = value;
			return this;
		}

		/**
		 * API name: {@code vertices}
		 */
		public Builder vertices(Vertex... value) {
			this.vertices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #vertices(List)}, creating the list if needed.
		 */
		public Builder addVertices(Vertex value) {
			if (this.vertices == null) {
				this.vertices = new ArrayList<>();
			}
			this.vertices.add(value);
			return this;
		}

		/**
		 * Set {@link #vertices(List)} to a singleton list.
		 */
		public Builder vertices(Function<Vertex.Builder, ObjectBuilder<Vertex>> fn) {
			return this.vertices(fn.apply(new Vertex.Builder()).build());
		}

		/**
		 * Add a value to {@link #vertices(List)}, creating the list if needed.
		 */
		public Builder addVertices(Function<Vertex.Builder, ObjectBuilder<Vertex>> fn) {
			return this.addVertices(fn.apply(new Vertex.Builder()).build());
		}

		/**
		 * Builds a {@link ExploreResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExploreResponse build() {

			return new ExploreResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExploreResponse}
	 */
	public static final JsonpDeserializer<ExploreResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExploreResponse::setupExploreResponseDeserializer, Builder::build);

	protected static void setupExploreResponseDeserializer(DelegatingDeserializer<ExploreResponse.Builder> op) {

		op.add(Builder::connections, JsonpDeserializer.arrayDeserializer(Connection._DESERIALIZER), "connections");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ShardFailure._DESERIALIZER), "failures");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::vertices, JsonpDeserializer.arrayDeserializer(Vertex._DESERIALIZER), "vertices");

	}

}
