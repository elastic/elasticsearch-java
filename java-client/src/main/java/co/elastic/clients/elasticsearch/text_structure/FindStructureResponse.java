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

package co.elastic.clients.elasticsearch.text_structure;

import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch.ingest.PipelineConfig;
import co.elastic.clients.elasticsearch.text_structure.find_structure.FieldStat;
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

// typedef: text_structure.find_structure.Response
@JsonpDeserializable
public final class FindStructureResponse implements JsonpSerializable {
	private final String charset;

	@Nullable
	private final Boolean hasHeaderRow;

	private final boolean hasByteOrderMarker;

	private final String format;

	private final Map<String, FieldStat> fieldStats;

	private final String sampleStart;

	private final int numMessagesAnalyzed;

	private final TypeMapping mappings;

	@Nullable
	private final String quote;

	@Nullable
	private final String delimiter;

	private final boolean needClientTimezone;

	private final int numLinesAnalyzed;

	@Nullable
	private final List<String> columnNames;

	@Nullable
	private final List<String> explanation;

	@Nullable
	private final String grokPattern;

	@Nullable
	private final String multilineStartPattern;

	@Nullable
	private final String excludeLinesPattern;

	@Nullable
	private final List<String> javaTimestampFormats;

	@Nullable
	private final List<String> jodaTimestampFormats;

	@Nullable
	private final String timestampField;

	@Nullable
	private final Boolean shouldTrimFields;

	private final PipelineConfig ingestPipeline;

	// ---------------------------------------------------------------------------------------------

	public FindStructureResponse(Builder builder) {

		this.charset = Objects.requireNonNull(builder.charset, "charset");
		this.hasHeaderRow = builder.hasHeaderRow;
		this.hasByteOrderMarker = Objects.requireNonNull(builder.hasByteOrderMarker, "has_byte_order_marker");
		this.format = Objects.requireNonNull(builder.format, "format");
		this.fieldStats = ModelTypeHelper.unmodifiableNonNull(builder.fieldStats, "field_stats");
		this.sampleStart = Objects.requireNonNull(builder.sampleStart, "sample_start");
		this.numMessagesAnalyzed = Objects.requireNonNull(builder.numMessagesAnalyzed, "num_messages_analyzed");
		this.mappings = Objects.requireNonNull(builder.mappings, "mappings");
		this.quote = builder.quote;
		this.delimiter = builder.delimiter;
		this.needClientTimezone = Objects.requireNonNull(builder.needClientTimezone, "need_client_timezone");
		this.numLinesAnalyzed = Objects.requireNonNull(builder.numLinesAnalyzed, "num_lines_analyzed");
		this.columnNames = ModelTypeHelper.unmodifiable(builder.columnNames);
		this.explanation = ModelTypeHelper.unmodifiable(builder.explanation);
		this.grokPattern = builder.grokPattern;
		this.multilineStartPattern = builder.multilineStartPattern;
		this.excludeLinesPattern = builder.excludeLinesPattern;
		this.javaTimestampFormats = ModelTypeHelper.unmodifiable(builder.javaTimestampFormats);
		this.jodaTimestampFormats = ModelTypeHelper.unmodifiable(builder.jodaTimestampFormats);
		this.timestampField = builder.timestampField;
		this.shouldTrimFields = builder.shouldTrimFields;
		this.ingestPipeline = Objects.requireNonNull(builder.ingestPipeline, "ingest_pipeline");

	}

	public FindStructureResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code charset}
	 */
	public String charset() {
		return this.charset;
	}

	/**
	 * API name: {@code has_header_row}
	 */
	@Nullable
	public Boolean hasHeaderRow() {
		return this.hasHeaderRow;
	}

	/**
	 * API name: {@code has_byte_order_marker}
	 */
	public boolean hasByteOrderMarker() {
		return this.hasByteOrderMarker;
	}

	/**
	 * API name: {@code format}
	 */
	public String format() {
		return this.format;
	}

	/**
	 * API name: {@code field_stats}
	 */
	public Map<String, FieldStat> fieldStats() {
		return this.fieldStats;
	}

	/**
	 * API name: {@code sample_start}
	 */
	public String sampleStart() {
		return this.sampleStart;
	}

	/**
	 * API name: {@code num_messages_analyzed}
	 */
	public int numMessagesAnalyzed() {
		return this.numMessagesAnalyzed;
	}

	/**
	 * API name: {@code mappings}
	 */
	public TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code quote}
	 */
	@Nullable
	public String quote() {
		return this.quote;
	}

	/**
	 * API name: {@code delimiter}
	 */
	@Nullable
	public String delimiter() {
		return this.delimiter;
	}

	/**
	 * API name: {@code need_client_timezone}
	 */
	public boolean needClientTimezone() {
		return this.needClientTimezone;
	}

	/**
	 * API name: {@code num_lines_analyzed}
	 */
	public int numLinesAnalyzed() {
		return this.numLinesAnalyzed;
	}

	/**
	 * API name: {@code column_names}
	 */
	@Nullable
	public List<String> columnNames() {
		return this.columnNames;
	}

	/**
	 * API name: {@code explanation}
	 */
	@Nullable
	public List<String> explanation() {
		return this.explanation;
	}

	/**
	 * API name: {@code grok_pattern}
	 */
	@Nullable
	public String grokPattern() {
		return this.grokPattern;
	}

	/**
	 * API name: {@code multiline_start_pattern}
	 */
	@Nullable
	public String multilineStartPattern() {
		return this.multilineStartPattern;
	}

	/**
	 * API name: {@code exclude_lines_pattern}
	 */
	@Nullable
	public String excludeLinesPattern() {
		return this.excludeLinesPattern;
	}

	/**
	 * API name: {@code java_timestamp_formats}
	 */
	@Nullable
	public List<String> javaTimestampFormats() {
		return this.javaTimestampFormats;
	}

	/**
	 * API name: {@code joda_timestamp_formats}
	 */
	@Nullable
	public List<String> jodaTimestampFormats() {
		return this.jodaTimestampFormats;
	}

	/**
	 * API name: {@code timestamp_field}
	 */
	@Nullable
	public String timestampField() {
		return this.timestampField;
	}

	/**
	 * API name: {@code should_trim_fields}
	 */
	@Nullable
	public Boolean shouldTrimFields() {
		return this.shouldTrimFields;
	}

	/**
	 * API name: {@code ingest_pipeline}
	 */
	public PipelineConfig ingestPipeline() {
		return this.ingestPipeline;
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

		generator.writeKey("charset");
		generator.write(this.charset);

		if (this.hasHeaderRow != null) {

			generator.writeKey("has_header_row");
			generator.write(this.hasHeaderRow);

		}

		generator.writeKey("has_byte_order_marker");
		generator.write(this.hasByteOrderMarker);

		generator.writeKey("format");
		generator.write(this.format);

		generator.writeKey("field_stats");
		generator.writeStartObject();
		for (Map.Entry<String, FieldStat> item0 : this.fieldStats.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("sample_start");
		generator.write(this.sampleStart);

		generator.writeKey("num_messages_analyzed");
		generator.write(this.numMessagesAnalyzed);

		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

		if (this.quote != null) {

			generator.writeKey("quote");
			generator.write(this.quote);

		}
		if (this.delimiter != null) {

			generator.writeKey("delimiter");
			generator.write(this.delimiter);

		}

		generator.writeKey("need_client_timezone");
		generator.write(this.needClientTimezone);

		generator.writeKey("num_lines_analyzed");
		generator.write(this.numLinesAnalyzed);

		if (this.columnNames != null) {

			generator.writeKey("column_names");
			generator.writeStartArray();
			for (String item0 : this.columnNames) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.explanation != null) {

			generator.writeKey("explanation");
			generator.writeStartArray();
			for (String item0 : this.explanation) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.grokPattern != null) {

			generator.writeKey("grok_pattern");
			generator.write(this.grokPattern);

		}
		if (this.multilineStartPattern != null) {

			generator.writeKey("multiline_start_pattern");
			generator.write(this.multilineStartPattern);

		}
		if (this.excludeLinesPattern != null) {

			generator.writeKey("exclude_lines_pattern");
			generator.write(this.excludeLinesPattern);

		}
		if (this.javaTimestampFormats != null) {

			generator.writeKey("java_timestamp_formats");
			generator.writeStartArray();
			for (String item0 : this.javaTimestampFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.jodaTimestampFormats != null) {

			generator.writeKey("joda_timestamp_formats");
			generator.writeStartArray();
			for (String item0 : this.jodaTimestampFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.timestampField != null) {

			generator.writeKey("timestamp_field");
			generator.write(this.timestampField);

		}
		if (this.shouldTrimFields != null) {

			generator.writeKey("should_trim_fields");
			generator.write(this.shouldTrimFields);

		}

		generator.writeKey("ingest_pipeline");
		this.ingestPipeline.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FindStructureResponse}.
	 */
	public static class Builder implements ObjectBuilder<FindStructureResponse> {
		private String charset;

		@Nullable
		private Boolean hasHeaderRow;

		private Boolean hasByteOrderMarker;

		private String format;

		private Map<String, FieldStat> fieldStats;

		private String sampleStart;

		private Integer numMessagesAnalyzed;

		private TypeMapping mappings;

		@Nullable
		private String quote;

		@Nullable
		private String delimiter;

		private Boolean needClientTimezone;

		private Integer numLinesAnalyzed;

		@Nullable
		private List<String> columnNames;

		@Nullable
		private List<String> explanation;

		@Nullable
		private String grokPattern;

		@Nullable
		private String multilineStartPattern;

		@Nullable
		private String excludeLinesPattern;

		@Nullable
		private List<String> javaTimestampFormats;

		@Nullable
		private List<String> jodaTimestampFormats;

		@Nullable
		private String timestampField;

		@Nullable
		private Boolean shouldTrimFields;

		private PipelineConfig ingestPipeline;

		/**
		 * API name: {@code charset}
		 */
		public Builder charset(String value) {
			this.charset = value;
			return this;
		}

		/**
		 * API name: {@code has_header_row}
		 */
		public Builder hasHeaderRow(@Nullable Boolean value) {
			this.hasHeaderRow = value;
			return this;
		}

		/**
		 * API name: {@code has_byte_order_marker}
		 */
		public Builder hasByteOrderMarker(boolean value) {
			this.hasByteOrderMarker = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public Builder format(String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code field_stats}
		 */
		public Builder fieldStats(Map<String, FieldStat> value) {
			this.fieldStats = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fieldStats(Map)}, creating the map if needed.
		 */
		public Builder putFieldStats(String key, FieldStat value) {
			if (this.fieldStats == null) {
				this.fieldStats = new HashMap<>();
			}
			this.fieldStats.put(key, value);
			return this;
		}

		/**
		 * Set {@link #fieldStats(Map)} to a singleton map.
		 */
		public Builder fieldStats(String key, Function<FieldStat.Builder, ObjectBuilder<FieldStat>> fn) {
			return this.fieldStats(Collections.singletonMap(key, fn.apply(new FieldStat.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #fieldStats(Map)}, creating the map if needed.
		 */
		public Builder putFieldStats(String key, Function<FieldStat.Builder, ObjectBuilder<FieldStat>> fn) {
			return this.putFieldStats(key, fn.apply(new FieldStat.Builder()).build());
		}

		/**
		 * API name: {@code sample_start}
		 */
		public Builder sampleStart(String value) {
			this.sampleStart = value;
			return this;
		}

		/**
		 * API name: {@code num_messages_analyzed}
		 */
		public Builder numMessagesAnalyzed(int value) {
			this.numMessagesAnalyzed = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * API name: {@code quote}
		 */
		public Builder quote(@Nullable String value) {
			this.quote = value;
			return this;
		}

		/**
		 * API name: {@code delimiter}
		 */
		public Builder delimiter(@Nullable String value) {
			this.delimiter = value;
			return this;
		}

		/**
		 * API name: {@code need_client_timezone}
		 */
		public Builder needClientTimezone(boolean value) {
			this.needClientTimezone = value;
			return this;
		}

		/**
		 * API name: {@code num_lines_analyzed}
		 */
		public Builder numLinesAnalyzed(int value) {
			this.numLinesAnalyzed = value;
			return this;
		}

		/**
		 * API name: {@code column_names}
		 */
		public Builder columnNames(@Nullable List<String> value) {
			this.columnNames = value;
			return this;
		}

		/**
		 * API name: {@code column_names}
		 */
		public Builder columnNames(String... value) {
			this.columnNames = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #columnNames(List)}, creating the list if needed. 4
		 */
		public Builder addColumnNames(String value) {
			if (this.columnNames == null) {
				this.columnNames = new ArrayList<>();
			}
			this.columnNames.add(value);
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public Builder explanation(@Nullable List<String> value) {
			this.explanation = value;
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public Builder explanation(String... value) {
			this.explanation = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #explanation(List)}, creating the list if needed. 4
		 */
		public Builder addExplanation(String value) {
			if (this.explanation == null) {
				this.explanation = new ArrayList<>();
			}
			this.explanation.add(value);
			return this;
		}

		/**
		 * API name: {@code grok_pattern}
		 */
		public Builder grokPattern(@Nullable String value) {
			this.grokPattern = value;
			return this;
		}

		/**
		 * API name: {@code multiline_start_pattern}
		 */
		public Builder multilineStartPattern(@Nullable String value) {
			this.multilineStartPattern = value;
			return this;
		}

		/**
		 * API name: {@code exclude_lines_pattern}
		 */
		public Builder excludeLinesPattern(@Nullable String value) {
			this.excludeLinesPattern = value;
			return this;
		}

		/**
		 * API name: {@code java_timestamp_formats}
		 */
		public Builder javaTimestampFormats(@Nullable List<String> value) {
			this.javaTimestampFormats = value;
			return this;
		}

		/**
		 * API name: {@code java_timestamp_formats}
		 */
		public Builder javaTimestampFormats(String... value) {
			this.javaTimestampFormats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #javaTimestampFormats(List)}, creating the list if
		 * needed. 4
		 */
		public Builder addJavaTimestampFormats(String value) {
			if (this.javaTimestampFormats == null) {
				this.javaTimestampFormats = new ArrayList<>();
			}
			this.javaTimestampFormats.add(value);
			return this;
		}

		/**
		 * API name: {@code joda_timestamp_formats}
		 */
		public Builder jodaTimestampFormats(@Nullable List<String> value) {
			this.jodaTimestampFormats = value;
			return this;
		}

		/**
		 * API name: {@code joda_timestamp_formats}
		 */
		public Builder jodaTimestampFormats(String... value) {
			this.jodaTimestampFormats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #jodaTimestampFormats(List)}, creating the list if
		 * needed. 4
		 */
		public Builder addJodaTimestampFormats(String value) {
			if (this.jodaTimestampFormats == null) {
				this.jodaTimestampFormats = new ArrayList<>();
			}
			this.jodaTimestampFormats.add(value);
			return this;
		}

		/**
		 * API name: {@code timestamp_field}
		 */
		public Builder timestampField(@Nullable String value) {
			this.timestampField = value;
			return this;
		}

		/**
		 * API name: {@code should_trim_fields}
		 */
		public Builder shouldTrimFields(@Nullable Boolean value) {
			this.shouldTrimFields = value;
			return this;
		}

		/**
		 * API name: {@code ingest_pipeline}
		 */
		public Builder ingestPipeline(PipelineConfig value) {
			this.ingestPipeline = value;
			return this;
		}

		/**
		 * API name: {@code ingest_pipeline}
		 */
		public Builder ingestPipeline(Function<PipelineConfig.Builder, ObjectBuilder<PipelineConfig>> fn) {
			return this.ingestPipeline(fn.apply(new PipelineConfig.Builder()).build());
		}

		/**
		 * Builds a {@link FindStructureResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FindStructureResponse build() {

			return new FindStructureResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FindStructureResponse}
	 */
	public static final JsonpDeserializer<FindStructureResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FindStructureResponse::setupFindStructureResponseDeserializer, Builder::build);

	protected static void setupFindStructureResponseDeserializer(
			DelegatingDeserializer<FindStructureResponse.Builder> op) {

		op.add(Builder::charset, JsonpDeserializer.stringDeserializer(), "charset");
		op.add(Builder::hasHeaderRow, JsonpDeserializer.booleanDeserializer(), "has_header_row");
		op.add(Builder::hasByteOrderMarker, JsonpDeserializer.booleanDeserializer(), "has_byte_order_marker");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::fieldStats, JsonpDeserializer.stringMapDeserializer(FieldStat._DESERIALIZER), "field_stats");
		op.add(Builder::sampleStart, JsonpDeserializer.stringDeserializer(), "sample_start");
		op.add(Builder::numMessagesAnalyzed, JsonpDeserializer.integerDeserializer(), "num_messages_analyzed");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::quote, JsonpDeserializer.stringDeserializer(), "quote");
		op.add(Builder::delimiter, JsonpDeserializer.stringDeserializer(), "delimiter");
		op.add(Builder::needClientTimezone, JsonpDeserializer.booleanDeserializer(), "need_client_timezone");
		op.add(Builder::numLinesAnalyzed, JsonpDeserializer.integerDeserializer(), "num_lines_analyzed");
		op.add(Builder::columnNames, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"column_names");
		op.add(Builder::explanation, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"explanation");
		op.add(Builder::grokPattern, JsonpDeserializer.stringDeserializer(), "grok_pattern");
		op.add(Builder::multilineStartPattern, JsonpDeserializer.stringDeserializer(), "multiline_start_pattern");
		op.add(Builder::excludeLinesPattern, JsonpDeserializer.stringDeserializer(), "exclude_lines_pattern");
		op.add(Builder::javaTimestampFormats,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "java_timestamp_formats");
		op.add(Builder::jodaTimestampFormats,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "joda_timestamp_formats");
		op.add(Builder::timestampField, JsonpDeserializer.stringDeserializer(), "timestamp_field");
		op.add(Builder::shouldTrimFields, JsonpDeserializer.booleanDeserializer(), "should_trim_fields");
		op.add(Builder::ingestPipeline, PipelineConfig._DESERIALIZER, "ingest_pipeline");

	}

}
