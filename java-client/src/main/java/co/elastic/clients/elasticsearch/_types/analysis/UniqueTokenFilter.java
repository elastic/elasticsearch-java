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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: _types.analysis.UniqueTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.UniqueTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class UniqueTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final Boolean onlyOnSamePosition;

	// ---------------------------------------------------------------------------------------------

	private UniqueTokenFilter(Builder builder) {
		super(builder);

		this.onlyOnSamePosition = builder.onlyOnSamePosition;

	}

	public static UniqueTokenFilter of(Function<Builder, ObjectBuilder<UniqueTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Unique;
	}

	/**
	 * If <code>true</code>, only remove duplicate tokens in the same position.
	 * Defaults to <code>false</code>.
	 * <p>
	 * API name: {@code only_on_same_position}
	 */
	@Nullable
	public final Boolean onlyOnSamePosition() {
		return this.onlyOnSamePosition;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "unique");
		super.serializeInternal(generator, mapper);
		if (this.onlyOnSamePosition != null) {
			generator.writeKey("only_on_same_position");
			generator.write(this.onlyOnSamePosition);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UniqueTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UniqueTokenFilter> {
		@Nullable
		private Boolean onlyOnSamePosition;

		/**
		 * If <code>true</code>, only remove duplicate tokens in the same position.
		 * Defaults to <code>false</code>.
		 * <p>
		 * API name: {@code only_on_same_position}
		 */
		public final Builder onlyOnSamePosition(@Nullable Boolean value) {
			this.onlyOnSamePosition = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UniqueTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UniqueTokenFilter build() {
			_checkSingleUse();

			return new UniqueTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UniqueTokenFilter}
	 */
	public static final JsonpDeserializer<UniqueTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UniqueTokenFilter::setupUniqueTokenFilterDeserializer);

	protected static void setupUniqueTokenFilterDeserializer(ObjectDeserializer<UniqueTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::onlyOnSamePosition, JsonpDeserializer.booleanDeserializer(), "only_on_same_position");

		op.ignore("type");
	}

}
