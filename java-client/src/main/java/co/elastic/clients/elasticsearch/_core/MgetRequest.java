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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._core.mget.Operation;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: _global.mget.Request
@JsonpDeserializable
public final class MgetRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String index;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean realtime;

	@Nullable
	private final Boolean refresh;

	@Nullable
	private final String routing;

	@Nullable
	private final JsonValue /* Union(internal.boolean | _types.Fields) */ source;

	@Nullable
	private final List<String> sourceExcludes;

	@Nullable
	private final List<String> sourceIncludes;

	@Nullable
	private final List<String> storedFields;

	@Nullable
	private final List<Operation> docs;

	@Nullable
	private final List<String> ids;

	// ---------------------------------------------------------------------------------------------

	public MgetRequest(Builder builder) {

		this.index = builder.index;
		this.preference = builder.preference;
		this.realtime = builder.realtime;
		this.refresh = builder.refresh;
		this.routing = builder.routing;
		this.source = builder.source;
		this.sourceExcludes = ModelTypeHelper.unmodifiable(builder.sourceExcludes);
		this.sourceIncludes = ModelTypeHelper.unmodifiable(builder.sourceIncludes);
		this.storedFields = ModelTypeHelper.unmodifiable(builder.storedFields);
		this.docs = ModelTypeHelper.unmodifiable(builder.docs);
		this.ids = ModelTypeHelper.unmodifiable(builder.ids);

	}

	public MgetRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The name of the index
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random)
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * Specify whether to perform the operation in realtime or search mode
	 * <p>
	 * API name: {@code realtime}
	 */
	@Nullable
	public Boolean realtime() {
		return this.realtime;
	}

	/**
	 * Refresh the shard containing the document before performing the operation
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public Boolean refresh() {
		return this.refresh;
	}

	/**
	 * Specific routing value
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * True or false to return the _source field or not, or a list of fields to
	 * return
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue /* Union(internal.boolean | _types.Fields) */ source() {
		return this.source;
	}

	/**
	 * A list of fields to exclude from the returned _source field
	 * <p>
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * A list of fields to extract and return from the _source field
	 * <p>
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> sourceIncludes() {
		return this.sourceIncludes;
	}

	/**
	 * A comma-separated list of stored fields to return in the response
	 * <p>
	 * API name: {@code stored_fields}
	 */
	@Nullable
	public List<String> storedFields() {
		return this.storedFields;
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
	 * Builder for {@link MgetRequest}.
	 */
	public static class Builder implements ObjectBuilder<MgetRequest> {
		@Nullable
		private String index;

		@Nullable
		private String preference;

		@Nullable
		private Boolean realtime;

		@Nullable
		private Boolean refresh;

		@Nullable
		private String routing;

		@Nullable
		private JsonValue /* Union(internal.boolean | _types.Fields) */ source;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private List<Operation> docs;

		@Nullable
		private List<String> ids;

		/**
		 * The name of the index
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random)
		 * <p>
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * Specify whether to perform the operation in realtime or search mode
		 * <p>
		 * API name: {@code realtime}
		 */
		public Builder realtime(@Nullable Boolean value) {
			this.realtime = value;
			return this;
		}

		/**
		 * Refresh the shard containing the document before performing the operation
		 * <p>
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable Boolean value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Specific routing value
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * True or false to return the _source field or not, or a list of fields to
		 * return
		 * <p>
		 * API name: {@code _source}
		 */
		public Builder source(@Nullable JsonValue /* Union(internal.boolean | _types.Fields) */ value) {
			this.source = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned _source field
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(@Nullable List<String> value) {
			this.sourceExcludes = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned _source field
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(String... value) {
			this.sourceExcludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceExcludes(List)}, creating the list if needed. 4
		 */
		public Builder addSourceExcludes(String value) {
			if (this.sourceExcludes == null) {
				this.sourceExcludes = new ArrayList<>();
			}
			this.sourceExcludes.add(value);
			return this;
		}

		/**
		 * A list of fields to extract and return from the _source field
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(@Nullable List<String> value) {
			this.sourceIncludes = value;
			return this;
		}

		/**
		 * A list of fields to extract and return from the _source field
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(String... value) {
			this.sourceIncludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceIncludes(List)}, creating the list if needed. 4
		 */
		public Builder addSourceIncludes(String value) {
			if (this.sourceIncludes == null) {
				this.sourceIncludes = new ArrayList<>();
			}
			this.sourceIncludes.add(value);
			return this;
		}

		/**
		 * A comma-separated list of stored fields to return in the response
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * A comma-separated list of stored fields to return in the response
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #storedFields(List)}, creating the list if needed. 4
		 */
		public Builder addStoredFields(String value) {
			if (this.storedFields == null) {
				this.storedFields = new ArrayList<>();
			}
			this.storedFields.add(value);
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
		 * Add a value to {@link #docs(List)}, creating the list if needed. 4
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
		 * Add a value to {@link #docs(List)}, creating the list if needed. 5
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
		 * Add a value to {@link #ids(List)}, creating the list if needed. 4
		 */
		public Builder addIds(String value) {
			if (this.ids == null) {
				this.ids = new ArrayList<>();
			}
			this.ids.add(value);
			return this;
		}

		/**
		 * Builds a {@link MgetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MgetRequest build() {

			return new MgetRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MgetRequest}
	 */
	public static final JsonpDeserializer<MgetRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MgetRequest::setupMgetRequestDeserializer, Builder::build);

	protected static void setupMgetRequestDeserializer(DelegatingDeserializer<MgetRequest.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(Operation._DESERIALIZER), "docs");
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code mget}".
	 */
	private static final SimpleEndpoint<MgetRequest, Void> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/_mget");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_mget");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.realtime != null) {
					params.put("realtime", String.valueOf(request.realtime));
				}
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.source != null) {
					params.put("_source", JsonpUtils.toString(request.source));
				}
				if (request.sourceExcludes != null) {
					params.put("_source_excludes",
							request.sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.sourceIncludes != null) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.storedFields != null) {
					params.put("stored_fields",
							request.storedFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code mget}" endpoint.
	 */
	public static <TDocument> Endpoint<MgetRequest, MgetResponse<TDocument>, ElasticsearchError> createMgetEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT.withResponseDeserializer(MgetResponse.createMgetResponseDeserializer(tDocumentDeserializer));
	}
}
