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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ingest._types.DateIndexNameProcessor
public final class DateIndexNameProcessor extends ProcessorBase {
	private final List<String> dateFormats;

	private final JsonValue dateRounding;

	private final String field;

	private final String indexNameFormat;

	private final String indexNamePrefix;

	private final String locale;

	private final String timezone;

	// ---------------------------------------------------------------------------------------------

	public DateIndexNameProcessor(Builder builder) {
		super(builder);

		this.dateFormats = Objects.requireNonNull(builder.dateFormats, "date_formats");
		this.dateRounding = Objects.requireNonNull(builder.dateRounding, "date_rounding");
		this.field = Objects.requireNonNull(builder.field, "field");
		this.indexNameFormat = Objects.requireNonNull(builder.indexNameFormat, "index_name_format");
		this.indexNamePrefix = Objects.requireNonNull(builder.indexNamePrefix, "index_name_prefix");
		this.locale = Objects.requireNonNull(builder.locale, "locale");
		this.timezone = Objects.requireNonNull(builder.timezone, "timezone");

	}

	/**
	 * API name: {@code date_formats}
	 */
	public List<String> dateFormats() {
		return this.dateFormats;
	}

	/**
	 * API name: {@code date_rounding}
	 */
	public JsonValue dateRounding() {
		return this.dateRounding;
	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code index_name_format}
	 */
	public String indexNameFormat() {
		return this.indexNameFormat;
	}

	/**
	 * API name: {@code index_name_prefix}
	 */
	public String indexNamePrefix() {
		return this.indexNamePrefix;
	}

	/**
	 * API name: {@code locale}
	 */
	public String locale() {
		return this.locale;
	}

	/**
	 * API name: {@code timezone}
	 */
	public String timezone() {
		return this.timezone;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("date_formats");
		generator.writeStartArray();
		for (String item0 : this.dateFormats) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("date_rounding");
		generator.write(this.dateRounding);

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("index_name_format");
		generator.write(this.indexNameFormat);

		generator.writeKey("index_name_prefix");
		generator.write(this.indexNamePrefix);

		generator.writeKey("locale");
		generator.write(this.locale);

		generator.writeKey("timezone");
		generator.write(this.timezone);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateIndexNameProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DateIndexNameProcessor> {
		private List<String> dateFormats;

		private JsonValue dateRounding;

		private String field;

		private String indexNameFormat;

		private String indexNamePrefix;

		private String locale;

		private String timezone;

		/**
		 * API name: {@code date_formats}
		 */
		public Builder dateFormats(List<String> value) {
			this.dateFormats = value;
			return this;
		}

		/**
		 * API name: {@code date_formats}
		 */
		public Builder dateFormats(String... value) {
			this.dateFormats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dateFormats(List)}, creating the list if needed.
		 */
		public Builder addDateFormats(String value) {
			if (this.dateFormats == null) {
				this.dateFormats = new ArrayList<>();
			}
			this.dateFormats.add(value);
			return this;
		}

		/**
		 * API name: {@code date_rounding}
		 */
		public Builder dateRounding(JsonValue value) {
			this.dateRounding = value;
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
		 * API name: {@code index_name_format}
		 */
		public Builder indexNameFormat(String value) {
			this.indexNameFormat = value;
			return this;
		}

		/**
		 * API name: {@code index_name_prefix}
		 */
		public Builder indexNamePrefix(String value) {
			this.indexNamePrefix = value;
			return this;
		}

		/**
		 * API name: {@code locale}
		 */
		public Builder locale(String value) {
			this.locale = value;
			return this;
		}

		/**
		 * API name: {@code timezone}
		 */
		public Builder timezone(String value) {
			this.timezone = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateIndexNameProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateIndexNameProcessor build() {

			return new DateIndexNameProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateIndexNameProcessor}
	 */
	public static final JsonpDeserializer<DateIndexNameProcessor> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DateIndexNameProcessor::setupDateIndexNameProcessorDeserializer);

	protected static void setupDateIndexNameProcessorDeserializer(
			DelegatingDeserializer<DateIndexNameProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::dateFormats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"date_formats");
		op.add(Builder::dateRounding, JsonpDeserializer.jsonValueDeserializer(), "date_rounding");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::indexNameFormat, JsonpDeserializer.stringDeserializer(), "index_name_format");
		op.add(Builder::indexNamePrefix, JsonpDeserializer.stringDeserializer(), "index_name_prefix");
		op.add(Builder::locale, JsonpDeserializer.stringDeserializer(), "locale");
		op.add(Builder::timezone, JsonpDeserializer.stringDeserializer(), "timezone");

	}

}
