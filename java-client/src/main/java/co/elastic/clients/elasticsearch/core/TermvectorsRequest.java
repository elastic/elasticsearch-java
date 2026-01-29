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
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.elasticsearch.core.termvectors.Filter;
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
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
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

// typedef: _global.termvectors.Request

/**
 * Get term vector information.
 * <p>
 * Get information and statistics about terms in the fields of a particular
 * document.
 * <p>
 * You can retrieve term vectors for documents stored in the index or for
 * artificial documents passed in the body of the request. You can specify the
 * fields you are interested in through the <code>fields</code> parameter or by
 * adding the fields to the request body. For example:
 * 
 * <pre>
 * <code>GET /my-index-000001/_termvectors/1?fields=message
 * </code>
 * </pre>
 * <p>
 * Fields can be specified using wildcards, similar to the multi match query.
 * <p>
 * Term vectors are real-time by default, not near real-time. This can be
 * changed by setting <code>realtime</code> parameter to <code>false</code>.
 * <p>
 * You can request three types of values: <em>term information</em>, <em>term
 * statistics</em>, and <em>field statistics</em>. By default, all term
 * information and field statistics are returned for all fields but term
 * statistics are excluded.
 * <p>
 * <strong>Term information</strong>
 * <ul>
 * <li>term frequency in the field (always returned)</li>
 * <li>term positions (<code>positions: true</code>)</li>
 * <li>start and end offsets (<code>offsets: true</code>)</li>
 * <li>term payloads (<code>payloads: true</code>), as base64 encoded bytes</li>
 * </ul>
 * <p>
 * If the requested information wasn't stored in the index, it will be computed
 * on the fly if possible. Additionally, term vectors could be computed for
 * documents not even existing in the index, but instead provided by the user.
 * <blockquote>
 * <p>
 * warn Start and end offsets assume UTF-16 encoding is being used. If you want
 * to use these offsets in order to get the original text that produced this
 * token, you should make sure that the string you are taking a sub-string of is
 * also encoded using UTF-16.
 * </p>
 * </blockquote>
 * <p>
 * <strong>Behaviour</strong>
 * <p>
 * The term and field statistics are not accurate. Deleted documents are not
 * taken into account. The information is only retrieved for the shard the
 * requested document resides in. The term and field statistics are therefore
 * only useful as relative measures whereas the absolute numbers have no meaning
 * in this context. By default, when requesting term vectors of artificial
 * documents, a shard to get the statistics from is randomly selected. Use
 * <code>routing</code> only to hit a particular shard.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.termvectors.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermvectorsRequest<TDocument> extends RequestBase implements JsonpSerializable {
	@Nullable
	private final TDocument doc;

	@Nullable
	private final Boolean fieldStatistics;

	private final List<String> fields;

	@Nullable
	private final Filter filter;

	@Nullable
	private final String id;

	private final String index;

	@Nullable
	private final Boolean offsets;

	@Nullable
	private final Boolean payloads;

	private final Map<String, String> perFieldAnalyzer;

	@Nullable
	private final Boolean positions;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean realtime;

	@Nullable
	private final String routing;

	@Nullable
	private final Boolean termStatistics;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private TermvectorsRequest(Builder<TDocument> builder) {

		this.doc = builder.doc;
		this.fieldStatistics = builder.fieldStatistics;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.filter = builder.filter;
		this.id = builder.id;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.offsets = builder.offsets;
		this.payloads = builder.payloads;
		this.perFieldAnalyzer = ApiTypeHelper.unmodifiable(builder.perFieldAnalyzer);
		this.positions = builder.positions;
		this.preference = builder.preference;
		this.realtime = builder.realtime;
		this.routing = builder.routing;
		this.termStatistics = builder.termStatistics;
		this.version = builder.version;
		this.versionType = builder.versionType;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> TermvectorsRequest<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<TermvectorsRequest<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * An artificial document (a document not present in the index) for which you
	 * want to retrieve term vectors.
	 * <p>
	 * API name: {@code doc}
	 */
	@Nullable
	public final TDocument doc() {
		return this.doc;
	}

	/**
	 * If <code>true</code>, the response includes:
	 * <ul>
	 * <li>The document count (how many documents contain this field).</li>
	 * <li>The sum of document frequencies (the sum of document frequencies for all
	 * terms in this field).</li>
	 * <li>The sum of total term frequencies (the sum of total term frequencies of
	 * each term in this field).</li>
	 * </ul>
	 * <p>
	 * API name: {@code field_statistics}
	 */
	@Nullable
	public final Boolean fieldStatistics() {
		return this.fieldStatistics;
	}

	/**
	 * A list of fields to include in the statistics. It is used as the default list
	 * unless a specific field list is provided in the
	 * <code>completion_fields</code> or <code>fielddata_fields</code> parameters.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * Filter terms based on their tf-idf scores. This could be useful in order find
	 * out a good characteristic vector of a document. This feature works in a
	 * similar manner to the second phase of the More Like This Query.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final Filter filter() {
		return this.filter;
	}

	/**
	 * A unique identifier for the document.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Required - The name of the index that contains the document.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * If <code>true</code>, the response includes term offsets.
	 * <p>
	 * API name: {@code offsets}
	 */
	@Nullable
	public final Boolean offsets() {
		return this.offsets;
	}

	/**
	 * If <code>true</code>, the response includes term payloads.
	 * <p>
	 * API name: {@code payloads}
	 */
	@Nullable
	public final Boolean payloads() {
		return this.payloads;
	}

	/**
	 * Override the default per-field analyzer. This is useful in order to generate
	 * term vectors in any fashion, especially when using artificial documents. When
	 * providing an analyzer for a field that already stores term vectors, the term
	 * vectors will be regenerated.
	 * <p>
	 * API name: {@code per_field_analyzer}
	 */
	public final Map<String, String> perFieldAnalyzer() {
		return this.perFieldAnalyzer;
	}

	/**
	 * If <code>true</code>, the response includes term positions.
	 * <p>
	 * API name: {@code positions}
	 */
	@Nullable
	public final Boolean positions() {
		return this.positions;
	}

	/**
	 * The node or shard the operation should be performed on. It is random by
	 * default.
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * If true, the request is real-time as opposed to near-real-time.
	 * <p>
	 * API name: {@code realtime}
	 */
	@Nullable
	public final Boolean realtime() {
		return this.realtime;
	}

	/**
	 * A custom value that is used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * If <code>true</code>, the response includes:
	 * <ul>
	 * <li>The total term frequency (how often a term occurs in all documents).</li>
	 * <li>The document frequency (the number of documents containing the current
	 * term).</li>
	 * </ul>
	 * <p>
	 * By default these values are not returned since term statistics can have a
	 * serious performance impact.
	 * <p>
	 * API name: {@code term_statistics}
	 */
	@Nullable
	public final Boolean termStatistics() {
		return this.termStatistics;
	}

	/**
	 * If <code>true</code>, returns the document version as part of a hit.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * The version type.
	 * <p>
	 * API name: {@code version_type}
	 */
	@Nullable
	public final VersionType versionType() {
		return this.versionType;
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

		if (this.doc != null) {
			generator.writeKey("doc");
			JsonpUtils.serialize(this.doc, generator, tDocumentSerializer, mapper);

		}
		if (this.fieldStatistics != null) {
			generator.writeKey("field_statistics");
			generator.write(this.fieldStatistics);

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.offsets != null) {
			generator.writeKey("offsets");
			generator.write(this.offsets);

		}
		if (this.payloads != null) {
			generator.writeKey("payloads");
			generator.write(this.payloads);

		}
		if (ApiTypeHelper.isDefined(this.perFieldAnalyzer)) {
			generator.writeKey("per_field_analyzer");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.perFieldAnalyzer.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.positions != null) {
			generator.writeKey("positions");
			generator.write(this.positions);

		}
		if (this.routing != null) {
			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.termStatistics != null) {
			generator.writeKey("term_statistics");
			generator.write(this.termStatistics);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.versionType != null) {
			generator.writeKey("version_type");
			this.versionType.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermvectorsRequest}.
	 */

	public static class Builder<TDocument> extends RequestBase.AbstractBuilder<Builder<TDocument>>
			implements
				ObjectBuilder<TermvectorsRequest<TDocument>> {
		@Nullable
		private TDocument doc;

		@Nullable
		private Boolean fieldStatistics;

		@Nullable
		private List<String> fields;

		@Nullable
		private Filter filter;

		@Nullable
		private String id;

		private String index;

		@Nullable
		private Boolean offsets;

		@Nullable
		private Boolean payloads;

		@Nullable
		private Map<String, String> perFieldAnalyzer;

		@Nullable
		private Boolean positions;

		@Nullable
		private String preference;

		@Nullable
		private Boolean realtime;

		@Nullable
		private String routing;

		@Nullable
		private Boolean termStatistics;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		public Builder() {
		}
		private Builder(TermvectorsRequest<TDocument> instance) {
			this.doc = instance.doc;
			this.fieldStatistics = instance.fieldStatistics;
			this.fields = instance.fields;
			this.filter = instance.filter;
			this.id = instance.id;
			this.index = instance.index;
			this.offsets = instance.offsets;
			this.payloads = instance.payloads;
			this.perFieldAnalyzer = instance.perFieldAnalyzer;
			this.positions = instance.positions;
			this.preference = instance.preference;
			this.realtime = instance.realtime;
			this.routing = instance.routing;
			this.termStatistics = instance.termStatistics;
			this.version = instance.version;
			this.versionType = instance.versionType;

		}
		/**
		 * An artificial document (a document not present in the index) for which you
		 * want to retrieve term vectors.
		 * <p>
		 * API name: {@code doc}
		 */
		public final Builder<TDocument> doc(@Nullable TDocument value) {
			this.doc = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes:
		 * <ul>
		 * <li>The document count (how many documents contain this field).</li>
		 * <li>The sum of document frequencies (the sum of document frequencies for all
		 * terms in this field).</li>
		 * <li>The sum of total term frequencies (the sum of total term frequencies of
		 * each term in this field).</li>
		 * </ul>
		 * <p>
		 * API name: {@code field_statistics}
		 */
		public final Builder<TDocument> fieldStatistics(@Nullable Boolean value) {
			this.fieldStatistics = value;
			return this;
		}

		/**
		 * A list of fields to include in the statistics. It is used as the default list
		 * unless a specific field list is provided in the
		 * <code>completion_fields</code> or <code>fielddata_fields</code> parameters.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder<TDocument> fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * A list of fields to include in the statistics. It is used as the default list
		 * unless a specific field list is provided in the
		 * <code>completion_fields</code> or <code>fielddata_fields</code> parameters.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder<TDocument> fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * Filter terms based on their tf-idf scores. This could be useful in order find
		 * out a good characteristic vector of a document. This feature works in a
		 * similar manner to the second phase of the More Like This Query.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder<TDocument> filter(@Nullable Filter value) {
			this.filter = value;
			return this;
		}

		/**
		 * Filter terms based on their tf-idf scores. This could be useful in order find
		 * out a good characteristic vector of a document. This feature works in a
		 * similar manner to the second phase of the More Like This Query.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder<TDocument> filter(Function<Filter.Builder, ObjectBuilder<Filter>> fn) {
			return this.filter(fn.apply(new Filter.Builder()).build());
		}

		/**
		 * A unique identifier for the document.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder<TDocument> id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The name of the index that contains the document.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes term offsets.
		 * <p>
		 * API name: {@code offsets}
		 */
		public final Builder<TDocument> offsets(@Nullable Boolean value) {
			this.offsets = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes term payloads.
		 * <p>
		 * API name: {@code payloads}
		 */
		public final Builder<TDocument> payloads(@Nullable Boolean value) {
			this.payloads = value;
			return this;
		}

		/**
		 * Override the default per-field analyzer. This is useful in order to generate
		 * term vectors in any fashion, especially when using artificial documents. When
		 * providing an analyzer for a field that already stores term vectors, the term
		 * vectors will be regenerated.
		 * <p>
		 * API name: {@code per_field_analyzer}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>perFieldAnalyzer</code>.
		 */
		public final Builder<TDocument> perFieldAnalyzer(Map<String, String> map) {
			this.perFieldAnalyzer = _mapPutAll(this.perFieldAnalyzer, map);
			return this;
		}

		/**
		 * Override the default per-field analyzer. This is useful in order to generate
		 * term vectors in any fashion, especially when using artificial documents. When
		 * providing an analyzer for a field that already stores term vectors, the term
		 * vectors will be regenerated.
		 * <p>
		 * API name: {@code per_field_analyzer}
		 * <p>
		 * Adds an entry to <code>perFieldAnalyzer</code>.
		 */
		public final Builder<TDocument> perFieldAnalyzer(String key, String value) {
			this.perFieldAnalyzer = _mapPut(this.perFieldAnalyzer, key, value);
			return this;
		}

		/**
		 * If <code>true</code>, the response includes term positions.
		 * <p>
		 * API name: {@code positions}
		 */
		public final Builder<TDocument> positions(@Nullable Boolean value) {
			this.positions = value;
			return this;
		}

		/**
		 * The node or shard the operation should be performed on. It is random by
		 * default.
		 * <p>
		 * API name: {@code preference}
		 */
		public final Builder<TDocument> preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * If true, the request is real-time as opposed to near-real-time.
		 * <p>
		 * API name: {@code realtime}
		 */
		public final Builder<TDocument> realtime(@Nullable Boolean value) {
			this.realtime = value;
			return this;
		}

		/**
		 * A custom value that is used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder<TDocument> routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes:
		 * <ul>
		 * <li>The total term frequency (how often a term occurs in all documents).</li>
		 * <li>The document frequency (the number of documents containing the current
		 * term).</li>
		 * </ul>
		 * <p>
		 * By default these values are not returned since term statistics can have a
		 * serious performance impact.
		 * <p>
		 * API name: {@code term_statistics}
		 */
		public final Builder<TDocument> termStatistics(@Nullable Boolean value) {
			this.termStatistics = value;
			return this;
		}

		/**
		 * If <code>true</code>, returns the document version as part of a hit.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder<TDocument> version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * The version type.
		 * <p>
		 * API name: {@code version_type}
		 */
		public final Builder<TDocument> versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link TermvectorsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermvectorsRequest<TDocument> build() {
			_checkSingleUse();

			return new TermvectorsRequest<TDocument>(this);
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
	 * Create a JSON deserializer for TermvectorsRequest
	 */
	public static <TDocument> JsonpDeserializer<TermvectorsRequest<TDocument>> createTermvectorsRequestDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> TermvectorsRequest.setupTermvectorsRequestDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link TermvectorsRequest} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<TermvectorsRequest<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createTermvectorsRequestDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.termvectors.Request.TDocument")));

	protected static <TDocument> void setupTermvectorsRequestDeserializer(
			ObjectDeserializer<TermvectorsRequest.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::doc, tDocumentDeserializer, "doc");
		op.add(Builder::fieldStatistics, JsonpDeserializer.booleanDeserializer(), "field_statistics");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::filter, Filter._DESERIALIZER, "filter");
		op.add(Builder::offsets, JsonpDeserializer.booleanDeserializer(), "offsets");
		op.add(Builder::payloads, JsonpDeserializer.booleanDeserializer(), "payloads");
		op.add(Builder::perFieldAnalyzer,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "per_field_analyzer");
		op.add(Builder::positions, JsonpDeserializer.booleanDeserializer(), "positions");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::termStatistics, JsonpDeserializer.booleanDeserializer(), "term_statistics");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::versionType, VersionType._DESERIALIZER, "version_type");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code termvectors}".
	 */
	public static final Endpoint<TermvectorsRequest<?>, TermvectorsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/termvectors",

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
				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_index | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_termvectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_termvectors");
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
				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_index | _id)) {
					params.put("index", request.index);
					params.put("id", request.id);
				}
				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.realtime != null) {
					params.put("realtime", String.valueOf(request.realtime));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, TermvectorsResponse._DESERIALIZER);
}
