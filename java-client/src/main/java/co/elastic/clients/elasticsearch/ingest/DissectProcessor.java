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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.DissectProcessor
@JsonpDeserializable
public final class DissectProcessor extends ProcessorBase implements ProcessorVariant {
	private final String appendSeparator;

	private final String field;

	private final boolean ignoreMissing;

	private final String pattern;

	// ---------------------------------------------------------------------------------------------

	public DissectProcessor(Builder builder) {
		super(builder);

		this.appendSeparator = Objects.requireNonNull(builder.appendSeparator, "append_separator");
		this.field = Objects.requireNonNull(builder.field, "field");
		this.ignoreMissing = Objects.requireNonNull(builder.ignoreMissing, "ignore_missing");
		this.pattern = Objects.requireNonNull(builder.pattern, "pattern");

	}

	public DissectProcessor(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "dissect";
	}

	/**
	 * Required - API name: {@code append_separator}
	 */
	public String appendSeparator() {
		return this.appendSeparator;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code ignore_missing}
	 */
	public boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * Required - API name: {@code pattern}
	 */
	public String pattern() {
		return this.pattern;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("append_separator");
		generator.write(this.appendSeparator);

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("ignore_missing");
		generator.write(this.ignoreMissing);

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
		private String appendSeparator;

		private String field;

		private Boolean ignoreMissing;

		private String pattern;

		/**
		 * Required - API name: {@code append_separator}
		 */
		public Builder appendSeparator(String value) {
			this.appendSeparator = value;
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code ignore_missing}
		 */
		public Builder ignoreMissing(boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * Required - API name: {@code pattern}
		 */
		public Builder pattern(String value) {
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

			return new DissectProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DissectProcessor}
	 */
	public static final JsonpDeserializer<DissectProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DissectProcessor::setupDissectProcessorDeserializer, Builder::build);

	protected static void setupDissectProcessorDeserializer(DelegatingDeserializer<DissectProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::appendSeparator, JsonpDeserializer.stringDeserializer(), "append_separator");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");

	}

}
