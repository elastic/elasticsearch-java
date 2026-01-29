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

// typedef: ingest._types.RegisteredDomainProcessor

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.RegisteredDomainProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class RegisteredDomainProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final String targetField;

	@Nullable
	private final Boolean ignoreMissing;

	// ---------------------------------------------------------------------------------------------

	private RegisteredDomainProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.targetField = builder.targetField;
		this.ignoreMissing = builder.ignoreMissing;

	}

	public static RegisteredDomainProcessor of(Function<Builder, ObjectBuilder<RegisteredDomainProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.RegisteredDomain;
	}

	/**
	 * Required - Field containing the source FQDN.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Object field containing extracted domain components. If an empty string, the
	 * processor adds components to the document’s root.
	 * <p>
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * If true and any required fields are missing, the processor quietly exits
	 * without modifying the document.
	 * <p>
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RegisteredDomainProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RegisteredDomainProcessor> {
		private String field;

		@Nullable
		private String targetField;

		@Nullable
		private Boolean ignoreMissing;

		public Builder() {
		}
		private Builder(RegisteredDomainProcessor instance) {
			this.field = instance.field;
			this.targetField = instance.targetField;
			this.ignoreMissing = instance.ignoreMissing;

		}
		/**
		 * Required - Field containing the source FQDN.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Object field containing extracted domain components. If an empty string, the
		 * processor adds components to the document’s root.
		 * <p>
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * If true and any required fields are missing, the processor quietly exits
		 * without modifying the document.
		 * <p>
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RegisteredDomainProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RegisteredDomainProcessor build() {
			_checkSingleUse();

			return new RegisteredDomainProcessor(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RegisteredDomainProcessor}
	 */
	public static final JsonpDeserializer<RegisteredDomainProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RegisteredDomainProcessor::setupRegisteredDomainProcessorDeserializer);

	protected static void setupRegisteredDomainProcessorDeserializer(
			ObjectDeserializer<RegisteredDomainProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");

	}

}
