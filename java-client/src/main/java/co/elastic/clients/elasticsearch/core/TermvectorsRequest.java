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
import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.elasticsearch.core.termvectors.Filter;
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
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: _global.termvectors.Request

public final class TermvectorsRequest<TDocument> extends RequestBase implements JsonpSerializable {
	private final String index;

	@Nullable
	private final String id;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final Boolean fieldStatistics;

	@Nullable
	private final Boolean offsets;

	@Nullable
	private final Boolean payloads;

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
	private final TDocument doc;

	@Nullable
	private final Filter filter;

	@Nullable
	private final Map<String, String> perFieldAnalyzer;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public TermvectorsRequest(Builder<TDocument> builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.id = builder.id;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.fieldStatistics = builder.fieldStatistics;
		this.offsets = builder.offsets;
		this.payloads = builder.payloads;
		this.positions = builder.positions;
		this.preference = builder.preference;
		this.realtime = builder.realtime;
		this.routing = builder.routing;
		this.termStatistics = builder.termStatistics;
		this.version = builder.version;
		this.versionType = builder.versionType;
		this.doc = builder.doc;
		this.filter = builder.filter;
		this.perFieldAnalyzer = ModelTypeHelper.unmodifiable(builder.perFieldAnalyzer);
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public TermvectorsRequest(Function<Builder<TDocument>, Builder<TDocument>> fn) {
		this(fn.apply(new Builder<>()));
	}

	/**
	 * Required - The index in which the document resides.
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * The id of the document, when not specified a doc param should be supplied.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * A comma-separated list of fields to return.
	 * <p>
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * Specifies if document count, sum of document frequencies and sum of total
	 * term frequencies should be returned.
	 * <p>
	 * API name: {@code field_statistics}
	 */
	@Nullable
	public Boolean fieldStatistics() {
		return this.fieldStatistics;
	}

	/**
	 * Specifies if term offsets should be returned.
	 * <p>
	 * API name: {@code offsets}
	 */
	@Nullable
	public Boolean offsets() {
		return this.offsets;
	}

	/**
	 * Specifies if term payloads should be returned.
	 * <p>
	 * API name: {@code payloads}
	 */
	@Nullable
	public Boolean payloads() {
		return this.payloads;
	}

	/**
	 * Specifies if term positions should be returned.
	 * <p>
	 * API name: {@code positions}
	 */
	@Nullable
	public Boolean positions() {
		return this.positions;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random).
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * Specifies if request is real-time as opposed to near-real-time (default:
	 * true).
	 * <p>
	 * API name: {@code realtime}
	 */
	@Nullable
	public Boolean realtime() {
		return this.realtime;
	}

	/**
	 * Specific routing value.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * Specifies if total term frequency and document frequency should be returned.
	 * <p>
	 * API name: {@code term_statistics}
	 */
	@Nullable
	public Boolean termStatistics() {
		return this.termStatistics;
	}

	/**
	 * Explicit version number for concurrency control
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * Specific version type
	 * <p>
	 * API name: {@code version_type}
	 */
	@Nullable
	public VersionType versionType() {
		return this.versionType;
	}

	/**
	 * API name: {@code doc}
	 */
	@Nullable
	public TDocument doc() {
		return this.doc;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public Filter filter() {
		return this.filter;
	}

	/**
	 * API name: {@code per_field_analyzer}
	 */
	@Nullable
	public Map<String, String> perFieldAnalyzer() {
		return this.perFieldAnalyzer;
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
		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.perFieldAnalyzer != null) {

			generator.writeKey("per_field_analyzer");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.perFieldAnalyzer.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermvectorsRequest}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<TermvectorsRequest<TDocument>> {
		private String index;

		@Nullable
		private String id;

		@Nullable
		private List<String> fields;

		@Nullable
		private Boolean fieldStatistics;

		@Nullable
		private Boolean offsets;

		@Nullable
		private Boolean payloads;

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
		private TDocument doc;

		@Nullable
		private Filter filter;

		@Nullable
		private Map<String, String> perFieldAnalyzer;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - The index in which the document resides.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * The id of the document, when not specified a doc param should be supplied.
		 * <p>
		 * API name: {@code id}
		 */
		public Builder<TDocument> id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * A comma-separated list of fields to return.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder<TDocument> fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * A comma-separated list of fields to return.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder<TDocument> fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * Specifies if document count, sum of document frequencies and sum of total
		 * term frequencies should be returned.
		 * <p>
		 * API name: {@code field_statistics}
		 */
		public Builder<TDocument> fieldStatistics(@Nullable Boolean value) {
			this.fieldStatistics = value;
			return this;
		}

		/**
		 * Specifies if term offsets should be returned.
		 * <p>
		 * API name: {@code offsets}
		 */
		public Builder<TDocument> offsets(@Nullable Boolean value) {
			this.offsets = value;
			return this;
		}

		/**
		 * Specifies if term payloads should be returned.
		 * <p>
		 * API name: {@code payloads}
		 */
		public Builder<TDocument> payloads(@Nullable Boolean value) {
			this.payloads = value;
			return this;
		}

		/**
		 * Specifies if term positions should be returned.
		 * <p>
		 * API name: {@code positions}
		 */
		public Builder<TDocument> positions(@Nullable Boolean value) {
			this.positions = value;
			return this;
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random).
		 * <p>
		 * API name: {@code preference}
		 */
		public Builder<TDocument> preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * Specifies if request is real-time as opposed to near-real-time (default:
		 * true).
		 * <p>
		 * API name: {@code realtime}
		 */
		public Builder<TDocument> realtime(@Nullable Boolean value) {
			this.realtime = value;
			return this;
		}

		/**
		 * Specific routing value.
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder<TDocument> routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Specifies if total term frequency and document frequency should be returned.
		 * <p>
		 * API name: {@code term_statistics}
		 */
		public Builder<TDocument> termStatistics(@Nullable Boolean value) {
			this.termStatistics = value;
			return this;
		}

		/**
		 * Explicit version number for concurrency control
		 * <p>
		 * API name: {@code version}
		 */
		public Builder<TDocument> version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Specific version type
		 * <p>
		 * API name: {@code version_type}
		 */
		public Builder<TDocument> versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		/**
		 * API name: {@code doc}
		 */
		public Builder<TDocument> doc(@Nullable TDocument value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder<TDocument> filter(@Nullable Filter value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder<TDocument> filter(Function<Filter.Builder, ObjectBuilder<Filter>> fn) {
			return this.filter(fn.apply(new Filter.Builder()).build());
		}

		/**
		 * API name: {@code per_field_analyzer}
		 */
		public Builder<TDocument> perFieldAnalyzer(@Nullable Map<String, String> value) {
			this.perFieldAnalyzer = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #perFieldAnalyzer(Map)}, creating the map if
		 * needed.
		 */
		public Builder<TDocument> putPerFieldAnalyzer(String key, String value) {
			if (this.perFieldAnalyzer == null) {
				this.perFieldAnalyzer = new HashMap<>();
			}
			this.perFieldAnalyzer.put(key, value);
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link TermvectorsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermvectorsRequest<TDocument> build() {

			return new TermvectorsRequest<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for TermvectorsRequest
	 */
	public static <TDocument> JsonpDeserializer<TermvectorsRequest<TDocument>> createTermvectorsRequestDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> TermvectorsRequest.setupTermvectorsRequestDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupTermvectorsRequestDeserializer(
			DelegatingDeserializer<TermvectorsRequest.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::doc, tDocumentDeserializer, "doc");
		op.add(Builder::filter, Filter._DESERIALIZER, "filter");
		op.add(Builder::perFieldAnalyzer,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "per_field_analyzer");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code termvectors}".
	 */
	public static final Endpoint<TermvectorsRequest<?>, TermvectorsResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.fields != null) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.fieldStatistics != null) {
					params.put("field_statistics", String.valueOf(request.fieldStatistics));
				}
				if (request.offsets != null) {
					params.put("offsets", String.valueOf(request.offsets));
				}
				if (request.payloads != null) {
					params.put("payloads", String.valueOf(request.payloads));
				}
				if (request.positions != null) {
					params.put("positions", String.valueOf(request.positions));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.realtime != null) {
					params.put("realtime", String.valueOf(request.realtime));
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.termStatistics != null) {
					params.put("term_statistics", String.valueOf(request.termStatistics));
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				if (request.versionType != null) {
					params.put("version_type", request.versionType.toString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, TermvectorsResponse._DESERIALIZER);
}
