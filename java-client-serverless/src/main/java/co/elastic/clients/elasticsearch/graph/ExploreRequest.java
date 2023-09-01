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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: graph.explore.Request

/**
 * Extracts and summarizes information about the documents and terms in an
 * Elasticsearch data stream or index.
 * 
 * @see <a href="../doc-files/api-spec.html#graph.explore.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExploreRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Hop connections;

	@Nullable
	private final ExploreControls controls;

	private final List<String> index;

	@Nullable
	private final Query query;

	@Nullable
	private final String routing;

	@Nullable
	private final Time timeout;

	private final List<VertexDefinition> vertices;

	// ---------------------------------------------------------------------------------------------

	private ExploreRequest(Builder builder) {

		this.connections = builder.connections;
		this.controls = builder.controls;
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.query = builder.query;
		this.routing = builder.routing;
		this.timeout = builder.timeout;
		this.vertices = ApiTypeHelper.unmodifiable(builder.vertices);

	}

	public static ExploreRequest of(Function<Builder, ObjectBuilder<ExploreRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies or more fields from which you want to extract terms that are
	 * associated with the specified vertices.
	 * <p>
	 * API name: {@code connections}
	 */
	@Nullable
	public final Hop connections() {
		return this.connections;
	}

	/**
	 * Direct the Graph API how to build the graph.
	 * <p>
	 * API name: {@code controls}
	 */
	@Nullable
	public final ExploreControls controls() {
		return this.controls;
	}

	/**
	 * Required - Name of the index.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * A seed query that identifies the documents of interest. Can be any valid
	 * Elasticsearch query.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Custom value used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Specifies the period of time to wait for a response from each shard. If no
	 * response is received before the timeout expires, the request fails and
	 * returns an error. Defaults to no timeout.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Specifies one or more fields that contain the terms you want to include in
	 * the graph as vertices.
	 * <p>
	 * API name: {@code vertices}
	 */
	public final List<VertexDefinition> vertices() {
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
		if (this.controls != null) {
			generator.writeKey("controls");
			this.controls.serialize(generator, mapper);

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.vertices)) {
			generator.writeKey("vertices");
			generator.writeStartArray();
			for (VertexDefinition item0 : this.vertices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExploreRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<ExploreRequest> {
		@Nullable
		private Hop connections;

		@Nullable
		private ExploreControls controls;

		private List<String> index;

		@Nullable
		private Query query;

		@Nullable
		private String routing;

		@Nullable
		private Time timeout;

		@Nullable
		private List<VertexDefinition> vertices;

		/**
		 * Specifies or more fields from which you want to extract terms that are
		 * associated with the specified vertices.
		 * <p>
		 * API name: {@code connections}
		 */
		public final Builder connections(@Nullable Hop value) {
			this.connections = value;
			return this;
		}

		/**
		 * Specifies or more fields from which you want to extract terms that are
		 * associated with the specified vertices.
		 * <p>
		 * API name: {@code connections}
		 */
		public final Builder connections(Function<Hop.Builder, ObjectBuilder<Hop>> fn) {
			return this.connections(fn.apply(new Hop.Builder()).build());
		}

		/**
		 * Direct the Graph API how to build the graph.
		 * <p>
		 * API name: {@code controls}
		 */
		public final Builder controls(@Nullable ExploreControls value) {
			this.controls = value;
			return this;
		}

		/**
		 * Direct the Graph API how to build the graph.
		 * <p>
		 * API name: {@code controls}
		 */
		public final Builder controls(Function<ExploreControls.Builder, ObjectBuilder<ExploreControls>> fn) {
			return this.controls(fn.apply(new ExploreControls.Builder()).build());
		}

		/**
		 * Required - Name of the index.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - Name of the index.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * A seed query that identifies the documents of interest. Can be any valid
		 * Elasticsearch query.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * A seed query that identifies the documents of interest. Can be any valid
		 * Elasticsearch query.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Custom value used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Specifies the period of time to wait for a response from each shard. If no
		 * response is received before the timeout expires, the request fails and
		 * returns an error. Defaults to no timeout.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Specifies the period of time to wait for a response from each shard. If no
		 * response is received before the timeout expires, the request fails and
		 * returns an error. Defaults to no timeout.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Specifies one or more fields that contain the terms you want to include in
		 * the graph as vertices.
		 * <p>
		 * API name: {@code vertices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>vertices</code>.
		 */
		public final Builder vertices(List<VertexDefinition> list) {
			this.vertices = _listAddAll(this.vertices, list);
			return this;
		}

		/**
		 * Specifies one or more fields that contain the terms you want to include in
		 * the graph as vertices.
		 * <p>
		 * API name: {@code vertices}
		 * <p>
		 * Adds one or more values to <code>vertices</code>.
		 */
		public final Builder vertices(VertexDefinition value, VertexDefinition... values) {
			this.vertices = _listAdd(this.vertices, value, values);
			return this;
		}

		/**
		 * Specifies one or more fields that contain the terms you want to include in
		 * the graph as vertices.
		 * <p>
		 * API name: {@code vertices}
		 * <p>
		 * Adds a value to <code>vertices</code> using a builder lambda.
		 */
		public final Builder vertices(Function<VertexDefinition.Builder, ObjectBuilder<VertexDefinition>> fn) {
			return vertices(fn.apply(new VertexDefinition.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExploreRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExploreRequest build() {
			_checkSingleUse();

			return new ExploreRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExploreRequest}
	 */
	public static final JsonpDeserializer<ExploreRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExploreRequest::setupExploreRequestDeserializer);

	protected static void setupExploreRequestDeserializer(ObjectDeserializer<ExploreRequest.Builder> op) {

		op.add(Builder::connections, Hop._DESERIALIZER, "connections");
		op.add(Builder::controls, ExploreControls._DESERIALIZER, "controls");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::vertices, JsonpDeserializer.arrayDeserializer(VertexDefinition._DESERIALIZER), "vertices");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code graph.explore}".
	 */
	public static final Endpoint<ExploreRequest, ExploreResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/graph.explore",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_graph");
					buf.append("/explore");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, ExploreResponse._DESERIALIZER);
}
