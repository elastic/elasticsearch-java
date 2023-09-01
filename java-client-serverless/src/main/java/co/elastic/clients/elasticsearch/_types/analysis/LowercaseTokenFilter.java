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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.LowercaseTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.LowercaseTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class LowercaseTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final String language;

	// ---------------------------------------------------------------------------------------------

	private LowercaseTokenFilter(Builder builder) {
		super(builder);

		this.language = builder.language;

	}

	public static LowercaseTokenFilter of(Function<Builder, ObjectBuilder<LowercaseTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Lowercase;
	}

	/**
	 * API name: {@code language}
	 */
	@Nullable
	public final String language() {
		return this.language;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "lowercase");
		super.serializeInternal(generator, mapper);
		if (this.language != null) {
			generator.writeKey("language");
			generator.write(this.language);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LowercaseTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<LowercaseTokenFilter> {
		@Nullable
		private String language;

		/**
		 * API name: {@code language}
		 */
		public final Builder language(@Nullable String value) {
			this.language = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LowercaseTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LowercaseTokenFilter build() {
			_checkSingleUse();

			return new LowercaseTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LowercaseTokenFilter}
	 */
	public static final JsonpDeserializer<LowercaseTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LowercaseTokenFilter::setupLowercaseTokenFilterDeserializer);

	protected static void setupLowercaseTokenFilterDeserializer(ObjectDeserializer<LowercaseTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::language, JsonpDeserializer.stringDeserializer(), "language");

		op.ignore("type");
	}

}
