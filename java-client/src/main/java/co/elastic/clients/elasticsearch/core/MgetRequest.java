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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.core.mget.Operation;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
public class MgetRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final JsonValue /* Union(_types.Fields | internal.boolean) */ source;

	private final List<String> sourceExcludes;

	private final List<String> sourceIncludes;

	private final List<Operation> docs;

	private final List<String> ids;

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

	private final List<String> storedFields;

	// ---------------------------------------------------------------------------------------------

	private MgetRequest(Builder builder) {

		this.source = builder.source;
		this.sourceExcludes = ModelTypeHelper.unmodifiable(builder.sourceExcludes);
		this.sourceIncludes = ModelTypeHelper.unmodifiable(builder.sourceIncludes);
		this.docs = ModelTypeHelper.unmodifiable(builder.docs);
		this.ids = ModelTypeHelper.unmodifiable(builder.ids);
		this.index = builder.index;
		this.preference = builder.preference;
		this.realtime = builder.realtime;
		this.refresh = builder.refresh;
		this.routing = builder.routing;
		this.storedFields = ModelTypeHelper.unmodifiable(builder.storedFields);

	}

	public static MgetRequest of(Function<Builder, ObjectBuilder<MgetRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * True or false to return the _source field or not, or a list of fields to
	 * return
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final JsonValue /* Union(_types.Fields | internal.boolean) */ source() {
		return this.source;
	}

	/**
	 * A list of fields to exclude from the returned _source field
	 * <p>
	 * API name: {@code _source_excludes}
	 */
	public final List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * A list of fields to extract and return from the _source field
	 * <p>
	 * API name: {@code _source_includes}
	 */
	public final List<String> sourceIncludes() {
		return this.sourceIncludes;
	}

	/**
	 * API name: {@code docs}
	 */
	public final List<Operation> docs() {
		return this.docs;
	}

	/**
	 * API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	/**
	 * The name of the index
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random)
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * Specify whether to perform the operation in realtime or search mode
	 * <p>
	 * API name: {@code realtime}
	 */
	@Nullable
	public final Boolean realtime() {
		return this.realtime;
	}

	/**
	 * Refresh the shard containing the document before performing the operation
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Boolean refresh() {
		return this.refresh;
	}

	/**
	 * Specific routing value
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * A comma-separated list of stored fields to return in the response
	 * <p>
	 * API name: {@code stored_fields}
	 */
	public final List<String> storedFields() {
		return this.storedFields;
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

		if (ModelTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (Operation item0 : this.docs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.ids)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MgetRequest> {
		@Nullable
		private JsonValue /* Union(_types.Fields | internal.boolean) */ source;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private List<Operation> docs;

		@Nullable
		private List<String> ids;

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
		private List<String> storedFields;

		/**
		 * True or false to return the _source field or not, or a list of fields to
		 * return
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable JsonValue /* Union(_types.Fields | internal.boolean) */ value) {
			this.source = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned _source field
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public final Builder sourceExcludes(@Nullable List<String> value) {
			this.sourceExcludes = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned _source field
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public final Builder sourceExcludes(String... value) {
			this.sourceExcludes = Arrays.asList(value);
			return this;
		}

		/**
		 * A list of fields to extract and return from the _source field
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public final Builder sourceIncludes(@Nullable List<String> value) {
			this.sourceIncludes = value;
			return this;
		}

		/**
		 * A list of fields to extract and return from the _source field
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public final Builder sourceIncludes(String... value) {
			this.sourceIncludes = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		public final Builder docs(@Nullable List<Operation> value) {
			this.docs = value;
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		public final Builder docs(Operation... value) {
			this.docs = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		@SafeVarargs
		public final Builder docs(Function<Operation.Builder, ObjectBuilder<Operation>>... fns) {
			this.docs = new ArrayList<>(fns.length);
			for (Function<Operation.Builder, ObjectBuilder<Operation>> fn : fns) {
				this.docs.add(fn.apply(new Operation.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code ids}
		 */
		public final Builder ids(@Nullable List<String> value) {
			this.ids = value;
			return this;
		}

		/**
		 * API name: {@code ids}
		 */
		public final Builder ids(String... value) {
			this.ids = Arrays.asList(value);
			return this;
		}

		/**
		 * The name of the index
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random)
		 * <p>
		 * API name: {@code preference}
		 */
		public final Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * Specify whether to perform the operation in realtime or search mode
		 * <p>
		 * API name: {@code realtime}
		 */
		public final Builder realtime(@Nullable Boolean value) {
			this.realtime = value;
			return this;
		}

		/**
		 * Refresh the shard containing the document before performing the operation
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Boolean value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Specific routing value
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * A comma-separated list of stored fields to return in the response
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public final Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * A comma-separated list of stored fields to return in the response
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public final Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link MgetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MgetRequest build() {
			_checkSingleUse();

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
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.realtime != null) {
					params.put("realtime", String.valueOf(request.realtime));
				}
				if (ModelTypeHelper.isDefined(request.storedFields)) {
					params.put("stored_fields",
							request.storedFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
				}
				if (request.source != null) {
					params.put("_source", JsonpUtils.toString(request.source));
				}
				if (ModelTypeHelper.isDefined(request.sourceExcludes)) {
					params.put("_source_excludes",
							request.sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ModelTypeHelper.isDefined(request.sourceIncludes)) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code mget}" endpoint.
	 */
	public static <TDocument> Endpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse> createMgetEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT.withResponseDeserializer(MgetResponse.createMgetResponseDeserializer(tDocumentDeserializer));
	}
}
