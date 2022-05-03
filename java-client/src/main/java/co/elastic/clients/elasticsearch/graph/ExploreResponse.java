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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: graph.explore.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#graph.explore.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExploreResponse implements JsonpSerializable {
	private final List<Connection> connections;

	private final List<ShardFailure> failures;

	private final boolean timedOut;

	private final long took;

	private final List<Vertex> vertices;

	// ---------------------------------------------------------------------------------------------

	private ExploreResponse(Builder builder) {

		this.connections = ApiTypeHelper.unmodifiableRequired(builder.connections, this, "connections");
		this.failures = ApiTypeHelper.unmodifiableRequired(builder.failures, this, "failures");
		this.timedOut = ApiTypeHelper.requireNonNull(builder.timedOut, this, "timedOut");
		this.took = ApiTypeHelper.requireNonNull(builder.took, this, "took");
		this.vertices = ApiTypeHelper.unmodifiableRequired(builder.vertices, this, "vertices");

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

		if (ApiTypeHelper.isDefined(this.connections)) {
			generator.writeKey("connections");
			generator.writeStartArray();
			for (Connection item0 : this.connections) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.failures)) {
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

		if (ApiTypeHelper.isDefined(this.vertices)) {
			generator.writeKey("vertices");
			generator.writeStartArray();
			for (Vertex item0 : this.vertices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExploreResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ExploreResponse> {
		private List<Connection> connections;

		private List<ShardFailure> failures;

		private Boolean timedOut;

		private Long took;

		private List<Vertex> vertices;

		/**
		 * Required - API name: {@code connections}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>connections</code>.
		 */
		public final Builder connections(List<Connection> list) {
			this.connections = _listAddAll(this.connections, list);
			return this;
		}

		/**
		 * Required - API name: {@code connections}
		 * <p>
		 * Adds one or more values to <code>connections</code>.
		 */
		public final Builder connections(Connection value, Connection... values) {
			this.connections = _listAdd(this.connections, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code connections}
		 * <p>
		 * Adds a value to <code>connections</code> using a builder lambda.
		 */
		public final Builder connections(Function<Connection.Builder, ObjectBuilder<Connection>> fn) {
			return connections(fn.apply(new Connection.Builder()).build());
		}

		/**
		 * Required - API name: {@code failures}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>failures</code>.
		 */
		public final Builder failures(List<ShardFailure> list) {
			this.failures = _listAddAll(this.failures, list);
			return this;
		}

		/**
		 * Required - API name: {@code failures}
		 * <p>
		 * Adds one or more values to <code>failures</code>.
		 */
		public final Builder failures(ShardFailure value, ShardFailure... values) {
			this.failures = _listAdd(this.failures, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code failures}
		 * <p>
		 * Adds a value to <code>failures</code> using a builder lambda.
		 */
		public final Builder failures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return failures(fn.apply(new ShardFailure.Builder()).build());
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>vertices</code>.
		 */
		public final Builder vertices(List<Vertex> list) {
			this.vertices = _listAddAll(this.vertices, list);
			return this;
		}

		/**
		 * Required - API name: {@code vertices}
		 * <p>
		 * Adds one or more values to <code>vertices</code>.
		 */
		public final Builder vertices(Vertex value, Vertex... values) {
			this.vertices = _listAdd(this.vertices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code vertices}
		 * <p>
		 * Adds a value to <code>vertices</code> using a builder lambda.
		 */
		public final Builder vertices(Function<Vertex.Builder, ObjectBuilder<Vertex>> fn) {
			return vertices(fn.apply(new Vertex.Builder()).build());
		}

		@Override
		protected Builder self() {
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
			ExploreResponse::setupExploreResponseDeserializer);

	protected static void setupExploreResponseDeserializer(ObjectDeserializer<ExploreResponse.Builder> op) {

		op.add(Builder::connections, JsonpDeserializer.arrayDeserializer(Connection._DESERIALIZER), "connections");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ShardFailure._DESERIALIZER), "failures");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::vertices, JsonpDeserializer.arrayDeserializer(Vertex._DESERIALIZER), "vertices");

	}

}
