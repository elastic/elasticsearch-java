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

// typedef: ingest._types.DotExpanderProcessor

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.DotExpanderProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class DotExpanderProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final Boolean override;

	@Nullable
	private final String path;

	// ---------------------------------------------------------------------------------------------

	private DotExpanderProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.override = builder.override;
		this.path = builder.path;

	}

	public static DotExpanderProcessor of(Function<Builder, ObjectBuilder<DotExpanderProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.DotExpander;
	}

	/**
	 * Required - The field to expand into an object field. If set to
	 * <code>*</code>, all top-level fields will be expanded.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Controls the behavior when there is already an existing nested object that
	 * conflicts with the expanded field. When <code>false</code>, the processor
	 * will merge conflicts by combining the old and the new values into an array.
	 * When <code>true</code>, the value from the expanded field will overwrite the
	 * existing value.
	 * <p>
	 * API name: {@code override}
	 */
	@Nullable
	public final Boolean override() {
		return this.override;
	}

	/**
	 * The field that contains the field to expand. Only required if the field to
	 * expand is part another object field, because the <code>field</code> option
	 * can only understand leaf fields.
	 * <p>
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.override != null) {
			generator.writeKey("override");
			generator.write(this.override);

		}
		if (this.path != null) {
			generator.writeKey("path");
			generator.write(this.path);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DotExpanderProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DotExpanderProcessor> {
		private String field;

		@Nullable
		private Boolean override;

		@Nullable
		private String path;

		/**
		 * Required - The field to expand into an object field. If set to
		 * <code>*</code>, all top-level fields will be expanded.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Controls the behavior when there is already an existing nested object that
		 * conflicts with the expanded field. When <code>false</code>, the processor
		 * will merge conflicts by combining the old and the new values into an array.
		 * When <code>true</code>, the value from the expanded field will overwrite the
		 * existing value.
		 * <p>
		 * API name: {@code override}
		 */
		public final Builder override(@Nullable Boolean value) {
			this.override = value;
			return this;
		}

		/**
		 * The field that contains the field to expand. Only required if the field to
		 * expand is part another object field, because the <code>field</code> option
		 * can only understand leaf fields.
		 * <p>
		 * API name: {@code path}
		 */
		public final Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DotExpanderProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DotExpanderProcessor build() {
			_checkSingleUse();

			return new DotExpanderProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DotExpanderProcessor}
	 */
	public static final JsonpDeserializer<DotExpanderProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DotExpanderProcessor::setupDotExpanderProcessorDeserializer);

	protected static void setupDotExpanderProcessorDeserializer(ObjectDeserializer<DotExpanderProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::override, JsonpDeserializer.booleanDeserializer(), "override");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");

	}

}
