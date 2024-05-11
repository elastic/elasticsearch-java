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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: ingest._types.DateProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.DateProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final List<String> formats;

	@Nullable
	private final String locale;

	@Nullable
	private final String targetField;

	@Nullable
	private final String timezone;

	// ---------------------------------------------------------------------------------------------

	private DateProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.formats = ApiTypeHelper.unmodifiableRequired(builder.formats, this, "formats");
		this.locale = builder.locale;
		this.targetField = builder.targetField;
		this.timezone = builder.timezone;

	}

	public static DateProcessor of(Function<Builder, ObjectBuilder<DateProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Date;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code formats}
	 */
	public final List<String> formats() {
		return this.formats;
	}

	/**
	 * API name: {@code locale}
	 */
	@Nullable
	public final String locale() {
		return this.locale;
	}

	/**
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * API name: {@code timezone}
	 */
	@Nullable
	public final String timezone() {
		return this.timezone;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (ApiTypeHelper.isDefined(this.formats)) {
			generator.writeKey("formats");
			generator.writeStartArray();
			for (String item0 : this.formats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.locale != null) {
			generator.writeKey("locale");
			generator.write(this.locale);

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.timezone != null) {
			generator.writeKey("timezone");
			generator.write(this.timezone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<DateProcessor> {
		private String field;

		private List<String> formats;

		@Nullable
		private String locale;

		@Nullable
		private String targetField;

		@Nullable
		private String timezone;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code formats}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>formats</code>.
		 */
		public final Builder formats(List<String> list) {
			this.formats = _listAddAll(this.formats, list);
			return this;
		}

		/**
		 * Required - API name: {@code formats}
		 * <p>
		 * Adds one or more values to <code>formats</code>.
		 */
		public final Builder formats(String value, String... values) {
			this.formats = _listAdd(this.formats, value, values);
			return this;
		}

		/**
		 * API name: {@code locale}
		 */
		public final Builder locale(@Nullable String value) {
			this.locale = value;
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * API name: {@code timezone}
		 */
		public final Builder timezone(@Nullable String value) {
			this.timezone = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateProcessor build() {
			_checkSingleUse();

			return new DateProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateProcessor}
	 */
	public static final JsonpDeserializer<DateProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DateProcessor::setupDateProcessorDeserializer);

	protected static void setupDateProcessorDeserializer(ObjectDeserializer<DateProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::formats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"formats");
		op.add(Builder::locale, JsonpDeserializer.stringDeserializer(), "locale");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::timezone, JsonpDeserializer.stringDeserializer(), "timezone");

	}

}
