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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ingest._types.CsvProcessor
@JsonpDeserializable
public final class CsvProcessor extends ProcessorBase implements ProcessorVariant {
	private final JsonData emptyValue;

	@Nullable
	private final String description;

	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	@Nullable
	private final String quote;

	@Nullable
	private final String separator;

	private final List<String> targetFields;

	private final Boolean trim;

	// ---------------------------------------------------------------------------------------------

	public CsvProcessor(Builder builder) {
		super(builder);

		this.emptyValue = Objects.requireNonNull(builder.emptyValue, "empty_value");
		this.description = builder.description;
		this.field = Objects.requireNonNull(builder.field, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.quote = builder.quote;
		this.separator = builder.separator;
		this.targetFields = Objects.requireNonNull(builder.targetFields, "target_fields");
		this.trim = Objects.requireNonNull(builder.trim, "trim");

	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "csv";
	}

	/**
	 * API name: {@code empty_value}
	 */
	public JsonData emptyValue() {
		return this.emptyValue;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * API name: {@code quote}
	 */
	@Nullable
	public String quote() {
		return this.quote;
	}

	/**
	 * API name: {@code separator}
	 */
	@Nullable
	public String separator() {
		return this.separator;
	}

	/**
	 * API name: {@code target_fields}
	 */
	public List<String> targetFields() {
		return this.targetFields;
	}

	/**
	 * API name: {@code trim}
	 */
	public Boolean trim() {
		return this.trim;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("empty_value");
		this.emptyValue.serialize(generator, mapper);

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

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

		generator.writeKey("target_fields");
		generator.writeStartArray();
		for (String item0 : this.targetFields) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("trim");
		generator.write(this.trim);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CsvProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<CsvProcessor> {
		private JsonData emptyValue;

		@Nullable
		private String description;

		private String field;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private String quote;

		@Nullable
		private String separator;

		private List<String> targetFields;

		private Boolean trim;

		/**
		 * API name: {@code empty_value}
		 */
		public Builder emptyValue(JsonData value) {
			this.emptyValue = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * API name: {@code quote}
		 */
		public Builder quote(@Nullable String value) {
			this.quote = value;
			return this;
		}

		/**
		 * API name: {@code separator}
		 */
		public Builder separator(@Nullable String value) {
			this.separator = value;
			return this;
		}

		/**
		 * API name: {@code target_fields}
		 */
		public Builder targetFields(List<String> value) {
			this.targetFields = value;
			return this;
		}

		/**
		 * API name: {@code target_fields}
		 */
		public Builder targetFields(String... value) {
			this.targetFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #targetFields(List)}, creating the list if needed.
		 */
		public Builder addTargetFields(String value) {
			if (this.targetFields == null) {
				this.targetFields = new ArrayList<>();
			}
			this.targetFields.add(value);
			return this;
		}

		/**
		 * API name: {@code trim}
		 */
		public Builder trim(Boolean value) {
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

			return new CsvProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CsvProcessor}
	 */
	public static final JsonpDeserializer<CsvProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CsvProcessor::setupCsvProcessorDeserializer, Builder::build);

	protected static void setupCsvProcessorDeserializer(DelegatingDeserializer<CsvProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::emptyValue, JsonData._DESERIALIZER, "empty_value");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::quote, JsonpDeserializer.stringDeserializer(), "quote");
		op.add(Builder::separator, JsonpDeserializer.stringDeserializer(), "separator");
		op.add(Builder::targetFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"target_fields");
		op.add(Builder::trim, JsonpDeserializer.booleanDeserializer(), "trim");

	}

}
