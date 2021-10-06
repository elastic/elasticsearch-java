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

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.Highlight
@JsonpDeserializable
public final class Highlight implements JsonpSerializable {
	private final Map<String, HighlightField> fields;

	@Nullable
	private final HighlighterType type;

	@Nullable
	private final String boundaryChars;

	@Nullable
	private final Integer boundaryMaxScan;

	@Nullable
	private final BoundaryScanner boundaryScanner;

	@Nullable
	private final String boundaryScannerLocale;

	@Nullable
	private final HighlighterEncoder encoder;

	@Nullable
	private final HighlighterFragmenter fragmenter;

	@Nullable
	private final Integer fragmentOffset;

	@Nullable
	private final Integer fragmentSize;

	@Nullable
	private final Integer maxFragmentLength;

	@Nullable
	private final Integer noMatchSize;

	@Nullable
	private final Integer numberOfFragments;

	@Nullable
	private final HighlighterOrder order;

	@Nullable
	private final List<String> postTags;

	@Nullable
	private final List<String> preTags;

	@Nullable
	private final Boolean requireFieldMatch;

	@Nullable
	private final HighlighterTagsSchema tagsSchema;

	@Nullable
	private final Query highlightQuery;

	@Nullable
	private final String maxAnalyzedOffset;

	// ---------------------------------------------------------------------------------------------

	public Highlight(Builder builder) {

		this.fields = ModelTypeHelper.unmodifiableNonNull(builder.fields, "fields");
		this.type = builder.type;
		this.boundaryChars = builder.boundaryChars;
		this.boundaryMaxScan = builder.boundaryMaxScan;
		this.boundaryScanner = builder.boundaryScanner;
		this.boundaryScannerLocale = builder.boundaryScannerLocale;
		this.encoder = builder.encoder;
		this.fragmenter = builder.fragmenter;
		this.fragmentOffset = builder.fragmentOffset;
		this.fragmentSize = builder.fragmentSize;
		this.maxFragmentLength = builder.maxFragmentLength;
		this.noMatchSize = builder.noMatchSize;
		this.numberOfFragments = builder.numberOfFragments;
		this.order = builder.order;
		this.postTags = ModelTypeHelper.unmodifiable(builder.postTags);
		this.preTags = ModelTypeHelper.unmodifiable(builder.preTags);
		this.requireFieldMatch = builder.requireFieldMatch;
		this.tagsSchema = builder.tagsSchema;
		this.highlightQuery = builder.highlightQuery;
		this.maxAnalyzedOffset = builder.maxAnalyzedOffset;

	}

	public Highlight(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public Map<String, HighlightField> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public HighlighterType type() {
		return this.type;
	}

	/**
	 * API name: {@code boundary_chars}
	 */
	@Nullable
	public String boundaryChars() {
		return this.boundaryChars;
	}

	/**
	 * API name: {@code boundary_max_scan}
	 */
	@Nullable
	public Integer boundaryMaxScan() {
		return this.boundaryMaxScan;
	}

	/**
	 * API name: {@code boundary_scanner}
	 */
	@Nullable
	public BoundaryScanner boundaryScanner() {
		return this.boundaryScanner;
	}

	/**
	 * API name: {@code boundary_scanner_locale}
	 */
	@Nullable
	public String boundaryScannerLocale() {
		return this.boundaryScannerLocale;
	}

	/**
	 * API name: {@code encoder}
	 */
	@Nullable
	public HighlighterEncoder encoder() {
		return this.encoder;
	}

	/**
	 * API name: {@code fragmenter}
	 */
	@Nullable
	public HighlighterFragmenter fragmenter() {
		return this.fragmenter;
	}

	/**
	 * API name: {@code fragment_offset}
	 */
	@Nullable
	public Integer fragmentOffset() {
		return this.fragmentOffset;
	}

	/**
	 * API name: {@code fragment_size}
	 */
	@Nullable
	public Integer fragmentSize() {
		return this.fragmentSize;
	}

	/**
	 * API name: {@code max_fragment_length}
	 */
	@Nullable
	public Integer maxFragmentLength() {
		return this.maxFragmentLength;
	}

	/**
	 * API name: {@code no_match_size}
	 */
	@Nullable
	public Integer noMatchSize() {
		return this.noMatchSize;
	}

	/**
	 * API name: {@code number_of_fragments}
	 */
	@Nullable
	public Integer numberOfFragments() {
		return this.numberOfFragments;
	}

	/**
	 * API name: {@code order}
	 */
	@Nullable
	public HighlighterOrder order() {
		return this.order;
	}

	/**
	 * API name: {@code post_tags}
	 */
	@Nullable
	public List<String> postTags() {
		return this.postTags;
	}

	/**
	 * API name: {@code pre_tags}
	 */
	@Nullable
	public List<String> preTags() {
		return this.preTags;
	}

	/**
	 * API name: {@code require_field_match}
	 */
	@Nullable
	public Boolean requireFieldMatch() {
		return this.requireFieldMatch;
	}

	/**
	 * API name: {@code tags_schema}
	 */
	@Nullable
	public HighlighterTagsSchema tagsSchema() {
		return this.tagsSchema;
	}

	/**
	 * API name: {@code highlight_query}
	 */
	@Nullable
	public Query highlightQuery() {
		return this.highlightQuery;
	}

	/**
	 * API name: {@code max_analyzed_offset}
	 */
	@Nullable
	public String maxAnalyzedOffset() {
		return this.maxAnalyzedOffset;
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

		generator.writeKey("fields");
		generator.writeStartObject();
		for (Map.Entry<String, HighlightField> item0 : this.fields.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.type != null) {

			generator.writeKey("type");
			this.type.serialize(generator, mapper);
		}
		if (this.boundaryChars != null) {

			generator.writeKey("boundary_chars");
			generator.write(this.boundaryChars);

		}
		if (this.boundaryMaxScan != null) {

			generator.writeKey("boundary_max_scan");
			generator.write(this.boundaryMaxScan);

		}
		if (this.boundaryScanner != null) {

			generator.writeKey("boundary_scanner");
			this.boundaryScanner.serialize(generator, mapper);
		}
		if (this.boundaryScannerLocale != null) {

			generator.writeKey("boundary_scanner_locale");
			generator.write(this.boundaryScannerLocale);

		}
		if (this.encoder != null) {

			generator.writeKey("encoder");
			this.encoder.serialize(generator, mapper);
		}
		if (this.fragmenter != null) {

			generator.writeKey("fragmenter");
			this.fragmenter.serialize(generator, mapper);
		}
		if (this.fragmentOffset != null) {

			generator.writeKey("fragment_offset");
			generator.write(this.fragmentOffset);

		}
		if (this.fragmentSize != null) {

			generator.writeKey("fragment_size");
			generator.write(this.fragmentSize);

		}
		if (this.maxFragmentLength != null) {

			generator.writeKey("max_fragment_length");
			generator.write(this.maxFragmentLength);

		}
		if (this.noMatchSize != null) {

			generator.writeKey("no_match_size");
			generator.write(this.noMatchSize);

		}
		if (this.numberOfFragments != null) {

			generator.writeKey("number_of_fragments");
			generator.write(this.numberOfFragments);

		}
		if (this.order != null) {

			generator.writeKey("order");
			this.order.serialize(generator, mapper);
		}
		if (this.postTags != null) {

			generator.writeKey("post_tags");
			generator.writeStartArray();
			for (String item0 : this.postTags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.preTags != null) {

			generator.writeKey("pre_tags");
			generator.writeStartArray();
			for (String item0 : this.preTags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.requireFieldMatch != null) {

			generator.writeKey("require_field_match");
			generator.write(this.requireFieldMatch);

		}
		if (this.tagsSchema != null) {

			generator.writeKey("tags_schema");
			this.tagsSchema.serialize(generator, mapper);
		}
		if (this.highlightQuery != null) {

			generator.writeKey("highlight_query");
			this.highlightQuery.serialize(generator, mapper);

		}
		if (this.maxAnalyzedOffset != null) {

			generator.writeKey("max_analyzed_offset");
			generator.write(this.maxAnalyzedOffset);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Highlight}.
	 */
	public static class Builder implements ObjectBuilder<Highlight> {
		private Map<String, HighlightField> fields;

		@Nullable
		private HighlighterType type;

		@Nullable
		private String boundaryChars;

		@Nullable
		private Integer boundaryMaxScan;

		@Nullable
		private BoundaryScanner boundaryScanner;

		@Nullable
		private String boundaryScannerLocale;

		@Nullable
		private HighlighterEncoder encoder;

		@Nullable
		private HighlighterFragmenter fragmenter;

		@Nullable
		private Integer fragmentOffset;

		@Nullable
		private Integer fragmentSize;

		@Nullable
		private Integer maxFragmentLength;

		@Nullable
		private Integer noMatchSize;

		@Nullable
		private Integer numberOfFragments;

		@Nullable
		private HighlighterOrder order;

		@Nullable
		private List<String> postTags;

		@Nullable
		private List<String> preTags;

		@Nullable
		private Boolean requireFieldMatch;

		@Nullable
		private HighlighterTagsSchema tagsSchema;

		@Nullable
		private Query highlightQuery;

		@Nullable
		private String maxAnalyzedOffset;

		/**
		 * Required - API name: {@code fields}
		 */
		public Builder fields(Map<String, HighlightField> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder putFields(String key, HighlightField value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return this;
		}

		/**
		 * Set {@link #fields(Map)} to a singleton map.
		 */
		public Builder fields(String key, Function<HighlightField.Builder, ObjectBuilder<HighlightField>> fn) {
			return this.fields(Collections.singletonMap(key, fn.apply(new HighlightField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder putFields(String key, Function<HighlightField.Builder, ObjectBuilder<HighlightField>> fn) {
			return this.putFields(key, fn.apply(new HighlightField.Builder()).build());
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable HighlighterType value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code boundary_chars}
		 */
		public Builder boundaryChars(@Nullable String value) {
			this.boundaryChars = value;
			return this;
		}

		/**
		 * API name: {@code boundary_max_scan}
		 */
		public Builder boundaryMaxScan(@Nullable Integer value) {
			this.boundaryMaxScan = value;
			return this;
		}

		/**
		 * API name: {@code boundary_scanner}
		 */
		public Builder boundaryScanner(@Nullable BoundaryScanner value) {
			this.boundaryScanner = value;
			return this;
		}

		/**
		 * API name: {@code boundary_scanner_locale}
		 */
		public Builder boundaryScannerLocale(@Nullable String value) {
			this.boundaryScannerLocale = value;
			return this;
		}

		/**
		 * API name: {@code encoder}
		 */
		public Builder encoder(@Nullable HighlighterEncoder value) {
			this.encoder = value;
			return this;
		}

		/**
		 * API name: {@code fragmenter}
		 */
		public Builder fragmenter(@Nullable HighlighterFragmenter value) {
			this.fragmenter = value;
			return this;
		}

		/**
		 * API name: {@code fragment_offset}
		 */
		public Builder fragmentOffset(@Nullable Integer value) {
			this.fragmentOffset = value;
			return this;
		}

		/**
		 * API name: {@code fragment_size}
		 */
		public Builder fragmentSize(@Nullable Integer value) {
			this.fragmentSize = value;
			return this;
		}

		/**
		 * API name: {@code max_fragment_length}
		 */
		public Builder maxFragmentLength(@Nullable Integer value) {
			this.maxFragmentLength = value;
			return this;
		}

		/**
		 * API name: {@code no_match_size}
		 */
		public Builder noMatchSize(@Nullable Integer value) {
			this.noMatchSize = value;
			return this;
		}

		/**
		 * API name: {@code number_of_fragments}
		 */
		public Builder numberOfFragments(@Nullable Integer value) {
			this.numberOfFragments = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public Builder order(@Nullable HighlighterOrder value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code post_tags}
		 */
		public Builder postTags(@Nullable List<String> value) {
			this.postTags = value;
			return this;
		}

		/**
		 * API name: {@code post_tags}
		 */
		public Builder postTags(String... value) {
			this.postTags = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #postTags(List)}, creating the list if needed.
		 */
		public Builder addPostTags(String value) {
			if (this.postTags == null) {
				this.postTags = new ArrayList<>();
			}
			this.postTags.add(value);
			return this;
		}

		/**
		 * API name: {@code pre_tags}
		 */
		public Builder preTags(@Nullable List<String> value) {
			this.preTags = value;
			return this;
		}

		/**
		 * API name: {@code pre_tags}
		 */
		public Builder preTags(String... value) {
			this.preTags = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #preTags(List)}, creating the list if needed.
		 */
		public Builder addPreTags(String value) {
			if (this.preTags == null) {
				this.preTags = new ArrayList<>();
			}
			this.preTags.add(value);
			return this;
		}

		/**
		 * API name: {@code require_field_match}
		 */
		public Builder requireFieldMatch(@Nullable Boolean value) {
			this.requireFieldMatch = value;
			return this;
		}

		/**
		 * API name: {@code tags_schema}
		 */
		public Builder tagsSchema(@Nullable HighlighterTagsSchema value) {
			this.tagsSchema = value;
			return this;
		}

		/**
		 * API name: {@code highlight_query}
		 */
		public Builder highlightQuery(@Nullable Query value) {
			this.highlightQuery = value;
			return this;
		}

		/**
		 * API name: {@code highlight_query}
		 */
		public Builder highlightQuery(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.highlightQuery(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code max_analyzed_offset}
		 */
		public Builder maxAnalyzedOffset(@Nullable String value) {
			this.maxAnalyzedOffset = value;
			return this;
		}

		/**
		 * Builds a {@link Highlight}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Highlight build() {

			return new Highlight(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Highlight}
	 */
	public static final JsonpDeserializer<Highlight> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Highlight::setupHighlightDeserializer, Builder::build);

	protected static void setupHighlightDeserializer(DelegatingDeserializer<Highlight.Builder> op) {

		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(HighlightField._DESERIALIZER), "fields");
		op.add(Builder::type, HighlighterType._DESERIALIZER, "type");
		op.add(Builder::boundaryChars, JsonpDeserializer.stringDeserializer(), "boundary_chars");
		op.add(Builder::boundaryMaxScan, JsonpDeserializer.integerDeserializer(), "boundary_max_scan");
		op.add(Builder::boundaryScanner, BoundaryScanner._DESERIALIZER, "boundary_scanner");
		op.add(Builder::boundaryScannerLocale, JsonpDeserializer.stringDeserializer(), "boundary_scanner_locale");
		op.add(Builder::encoder, HighlighterEncoder._DESERIALIZER, "encoder");
		op.add(Builder::fragmenter, HighlighterFragmenter._DESERIALIZER, "fragmenter");
		op.add(Builder::fragmentOffset, JsonpDeserializer.integerDeserializer(), "fragment_offset");
		op.add(Builder::fragmentSize, JsonpDeserializer.integerDeserializer(), "fragment_size");
		op.add(Builder::maxFragmentLength, JsonpDeserializer.integerDeserializer(), "max_fragment_length");
		op.add(Builder::noMatchSize, JsonpDeserializer.integerDeserializer(), "no_match_size");
		op.add(Builder::numberOfFragments, JsonpDeserializer.integerDeserializer(), "number_of_fragments");
		op.add(Builder::order, HighlighterOrder._DESERIALIZER, "order");
		op.add(Builder::postTags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"post_tags");
		op.add(Builder::preTags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"pre_tags");
		op.add(Builder::requireFieldMatch, JsonpDeserializer.booleanDeserializer(), "require_field_match");
		op.add(Builder::tagsSchema, HighlighterTagsSchema._DESERIALIZER, "tags_schema");
		op.add(Builder::highlightQuery, Query._DESERIALIZER, "highlight_query");
		op.add(Builder::maxAnalyzedOffset, JsonpDeserializer.stringDeserializer(), "max_analyzed_offset");

	}

}
