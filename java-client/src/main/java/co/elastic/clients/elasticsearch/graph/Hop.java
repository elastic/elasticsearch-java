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

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: graph._types.Hop
@JsonpDeserializable
public final class Hop implements JsonpSerializable {
	@Nullable
	private final Hop connections;

	private final Query query;

	private final List<VertexDefinition> vertices;

	// ---------------------------------------------------------------------------------------------

	public Hop(Builder builder) {

		this.connections = builder.connections;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.vertices = ModelTypeHelper.unmodifiableNonNull(builder.vertices, "vertices");

	}

	public Hop(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code connections}
	 */
	@Nullable
	public Hop connections() {
		return this.connections;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public Query query() {
		return this.query;
	}

	/**
	 * Required - API name: {@code vertices}
	 */
	public List<VertexDefinition> vertices() {
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

		if (this.connections != null) {

			generator.writeKey("connections");
			this.connections.serialize(generator, mapper);

		}

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		generator.writeKey("vertices");
		generator.writeStartArray();
		for (VertexDefinition item0 : this.vertices) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Hop}.
	 */
	public static class Builder implements ObjectBuilder<Hop> {
		@Nullable
		private Hop connections;

		private Query query;

		private List<VertexDefinition> vertices;

		/**
		 * API name: {@code connections}
		 */
		public Builder connections(@Nullable Hop value) {
			this.connections = value;
			return this;
		}

		/**
		 * API name: {@code connections}
		 */
		public Builder connections(Function<Hop.Builder, ObjectBuilder<Hop>> fn) {
			return this.connections(fn.apply(new Hop.Builder()).build());
		}

		/**
		 * Required - API name: {@code query}
		 */
		public Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Required - API name: {@code vertices}
		 */
		public Builder vertices(List<VertexDefinition> value) {
			this.vertices = value;
			return this;
		}

		/**
		 * Required - API name: {@code vertices}
		 */
		public Builder vertices(VertexDefinition... value) {
			this.vertices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #vertices(List)}, creating the list if needed.
		 */
		public Builder addVertices(VertexDefinition value) {
			if (this.vertices == null) {
				this.vertices = new ArrayList<>();
			}
			this.vertices.add(value);
			return this;
		}

		/**
		 * Set {@link #vertices(List)} to a singleton list.
		 */
		public Builder vertices(Function<VertexDefinition.Builder, ObjectBuilder<VertexDefinition>> fn) {
			return this.vertices(fn.apply(new VertexDefinition.Builder()).build());
		}

		/**
		 * Add a value to {@link #vertices(List)}, creating the list if needed.
		 */
		public Builder addVertices(Function<VertexDefinition.Builder, ObjectBuilder<VertexDefinition>> fn) {
			return this.addVertices(fn.apply(new VertexDefinition.Builder()).build());
		}

		/**
		 * Builds a {@link Hop}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Hop build() {

			return new Hop(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Hop}
	 */
	public static final JsonpDeserializer<Hop> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Hop::setupHopDeserializer, Builder::build);

	protected static void setupHopDeserializer(DelegatingDeserializer<Hop.Builder> op) {

		op.add(Builder::connections, Hop._DESERIALIZER, "connections");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::vertices, JsonpDeserializer.arrayDeserializer(VertexDefinition._DESERIALIZER), "vertices");

	}

}
