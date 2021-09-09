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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _types.InlineGet
public final class InlineGet<TDocument> implements ToJsonp {
	@Nullable
	private final Map<String, JsonValue> fields;

	private final Boolean found;

	private final Number seqNo;

	private final Number primaryTerm;

	@Nullable
	private final String routing;

	private final TDocument source;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected InlineGet(Builder<TDocument> builder) {

		this.fields = builder.fields;
		this.found = Objects.requireNonNull(builder.found, "found");
		this.seqNo = Objects.requireNonNull(builder.seqNo, "_seq_no");
		this.primaryTerm = Objects.requireNonNull(builder.primaryTerm, "_primary_term");
		this.routing = builder.routing;
		this.source = Objects.requireNonNull(builder.source, "_source");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, JsonValue> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code found}
	 */
	public Boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	public Number seqNo() {
		return this.seqNo;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	public Number primaryTerm() {
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
	 * API name: {@code _source}
	 */
	public TDocument source() {
		return this.source;
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

		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("_seq_no");
		generator.write(this.seqNo.doubleValue());

		generator.writeKey("_primary_term");
		generator.write(this.primaryTerm.doubleValue());

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
		private Map<String, JsonValue> fields;

		private Boolean found;

		private Number seqNo;

		private Number primaryTerm;

		@Nullable
		private String routing;

		private TDocument source;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code fields}
		 */
		public Builder<TDocument> fields(@Nullable Map<String, JsonValue> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putFields(String key, JsonValue value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return this;
		}

		/**
		 * API name: {@code found}
		 */
		public Builder<TDocument> found(Boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder<TDocument> seqNo(Number value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public Builder<TDocument> primaryTerm(Number value) {
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
		 * API name: {@code _source}
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

		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"fields");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::seqNo, JsonpDeserializer.numberDeserializer(), "_seq_no");
		op.add(Builder::primaryTerm, JsonpDeserializer.numberDeserializer(), "_primary_term");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::source, tDocumentDeserializer, "_source");

	}

}
