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

package co.elastic.clients.elasticsearch._global.mget;

import co.elastic.clients.elasticsearch._types.MainError;
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
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.mget.Hit
public final class Hit<TDocument> implements ToJsonp {
	@Nullable
	private final MainError error;

	@Nullable
	private final Map<String, JsonValue> fields;

	@Nullable
	private final Boolean found;

	private final String id;

	private final String index;

	@Nullable
	private final Number primaryTerm;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final Number seqNo;

	@Nullable
	private final TDocument source;

	@Nullable
	private final String type;

	@Nullable
	private final Number version;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected Hit(Builder<TDocument> builder) {

		this.error = builder.error;
		this.fields = builder.fields;
		this.found = builder.found;
		this.id = Objects.requireNonNull(builder.id, "_id");
		this.index = Objects.requireNonNull(builder.index, "_index");
		this.primaryTerm = builder.primaryTerm;
		this.routing = builder.routing;
		this.seqNo = builder.seqNo;
		this.source = builder.source;
		this.type = builder.type;
		this.version = builder.version;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public MainError error() {
		return this.error;
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
	@Nullable
	public Boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code _index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	@Nullable
	public Number primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public Number seqNo() {
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
	public Number version() {
		return this.version;
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

		if (this.error != null) {

			generator.writeKey("error");
			this.error.toJsonp(generator, mapper);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.found != null) {

			generator.writeKey("found");
			generator.write(this.found);

		}

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		if (this.primaryTerm != null) {

			generator.writeKey("_primary_term");
			generator.write(this.primaryTerm.doubleValue());

		}
		if (this.routing != null) {

			generator.writeKey("_routing");
			generator.write(this.routing);

		}
		if (this.seqNo != null) {

			generator.writeKey("_seq_no");
			generator.write(this.seqNo.doubleValue());

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
			generator.write(this.version.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Hit}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<Hit<TDocument>> {
		@Nullable
		private MainError error;

		@Nullable
		private Map<String, JsonValue> fields;

		@Nullable
		private Boolean found;

		private String id;

		private String index;

		@Nullable
		private Number primaryTerm;

		@Nullable
		private JsonValue routing;

		@Nullable
		private Number seqNo;

		@Nullable
		private TDocument source;

		@Nullable
		private String type;

		@Nullable
		private Number version;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code error}
		 */
		public Builder<TDocument> error(@Nullable MainError value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public Builder<TDocument> error(Function<MainError.Builder, ObjectBuilder<MainError>> fn) {
			return this.error(fn.apply(new MainError.Builder()).build());
		}

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
		public Builder<TDocument> found(@Nullable Boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * API name: {@code _id}
		 */
		public Builder<TDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public Builder<TDocument> primaryTerm(@Nullable Number value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public Builder<TDocument> routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder<TDocument> seqNo(@Nullable Number value) {
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
		public Builder<TDocument> version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 *
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link Hit}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Hit<TDocument> build() {

			return new Hit<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for Hit
	 */
	public static <TDocument> JsonpDeserializer<Hit<TDocument>> createHitDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> Hit.setupHitDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupHitDeserializer(DelegatingDeserializer<Hit.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::error, MainError.DESERIALIZER, "error");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"fields");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::primaryTerm, JsonpDeserializer.numberDeserializer(), "_primary_term");
		op.add(Builder::routing, JsonpDeserializer.jsonValueDeserializer(), "_routing");
		op.add(Builder::seqNo, JsonpDeserializer.numberDeserializer(), "_seq_no");
		op.add(Builder::source, tDocumentDeserializer, "_source");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "_version");

	}

}
