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

package co.elastic.clients.elasticsearch._core.search;

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
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.PhraseSuggester
@JsonpDeserializable
public final class PhraseSuggester extends SuggesterBase implements SuggestVariant {
	@Nullable
	private final PhraseSuggestCollate collate;

	@Nullable
	private final Double confidence;

	@Nullable
	private final List<DirectGenerator> directGenerator;

	@Nullable
	private final Boolean forceUnigrams;

	@Nullable
	private final Integer gramSize;

	@Nullable
	private final PhraseSuggestHighlight highlight;

	@Nullable
	private final Double maxErrors;

	@Nullable
	private final Double realWordErrorLikelihood;

	@Nullable
	private final String separator;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final SmoothingModel smoothing;

	@Nullable
	private final String text;

	@Nullable
	private final Integer tokenLimit;

	// ---------------------------------------------------------------------------------------------

	public PhraseSuggester(Builder builder) {
		super(builder);

		this.collate = builder.collate;
		this.confidence = builder.confidence;
		this.directGenerator = ModelTypeHelper.unmodifiable(builder.directGenerator);
		this.forceUnigrams = builder.forceUnigrams;
		this.gramSize = builder.gramSize;
		this.highlight = builder.highlight;
		this.maxErrors = builder.maxErrors;
		this.realWordErrorLikelihood = builder.realWordErrorLikelihood;
		this.separator = builder.separator;
		this.shardSize = builder.shardSize;
		this.smoothing = builder.smoothing;
		this.text = builder.text;
		this.tokenLimit = builder.tokenLimit;

	}

	public PhraseSuggester(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Suggest} variant type
	 */
	@Override
	public String _variantType() {
		return "phrase";
	}

	/**
	 * API name: {@code collate}
	 */
	@Nullable
	public PhraseSuggestCollate collate() {
		return this.collate;
	}

	/**
	 * API name: {@code confidence}
	 */
	@Nullable
	public Double confidence() {
		return this.confidence;
	}

	/**
	 * API name: {@code direct_generator}
	 */
	@Nullable
	public List<DirectGenerator> directGenerator() {
		return this.directGenerator;
	}

	/**
	 * API name: {@code force_unigrams}
	 */
	@Nullable
	public Boolean forceUnigrams() {
		return this.forceUnigrams;
	}

	/**
	 * API name: {@code gram_size}
	 */
	@Nullable
	public Integer gramSize() {
		return this.gramSize;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public PhraseSuggestHighlight highlight() {
		return this.highlight;
	}

	/**
	 * API name: {@code max_errors}
	 */
	@Nullable
	public Double maxErrors() {
		return this.maxErrors;
	}

	/**
	 * API name: {@code real_word_error_likelihood}
	 */
	@Nullable
	public Double realWordErrorLikelihood() {
		return this.realWordErrorLikelihood;
	}

	/**
	 * API name: {@code separator}
	 */
	@Nullable
	public String separator() {
		return this.separator;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public Integer shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code smoothing}
	 */
	@Nullable
	public SmoothingModel smoothing() {
		return this.smoothing;
	}

	/**
	 * API name: {@code text}
	 */
	@Nullable
	public String text() {
		return this.text;
	}

	/**
	 * API name: {@code token_limit}
	 */
	@Nullable
	public Integer tokenLimit() {
		return this.tokenLimit;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.collate != null) {

			generator.writeKey("collate");
			this.collate.serialize(generator, mapper);

		}
		if (this.confidence != null) {

			generator.writeKey("confidence");
			generator.write(this.confidence);

		}
		if (this.directGenerator != null) {

			generator.writeKey("direct_generator");
			generator.writeStartArray();
			for (DirectGenerator item0 : this.directGenerator) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.forceUnigrams != null) {

			generator.writeKey("force_unigrams");
			generator.write(this.forceUnigrams);

		}
		if (this.gramSize != null) {

			generator.writeKey("gram_size");
			generator.write(this.gramSize);

		}
		if (this.highlight != null) {

			generator.writeKey("highlight");
			this.highlight.serialize(generator, mapper);

		}
		if (this.maxErrors != null) {

			generator.writeKey("max_errors");
			generator.write(this.maxErrors);

		}
		if (this.realWordErrorLikelihood != null) {

			generator.writeKey("real_word_error_likelihood");
			generator.write(this.realWordErrorLikelihood);

		}
		if (this.separator != null) {

			generator.writeKey("separator");
			generator.write(this.separator);

		}
		if (this.shardSize != null) {

			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}
		if (this.smoothing != null) {

			generator.writeKey("smoothing");
			this.smoothing.serialize(generator, mapper);

		}
		if (this.text != null) {

			generator.writeKey("text");
			generator.write(this.text);

		}
		if (this.tokenLimit != null) {

			generator.writeKey("token_limit");
			generator.write(this.tokenLimit);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PhraseSuggester}.
	 */
	public static class Builder extends SuggesterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PhraseSuggester> {
		@Nullable
		private PhraseSuggestCollate collate;

		@Nullable
		private Double confidence;

		@Nullable
		private List<DirectGenerator> directGenerator;

		@Nullable
		private Boolean forceUnigrams;

		@Nullable
		private Integer gramSize;

		@Nullable
		private PhraseSuggestHighlight highlight;

		@Nullable
		private Double maxErrors;

		@Nullable
		private Double realWordErrorLikelihood;

		@Nullable
		private String separator;

		@Nullable
		private Integer shardSize;

		@Nullable
		private SmoothingModel smoothing;

		@Nullable
		private String text;

		@Nullable
		private Integer tokenLimit;

		/**
		 * API name: {@code collate}
		 */
		public Builder collate(@Nullable PhraseSuggestCollate value) {
			this.collate = value;
			return this;
		}

		/**
		 * API name: {@code collate}
		 */
		public Builder collate(Function<PhraseSuggestCollate.Builder, ObjectBuilder<PhraseSuggestCollate>> fn) {
			return this.collate(fn.apply(new PhraseSuggestCollate.Builder()).build());
		}

		/**
		 * API name: {@code confidence}
		 */
		public Builder confidence(@Nullable Double value) {
			this.confidence = value;
			return this;
		}

		/**
		 * API name: {@code direct_generator}
		 */
		public Builder directGenerator(@Nullable List<DirectGenerator> value) {
			this.directGenerator = value;
			return this;
		}

		/**
		 * API name: {@code direct_generator}
		 */
		public Builder directGenerator(DirectGenerator... value) {
			this.directGenerator = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #directGenerator(List)}, creating the list if needed. 4
		 */
		public Builder addDirectGenerator(DirectGenerator value) {
			if (this.directGenerator == null) {
				this.directGenerator = new ArrayList<>();
			}
			this.directGenerator.add(value);
			return this;
		}

		/**
		 * Set {@link #directGenerator(List)} to a singleton list.
		 */
		public Builder directGenerator(Function<DirectGenerator.Builder, ObjectBuilder<DirectGenerator>> fn) {
			return this.directGenerator(fn.apply(new DirectGenerator.Builder()).build());
		}

		/**
		 * Add a value to {@link #directGenerator(List)}, creating the list if needed. 5
		 */
		public Builder addDirectGenerator(Function<DirectGenerator.Builder, ObjectBuilder<DirectGenerator>> fn) {
			return this.addDirectGenerator(fn.apply(new DirectGenerator.Builder()).build());
		}

		/**
		 * API name: {@code force_unigrams}
		 */
		public Builder forceUnigrams(@Nullable Boolean value) {
			this.forceUnigrams = value;
			return this;
		}

		/**
		 * API name: {@code gram_size}
		 */
		public Builder gramSize(@Nullable Integer value) {
			this.gramSize = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(@Nullable PhraseSuggestHighlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(Function<PhraseSuggestHighlight.Builder, ObjectBuilder<PhraseSuggestHighlight>> fn) {
			return this.highlight(fn.apply(new PhraseSuggestHighlight.Builder()).build());
		}

		/**
		 * API name: {@code max_errors}
		 */
		public Builder maxErrors(@Nullable Double value) {
			this.maxErrors = value;
			return this;
		}

		/**
		 * API name: {@code real_word_error_likelihood}
		 */
		public Builder realWordErrorLikelihood(@Nullable Double value) {
			this.realWordErrorLikelihood = value;
			return this;
		}

		/**
		 * API name: {@code separator}
		 */
		public Builder separator(@Nullable String value) {
			this.separator = value;
			return this;
		}

		/**
		 * API name: {@code shard_size}
		 */
		public Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * API name: {@code smoothing}
		 */
		public Builder smoothing(@Nullable SmoothingModel value) {
			this.smoothing = value;
			return this;
		}

		/**
		 * API name: {@code smoothing}
		 */
		public Builder smoothing(Function<SmoothingModel.Builder, ObjectBuilder<SmoothingModel>> fn) {
			return this.smoothing(fn.apply(new SmoothingModel.Builder()).build());
		}

		/**
		 * API name: {@code text}
		 */
		public Builder text(@Nullable String value) {
			this.text = value;
			return this;
		}

		/**
		 * API name: {@code token_limit}
		 */
		public Builder tokenLimit(@Nullable Integer value) {
			this.tokenLimit = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PhraseSuggester}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PhraseSuggester build() {

			return new PhraseSuggester(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PhraseSuggester}
	 */
	public static final JsonpDeserializer<PhraseSuggester> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PhraseSuggester::setupPhraseSuggesterDeserializer, Builder::build);

	protected static void setupPhraseSuggesterDeserializer(DelegatingDeserializer<PhraseSuggester.Builder> op) {
		SuggesterBase.setupSuggesterBaseDeserializer(op);
		op.add(Builder::collate, PhraseSuggestCollate._DESERIALIZER, "collate");
		op.add(Builder::confidence, JsonpDeserializer.doubleDeserializer(), "confidence");
		op.add(Builder::directGenerator, JsonpDeserializer.arrayDeserializer(DirectGenerator._DESERIALIZER),
				"direct_generator");
		op.add(Builder::forceUnigrams, JsonpDeserializer.booleanDeserializer(), "force_unigrams");
		op.add(Builder::gramSize, JsonpDeserializer.integerDeserializer(), "gram_size");
		op.add(Builder::highlight, PhraseSuggestHighlight._DESERIALIZER, "highlight");
		op.add(Builder::maxErrors, JsonpDeserializer.doubleDeserializer(), "max_errors");
		op.add(Builder::realWordErrorLikelihood, JsonpDeserializer.doubleDeserializer(), "real_word_error_likelihood");
		op.add(Builder::separator, JsonpDeserializer.stringDeserializer(), "separator");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::smoothing, SmoothingModel._DESERIALIZER, "smoothing");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
		op.add(Builder::tokenLimit, JsonpDeserializer.integerDeserializer(), "token_limit");

	}

}
