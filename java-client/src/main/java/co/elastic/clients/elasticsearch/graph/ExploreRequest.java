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
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: graph.explore.Request
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
	private final String timeout;

	private final List<VertexDefinition> vertices;

	// ---------------------------------------------------------------------------------------------

	private ExploreRequest(Builder builder) {

		this.connections = builder.connections;
		this.controls = builder.controls;
		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.query = builder.query;
		this.routing = builder.routing;
		this.timeout = builder.timeout;
		this.vertices = ModelTypeHelper.unmodifiable(builder.vertices);

	}

	public static ExploreRequest of(Function<Builder, ObjectBuilder<ExploreRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code connections}
	 */
	@Nullable
	public final Hop connections() {
		return this.connections;
	}

	/**
	 * API name: {@code controls}
	 */
	@Nullable
	public final ExploreControls controls() {
		return this.controls;
	}

	/**
	 * Required - A comma-separated list of index names to search; use
	 * <code>_all</code> or empty string to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Specific routing value
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
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
		if (ModelTypeHelper.isDefined(this.vertices)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExploreRequest> {
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
		private String timeout;

		@Nullable
		private List<VertexDefinition> vertices;

		/**
		 * API name: {@code connections}
		 */
		public final Builder connections(@Nullable Hop value) {
			this.connections = value;
			return this;
		}

		/**
		 * API name: {@code connections}
		 */
		public final Builder connections(Function<Hop.Builder, ObjectBuilder<Hop>> fn) {
			return this.connections(fn.apply(new Hop.Builder()).build());
		}

		/**
		 * API name: {@code controls}
		 */
		public final Builder controls(@Nullable ExploreControls value) {
			this.controls = value;
			return this;
		}

		/**
		 * API name: {@code controls}
		 */
		public final Builder controls(Function<ExploreControls.Builder, ObjectBuilder<ExploreControls>> fn) {
			return this.controls(fn.apply(new ExploreControls.Builder()).build());
		}

		/**
		 * Required - A comma-separated list of index names to search; use
		 * <code>_all</code> or empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names to search; use
		 * <code>_all</code> or empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Specific routing value
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code vertices}
		 */
		public final Builder vertices(@Nullable List<VertexDefinition> value) {
			this.vertices = value;
			return this;
		}

		/**
		 * API name: {@code vertices}
		 */
		public final Builder vertices(VertexDefinition... value) {
			this.vertices = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code vertices}
		 */
		@SafeVarargs
		public final Builder vertices(Function<VertexDefinition.Builder, ObjectBuilder<VertexDefinition>>... fns) {
			this.vertices = new ArrayList<>(fns.length);
			for (Function<VertexDefinition.Builder, ObjectBuilder<VertexDefinition>> fn : fns) {
				this.vertices.add(fn.apply(new VertexDefinition.Builder()).build());
			}
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
			ExploreRequest::setupExploreRequestDeserializer, Builder::build);

	protected static void setupExploreRequestDeserializer(DelegatingDeserializer<ExploreRequest.Builder> op) {

		op.add(Builder::connections, Hop._DESERIALIZER, "connections");
		op.add(Builder::controls, ExploreControls._DESERIALIZER, "controls");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::vertices, JsonpDeserializer.arrayDeserializer(VertexDefinition._DESERIALIZER), "vertices");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code graph.explore}".
	 */
	public static final Endpoint<ExploreRequest, ExploreResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, ExploreResponse._DESERIALIZER);
}
