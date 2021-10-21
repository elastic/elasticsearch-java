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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.indices.put_index_template.IndexTemplateMapping;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
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
@JsonpDeserializable
public final class PutIndexTemplateRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Map<String, JsonData> meta;

	@Nullable
	private final List<String> composedOf;

	@Nullable
	private final DataStream dataStream;

	@Nullable
	private final List<String> indexPatterns;

	private final String name;

	@Nullable
	private final Integer priority;

	@Nullable
	private final IndexTemplateMapping template;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	public PutIndexTemplateRequest(Builder builder) {

		this.meta = ModelTypeHelper.unmodifiable(builder.meta);
		this.composedOf = ModelTypeHelper.unmodifiable(builder.composedOf);
		this.dataStream = builder.dataStream;
		this.indexPatterns = ModelTypeHelper.unmodifiable(builder.indexPatterns);
		this.name = Objects.requireNonNull(builder.name, "name");
		this.priority = builder.priority;
		this.template = builder.template;
		this.version = builder.version;

	}

	public PutIndexTemplateRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code composed_of}
	 */
	@Nullable
	public List<String> composedOf() {
		return this.composedOf;
	}

	/**
	 * API name: {@code data_stream}
	 */
	@Nullable
	public DataStream dataStream() {
		return this.dataStream;
	}

	/**
	 * API name: {@code index_patterns}
	 */
	@Nullable
	public List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * Required - Index or template name
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code priority}
	 */
	@Nullable
	public Integer priority() {
		return this.priority;
	}

	/**
	 * API name: {@code template}
	 */
	@Nullable
	public IndexTemplateMapping template() {
		return this.template;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
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

		if (this.meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
		if (this.dataStream != null) {

			generator.writeKey("data_stream");
			this.dataStream.serialize(generator, mapper);

		}
		if (this.indexPatterns != null) {

			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.priority != null) {

			generator.writeKey("priority");
			generator.write(this.priority);

		}
		if (this.template != null) {

			generator.writeKey("template");
			this.template.serialize(generator, mapper);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutIndexTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutIndexTemplateRequest> {
		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private List<String> composedOf;

		@Nullable
		private DataStream dataStream;

		@Nullable
		private List<String> indexPatterns;

		private String name;

		@Nullable
		private Integer priority;

		@Nullable
		private IndexTemplateMapping template;

		@Nullable
		private Long version;

		/**
		 * API name: {@code _meta}
		 */
		public Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder putMeta(String key, JsonData value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
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
		 * API name: {@code data_stream}
		 */
		public Builder dataStream(@Nullable DataStream value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * API name: {@code data_stream}
		 */
		public Builder dataStream(Function<DataStream.Builder, ObjectBuilder<DataStream>> fn) {
			return this.dataStream(fn.apply(new DataStream.Builder()).build());
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
		 * Required - Index or template name
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code priority}
		 */
		public Builder priority(@Nullable Integer value) {
			this.priority = value;
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
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
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
	 * Json deserializer for {@link PutIndexTemplateRequest}
	 */
	public static final JsonpDeserializer<PutIndexTemplateRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutIndexTemplateRequest::setupPutIndexTemplateRequestDeserializer, Builder::build);

	protected static void setupPutIndexTemplateRequestDeserializer(
			DelegatingDeserializer<PutIndexTemplateRequest.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::composedOf, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"composed_of");
		op.add(Builder::dataStream, DataStream._DESERIALIZER, "data_stream");
		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");
		op.add(Builder::priority, JsonpDeserializer.integerDeserializer(), "priority");
		op.add(Builder::template, IndexTemplateMapping._DESERIALIZER, "template");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_index_template}".
	 */
	public static final Endpoint<PutIndexTemplateRequest, PutIndexTemplateResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutIndexTemplateResponse._DESERIALIZER);
}
