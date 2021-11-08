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

package co.elastic.clients.elasticsearch.core.mget;

import co.elastic.clients.elasticsearch._types.ErrorCause;
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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.mget.Hit

public class Hit<TDocument> implements JsonpSerializable {
	@Nullable
	private final ErrorCause error;

	private final Map<String, JsonData> fields;

	@Nullable
	private final Boolean found;

	private final String id;

	private final String index;

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

	private Hit(Builder<TDocument> builder) {

		this.error = builder.error;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.found = builder.found;
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.primaryTerm = builder.primaryTerm;
		this.routing = builder.routing;
		this.seqNo = builder.seqNo;
		this.source = builder.source;
		this.type = builder.type;
		this.version = builder.version;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> Hit<TDocument> of(Function<Builder<TDocument>, ObjectBuilder<Hit<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, JsonData> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code found}
	 */
	@Nullable
	public final Boolean found() {
		return this.found;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	@Nullable
	public final Long primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public final Long seqNo() {
		return this.seqNo;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public final TDocument source() {
		return this.source;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code _version}
	 */
	@Nullable
	public final Long version() {
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

		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link Hit}.
	 */
	public static class Builder<TDocument> extends ObjectBuilderBase implements ObjectBuilder<Hit<TDocument>> {
		@Nullable
		private ErrorCause error;

		@Nullable
		private Map<String, JsonData> fields;

		@Nullable
		private Boolean found;

		private String id;

		private String index;

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
		 * API name: {@code error}
		 */
		public final Builder<TDocument> error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder<TDocument> error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code fields}
		 */
		public final Builder<TDocument> fields(@Nullable Map<String, JsonData> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code found}
		 */
		public final Builder<TDocument> found(@Nullable Boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder<TDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public final Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public final Builder<TDocument> primaryTerm(@Nullable Long value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public final Builder<TDocument> routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public final Builder<TDocument> seqNo(@Nullable Long value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder<TDocument> source(@Nullable TDocument value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public final Builder<TDocument> type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public final Builder<TDocument> version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
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
			_checkSingleUse();

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

		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");
		op.add(Builder::source, tDocumentDeserializer, "_source");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");

	}

}
