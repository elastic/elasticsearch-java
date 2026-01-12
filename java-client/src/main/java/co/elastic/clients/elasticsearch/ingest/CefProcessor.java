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
import java.lang.Boolean;
import java.lang.String;
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

// typedef: ingest._types.CefProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.CefProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class CefProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	@Nullable
	private final String targetField;

	@Nullable
	private final Boolean ignoreEmptyValues;

	@Nullable
	private final String timezone;

	// ---------------------------------------------------------------------------------------------

	private CefProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.targetField = builder.targetField;
		this.ignoreEmptyValues = builder.ignoreEmptyValues;
		this.timezone = builder.timezone;

	}

	public static CefProcessor of(Function<Builder, ObjectBuilder<CefProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Cef;
	}

	/**
	 * Required - The field containing the CEF message.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * If <code>true</code> and <code>field</code> does not exist or is
	 * <code>null</code>, the processor quietly exits without modifying the
	 * document.
	 * <p>
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * The field to assign the converted value to. By default, the
	 * <code>target_field</code> is 'cef'
	 * <p>
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * If <code>true</code> and value is anempty string in extensions, the processor
	 * quietly exits without modifying the document.
	 * <p>
	 * API name: {@code ignore_empty_values}
	 */
	@Nullable
	public final Boolean ignoreEmptyValues() {
		return this.ignoreEmptyValues;
	}

	/**
	 * The timezone to use when parsing the date and when date math index supports
	 * resolves expressions into concrete index names.
	 * <p>
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

		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.ignoreEmptyValues != null) {
			generator.writeKey("ignore_empty_values");
			generator.write(this.ignoreEmptyValues);

		}
		if (this.timezone != null) {
			generator.writeKey("timezone");
			generator.write(this.timezone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CefProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<CefProcessor> {
		private String field;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private String targetField;

		@Nullable
		private Boolean ignoreEmptyValues;

		@Nullable
		private String timezone;

		/**
		 * Required - The field containing the CEF message.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * If <code>true</code> and <code>field</code> does not exist or is
		 * <code>null</code>, the processor quietly exits without modifying the
		 * document.
		 * <p>
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * The field to assign the converted value to. By default, the
		 * <code>target_field</code> is 'cef'
		 * <p>
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * If <code>true</code> and value is anempty string in extensions, the processor
		 * quietly exits without modifying the document.
		 * <p>
		 * API name: {@code ignore_empty_values}
		 */
		public final Builder ignoreEmptyValues(@Nullable Boolean value) {
			this.ignoreEmptyValues = value;
			return this;
		}

		/**
		 * The timezone to use when parsing the date and when date math index supports
		 * resolves expressions into concrete index names.
		 * <p>
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
		 * Builds a {@link CefProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CefProcessor build() {
			_checkSingleUse();

			return new CefProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CefProcessor}
	 */
	public static final JsonpDeserializer<CefProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CefProcessor::setupCefProcessorDeserializer);

	protected static void setupCefProcessorDeserializer(ObjectDeserializer<CefProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::ignoreEmptyValues, JsonpDeserializer.booleanDeserializer(), "ignore_empty_values");
		op.add(Builder::timezone, JsonpDeserializer.stringDeserializer(), "timezone");

	}

}
