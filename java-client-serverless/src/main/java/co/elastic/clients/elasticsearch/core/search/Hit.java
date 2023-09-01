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

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch.core.explain.Explanation;
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
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.search._types.Hit

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.search._types.Hit">API
 *      specification</a>
 */
@JsonpDeserializable
public class Hit<TDocument> implements JsonpSerializable {
	private final String index;

	private final String id;

	@Nullable
	private final Double score;

	@Nullable
	private final Explanation explanation;

	private final Map<String, JsonData> fields;

	private final Map<String, List<String>> highlight;

	private final Map<String, InnerHitsResult> innerHits;

	private final List<String> matchedQueries;

	@Nullable
	private final NestedIdentity nested;

	private final List<String> ignored;

	private final Map<String, List<String>> ignoredFieldValues;

	@Nullable
	private final String shard;

	@Nullable
	private final String node;

	@Nullable
	private final String routing;

	@Nullable
	private final TDocument source;

	@Nullable
	private final Long seqNo;

	@Nullable
	private final Long primaryTerm;

	@Nullable
	private final Long version;

	private final List<FieldValue> sort;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private Hit(Builder<TDocument> builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.score = builder.score;
		this.explanation = builder.explanation;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.highlight = ApiTypeHelper.unmodifiable(builder.highlight);
		this.innerHits = ApiTypeHelper.unmodifiable(builder.innerHits);
		this.matchedQueries = ApiTypeHelper.unmodifiable(builder.matchedQueries);
		this.nested = builder.nested;
		this.ignored = ApiTypeHelper.unmodifiable(builder.ignored);
		this.ignoredFieldValues = ApiTypeHelper.unmodifiable(builder.ignoredFieldValues);
		this.shard = builder.shard;
		this.node = builder.node;
		this.routing = builder.routing;
		this.source = builder.source;
		this.seqNo = builder.seqNo;
		this.primaryTerm = builder.primaryTerm;
		this.version = builder.version;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> Hit<TDocument> of(Function<Builder<TDocument>, ObjectBuilder<Hit<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code _score}
	 * <p>
	 * Defaults to {@code Double.NaN} if parsed from a JSON {@code null} value.
	 */
	@Nullable
	public final Double score() {
		return this.score;
	}

	/**
	 * API name: {@code _explanation}
	 */
	@Nullable
	public final Explanation explanation() {
		return this.explanation;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, JsonData> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code highlight}
	 */
	public final Map<String, List<String>> highlight() {
		return this.highlight;
	}

	/**
	 * API name: {@code inner_hits}
	 */
	public final Map<String, InnerHitsResult> innerHits() {
		return this.innerHits;
	}

	/**
	 * API name: {@code matched_queries}
	 */
	public final List<String> matchedQueries() {
		return this.matchedQueries;
	}

	/**
	 * API name: {@code _nested}
	 */
	@Nullable
	public final NestedIdentity nested() {
		return this.nested;
	}

	/**
	 * API name: {@code _ignored}
	 */
	public final List<String> ignored() {
		return this.ignored;
	}

	/**
	 * API name: {@code ignored_field_values}
	 */
	public final Map<String, List<String>> ignoredFieldValues() {
		return this.ignoredFieldValues;
	}

	/**
	 * API name: {@code _shard}
	 */
	@Nullable
	public final String shard() {
		return this.shard;
	}

	/**
	 * API name: {@code _node}
	 */
	@Nullable
	public final String node() {
		return this.node;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public final TDocument source() {
		return this.source;
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
	 * API name: {@code _version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * API name: {@code sort}
	 */
	public final List<FieldValue> sort() {
		return this.sort;
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

		generator.writeKey("_id");
		generator.write(this.id);

		if (this.score != null) {
			generator.writeKey("_score");
			JsonpUtils.serializeDoubleOrNull(generator, this.score, Double.NaN);
		}
		if (this.explanation != null) {
			generator.writeKey("_explanation");
			this.explanation.serialize(generator, mapper);

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
		if (ApiTypeHelper.isDefined(this.highlight)) {
			generator.writeKey("highlight");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.highlight.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.innerHits)) {
			generator.writeKey("inner_hits");
			generator.writeStartObject();
			for (Map.Entry<String, InnerHitsResult> item0 : this.innerHits.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.matchedQueries)) {
			generator.writeKey("matched_queries");
			generator.writeStartArray();
			for (String item0 : this.matchedQueries) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.nested != null) {
			generator.writeKey("_nested");
			this.nested.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.ignored)) {
			generator.writeKey("_ignored");
			generator.writeStartArray();
			for (String item0 : this.ignored) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.ignoredFieldValues)) {
			generator.writeKey("ignored_field_values");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.ignoredFieldValues.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.shard != null) {
			generator.writeKey("_shard");
			generator.write(this.shard);

		}
		if (this.node != null) {
			generator.writeKey("_node");
			generator.write(this.node);

		}
		if (this.routing != null) {
			generator.writeKey("_routing");
			generator.write(this.routing);

		}
		if (this.source != null) {
			generator.writeKey("_source");
			JsonpUtils.serialize(this.source, generator, tDocumentSerializer, mapper);

		}
		if (this.seqNo != null) {
			generator.writeKey("_seq_no");
			generator.write(this.seqNo);

		}
		if (this.primaryTerm != null) {
			generator.writeKey("_primary_term");
			generator.write(this.primaryTerm);

		}
		if (this.version != null) {
			generator.writeKey("_version");
			generator.write(this.version);

		}
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (FieldValue item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Hit}.
	 */

	public static class Builder<TDocument> extends WithJsonObjectBuilderBase<Builder<TDocument>>
			implements
				ObjectBuilder<Hit<TDocument>> {
		private String index;

		private String id;

		@Nullable
		private Double score;

		@Nullable
		private Explanation explanation;

		@Nullable
		private Map<String, JsonData> fields;

		@Nullable
		private Map<String, List<String>> highlight;

		@Nullable
		private Map<String, InnerHitsResult> innerHits;

		@Nullable
		private List<String> matchedQueries;

		@Nullable
		private NestedIdentity nested;

		@Nullable
		private List<String> ignored;

		@Nullable
		private Map<String, List<String>> ignoredFieldValues;

		@Nullable
		private String shard;

		@Nullable
		private String node;

		@Nullable
		private String routing;

		@Nullable
		private TDocument source;

		@Nullable
		private Long seqNo;

		@Nullable
		private Long primaryTerm;

		@Nullable
		private Long version;

		@Nullable
		private List<FieldValue> sort;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code _index}
		 */
		public final Builder<TDocument> index(String value) {
			this.index = value;
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
		 * API name: {@code _score}
		 * <p>
		 * Defaults to {@code Double.NaN} if parsed from a JSON {@code null} value.
		 */
		public final Builder<TDocument> score(@Nullable Double value) {
			this.score = value;
			return this;
		}

		/**
		 * API name: {@code _explanation}
		 */
		public final Builder<TDocument> explanation(@Nullable Explanation value) {
			this.explanation = value;
			return this;
		}

		/**
		 * API name: {@code _explanation}
		 */
		public final Builder<TDocument> explanation(Function<Explanation.Builder, ObjectBuilder<Explanation>> fn) {
			return this.explanation(fn.apply(new Explanation.Builder()).build());
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
		 * API name: {@code highlight}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>highlight</code>.
		 */
		public final Builder<TDocument> highlight(Map<String, List<String>> map) {
			this.highlight = _mapPutAll(this.highlight, map);
			return this;
		}

		/**
		 * API name: {@code highlight}
		 * <p>
		 * Adds an entry to <code>highlight</code>.
		 */
		public final Builder<TDocument> highlight(String key, List<String> value) {
			this.highlight = _mapPut(this.highlight, key, value);
			return this;
		}

		/**
		 * API name: {@code inner_hits}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>innerHits</code>.
		 */
		public final Builder<TDocument> innerHits(Map<String, InnerHitsResult> map) {
			this.innerHits = _mapPutAll(this.innerHits, map);
			return this;
		}

		/**
		 * API name: {@code inner_hits}
		 * <p>
		 * Adds an entry to <code>innerHits</code>.
		 */
		public final Builder<TDocument> innerHits(String key, InnerHitsResult value) {
			this.innerHits = _mapPut(this.innerHits, key, value);
			return this;
		}

		/**
		 * API name: {@code inner_hits}
		 * <p>
		 * Adds an entry to <code>innerHits</code> using a builder lambda.
		 */
		public final Builder<TDocument> innerHits(String key,
				Function<InnerHitsResult.Builder, ObjectBuilder<InnerHitsResult>> fn) {
			return innerHits(key, fn.apply(new InnerHitsResult.Builder()).build());
		}

		/**
		 * API name: {@code matched_queries}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>matchedQueries</code>.
		 */
		public final Builder<TDocument> matchedQueries(List<String> list) {
			this.matchedQueries = _listAddAll(this.matchedQueries, list);
			return this;
		}

		/**
		 * API name: {@code matched_queries}
		 * <p>
		 * Adds one or more values to <code>matchedQueries</code>.
		 */
		public final Builder<TDocument> matchedQueries(String value, String... values) {
			this.matchedQueries = _listAdd(this.matchedQueries, value, values);
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public final Builder<TDocument> nested(@Nullable NestedIdentity value) {
			this.nested = value;
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public final Builder<TDocument> nested(Function<NestedIdentity.Builder, ObjectBuilder<NestedIdentity>> fn) {
			return this.nested(fn.apply(new NestedIdentity.Builder()).build());
		}

		/**
		 * API name: {@code _ignored}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ignored</code>.
		 */
		public final Builder<TDocument> ignored(List<String> list) {
			this.ignored = _listAddAll(this.ignored, list);
			return this;
		}

		/**
		 * API name: {@code _ignored}
		 * <p>
		 * Adds one or more values to <code>ignored</code>.
		 */
		public final Builder<TDocument> ignored(String value, String... values) {
			this.ignored = _listAdd(this.ignored, value, values);
			return this;
		}

		/**
		 * API name: {@code ignored_field_values}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>ignoredFieldValues</code>.
		 */
		public final Builder<TDocument> ignoredFieldValues(Map<String, List<String>> map) {
			this.ignoredFieldValues = _mapPutAll(this.ignoredFieldValues, map);
			return this;
		}

		/**
		 * API name: {@code ignored_field_values}
		 * <p>
		 * Adds an entry to <code>ignoredFieldValues</code>.
		 */
		public final Builder<TDocument> ignoredFieldValues(String key, List<String> value) {
			this.ignoredFieldValues = _mapPut(this.ignoredFieldValues, key, value);
			return this;
		}

		/**
		 * API name: {@code _shard}
		 */
		public final Builder<TDocument> shard(@Nullable String value) {
			this.shard = value;
			return this;
		}

		/**
		 * API name: {@code _node}
		 */
		public final Builder<TDocument> node(@Nullable String value) {
			this.node = value;
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
		 * API name: {@code _source}
		 */
		public final Builder<TDocument> source(@Nullable TDocument value) {
			this.source = value;
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
		 * API name: {@code _version}
		 */
		public final Builder<TDocument> version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder<TDocument> sort(List<FieldValue> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder<TDocument> sort(FieldValue value, FieldValue... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder<TDocument> sort(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return sort(fn.apply(new FieldValue.Builder()).build());
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
	 * Create a JSON deserializer for Hit
	 */
	public static <TDocument> JsonpDeserializer<Hit<TDocument>> createHitDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> Hit.setupHitDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link Hit} based on named deserializers provided by
	 * the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<Hit<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createHitDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.search._types.TDocument")));

	protected static <TDocument> void setupHitDeserializer(ObjectDeserializer<Hit.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::score, JsonpDeserializer.doubleOrNullDeserializer(Double.NaN), "_score");
		op.add(Builder::explanation, Explanation._DESERIALIZER, "_explanation");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(Builder::highlight, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "highlight");
		op.add(Builder::innerHits, JsonpDeserializer.stringMapDeserializer(InnerHitsResult._DESERIALIZER),
				"inner_hits");
		op.add(Builder::matchedQueries, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"matched_queries");
		op.add(Builder::nested, NestedIdentity._DESERIALIZER, "_nested");
		op.add(Builder::ignored, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"_ignored");
		op.add(Builder::ignoredFieldValues,
				JsonpDeserializer.stringMapDeserializer(
						JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())),
				"ignored_field_values");
		op.add(Builder::shard, JsonpDeserializer.stringDeserializer(), "_shard");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "_node");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::source, tDocumentDeserializer, "_source");
		op.add(Builder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");
		op.add(Builder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "sort");

	}

}
