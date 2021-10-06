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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.CompletionProperty
@JsonpDeserializable
public final class CompletionProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final String analyzer;

	@Nullable
	private final List<SuggestContext> contexts;

	@Nullable
	private final Integer maxInputLength;

	@Nullable
	private final Boolean preservePositionIncrements;

	@Nullable
	private final Boolean preserveSeparators;

	@Nullable
	private final String searchAnalyzer;

	// ---------------------------------------------------------------------------------------------

	public CompletionProperty(Builder builder) {
		super(builder);

		this.analyzer = builder.analyzer;
		this.contexts = ModelTypeHelper.unmodifiable(builder.contexts);
		this.maxInputLength = builder.maxInputLength;
		this.preservePositionIncrements = builder.preservePositionIncrements;
		this.preserveSeparators = builder.preserveSeparators;
		this.searchAnalyzer = builder.searchAnalyzer;

	}

	public CompletionProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "completion";
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code contexts}
	 */
	@Nullable
	public List<SuggestContext> contexts() {
		return this.contexts;
	}

	/**
	 * API name: {@code max_input_length}
	 */
	@Nullable
	public Integer maxInputLength() {
		return this.maxInputLength;
	}

	/**
	 * API name: {@code preserve_position_increments}
	 */
	@Nullable
	public Boolean preservePositionIncrements() {
		return this.preservePositionIncrements;
	}

	/**
	 * API name: {@code preserve_separators}
	 */
	@Nullable
	public Boolean preserveSeparators() {
		return this.preserveSeparators;
	}

	/**
	 * API name: {@code search_analyzer}
	 */
	@Nullable
	public String searchAnalyzer() {
		return this.searchAnalyzer;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "completion");
		super.serializeInternal(generator, mapper);
		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.contexts != null) {

			generator.writeKey("contexts");
			generator.writeStartArray();
			for (SuggestContext item0 : this.contexts) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxInputLength != null) {

			generator.writeKey("max_input_length");
			generator.write(this.maxInputLength);

		}
		if (this.preservePositionIncrements != null) {

			generator.writeKey("preserve_position_increments");
			generator.write(this.preservePositionIncrements);

		}
		if (this.preserveSeparators != null) {

			generator.writeKey("preserve_separators");
			generator.write(this.preserveSeparators);

		}
		if (this.searchAnalyzer != null) {

			generator.writeKey("search_analyzer");
			generator.write(this.searchAnalyzer);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionProperty}.
	 */
	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CompletionProperty> {
		@Nullable
		private String analyzer;

		@Nullable
		private List<SuggestContext> contexts;

		@Nullable
		private Integer maxInputLength;

		@Nullable
		private Boolean preservePositionIncrements;

		@Nullable
		private Boolean preserveSeparators;

		@Nullable
		private String searchAnalyzer;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code contexts}
		 */
		public Builder contexts(@Nullable List<SuggestContext> value) {
			this.contexts = value;
			return this;
		}

		/**
		 * API name: {@code contexts}
		 */
		public Builder contexts(SuggestContext... value) {
			this.contexts = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #contexts(List)}, creating the list if needed.
		 */
		public Builder addContexts(SuggestContext value) {
			if (this.contexts == null) {
				this.contexts = new ArrayList<>();
			}
			this.contexts.add(value);
			return this;
		}

		/**
		 * Set {@link #contexts(List)} to a singleton list.
		 */
		public Builder contexts(Function<SuggestContext.Builder, ObjectBuilder<SuggestContext>> fn) {
			return this.contexts(fn.apply(new SuggestContext.Builder()).build());
		}

		/**
		 * Add a value to {@link #contexts(List)}, creating the list if needed.
		 */
		public Builder addContexts(Function<SuggestContext.Builder, ObjectBuilder<SuggestContext>> fn) {
			return this.addContexts(fn.apply(new SuggestContext.Builder()).build());
		}

		/**
		 * API name: {@code max_input_length}
		 */
		public Builder maxInputLength(@Nullable Integer value) {
			this.maxInputLength = value;
			return this;
		}

		/**
		 * API name: {@code preserve_position_increments}
		 */
		public Builder preservePositionIncrements(@Nullable Boolean value) {
			this.preservePositionIncrements = value;
			return this;
		}

		/**
		 * API name: {@code preserve_separators}
		 */
		public Builder preserveSeparators(@Nullable Boolean value) {
			this.preserveSeparators = value;
			return this;
		}

		/**
		 * API name: {@code search_analyzer}
		 */
		public Builder searchAnalyzer(@Nullable String value) {
			this.searchAnalyzer = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompletionProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionProperty build() {

			return new CompletionProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompletionProperty}
	 */
	public static final JsonpDeserializer<CompletionProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompletionProperty::setupCompletionPropertyDeserializer, Builder::build);

	protected static void setupCompletionPropertyDeserializer(DelegatingDeserializer<CompletionProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::contexts, JsonpDeserializer.arrayDeserializer(SuggestContext._DESERIALIZER), "contexts");
		op.add(Builder::maxInputLength, JsonpDeserializer.integerDeserializer(), "max_input_length");
		op.add(Builder::preservePositionIncrements, JsonpDeserializer.booleanDeserializer(),
				"preserve_position_increments");
		op.add(Builder::preserveSeparators, JsonpDeserializer.booleanDeserializer(), "preserve_separators");
		op.add(Builder::searchAnalyzer, JsonpDeserializer.stringDeserializer(), "search_analyzer");

		op.ignore("type");
	}

}
