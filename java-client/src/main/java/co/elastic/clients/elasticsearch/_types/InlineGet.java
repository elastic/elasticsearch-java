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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _types.InlineGet

public final class InlineGet<TDocument> implements JsonpSerializable {
	@Nullable
	private final Map<String, JsonData> fields;

	private final boolean found;

	private final int seqNo;

	private final long primaryTerm;

	@Nullable
	private final String routing;

	private final TDocument source;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public InlineGet(Builder<TDocument> builder) {

		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.found = Objects.requireNonNull(builder.found, "found");
		this.seqNo = Objects.requireNonNull(builder.seqNo, "_seq_no");
		this.primaryTerm = Objects.requireNonNull(builder.primaryTerm, "_primary_term");
		this.routing = builder.routing;
		this.source = Objects.requireNonNull(builder.source, "_source");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public InlineGet(Function<Builder<TDocument>, Builder<TDocument>> fn) {
		this(fn.apply(new Builder<>()));
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
	 * Required - API name: {@code _seq_no}
	 */
	public int seqNo() {
		return this.seqNo;
	}

	/**
	 * Required - API name: {@code _primary_term}
	 */
	public long primaryTerm() {
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
	 * Required - API name: {@code _source}
	 */
	public TDocument source() {
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

		generator.writeKey("_seq_no");
		generator.write(this.seqNo);

		generator.writeKey("_primary_term");
		generator.write(this.primaryTerm);

		if (this.routing != null) {

			generator.writeKey("_routing");
			generator.write(this.routing);

		}

		generator.writeKey("_source");
		JsonpUtils.serialize(this.source, generator, tDocumentSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InlineGet}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<InlineGet<TDocument>> {
		@Nullable
		private Map<String, JsonData> fields;

		private Boolean found;

		private Integer seqNo;

		private Long primaryTerm;

		@Nullable
		private String routing;

		private TDocument source;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

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
		 * Required - API name: {@code _seq_no}
		 */
		public Builder<TDocument> seqNo(int value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code _primary_term}
		 */
		public Builder<TDocument> primaryTerm(long value) {
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
		 * Required - API name: {@code _source}
		 */
		public Builder<TDocument> source(TDocument value) {
			this.source = value;
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
		 * Builds a {@link InlineGet}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InlineGet<TDocument> build() {

			return new InlineGet<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for InlineGet
	 */
	public static <TDocument> JsonpDeserializer<InlineGet<TDocument>> createInlineGetDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> InlineGet.setupInlineGetDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupInlineGetDeserializer(
			DelegatingDeserializer<InlineGet.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::seqNo, JsonpDeserializer.integerDeserializer(), "_seq_no");
		op.add(Builder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::source, tDocumentDeserializer, "_source");

	}

}
