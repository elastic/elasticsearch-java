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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.update.Request

public final class UpdateRequest<TDocument, TPartialDocument> extends RequestBase implements JsonpSerializable {
	private final String id;

	private final String index;

	@Nullable
	private final String type;

	@Nullable
	private final Long ifPrimaryTerm;

	@Nullable
	private final Long ifSeqNo;

	@Nullable
	private final String lang;

	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final Integer retryOnConflict;

	@Nullable
	private final String routing;

	@Nullable
	private final String timeout;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	@Nullable
	private final List<String> sourceExcludes;

	@Nullable
	private final List<String> sourceIncludes;

	@Nullable
	private final Boolean detectNoop;

	@Nullable
	private final TPartialDocument doc;

	@Nullable
	private final Boolean docAsUpsert;

	@Nullable
	private final JsonValue /* _types.Script */ script;

	@Nullable
	private final Boolean scriptedUpsert;

	@Nullable
	private final JsonValue /* Union(_global.search._types.SourceFilter | internal.boolean) */ source;

	@Nullable
	private final TDocument upsert;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	@Nullable
	private final JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public UpdateRequest(Builder<TDocument, TPartialDocument> builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.type = builder.type;
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.lang = builder.lang;
		this.refresh = builder.refresh;
		this.requireAlias = builder.requireAlias;
		this.retryOnConflict = builder.retryOnConflict;
		this.routing = builder.routing;
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.sourceExcludes = ModelTypeHelper.unmodifiable(builder.sourceExcludes);
		this.sourceIncludes = ModelTypeHelper.unmodifiable(builder.sourceIncludes);
		this.detectNoop = builder.detectNoop;
		this.doc = builder.doc;
		this.docAsUpsert = builder.docAsUpsert;
		this.script = builder.script;
		this.scriptedUpsert = builder.scriptedUpsert;
		this.source = builder.source;
		this.upsert = builder.upsert;
		this.tDocumentSerializer = builder.tDocumentSerializer;
		this.tPartialDocumentSerializer = builder.tPartialDocumentSerializer;

	}

	public UpdateRequest(Function<Builder<TDocument, TPartialDocument>, Builder<TDocument, TPartialDocument>> fn) {
		this(fn.apply(new Builder<>()));
	}

	/**
	 * Required - Document ID
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Required - The name of the index
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * The type of the document
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * Only perform the operation if the document has this primary term.
	 * <p>
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public Long ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * Only perform the operation if the document has this sequence number.
	 * <p>
	 * API name: {@code if_seq_no}
	 */
	@Nullable
	public Long ifSeqNo() {
		return this.ifSeqNo;
	}

	/**
	 * The script language.
	 * <p>
	 * API name: {@code lang}
	 */
	@Nullable
	public String lang() {
		return this.lang;
	}

	/**
	 * If 'true', Elasticsearch refreshes the affected shards to make this operation
	 * visible to search, if 'wait_for' then wait for a refresh to make this
	 * operation visible to search, if 'false' do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue /* _types.Refresh */ refresh() {
		return this.refresh;
	}

	/**
	 * If true, the destination must be an index alias.
	 * <p>
	 * API name: {@code require_alias}
	 */
	@Nullable
	public Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * Specify how many times should the operation be retried when a conflict
	 * occurs.
	 * <p>
	 * API name: {@code retry_on_conflict}
	 */
	@Nullable
	public Integer retryOnConflict() {
		return this.retryOnConflict;
	}

	/**
	 * Custom value used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * Period to wait for dynamic mapping updates and active shards. This guarantees
	 * Elasticsearch waits for at least the timeout before failing. The actual wait
	 * time could be longer, particularly when multiple waits occur.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * The number of shard copies that must be active before proceeding with the
	 * operations. Set to 'all' or any positive integer up to the total number of
	 * shards in the index (number_of_replicas+1). Defaults to 1 meaning the primary
	 * shard.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue /* _types.WaitForActiveShards */ waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * Specify the source fields you want to exclude.
	 * <p>
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * Specify the source fields you want to retrieve.
	 * <p>
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> sourceIncludes() {
		return this.sourceIncludes;
	}

	/**
	 * Set to false to disable setting 'result' in the response to 'noop' if no
	 * change to the document occurred.
	 * <p>
	 * API name: {@code detect_noop}
	 */
	@Nullable
	public Boolean detectNoop() {
		return this.detectNoop;
	}

	/**
	 * A partial update to an existing document.
	 * <p>
	 * API name: {@code doc}
	 */
	@Nullable
	public TPartialDocument doc() {
		return this.doc;
	}

	/**
	 * Set to true to use the contents of 'doc' as the value of 'upsert'
	 * <p>
	 * API name: {@code doc_as_upsert}
	 */
	@Nullable
	public Boolean docAsUpsert() {
		return this.docAsUpsert;
	}

	/**
	 * Script to execute to update the document.
	 * <p>
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue /* _types.Script */ script() {
		return this.script;
	}

	/**
	 * Set to true to execute the script whether or not the document exists.
	 * <p>
	 * API name: {@code scripted_upsert}
	 */
	@Nullable
	public Boolean scriptedUpsert() {
		return this.scriptedUpsert;
	}

	/**
	 * Set to false to disable source retrieval. You can also specify a
	 * comma-separated list of the fields you want to retrieve.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue /* Union(_global.search._types.SourceFilter | internal.boolean) */ source() {
		return this.source;
	}

	/**
	 * If the document does not already exist, the contents of 'upsert' are inserted
	 * as a new document. If the document exists, the 'script' is executed.
	 * <p>
	 * API name: {@code upsert}
	 */
	@Nullable
	public TDocument upsert() {
		return this.upsert;
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

		if (this.detectNoop != null) {

			generator.writeKey("detect_noop");
			generator.write(this.detectNoop);

		}
		if (this.doc != null) {

			generator.writeKey("doc");
			JsonpUtils.serialize(this.doc, generator, tPartialDocumentSerializer, mapper);

		}
		if (this.docAsUpsert != null) {

			generator.writeKey("doc_as_upsert");
			generator.write(this.docAsUpsert);

		}
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.scriptedUpsert != null) {

			generator.writeKey("scripted_upsert");
			generator.write(this.scriptedUpsert);

		}
		if (this.source != null) {

			generator.writeKey("_source");
			generator.write(this.source);

		}
		if (this.upsert != null) {

			generator.writeKey("upsert");
			JsonpUtils.serialize(this.upsert, generator, tDocumentSerializer, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateRequest}.
	 */
	public static class Builder<TDocument, TPartialDocument>
			implements
				ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>> {
		private String id;

		private String index;

		@Nullable
		private String type;

		@Nullable
		private Long ifPrimaryTerm;

		@Nullable
		private Long ifSeqNo;

		@Nullable
		private String lang;

		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private Integer retryOnConflict;

		@Nullable
		private String routing;

		@Nullable
		private String timeout;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private Boolean detectNoop;

		@Nullable
		private TPartialDocument doc;

		@Nullable
		private Boolean docAsUpsert;

		@Nullable
		private JsonValue /* _types.Script */ script;

		@Nullable
		private Boolean scriptedUpsert;

		@Nullable
		private JsonValue /* Union(_global.search._types.SourceFilter | internal.boolean) */ source;

		@Nullable
		private TDocument upsert;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		@Nullable
		private JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

		/**
		 * Required - Document ID
		 * <p>
		 * API name: {@code id}
		 */
		public Builder<TDocument, TPartialDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The name of the index
		 * <p>
		 * API name: {@code index}
		 */
		public Builder<TDocument, TPartialDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * The type of the document
		 * <p>
		 * API name: {@code type}
		 */
		public Builder<TDocument, TPartialDocument> type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Only perform the operation if the document has this primary term.
		 * <p>
		 * API name: {@code if_primary_term}
		 */
		public Builder<TDocument, TPartialDocument> ifPrimaryTerm(@Nullable Long value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * Only perform the operation if the document has this sequence number.
		 * <p>
		 * API name: {@code if_seq_no}
		 */
		public Builder<TDocument, TPartialDocument> ifSeqNo(@Nullable Long value) {
			this.ifSeqNo = value;
			return this;
		}

		/**
		 * The script language.
		 * <p>
		 * API name: {@code lang}
		 */
		public Builder<TDocument, TPartialDocument> lang(@Nullable String value) {
			this.lang = value;
			return this;
		}

		/**
		 * If 'true', Elasticsearch refreshes the affected shards to make this operation
		 * visible to search, if 'wait_for' then wait for a refresh to make this
		 * operation visible to search, if 'false' do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public Builder<TDocument, TPartialDocument> refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * If true, the destination must be an index alias.
		 * <p>
		 * API name: {@code require_alias}
		 */
		public Builder<TDocument, TPartialDocument> requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * Specify how many times should the operation be retried when a conflict
		 * occurs.
		 * <p>
		 * API name: {@code retry_on_conflict}
		 */
		public Builder<TDocument, TPartialDocument> retryOnConflict(@Nullable Integer value) {
			this.retryOnConflict = value;
			return this;
		}

		/**
		 * Custom value used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder<TDocument, TPartialDocument> routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Period to wait for dynamic mapping updates and active shards. This guarantees
		 * Elasticsearch waits for at least the timeout before failing. The actual wait
		 * time could be longer, particularly when multiple waits occur.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder<TDocument, TPartialDocument> timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operations. Set to 'all' or any positive integer up to the total number of
		 * shards in the index (number_of_replicas+1). Defaults to 1 meaning the primary
		 * shard.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder<TDocument, TPartialDocument> waitForActiveShards(
				@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Specify the source fields you want to exclude.
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public Builder<TDocument, TPartialDocument> sourceExcludes(@Nullable List<String> value) {
			this.sourceExcludes = value;
			return this;
		}

		/**
		 * Specify the source fields you want to exclude.
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public Builder<TDocument, TPartialDocument> sourceExcludes(String... value) {
			this.sourceExcludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceExcludes(List)}, creating the list if needed.
		 */
		public Builder<TDocument, TPartialDocument> addSourceExcludes(String value) {
			if (this.sourceExcludes == null) {
				this.sourceExcludes = new ArrayList<>();
			}
			this.sourceExcludes.add(value);
			return this;
		}

		/**
		 * Specify the source fields you want to retrieve.
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public Builder<TDocument, TPartialDocument> sourceIncludes(@Nullable List<String> value) {
			this.sourceIncludes = value;
			return this;
		}

		/**
		 * Specify the source fields you want to retrieve.
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public Builder<TDocument, TPartialDocument> sourceIncludes(String... value) {
			this.sourceIncludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceIncludes(List)}, creating the list if needed.
		 */
		public Builder<TDocument, TPartialDocument> addSourceIncludes(String value) {
			if (this.sourceIncludes == null) {
				this.sourceIncludes = new ArrayList<>();
			}
			this.sourceIncludes.add(value);
			return this;
		}

		/**
		 * Set to false to disable setting 'result' in the response to 'noop' if no
		 * change to the document occurred.
		 * <p>
		 * API name: {@code detect_noop}
		 */
		public Builder<TDocument, TPartialDocument> detectNoop(@Nullable Boolean value) {
			this.detectNoop = value;
			return this;
		}

		/**
		 * A partial update to an existing document.
		 * <p>
		 * API name: {@code doc}
		 */
		public Builder<TDocument, TPartialDocument> doc(@Nullable TPartialDocument value) {
			this.doc = value;
			return this;
		}

		/**
		 * Set to true to use the contents of 'doc' as the value of 'upsert'
		 * <p>
		 * API name: {@code doc_as_upsert}
		 */
		public Builder<TDocument, TPartialDocument> docAsUpsert(@Nullable Boolean value) {
			this.docAsUpsert = value;
			return this;
		}

		/**
		 * Script to execute to update the document.
		 * <p>
		 * API name: {@code script}
		 */
		public Builder<TDocument, TPartialDocument> script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		/**
		 * Set to true to execute the script whether or not the document exists.
		 * <p>
		 * API name: {@code scripted_upsert}
		 */
		public Builder<TDocument, TPartialDocument> scriptedUpsert(@Nullable Boolean value) {
			this.scriptedUpsert = value;
			return this;
		}

		/**
		 * Set to false to disable source retrieval. You can also specify a
		 * comma-separated list of the fields you want to retrieve.
		 * <p>
		 * API name: {@code _source}
		 */
		public Builder<TDocument, TPartialDocument> source(
				@Nullable JsonValue /* Union(_global.search._types.SourceFilter | internal.boolean) */ value) {
			this.source = value;
			return this;
		}

		/**
		 * If the document does not already exist, the contents of 'upsert' are inserted
		 * as a new document. If the document exists, the 'script' is executed.
		 * <p>
		 * API name: {@code upsert}
		 */
		public Builder<TDocument, TPartialDocument> upsert(@Nullable TDocument value) {
			this.upsert = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TDocument, TPartialDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Serializer for TPartialDocument. If not set, an attempt will be made to find
		 * a serializer from the JSON context.
		 */
		public Builder<TDocument, TPartialDocument> tPartialDocumentSerializer(
				@Nullable JsonpSerializer<TPartialDocument> value) {
			this.tPartialDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link UpdateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateRequest<TDocument, TPartialDocument> build() {

			return new UpdateRequest<TDocument, TPartialDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for UpdateRequest
	 */
	public static <TDocument, TPartialDocument> JsonpDeserializer<UpdateRequest<TDocument, TPartialDocument>> createUpdateRequestDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer,
			JsonpDeserializer<TPartialDocument> tPartialDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument, TPartialDocument>>) Builder::new,
				op -> UpdateRequest.setupUpdateRequestDeserializer(op, tDocumentDeserializer,
						tPartialDocumentDeserializer));
	};

	protected static <TDocument, TPartialDocument> void setupUpdateRequestDeserializer(
			DelegatingDeserializer<UpdateRequest.Builder<TDocument, TPartialDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer,
			JsonpDeserializer<TPartialDocument> tPartialDocumentDeserializer) {

		op.add(Builder::detectNoop, JsonpDeserializer.booleanDeserializer(), "detect_noop");
		op.add(Builder::doc, tPartialDocumentDeserializer, "doc");
		op.add(Builder::docAsUpsert, JsonpDeserializer.booleanDeserializer(), "doc_as_upsert");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::scriptedUpsert, JsonpDeserializer.booleanDeserializer(), "scripted_upsert");
		op.add(Builder::source, JsonpDeserializer.jsonValueDeserializer(), "_source");
		op.add(Builder::upsert, tDocumentDeserializer, "upsert");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code update}".
	 */
	private static final SimpleEndpoint<UpdateRequest<?, ?>, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;
				final int _index = 1 << 1;
				final int _type = 1 << 2;

				int propsSet = 0;

				propsSet |= _id;
				propsSet |= _index;
				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == (_index | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_update");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				if (propsSet == (_index | _type | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.type, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/_update");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", String.valueOf(request.ifPrimaryTerm));
				}
				if (request.ifSeqNo != null) {
					params.put("if_seq_no", String.valueOf(request.ifSeqNo));
				}
				if (request.lang != null) {
					params.put("lang", request.lang);
				}
				if (request.refresh != null) {
					params.put("refresh", JsonpUtils.toString(request.refresh));
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				if (request.retryOnConflict != null) {
					params.put("retry_on_conflict", String.valueOf(request.retryOnConflict));
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", JsonpUtils.toString(request.waitForActiveShards));
				}
				if (request.sourceExcludes != null) {
					params.put("_source_excludes",
							request.sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.sourceIncludes != null) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code update}" endpoint.
	 */
	public static <TDocument> Endpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ElasticsearchError> createUpdateEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(UpdateResponse.createUpdateResponseDeserializer(tDocumentDeserializer));
	}
}
