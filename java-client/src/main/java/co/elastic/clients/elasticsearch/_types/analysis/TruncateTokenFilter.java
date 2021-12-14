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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.analysis.TruncateTokenFilter

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_types/analysis/token_filters.ts#L326-L329">API
 *      specification</a>
 */
@JsonpDeserializable
public class TruncateTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final int length;

	// ---------------------------------------------------------------------------------------------

	private TruncateTokenFilter(Builder builder) {
		super(builder);

		this.length = ApiTypeHelper.requireNonNull(builder.length, this, "length");

	}

	public static TruncateTokenFilter of(Function<Builder, ObjectBuilder<TruncateTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Truncate;
	}

	/**
	 * Required - API name: {@code length}
	 */
	public final int length() {
		return this.length;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "truncate");
		super.serializeInternal(generator, mapper);
		generator.writeKey("length");
		generator.write(this.length);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TruncateTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TruncateTokenFilter> {
		private Integer length;

		/**
		 * Required - API name: {@code length}
		 */
		public final Builder length(int value) {
			this.length = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TruncateTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TruncateTokenFilter build() {
			_checkSingleUse();

			return new TruncateTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TruncateTokenFilter}
	 */
	public static final JsonpDeserializer<TruncateTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TruncateTokenFilter::setupTruncateTokenFilterDeserializer);

	protected static void setupTruncateTokenFilterDeserializer(ObjectDeserializer<TruncateTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::length, JsonpDeserializer.integerDeserializer(), "length");

		op.ignore("type");
	}

}
