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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: text_structure.find_field_structure.Request

/**
 * Find the structure of a text field.
 * <p>
 * Find the structure of a text field in an Elasticsearch index.
 * <p>
 * This API provides a starting point for extracting further information from
 * log messages already ingested into Elasticsearch. For example, if you have
 * ingested data into a very simple index that has just <code>@timestamp</code>
 * and message fields, you can use this API to see what common structure exists
 * in the message field.
 * <p>
 * The response from the API contains:
 * <ul>
 * <li>Sample messages.</li>
 * <li>Statistics that reveal the most common values for all fields detected
 * within the text and basic numeric statistics for numeric fields.</li>
 * <li>Information about the structure of the text, which is useful when you
 * write ingest configurations to index it or similarly formatted text.</li>
 * <li>Appropriate mappings for an Elasticsearch index, which you could use to
 * ingest the text.</li>
 * </ul>
 * <p>
 * All this information can be calculated by the structure finder with no
 * guidance. However, you can optionally override some of the decisions about
 * the text structure by specifying one or more query parameters.
 * <p>
 * If the structure finder produces unexpected results, specify the
 * <code>explain</code> query parameter and an explanation will appear in the
 * response. It helps determine why the returned structure was chosen.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#text_structure.find_field_structure.Request">API
 *      specification</a>
 */

public class FindFieldStructureRequest extends RequestBase {
	private final List<String> columnNames;

	@Nullable
	private final String delimiter;

	@Nullable
	private final Number documentsToSample;

	@Nullable
	private final EcsCompatibilityType ecsCompatibility;

	@Nullable
	private final Boolean explain;

	private final String field;

	@Nullable
	private final FormatType format;

	@Nullable
	private final String grokPattern;

	private final String index;

	@Nullable
	private final String quote;

	@Nullable
	private final Boolean shouldTrimFields;

	@Nullable
	private final Time timeout;

	@Nullable
	private final String timestampField;

	@Nullable
	private final String timestampFormat;

	// ---------------------------------------------------------------------------------------------

	private FindFieldStructureRequest(Builder builder) {

		this.columnNames = ApiTypeHelper.unmodifiable(builder.columnNames);
		this.delimiter = builder.delimiter;
		this.documentsToSample = builder.documentsToSample;
		this.ecsCompatibility = builder.ecsCompatibility;
		this.explain = builder.explain;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.format = builder.format;
		this.grokPattern = builder.grokPattern;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.quote = builder.quote;
		this.shouldTrimFields = builder.shouldTrimFields;
		this.timeout = builder.timeout;
		this.timestampField = builder.timestampField;
		this.timestampFormat = builder.timestampFormat;

	}

	public static FindFieldStructureRequest of(Function<Builder, ObjectBuilder<FindFieldStructureRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>format</code> is set to <code>delimited</code>, you can specify the
	 * column names in a comma-separated list. If this parameter is not specified,
	 * the structure finder uses the column names from the header row of the text.
	 * If the text does not have a header row, columns are named
	 * &quot;column1&quot;, &quot;column2&quot;, &quot;column3&quot;, for example.
	 * <p>
	 * API name: {@code column_names}
	 */
	public final List<String> columnNames() {
		return this.columnNames;
	}

	/**
	 * If you have set <code>format</code> to <code>delimited</code>, you can
	 * specify the character used to delimit the values in each row. Only a single
	 * character is supported; the delimiter cannot have multiple characters. By
	 * default, the API considers the following possibilities: comma, tab,
	 * semi-colon, and pipe (<code>|</code>). In this default scenario, all rows
	 * must have the same number of fields for the delimited format to be detected.
	 * If you specify a delimiter, up to 10% of the rows can have a different number
	 * of columns than the first row.
	 * <p>
	 * API name: {@code delimiter}
	 */
	@Nullable
	public final String delimiter() {
		return this.delimiter;
	}

	/**
	 * The number of documents to include in the structural analysis. The minimum
	 * value is 2.
	 * <p>
	 * API name: {@code documents_to_sample}
	 */
	@Nullable
	public final Number documentsToSample() {
		return this.documentsToSample;
	}

	/**
	 * The mode of compatibility with ECS compliant Grok patterns. Use this
	 * parameter to specify whether to use ECS Grok patterns instead of legacy ones
	 * when the structure finder creates a Grok pattern. This setting primarily has
	 * an impact when a whole message Grok pattern such as
	 * <code>%{CATALINALOG}</code> matches the input. If the structure finder
	 * identifies a common structure but has no idea of the meaning then generic
	 * field names such as <code>path</code>, <code>ipaddress</code>,
	 * <code>field1</code>, and <code>field2</code> are used in the
	 * <code>grok_pattern</code> output. The intention in that situation is that a
	 * user who knows the meanings will rename the fields before using them.
	 * <p>
	 * API name: {@code ecs_compatibility}
	 */
	@Nullable
	public final EcsCompatibilityType ecsCompatibility() {
		return this.ecsCompatibility;
	}

	/**
	 * If <code>true</code>, the response includes a field named
	 * <code>explanation</code>, which is an array of strings that indicate how the
	 * structure finder produced its result.
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
	}

	/**
	 * Required - The field that should be analyzed.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * The high level structure of the text. By default, the API chooses the format.
	 * In this default scenario, all rows must have the same number of fields for a
	 * delimited format to be detected. If the format is set to delimited and the
	 * delimiter is not set, however, the API tolerates up to 5% of rows that have a
	 * different number of columns than the first row.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final FormatType format() {
		return this.format;
	}

	/**
	 * If the format is <code>semi_structured_text</code>, you can specify a Grok
	 * pattern that is used to extract fields from every message in the text. The
	 * name of the timestamp field in the Grok pattern must match what is specified
	 * in the <code>timestamp_field</code> parameter. If that parameter is not
	 * specified, the name of the timestamp field in the Grok pattern must match
	 * &quot;timestamp&quot;. If <code>grok_pattern</code> is not specified, the
	 * structure finder creates a Grok pattern.
	 * <p>
	 * API name: {@code grok_pattern}
	 */
	@Nullable
	public final String grokPattern() {
		return this.grokPattern;
	}

	/**
	 * Required - The name of the index that contains the analyzed field.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * If the format is <code>delimited</code>, you can specify the character used
	 * to quote the values in each row if they contain newlines or the delimiter
	 * character. Only a single character is supported. If this parameter is not
	 * specified, the default value is a double quote (<code>&quot;</code>). If your
	 * delimited text format does not use quoting, a workaround is to set this
	 * argument to a character that does not appear anywhere in the sample.
	 * <p>
	 * API name: {@code quote}
	 */
	@Nullable
	public final String quote() {
		return this.quote;
	}

	/**
	 * If the format is <code>delimited</code>, you can specify whether values
	 * between delimiters should have whitespace trimmed from them. If this
	 * parameter is not specified and the delimiter is pipe (<code>|</code>), the
	 * default value is true. Otherwise, the default value is <code>false</code>.
	 * <p>
	 * API name: {@code should_trim_fields}
	 */
	@Nullable
	public final Boolean shouldTrimFields() {
		return this.shouldTrimFields;
	}

	/**
	 * The maximum amount of time that the structure analysis can take. If the
	 * analysis is still running when the timeout expires, it will be stopped.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * The name of the field that contains the primary timestamp of each record in
	 * the text. In particular, if the text was ingested into an index, this is the
	 * field that would be used to populate the <code>@timestamp</code> field.
	 * <p>
	 * If the format is <code>semi_structured_text</code>, this field must match the
	 * name of the appropriate extraction in the <code>grok_pattern</code>.
	 * Therefore, for semi-structured text, it is best not to specify this parameter
	 * unless <code>grok_pattern</code> is also specified.
	 * <p>
	 * For structured text, if you specify this parameter, the field must exist
	 * within the text.
	 * <p>
	 * If this parameter is not specified, the structure finder makes a decision
	 * about which field (if any) is the primary timestamp field. For structured
	 * text, it is not compulsory to have a timestamp in the text.
	 * <p>
	 * API name: {@code timestamp_field}
	 */
	@Nullable
	public final String timestampField() {
		return this.timestampField;
	}

	/**
	 * The Java time format of the timestamp field in the text. Only a subset of
	 * Java time format letter groups are supported:
	 * <ul>
	 * <li><code>a</code></li>
	 * <li><code>d</code></li>
	 * <li><code>dd</code></li>
	 * <li><code>EEE</code></li>
	 * <li><code>EEEE</code></li>
	 * <li><code>H</code></li>
	 * <li><code>HH</code></li>
	 * <li><code>h</code></li>
	 * <li><code>M</code></li>
	 * <li><code>MM</code></li>
	 * <li><code>MMM</code></li>
	 * <li><code>MMMM</code></li>
	 * <li><code>mm</code></li>
	 * <li><code>ss</code></li>
	 * <li><code>XX</code></li>
	 * <li><code>XXX</code></li>
	 * <li><code>yy</code></li>
	 * <li><code>yyyy</code></li>
	 * <li><code>zzz</code></li>
	 * </ul>
	 * <p>
	 * Additionally <code>S</code> letter groups (fractional seconds) of length one
	 * to nine are supported providing they occur after <code>ss</code> and are
	 * separated from the <code>ss</code> by a period (<code>.</code>), comma
	 * (<code>,</code>), or colon (<code>:</code>). Spacing and punctuation is also
	 * permitted with the exception a question mark (<code>?</code>), newline, and
	 * carriage return, together with literal text enclosed in single quotes. For
	 * example, <code>MM/dd HH.mm.ss,SSSSSS 'in' yyyy</code> is a valid override
	 * format.
	 * <p>
	 * One valuable use case for this parameter is when the format is
	 * semi-structured text, there are multiple timestamp formats in the text, and
	 * you know which format corresponds to the primary timestamp, but you do not
	 * want to specify the full <code>grok_pattern</code>. Another is when the
	 * timestamp format is one that the structure finder does not consider by
	 * default.
	 * <p>
	 * If this parameter is not specified, the structure finder chooses the best
	 * format from a built-in set.
	 * <p>
	 * If the special value <code>null</code> is specified, the structure finder
	 * will not look for a primary timestamp in the text. When the format is
	 * semi-structured text, this will result in the structure finder treating the
	 * text as single-line messages.
	 * <p>
	 * API name: {@code timestamp_format}
	 */
	@Nullable
	public final String timestampFormat() {
		return this.timestampFormat;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FindFieldStructureRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FindFieldStructureRequest> {
		@Nullable
		private List<String> columnNames;

		@Nullable
		private String delimiter;

		@Nullable
		private Number documentsToSample;

		@Nullable
		private EcsCompatibilityType ecsCompatibility;

		@Nullable
		private Boolean explain;

		private String field;

		@Nullable
		private FormatType format;

		@Nullable
		private String grokPattern;

		private String index;

		@Nullable
		private String quote;

		@Nullable
		private Boolean shouldTrimFields;

		@Nullable
		private Time timeout;

		@Nullable
		private String timestampField;

		@Nullable
		private String timestampFormat;

		/**
		 * If <code>format</code> is set to <code>delimited</code>, you can specify the
		 * column names in a comma-separated list. If this parameter is not specified,
		 * the structure finder uses the column names from the header row of the text.
		 * If the text does not have a header row, columns are named
		 * &quot;column1&quot;, &quot;column2&quot;, &quot;column3&quot;, for example.
		 * <p>
		 * API name: {@code column_names}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>columnNames</code>.
		 */
		public final Builder columnNames(List<String> list) {
			this.columnNames = _listAddAll(this.columnNames, list);
			return this;
		}

		/**
		 * If <code>format</code> is set to <code>delimited</code>, you can specify the
		 * column names in a comma-separated list. If this parameter is not specified,
		 * the structure finder uses the column names from the header row of the text.
		 * If the text does not have a header row, columns are named
		 * &quot;column1&quot;, &quot;column2&quot;, &quot;column3&quot;, for example.
		 * <p>
		 * API name: {@code column_names}
		 * <p>
		 * Adds one or more values to <code>columnNames</code>.
		 */
		public final Builder columnNames(String value, String... values) {
			this.columnNames = _listAdd(this.columnNames, value, values);
			return this;
		}

		/**
		 * If you have set <code>format</code> to <code>delimited</code>, you can
		 * specify the character used to delimit the values in each row. Only a single
		 * character is supported; the delimiter cannot have multiple characters. By
		 * default, the API considers the following possibilities: comma, tab,
		 * semi-colon, and pipe (<code>|</code>). In this default scenario, all rows
		 * must have the same number of fields for the delimited format to be detected.
		 * If you specify a delimiter, up to 10% of the rows can have a different number
		 * of columns than the first row.
		 * <p>
		 * API name: {@code delimiter}
		 */
		public final Builder delimiter(@Nullable String value) {
			this.delimiter = value;
			return this;
		}

		/**
		 * The number of documents to include in the structural analysis. The minimum
		 * value is 2.
		 * <p>
		 * API name: {@code documents_to_sample}
		 */
		public final Builder documentsToSample(@Nullable Number value) {
			this.documentsToSample = value;
			return this;
		}

		/**
		 * The mode of compatibility with ECS compliant Grok patterns. Use this
		 * parameter to specify whether to use ECS Grok patterns instead of legacy ones
		 * when the structure finder creates a Grok pattern. This setting primarily has
		 * an impact when a whole message Grok pattern such as
		 * <code>%{CATALINALOG}</code> matches the input. If the structure finder
		 * identifies a common structure but has no idea of the meaning then generic
		 * field names such as <code>path</code>, <code>ipaddress</code>,
		 * <code>field1</code>, and <code>field2</code> are used in the
		 * <code>grok_pattern</code> output. The intention in that situation is that a
		 * user who knows the meanings will rename the fields before using them.
		 * <p>
		 * API name: {@code ecs_compatibility}
		 */
		public final Builder ecsCompatibility(@Nullable EcsCompatibilityType value) {
			this.ecsCompatibility = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes a field named
		 * <code>explanation</code>, which is an array of strings that indicate how the
		 * structure finder produced its result.
		 * <p>
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * Required - The field that should be analyzed.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * The high level structure of the text. By default, the API chooses the format.
		 * In this default scenario, all rows must have the same number of fields for a
		 * delimited format to be detected. If the format is set to delimited and the
		 * delimiter is not set, however, the API tolerates up to 5% of rows that have a
		 * different number of columns than the first row.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable FormatType value) {
			this.format = value;
			return this;
		}

		/**
		 * If the format is <code>semi_structured_text</code>, you can specify a Grok
		 * pattern that is used to extract fields from every message in the text. The
		 * name of the timestamp field in the Grok pattern must match what is specified
		 * in the <code>timestamp_field</code> parameter. If that parameter is not
		 * specified, the name of the timestamp field in the Grok pattern must match
		 * &quot;timestamp&quot;. If <code>grok_pattern</code> is not specified, the
		 * structure finder creates a Grok pattern.
		 * <p>
		 * API name: {@code grok_pattern}
		 */
		public final Builder grokPattern(@Nullable String value) {
			this.grokPattern = value;
			return this;
		}

		/**
		 * Required - The name of the index that contains the analyzed field.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * If the format is <code>delimited</code>, you can specify the character used
		 * to quote the values in each row if they contain newlines or the delimiter
		 * character. Only a single character is supported. If this parameter is not
		 * specified, the default value is a double quote (<code>&quot;</code>). If your
		 * delimited text format does not use quoting, a workaround is to set this
		 * argument to a character that does not appear anywhere in the sample.
		 * <p>
		 * API name: {@code quote}
		 */
		public final Builder quote(@Nullable String value) {
			this.quote = value;
			return this;
		}

		/**
		 * If the format is <code>delimited</code>, you can specify whether values
		 * between delimiters should have whitespace trimmed from them. If this
		 * parameter is not specified and the delimiter is pipe (<code>|</code>), the
		 * default value is true. Otherwise, the default value is <code>false</code>.
		 * <p>
		 * API name: {@code should_trim_fields}
		 */
		public final Builder shouldTrimFields(@Nullable Boolean value) {
			this.shouldTrimFields = value;
			return this;
		}

		/**
		 * The maximum amount of time that the structure analysis can take. If the
		 * analysis is still running when the timeout expires, it will be stopped.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The maximum amount of time that the structure analysis can take. If the
		 * analysis is still running when the timeout expires, it will be stopped.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The name of the field that contains the primary timestamp of each record in
		 * the text. In particular, if the text was ingested into an index, this is the
		 * field that would be used to populate the <code>@timestamp</code> field.
		 * <p>
		 * If the format is <code>semi_structured_text</code>, this field must match the
		 * name of the appropriate extraction in the <code>grok_pattern</code>.
		 * Therefore, for semi-structured text, it is best not to specify this parameter
		 * unless <code>grok_pattern</code> is also specified.
		 * <p>
		 * For structured text, if you specify this parameter, the field must exist
		 * within the text.
		 * <p>
		 * If this parameter is not specified, the structure finder makes a decision
		 * about which field (if any) is the primary timestamp field. For structured
		 * text, it is not compulsory to have a timestamp in the text.
		 * <p>
		 * API name: {@code timestamp_field}
		 */
		public final Builder timestampField(@Nullable String value) {
			this.timestampField = value;
			return this;
		}

		/**
		 * The Java time format of the timestamp field in the text. Only a subset of
		 * Java time format letter groups are supported:
		 * <ul>
		 * <li><code>a</code></li>
		 * <li><code>d</code></li>
		 * <li><code>dd</code></li>
		 * <li><code>EEE</code></li>
		 * <li><code>EEEE</code></li>
		 * <li><code>H</code></li>
		 * <li><code>HH</code></li>
		 * <li><code>h</code></li>
		 * <li><code>M</code></li>
		 * <li><code>MM</code></li>
		 * <li><code>MMM</code></li>
		 * <li><code>MMMM</code></li>
		 * <li><code>mm</code></li>
		 * <li><code>ss</code></li>
		 * <li><code>XX</code></li>
		 * <li><code>XXX</code></li>
		 * <li><code>yy</code></li>
		 * <li><code>yyyy</code></li>
		 * <li><code>zzz</code></li>
		 * </ul>
		 * <p>
		 * Additionally <code>S</code> letter groups (fractional seconds) of length one
		 * to nine are supported providing they occur after <code>ss</code> and are
		 * separated from the <code>ss</code> by a period (<code>.</code>), comma
		 * (<code>,</code>), or colon (<code>:</code>). Spacing and punctuation is also
		 * permitted with the exception a question mark (<code>?</code>), newline, and
		 * carriage return, together with literal text enclosed in single quotes. For
		 * example, <code>MM/dd HH.mm.ss,SSSSSS 'in' yyyy</code> is a valid override
		 * format.
		 * <p>
		 * One valuable use case for this parameter is when the format is
		 * semi-structured text, there are multiple timestamp formats in the text, and
		 * you know which format corresponds to the primary timestamp, but you do not
		 * want to specify the full <code>grok_pattern</code>. Another is when the
		 * timestamp format is one that the structure finder does not consider by
		 * default.
		 * <p>
		 * If this parameter is not specified, the structure finder chooses the best
		 * format from a built-in set.
		 * <p>
		 * If the special value <code>null</code> is specified, the structure finder
		 * will not look for a primary timestamp in the text. When the format is
		 * semi-structured text, this will result in the structure finder treating the
		 * text as single-line messages.
		 * <p>
		 * API name: {@code timestamp_format}
		 */
		public final Builder timestampFormat(@Nullable String value) {
			this.timestampFormat = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FindFieldStructureRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FindFieldStructureRequest build() {
			_checkSingleUse();

			return new FindFieldStructureRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code text_structure.find_field_structure}".
	 */
	public static final Endpoint<FindFieldStructureRequest, FindFieldStructureResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/text_structure.find_field_structure",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_text_structure/find_field_structure";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.explain != null) {
					params.put("explain", String.valueOf(request.explain));
				}
				if (request.format != null) {
					params.put("format", request.format.jsonValue());
				}
				params.put("index", request.index);
				if (request.timestampField != null) {
					params.put("timestamp_field", request.timestampField);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				if (request.timestampFormat != null) {
					params.put("timestamp_format", request.timestampFormat);
				}
				if (request.quote != null) {
					params.put("quote", request.quote);
				}
				if (request.shouldTrimFields != null) {
					params.put("should_trim_fields", String.valueOf(request.shouldTrimFields));
				}
				params.put("field", request.field);
				if (request.grokPattern != null) {
					params.put("grok_pattern", request.grokPattern);
				}
				if (request.delimiter != null) {
					params.put("delimiter", request.delimiter);
				}
				if (ApiTypeHelper.isDefined(request.columnNames)) {
					params.put("column_names",
							request.columnNames.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.documentsToSample != null) {
					params.put("documents_to_sample", request.documentsToSample.toString());
				}
				if (request.ecsCompatibility != null) {
					params.put("ecs_compatibility", request.ecsCompatibility.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, FindFieldStructureResponse._DESERIALIZER);
}
