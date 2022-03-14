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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.indices.put_index_template.IndexTemplateMapping;
import co.elastic.clients.json.JsonData;
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
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.simulate_index_template.Request

/**
 * Simulate matching the given index name against the index templates in the
 * system
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.simulate_index_template.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimulateIndexTemplateRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, JsonData> meta;

	@Nullable
	private final Boolean allowAutoCreate;

	private final List<String> composedOf;

	@Nullable
	private final Boolean create;

	@Nullable
	private final DataStreamVisibility dataStream;

	private final List<String> indexPatterns;

	@Nullable
	private final Time masterTimeout;

	private final String name;

	@Nullable
	private final Integer priority;

	@Nullable
	private final IndexTemplateMapping template;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	private SimulateIndexTemplateRequest(Builder builder) {

		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.allowAutoCreate = builder.allowAutoCreate;
		this.composedOf = ApiTypeHelper.unmodifiable(builder.composedOf);
		this.create = builder.create;
		this.dataStream = builder.dataStream;
		this.indexPatterns = ApiTypeHelper.unmodifiable(builder.indexPatterns);
		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.priority = builder.priority;
		this.template = builder.template;
		this.version = builder.version;

	}

	public static SimulateIndexTemplateRequest of(Function<Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code allow_auto_create}
	 */
	@Nullable
	public final Boolean allowAutoCreate() {
		return this.allowAutoCreate;
	}

	/**
	 * API name: {@code composed_of}
	 */
	public final List<String> composedOf() {
		return this.composedOf;
	}

	/**
	 * If <code>true</code>, the template passed in the body is only used if no
	 * existing templates match the same index patterns. If <code>false</code>, the
	 * simulation uses the template with the highest priority. Note that the
	 * template is not permanently added or updated in either case; it is only used
	 * for the simulation.
	 * <p>
	 * API name: {@code create}
	 */
	@Nullable
	public final Boolean create() {
		return this.create;
	}

	/**
	 * API name: {@code data_stream}
	 */
	@Nullable
	public final DataStreamVisibility dataStream() {
		return this.dataStream;
	}

	/**
	 * API name: {@code index_patterns}
	 */
	public final List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - Index or template name to simulate
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code priority}
	 */
	@Nullable
	public final Integer priority() {
		return this.priority;
	}

	/**
	 * API name: {@code template}
	 */
	@Nullable
	public final IndexTemplateMapping template() {
		return this.template;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
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

		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.allowAutoCreate != null) {
			generator.writeKey("allow_auto_create");
			generator.write(this.allowAutoCreate);

		}
		if (ApiTypeHelper.isDefined(this.composedOf)) {
			generator.writeKey("composed_of");
			generator.writeStartArray();
			for (String item0 : this.composedOf) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.dataStream != null) {
			generator.writeKey("data_stream");
			this.dataStream.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.indexPatterns)) {
			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.priority != null) {
			generator.writeKey("priority");
			generator.write(this.priority);

		}
		if (this.template != null) {
			generator.writeKey("template");
			this.template.serialize(generator, mapper);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateIndexTemplateRequest}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SimulateIndexTemplateRequest> {
		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private Boolean allowAutoCreate;

		@Nullable
		private List<String> composedOf;

		@Nullable
		private Boolean create;

		@Nullable
		private DataStreamVisibility dataStream;

		@Nullable
		private List<String> indexPatterns;

		@Nullable
		private Time masterTimeout;

		private String name;

		@Nullable
		private Integer priority;

		@Nullable
		private IndexTemplateMapping template;

		@Nullable
		private Long version;

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * API name: {@code allow_auto_create}
		 */
		public final Builder allowAutoCreate(@Nullable Boolean value) {
			this.allowAutoCreate = value;
			return this;
		}

		/**
		 * API name: {@code composed_of}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>composedOf</code>.
		 */
		public final Builder composedOf(List<String> list) {
			this.composedOf = _listAddAll(this.composedOf, list);
			return this;
		}

		/**
		 * API name: {@code composed_of}
		 * <p>
		 * Adds one or more values to <code>composedOf</code>.
		 */
		public final Builder composedOf(String value, String... values) {
			this.composedOf = _listAdd(this.composedOf, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, the template passed in the body is only used if no
		 * existing templates match the same index patterns. If <code>false</code>, the
		 * simulation uses the template with the highest priority. Note that the
		 * template is not permanently added or updated in either case; it is only used
		 * for the simulation.
		 * <p>
		 * API name: {@code create}
		 */
		public final Builder create(@Nullable Boolean value) {
			this.create = value;
			return this;
		}

		/**
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(@Nullable DataStreamVisibility value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(
				Function<DataStreamVisibility.Builder, ObjectBuilder<DataStreamVisibility>> fn) {
			return this.dataStream(fn.apply(new DataStreamVisibility.Builder()).build());
		}

		/**
		 * API name: {@code index_patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indexPatterns</code>.
		 */
		public final Builder indexPatterns(List<String> list) {
			this.indexPatterns = _listAddAll(this.indexPatterns, list);
			return this;
		}

		/**
		 * API name: {@code index_patterns}
		 * <p>
		 * Adds one or more values to <code>indexPatterns</code>.
		 */
		public final Builder indexPatterns(String value, String... values) {
			this.indexPatterns = _listAdd(this.indexPatterns, value, values);
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Index or template name to simulate
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code priority}
		 */
		public final Builder priority(@Nullable Integer value) {
			this.priority = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public final Builder template(@Nullable IndexTemplateMapping value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public final Builder template(Function<IndexTemplateMapping.Builder, ObjectBuilder<IndexTemplateMapping>> fn) {
			return this.template(fn.apply(new IndexTemplateMapping.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SimulateIndexTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateIndexTemplateRequest build() {
			_checkSingleUse();

			return new SimulateIndexTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateIndexTemplateRequest}
	 */
	public static final JsonpDeserializer<SimulateIndexTemplateRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimulateIndexTemplateRequest::setupSimulateIndexTemplateRequestDeserializer);

	protected static void setupSimulateIndexTemplateRequestDeserializer(
			ObjectDeserializer<SimulateIndexTemplateRequest.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::allowAutoCreate, JsonpDeserializer.booleanDeserializer(), "allow_auto_create");
		op.add(Builder::composedOf, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"composed_of");
		op.add(Builder::dataStream, DataStreamVisibility._DESERIALIZER, "data_stream");
		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");
		op.add(Builder::priority, JsonpDeserializer.integerDeserializer(), "priority");
		op.add(Builder::template, IndexTemplateMapping._DESERIALIZER, "template");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.simulate_index_template}".
	 */
	public static final Endpoint<SimulateIndexTemplateRequest, SimulateIndexTemplateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.simulate_index_template",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/_simulate_index");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, SimulateIndexTemplateResponse._DESERIALIZER);
}
