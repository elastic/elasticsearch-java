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

package co.elastic.clients.elasticsearch.core.search;

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
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.search._types.CompletionSuggestOption

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.CompletionSuggestOption">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompletionSuggestOption<TDocument> implements JsonpSerializable {
	@Nullable
	private final Boolean collateMatch;

	private final Map<String, List<Context>> contexts;

	private final Map<String, JsonData> fields;

	@Nullable
	private final String id;

	@Nullable
	private final String index;

	@Nullable
	private final String routing;

	@Nullable
	private final Double score;

	@Nullable
	private final TDocument source;

	private final String text;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private CompletionSuggestOption(Builder<TDocument> builder) {

		this.collateMatch = builder.collateMatch;
		this.contexts = ApiTypeHelper.unmodifiable(builder.contexts);
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.id = builder.id;
		this.index = builder.index;
		this.routing = builder.routing;
		this.score = builder.score;
		this.source = builder.source;
		this.text = ApiTypeHelper.requireNonNull(builder.text, this, "text");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> CompletionSuggestOption<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<CompletionSuggestOption<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * API name: {@code collate_match}
	 */
	@Nullable
	public final Boolean collateMatch() {
		return this.collateMatch;
	}

	/**
	 * API name: {@code contexts}
	 */
	public final Map<String, List<Context>> contexts() {
		return this.contexts;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, JsonData> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code _id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code _index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code _score}
	 */
	@Nullable
	public final Double score() {
		return this.score;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public final TDocument source() {
		return this.source;
	}

	/**
	 * Required - API name: {@code text}
	 */
	public final String text() {
		return this.text;
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

		if (this.collateMatch != null) {
			generator.writeKey("collate_match");
			generator.write(this.collateMatch);

		}
		if (ApiTypeHelper.isDefined(this.contexts)) {
			generator.writeKey("contexts");
			generator.writeStartObject();
			for (Map.Entry<String, List<Context>> item0 : this.contexts.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (Context item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

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
		if (this.id != null) {
			generator.writeKey("_id");
			generator.write(this.id);

		}
		if (this.index != null) {
			generator.writeKey("_index");
			generator.write(this.index);

		}
		if (this.routing != null) {
			generator.writeKey("_routing");
			generator.write(this.routing);

		}
		if (this.score != null) {
			generator.writeKey("_score");
			generator.write(this.score);

		}
		if (this.source != null) {
			generator.writeKey("_source");
			JsonpUtils.serialize(this.source, generator, tDocumentSerializer, mapper);

		}
		generator.writeKey("text");
		generator.write(this.text);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionSuggestOption}.
	 */

	public static class Builder<TDocument> extends WithJsonObjectBuilderBase<Builder<TDocument>>
			implements
				ObjectBuilder<CompletionSuggestOption<TDocument>> {
		@Nullable
		private Boolean collateMatch;

		@Nullable
		private Map<String, List<Context>> contexts;

		@Nullable
		private Map<String, JsonData> fields;

		@Nullable
		private String id;

		@Nullable
		private String index;

		@Nullable
		private String routing;

		@Nullable
		private Double score;

		@Nullable
		private TDocument source;

		private String text;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code collate_match}
		 */
		public final Builder<TDocument> collateMatch(@Nullable Boolean value) {
			this.collateMatch = value;
			return this;
		}

		/**
		 * API name: {@code contexts}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>contexts</code>.
		 */
		public final Builder<TDocument> contexts(Map<String, List<Context>> map) {
			this.contexts = _mapPutAll(this.contexts, map);
			return this;
		}

		/**
		 * API name: {@code contexts}
		 * <p>
		 * Adds an entry to <code>contexts</code>.
		 */
		public final Builder<TDocument> contexts(String key, List<Context> value) {
			this.contexts = _mapPut(this.contexts, key, value);
			return this;
		}

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
		 * API name: {@code _id}
		 */
		public final Builder<TDocument> id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public final Builder<TDocument> index(@Nullable String value) {
			this.index = value;
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
		 * API name: {@code _score}
		 */
		public final Builder<TDocument> score(@Nullable Double value) {
			this.score = value;
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
		 * Required - API name: {@code text}
		 */
		public final Builder<TDocument> text(String value) {
			this.text = value;
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
		 * Builds a {@link CompletionSuggestOption}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionSuggestOption<TDocument> build() {
			_checkSingleUse();

			return new CompletionSuggestOption<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for CompletionSuggestOption
	 */
	public static <TDocument> JsonpDeserializer<CompletionSuggestOption<TDocument>> createCompletionSuggestOptionDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> CompletionSuggestOption.setupCompletionSuggestOptionDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link CompletionSuggestOption} based on named
	 * deserializers provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<CompletionSuggestOption<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createCompletionSuggestOptionDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.search._types.TDocument")));

	protected static <TDocument> void setupCompletionSuggestOptionDeserializer(
			ObjectDeserializer<CompletionSuggestOption.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::collateMatch, JsonpDeserializer.booleanDeserializer(), "collate_match");
		op.add(Builder::contexts,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(Context._DESERIALIZER)),
				"contexts");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::score, JsonpDeserializer.doubleDeserializer(), "_score", "score");
		op.add(Builder::source, tDocumentDeserializer, "_source");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

	}

}
