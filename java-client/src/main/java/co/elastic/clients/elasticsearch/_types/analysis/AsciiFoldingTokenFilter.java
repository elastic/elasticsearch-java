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

// typedef: _types.analysis.AsciiFoldingTokenFilter

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_types/analysis/token_filters.ts#L167-L170">API
 *      specification</a>
 */
@JsonpDeserializable
public class AsciiFoldingTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final boolean preserveOriginal;

	// ---------------------------------------------------------------------------------------------

	private AsciiFoldingTokenFilter(Builder builder) {
		super(builder);

		this.preserveOriginal = ApiTypeHelper.requireNonNull(builder.preserveOriginal, this, "preserveOriginal");

	}

	public static AsciiFoldingTokenFilter of(Function<Builder, ObjectBuilder<AsciiFoldingTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Asciifolding;
	}

	/**
	 * Required - API name: {@code preserve_original}
	 */
	public final boolean preserveOriginal() {
		return this.preserveOriginal;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "asciifolding");
		super.serializeInternal(generator, mapper);
		generator.writeKey("preserve_original");
		generator.write(this.preserveOriginal);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AsciiFoldingTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AsciiFoldingTokenFilter> {
		private Boolean preserveOriginal;

		/**
		 * Required - API name: {@code preserve_original}
		 */
		public final Builder preserveOriginal(boolean value) {
			this.preserveOriginal = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AsciiFoldingTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AsciiFoldingTokenFilter build() {
			_checkSingleUse();

			return new AsciiFoldingTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AsciiFoldingTokenFilter}
	 */
	public static final JsonpDeserializer<AsciiFoldingTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AsciiFoldingTokenFilter::setupAsciiFoldingTokenFilterDeserializer);

	protected static void setupAsciiFoldingTokenFilterDeserializer(
			ObjectDeserializer<AsciiFoldingTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::preserveOriginal, JsonpDeserializer.booleanDeserializer(), "preserve_original");

		op.ignore("type");
	}

}
