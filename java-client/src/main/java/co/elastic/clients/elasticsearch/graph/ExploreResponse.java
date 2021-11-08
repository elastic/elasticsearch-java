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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
public class ExploreResponse implements JsonpSerializable {
	private final List<Connection> connections;

	private final List<ShardFailure> failures;

	private final boolean timedOut;

	private final long took;

	private final List<Vertex> vertices;

	// ---------------------------------------------------------------------------------------------

	private ExploreResponse(Builder builder) {

		this.connections = ModelTypeHelper.unmodifiableRequired(builder.connections, this, "connections");
		this.failures = ModelTypeHelper.unmodifiableRequired(builder.failures, this, "failures");
		this.timedOut = ModelTypeHelper.requireNonNull(builder.timedOut, this, "timedOut");
		this.took = ModelTypeHelper.requireNonNull(builder.took, this, "took");
		this.vertices = ModelTypeHelper.unmodifiableRequired(builder.vertices, this, "vertices");

	}

	public static ExploreResponse of(Function<Builder, ObjectBuilder<ExploreResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code connections}
	 */
	public final List<Connection> connections() {
		return this.connections;
	}

	/**
	 * Required - API name: {@code failures}
	 */
	public final List<ShardFailure> failures() {
		return this.failures;
	}

	/**
	 * Required - API name: {@code timed_out}
	 */
	public final boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * Required - API name: {@code took}
	 */
	public final long took() {
		return this.took;
	}

	/**
	 * Required - API name: {@code vertices}
	 */
	public final List<Vertex> vertices() {
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

		if (ModelTypeHelper.isDefined(this.connections)) {
			generator.writeKey("connections");
			generator.writeStartArray();
			for (Connection item0 : this.connections) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (ShardFailure item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		generator.writeKey("took");
		generator.write(this.took);

		if (ModelTypeHelper.isDefined(this.vertices)) {
			generator.writeKey("vertices");
			generator.writeStartArray();
			for (Vertex item0 : this.vertices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExploreResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExploreResponse> {
		private List<Connection> connections;

		private List<ShardFailure> failures;

		private Boolean timedOut;

		private Long took;

		private List<Vertex> vertices;

		/**
		 * Required - API name: {@code connections}
		 */
		public final Builder connections(List<Connection> value) {
			this.connections = value;
			return this;
		}

		/**
		 * Required - API name: {@code connections}
		 */
		public final Builder connections(Connection... value) {
			this.connections = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code connections}
		 */
		@SafeVarargs
		public final Builder connections(Function<Connection.Builder, ObjectBuilder<Connection>>... fns) {
			this.connections = new ArrayList<>(fns.length);
			for (Function<Connection.Builder, ObjectBuilder<Connection>> fn : fns) {
				this.connections.add(fn.apply(new Connection.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code failures}
		 */
		public final Builder failures(List<ShardFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * Required - API name: {@code failures}
		 */
		public final Builder failures(ShardFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code failures}
		 */
		@SafeVarargs
		public final Builder failures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>>... fns) {
			this.failures = new ArrayList<>(fns.length);
			for (Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn : fns) {
				this.failures.add(fn.apply(new ShardFailure.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code timed_out}
		 */
		public final Builder timedOut(boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * Required - API name: {@code took}
		 */
		public final Builder took(long value) {
			this.took = value;
			return this;
		}

		/**
		 * Required - API name: {@code vertices}
		 */
		public final Builder vertices(List<Vertex> value) {
			this.vertices = value;
			return this;
		}

		/**
		 * Required - API name: {@code vertices}
		 */
		public final Builder vertices(Vertex... value) {
			this.vertices = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code vertices}
		 */
		@SafeVarargs
		public final Builder vertices(Function<Vertex.Builder, ObjectBuilder<Vertex>>... fns) {
			this.vertices = new ArrayList<>(fns.length);
			for (Function<Vertex.Builder, ObjectBuilder<Vertex>> fn : fns) {
				this.vertices.add(fn.apply(new Vertex.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link ExploreResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExploreResponse build() {
			_checkSingleUse();

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
