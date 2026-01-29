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

package co.elastic.clients.elasticsearch.simulate.ingest;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.JsonData;
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

// typedef: simulate.ingest.IngestDocumentSimulation

/**
 * The results of ingest simulation on a single document. The _source of the
 * document contains the results after running all pipelines listed in
 * executed_pipelines on the document. The list of executed pipelines is derived
 * from the pipelines that would be executed if this document had been ingested
 * into _index.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#simulate.ingest.IngestDocumentSimulation">API
 *      specification</a>
 */
@JsonpDeserializable
public class IngestDocumentSimulation implements JsonpSerializable {
	private final Map<String, String> metadata;

	private final String id;

	private final String index;

	private final Map<String, JsonData> source;

	private final long version;

	private final List<String> executedPipelines;

	private final List<Map<String, String>> ignoredFields;

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	private IngestDocumentSimulation(Builder builder) {

		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.source = ApiTypeHelper.unmodifiableRequired(builder.source, this, "source");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version", 0);
		this.executedPipelines = ApiTypeHelper.unmodifiableRequired(builder.executedPipelines, this,
				"executedPipelines");
		this.ignoredFields = ApiTypeHelper.unmodifiable(builder.ignoredFields);
		this.error = builder.error;

	}

	public static IngestDocumentSimulation of(Function<Builder, ObjectBuilder<IngestDocumentSimulation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Additional metadata
	 */
	public final Map<String, String> metadata() {
		return this.metadata;
	}

	/**
	 * Required - Identifier for the document.
	 * <p>
	 * API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - Name of the index that the document would be indexed into if this
	 * were not a simulation.
	 * <p>
	 * API name: {@code _index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - JSON body for the document.
	 * <p>
	 * API name: {@code _source}
	 */
	public final Map<String, JsonData> source() {
		return this.source;
	}

	/**
	 * Required -
	 * <p>
	 * API name: {@code _version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * Required - A list of the names of the pipelines executed on this document.
	 * <p>
	 * API name: {@code executed_pipelines}
	 */
	public final List<String> executedPipelines() {
		return this.executedPipelines;
	}

	/**
	 * A list of the fields that would be ignored at the indexing step. For example,
	 * a field whose value is larger than the allowed limit would make it through
	 * all of the pipelines, but would not be indexed into Elasticsearch.
	 * <p>
	 * API name: {@code ignored_fields}
	 */
	public final List<Map<String, String>> ignoredFields() {
		return this.ignoredFields;
	}

	/**
	 * Any error resulting from simulatng ingest on this doc. This can be an error
	 * generated by executing a processor, or a mapping validation error when
	 * simulating indexing the resulting doc.
	 * <p>
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
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

		for (Map.Entry<String, String> item0 : this.metadata.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		if (ApiTypeHelper.isDefined(this.source)) {
			generator.writeKey("_source");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.source.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("_version");
		generator.write(this.version);

		if (ApiTypeHelper.isDefined(this.executedPipelines)) {
			generator.writeKey("executed_pipelines");
			generator.writeStartArray();
			for (String item0 : this.executedPipelines) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.ignoredFields)) {
			generator.writeKey("ignored_fields");
			generator.writeStartArray();
			for (Map<String, String> item0 : this.ignoredFields) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, String> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IngestDocumentSimulation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IngestDocumentSimulation> {
		@Nullable
		private Map<String, String> metadata = new HashMap<>();

		/**
		 * Additional metadata
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, String> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Additional metadata
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, String value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		private String id;

		private String index;

		private Map<String, JsonData> source;

		private Long version;

		private List<String> executedPipelines;

		@Nullable
		private List<Map<String, String>> ignoredFields;

		@Nullable
		private ErrorCause error;

		public Builder() {
		}
		private Builder(IngestDocumentSimulation instance) {
			this.id = instance.id;
			this.index = instance.index;
			this.source = instance.source;
			this.version = instance.version;
			this.executedPipelines = instance.executedPipelines;
			this.ignoredFields = instance.ignoredFields;
			this.error = instance.error;
			this.metadata = instance.metadata;

		}
		/**
		 * Required - Identifier for the document.
		 * <p>
		 * API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - Name of the index that the document would be indexed into if this
		 * were not a simulation.
		 * <p>
		 * API name: {@code _index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - JSON body for the document.
		 * <p>
		 * API name: {@code _source}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>source</code>.
		 */
		public final Builder source(Map<String, JsonData> map) {
			this.source = _mapPutAll(this.source, map);
			return this;
		}

		/**
		 * Required - JSON body for the document.
		 * <p>
		 * API name: {@code _source}
		 * <p>
		 * Adds an entry to <code>source</code>.
		 */
		public final Builder source(String key, JsonData value) {
			this.source = _mapPut(this.source, key, value);
			return this;
		}

		/**
		 * Required -
		 * <p>
		 * API name: {@code _version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - A list of the names of the pipelines executed on this document.
		 * <p>
		 * API name: {@code executed_pipelines}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>executedPipelines</code>.
		 */
		public final Builder executedPipelines(List<String> list) {
			this.executedPipelines = _listAddAll(this.executedPipelines, list);
			return this;
		}

		/**
		 * Required - A list of the names of the pipelines executed on this document.
		 * <p>
		 * API name: {@code executed_pipelines}
		 * <p>
		 * Adds one or more values to <code>executedPipelines</code>.
		 */
		public final Builder executedPipelines(String value, String... values) {
			this.executedPipelines = _listAdd(this.executedPipelines, value, values);
			return this;
		}

		/**
		 * A list of the fields that would be ignored at the indexing step. For example,
		 * a field whose value is larger than the allowed limit would make it through
		 * all of the pipelines, but would not be indexed into Elasticsearch.
		 * <p>
		 * API name: {@code ignored_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ignoredFields</code>.
		 */
		public final Builder ignoredFields(List<Map<String, String>> list) {
			this.ignoredFields = _listAddAll(this.ignoredFields, list);
			return this;
		}

		/**
		 * A list of the fields that would be ignored at the indexing step. For example,
		 * a field whose value is larger than the allowed limit would make it through
		 * all of the pipelines, but would not be indexed into Elasticsearch.
		 * <p>
		 * API name: {@code ignored_fields}
		 * <p>
		 * Adds one or more values to <code>ignoredFields</code>.
		 */
		public final Builder ignoredFields(Map<String, String> value, Map<String, String>... values) {
			this.ignoredFields = _listAdd(this.ignoredFields, value, values);
			return this;
		}

		/**
		 * Any error resulting from simulatng ingest on this doc. This can be an error
		 * generated by executing a processor, or a mapping validation error when
		 * simulating indexing the resulting doc.
		 * <p>
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * Any error resulting from simulatng ingest on this doc. This can be an error
		 * generated by executing a processor, or a mapping validation error when
		 * simulating indexing the resulting doc.
		 * <p>
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IngestDocumentSimulation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IngestDocumentSimulation build() {
			_checkSingleUse();

			return new IngestDocumentSimulation(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IngestDocumentSimulation}
	 */
	public static final JsonpDeserializer<IngestDocumentSimulation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IngestDocumentSimulation::setupIngestDocumentSimulationDeserializer);

	protected static void setupIngestDocumentSimulationDeserializer(
			ObjectDeserializer<IngestDocumentSimulation.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::source, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_source");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");
		op.add(Builder::executedPipelines, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"executed_pipelines");
		op.add(Builder::ignoredFields,
				JsonpDeserializer.arrayDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer())),
				"ignored_fields");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.metadata(name, JsonpDeserializer.stringDeserializer().deserialize(parser, mapper));
		});

	}

}
