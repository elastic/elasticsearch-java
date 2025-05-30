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
import java.lang.String;
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

// typedef: _types.analysis.IcuNormalizationCharFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.IcuNormalizationCharFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class IcuNormalizationCharFilter extends CharFilterBase implements CharFilterDefinitionVariant {
	@Nullable
	private final IcuNormalizationMode mode;

	@Nullable
	private final IcuNormalizationType name;

	@Nullable
	private final String unicodeSetFilter;

	// ---------------------------------------------------------------------------------------------

	private IcuNormalizationCharFilter(Builder builder) {
		super(builder);

		this.mode = builder.mode;
		this.name = builder.name;
		this.unicodeSetFilter = builder.unicodeSetFilter;

	}

	public static IcuNormalizationCharFilter of(Function<Builder, ObjectBuilder<IcuNormalizationCharFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * CharFilterDefinition variant kind.
	 */
	@Override
	public CharFilterDefinition.Kind _charFilterDefinitionKind() {
		return CharFilterDefinition.Kind.IcuNormalizer;
	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public final IcuNormalizationMode mode() {
		return this.mode;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final IcuNormalizationType name() {
		return this.name;
	}

	/**
	 * API name: {@code unicode_set_filter}
	 */
	@Nullable
	public final String unicodeSetFilter() {
		return this.unicodeSetFilter;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "icu_normalizer");
		super.serializeInternal(generator, mapper);
		if (this.mode != null) {
			generator.writeKey("mode");
			this.mode.serialize(generator, mapper);
		}
		if (this.name != null) {
			generator.writeKey("name");
			this.name.serialize(generator, mapper);
		}
		if (this.unicodeSetFilter != null) {
			generator.writeKey("unicode_set_filter");
			generator.write(this.unicodeSetFilter);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IcuNormalizationCharFilter}.
	 */

	public static class Builder extends CharFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IcuNormalizationCharFilter> {
		@Nullable
		private IcuNormalizationMode mode;

		@Nullable
		private IcuNormalizationType name;

		@Nullable
		private String unicodeSetFilter;

		/**
		 * API name: {@code mode}
		 */
		public final Builder mode(@Nullable IcuNormalizationMode value) {
			this.mode = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable IcuNormalizationType value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code unicode_set_filter}
		 */
		public final Builder unicodeSetFilter(@Nullable String value) {
			this.unicodeSetFilter = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IcuNormalizationCharFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IcuNormalizationCharFilter build() {
			_checkSingleUse();

			return new IcuNormalizationCharFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IcuNormalizationCharFilter}
	 */
	public static final JsonpDeserializer<IcuNormalizationCharFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IcuNormalizationCharFilter::setupIcuNormalizationCharFilterDeserializer);

	protected static void setupIcuNormalizationCharFilterDeserializer(
			ObjectDeserializer<IcuNormalizationCharFilter.Builder> op) {
		CharFilterBase.setupCharFilterBaseDeserializer(op);
		op.add(Builder::mode, IcuNormalizationMode._DESERIALIZER, "mode");
		op.add(Builder::name, IcuNormalizationType._DESERIALIZER, "name");
		op.add(Builder::unicodeSetFilter, JsonpDeserializer.stringDeserializer(), "unicode_set_filter");

		op.ignore("type");
	}

}
