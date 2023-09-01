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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.EdgeNGramTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.EdgeNGramTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class EdgeNGramTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final Integer maxGram;

	@Nullable
	private final Integer minGram;

	@Nullable
	private final EdgeNGramSide side;

	@Nullable
	private final Boolean preserveOriginal;

	// ---------------------------------------------------------------------------------------------

	private EdgeNGramTokenFilter(Builder builder) {
		super(builder);

		this.maxGram = builder.maxGram;
		this.minGram = builder.minGram;
		this.side = builder.side;
		this.preserveOriginal = builder.preserveOriginal;

	}

	public static EdgeNGramTokenFilter of(Function<Builder, ObjectBuilder<EdgeNGramTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.EdgeNgram;
	}

	/**
	 * API name: {@code max_gram}
	 */
	@Nullable
	public final Integer maxGram() {
		return this.maxGram;
	}

	/**
	 * API name: {@code min_gram}
	 */
	@Nullable
	public final Integer minGram() {
		return this.minGram;
	}

	/**
	 * API name: {@code side}
	 */
	@Nullable
	public final EdgeNGramSide side() {
		return this.side;
	}

	/**
	 * API name: {@code preserve_original}
	 */
	@Nullable
	public final Boolean preserveOriginal() {
		return this.preserveOriginal;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "edge_ngram");
		super.serializeInternal(generator, mapper);
		if (this.maxGram != null) {
			generator.writeKey("max_gram");
			generator.write(this.maxGram);

		}
		if (this.minGram != null) {
			generator.writeKey("min_gram");
			generator.write(this.minGram);

		}
		if (this.side != null) {
			generator.writeKey("side");
			this.side.serialize(generator, mapper);
		}
		if (this.preserveOriginal != null) {
			generator.writeKey("preserve_original");
			generator.write(this.preserveOriginal);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EdgeNGramTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<EdgeNGramTokenFilter> {
		@Nullable
		private Integer maxGram;

		@Nullable
		private Integer minGram;

		@Nullable
		private EdgeNGramSide side;

		@Nullable
		private Boolean preserveOriginal;

		/**
		 * API name: {@code max_gram}
		 */
		public final Builder maxGram(@Nullable Integer value) {
			this.maxGram = value;
			return this;
		}

		/**
		 * API name: {@code min_gram}
		 */
		public final Builder minGram(@Nullable Integer value) {
			this.minGram = value;
			return this;
		}

		/**
		 * API name: {@code side}
		 */
		public final Builder side(@Nullable EdgeNGramSide value) {
			this.side = value;
			return this;
		}

		/**
		 * API name: {@code preserve_original}
		 */
		public final Builder preserveOriginal(@Nullable Boolean value) {
			this.preserveOriginal = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EdgeNGramTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EdgeNGramTokenFilter build() {
			_checkSingleUse();

			return new EdgeNGramTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EdgeNGramTokenFilter}
	 */
	public static final JsonpDeserializer<EdgeNGramTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EdgeNGramTokenFilter::setupEdgeNGramTokenFilterDeserializer);

	protected static void setupEdgeNGramTokenFilterDeserializer(ObjectDeserializer<EdgeNGramTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::maxGram, JsonpDeserializer.integerDeserializer(), "max_gram");
		op.add(Builder::minGram, JsonpDeserializer.integerDeserializer(), "min_gram");
		op.add(Builder::side, EdgeNGramSide._DESERIALIZER, "side");
		op.add(Builder::preserveOriginal, JsonpDeserializer.booleanDeserializer(), "preserve_original");

		op.ignore("type");
	}

}
