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

	private final String _id;

	private final String _index;

	@Nullable
	private final Number _primaryTerm;

	@Nullable
	private final JsonValue _routing;

	@Nullable
	private final Number _seqNo;

	@Nullable
	private final TDocument _source;

	@Nullable
	private final String _type;

	@Nullable
	private final Number _version;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected Hit(Builder<TDocument> builder) {

		this.error = builder.error;
		this.fields = builder.fields;
		this.found = builder.found;
		this._id = Objects.requireNonNull(builder._id, "_id");
		this._index = Objects.requireNonNull(builder._index, "_index");
		this._primaryTerm = builder._primaryTerm;
		this._routing = builder._routing;
		this._seqNo = builder._seqNo;
		this._source = builder._source;
		this._type = builder._type;
		this._version = builder._version;
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
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code _index}
	 */
	public String _index() {
		return this._index;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	@Nullable
	public Number _primaryTerm() {
		return this._primaryTerm;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public JsonValue _routing() {
		return this._routing;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public Number _seqNo() {
		return this._seqNo;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public TDocument _source() {
		return this._source;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String _type() {
		return this._type;
	}

	/**
	 * API name: {@code _version}
	 */
	@Nullable
	public Number _version() {
		return this._version;
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
		generator.write(this._id);

		generator.writeKey("_index");
		generator.write(this._index);

		if (this._primaryTerm != null) {

			generator.writeKey("_primary_term");
			generator.write(this._primaryTerm.doubleValue());

		}
		if (this._routing != null) {

			generator.writeKey("_routing");
			generator.write(this._routing);

		}
		if (this._seqNo != null) {

			generator.writeKey("_seq_no");
			generator.write(this._seqNo.doubleValue());

		}
		if (this._source != null) {

			generator.writeKey("_source");
			JsonpUtils.serialize(this._source, generator, tDocumentSerializer, mapper);

		}
		if (this._type != null) {

			generator.writeKey("_type");
			generator.write(this._type);

		}
		if (this._version != null) {

			generator.writeKey("_version");
			generator.write(this._version.doubleValue());

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

		private String _id;

		private String _index;

		@Nullable
		private Number _primaryTerm;

		@Nullable
		private JsonValue _routing;

		@Nullable
		private Number _seqNo;

		@Nullable
		private TDocument _source;

		@Nullable
		private String _type;

		@Nullable
		private Number _version;

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
		public Builder<TDocument> _id(String value) {
			this._id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder<TDocument> _index(String value) {
			this._index = value;
			return this;
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public Builder<TDocument> _primaryTerm(@Nullable Number value) {
			this._primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public Builder<TDocument> _routing(@Nullable JsonValue value) {
			this._routing = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder<TDocument> _seqNo(@Nullable Number value) {
			this._seqNo = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder<TDocument> _source(@Nullable TDocument value) {
			this._source = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public Builder<TDocument> _type(@Nullable String value) {
			this._type = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public Builder<TDocument> _version(@Nullable Number value) {
			this._version = value;
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
		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::_index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::_primaryTerm, JsonpDeserializer.numberDeserializer(), "_primary_term");
		op.add(Builder::_routing, JsonpDeserializer.jsonValueDeserializer(), "_routing");
		op.add(Builder::_seqNo, JsonpDeserializer.numberDeserializer(), "_seq_no");
		op.add(Builder::_source, tDocumentDeserializer, "_source");
		op.add(Builder::_type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::_version, JsonpDeserializer.numberDeserializer(), "_version");

	}

}
