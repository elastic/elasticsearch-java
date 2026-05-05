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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
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

// typedef: ml._types.CommonTokenizationConfig

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.CommonTokenizationConfig">API
 *      specification</a>
 */

public abstract class CommonTokenizationConfig implements JsonpSerializable {
	@Nullable
	private final Boolean doLowerCase;

	@Nullable
	private final Integer maxSequenceLength;

	@Nullable
	private final Integer span;

	@Nullable
	private final TokenizationTruncate truncate;

	@Nullable
	private final Boolean withSpecialTokens;

	// ---------------------------------------------------------------------------------------------

	protected CommonTokenizationConfig(AbstractBuilder<?> builder) {

		this.doLowerCase = builder.doLowerCase;
		this.maxSequenceLength = builder.maxSequenceLength;
		this.span = builder.span;
		this.truncate = builder.truncate;
		this.withSpecialTokens = builder.withSpecialTokens;

	}

	/**
	 * Should the tokenizer lower case the text
	 * <p>
	 * API name: {@code do_lower_case}
	 */
	@Nullable
	public final Boolean doLowerCase() {
		return this.doLowerCase;
	}

	/**
	 * Maximum input sequence length for the model
	 * <p>
	 * API name: {@code max_sequence_length}
	 */
	@Nullable
	public final Integer maxSequenceLength() {
		return this.maxSequenceLength;
	}

	/**
	 * Tokenization spanning options. Special value of -1 indicates no spanning
	 * takes place
	 * <p>
	 * API name: {@code span}
	 */
	@Nullable
	public final Integer span() {
		return this.span;
	}

	/**
	 * Should tokenization input be automatically truncated before sending to the
	 * model for inference
	 * <p>
	 * API name: {@code truncate}
	 */
	@Nullable
	public final TokenizationTruncate truncate() {
		return this.truncate;
	}

	/**
	 * Is tokenization completed with special tokens
	 * <p>
	 * API name: {@code with_special_tokens}
	 */
	@Nullable
	public final Boolean withSpecialTokens() {
		return this.withSpecialTokens;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.doLowerCase != null) {
			generator.writeKey("do_lower_case");
			generator.write(this.doLowerCase);

		}
		if (this.maxSequenceLength != null) {
			generator.writeKey("max_sequence_length");
			generator.write(this.maxSequenceLength);

		}
		if (this.span != null) {
			generator.writeKey("span");
			generator.write(this.span);

		}
		if (this.truncate != null) {
			generator.writeKey("truncate");
			this.truncate.serialize(generator, mapper);
		}
		if (this.withSpecialTokens != null) {
			generator.writeKey("with_special_tokens");
			generator.write(this.withSpecialTokens);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private Boolean doLowerCase;

		@Nullable
		private Integer maxSequenceLength;

		@Nullable
		private Integer span;

		@Nullable
		private TokenizationTruncate truncate;

		@Nullable
		private Boolean withSpecialTokens;

		/**
		 * Should the tokenizer lower case the text
		 * <p>
		 * API name: {@code do_lower_case}
		 */
		public final BuilderT doLowerCase(@Nullable Boolean value) {
			this.doLowerCase = value;
			return self();
		}

		/**
		 * Maximum input sequence length for the model
		 * <p>
		 * API name: {@code max_sequence_length}
		 */
		public final BuilderT maxSequenceLength(@Nullable Integer value) {
			this.maxSequenceLength = value;
			return self();
		}

		/**
		 * Tokenization spanning options. Special value of -1 indicates no spanning
		 * takes place
		 * <p>
		 * API name: {@code span}
		 */
		public final BuilderT span(@Nullable Integer value) {
			this.span = value;
			return self();
		}

		/**
		 * Should tokenization input be automatically truncated before sending to the
		 * model for inference
		 * <p>
		 * API name: {@code truncate}
		 */
		public final BuilderT truncate(@Nullable TokenizationTruncate value) {
			this.truncate = value;
			return self();
		}

		/**
		 * Is tokenization completed with special tokens
		 * <p>
		 * API name: {@code with_special_tokens}
		 */
		public final BuilderT withSpecialTokens(@Nullable Boolean value) {
			this.withSpecialTokens = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupCommonTokenizationConfigDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::doLowerCase, JsonpDeserializer.booleanDeserializer(), "do_lower_case");
		op.add(AbstractBuilder::maxSequenceLength, JsonpDeserializer.integerDeserializer(), "max_sequence_length");
		op.add(AbstractBuilder::span, JsonpDeserializer.integerDeserializer(), "span");
		op.add(AbstractBuilder::truncate, TokenizationTruncate._DESERIALIZER, "truncate");
		op.add(AbstractBuilder::withSpecialTokens, JsonpDeserializer.booleanDeserializer(), "with_special_tokens");

	}

}
