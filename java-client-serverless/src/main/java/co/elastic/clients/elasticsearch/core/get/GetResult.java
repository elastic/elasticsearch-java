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

package co.elastic.clients.elasticsearch.core.get;

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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.get.GetResult

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.get.GetResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetResult<TDocument> implements JsonpSerializable {
	private final String index;

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
	private final Long version;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected GetResult(AbstractBuilder<TDocument, ?> builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.found = ApiTypeHelper.requireNonNull(builder.found, this, "found");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.primaryTerm = builder.primaryTerm;
		this.routing = builder.routing;
		this.seqNo = builder.seqNo;
		this.source = builder.source;
		this.version = builder.version;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> GetResult<TDocument> getResultOf(
			Function<Builder<TDocument>, ObjectBuilder<GetResult<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public final String index() {
		return this.index;
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
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
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

		generator.writeKey("_index");
		generator.write(this.index);

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
		if (this.version != null) {
			generator.writeKey("_version");
			generator.write(this.version);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetResult}.
	 */

	public static class Builder<TDocument> extends GetResult.AbstractBuilder<TDocument, Builder<TDocument>>
			implements
				ObjectBuilder<GetResult<TDocument>> {
		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link GetResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetResult<TDocument> build() {
			_checkSingleUse();

			return new GetResult<TDocument>(this);
		}
	}

	public abstract static class AbstractBuilder<TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
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
		private Long version;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code _index}
		 */
		public final BuilderT index(String value) {
			this.index = value;
			return self();
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final BuilderT fields(Map<String, JsonData> map) {
			this.fields = _mapPutAll(this.fields, map);
			return self();
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final BuilderT fields(String key, JsonData value) {
			this.fields = _mapPut(this.fields, key, value);
			return self();
		}

		/**
		 * Required - API name: {@code found}
		 */
		public final BuilderT found(boolean value) {
			this.found = value;
			return self();
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public final BuilderT id(String value) {
			this.id = value;
			return self();
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public final BuilderT primaryTerm(@Nullable Long value) {
			this.primaryTerm = value;
			return self();
		}

		/**
		 * API name: {@code _routing}
		 */
		public final BuilderT routing(@Nullable String value) {
			this.routing = value;
			return self();
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public final BuilderT seqNo(@Nullable Long value) {
			this.seqNo = value;
			return self();
		}

		/**
		 * API name: {@code _source}
		 */
		public final BuilderT source(@Nullable TDocument value) {
			this.source = value;
			return self();
		}

		/**
		 * API name: {@code _version}
		 */
		public final BuilderT version(@Nullable Long value) {
			this.version = value;
			return self();
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final BuilderT tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for GetResult
	 */
	public static <TDocument> JsonpDeserializer<GetResult<TDocument>> createGetResultDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> GetResult.setupGetResultDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link GetResult} based on named deserializers provided
	 * by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<GetResult<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createGetResultDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.get.TDocument")));

	protected static <TDocument, BuilderT extends AbstractBuilder<TDocument, BuilderT>> void setupGetResultDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(AbstractBuilder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(AbstractBuilder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(AbstractBuilder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(AbstractBuilder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(AbstractBuilder::routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(AbstractBuilder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");
		op.add(AbstractBuilder::source, tDocumentDeserializer, "_source");
		op.add(AbstractBuilder::version, JsonpDeserializer.longDeserializer(), "_version");

	}

}
