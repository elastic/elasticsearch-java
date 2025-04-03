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

// typedef: ingest._types.UriPartsProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.UriPartsProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class UriPartsProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	@Nullable
	private final Boolean keepOriginal;

	@Nullable
	private final Boolean removeIfSuccessful;

	@Nullable
	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	private UriPartsProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.keepOriginal = builder.keepOriginal;
		this.removeIfSuccessful = builder.removeIfSuccessful;
		this.targetField = builder.targetField;

	}

	public static UriPartsProcessor of(Function<Builder, ObjectBuilder<UriPartsProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.UriParts;
	}

	/**
	 * Required - Field containing the URI string.
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
	 * If <code>true</code>, the processor copies the unparsed URI to
	 * <code>&lt;target_field&gt;.original</code>.
	 * <p>
	 * API name: {@code keep_original}
	 */
	@Nullable
	public final Boolean keepOriginal() {
		return this.keepOriginal;
	}

	/**
	 * If <code>true</code>, the processor removes the <code>field</code> after
	 * parsing the URI string. If parsing fails, the processor does not remove the
	 * <code>field</code>.
	 * <p>
	 * API name: {@code remove_if_successful}
	 */
	@Nullable
	public final Boolean removeIfSuccessful() {
		return this.removeIfSuccessful;
	}

	/**
	 * Output field for the URI object.
	 * <p>
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		if (this.keepOriginal != null) {
			generator.writeKey("keep_original");
			generator.write(this.keepOriginal);

		}
		if (this.removeIfSuccessful != null) {
			generator.writeKey("remove_if_successful");
			generator.write(this.removeIfSuccessful);

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UriPartsProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UriPartsProcessor> {
		private String field;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private Boolean keepOriginal;

		@Nullable
		private Boolean removeIfSuccessful;

		@Nullable
		private String targetField;

		/**
		 * Required - Field containing the URI string.
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
		 * If <code>true</code>, the processor copies the unparsed URI to
		 * <code>&lt;target_field&gt;.original</code>.
		 * <p>
		 * API name: {@code keep_original}
		 */
		public final Builder keepOriginal(@Nullable Boolean value) {
			this.keepOriginal = value;
			return this;
		}

		/**
		 * If <code>true</code>, the processor removes the <code>field</code> after
		 * parsing the URI string. If parsing fails, the processor does not remove the
		 * <code>field</code>.
		 * <p>
		 * API name: {@code remove_if_successful}
		 */
		public final Builder removeIfSuccessful(@Nullable Boolean value) {
			this.removeIfSuccessful = value;
			return this;
		}

		/**
		 * Output field for the URI object.
		 * <p>
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UriPartsProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UriPartsProcessor build() {
			_checkSingleUse();

			return new UriPartsProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UriPartsProcessor}
	 */
	public static final JsonpDeserializer<UriPartsProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UriPartsProcessor::setupUriPartsProcessorDeserializer);

	protected static void setupUriPartsProcessorDeserializer(ObjectDeserializer<UriPartsProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::keepOriginal, JsonpDeserializer.booleanDeserializer(), "keep_original");
		op.add(Builder::removeIfSuccessful, JsonpDeserializer.booleanDeserializer(), "remove_if_successful");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
