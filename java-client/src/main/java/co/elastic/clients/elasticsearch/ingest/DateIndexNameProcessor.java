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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.DateIndexNameProcessor
@JsonpDeserializable
public class DateIndexNameProcessor extends ProcessorBase implements ProcessorVariant {
	private final List<String> dateFormats;

	private final DateRounding dateRounding;

	private final String field;

	private final String indexNameFormat;

	private final String indexNamePrefix;

	private final String locale;

	private final String timezone;

	// ---------------------------------------------------------------------------------------------

	private DateIndexNameProcessor(Builder builder) {
		super(builder);

		this.dateFormats = ModelTypeHelper.unmodifiableRequired(builder.dateFormats, this, "dateFormats");
		this.dateRounding = ModelTypeHelper.requireNonNull(builder.dateRounding, this, "dateRounding");
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.indexNameFormat = ModelTypeHelper.requireNonNull(builder.indexNameFormat, this, "indexNameFormat");
		this.indexNamePrefix = ModelTypeHelper.requireNonNull(builder.indexNamePrefix, this, "indexNamePrefix");
		this.locale = ModelTypeHelper.requireNonNull(builder.locale, this, "locale");
		this.timezone = ModelTypeHelper.requireNonNull(builder.timezone, this, "timezone");

	}

	public static DateIndexNameProcessor of(Function<Builder, ObjectBuilder<DateIndexNameProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "date_index_name";
	}

	/**
	 * Required - API name: {@code date_formats}
	 */
	public final List<String> dateFormats() {
		return this.dateFormats;
	}

	/**
	 * Required - API name: {@code date_rounding}
	 */
	public final DateRounding dateRounding() {
		return this.dateRounding;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code index_name_format}
	 */
	public final String indexNameFormat() {
		return this.indexNameFormat;
	}

	/**
	 * Required - API name: {@code index_name_prefix}
	 */
	public final String indexNamePrefix() {
		return this.indexNamePrefix;
	}

	/**
	 * Required - API name: {@code locale}
	 */
	public final String locale() {
		return this.locale;
	}

	/**
	 * Required - API name: {@code timezone}
	 */
	public final String timezone() {
		return this.timezone;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.dateFormats)) {
			generator.writeKey("date_formats");
			generator.writeStartArray();
			for (String item0 : this.dateFormats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("date_rounding");
		this.dateRounding.serialize(generator, mapper);
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

		private DateRounding dateRounding;

		private String field;

		private String indexNameFormat;

		private String indexNamePrefix;

		private String locale;

		private String timezone;

		/**
		 * Required - API name: {@code date_formats}
		 */
		public final Builder dateFormats(List<String> value) {
			this.dateFormats = value;
			return this;
		}

		/**
		 * Required - API name: {@code date_formats}
		 */
		public final Builder dateFormats(String... value) {
			this.dateFormats = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code date_rounding}
		 */
		public final Builder dateRounding(DateRounding value) {
			this.dateRounding = value;
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_name_format}
		 */
		public final Builder indexNameFormat(String value) {
			this.indexNameFormat = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_name_prefix}
		 */
		public final Builder indexNamePrefix(String value) {
			this.indexNamePrefix = value;
			return this;
		}

		/**
		 * Required - API name: {@code locale}
		 */
		public final Builder locale(String value) {
			this.locale = value;
			return this;
		}

		/**
		 * Required - API name: {@code timezone}
		 */
		public final Builder timezone(String value) {
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
			_checkSingleUse();

			return new DateIndexNameProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateIndexNameProcessor}
	 */
	public static final JsonpDeserializer<DateIndexNameProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateIndexNameProcessor::setupDateIndexNameProcessorDeserializer, Builder::build);

	protected static void setupDateIndexNameProcessorDeserializer(
			DelegatingDeserializer<DateIndexNameProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::dateFormats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"date_formats");
		op.add(Builder::dateRounding, DateRounding._DESERIALIZER, "date_rounding");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::indexNameFormat, JsonpDeserializer.stringDeserializer(), "index_name_format");
		op.add(Builder::indexNamePrefix, JsonpDeserializer.stringDeserializer(), "index_name_prefix");
		op.add(Builder::locale, JsonpDeserializer.stringDeserializer(), "locale");
		op.add(Builder::timezone, JsonpDeserializer.stringDeserializer(), "timezone");

	}

}
