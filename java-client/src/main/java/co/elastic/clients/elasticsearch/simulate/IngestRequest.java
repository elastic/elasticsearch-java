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

package co.elastic.clients.elasticsearch.simulate;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch.cluster.ComponentTemplateNode;
import co.elastic.clients.elasticsearch.indices.IndexTemplate;
import co.elastic.clients.elasticsearch.ingest.Document;
import co.elastic.clients.elasticsearch.ingest.Pipeline;
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

// typedef: simulate.ingest.Request

/**
 * Simulate data ingestion.
 * <p>
 * Run ingest pipelines against a set of provided documents, optionally with
 * substitute pipeline definitions, to simulate ingesting data into an index.
 * <p>
 * This API is meant to be used for troubleshooting or pipeline development, as
 * it does not actually index any data into Elasticsearch.
 * <p>
 * The API runs the default and final pipeline for that index against a set of
 * documents provided in the body of the request. If a pipeline contains a
 * reroute processor, it follows that reroute processor to the new index,
 * running that index's pipelines as well the same way that a non-simulated
 * ingest would. No data is indexed into Elasticsearch. Instead, the transformed
 * document is returned, along with the list of pipelines that have been run and
 * the name of the index where the document would have been indexed if this were
 * not a simulation. The transformed document is validated against the mappings
 * that would apply to this index, and any validation error is reported in the
 * result.
 * <p>
 * This API differs from the simulate pipeline API in that you specify a single
 * pipeline for that API, and it runs only that one pipeline. The simulate
 * pipeline API is more useful for developing a single pipeline, while the
 * simulate ingest API is more useful for troubleshooting the interaction of the
 * various pipelines that get applied when ingesting into an index.
 * <p>
 * By default, the pipeline definitions that are currently in the system are
 * used. However, you can supply substitute pipeline definitions in the body of
 * the request. These will be used in place of the pipeline definitions that are
 * already in the system. This can be used to replace existing pipeline
 * definitions or to create new ones. The pipeline substitutions are used only
 * within this request.
 * 
 * @see <a href="../doc-files/api-spec.html#simulate.ingest.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class IngestRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, ComponentTemplateNode> componentTemplateSubstitutions;

	private final List<Document> docs;

	@Nullable
	private final String index;

	private final Map<String, IndexTemplate> indexTemplateSubstitutions;

	@Nullable
	private final TypeMapping mappingAddition;

	@Nullable
	private final String pipeline;

	private final Map<String, Pipeline> pipelineSubstitutions;

	// ---------------------------------------------------------------------------------------------

	private IngestRequest(Builder builder) {

		this.componentTemplateSubstitutions = ApiTypeHelper.unmodifiable(builder.componentTemplateSubstitutions);
		this.docs = ApiTypeHelper.unmodifiableRequired(builder.docs, this, "docs");
		this.index = builder.index;
		this.indexTemplateSubstitutions = ApiTypeHelper.unmodifiable(builder.indexTemplateSubstitutions);
		this.mappingAddition = builder.mappingAddition;
		this.pipeline = builder.pipeline;
		this.pipelineSubstitutions = ApiTypeHelper.unmodifiable(builder.pipelineSubstitutions);

	}

	public static IngestRequest of(Function<Builder, ObjectBuilder<IngestRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A map of component template names to substitute component template definition
	 * objects.
	 * <p>
	 * API name: {@code component_template_substitutions}
	 */
	public final Map<String, ComponentTemplateNode> componentTemplateSubstitutions() {
		return this.componentTemplateSubstitutions;
	}

	/**
	 * Required - Sample documents to test in the pipeline.
	 * <p>
	 * API name: {@code docs}
	 */
	public final List<Document> docs() {
		return this.docs;
	}

	/**
	 * The index to simulate ingesting into. This value can be overridden by
	 * specifying an index on each document. If you specify this parameter in the
	 * request path, it is used for any documents that do not explicitly specify an
	 * index argument.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * A map of index template names to substitute index template definition
	 * objects.
	 * <p>
	 * API name: {@code index_template_substitutions}
	 */
	public final Map<String, IndexTemplate> indexTemplateSubstitutions() {
		return this.indexTemplateSubstitutions;
	}

	/**
	 * API name: {@code mapping_addition}
	 */
	@Nullable
	public final TypeMapping mappingAddition() {
		return this.mappingAddition;
	}

	/**
	 * The pipeline to use as the default pipeline. This value can be used to
	 * override the default pipeline of the index.
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
	}

	/**
	 * Pipelines to test. If you don’t specify the <code>pipeline</code> request
	 * path parameter, this parameter is required. If you specify both this and the
	 * request path parameter, the API only uses the request path parameter.
	 * <p>
	 * API name: {@code pipeline_substitutions}
	 */
	public final Map<String, Pipeline> pipelineSubstitutions() {
		return this.pipelineSubstitutions;
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

		if (ApiTypeHelper.isDefined(this.componentTemplateSubstitutions)) {
			generator.writeKey("component_template_substitutions");
			generator.writeStartObject();
			for (Map.Entry<String, ComponentTemplateNode> item0 : this.componentTemplateSubstitutions.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (Document item0 : this.docs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.indexTemplateSubstitutions)) {
			generator.writeKey("index_template_substitutions");
			generator.writeStartObject();
			for (Map.Entry<String, IndexTemplate> item0 : this.indexTemplateSubstitutions.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.mappingAddition != null) {
			generator.writeKey("mapping_addition");
			this.mappingAddition.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.pipelineSubstitutions)) {
			generator.writeKey("pipeline_substitutions");
			generator.writeStartObject();
			for (Map.Entry<String, Pipeline> item0 : this.pipelineSubstitutions.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IngestRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<IngestRequest> {
		@Nullable
		private Map<String, ComponentTemplateNode> componentTemplateSubstitutions;

		private List<Document> docs;

		@Nullable
		private String index;

		@Nullable
		private Map<String, IndexTemplate> indexTemplateSubstitutions;

		@Nullable
		private TypeMapping mappingAddition;

		@Nullable
		private String pipeline;

		@Nullable
		private Map<String, Pipeline> pipelineSubstitutions;

		/**
		 * A map of component template names to substitute component template definition
		 * objects.
		 * <p>
		 * API name: {@code component_template_substitutions}
		 * <p>
		 * Adds all entries of <code>map</code> to
		 * <code>componentTemplateSubstitutions</code>.
		 */
		public final Builder componentTemplateSubstitutions(Map<String, ComponentTemplateNode> map) {
			this.componentTemplateSubstitutions = _mapPutAll(this.componentTemplateSubstitutions, map);
			return this;
		}

		/**
		 * A map of component template names to substitute component template definition
		 * objects.
		 * <p>
		 * API name: {@code component_template_substitutions}
		 * <p>
		 * Adds an entry to <code>componentTemplateSubstitutions</code>.
		 */
		public final Builder componentTemplateSubstitutions(String key, ComponentTemplateNode value) {
			this.componentTemplateSubstitutions = _mapPut(this.componentTemplateSubstitutions, key, value);
			return this;
		}

		/**
		 * A map of component template names to substitute component template definition
		 * objects.
		 * <p>
		 * API name: {@code component_template_substitutions}
		 * <p>
		 * Adds an entry to <code>componentTemplateSubstitutions</code> using a builder
		 * lambda.
		 */
		public final Builder componentTemplateSubstitutions(String key,
				Function<ComponentTemplateNode.Builder, ObjectBuilder<ComponentTemplateNode>> fn) {
			return componentTemplateSubstitutions(key, fn.apply(new ComponentTemplateNode.Builder()).build());
		}

		/**
		 * Required - Sample documents to test in the pipeline.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docs</code>.
		 */
		public final Builder docs(List<Document> list) {
			this.docs = _listAddAll(this.docs, list);
			return this;
		}

		/**
		 * Required - Sample documents to test in the pipeline.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds one or more values to <code>docs</code>.
		 */
		public final Builder docs(Document value, Document... values) {
			this.docs = _listAdd(this.docs, value, values);
			return this;
		}

		/**
		 * Required - Sample documents to test in the pipeline.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds a value to <code>docs</code> using a builder lambda.
		 */
		public final Builder docs(Function<Document.Builder, ObjectBuilder<Document>> fn) {
			return docs(fn.apply(new Document.Builder()).build());
		}

		/**
		 * The index to simulate ingesting into. This value can be overridden by
		 * specifying an index on each document. If you specify this parameter in the
		 * request path, it is used for any documents that do not explicitly specify an
		 * index argument.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * A map of index template names to substitute index template definition
		 * objects.
		 * <p>
		 * API name: {@code index_template_substitutions}
		 * <p>
		 * Adds all entries of <code>map</code> to
		 * <code>indexTemplateSubstitutions</code>.
		 */
		public final Builder indexTemplateSubstitutions(Map<String, IndexTemplate> map) {
			this.indexTemplateSubstitutions = _mapPutAll(this.indexTemplateSubstitutions, map);
			return this;
		}

		/**
		 * A map of index template names to substitute index template definition
		 * objects.
		 * <p>
		 * API name: {@code index_template_substitutions}
		 * <p>
		 * Adds an entry to <code>indexTemplateSubstitutions</code>.
		 */
		public final Builder indexTemplateSubstitutions(String key, IndexTemplate value) {
			this.indexTemplateSubstitutions = _mapPut(this.indexTemplateSubstitutions, key, value);
			return this;
		}

		/**
		 * A map of index template names to substitute index template definition
		 * objects.
		 * <p>
		 * API name: {@code index_template_substitutions}
		 * <p>
		 * Adds an entry to <code>indexTemplateSubstitutions</code> using a builder
		 * lambda.
		 */
		public final Builder indexTemplateSubstitutions(String key,
				Function<IndexTemplate.Builder, ObjectBuilder<IndexTemplate>> fn) {
			return indexTemplateSubstitutions(key, fn.apply(new IndexTemplate.Builder()).build());
		}

		/**
		 * API name: {@code mapping_addition}
		 */
		public final Builder mappingAddition(@Nullable TypeMapping value) {
			this.mappingAddition = value;
			return this;
		}

		/**
		 * API name: {@code mapping_addition}
		 */
		public final Builder mappingAddition(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappingAddition(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * The pipeline to use as the default pipeline. This value can be used to
		 * override the default pipeline of the index.
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * Pipelines to test. If you don’t specify the <code>pipeline</code> request
		 * path parameter, this parameter is required. If you specify both this and the
		 * request path parameter, the API only uses the request path parameter.
		 * <p>
		 * API name: {@code pipeline_substitutions}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>pipelineSubstitutions</code>.
		 */
		public final Builder pipelineSubstitutions(Map<String, Pipeline> map) {
			this.pipelineSubstitutions = _mapPutAll(this.pipelineSubstitutions, map);
			return this;
		}

		/**
		 * Pipelines to test. If you don’t specify the <code>pipeline</code> request
		 * path parameter, this parameter is required. If you specify both this and the
		 * request path parameter, the API only uses the request path parameter.
		 * <p>
		 * API name: {@code pipeline_substitutions}
		 * <p>
		 * Adds an entry to <code>pipelineSubstitutions</code>.
		 */
		public final Builder pipelineSubstitutions(String key, Pipeline value) {
			this.pipelineSubstitutions = _mapPut(this.pipelineSubstitutions, key, value);
			return this;
		}

		/**
		 * Pipelines to test. If you don’t specify the <code>pipeline</code> request
		 * path parameter, this parameter is required. If you specify both this and the
		 * request path parameter, the API only uses the request path parameter.
		 * <p>
		 * API name: {@code pipeline_substitutions}
		 * <p>
		 * Adds an entry to <code>pipelineSubstitutions</code> using a builder lambda.
		 */
		public final Builder pipelineSubstitutions(String key, Function<Pipeline.Builder, ObjectBuilder<Pipeline>> fn) {
			return pipelineSubstitutions(key, fn.apply(new Pipeline.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IngestRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IngestRequest build() {
			_checkSingleUse();

			return new IngestRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IngestRequest}
	 */
	public static final JsonpDeserializer<IngestRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IngestRequest::setupIngestRequestDeserializer);

	protected static void setupIngestRequestDeserializer(ObjectDeserializer<IngestRequest.Builder> op) {

		op.add(Builder::componentTemplateSubstitutions,
				JsonpDeserializer.stringMapDeserializer(ComponentTemplateNode._DESERIALIZER),
				"component_template_substitutions");
		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(Document._DESERIALIZER), "docs");
		op.add(Builder::indexTemplateSubstitutions,
				JsonpDeserializer.stringMapDeserializer(IndexTemplate._DESERIALIZER), "index_template_substitutions");
		op.add(Builder::mappingAddition, TypeMapping._DESERIALIZER, "mapping_addition");
		op.add(Builder::pipelineSubstitutions, JsonpDeserializer.stringMapDeserializer(Pipeline._DESERIALIZER),
				"pipeline_substitutions");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code simulate.ingest}".
	 */
	public static final Endpoint<IngestRequest, IngestResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/simulate.ingest",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/_simulate");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_simulate");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.pipeline != null) {
					params.put("pipeline", request.pipeline);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, IngestResponse._DESERIALIZER);
}
