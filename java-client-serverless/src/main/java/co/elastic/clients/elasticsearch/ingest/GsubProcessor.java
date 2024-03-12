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

// typedef: ingest._types.GsubProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.GsubProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class GsubProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	private final String pattern;

	private final String replacement;

	@Nullable
	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	private GsubProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.pattern = ApiTypeHelper.requireNonNull(builder.pattern, this, "pattern");
		this.replacement = ApiTypeHelper.requireNonNull(builder.replacement, this, "replacement");
		this.targetField = builder.targetField;

	}

	public static GsubProcessor of(Function<Builder, ObjectBuilder<GsubProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Gsub;
	}

	/**
	 * Required - The field to apply the replacement to.
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
	 * Required - The pattern to be replaced.
	 * <p>
	 * API name: {@code pattern}
	 */
	public final String pattern() {
		return this.pattern;
	}

	/**
	 * Required - The string to replace the matching patterns with.
	 * <p>
	 * API name: {@code replacement}
	 */
	public final String replacement() {
		return this.replacement;
	}

	/**
	 * The field to assign the converted value to By default, the <code>field</code>
	 * is updated in-place.
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
		generator.writeKey("pattern");
		generator.write(this.pattern);

		generator.writeKey("replacement");
		generator.write(this.replacement);

		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GsubProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<GsubProcessor> {
		private String field;

		@Nullable
		private Boolean ignoreMissing;

		private String pattern;

		private String replacement;

		@Nullable
		private String targetField;

		/**
		 * Required - The field to apply the replacement to.
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
		 * Required - The pattern to be replaced.
		 * <p>
		 * API name: {@code pattern}
		 */
		public final Builder pattern(String value) {
			this.pattern = value;
			return this;
		}

		/**
		 * Required - The string to replace the matching patterns with.
		 * <p>
		 * API name: {@code replacement}
		 */
		public final Builder replacement(String value) {
			this.replacement = value;
			return this;
		}

		/**
		 * The field to assign the converted value to By default, the <code>field</code>
		 * is updated in-place.
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
		 * Builds a {@link GsubProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GsubProcessor build() {
			_checkSingleUse();

			return new GsubProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GsubProcessor}
	 */
	public static final JsonpDeserializer<GsubProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GsubProcessor::setupGsubProcessorDeserializer);

	protected static void setupGsubProcessorDeserializer(ObjectDeserializer<GsubProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");
		op.add(Builder::replacement, JsonpDeserializer.stringDeserializer(), "replacement");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
