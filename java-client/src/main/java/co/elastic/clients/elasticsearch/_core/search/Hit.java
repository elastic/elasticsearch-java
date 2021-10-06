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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.elasticsearch._core.explain.Explanation;
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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.search._types.Hit

public final class Hit<TDocument> implements JsonpSerializable {
	private final String index;

	private final String id;

	@Nullable
	private final Double score;

	@Nullable
	private final String type;

	@Nullable
	private final Explanation explanation;

	@Nullable
	private final Map<String, JsonData> fields;

	@Nullable
	private final Map<String, List<String>> highlight;

	@Nullable
	private final Map<String, InnerHitsResult> innerHits;

	@Nullable
	private final List<String> matchedQueries;

	@Nullable
	private final NestedIdentity nested;

	@Nullable
	private final List<String> ignored;

	@Nullable
	private final String shard;

	@Nullable
	private final String node;

	@Nullable
	private final String routing;

	@Nullable
	private final TDocument source;

	@Nullable
	private final Integer seqNo;

	@Nullable
	private final Long primaryTerm;

	@Nullable
	private final Long version;

	@Nullable
	private final List<String> sort;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public Hit(Builder<TDocument> builder) {

		this.index = Objects.requireNonNull(builder.index, "_index");
		this.id = Objects.requireNonNull(builder.id, "_id");
		this.score = builder.score;
		this.type = builder.type;
		this.explanation = builder.explanation;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.highlight = ModelTypeHelper.unmodifiable(builder.highlight);
		this.innerHits = ModelTypeHelper.unmodifiable(builder.innerHits);
		this.matchedQueries = ModelTypeHelper.unmodifiable(builder.matchedQueries);
		this.nested = builder.nested;
		this.ignored = ModelTypeHelper.unmodifiable(builder.ignored);
		this.shard = builder.shard;
		this.node = builder.node;
		this.routing = builder.routing;
		this.source = builder.source;
		this.seqNo = builder.seqNo;
		this.primaryTerm = builder.primaryTerm;
		this.version = builder.version;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public Hit(Function<Builder<TDocument>, Builder<TDocument>> fn) {
		this(fn.apply(new Builder<>()));
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code _score}
	 */
	@Nullable
	public Double score() {
		return this.score;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code _explanation}
	 */
	@Nullable
	public Explanation explanation() {
		return this.explanation;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, JsonData> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public Map<String, List<String>> highlight() {
		return this.highlight;
	}

	/**
	 * API name: {@code inner_hits}
	 */
	@Nullable
	public Map<String, InnerHitsResult> innerHits() {
		return this.innerHits;
	}

	/**
	 * API name: {@code matched_queries}
	 */
	@Nullable
	public List<String> matchedQueries() {
		return this.matchedQueries;
	}

	/**
	 * API name: {@code _nested}
	 */
	@Nullable
	public NestedIdentity nested() {
		return this.nested;
	}

	/**
	 * API name: {@code _ignored}
	 */
	@Nullable
	public List<String> ignored() {
		return this.ignored;
	}

	/**
	 * API name: {@code _shard}
	 */
	@Nullable
	public String shard() {
		return this.shard;
	}

	/**
	 * API name: {@code _node}
	 */
	@Nullable
	public String node() {
		return this.node;
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
	@Nullable
	public TDocument source() {
		return this.source;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public Integer seqNo() {
		return this.seqNo;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	@Nullable
	public Long primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * API name: {@code _version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<String> sort() {
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
			generator.write(this.score);

		}
		if (this.type != null) {

			generator.writeKey("_type");
			generator.write(this.type);

		}
		if (this.explanation != null) {

			generator.writeKey("_explanation");
			this.explanation.serialize(generator, mapper);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.highlight != null) {

			generator.writeKey("highlight");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.highlight.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				for (String item1 : item0.getValue()) {
					generator.write(item1);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.innerHits != null) {

			generator.writeKey("inner_hits");
			generator.writeStartObject();
			for (Map.Entry<String, InnerHitsResult> item0 : this.innerHits.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.matchedQueries != null) {

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
		if (this.ignored != null) {

			generator.writeKey("_ignored");
			generator.writeStartArray();
			for (String item0 : this.ignored) {
				generator.write(item0);

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
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (String item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Hit}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<Hit<TDocument>> {
		private String index;

		private String id;

		@Nullable
		private Double score;

		@Nullable
		private String type;

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
		private String shard;

		@Nullable
		private String node;

		@Nullable
		private String routing;

		@Nullable
		private TDocument source;

		@Nullable
		private Integer seqNo;

		@Nullable
		private Long primaryTerm;

		@Nullable
		private Long version;

		@Nullable
		private List<String> sort;

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
		 * Required - API name: {@code _id}
		 */
		public Builder<TDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _score}
		 */
		public Builder<TDocument> score(@Nullable Double value) {
			this.score = value;
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
		 * API name: {@code _explanation}
		 */
		public Builder<TDocument> explanation(@Nullable Explanation value) {
			this.explanation = value;
			return this;
		}

		/**
		 * API name: {@code _explanation}
		 */
		public Builder<TDocument> explanation(Function<Explanation.Builder, ObjectBuilder<Explanation>> fn) {
			return this.explanation(fn.apply(new Explanation.Builder()).build());
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
		 * API name: {@code highlight}
		 */
		public Builder<TDocument> highlight(@Nullable Map<String, List<String>> value) {
			this.highlight = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #highlight(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putHighlight(String key, List<String> value) {
			if (this.highlight == null) {
				this.highlight = new HashMap<>();
			}
			this.highlight.put(key, value);
			return this;
		}

		/**
		 * API name: {@code inner_hits}
		 */
		public Builder<TDocument> innerHits(@Nullable Map<String, InnerHitsResult> value) {
			this.innerHits = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #innerHits(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putInnerHits(String key, InnerHitsResult value) {
			if (this.innerHits == null) {
				this.innerHits = new HashMap<>();
			}
			this.innerHits.put(key, value);
			return this;
		}

		/**
		 * Set {@link #innerHits(Map)} to a singleton map.
		 */
		public Builder<TDocument> innerHits(String key,
				Function<InnerHitsResult.Builder, ObjectBuilder<InnerHitsResult>> fn) {
			return this.innerHits(Collections.singletonMap(key, fn.apply(new InnerHitsResult.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #innerHits(Map)}, creating the map if needed.
		 */
		public Builder<TDocument> putInnerHits(String key,
				Function<InnerHitsResult.Builder, ObjectBuilder<InnerHitsResult>> fn) {
			return this.putInnerHits(key, fn.apply(new InnerHitsResult.Builder()).build());
		}

		/**
		 * API name: {@code matched_queries}
		 */
		public Builder<TDocument> matchedQueries(@Nullable List<String> value) {
			this.matchedQueries = value;
			return this;
		}

		/**
		 * API name: {@code matched_queries}
		 */
		public Builder<TDocument> matchedQueries(String... value) {
			this.matchedQueries = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #matchedQueries(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addMatchedQueries(String value) {
			if (this.matchedQueries == null) {
				this.matchedQueries = new ArrayList<>();
			}
			this.matchedQueries.add(value);
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public Builder<TDocument> nested(@Nullable NestedIdentity value) {
			this.nested = value;
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public Builder<TDocument> nested(Function<NestedIdentity.Builder, ObjectBuilder<NestedIdentity>> fn) {
			return this.nested(fn.apply(new NestedIdentity.Builder()).build());
		}

		/**
		 * API name: {@code _ignored}
		 */
		public Builder<TDocument> ignored(@Nullable List<String> value) {
			this.ignored = value;
			return this;
		}

		/**
		 * API name: {@code _ignored}
		 */
		public Builder<TDocument> ignored(String... value) {
			this.ignored = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ignored(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addIgnored(String value) {
			if (this.ignored == null) {
				this.ignored = new ArrayList<>();
			}
			this.ignored.add(value);
			return this;
		}

		/**
		 * API name: {@code _shard}
		 */
		public Builder<TDocument> shard(@Nullable String value) {
			this.shard = value;
			return this;
		}

		/**
		 * API name: {@code _node}
		 */
		public Builder<TDocument> node(@Nullable String value) {
			this.node = value;
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
		public Builder<TDocument> source(@Nullable TDocument value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder<TDocument> seqNo(@Nullable Integer value) {
			this.seqNo = value;
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
		 * API name: {@code _version}
		 */
		public Builder<TDocument> version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder<TDocument> sort(@Nullable List<String> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder<TDocument> sort(String... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addSort(String value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
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

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::score, JsonpDeserializer.doubleDeserializer(), "_score");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
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
		op.add(Builder::shard, JsonpDeserializer.stringDeserializer(), "_shard");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "_node");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::source, tDocumentDeserializer, "_source");
		op.add(Builder::seqNo, JsonpDeserializer.integerDeserializer(), "_seq_no");
		op.add(Builder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "sort");

	}

}
