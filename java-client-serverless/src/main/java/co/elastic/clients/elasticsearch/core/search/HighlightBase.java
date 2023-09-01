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

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.HighlightBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.HighlightBase">API
 *      specification</a>
 */

public abstract class HighlightBase implements JsonpSerializable {
	@Nullable
	private final String type;

	@Nullable
	private final String boundaryChars;

	@Nullable
	private final Integer boundaryMaxScan;

	@Nullable
	private final BoundaryScanner boundaryScanner;

	@Nullable
	private final String boundaryScannerLocale;

	@Nullable
	private final Boolean forceSource;

	@Nullable
	private final HighlighterFragmenter fragmenter;

	@Nullable
	private final Integer fragmentSize;

	@Nullable
	private final Boolean highlightFilter;

	@Nullable
	private final Query highlightQuery;

	@Nullable
	private final Integer maxFragmentLength;

	@Nullable
	private final Integer maxAnalyzedOffset;

	@Nullable
	private final Integer noMatchSize;

	@Nullable
	private final Integer numberOfFragments;

	private final Map<String, JsonData> options;

	@Nullable
	private final HighlighterOrder order;

	@Nullable
	private final Integer phraseLimit;

	private final List<String> postTags;

	private final List<String> preTags;

	@Nullable
	private final Boolean requireFieldMatch;

	@Nullable
	private final HighlighterTagsSchema tagsSchema;

	// ---------------------------------------------------------------------------------------------

	protected HighlightBase(AbstractBuilder<?> builder) {

		this.type = builder.type;
		this.boundaryChars = builder.boundaryChars;
		this.boundaryMaxScan = builder.boundaryMaxScan;
		this.boundaryScanner = builder.boundaryScanner;
		this.boundaryScannerLocale = builder.boundaryScannerLocale;
		this.forceSource = builder.forceSource;
		this.fragmenter = builder.fragmenter;
		this.fragmentSize = builder.fragmentSize;
		this.highlightFilter = builder.highlightFilter;
		this.highlightQuery = builder.highlightQuery;
		this.maxFragmentLength = builder.maxFragmentLength;
		this.maxAnalyzedOffset = builder.maxAnalyzedOffset;
		this.noMatchSize = builder.noMatchSize;
		this.numberOfFragments = builder.numberOfFragments;
		this.options = ApiTypeHelper.unmodifiable(builder.options);
		this.order = builder.order;
		this.phraseLimit = builder.phraseLimit;
		this.postTags = ApiTypeHelper.unmodifiable(builder.postTags);
		this.preTags = ApiTypeHelper.unmodifiable(builder.preTags);
		this.requireFieldMatch = builder.requireFieldMatch;
		this.tagsSchema = builder.tagsSchema;

	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * A string that contains each boundary character.
	 * <p>
	 * API name: {@code boundary_chars}
	 */
	@Nullable
	public final String boundaryChars() {
		return this.boundaryChars;
	}

	/**
	 * How far to scan for boundary characters.
	 * <p>
	 * API name: {@code boundary_max_scan}
	 */
	@Nullable
	public final Integer boundaryMaxScan() {
		return this.boundaryMaxScan;
	}

	/**
	 * Specifies how to break the highlighted fragments: chars, sentence, or word.
	 * Only valid for the unified and fvh highlighters. Defaults to
	 * <code>sentence</code> for the <code>unified</code> highlighter. Defaults to
	 * <code>chars</code> for the <code>fvh</code> highlighter.
	 * <p>
	 * API name: {@code boundary_scanner}
	 */
	@Nullable
	public final BoundaryScanner boundaryScanner() {
		return this.boundaryScanner;
	}

	/**
	 * Controls which locale is used to search for sentence and word boundaries.
	 * This parameter takes a form of a language tag, for example:
	 * <code>&quot;en-US&quot;</code>, <code>&quot;fr-FR&quot;</code>,
	 * <code>&quot;ja-JP&quot;</code>.
	 * <p>
	 * API name: {@code boundary_scanner_locale}
	 */
	@Nullable
	public final String boundaryScannerLocale() {
		return this.boundaryScannerLocale;
	}

	/**
	 * API name: {@code force_source}
	 * 
	 * @deprecated 8.8.0
	 */
	@Deprecated
	@Nullable
	public final Boolean forceSource() {
		return this.forceSource;
	}

	/**
	 * Specifies how text should be broken up in highlight snippets:
	 * <code>simple</code> or <code>span</code>. Only valid for the
	 * <code>plain</code> highlighter.
	 * <p>
	 * API name: {@code fragmenter}
	 */
	@Nullable
	public final HighlighterFragmenter fragmenter() {
		return this.fragmenter;
	}

	/**
	 * The size of the highlighted fragment in characters.
	 * <p>
	 * API name: {@code fragment_size}
	 */
	@Nullable
	public final Integer fragmentSize() {
		return this.fragmentSize;
	}

	/**
	 * API name: {@code highlight_filter}
	 */
	@Nullable
	public final Boolean highlightFilter() {
		return this.highlightFilter;
	}

	/**
	 * Highlight matches for a query other than the search query. This is especially
	 * useful if you use a rescore query because those are not taken into account by
	 * highlighting by default.
	 * <p>
	 * API name: {@code highlight_query}
	 */
	@Nullable
	public final Query highlightQuery() {
		return this.highlightQuery;
	}

	/**
	 * API name: {@code max_fragment_length}
	 */
	@Nullable
	public final Integer maxFragmentLength() {
		return this.maxFragmentLength;
	}

	/**
	 * If set to a non-negative value, highlighting stops at this defined maximum
	 * limit. The rest of the text is not processed, thus not highlighted and no
	 * error is returned The <code>max_analyzed_offset</code> query setting does not
	 * override the <code>index.highlight.max_analyzed_offset</code> setting, which
	 * prevails when it’s set to lower value than the query setting.
	 * <p>
	 * API name: {@code max_analyzed_offset}
	 */
	@Nullable
	public final Integer maxAnalyzedOffset() {
		return this.maxAnalyzedOffset;
	}

	/**
	 * The amount of text you want to return from the beginning of the field if
	 * there are no matching fragments to highlight.
	 * <p>
	 * API name: {@code no_match_size}
	 */
	@Nullable
	public final Integer noMatchSize() {
		return this.noMatchSize;
	}

	/**
	 * The maximum number of fragments to return. If the number of fragments is set
	 * to <code>0</code>, no fragments are returned. Instead, the entire field
	 * contents are highlighted and returned. This can be handy when you need to
	 * highlight short texts such as a title or address, but fragmentation is not
	 * required. If <code>number_of_fragments</code> is <code>0</code>,
	 * <code>fragment_size</code> is ignored.
	 * <p>
	 * API name: {@code number_of_fragments}
	 */
	@Nullable
	public final Integer numberOfFragments() {
		return this.numberOfFragments;
	}

	/**
	 * API name: {@code options}
	 */
	public final Map<String, JsonData> options() {
		return this.options;
	}

	/**
	 * Sorts highlighted fragments by score when set to <code>score</code>. By
	 * default, fragments will be output in the order they appear in the field
	 * (order: <code>none</code>). Setting this option to <code>score</code> will
	 * output the most relevant fragments first. Each highlighter applies its own
	 * logic to compute relevancy scores.
	 * <p>
	 * API name: {@code order}
	 */
	@Nullable
	public final HighlighterOrder order() {
		return this.order;
	}

	/**
	 * Controls the number of matching phrases in a document that are considered.
	 * Prevents the <code>fvh</code> highlighter from analyzing too many phrases and
	 * consuming too much memory. When using <code>matched_fields</code>,
	 * <code>phrase_limit</code> phrases per matched field are considered. Raising
	 * the limit increases query time and consumes more memory. Only supported by
	 * the <code>fvh</code> highlighter.
	 * <p>
	 * API name: {@code phrase_limit}
	 */
	@Nullable
	public final Integer phraseLimit() {
		return this.phraseLimit;
	}

	/**
	 * Use in conjunction with <code>pre_tags</code> to define the HTML tags to use
	 * for the highlighted text. By default, highlighted text is wrapped in
	 * <code>&lt;em&gt;</code> and <code>&lt;/em&gt;</code> tags.
	 * <p>
	 * API name: {@code post_tags}
	 */
	public final List<String> postTags() {
		return this.postTags;
	}

	/**
	 * Use in conjunction with <code>post_tags</code> to define the HTML tags to use
	 * for the highlighted text. By default, highlighted text is wrapped in
	 * <code>&lt;em&gt;</code> and <code>&lt;/em&gt;</code> tags.
	 * <p>
	 * API name: {@code pre_tags}
	 */
	public final List<String> preTags() {
		return this.preTags;
	}

	/**
	 * By default, only fields that contains a query match are highlighted. Set to
	 * <code>false</code> to highlight all fields.
	 * <p>
	 * API name: {@code require_field_match}
	 */
	@Nullable
	public final Boolean requireFieldMatch() {
		return this.requireFieldMatch;
	}

	/**
	 * Set to <code>styled</code> to use the built-in tag schema.
	 * <p>
	 * API name: {@code tags_schema}
	 */
	@Nullable
	public final HighlighterTagsSchema tagsSchema() {
		return this.tagsSchema;
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

		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

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
		if (this.forceSource != null) {
			generator.writeKey("force_source");
			generator.write(this.forceSource);

		}
		if (this.fragmenter != null) {
			generator.writeKey("fragmenter");
			this.fragmenter.serialize(generator, mapper);
		}
		if (this.fragmentSize != null) {
			generator.writeKey("fragment_size");
			generator.write(this.fragmentSize);

		}
		if (this.highlightFilter != null) {
			generator.writeKey("highlight_filter");
			generator.write(this.highlightFilter);

		}
		if (this.highlightQuery != null) {
			generator.writeKey("highlight_query");
			this.highlightQuery.serialize(generator, mapper);

		}
		if (this.maxFragmentLength != null) {
			generator.writeKey("max_fragment_length");
			generator.write(this.maxFragmentLength);

		}
		if (this.maxAnalyzedOffset != null) {
			generator.writeKey("max_analyzed_offset");
			generator.write(this.maxAnalyzedOffset);

		}
		if (this.noMatchSize != null) {
			generator.writeKey("no_match_size");
			generator.write(this.noMatchSize);

		}
		if (this.numberOfFragments != null) {
			generator.writeKey("number_of_fragments");
			generator.write(this.numberOfFragments);

		}
		if (ApiTypeHelper.isDefined(this.options)) {
			generator.writeKey("options");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.options.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.order != null) {
			generator.writeKey("order");
			this.order.serialize(generator, mapper);
		}
		if (this.phraseLimit != null) {
			generator.writeKey("phrase_limit");
			generator.write(this.phraseLimit);

		}
		if (ApiTypeHelper.isDefined(this.postTags)) {
			generator.writeKey("post_tags");
			generator.writeStartArray();
			for (String item0 : this.postTags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.preTags)) {
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private String type;

		@Nullable
		private String boundaryChars;

		@Nullable
		private Integer boundaryMaxScan;

		@Nullable
		private BoundaryScanner boundaryScanner;

		@Nullable
		private String boundaryScannerLocale;

		@Nullable
		private Boolean forceSource;

		@Nullable
		private HighlighterFragmenter fragmenter;

		@Nullable
		private Integer fragmentSize;

		@Nullable
		private Boolean highlightFilter;

		@Nullable
		private Query highlightQuery;

		@Nullable
		private Integer maxFragmentLength;

		@Nullable
		private Integer maxAnalyzedOffset;

		@Nullable
		private Integer noMatchSize;

		@Nullable
		private Integer numberOfFragments;

		@Nullable
		private Map<String, JsonData> options;

		@Nullable
		private HighlighterOrder order;

		@Nullable
		private Integer phraseLimit;

		@Nullable
		private List<String> postTags;

		@Nullable
		private List<String> preTags;

		@Nullable
		private Boolean requireFieldMatch;

		@Nullable
		private HighlighterTagsSchema tagsSchema;

		/**
		 * API name: {@code type}
		 */
		public final BuilderT type(@Nullable String value) {
			this.type = value;
			return self();
		}

		/**
		 * API name: {@code type}
		 */
		public final BuilderT type(@Nullable HighlighterType value) {
			this.type = value == null ? null : value.jsonValue();
			return self();
		}

		/**
		 * A string that contains each boundary character.
		 * <p>
		 * API name: {@code boundary_chars}
		 */
		public final BuilderT boundaryChars(@Nullable String value) {
			this.boundaryChars = value;
			return self();
		}

		/**
		 * How far to scan for boundary characters.
		 * <p>
		 * API name: {@code boundary_max_scan}
		 */
		public final BuilderT boundaryMaxScan(@Nullable Integer value) {
			this.boundaryMaxScan = value;
			return self();
		}

		/**
		 * Specifies how to break the highlighted fragments: chars, sentence, or word.
		 * Only valid for the unified and fvh highlighters. Defaults to
		 * <code>sentence</code> for the <code>unified</code> highlighter. Defaults to
		 * <code>chars</code> for the <code>fvh</code> highlighter.
		 * <p>
		 * API name: {@code boundary_scanner}
		 */
		public final BuilderT boundaryScanner(@Nullable BoundaryScanner value) {
			this.boundaryScanner = value;
			return self();
		}

		/**
		 * Controls which locale is used to search for sentence and word boundaries.
		 * This parameter takes a form of a language tag, for example:
		 * <code>&quot;en-US&quot;</code>, <code>&quot;fr-FR&quot;</code>,
		 * <code>&quot;ja-JP&quot;</code>.
		 * <p>
		 * API name: {@code boundary_scanner_locale}
		 */
		public final BuilderT boundaryScannerLocale(@Nullable String value) {
			this.boundaryScannerLocale = value;
			return self();
		}

		/**
		 * API name: {@code force_source}
		 * 
		 * @deprecated 8.8.0
		 */
		@Deprecated
		public final BuilderT forceSource(@Nullable Boolean value) {
			this.forceSource = value;
			return self();
		}

		/**
		 * Specifies how text should be broken up in highlight snippets:
		 * <code>simple</code> or <code>span</code>. Only valid for the
		 * <code>plain</code> highlighter.
		 * <p>
		 * API name: {@code fragmenter}
		 */
		public final BuilderT fragmenter(@Nullable HighlighterFragmenter value) {
			this.fragmenter = value;
			return self();
		}

		/**
		 * The size of the highlighted fragment in characters.
		 * <p>
		 * API name: {@code fragment_size}
		 */
		public final BuilderT fragmentSize(@Nullable Integer value) {
			this.fragmentSize = value;
			return self();
		}

		/**
		 * API name: {@code highlight_filter}
		 */
		public final BuilderT highlightFilter(@Nullable Boolean value) {
			this.highlightFilter = value;
			return self();
		}

		/**
		 * Highlight matches for a query other than the search query. This is especially
		 * useful if you use a rescore query because those are not taken into account by
		 * highlighting by default.
		 * <p>
		 * API name: {@code highlight_query}
		 */
		public final BuilderT highlightQuery(@Nullable Query value) {
			this.highlightQuery = value;
			return self();
		}

		/**
		 * Highlight matches for a query other than the search query. This is especially
		 * useful if you use a rescore query because those are not taken into account by
		 * highlighting by default.
		 * <p>
		 * API name: {@code highlight_query}
		 */
		public final BuilderT highlightQuery(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.highlightQuery(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code max_fragment_length}
		 */
		public final BuilderT maxFragmentLength(@Nullable Integer value) {
			this.maxFragmentLength = value;
			return self();
		}

		/**
		 * If set to a non-negative value, highlighting stops at this defined maximum
		 * limit. The rest of the text is not processed, thus not highlighted and no
		 * error is returned The <code>max_analyzed_offset</code> query setting does not
		 * override the <code>index.highlight.max_analyzed_offset</code> setting, which
		 * prevails when it’s set to lower value than the query setting.
		 * <p>
		 * API name: {@code max_analyzed_offset}
		 */
		public final BuilderT maxAnalyzedOffset(@Nullable Integer value) {
			this.maxAnalyzedOffset = value;
			return self();
		}

		/**
		 * The amount of text you want to return from the beginning of the field if
		 * there are no matching fragments to highlight.
		 * <p>
		 * API name: {@code no_match_size}
		 */
		public final BuilderT noMatchSize(@Nullable Integer value) {
			this.noMatchSize = value;
			return self();
		}

		/**
		 * The maximum number of fragments to return. If the number of fragments is set
		 * to <code>0</code>, no fragments are returned. Instead, the entire field
		 * contents are highlighted and returned. This can be handy when you need to
		 * highlight short texts such as a title or address, but fragmentation is not
		 * required. If <code>number_of_fragments</code> is <code>0</code>,
		 * <code>fragment_size</code> is ignored.
		 * <p>
		 * API name: {@code number_of_fragments}
		 */
		public final BuilderT numberOfFragments(@Nullable Integer value) {
			this.numberOfFragments = value;
			return self();
		}

		/**
		 * API name: {@code options}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>options</code>.
		 */
		public final BuilderT options(Map<String, JsonData> map) {
			this.options = _mapPutAll(this.options, map);
			return self();
		}

		/**
		 * API name: {@code options}
		 * <p>
		 * Adds an entry to <code>options</code>.
		 */
		public final BuilderT options(String key, JsonData value) {
			this.options = _mapPut(this.options, key, value);
			return self();
		}

		/**
		 * Sorts highlighted fragments by score when set to <code>score</code>. By
		 * default, fragments will be output in the order they appear in the field
		 * (order: <code>none</code>). Setting this option to <code>score</code> will
		 * output the most relevant fragments first. Each highlighter applies its own
		 * logic to compute relevancy scores.
		 * <p>
		 * API name: {@code order}
		 */
		public final BuilderT order(@Nullable HighlighterOrder value) {
			this.order = value;
			return self();
		}

		/**
		 * Controls the number of matching phrases in a document that are considered.
		 * Prevents the <code>fvh</code> highlighter from analyzing too many phrases and
		 * consuming too much memory. When using <code>matched_fields</code>,
		 * <code>phrase_limit</code> phrases per matched field are considered. Raising
		 * the limit increases query time and consumes more memory. Only supported by
		 * the <code>fvh</code> highlighter.
		 * <p>
		 * API name: {@code phrase_limit}
		 */
		public final BuilderT phraseLimit(@Nullable Integer value) {
			this.phraseLimit = value;
			return self();
		}

		/**
		 * Use in conjunction with <code>pre_tags</code> to define the HTML tags to use
		 * for the highlighted text. By default, highlighted text is wrapped in
		 * <code>&lt;em&gt;</code> and <code>&lt;/em&gt;</code> tags.
		 * <p>
		 * API name: {@code post_tags}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>postTags</code>.
		 */
		public final BuilderT postTags(List<String> list) {
			this.postTags = _listAddAll(this.postTags, list);
			return self();
		}

		/**
		 * Use in conjunction with <code>pre_tags</code> to define the HTML tags to use
		 * for the highlighted text. By default, highlighted text is wrapped in
		 * <code>&lt;em&gt;</code> and <code>&lt;/em&gt;</code> tags.
		 * <p>
		 * API name: {@code post_tags}
		 * <p>
		 * Adds one or more values to <code>postTags</code>.
		 */
		public final BuilderT postTags(String value, String... values) {
			this.postTags = _listAdd(this.postTags, value, values);
			return self();
		}

		/**
		 * Use in conjunction with <code>post_tags</code> to define the HTML tags to use
		 * for the highlighted text. By default, highlighted text is wrapped in
		 * <code>&lt;em&gt;</code> and <code>&lt;/em&gt;</code> tags.
		 * <p>
		 * API name: {@code pre_tags}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>preTags</code>.
		 */
		public final BuilderT preTags(List<String> list) {
			this.preTags = _listAddAll(this.preTags, list);
			return self();
		}

		/**
		 * Use in conjunction with <code>post_tags</code> to define the HTML tags to use
		 * for the highlighted text. By default, highlighted text is wrapped in
		 * <code>&lt;em&gt;</code> and <code>&lt;/em&gt;</code> tags.
		 * <p>
		 * API name: {@code pre_tags}
		 * <p>
		 * Adds one or more values to <code>preTags</code>.
		 */
		public final BuilderT preTags(String value, String... values) {
			this.preTags = _listAdd(this.preTags, value, values);
			return self();
		}

		/**
		 * By default, only fields that contains a query match are highlighted. Set to
		 * <code>false</code> to highlight all fields.
		 * <p>
		 * API name: {@code require_field_match}
		 */
		public final BuilderT requireFieldMatch(@Nullable Boolean value) {
			this.requireFieldMatch = value;
			return self();
		}

		/**
		 * Set to <code>styled</code> to use the built-in tag schema.
		 * <p>
		 * API name: {@code tags_schema}
		 */
		public final BuilderT tagsSchema(@Nullable HighlighterTagsSchema value) {
			this.tagsSchema = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupHighlightBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(AbstractBuilder::boundaryChars, JsonpDeserializer.stringDeserializer(), "boundary_chars");
		op.add(AbstractBuilder::boundaryMaxScan, JsonpDeserializer.integerDeserializer(), "boundary_max_scan");
		op.add(AbstractBuilder::boundaryScanner, BoundaryScanner._DESERIALIZER, "boundary_scanner");
		op.add(AbstractBuilder::boundaryScannerLocale, JsonpDeserializer.stringDeserializer(),
				"boundary_scanner_locale");
		op.add(AbstractBuilder::forceSource, JsonpDeserializer.booleanDeserializer(), "force_source");
		op.add(AbstractBuilder::fragmenter, HighlighterFragmenter._DESERIALIZER, "fragmenter");
		op.add(AbstractBuilder::fragmentSize, JsonpDeserializer.integerDeserializer(), "fragment_size");
		op.add(AbstractBuilder::highlightFilter, JsonpDeserializer.booleanDeserializer(), "highlight_filter");
		op.add(AbstractBuilder::highlightQuery, Query._DESERIALIZER, "highlight_query");
		op.add(AbstractBuilder::maxFragmentLength, JsonpDeserializer.integerDeserializer(), "max_fragment_length");
		op.add(AbstractBuilder::maxAnalyzedOffset, JsonpDeserializer.integerDeserializer(), "max_analyzed_offset");
		op.add(AbstractBuilder::noMatchSize, JsonpDeserializer.integerDeserializer(), "no_match_size");
		op.add(AbstractBuilder::numberOfFragments, JsonpDeserializer.integerDeserializer(), "number_of_fragments");
		op.add(AbstractBuilder::options, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "options");
		op.add(AbstractBuilder::order, HighlighterOrder._DESERIALIZER, "order");
		op.add(AbstractBuilder::phraseLimit, JsonpDeserializer.integerDeserializer(), "phrase_limit");
		op.add(AbstractBuilder::postTags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"post_tags");
		op.add(AbstractBuilder::preTags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"pre_tags");
		op.add(AbstractBuilder::requireFieldMatch, JsonpDeserializer.booleanDeserializer(), "require_field_match");
		op.add(AbstractBuilder::tagsSchema, HighlighterTagsSchema._DESERIALIZER, "tags_schema");

	}

}
