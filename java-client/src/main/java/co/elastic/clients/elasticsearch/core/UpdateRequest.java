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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.WaitForActiveShards;
import co.elastic.clients.elasticsearch.core.search.SourceConfig;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NamedDeserializer;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
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

// typedef: _global.update.Request

/**
 * Update a document.
 * <p>
 * Update a document by running a script or passing a partial document.
 * <p>
 * If the Elasticsearch security features are enabled, you must have the
 * <code>index</code> or <code>write</code> index privilege for the target index
 * or index alias.
 * <p>
 * The script can update, delete, or skip modifying the document. The API also
 * supports passing a partial document, which is merged into the existing
 * document. To fully replace an existing document, use the index API. This
 * operation:
 * <ul>
 * <li>Gets the document (collocated with the shard) from the index.</li>
 * <li>Runs the specified script.</li>
 * <li>Indexes the result.</li>
 * </ul>
 * <p>
 * The document must still be reindexed, but using this API removes some network
 * roundtrips and reduces chances of version conflicts between the GET and the
 * index operation.
 * <p>
 * The <code>_source</code> field must be enabled to use this API. In addition
 * to <code>_source</code>, you can access the following variables through the
 * <code>ctx</code> map: <code>_index</code>, <code>_type</code>,
 * <code>_id</code>, <code>_version</code>, <code>_routing</code>, and
 * <code>_now</code> (the current timestamp). For usage examples such as partial
 * updates, upserts, and scripted updates, see the External documentation.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.update.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateRequest<TDocument, TPartialDocument> extends RequestBase implements JsonpSerializable {
	@Nullable
	private final SourceConfig source;

	@Nullable
	private final Boolean detectNoop;

	@Nullable
	private final TPartialDocument doc;

	@Nullable
	private final Boolean docAsUpsert;

	private final String id;

	@Nullable
	private final Long ifPrimaryTerm;

	@Nullable
	private final Long ifSeqNo;

	@Nullable
	private final Boolean includeSourceOnError;

	private final String index;

	@Nullable
	private final String lang;

	@Nullable
	private final Refresh refresh;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final Integer retryOnConflict;

	@Nullable
	private final String routing;

	@Nullable
	private final Script script;

	@Nullable
	private final Boolean scriptedUpsert;

	@Nullable
	private final Time timeout;

	@Nullable
	private final TDocument upsert;

	@Nullable
	private final WaitForActiveShards waitForActiveShards;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	@Nullable
	private final JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private UpdateRequest(Builder<TDocument, TPartialDocument> builder) {

		this.source = builder.source;
		this.detectNoop = builder.detectNoop;
		this.doc = builder.doc;
		this.docAsUpsert = builder.docAsUpsert;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.includeSourceOnError = builder.includeSourceOnError;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.lang = builder.lang;
		this.refresh = builder.refresh;
		this.requireAlias = builder.requireAlias;
		this.retryOnConflict = builder.retryOnConflict;
		this.routing = builder.routing;
		this.script = builder.script;
		this.scriptedUpsert = builder.scriptedUpsert;
		this.timeout = builder.timeout;
		this.upsert = builder.upsert;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.tDocumentSerializer = builder.tDocumentSerializer;
		this.tPartialDocumentSerializer = builder.tPartialDocumentSerializer;

	}

	public static <TDocument, TPartialDocument> UpdateRequest<TDocument, TPartialDocument> of(
			Function<Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * If <code>false</code>, turn off source retrieval. You can also specify a
	 * comma-separated list of the fields you want to retrieve.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceConfig source() {
		return this.source;
	}

	/**
	 * If <code>true</code>, the <code>result</code> in the response is set to
	 * <code>noop</code> (no operation) when there are no changes to the document.
	 * <p>
	 * API name: {@code detect_noop}
	 */
	@Nullable
	public final Boolean detectNoop() {
		return this.detectNoop;
	}

	/**
	 * A partial update to an existing document. If both <code>doc</code> and
	 * <code>script</code> are specified, <code>doc</code> is ignored.
	 * <p>
	 * API name: {@code doc}
	 */
	@Nullable
	public final TPartialDocument doc() {
		return this.doc;
	}

	/**
	 * If <code>true</code>, use the contents of 'doc' as the value of 'upsert'.
	 * NOTE: Using ingest pipelines with <code>doc_as_upsert</code> is not
	 * supported.
	 * <p>
	 * API name: {@code doc_as_upsert}
	 */
	@Nullable
	public final Boolean docAsUpsert() {
		return this.docAsUpsert;
	}

	/**
	 * Required - A unique identifier for the document to be updated.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Only perform the operation if the document has this primary term.
	 * <p>
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public final Long ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * Only perform the operation if the document has this sequence number.
	 * <p>
	 * API name: {@code if_seq_no}
	 */
	@Nullable
	public final Long ifSeqNo() {
		return this.ifSeqNo;
	}

	/**
	 * True or false if to include the document source in the error message in case
	 * of parsing errors.
	 * <p>
	 * API name: {@code include_source_on_error}
	 */
	@Nullable
	public final Boolean includeSourceOnError() {
		return this.includeSourceOnError;
	}

	/**
	 * Required - The name of the target index. By default, the index is created
	 * automatically if it doesn't exist.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * The script language.
	 * <p>
	 * API name: {@code lang}
	 */
	@Nullable
	public final String lang() {
		return this.lang;
	}

	/**
	 * If 'true', Elasticsearch refreshes the affected shards to make this operation
	 * visible to search. If 'wait_for', it waits for a refresh to make this
	 * operation visible to search. If 'false', it does nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * If <code>true</code>, the destination must be an index alias.
	 * <p>
	 * API name: {@code require_alias}
	 */
	@Nullable
	public final Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * The number of times the operation should be retried when a conflict occurs.
	 * <p>
	 * API name: {@code retry_on_conflict}
	 */
	@Nullable
	public final Integer retryOnConflict() {
		return this.retryOnConflict;
	}

	/**
	 * A custom value used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * The script to run to update the document.
	 * <p>
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * If <code>true</code>, run the script whether or not the document exists.
	 * <p>
	 * API name: {@code scripted_upsert}
	 */
	@Nullable
	public final Boolean scriptedUpsert() {
		return this.scriptedUpsert;
	}

	/**
	 * The period to wait for the following operations: dynamic mapping updates and
	 * waiting for active shards. Elasticsearch waits for at least the timeout
	 * period before failing. The actual wait time could be longer, particularly
	 * when multiple waits occur.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * If the document does not already exist, the contents of 'upsert' are inserted
	 * as a new document. If the document exists, the 'script' is run.
	 * <p>
	 * API name: {@code upsert}
	 */
	@Nullable
	public final TDocument upsert() {
		return this.upsert;
	}

	/**
	 * The number of copies of each shard that must be active before proceeding with
	 * the operation. Set to 'all' or any positive integer up to the total number of
	 * shards in the index (<code>number_of_replicas</code>+1). The default value of
	 * <code>1</code> means it waits for each primary shard to be active.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final WaitForActiveShards waitForActiveShards() {
		return this.waitForActiveShards;
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

		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
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
			this.script.serialize(generator, mapper);

		}
		if (this.scriptedUpsert != null) {
			generator.writeKey("scripted_upsert");
			generator.write(this.scriptedUpsert);

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
			extends
				RequestBase.AbstractBuilder<Builder<TDocument, TPartialDocument>>
			implements
				ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>> {
		@Nullable
		private SourceConfig source;

		@Nullable
		private Boolean detectNoop;

		@Nullable
		private TPartialDocument doc;

		@Nullable
		private Boolean docAsUpsert;

		private String id;

		@Nullable
		private Long ifPrimaryTerm;

		@Nullable
		private Long ifSeqNo;

		@Nullable
		private Boolean includeSourceOnError;

		private String index;

		@Nullable
		private String lang;

		@Nullable
		private Refresh refresh;

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private Integer retryOnConflict;

		@Nullable
		private String routing;

		@Nullable
		private Script script;

		@Nullable
		private Boolean scriptedUpsert;

		@Nullable
		private Time timeout;

		@Nullable
		private TDocument upsert;

		@Nullable
		private WaitForActiveShards waitForActiveShards;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		@Nullable
		private JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

		/**
		 * If <code>false</code>, turn off source retrieval. You can also specify a
		 * comma-separated list of the fields you want to retrieve.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder<TDocument, TPartialDocument> source(@Nullable SourceConfig value) {
			this.source = value;
			return this;
		}

		/**
		 * If <code>false</code>, turn off source retrieval. You can also specify a
		 * comma-separated list of the fields you want to retrieve.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder<TDocument, TPartialDocument> source(
				Function<SourceConfig.Builder, ObjectBuilder<SourceConfig>> fn) {
			return this.source(fn.apply(new SourceConfig.Builder()).build());
		}

		/**
		 * If <code>true</code>, the <code>result</code> in the response is set to
		 * <code>noop</code> (no operation) when there are no changes to the document.
		 * <p>
		 * API name: {@code detect_noop}
		 */
		public final Builder<TDocument, TPartialDocument> detectNoop(@Nullable Boolean value) {
			this.detectNoop = value;
			return this;
		}

		/**
		 * A partial update to an existing document. If both <code>doc</code> and
		 * <code>script</code> are specified, <code>doc</code> is ignored.
		 * <p>
		 * API name: {@code doc}
		 */
		public final Builder<TDocument, TPartialDocument> doc(@Nullable TPartialDocument value) {
			this.doc = value;
			return this;
		}

		/**
		 * If <code>true</code>, use the contents of 'doc' as the value of 'upsert'.
		 * NOTE: Using ingest pipelines with <code>doc_as_upsert</code> is not
		 * supported.
		 * <p>
		 * API name: {@code doc_as_upsert}
		 */
		public final Builder<TDocument, TPartialDocument> docAsUpsert(@Nullable Boolean value) {
			this.docAsUpsert = value;
			return this;
		}

		/**
		 * Required - A unique identifier for the document to be updated.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder<TDocument, TPartialDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Only perform the operation if the document has this primary term.
		 * <p>
		 * API name: {@code if_primary_term}
		 */
		public final Builder<TDocument, TPartialDocument> ifPrimaryTerm(@Nullable Long value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * Only perform the operation if the document has this sequence number.
		 * <p>
		 * API name: {@code if_seq_no}
		 */
		public final Builder<TDocument, TPartialDocument> ifSeqNo(@Nullable Long value) {
			this.ifSeqNo = value;
			return this;
		}

		/**
		 * True or false if to include the document source in the error message in case
		 * of parsing errors.
		 * <p>
		 * API name: {@code include_source_on_error}
		 */
		public final Builder<TDocument, TPartialDocument> includeSourceOnError(@Nullable Boolean value) {
			this.includeSourceOnError = value;
			return this;
		}

		/**
		 * Required - The name of the target index. By default, the index is created
		 * automatically if it doesn't exist.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder<TDocument, TPartialDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * The script language.
		 * <p>
		 * API name: {@code lang}
		 */
		public final Builder<TDocument, TPartialDocument> lang(@Nullable String value) {
			this.lang = value;
			return this;
		}

		/**
		 * If 'true', Elasticsearch refreshes the affected shards to make this operation
		 * visible to search. If 'wait_for', it waits for a refresh to make this
		 * operation visible to search. If 'false', it does nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder<TDocument, TPartialDocument> refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * If <code>true</code>, the destination must be an index alias.
		 * <p>
		 * API name: {@code require_alias}
		 */
		public final Builder<TDocument, TPartialDocument> requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * The number of times the operation should be retried when a conflict occurs.
		 * <p>
		 * API name: {@code retry_on_conflict}
		 */
		public final Builder<TDocument, TPartialDocument> retryOnConflict(@Nullable Integer value) {
			this.retryOnConflict = value;
			return this;
		}

		/**
		 * A custom value used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder<TDocument, TPartialDocument> routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * The script to run to update the document.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder<TDocument, TPartialDocument> script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * The script to run to update the document.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder<TDocument, TPartialDocument> script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * If <code>true</code>, run the script whether or not the document exists.
		 * <p>
		 * API name: {@code scripted_upsert}
		 */
		public final Builder<TDocument, TPartialDocument> scriptedUpsert(@Nullable Boolean value) {
			this.scriptedUpsert = value;
			return this;
		}

		/**
		 * The period to wait for the following operations: dynamic mapping updates and
		 * waiting for active shards. Elasticsearch waits for at least the timeout
		 * period before failing. The actual wait time could be longer, particularly
		 * when multiple waits occur.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder<TDocument, TPartialDocument> timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for the following operations: dynamic mapping updates and
		 * waiting for active shards. Elasticsearch waits for at least the timeout
		 * period before failing. The actual wait time could be longer, particularly
		 * when multiple waits occur.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder<TDocument, TPartialDocument> timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If the document does not already exist, the contents of 'upsert' are inserted
		 * as a new document. If the document exists, the 'script' is run.
		 * <p>
		 * API name: {@code upsert}
		 */
		public final Builder<TDocument, TPartialDocument> upsert(@Nullable TDocument value) {
			this.upsert = value;
			return this;
		}

		/**
		 * The number of copies of each shard that must be active before proceeding with
		 * the operation. Set to 'all' or any positive integer up to the total number of
		 * shards in the index (<code>number_of_replicas</code>+1). The default value of
		 * <code>1</code> means it waits for each primary shard to be active.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder<TDocument, TPartialDocument> waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * The number of copies of each shard that must be active before proceeding with
		 * the operation. Set to 'all' or any positive integer up to the total number of
		 * shards in the index (<code>number_of_replicas</code>+1). The default value of
		 * <code>1</code> means it waits for each primary shard to be active.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder<TDocument, TPartialDocument> waitForActiveShards(
				Function<WaitForActiveShards.Builder, ObjectBuilder<WaitForActiveShards>> fn) {
			return this.waitForActiveShards(fn.apply(new WaitForActiveShards.Builder()).build());
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument, TPartialDocument> tDocumentSerializer(
				@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Serializer for TPartialDocument. If not set, an attempt will be made to find
		 * a serializer from the JSON context.
		 */
		public final Builder<TDocument, TPartialDocument> tPartialDocumentSerializer(
				@Nullable JsonpSerializer<TPartialDocument> value) {
			this.tPartialDocumentSerializer = value;
			return this;
		}

		@Override
		protected Builder<TDocument, TPartialDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateRequest<TDocument, TPartialDocument> build() {
			_checkSingleUse();

			return new UpdateRequest<TDocument, TPartialDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for UpdateRequest
	 */
	public static <TDocument, TPartialDocument> JsonpDeserializer<UpdateRequest<TDocument, TPartialDocument>> createUpdateRequestDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer,
			JsonpDeserializer<TPartialDocument> tPartialDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument, TPartialDocument>>) Builder::new,
				op -> UpdateRequest.setupUpdateRequestDeserializer(op, tDocumentDeserializer,
						tPartialDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link UpdateRequest} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<UpdateRequest<Object, Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createUpdateRequestDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.update.Request.TDocument"),
					new NamedDeserializer<>(
							"co.elastic.clients:Deserializer:_global.update.Request.TPartialDocument")));

	protected static <TDocument, TPartialDocument> void setupUpdateRequestDeserializer(
			ObjectDeserializer<UpdateRequest.Builder<TDocument, TPartialDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer,
			JsonpDeserializer<TPartialDocument> tPartialDocumentDeserializer) {

		op.add(Builder::source, SourceConfig._DESERIALIZER, "_source");
		op.add(Builder::detectNoop, JsonpDeserializer.booleanDeserializer(), "detect_noop");
		op.add(Builder::doc, tPartialDocumentDeserializer, "doc");
		op.add(Builder::docAsUpsert, JsonpDeserializer.booleanDeserializer(), "doc_as_upsert");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::scriptedUpsert, JsonpDeserializer.booleanDeserializer(), "scripted_upsert");
		op.add(Builder::upsert, tDocumentDeserializer, "upsert");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code update}".
	 */
	public static final SimpleEndpoint<UpdateRequest<?, ?>, ?> _ENDPOINT = new SimpleEndpoint<>("es/update",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _id;

				if (propsSet == (_index | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_update");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _id;

				if (propsSet == (_index | _id)) {
					params.put("index", request.index);
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.includeSourceOnError != null) {
					params.put("include_source_on_error", String.valueOf(request.includeSourceOnError));
				}
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", String.valueOf(request.ifPrimaryTerm));
				}
				if (request.ifSeqNo != null) {
					params.put("if_seq_no", String.valueOf(request.ifSeqNo));
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards._toJsonString());
				}
				if (request.lang != null) {
					params.put("lang", request.lang);
				}
				if (request.retryOnConflict != null) {
					params.put("retry_on_conflict", String.valueOf(request.retryOnConflict));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, UpdateResponse._DESERIALIZER);

	/**
	 * Create an "{@code update}" endpoint.
	 */
	public static <TDocument> Endpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse> createUpdateEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return _ENDPOINT
				.withResponseDeserializer(UpdateResponse.createUpdateResponseDeserializer(tDocumentDeserializer));
	}
}
