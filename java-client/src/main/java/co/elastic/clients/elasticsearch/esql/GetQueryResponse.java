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

package co.elastic.clients.elasticsearch.esql;

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
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: esql.get_query.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#esql.get_query.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetQueryResponse implements JsonpSerializable {
	private final long id;

	private final String node;

	private final long startTimeMillis;

	private final long runningTimeNanos;

	private final String query;

	private final String coordinatingNode;

	private final List<String> dataNodes;

	// ---------------------------------------------------------------------------------------------

	private GetQueryResponse(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id", 0);
		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
		this.startTimeMillis = ApiTypeHelper.requireNonNull(builder.startTimeMillis, this, "startTimeMillis", 0);
		this.runningTimeNanos = ApiTypeHelper.requireNonNull(builder.runningTimeNanos, this, "runningTimeNanos", 0);
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.coordinatingNode = ApiTypeHelper.requireNonNull(builder.coordinatingNode, this, "coordinatingNode");
		this.dataNodes = ApiTypeHelper.unmodifiableRequired(builder.dataNodes, this, "dataNodes");

	}

	public static GetQueryResponse of(Function<Builder, ObjectBuilder<GetQueryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final long id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final String node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code start_time_millis}
	 */
	public final long startTimeMillis() {
		return this.startTimeMillis;
	}

	/**
	 * Required - API name: {@code running_time_nanos}
	 */
	public final long runningTimeNanos() {
		return this.runningTimeNanos;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final String query() {
		return this.query;
	}

	/**
	 * Required - API name: {@code coordinating_node}
	 */
	public final String coordinatingNode() {
		return this.coordinatingNode;
	}

	/**
	 * Required - API name: {@code data_nodes}
	 */
	public final List<String> dataNodes() {
		return this.dataNodes;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("start_time_millis");
		generator.write(this.startTimeMillis);

		generator.writeKey("running_time_nanos");
		generator.write(this.runningTimeNanos);

		generator.writeKey("query");
		generator.write(this.query);

		generator.writeKey("coordinating_node");
		generator.write(this.coordinatingNode);

		if (ApiTypeHelper.isDefined(this.dataNodes)) {
			generator.writeKey("data_nodes");
			generator.writeStartArray();
			for (String item0 : this.dataNodes) {
				generator.write(item0);

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
	 * Builder for {@link GetQueryResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetQueryResponse> {
		private Long id;

		private String node;

		private Long startTimeMillis;

		private Long runningTimeNanos;

		private String query;

		private String coordinatingNode;

		private List<String> dataNodes;

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(long value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - API name: {@code start_time_millis}
		 */
		public final Builder startTimeMillis(long value) {
			this.startTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code running_time_nanos}
		 */
		public final Builder runningTimeNanos(long value) {
			this.runningTimeNanos = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code coordinating_node}
		 */
		public final Builder coordinatingNode(String value) {
			this.coordinatingNode = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_nodes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dataNodes</code>.
		 */
		public final Builder dataNodes(List<String> list) {
			this.dataNodes = _listAddAll(this.dataNodes, list);
			return this;
		}

		/**
		 * Required - API name: {@code data_nodes}
		 * <p>
		 * Adds one or more values to <code>dataNodes</code>.
		 */
		public final Builder dataNodes(String value, String... values) {
			this.dataNodes = _listAdd(this.dataNodes, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetQueryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetQueryResponse build() {
			_checkSingleUse();

			return new GetQueryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetQueryResponse}
	 */
	public static final JsonpDeserializer<GetQueryResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetQueryResponse::setupGetQueryResponseDeserializer);

	protected static void setupGetQueryResponseDeserializer(ObjectDeserializer<GetQueryResponse.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.longDeserializer(), "id");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::startTimeMillis, JsonpDeserializer.longDeserializer(), "start_time_millis");
		op.add(Builder::runningTimeNanos, JsonpDeserializer.longDeserializer(), "running_time_nanos");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::coordinatingNode, JsonpDeserializer.stringDeserializer(), "coordinating_node");
		op.add(Builder::dataNodes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"data_nodes");

	}

}
