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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
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

// typedef: ingest._types.CsvProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.CsvProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class CsvProcessor extends ProcessorBase implements ProcessorVariant {
	@Nullable
	private final JsonData emptyValue;

	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	@Nullable
	private final String quote;

	@Nullable
	private final String separator;

	private final List<String> targetFields;

	@Nullable
	private final Boolean trim;

	// ---------------------------------------------------------------------------------------------

	private CsvProcessor(Builder builder) {
		super(builder);

		this.emptyValue = builder.emptyValue;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.quote = builder.quote;
		this.separator = builder.separator;
		this.targetFields = ApiTypeHelper.unmodifiableRequired(builder.targetFields, this, "targetFields");
		this.trim = builder.trim;

	}

	public static CsvProcessor of(Function<Builder, ObjectBuilder<CsvProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Csv;
	}

	/**
	 * Value used to fill empty fields. Empty fields are skipped if this is not
	 * provided. An empty field is one with no value (2 consecutive separators) or
	 * empty quotes (<code>&quot;&quot;</code>).
	 * <p>
	 * API name: {@code empty_value}
	 */
	@Nullable
	public final JsonData emptyValue() {
		return this.emptyValue;
	}

	/**
	 * Required - The field to extract data from.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * If <code>true</code> and <code>field</code> does not exist, the processor
	 * quietly exits without modifying the document.
	 * <p>
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * Quote used in CSV, has to be single character string.
	 * <p>
	 * API name: {@code quote}
	 */
	@Nullable
	public final String quote() {
		return this.quote;
	}

	/**
	 * Separator used in CSV, has to be single character string.
	 * <p>
	 * API name: {@code separator}
	 */
	@Nullable
	public final String separator() {
		return this.separator;
	}

	/**
	 * Required - The array of fields to assign extracted values to.
	 * <p>
	 * API name: {@code target_fields}
	 */
	public final List<String> targetFields() {
		return this.targetFields;
	}

	/**
	 * Trim whitespaces in unquoted fields.
	 * <p>
	 * API name: {@code trim}
	 */
	@Nullable
	public final Boolean trim() {
		return this.trim;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.emptyValue != null) {
			generator.writeKey("empty_value");
			this.emptyValue.serialize(generator, mapper);

		}
		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		if (this.quote != null) {
			generator.writeKey("quote");
			generator.write(this.quote);

		}
		if (this.separator != null) {
			generator.writeKey("separator");
			generator.write(this.separator);

		}
		if (ApiTypeHelper.isDefined(this.targetFields)) {
			generator.writeKey("target_fields");
			generator.writeStartArray();
			for (String item0 : this.targetFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.trim != null) {
			generator.writeKey("trim");
			generator.write(this.trim);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CsvProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<CsvProcessor> {
		@Nullable
		private JsonData emptyValue;

		private String field;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private String quote;

		@Nullable
		private String separator;

		private List<String> targetFields;

		@Nullable
		private Boolean trim;

		/**
		 * Value used to fill empty fields. Empty fields are skipped if this is not
		 * provided. An empty field is one with no value (2 consecutive separators) or
		 * empty quotes (<code>&quot;&quot;</code>).
		 * <p>
		 * API name: {@code empty_value}
		 */
		public final Builder emptyValue(@Nullable JsonData value) {
			this.emptyValue = value;
			return this;
		}

		/**
		 * Required - The field to extract data from.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * If <code>true</code> and <code>field</code> does not exist, the processor
		 * quietly exits without modifying the document.
		 * <p>
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * Quote used in CSV, has to be single character string.
		 * <p>
		 * API name: {@code quote}
		 */
		public final Builder quote(@Nullable String value) {
			this.quote = value;
			return this;
		}

		/**
		 * Separator used in CSV, has to be single character string.
		 * <p>
		 * API name: {@code separator}
		 */
		public final Builder separator(@Nullable String value) {
			this.separator = value;
			return this;
		}

		/**
		 * Required - The array of fields to assign extracted values to.
		 * <p>
		 * API name: {@code target_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>targetFields</code>.
		 */
		public final Builder targetFields(List<String> list) {
			this.targetFields = _listAddAll(this.targetFields, list);
			return this;
		}

		/**
		 * Required - The array of fields to assign extracted values to.
		 * <p>
		 * API name: {@code target_fields}
		 * <p>
		 * Adds one or more values to <code>targetFields</code>.
		 */
		public final Builder targetFields(String value, String... values) {
			this.targetFields = _listAdd(this.targetFields, value, values);
			return this;
		}

		/**
		 * Trim whitespaces in unquoted fields.
		 * <p>
		 * API name: {@code trim}
		 */
		public final Builder trim(@Nullable Boolean value) {
			this.trim = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CsvProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CsvProcessor build() {
			_checkSingleUse();

			return new CsvProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CsvProcessor}
	 */
	public static final JsonpDeserializer<CsvProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CsvProcessor::setupCsvProcessorDeserializer);

	protected static void setupCsvProcessorDeserializer(ObjectDeserializer<CsvProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::emptyValue, JsonData._DESERIALIZER, "empty_value");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::quote, JsonpDeserializer.stringDeserializer(), "quote");
		op.add(Builder::separator, JsonpDeserializer.stringDeserializer(), "separator");
		op.add(Builder::targetFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"target_fields");
		op.add(Builder::trim, JsonpDeserializer.booleanDeserializer(), "trim");

	}

}
