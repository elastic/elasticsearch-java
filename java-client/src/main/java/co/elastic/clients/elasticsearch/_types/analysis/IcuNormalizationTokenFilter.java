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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.IcuNormalizationTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.IcuNormalizationTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class IcuNormalizationTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final IcuNormalizationType name;

	// ---------------------------------------------------------------------------------------------

	private IcuNormalizationTokenFilter(Builder builder) {
		super(builder);

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static IcuNormalizationTokenFilter of(Function<Builder, ObjectBuilder<IcuNormalizationTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.IcuNormalizer;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final IcuNormalizationType name() {
		return this.name;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "icu_normalizer");
		super.serializeInternal(generator, mapper);
		generator.writeKey("name");
		this.name.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IcuNormalizationTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IcuNormalizationTokenFilter> {
		private IcuNormalizationType name;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(IcuNormalizationType value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IcuNormalizationTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IcuNormalizationTokenFilter build() {
			_checkSingleUse();

			return new IcuNormalizationTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IcuNormalizationTokenFilter}
	 */
	public static final JsonpDeserializer<IcuNormalizationTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IcuNormalizationTokenFilter::setupIcuNormalizationTokenFilterDeserializer);

	protected static void setupIcuNormalizationTokenFilterDeserializer(
			ObjectDeserializer<IcuNormalizationTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::name, IcuNormalizationType._DESERIALIZER, "name");

		op.ignore("type");
	}

}
