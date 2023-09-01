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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
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

// typedef: _types.InlineGet

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.InlineGet">API
 *      specification</a>
 */
@JsonpDeserializable
public class InlineGet<TDocument> implements JsonpSerializable {
	private final Map<String, JsonData> metadata;

	private final Map<String, JsonData> fields;

	private final boolean found;

	@Nullable
	private final Long seqNo;

	@Nullable
	private final Long primaryTerm;

	@Nullable
	private final String routing;

	private final TDocument source;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private InlineGet(Builder<TDocument> builder) {

		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);

		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.found = ApiTypeHelper.requireNonNull(builder.found, this, "found");
		this.seqNo = builder.seqNo;
		this.primaryTerm = builder.primaryTerm;
		this.routing = builder.routing;
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> InlineGet<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<InlineGet<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Document metadata
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, JsonData> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code found}
	 */
	public final boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public final Long seqNo() {
		return this.seqNo;
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
	 * Required - API name: {@code _source}
	 */
	public final TDocument source() {
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

		for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}

		if (ApiTypeHelper.isDefined(this.fields)) {
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

		if (this.seqNo != null) {
			generator.writeKey("_seq_no");
			generator.write(this.seqNo);

		}
		if (this.primaryTerm != null) {
			generator.writeKey("_primary_term");
			generator.write(this.primaryTerm);

		}
		if (this.routing != null) {
			generator.writeKey("_routing");
			generator.write(this.routing);

		}
		generator.writeKey("_source");
		JsonpUtils.serialize(this.source, generator, tDocumentSerializer, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InlineGet}.
	 */

	public static class Builder<TDocument> extends WithJsonObjectBuilderBase<Builder<TDocument>>
			implements
				ObjectBuilder<InlineGet<TDocument>> {
		@Nullable
		private Map<String, JsonData> metadata = new HashMap<>();

		/**
		 * Document metadata
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder<TDocument> metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Document metadata
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder<TDocument> metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		@Nullable
		private Map<String, JsonData> fields;

		private Boolean found;

		@Nullable
		private Long seqNo;

		@Nullable
		private Long primaryTerm;

		@Nullable
		private String routing;

		private TDocument source;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder<TDocument> fields(Map<String, JsonData> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder<TDocument> fields(String key, JsonData value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code found}
		 */
		public final Builder<TDocument> found(boolean value) {
			this.found = value;
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
		 * Required - API name: {@code _source}
		 */
		public final Builder<TDocument> source(TDocument value) {
			this.source = value;
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

		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link InlineGet}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InlineGet<TDocument> build() {
			_checkSingleUse();

			return new InlineGet<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for InlineGet
	 */
	public static <TDocument> JsonpDeserializer<InlineGet<TDocument>> createInlineGetDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> InlineGet.setupInlineGetDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link InlineGet} based on named deserializers provided
	 * by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<InlineGet<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createInlineGetDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_types.TDocument")));

	protected static <TDocument> void setupInlineGetDeserializer(ObjectDeserializer<InlineGet.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");
		op.add(Builder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::source, tDocumentDeserializer, "_source");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.metadata(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
