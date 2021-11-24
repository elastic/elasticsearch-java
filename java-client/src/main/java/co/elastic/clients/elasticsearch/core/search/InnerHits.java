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

import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.elasticsearch._types.query_dsl.FieldAndFormat;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.InnerHits
@JsonpDeserializable
public class InnerHits implements JsonpSerializable {
	@Nullable
	private final String name;

	@Nullable
	private final Integer size;

	@Nullable
	private final Integer from;

	@Nullable
	private final FieldCollapse collapse;

	private final List<FieldAndFormat> docvalueFields;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final Highlight highlight;

	@Nullable
	private final Boolean ignoreUnmapped;

	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final Boolean seqNoPrimaryTerm;

	private final List<String> fields;

	private final List<SortOptions> sort;

	@Nullable
	private final SourceConfig source;

	private final List<String> storedField;

	@Nullable
	private final Boolean trackScores;

	@Nullable
	private final Boolean version;

	// ---------------------------------------------------------------------------------------------

	private InnerHits(Builder builder) {

		this.name = builder.name;
		this.size = builder.size;
		this.from = builder.from;
		this.collapse = builder.collapse;
		this.docvalueFields = ModelTypeHelper.unmodifiable(builder.docvalueFields);
		this.explain = builder.explain;
		this.highlight = builder.highlight;
		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.scriptFields = ModelTypeHelper.unmodifiable(builder.scriptFields);
		this.seqNoPrimaryTerm = builder.seqNoPrimaryTerm;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);
		this.source = builder.source;
		this.storedField = ModelTypeHelper.unmodifiable(builder.storedField);
		this.trackScores = builder.trackScores;
		this.version = builder.version;

	}

	public static InnerHits of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * API name: {@code collapse}
	 */
	@Nullable
	public final FieldCollapse collapse() {
		return this.collapse;
	}

	/**
	 * API name: {@code docvalue_fields}
	 */
	public final List<FieldAndFormat> docvalueFields() {
		return this.docvalueFields;
	}

	/**
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public final Highlight highlight() {
		return this.highlight;
	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public final Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	/**
	 * API name: {@code script_fields}
	 */
	public final Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * API name: {@code seq_no_primary_term}
	 */
	@Nullable
	public final Boolean seqNoPrimaryTerm() {
		return this.seqNoPrimaryTerm;
	}

	/**
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceConfig source() {
		return this.source;
	}

	/**
	 * API name: {@code stored_field}
	 */
	public final List<String> storedField() {
		return this.storedField;
	}

	/**
	 * API name: {@code track_scores}
	 */
	@Nullable
	public final Boolean trackScores() {
		return this.trackScores;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Boolean version() {
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

		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.collapse != null) {
			generator.writeKey("collapse");
			this.collapse.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.docvalueFields)) {
			generator.writeKey("docvalue_fields");
			generator.writeStartArray();
			for (FieldAndFormat item0 : this.docvalueFields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.explain != null) {
			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (this.highlight != null) {
			generator.writeKey("highlight");
			this.highlight.serialize(generator, mapper);

		}
		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}
		if (ModelTypeHelper.isDefined(this.scriptFields)) {
			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.seqNoPrimaryTerm != null) {
			generator.writeKey("seq_no_primary_term");
			generator.write(this.seqNoPrimaryTerm);

		}
		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.storedField)) {
			generator.writeKey("stored_field");
			generator.writeStartArray();
			for (String item0 : this.storedField) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.trackScores != null) {
			generator.writeKey("track_scores");
			generator.write(this.trackScores);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InnerHits}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<InnerHits> {
		@Nullable
		private String name;

		@Nullable
		private Integer size;

		@Nullable
		private Integer from;

		@Nullable
		private FieldCollapse collapse;

		@Nullable
		private List<FieldAndFormat> docvalueFields;

		@Nullable
		private Boolean explain;

		@Nullable
		private Highlight highlight;

		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private Boolean seqNoPrimaryTerm;

		@Nullable
		private List<String> fields;

		@Nullable
		private List<SortOptions> sort;

		@Nullable
		private SourceConfig source;

		@Nullable
		private List<String> storedField;

		@Nullable
		private Boolean trackScores;

		@Nullable
		private Boolean version;

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public final Builder collapse(@Nullable FieldCollapse value) {
			this.collapse = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public final Builder collapse(Consumer<FieldCollapse.Builder> fn) {
			FieldCollapse.Builder builder = new FieldCollapse.Builder();
			fn.accept(builder);
			return this.collapse(builder.build());
		}

		/**
		 * API name: {@code docvalue_fields}
		 */
		public final Builder docvalueFields(@Nullable List<FieldAndFormat> value) {
			this.docvalueFields = value;
			return this;
		}

		/**
		 * API name: {@code docvalue_fields}
		 */
		public final Builder docvalueFields(FieldAndFormat... value) {
			this.docvalueFields = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code docvalue_fields}
		 */
		public final Builder docvalueFields(
				Function<ListBuilder<FieldAndFormat, FieldAndFormat.Builder>, ObjectBuilder<List<FieldAndFormat>>> fn) {
			return docvalueFields(fn.apply(new ListBuilder<>(FieldAndFormat.Builder::new)).build());
		}

		/**
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public final Builder highlight(@Nullable Highlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public final Builder highlight(Consumer<Highlight.Builder> fn) {
			Highlight.Builder builder = new Highlight.Builder();
			fn.accept(builder);
			return this.highlight(builder.build());
		}

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public final Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		/**
		 * API name: {@code script_fields}
		 */
		public final Builder scriptFields(@Nullable Map<String, ScriptField> value) {
			this.scriptFields = value;
			return this;
		}

		public final Builder scriptFields(
				Function<MapBuilder<String, ScriptField, ScriptField.Builder>, ObjectBuilder<Map<String, ScriptField>>> fn) {
			return scriptFields(fn.apply(new MapBuilder<>(ScriptField.Builder::new)).build());
		}

		/**
		 * API name: {@code seq_no_primary_term}
		 */
		public final Builder seqNoPrimaryTerm(@Nullable Boolean value) {
			this.seqNoPrimaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public final Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public final Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable List<SortOptions> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(SortOptions... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(
				Function<ListBuilder<SortOptions, SortOptions.Builder>, ObjectBuilder<List<SortOptions>>> fn) {
			return sort(fn.apply(new ListBuilder<>(SortOptions.Builder::new)).build());
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceConfig value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public final Builder source(Consumer<SourceConfig.Builder> fn) {
			SourceConfig.Builder builder = new SourceConfig.Builder();
			fn.accept(builder);
			return this.source(builder.build());
		}

		/**
		 * API name: {@code stored_field}
		 */
		public final Builder storedField(@Nullable List<String> value) {
			this.storedField = value;
			return this;
		}

		/**
		 * API name: {@code stored_field}
		 */
		public final Builder storedField(String... value) {
			this.storedField = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code track_scores}
		 */
		public final Builder trackScores(@Nullable Boolean value) {
			this.trackScores = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link InnerHits}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InnerHits build() {
			_checkSingleUse();

			return new InnerHits(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InnerHits}
	 */
	public static final JsonpDeserializer<InnerHits> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InnerHits::setupInnerHitsDeserializer);

	protected static void setupInnerHitsDeserializer(ObjectDeserializer<InnerHits.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::collapse, FieldCollapse._DESERIALIZER, "collapse");
		op.add(Builder::docvalueFields, JsonpDeserializer.arrayDeserializer(FieldAndFormat._DESERIALIZER),
				"docvalue_fields");
		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::highlight, Highlight._DESERIALIZER, "highlight");
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::seqNoPrimaryTerm, JsonpDeserializer.booleanDeserializer(), "seq_no_primary_term");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");
		op.add(Builder::source, SourceConfig._DESERIALIZER, "_source");
		op.add(Builder::storedField, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_field");
		op.add(Builder::trackScores, JsonpDeserializer.booleanDeserializer(), "track_scores");
		op.add(Builder::version, JsonpDeserializer.booleanDeserializer(), "version");

	}

}
