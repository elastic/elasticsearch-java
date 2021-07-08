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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.PhraseSuggester
public final class PhraseSuggester extends SuggesterBase {
	@Nullable
	private final PhraseSuggestCollate collate;

	@Nullable
	private final Number confidence;

	@Nullable
	private final List<DirectGenerator> directGenerator;

	@Nullable
	private final Boolean forceUnigrams;

	@Nullable
	private final Number gramSize;

	@Nullable
	private final PhraseSuggestHighlight highlight;

	@Nullable
	private final Number maxErrors;

	@Nullable
	private final Number realWordErrorLikelihood;

	@Nullable
	private final String separator;

	@Nullable
	private final Number shardSize;

	@Nullable
	private final SmoothingModelContainer smoothing;

	@Nullable
	private final String text;

	@Nullable
	private final Number tokenLimit;

	// ---------------------------------------------------------------------------------------------

	protected PhraseSuggester(Builder builder) {
		super(builder);
		this.collate = builder.collate;
		this.confidence = builder.confidence;
		this.directGenerator = builder.directGenerator;
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
	public Number confidence() {
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
	public Number gramSize() {
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
	public Number maxErrors() {
		return this.maxErrors;
	}

	/**
	 * API name: {@code real_word_error_likelihood}
	 */
	@Nullable
	public Number realWordErrorLikelihood() {
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
	public Number shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code smoothing}
	 */
	@Nullable
	public SmoothingModelContainer smoothing() {
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
	public Number tokenLimit() {
		return this.tokenLimit;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.collate != null) {

			generator.writeKey("collate");
			this.collate.toJsonp(generator, mapper);

		}
		if (this.confidence != null) {

			generator.writeKey("confidence");
			generator.write(this.confidence.doubleValue());

		}
		if (this.directGenerator != null) {

			generator.writeKey("direct_generator");
			generator.writeStartArray();
			for (DirectGenerator item0 : this.directGenerator) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.forceUnigrams != null) {

			generator.writeKey("force_unigrams");
			generator.write(this.forceUnigrams);

		}
		if (this.gramSize != null) {

			generator.writeKey("gram_size");
			generator.write(this.gramSize.doubleValue());

		}
		if (this.highlight != null) {

			generator.writeKey("highlight");
			this.highlight.toJsonp(generator, mapper);

		}
		if (this.maxErrors != null) {

			generator.writeKey("max_errors");
			generator.write(this.maxErrors.doubleValue());

		}
		if (this.realWordErrorLikelihood != null) {

			generator.writeKey("real_word_error_likelihood");
			generator.write(this.realWordErrorLikelihood.doubleValue());

		}
		if (this.separator != null) {

			generator.writeKey("separator");
			generator.write(this.separator);

		}
		if (this.shardSize != null) {

			generator.writeKey("shard_size");
			generator.write(this.shardSize.doubleValue());

		}
		if (this.smoothing != null) {

			generator.writeKey("smoothing");
			this.smoothing.toJsonp(generator, mapper);

		}
		if (this.text != null) {

			generator.writeKey("text");
			generator.write(this.text);

		}
		if (this.tokenLimit != null) {

			generator.writeKey("token_limit");
			generator.write(this.tokenLimit.doubleValue());

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
		private Number confidence;

		@Nullable
		private List<DirectGenerator> directGenerator;

		@Nullable
		private Boolean forceUnigrams;

		@Nullable
		private Number gramSize;

		@Nullable
		private PhraseSuggestHighlight highlight;

		@Nullable
		private Number maxErrors;

		@Nullable
		private Number realWordErrorLikelihood;

		@Nullable
		private String separator;

		@Nullable
		private Number shardSize;

		@Nullable
		private SmoothingModelContainer smoothing;

		@Nullable
		private String text;

		@Nullable
		private Number tokenLimit;

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
		public Builder confidence(@Nullable Number value) {
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
		 * Add a value to {@link #directGenerator(List)}, creating the list if needed.
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
		 * Add a value to {@link #directGenerator(List)}, creating the list if needed.
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
		public Builder gramSize(@Nullable Number value) {
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
		public Builder maxErrors(@Nullable Number value) {
			this.maxErrors = value;
			return this;
		}

		/**
		 * API name: {@code real_word_error_likelihood}
		 */
		public Builder realWordErrorLikelihood(@Nullable Number value) {
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
		public Builder shardSize(@Nullable Number value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * API name: {@code smoothing}
		 */
		public Builder smoothing(@Nullable SmoothingModelContainer value) {
			this.smoothing = value;
			return this;
		}

		/**
		 * API name: {@code smoothing}
		 */
		public Builder smoothing(Function<SmoothingModelContainer.Builder, ObjectBuilder<SmoothingModelContainer>> fn) {
			return this.smoothing(fn.apply(new SmoothingModelContainer.Builder()).build());
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
		public Builder tokenLimit(@Nullable Number value) {
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
	 * Json deserializer for PhraseSuggester
	 */
	public static final JsonpDeserializer<PhraseSuggester> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PhraseSuggester::setupPhraseSuggesterDeserializer);

	protected static void setupPhraseSuggesterDeserializer(DelegatingDeserializer<PhraseSuggester.Builder> op) {
		SuggesterBase.setupSuggesterBaseDeserializer(op);
		op.add(Builder::collate, PhraseSuggestCollate.DESERIALIZER, "collate");
		op.add(Builder::confidence, JsonpDeserializer.numberDeserializer(), "confidence");
		op.add(Builder::directGenerator, JsonpDeserializer.arrayDeserializer(DirectGenerator.DESERIALIZER),
				"direct_generator");
		op.add(Builder::forceUnigrams, JsonpDeserializer.booleanDeserializer(), "force_unigrams");
		op.add(Builder::gramSize, JsonpDeserializer.numberDeserializer(), "gram_size");
		op.add(Builder::highlight, PhraseSuggestHighlight.DESERIALIZER, "highlight");
		op.add(Builder::maxErrors, JsonpDeserializer.numberDeserializer(), "max_errors");
		op.add(Builder::realWordErrorLikelihood, JsonpDeserializer.numberDeserializer(), "real_word_error_likelihood");
		op.add(Builder::separator, JsonpDeserializer.stringDeserializer(), "separator");
		op.add(Builder::shardSize, JsonpDeserializer.numberDeserializer(), "shard_size");
		op.add(Builder::smoothing, SmoothingModelContainer.DESERIALIZER, "smoothing");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
		op.add(Builder::tokenLimit, JsonpDeserializer.numberDeserializer(), "token_limit");

	}

}
