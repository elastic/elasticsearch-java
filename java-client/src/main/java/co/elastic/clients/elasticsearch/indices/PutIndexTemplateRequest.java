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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
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

// typedef: indices.put_index_template.Request

/**
 * Creates or updates an index template. Index templates define settings,
 * mappings, and aliases that can be applied automatically to new indices.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.put_index_template.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutIndexTemplateRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, JsonData> meta;

	private final List<String> composedOf;

	@Nullable
	private final Boolean create;

	@Nullable
	private final DataStreamVisibility dataStream;

	private final List<String> indexPatterns;

	private final String name;

	@Nullable
	private final Integer priority;

	@Nullable
	private final IndexTemplateMapping template;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	private PutIndexTemplateRequest(Builder builder) {

		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.composedOf = ApiTypeHelper.unmodifiable(builder.composedOf);
		this.create = builder.create;
		this.dataStream = builder.dataStream;
		this.indexPatterns = ApiTypeHelper.unmodifiable(builder.indexPatterns);
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.priority = builder.priority;
		this.template = builder.template;
		this.version = builder.version;

	}

	public static PutIndexTemplateRequest of(Function<Builder, ObjectBuilder<PutIndexTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Optional user metadata about the index template. May have any contents. This
	 * map is not automatically generated by Elasticsearch.
	 * <p>
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * An ordered list of component template names. Component templates are merged
	 * in the order specified, meaning that the last component template specified
	 * has the highest precedence.
	 * <p>
	 * API name: {@code composed_of}
	 */
	public final List<String> composedOf() {
		return this.composedOf;
	}

	/**
	 * If <code>true</code>, this request cannot replace or update existing index
	 * templates.
	 * <p>
	 * API name: {@code create}
	 */
	@Nullable
	public final Boolean create() {
		return this.create;
	}

	/**
	 * If this object is included, the template is used to create data streams and
	 * their backing indices. Supports an empty object. Data streams require a
	 * matching index template with a <code>data_stream</code> object.
	 * <p>
	 * API name: {@code data_stream}
	 */
	@Nullable
	public final DataStreamVisibility dataStream() {
		return this.dataStream;
	}

	/**
	 * Name of the index template to create.
	 * <p>
	 * API name: {@code index_patterns}
	 */
	public final List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * Required - Index or template name
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Priority to determine index template precedence when a new data stream or
	 * index is created. The index template with the highest priority is chosen. If
	 * no priority is specified the template is treated as though it is of priority
	 * 0 (lowest priority). This number is not automatically generated by
	 * Elasticsearch.
	 * <p>
	 * API name: {@code priority}
	 */
	@Nullable
	public final Integer priority() {
		return this.priority;
	}

	/**
	 * Template to be applied. It may optionally include an <code>aliases</code>,
	 * <code>mappings</code>, or <code>settings</code> configuration.
	 * <p>
	 * API name: {@code template}
	 */
	@Nullable
	public final IndexTemplateMapping template() {
		return this.template;
	}

	/**
	 * Version number used to manage index templates externally. This number is not
	 * automatically generated by Elasticsearch.
	 * <p>
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
	 * Builder for {@link PutIndexTemplateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutIndexTemplateRequest> {
		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private List<String> composedOf;

		@Nullable
		private Boolean create;

		@Nullable
		private DataStreamVisibility dataStream;

		@Nullable
		private List<String> indexPatterns;

		private String name;

		@Nullable
		private Integer priority;

		@Nullable
		private IndexTemplateMapping template;

		@Nullable
		private Long version;

		/**
		 * Optional user metadata about the index template. May have any contents. This
		 * map is not automatically generated by Elasticsearch.
		 * <p>
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * Optional user metadata about the index template. May have any contents. This
		 * map is not automatically generated by Elasticsearch.
		 * <p>
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * An ordered list of component template names. Component templates are merged
		 * in the order specified, meaning that the last component template specified
		 * has the highest precedence.
		 * <p>
		 * API name: {@code composed_of}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>composedOf</code>.
		 */
		public final Builder composedOf(List<String> list) {
			this.composedOf = _listAddAll(this.composedOf, list);
			return this;
		}

		/**
		 * An ordered list of component template names. Component templates are merged
		 * in the order specified, meaning that the last component template specified
		 * has the highest precedence.
		 * <p>
		 * API name: {@code composed_of}
		 * <p>
		 * Adds one or more values to <code>composedOf</code>.
		 */
		public final Builder composedOf(String value, String... values) {
			this.composedOf = _listAdd(this.composedOf, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, this request cannot replace or update existing index
		 * templates.
		 * <p>
		 * API name: {@code create}
		 */
		public final Builder create(@Nullable Boolean value) {
			this.create = value;
			return this;
		}

		/**
		 * If this object is included, the template is used to create data streams and
		 * their backing indices. Supports an empty object. Data streams require a
		 * matching index template with a <code>data_stream</code> object.
		 * <p>
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(@Nullable DataStreamVisibility value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * If this object is included, the template is used to create data streams and
		 * their backing indices. Supports an empty object. Data streams require a
		 * matching index template with a <code>data_stream</code> object.
		 * <p>
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(
				Function<DataStreamVisibility.Builder, ObjectBuilder<DataStreamVisibility>> fn) {
			return this.dataStream(fn.apply(new DataStreamVisibility.Builder()).build());
		}

		/**
		 * Name of the index template to create.
		 * <p>
		 * API name: {@code index_patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indexPatterns</code>.
		 */
		public final Builder indexPatterns(List<String> list) {
			this.indexPatterns = _listAddAll(this.indexPatterns, list);
			return this;
		}

		/**
		 * Name of the index template to create.
		 * <p>
		 * API name: {@code index_patterns}
		 * <p>
		 * Adds one or more values to <code>indexPatterns</code>.
		 */
		public final Builder indexPatterns(String value, String... values) {
			this.indexPatterns = _listAdd(this.indexPatterns, value, values);
			return this;
		}

		/**
		 * Required - Index or template name
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Priority to determine index template precedence when a new data stream or
		 * index is created. The index template with the highest priority is chosen. If
		 * no priority is specified the template is treated as though it is of priority
		 * 0 (lowest priority). This number is not automatically generated by
		 * Elasticsearch.
		 * <p>
		 * API name: {@code priority}
		 */
		public final Builder priority(@Nullable Integer value) {
			this.priority = value;
			return this;
		}

		/**
		 * Template to be applied. It may optionally include an <code>aliases</code>,
		 * <code>mappings</code>, or <code>settings</code> configuration.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(@Nullable IndexTemplateMapping value) {
			this.template = value;
			return this;
		}

		/**
		 * Template to be applied. It may optionally include an <code>aliases</code>,
		 * <code>mappings</code>, or <code>settings</code> configuration.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(Function<IndexTemplateMapping.Builder, ObjectBuilder<IndexTemplateMapping>> fn) {
			return this.template(fn.apply(new IndexTemplateMapping.Builder()).build());
		}

		/**
		 * Version number used to manage index templates externally. This number is not
		 * automatically generated by Elasticsearch.
		 * <p>
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
		 * Builds a {@link PutIndexTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutIndexTemplateRequest build() {
			_checkSingleUse();

			return new PutIndexTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutIndexTemplateRequest}
	 */
	public static final JsonpDeserializer<PutIndexTemplateRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutIndexTemplateRequest::setupPutIndexTemplateRequestDeserializer);

	protected static void setupPutIndexTemplateRequestDeserializer(
			ObjectDeserializer<PutIndexTemplateRequest.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
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
	 * Endpoint "{@code indices.put_index_template}".
	 */
	public static final Endpoint<PutIndexTemplateRequest, PutIndexTemplateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.put_index_template",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutIndexTemplateResponse._DESERIALIZER);
}
