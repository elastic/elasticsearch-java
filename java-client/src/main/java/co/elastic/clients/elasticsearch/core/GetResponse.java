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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.get.Response

public final class GetResponse<TDocument> implements JsonpSerializable {
	private final String index;

	@Nullable
	private final Map<String, JsonData> fields;

	private final boolean found;

	private final String id;

	@Nullable
	private final Long primaryTerm;

	@Nullable
	private final String routing;

	@Nullable
	private final Long seqNo;

	@Nullable
	private final TDocument source;

	@Nullable
	private final String type;

	@Nullable
	private final Long version;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public GetResponse(Builder<TDocument> builder) {

		this.index = Objects.requireNonNull(builder.index, "_index");
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.found = Objects.requireNonNull(builder.found, "found");
		this.id = Objects.requireNonNull(builder.id, "_id");
		this.primaryTerm = builder.primaryTerm;
		this.routing = builder.routing;
		this.seqNo = builder.seqNo;
		this.source = builder.source;
		this.type = builder.type;
		this.version = builder.version;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public GetResponse(Function<Builder<TDocument>, Builder<TDocument>> fn) {
		this(fn.apply(new Builder<>()));
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, JsonData> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code found}
	 */
	public boolean found() {
		return this.found;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	@Nullable
	public Long primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public Long seqNo() {
		return this.seqNo;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public TDocument source() {
		return this.source;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code _version}
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

		generator.writeKey("_index");
		generator.write(this.index);

		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("_id");
		generator.write(this.id);

		if (this.primaryTerm != null) {

			generator.writeKey("_primary_term");
			generator.write(this.primaryTerm);

		}
		if (this.routing != null) {

			generator.writeKey("_routing");
			generator.write(this.routing);

		}
		if (this.seqNo != null) {

			generator.writeKey("_seq_no");
			generator.write(this.seqNo);

		}
		if (this.source != null) {

			generator.writeKey("_source");
			JsonpUtils.serialize(this.source, generator, tDocumentSerializer, mapper);

		}
		if (this.type != null) {

			generator.writeKey("_type");
			generator.write(this.type);

		}
		if (this.version != null) {

			generator.writeKey("_version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetResponse}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<GetResponse<TDocument>> {
		private String index;

		@Nullable
		private Map<String, JsonData> fields;

		private Boolean found;

		private String id;

		@Nullable
		private Long primaryTerm;

		@Nullable
		private String routing;

		@Nullable
		private Long seqNo;

		@Nullable
		private TDocument source;

		@Nullable
		private String type;

		@Nullable
		private Long version;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code _index}
		 */
		public Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder<TDocument> fields(@Nullable Map<String, JsonData> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putFields(String key, JsonData value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return this;
		}

		/**
		 * Required - API name: {@code found}
		 */
		public Builder<TDocument> found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public Builder<TDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public Builder<TDocument> primaryTerm(@Nullable Long value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public Builder<TDocument> routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder<TDocument> seqNo(@Nullable Long value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder<TDocument> source(@Nullable TDocument value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public Builder<TDocument> type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public Builder<TDocument> version(@Nullable Long value) {
			this.version = value;
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
		 * Builds a {@link GetResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetResponse<TDocument> build() {

			return new GetResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for GetResponse
	 */
	public static <TDocument> JsonpDeserializer<GetResponse<TDocument>> createGetResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> GetResponse.setupGetResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupGetResponseDeserializer(
			DelegatingDeserializer<GetResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");
		op.add(Builder::source, tDocumentDeserializer, "_source");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");

	}

}
