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

package co.elastic.clients.elasticsearch.text_structure;

import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch.ingest.PipelineConfig;
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

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: text_structure.find_message_structure.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#text_structure.find_message_structure.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class FindMessageStructureResponse implements JsonpSerializable {
	private final String charset;

	@Nullable
	private final EcsCompatibilityType ecsCompatibility;

	private final Map<String, FieldStat> fieldStats;

	private final FormatType format;

	@Nullable
	private final String grokPattern;

	private final List<String> javaTimestampFormats;

	private final List<String> jodaTimestampFormats;

	private final PipelineConfig ingestPipeline;

	private final TypeMapping mappings;

	@Nullable
	private final String multilineStartPattern;

	private final boolean needClientTimezone;

	private final int numLinesAnalyzed;

	private final int numMessagesAnalyzed;

	private final String sampleStart;

	@Nullable
	private final String timestampField;

	// ---------------------------------------------------------------------------------------------

	private FindMessageStructureResponse(Builder builder) {

		this.charset = ApiTypeHelper.requireNonNull(builder.charset, this, "charset");
		this.ecsCompatibility = builder.ecsCompatibility;
		this.fieldStats = ApiTypeHelper.unmodifiableRequired(builder.fieldStats, this, "fieldStats");
		this.format = ApiTypeHelper.requireNonNull(builder.format, this, "format");
		this.grokPattern = builder.grokPattern;
		this.javaTimestampFormats = ApiTypeHelper.unmodifiable(builder.javaTimestampFormats);
		this.jodaTimestampFormats = ApiTypeHelper.unmodifiable(builder.jodaTimestampFormats);
		this.ingestPipeline = ApiTypeHelper.requireNonNull(builder.ingestPipeline, this, "ingestPipeline");
		this.mappings = ApiTypeHelper.requireNonNull(builder.mappings, this, "mappings");
		this.multilineStartPattern = builder.multilineStartPattern;
		this.needClientTimezone = ApiTypeHelper.requireNonNull(builder.needClientTimezone, this, "needClientTimezone");
		this.numLinesAnalyzed = ApiTypeHelper.requireNonNull(builder.numLinesAnalyzed, this, "numLinesAnalyzed");
		this.numMessagesAnalyzed = ApiTypeHelper.requireNonNull(builder.numMessagesAnalyzed, this,
				"numMessagesAnalyzed");
		this.sampleStart = ApiTypeHelper.requireNonNull(builder.sampleStart, this, "sampleStart");
		this.timestampField = builder.timestampField;

	}

	public static FindMessageStructureResponse of(Function<Builder, ObjectBuilder<FindMessageStructureResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code charset}
	 */
	public final String charset() {
		return this.charset;
	}

	/**
	 * API name: {@code ecs_compatibility}
	 */
	@Nullable
	public final EcsCompatibilityType ecsCompatibility() {
		return this.ecsCompatibility;
	}

	/**
	 * Required - API name: {@code field_stats}
	 */
	public final Map<String, FieldStat> fieldStats() {
		return this.fieldStats;
	}

	/**
	 * Required - API name: {@code format}
	 */
	public final FormatType format() {
		return this.format;
	}

	/**
	 * API name: {@code grok_pattern}
	 */
	@Nullable
	public final String grokPattern() {
		return this.grokPattern;
	}

	/**
	 * API name: {@code java_timestamp_formats}
	 */
	public final List<String> javaTimestampFormats() {
		return this.javaTimestampFormats;
	}

	/**
	 * API name: {@code joda_timestamp_formats}
	 */
	public final List<String> jodaTimestampFormats() {
		return this.jodaTimestampFormats;
	}

	/**
	 * Required - API name: {@code ingest_pipeline}
	 */
	public final PipelineConfig ingestPipeline() {
		return this.ingestPipeline;
	}

	/**
	 * Required - API name: {@code mappings}
	 */
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code multiline_start_pattern}
	 */
	@Nullable
	public final String multilineStartPattern() {
		return this.multilineStartPattern;
	}

	/**
	 * Required - API name: {@code need_client_timezone}
	 */
	public final boolean needClientTimezone() {
		return this.needClientTimezone;
	}

	/**
	 * Required - API name: {@code num_lines_analyzed}
	 */
	public final int numLinesAnalyzed() {
		return this.numLinesAnalyzed;
	}

	/**
	 * Required - API name: {@code num_messages_analyzed}
	 */
	public final int numMessagesAnalyzed() {
		return this.numMessagesAnalyzed;
	}

	/**
	 * Required - API name: {@code sample_start}
	 */
	public final String sampleStart() {
		return this.sampleStart;
	}

	/**
	 * API name: {@code timestamp_field}
	 */
	@Nullable
	public final String timestampField() {
		return this.timestampField;
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

		if (this.ecsCompatibility != null) {
			generator.writeKey("ecs_compatibility");
			this.ecsCompatibility.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.fieldStats)) {
			generator.writeKey("field_stats");
			generator.writeStartObject();
			for (Map.Entry<String, FieldStat> item0 : this.fieldStats.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("format");
		this.format.serialize(generator, mapper);
		if (this.grokPattern != null) {
			generator.writeKey("grok_pattern");
			generator.write(this.grokPattern);

		}
		if (ApiTypeHelper.isDefined(this.javaTimestampFormats)) {
			generator.writeKey("java_timestamp_formats");
			generator.writeStartArray();
			for (String item0 : this.javaTimestampFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.jodaTimestampFormats)) {
			generator.writeKey("joda_timestamp_formats");
			generator.writeStartArray();
			for (String item0 : this.jodaTimestampFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("ingest_pipeline");
		this.ingestPipeline.serialize(generator, mapper);

		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

		if (this.multilineStartPattern != null) {
			generator.writeKey("multiline_start_pattern");
			generator.write(this.multilineStartPattern);

		}
		generator.writeKey("need_client_timezone");
		generator.write(this.needClientTimezone);

		generator.writeKey("num_lines_analyzed");
		generator.write(this.numLinesAnalyzed);

		generator.writeKey("num_messages_analyzed");
		generator.write(this.numMessagesAnalyzed);

		generator.writeKey("sample_start");
		generator.write(this.sampleStart);

		if (this.timestampField != null) {
			generator.writeKey("timestamp_field");
			generator.write(this.timestampField);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FindMessageStructureResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FindMessageStructureResponse> {
		private String charset;

		@Nullable
		private EcsCompatibilityType ecsCompatibility;

		private Map<String, FieldStat> fieldStats;

		private FormatType format;

		@Nullable
		private String grokPattern;

		@Nullable
		private List<String> javaTimestampFormats;

		@Nullable
		private List<String> jodaTimestampFormats;

		private PipelineConfig ingestPipeline;

		private TypeMapping mappings;

		@Nullable
		private String multilineStartPattern;

		private Boolean needClientTimezone;

		private Integer numLinesAnalyzed;

		private Integer numMessagesAnalyzed;

		private String sampleStart;

		@Nullable
		private String timestampField;

		/**
		 * Required - API name: {@code charset}
		 */
		public final Builder charset(String value) {
			this.charset = value;
			return this;
		}

		/**
		 * API name: {@code ecs_compatibility}
		 */
		public final Builder ecsCompatibility(@Nullable EcsCompatibilityType value) {
			this.ecsCompatibility = value;
			return this;
		}

		/**
		 * Required - API name: {@code field_stats}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fieldStats</code>.
		 */
		public final Builder fieldStats(Map<String, FieldStat> map) {
			this.fieldStats = _mapPutAll(this.fieldStats, map);
			return this;
		}

		/**
		 * Required - API name: {@code field_stats}
		 * <p>
		 * Adds an entry to <code>fieldStats</code>.
		 */
		public final Builder fieldStats(String key, FieldStat value) {
			this.fieldStats = _mapPut(this.fieldStats, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code field_stats}
		 * <p>
		 * Adds an entry to <code>fieldStats</code> using a builder lambda.
		 */
		public final Builder fieldStats(String key, Function<FieldStat.Builder, ObjectBuilder<FieldStat>> fn) {
			return fieldStats(key, fn.apply(new FieldStat.Builder()).build());
		}

		/**
		 * Required - API name: {@code format}
		 */
		public final Builder format(FormatType value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code grok_pattern}
		 */
		public final Builder grokPattern(@Nullable String value) {
			this.grokPattern = value;
			return this;
		}

		/**
		 * API name: {@code java_timestamp_formats}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>javaTimestampFormats</code>.
		 */
		public final Builder javaTimestampFormats(List<String> list) {
			this.javaTimestampFormats = _listAddAll(this.javaTimestampFormats, list);
			return this;
		}

		/**
		 * API name: {@code java_timestamp_formats}
		 * <p>
		 * Adds one or more values to <code>javaTimestampFormats</code>.
		 */
		public final Builder javaTimestampFormats(String value, String... values) {
			this.javaTimestampFormats = _listAdd(this.javaTimestampFormats, value, values);
			return this;
		}

		/**
		 * API name: {@code joda_timestamp_formats}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>jodaTimestampFormats</code>.
		 */
		public final Builder jodaTimestampFormats(List<String> list) {
			this.jodaTimestampFormats = _listAddAll(this.jodaTimestampFormats, list);
			return this;
		}

		/**
		 * API name: {@code joda_timestamp_formats}
		 * <p>
		 * Adds one or more values to <code>jodaTimestampFormats</code>.
		 */
		public final Builder jodaTimestampFormats(String value, String... values) {
			this.jodaTimestampFormats = _listAdd(this.jodaTimestampFormats, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code ingest_pipeline}
		 */
		public final Builder ingestPipeline(PipelineConfig value) {
			this.ingestPipeline = value;
			return this;
		}

		/**
		 * Required - API name: {@code ingest_pipeline}
		 */
		public final Builder ingestPipeline(Function<PipelineConfig.Builder, ObjectBuilder<PipelineConfig>> fn) {
			return this.ingestPipeline(fn.apply(new PipelineConfig.Builder()).build());
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * API name: {@code multiline_start_pattern}
		 */
		public final Builder multilineStartPattern(@Nullable String value) {
			this.multilineStartPattern = value;
			return this;
		}

		/**
		 * Required - API name: {@code need_client_timezone}
		 */
		public final Builder needClientTimezone(boolean value) {
			this.needClientTimezone = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_lines_analyzed}
		 */
		public final Builder numLinesAnalyzed(int value) {
			this.numLinesAnalyzed = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_messages_analyzed}
		 */
		public final Builder numMessagesAnalyzed(int value) {
			this.numMessagesAnalyzed = value;
			return this;
		}

		/**
		 * Required - API name: {@code sample_start}
		 */
		public final Builder sampleStart(String value) {
			this.sampleStart = value;
			return this;
		}

		/**
		 * API name: {@code timestamp_field}
		 */
		public final Builder timestampField(@Nullable String value) {
			this.timestampField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FindMessageStructureResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FindMessageStructureResponse build() {
			_checkSingleUse();

			return new FindMessageStructureResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FindMessageStructureResponse}
	 */
	public static final JsonpDeserializer<FindMessageStructureResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FindMessageStructureResponse::setupFindMessageStructureResponseDeserializer);

	protected static void setupFindMessageStructureResponseDeserializer(
			ObjectDeserializer<FindMessageStructureResponse.Builder> op) {

		op.add(Builder::charset, JsonpDeserializer.stringDeserializer(), "charset");
		op.add(Builder::ecsCompatibility, EcsCompatibilityType._DESERIALIZER, "ecs_compatibility");
		op.add(Builder::fieldStats, JsonpDeserializer.stringMapDeserializer(FieldStat._DESERIALIZER), "field_stats");
		op.add(Builder::format, FormatType._DESERIALIZER, "format");
		op.add(Builder::grokPattern, JsonpDeserializer.stringDeserializer(), "grok_pattern");
		op.add(Builder::javaTimestampFormats,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "java_timestamp_formats");
		op.add(Builder::jodaTimestampFormats,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "joda_timestamp_formats");
		op.add(Builder::ingestPipeline, PipelineConfig._DESERIALIZER, "ingest_pipeline");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::multilineStartPattern, JsonpDeserializer.stringDeserializer(), "multiline_start_pattern");
		op.add(Builder::needClientTimezone, JsonpDeserializer.booleanDeserializer(), "need_client_timezone");
		op.add(Builder::numLinesAnalyzed, JsonpDeserializer.integerDeserializer(), "num_lines_analyzed");
		op.add(Builder::numMessagesAnalyzed, JsonpDeserializer.integerDeserializer(), "num_messages_analyzed");
		op.add(Builder::sampleStart, JsonpDeserializer.stringDeserializer(), "sample_start");
		op.add(Builder::timestampField, JsonpDeserializer.stringDeserializer(), "timestamp_field");

	}

}
