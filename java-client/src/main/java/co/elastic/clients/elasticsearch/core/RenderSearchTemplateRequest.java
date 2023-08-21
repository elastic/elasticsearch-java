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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.render_search_template.Request

/**
 * Allows to use the Mustache language to pre-render a search definition.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.render_search_template.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class RenderSearchTemplateRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String file;

	@Nullable
	private final String id;

	private final Map<String, JsonData> params;

	@Nullable
	private final String source;

	// ---------------------------------------------------------------------------------------------

	private RenderSearchTemplateRequest(Builder builder) {

		this.file = builder.file;
		this.id = builder.id;
		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.source = builder.source;

	}

	public static RenderSearchTemplateRequest of(Function<Builder, ObjectBuilder<RenderSearchTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code file}
	 */
	@Nullable
	public final String file() {
		return this.file;
	}

	/**
	 * The id of the stored search template
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * API name: {@code source}
	 */
	@Nullable
	public final String source() {
		return this.source;
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

		if (this.file != null) {
			generator.writeKey("file");
			generator.write(this.file);

		}
		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.source != null) {
			generator.writeKey("source");
			generator.write(this.source);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RenderSearchTemplateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RenderSearchTemplateRequest> {
		@Nullable
		private String file;

		@Nullable
		private String id;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private String source;

		/**
		 * API name: {@code file}
		 */
		public final Builder file(@Nullable String value) {
			this.file = value;
			return this;
		}

		/**
		 * The id of the stored search template
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final Builder params(Map<String, JsonData> map) {
			this.params = _mapPutAll(this.params, map);
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final Builder params(String key, JsonData value) {
			this.params = _mapPut(this.params, key, value);
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public final Builder source(@Nullable String value) {
			this.source = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RenderSearchTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RenderSearchTemplateRequest build() {
			_checkSingleUse();

			return new RenderSearchTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RenderSearchTemplateRequest}
	 */
	public static final JsonpDeserializer<RenderSearchTemplateRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RenderSearchTemplateRequest::setupRenderSearchTemplateRequestDeserializer);

	protected static void setupRenderSearchTemplateRequestDeserializer(
			ObjectDeserializer<RenderSearchTemplateRequest.Builder> op) {

		op.add(Builder::file, JsonpDeserializer.stringDeserializer(), "file");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code render_search_template}".
	 */
	public static final Endpoint<RenderSearchTemplateRequest, RenderSearchTemplateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/render_search_template",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_render");
					buf.append("/template");
					return buf.toString();
				}
				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_render");
					buf.append("/template");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
				}
				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, RenderSearchTemplateResponse._DESERIALIZER);
}
