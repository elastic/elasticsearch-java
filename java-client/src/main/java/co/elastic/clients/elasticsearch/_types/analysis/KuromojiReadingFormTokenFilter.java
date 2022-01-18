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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.analysis.KuromojiReadingFormTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.KuromojiReadingFormTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class KuromojiReadingFormTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final boolean useRomaji;

	// ---------------------------------------------------------------------------------------------

	private KuromojiReadingFormTokenFilter(Builder builder) {
		super(builder);

		this.useRomaji = ApiTypeHelper.requireNonNull(builder.useRomaji, this, "useRomaji");

	}

	public static KuromojiReadingFormTokenFilter of(
			Function<Builder, ObjectBuilder<KuromojiReadingFormTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.KuromojiReadingform;
	}

	/**
	 * Required - API name: {@code use_romaji}
	 */
	public final boolean useRomaji() {
		return this.useRomaji;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "kuromoji_readingform");
		super.serializeInternal(generator, mapper);
		generator.writeKey("use_romaji");
		generator.write(this.useRomaji);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KuromojiReadingFormTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KuromojiReadingFormTokenFilter> {
		private Boolean useRomaji;

		/**
		 * Required - API name: {@code use_romaji}
		 */
		public final Builder useRomaji(boolean value) {
			this.useRomaji = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KuromojiReadingFormTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KuromojiReadingFormTokenFilter build() {
			_checkSingleUse();

			return new KuromojiReadingFormTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KuromojiReadingFormTokenFilter}
	 */
	public static final JsonpDeserializer<KuromojiReadingFormTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KuromojiReadingFormTokenFilter::setupKuromojiReadingFormTokenFilterDeserializer);

	protected static void setupKuromojiReadingFormTokenFilterDeserializer(
			ObjectDeserializer<KuromojiReadingFormTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::useRomaji, JsonpDeserializer.booleanDeserializer(), "use_romaji");

		op.ignore("type");
	}

}
