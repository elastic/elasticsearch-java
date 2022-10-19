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

// typedef: ingest._types.DissectProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.DissectProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class DissectProcessor extends ProcessorBase implements ProcessorVariant {
	@Nullable
	private final String appendSeparator;

	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	private final String pattern;

	// ---------------------------------------------------------------------------------------------

	private DissectProcessor(Builder builder) {
		super(builder);

		this.appendSeparator = builder.appendSeparator;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.pattern = ApiTypeHelper.requireNonNull(builder.pattern, this, "pattern");

	}

	public static DissectProcessor of(Function<Builder, ObjectBuilder<DissectProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Dissect;
	}

	/**
	 * API name: {@code append_separator}
	 */
	@Nullable
	public final String appendSeparator() {
		return this.appendSeparator;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * Required - API name: {@code pattern}
	 */
	public final String pattern() {
		return this.pattern;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.appendSeparator != null) {
			generator.writeKey("append_separator");
			generator.write(this.appendSeparator);

		}
		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		generator.writeKey("pattern");
		generator.write(this.pattern);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DissectProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DissectProcessor> {
		@Nullable
		private String appendSeparator;

		private String field;

		@Nullable
		private Boolean ignoreMissing;

		private String pattern;

		/**
		 * API name: {@code append_separator}
		 */
		public final Builder appendSeparator(@Nullable String value) {
			this.appendSeparator = value;
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
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * Required - API name: {@code pattern}
		 */
		public final Builder pattern(String value) {
			this.pattern = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DissectProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DissectProcessor build() {
			_checkSingleUse();

			return new DissectProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DissectProcessor}
	 */
	public static final JsonpDeserializer<DissectProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DissectProcessor::setupDissectProcessorDeserializer);

	protected static void setupDissectProcessorDeserializer(ObjectDeserializer<DissectProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::appendSeparator, JsonpDeserializer.stringDeserializer(), "append_separator");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");

	}

}
