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
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.analysis.ReverseTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.ReverseTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReverseTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	// ---------------------------------------------------------------------------------------------

	private ReverseTokenFilter(Builder builder) {
		super(builder);

	}

	public static ReverseTokenFilter of(Function<Builder, ObjectBuilder<ReverseTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Reverse;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "reverse");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReverseTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ReverseTokenFilter> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReverseTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReverseTokenFilter build() {
			_checkSingleUse();

			return new ReverseTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReverseTokenFilter}
	 */
	public static final JsonpDeserializer<ReverseTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ReverseTokenFilter::setupReverseTokenFilterDeserializer);

	protected static void setupReverseTokenFilterDeserializer(ObjectDeserializer<ReverseTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);

		op.ignore("type");
	}

}
