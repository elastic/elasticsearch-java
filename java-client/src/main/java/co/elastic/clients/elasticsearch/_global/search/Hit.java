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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.elasticsearch._global.explain.Explanation;
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
import java.lang.Number;
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
public final class Hit<TDocument> implements ToJsonp {
	private final String _index;

	private final String _id;

	@Nullable
	private final Number _score;

	@Nullable
	private final String _type;

	@Nullable
	private final Explanation _explanation;

	@Nullable
	private final Map<String, JsonValue> fields;

	@Nullable
	private final Map<String, List<String>> highlight;

	@Nullable
	private final Map<String, InnerHitsResult> innerHits;

	@Nullable
	private final List<String> matchedQueries;

	@Nullable
	private final NestedIdentity _nested;

	@Nullable
	private final List<String> _ignored;

	@Nullable
	private final String _shard;

	@Nullable
	private final String _node;

	@Nullable
	private final String _routing;

	@Nullable
	private final TDocument _source;

	@Nullable
	private final Number _seqNo;

	@Nullable
	private final Number _primaryTerm;

	@Nullable
	private final Number _version;

	@Nullable
	private final List<JsonValue> sort;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected Hit(Builder<TDocument> builder) {

		this._index = Objects.requireNonNull(builder._index, "_index");
		this._id = Objects.requireNonNull(builder._id, "_id");
		this._score = builder._score;
		this._type = builder._type;
		this._explanation = builder._explanation;
		this.fields = builder.fields;
		this.highlight = builder.highlight;
		this.innerHits = builder.innerHits;
		this.matchedQueries = builder.matchedQueries;
		this._nested = builder._nested;
		this._ignored = builder._ignored;
		this._shard = builder._shard;
		this._node = builder._node;
		this._routing = builder._routing;
		this._source = builder._source;
		this._seqNo = builder._seqNo;
		this._primaryTerm = builder._primaryTerm;
		this._version = builder._version;
		this.sort = builder.sort;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code _index}
	 */
	public String _index() {
		return this._index;
	}

	/**
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code _score}
	 */
	@Nullable
	public Number _score() {
		return this._score;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String _type() {
		return this._type;
	}

	/**
	 * API name: {@code _explanation}
	 */
	@Nullable
	public Explanation _explanation() {
		return this._explanation;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public Map<String, JsonValue> fields() {
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
	public NestedIdentity _nested() {
		return this._nested;
	}

	/**
	 * API name: {@code _ignored}
	 */
	@Nullable
	public List<String> _ignored() {
		return this._ignored;
	}

	/**
	 * API name: {@code _shard}
	 */
	@Nullable
	public String _shard() {
		return this._shard;
	}

	/**
	 * API name: {@code _node}
	 */
	@Nullable
	public String _node() {
		return this._node;
	}

	/**
	 * API name: {@code _routing}
	 */
	@Nullable
	public String _routing() {
		return this._routing;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public TDocument _source() {
		return this._source;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public Number _seqNo() {
		return this._seqNo;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	@Nullable
	public Number _primaryTerm() {
		return this._primaryTerm;
	}

	/**
	 * API name: {@code _version}
	 */
	@Nullable
	public Number _version() {
		return this._version;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<JsonValue> sort() {
		return this.sort;
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

		generator.writeKey("_index");
		generator.write(this._index);

		generator.writeKey("_id");
		generator.write(this._id);

		if (this._score != null) {

			generator.writeKey("_score");
			generator.write(this._score.doubleValue());

		}
		if (this._type != null) {

			generator.writeKey("_type");
			generator.write(this._type);

		}
		if (this._explanation != null) {

			generator.writeKey("_explanation");
			this._explanation.toJsonp(generator, mapper);

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
				item0.getValue().toJsonp(generator, mapper);

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
		if (this._nested != null) {

			generator.writeKey("_nested");
			this._nested.toJsonp(generator, mapper);

		}
		if (this._ignored != null) {

			generator.writeKey("_ignored");
			generator.writeStartArray();
			for (String item0 : this._ignored) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this._shard != null) {

			generator.writeKey("_shard");
			generator.write(this._shard);

		}
		if (this._node != null) {

			generator.writeKey("_node");
			generator.write(this._node);

		}
		if (this._routing != null) {

			generator.writeKey("_routing");
			generator.write(this._routing);

		}
		if (this._source != null) {

			generator.writeKey("_source");
			JsonpUtils.serialize(this._source, generator, tDocumentSerializer, mapper);

		}
		if (this._seqNo != null) {

			generator.writeKey("_seq_no");
			generator.write(this._seqNo.doubleValue());

		}
		if (this._primaryTerm != null) {

			generator.writeKey("_primary_term");
			generator.write(this._primaryTerm.doubleValue());

		}
		if (this._version != null) {

			generator.writeKey("_version");
			generator.write(this._version.doubleValue());

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue item0 : this.sort) {
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
		private String _index;

		private String _id;

		@Nullable
		private Number _score;

		@Nullable
		private String _type;

		@Nullable
		private Explanation _explanation;

		@Nullable
		private Map<String, JsonValue> fields;

		@Nullable
		private Map<String, List<String>> highlight;

		@Nullable
		private Map<String, InnerHitsResult> innerHits;

		@Nullable
		private List<String> matchedQueries;

		@Nullable
		private NestedIdentity _nested;

		@Nullable
		private List<String> _ignored;

		@Nullable
		private String _shard;

		@Nullable
		private String _node;

		@Nullable
		private String _routing;

		@Nullable
		private TDocument _source;

		@Nullable
		private Number _seqNo;

		@Nullable
		private Number _primaryTerm;

		@Nullable
		private Number _version;

		@Nullable
		private List<JsonValue> sort;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code _index}
		 */
		public Builder<TDocument> _index(String value) {
			this._index = value;
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
		 * API name: {@code _score}
		 */
		public Builder<TDocument> _score(@Nullable Number value) {
			this._score = value;
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
		 * API name: {@code _explanation}
		 */
		public Builder<TDocument> _explanation(@Nullable Explanation value) {
			this._explanation = value;
			return this;
		}

		/**
		 * API name: {@code _explanation}
		 */
		public Builder<TDocument> _explanation(Function<Explanation.Builder, ObjectBuilder<Explanation>> fn) {
			return this._explanation(fn.apply(new Explanation.Builder()).build());
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
		public Builder<TDocument> _nested(@Nullable NestedIdentity value) {
			this._nested = value;
			return this;
		}

		/**
		 * API name: {@code _nested}
		 */
		public Builder<TDocument> _nested(Function<NestedIdentity.Builder, ObjectBuilder<NestedIdentity>> fn) {
			return this._nested(fn.apply(new NestedIdentity.Builder()).build());
		}

		/**
		 * API name: {@code _ignored}
		 */
		public Builder<TDocument> _ignored(@Nullable List<String> value) {
			this._ignored = value;
			return this;
		}

		/**
		 * API name: {@code _ignored}
		 */
		public Builder<TDocument> _ignored(String... value) {
			this._ignored = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #_ignored(List)}, creating the list if needed.
		 */
		public Builder<TDocument> add_ignored(String value) {
			if (this._ignored == null) {
				this._ignored = new ArrayList<>();
			}
			this._ignored.add(value);
			return this;
		}

		/**
		 * API name: {@code _shard}
		 */
		public Builder<TDocument> _shard(@Nullable String value) {
			this._shard = value;
			return this;
		}

		/**
		 * API name: {@code _node}
		 */
		public Builder<TDocument> _node(@Nullable String value) {
			this._node = value;
			return this;
		}

		/**
		 * API name: {@code _routing}
		 */
		public Builder<TDocument> _routing(@Nullable String value) {
			this._routing = value;
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
		 * API name: {@code _seq_no}
		 */
		public Builder<TDocument> _seqNo(@Nullable Number value) {
			this._seqNo = value;
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
		 * API name: {@code _version}
		 */
		public Builder<TDocument> _version(@Nullable Number value) {
			this._version = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder<TDocument> sort(@Nullable List<JsonValue> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder<TDocument> sort(JsonValue... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder<TDocument> addSort(JsonValue value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
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

		op.add(Builder::_index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::_score, JsonpDeserializer.numberDeserializer(), "_score");
		op.add(Builder::_type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::_explanation, Explanation.DESERIALIZER, "_explanation");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"fields");
		op.add(Builder::highlight, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "highlight");
		op.add(Builder::innerHits, JsonpDeserializer.stringMapDeserializer(InnerHitsResult.DESERIALIZER), "inner_hits");
		op.add(Builder::matchedQueries, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"matched_queries");
		op.add(Builder::_nested, NestedIdentity.DESERIALIZER, "_nested");
		op.add(Builder::_ignored, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"_ignored");
		op.add(Builder::_shard, JsonpDeserializer.stringDeserializer(), "_shard");
		op.add(Builder::_node, JsonpDeserializer.stringDeserializer(), "_node");
		op.add(Builder::_routing, JsonpDeserializer.stringDeserializer(), "_routing");
		op.add(Builder::_source, tDocumentDeserializer, "_source");
		op.add(Builder::_seqNo, JsonpDeserializer.numberDeserializer(), "_seq_no");
		op.add(Builder::_primaryTerm, JsonpDeserializer.numberDeserializer(), "_primary_term");
		op.add(Builder::_version, JsonpDeserializer.numberDeserializer(), "_version");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");

	}

}
