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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.indices.put_index_template.IndexTemplateMapping;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.put_index_template.Request
public final class PutIndexTemplateRequest extends RequestBase implements ToJsonp {
	private final String name;

	@Nullable
	private final List<String> indexPatterns;

	@Nullable
	private final List<String> composedOf;

	@Nullable
	private final IndexTemplateMapping template;

	@Nullable
	private final JsonValue dataStream;

	@Nullable
	private final Number priority;

	@Nullable
	private final Number version;

	@Nullable
	private final Map<String, JsonValue> _meta;

	// ---------------------------------------------------------------------------------------------

	protected PutIndexTemplateRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.indexPatterns = builder.indexPatterns;
		this.composedOf = builder.composedOf;
		this.template = builder.template;
		this.dataStream = builder.dataStream;
		this.priority = builder.priority;
		this.version = builder.version;
		this._meta = builder._meta;

	}

	/**
	 * Index or template name
	 *
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code index_patterns}
	 */
	@Nullable
	public List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * API name: {@code composed_of}
	 */
	@Nullable
	public List<String> composedOf() {
		return this.composedOf;
	}

	/**
	 * API name: {@code template}
	 */
	@Nullable
	public IndexTemplateMapping template() {
		return this.template;
	}

	/**
	 * API name: {@code data_stream}
	 */
	@Nullable
	public JsonValue dataStream() {
		return this.dataStream;
	}

	/**
	 * API name: {@code priority}
	 */
	@Nullable
	public Number priority() {
		return this.priority;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonValue> _meta() {
		return this._meta;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.indexPatterns != null) {

			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.composedOf != null) {

			generator.writeKey("composed_of");
			generator.writeStartArray();
			for (String item0 : this.composedOf) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.template != null) {

			generator.writeKey("template");
			this.template.toJsonp(generator, mapper);

		}
		if (this.dataStream != null) {

			generator.writeKey("data_stream");
			generator.write(this.dataStream);

		}
		if (this.priority != null) {

			generator.writeKey("priority");
			generator.write(this.priority.doubleValue());

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}
		if (this._meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this._meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutIndexTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutIndexTemplateRequest> {
		private String name;

		@Nullable
		private List<String> indexPatterns;

		@Nullable
		private List<String> composedOf;

		@Nullable
		private IndexTemplateMapping template;

		@Nullable
		private JsonValue dataStream;

		@Nullable
		private Number priority;

		@Nullable
		private Number version;

		@Nullable
		private Map<String, JsonValue> _meta;

		/**
		 * Index or template name
		 *
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code index_patterns}
		 */
		public Builder indexPatterns(@Nullable List<String> value) {
			this.indexPatterns = value;
			return this;
		}

		/**
		 * API name: {@code index_patterns}
		 */
		public Builder indexPatterns(String... value) {
			this.indexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indexPatterns(List)}, creating the list if needed.
		 */
		public Builder addIndexPatterns(String value) {
			if (this.indexPatterns == null) {
				this.indexPatterns = new ArrayList<>();
			}
			this.indexPatterns.add(value);
			return this;
		}

		/**
		 * API name: {@code composed_of}
		 */
		public Builder composedOf(@Nullable List<String> value) {
			this.composedOf = value;
			return this;
		}

		/**
		 * API name: {@code composed_of}
		 */
		public Builder composedOf(String... value) {
			this.composedOf = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #composedOf(List)}, creating the list if needed.
		 */
		public Builder addComposedOf(String value) {
			if (this.composedOf == null) {
				this.composedOf = new ArrayList<>();
			}
			this.composedOf.add(value);
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(@Nullable IndexTemplateMapping value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(Function<IndexTemplateMapping.Builder, ObjectBuilder<IndexTemplateMapping>> fn) {
			return this.template(fn.apply(new IndexTemplateMapping.Builder()).build());
		}

		/**
		 * API name: {@code data_stream}
		 */
		public Builder dataStream(@Nullable JsonValue value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * API name: {@code priority}
		 */
		public Builder priority(@Nullable Number value) {
			this.priority = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 */
		public Builder _meta(@Nullable Map<String, JsonValue> value) {
			this._meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #_meta(Map)}, creating the map if needed.
		 */
		public Builder put_meta(String key, JsonValue value) {
			if (this._meta == null) {
				this._meta = new HashMap<>();
			}
			this._meta.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link PutIndexTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutIndexTemplateRequest build() {

			return new PutIndexTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PutIndexTemplateRequest
	 */
	public static final JsonpValueParser<PutIndexTemplateRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutIndexTemplateRequest::setupPutIndexTemplateRequestParser);

	protected static void setupPutIndexTemplateRequestParser(
			DelegatingJsonpValueParser<PutIndexTemplateRequest.Builder> op) {

		op.add(Builder::indexPatterns, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "index_patterns");
		op.add(Builder::composedOf, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "composed_of");
		op.add(Builder::template, IndexTemplateMapping.JSONP_PARSER, "template");
		op.add(Builder::dataStream, JsonpValueParser.jsonValueParser(), "data_stream");
		op.add(Builder::priority, JsonpValueParser.numberParser(), "priority");
		op.add(Builder::version, JsonpValueParser.numberParser(), "version");
		op.add(Builder::_meta, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "_meta");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_index_template}".
	 */
	public static final Endpoint<PutIndexTemplateRequest, PutIndexTemplateResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PutIndexTemplateResponse.JSONP_PARSER);
}
