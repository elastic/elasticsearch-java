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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.elasticsearch.core.mtermvectors.Operation;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
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
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.mtermvectors.Request
@JsonpDeserializable
public final class MtermvectorsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String index;

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
	private final List<Operation> docs;

	@Nullable
	private final List<String> ids;

	// ---------------------------------------------------------------------------------------------

	public MtermvectorsRequest(Builder builder) {

		this.index = builder.index;
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
		this.docs = ModelTypeHelper.unmodifiable(builder.docs);
		this.ids = ModelTypeHelper.unmodifiable(builder.ids);

	}

	public MtermvectorsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The index in which the document resides.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * A comma-separated list of fields to return. Applies to all returned documents
	 * unless otherwise specified in body &quot;params&quot; or &quot;docs&quot;.
	 * <p>
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * Specifies if document count, sum of document frequencies and sum of total
	 * term frequencies should be returned. Applies to all returned documents unless
	 * otherwise specified in body &quot;params&quot; or &quot;docs&quot;.
	 * <p>
	 * API name: {@code field_statistics}
	 */
	@Nullable
	public Boolean fieldStatistics() {
		return this.fieldStatistics;
	}

	/**
	 * Specifies if term offsets should be returned. Applies to all returned
	 * documents unless otherwise specified in body &quot;params&quot; or
	 * &quot;docs&quot;.
	 * <p>
	 * API name: {@code offsets}
	 */
	@Nullable
	public Boolean offsets() {
		return this.offsets;
	}

	/**
	 * Specifies if term payloads should be returned. Applies to all returned
	 * documents unless otherwise specified in body &quot;params&quot; or
	 * &quot;docs&quot;.
	 * <p>
	 * API name: {@code payloads}
	 */
	@Nullable
	public Boolean payloads() {
		return this.payloads;
	}

	/**
	 * Specifies if term positions should be returned. Applies to all returned
	 * documents unless otherwise specified in body &quot;params&quot; or
	 * &quot;docs&quot;.
	 * <p>
	 * API name: {@code positions}
	 */
	@Nullable
	public Boolean positions() {
		return this.positions;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random) .Applies to all returned documents unless otherwise specified in body
	 * &quot;params&quot; or &quot;docs&quot;.
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * Specifies if requests are real-time as opposed to near-real-time (default:
	 * true).
	 * <p>
	 * API name: {@code realtime}
	 */
	@Nullable
	public Boolean realtime() {
		return this.realtime;
	}

	/**
	 * Specific routing value. Applies to all returned documents unless otherwise
	 * specified in body &quot;params&quot; or &quot;docs&quot;.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * Specifies if total term frequency and document frequency should be returned.
	 * Applies to all returned documents unless otherwise specified in body
	 * &quot;params&quot; or &quot;docs&quot;.
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
	 * API name: {@code docs}
	 */
	@Nullable
	public List<Operation> docs() {
		return this.docs;
	}

	/**
	 * API name: {@code ids}
	 */
	@Nullable
	public List<String> ids() {
		return this.ids;
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

		if (this.docs != null) {

			generator.writeKey("docs");
			generator.writeStartArray();
			for (Operation item0 : this.docs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.ids != null) {

			generator.writeKey("ids");
			generator.writeStartArray();
			for (String item0 : this.ids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MtermvectorsRequest}.
	 */
	public static class Builder implements ObjectBuilder<MtermvectorsRequest> {
		@Nullable
		private String index;

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
		private List<Operation> docs;

		@Nullable
		private List<String> ids;

		/**
		 * The index in which the document resides.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of fields to return. Applies to all returned documents
		 * unless otherwise specified in body &quot;params&quot; or &quot;docs&quot;.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * A comma-separated list of fields to return. Applies to all returned documents
		 * unless otherwise specified in body &quot;params&quot; or &quot;docs&quot;.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * Specifies if document count, sum of document frequencies and sum of total
		 * term frequencies should be returned. Applies to all returned documents unless
		 * otherwise specified in body &quot;params&quot; or &quot;docs&quot;.
		 * <p>
		 * API name: {@code field_statistics}
		 */
		public Builder fieldStatistics(@Nullable Boolean value) {
			this.fieldStatistics = value;
			return this;
		}

		/**
		 * Specifies if term offsets should be returned. Applies to all returned
		 * documents unless otherwise specified in body &quot;params&quot; or
		 * &quot;docs&quot;.
		 * <p>
		 * API name: {@code offsets}
		 */
		public Builder offsets(@Nullable Boolean value) {
			this.offsets = value;
			return this;
		}

		/**
		 * Specifies if term payloads should be returned. Applies to all returned
		 * documents unless otherwise specified in body &quot;params&quot; or
		 * &quot;docs&quot;.
		 * <p>
		 * API name: {@code payloads}
		 */
		public Builder payloads(@Nullable Boolean value) {
			this.payloads = value;
			return this;
		}

		/**
		 * Specifies if term positions should be returned. Applies to all returned
		 * documents unless otherwise specified in body &quot;params&quot; or
		 * &quot;docs&quot;.
		 * <p>
		 * API name: {@code positions}
		 */
		public Builder positions(@Nullable Boolean value) {
			this.positions = value;
			return this;
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random) .Applies to all returned documents unless otherwise specified in body
		 * &quot;params&quot; or &quot;docs&quot;.
		 * <p>
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * Specifies if requests are real-time as opposed to near-real-time (default:
		 * true).
		 * <p>
		 * API name: {@code realtime}
		 */
		public Builder realtime(@Nullable Boolean value) {
			this.realtime = value;
			return this;
		}

		/**
		 * Specific routing value. Applies to all returned documents unless otherwise
		 * specified in body &quot;params&quot; or &quot;docs&quot;.
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Specifies if total term frequency and document frequency should be returned.
		 * Applies to all returned documents unless otherwise specified in body
		 * &quot;params&quot; or &quot;docs&quot;.
		 * <p>
		 * API name: {@code term_statistics}
		 */
		public Builder termStatistics(@Nullable Boolean value) {
			this.termStatistics = value;
			return this;
		}

		/**
		 * Explicit version number for concurrency control
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Specific version type
		 * <p>
		 * API name: {@code version_type}
		 */
		public Builder versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		public Builder docs(@Nullable List<Operation> value) {
			this.docs = value;
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		public Builder docs(Operation... value) {
			this.docs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #docs(List)}, creating the list if needed.
		 */
		public Builder addDocs(Operation value) {
			if (this.docs == null) {
				this.docs = new ArrayList<>();
			}
			this.docs.add(value);
			return this;
		}

		/**
		 * Set {@link #docs(List)} to a singleton list.
		 */
		public Builder docs(Function<Operation.Builder, ObjectBuilder<Operation>> fn) {
			return this.docs(fn.apply(new Operation.Builder()).build());
		}

		/**
		 * Add a value to {@link #docs(List)}, creating the list if needed.
		 */
		public Builder addDocs(Function<Operation.Builder, ObjectBuilder<Operation>> fn) {
			return this.addDocs(fn.apply(new Operation.Builder()).build());
		}

		/**
		 * API name: {@code ids}
		 */
		public Builder ids(@Nullable List<String> value) {
			this.ids = value;
			return this;
		}

		/**
		 * API name: {@code ids}
		 */
		public Builder ids(String... value) {
			this.ids = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ids(List)}, creating the list if needed.
		 */
		public Builder addIds(String value) {
			if (this.ids == null) {
				this.ids = new ArrayList<>();
			}
			this.ids.add(value);
			return this;
		}

		/**
		 * Builds a {@link MtermvectorsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MtermvectorsRequest build() {

			return new MtermvectorsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MtermvectorsRequest}
	 */
	public static final JsonpDeserializer<MtermvectorsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MtermvectorsRequest::setupMtermvectorsRequestDeserializer, Builder::build);

	protected static void setupMtermvectorsRequestDeserializer(DelegatingDeserializer<MtermvectorsRequest.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(Operation._DESERIALIZER), "docs");
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code mtermvectors}".
	 */
	public static final Endpoint<MtermvectorsRequest, MtermvectorsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/_mtermvectors");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_mtermvectors");
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

			}, SimpleEndpoint.emptyMap(), true, MtermvectorsResponse._DESERIALIZER);
}
