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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.IcuCollationTokenFilter
@JsonpDeserializable
public class IcuCollationTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final IcuCollationAlternate alternate;

	private final IcuCollationCaseFirst casefirst;

	private final boolean caselevel;

	private final String country;

	private final IcuCollationDecomposition decomposition;

	private final boolean hiraganaquaternarymode;

	private final String language;

	private final boolean numeric;

	private final IcuCollationStrength strength;

	@Nullable
	private final String variabletop;

	private final String variant;

	// ---------------------------------------------------------------------------------------------

	private IcuCollationTokenFilter(Builder builder) {
		super(builder);

		this.alternate = ModelTypeHelper.requireNonNull(builder.alternate, this, "alternate");
		this.casefirst = ModelTypeHelper.requireNonNull(builder.casefirst, this, "casefirst");
		this.caselevel = ModelTypeHelper.requireNonNull(builder.caselevel, this, "caselevel");
		this.country = ModelTypeHelper.requireNonNull(builder.country, this, "country");
		this.decomposition = ModelTypeHelper.requireNonNull(builder.decomposition, this, "decomposition");
		this.hiraganaquaternarymode = ModelTypeHelper.requireNonNull(builder.hiraganaquaternarymode, this,
				"hiraganaquaternarymode");
		this.language = ModelTypeHelper.requireNonNull(builder.language, this, "language");
		this.numeric = ModelTypeHelper.requireNonNull(builder.numeric, this, "numeric");
		this.strength = ModelTypeHelper.requireNonNull(builder.strength, this, "strength");
		this.variabletop = builder.variabletop;
		this.variant = ModelTypeHelper.requireNonNull(builder.variant, this, "variant");

	}

	public static IcuCollationTokenFilter of(Function<Builder, ObjectBuilder<IcuCollationTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "icu_collation";
	}

	/**
	 * Required - API name: {@code alternate}
	 */
	public final IcuCollationAlternate alternate() {
		return this.alternate;
	}

	/**
	 * Required - API name: {@code caseFirst}
	 */
	public final IcuCollationCaseFirst casefirst() {
		return this.casefirst;
	}

	/**
	 * Required - API name: {@code caseLevel}
	 */
	public final boolean caselevel() {
		return this.caselevel;
	}

	/**
	 * Required - API name: {@code country}
	 */
	public final String country() {
		return this.country;
	}

	/**
	 * Required - API name: {@code decomposition}
	 */
	public final IcuCollationDecomposition decomposition() {
		return this.decomposition;
	}

	/**
	 * Required - API name: {@code hiraganaQuaternaryMode}
	 */
	public final boolean hiraganaquaternarymode() {
		return this.hiraganaquaternarymode;
	}

	/**
	 * Required - API name: {@code language}
	 */
	public final String language() {
		return this.language;
	}

	/**
	 * Required - API name: {@code numeric}
	 */
	public final boolean numeric() {
		return this.numeric;
	}

	/**
	 * Required - API name: {@code strength}
	 */
	public final IcuCollationStrength strength() {
		return this.strength;
	}

	/**
	 * API name: {@code variableTop}
	 */
	@Nullable
	public final String variabletop() {
		return this.variabletop;
	}

	/**
	 * Required - API name: {@code variant}
	 */
	public final String variant() {
		return this.variant;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "icu_collation");
		super.serializeInternal(generator, mapper);
		generator.writeKey("alternate");
		this.alternate.serialize(generator, mapper);
		generator.writeKey("caseFirst");
		this.casefirst.serialize(generator, mapper);
		generator.writeKey("caseLevel");
		generator.write(this.caselevel);

		generator.writeKey("country");
		generator.write(this.country);

		generator.writeKey("decomposition");
		this.decomposition.serialize(generator, mapper);
		generator.writeKey("hiraganaQuaternaryMode");
		generator.write(this.hiraganaquaternarymode);

		generator.writeKey("language");
		generator.write(this.language);

		generator.writeKey("numeric");
		generator.write(this.numeric);

		generator.writeKey("strength");
		this.strength.serialize(generator, mapper);
		if (this.variabletop != null) {
			generator.writeKey("variableTop");
			generator.write(this.variabletop);

		}
		generator.writeKey("variant");
		generator.write(this.variant);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IcuCollationTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IcuCollationTokenFilter> {
		private IcuCollationAlternate alternate;

		private IcuCollationCaseFirst casefirst;

		private Boolean caselevel;

		private String country;

		private IcuCollationDecomposition decomposition;

		private Boolean hiraganaquaternarymode;

		private String language;

		private Boolean numeric;

		private IcuCollationStrength strength;

		@Nullable
		private String variabletop;

		private String variant;

		/**
		 * Required - API name: {@code alternate}
		 */
		public final Builder alternate(IcuCollationAlternate value) {
			this.alternate = value;
			return this;
		}

		/**
		 * Required - API name: {@code caseFirst}
		 */
		public final Builder casefirst(IcuCollationCaseFirst value) {
			this.casefirst = value;
			return this;
		}

		/**
		 * Required - API name: {@code caseLevel}
		 */
		public final Builder caselevel(boolean value) {
			this.caselevel = value;
			return this;
		}

		/**
		 * Required - API name: {@code country}
		 */
		public final Builder country(String value) {
			this.country = value;
			return this;
		}

		/**
		 * Required - API name: {@code decomposition}
		 */
		public final Builder decomposition(IcuCollationDecomposition value) {
			this.decomposition = value;
			return this;
		}

		/**
		 * Required - API name: {@code hiraganaQuaternaryMode}
		 */
		public final Builder hiraganaquaternarymode(boolean value) {
			this.hiraganaquaternarymode = value;
			return this;
		}

		/**
		 * Required - API name: {@code language}
		 */
		public final Builder language(String value) {
			this.language = value;
			return this;
		}

		/**
		 * Required - API name: {@code numeric}
		 */
		public final Builder numeric(boolean value) {
			this.numeric = value;
			return this;
		}

		/**
		 * Required - API name: {@code strength}
		 */
		public final Builder strength(IcuCollationStrength value) {
			this.strength = value;
			return this;
		}

		/**
		 * API name: {@code variableTop}
		 */
		public final Builder variabletop(@Nullable String value) {
			this.variabletop = value;
			return this;
		}

		/**
		 * Required - API name: {@code variant}
		 */
		public final Builder variant(String value) {
			this.variant = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IcuCollationTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IcuCollationTokenFilter build() {
			_checkSingleUse();

			return new IcuCollationTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IcuCollationTokenFilter}
	 */
	public static final JsonpDeserializer<IcuCollationTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IcuCollationTokenFilter::setupIcuCollationTokenFilterDeserializer, Builder::build);

	protected static void setupIcuCollationTokenFilterDeserializer(
			DelegatingDeserializer<IcuCollationTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::alternate, IcuCollationAlternate._DESERIALIZER, "alternate");
		op.add(Builder::casefirst, IcuCollationCaseFirst._DESERIALIZER, "caseFirst");
		op.add(Builder::caselevel, JsonpDeserializer.booleanDeserializer(), "caseLevel");
		op.add(Builder::country, JsonpDeserializer.stringDeserializer(), "country");
		op.add(Builder::decomposition, IcuCollationDecomposition._DESERIALIZER, "decomposition");
		op.add(Builder::hiraganaquaternarymode, JsonpDeserializer.booleanDeserializer(), "hiraganaQuaternaryMode");
		op.add(Builder::language, JsonpDeserializer.stringDeserializer(), "language");
		op.add(Builder::numeric, JsonpDeserializer.booleanDeserializer(), "numeric");
		op.add(Builder::strength, IcuCollationStrength._DESERIALIZER, "strength");
		op.add(Builder::variabletop, JsonpDeserializer.stringDeserializer(), "variableTop");
		op.add(Builder::variant, JsonpDeserializer.stringDeserializer(), "variant");

		op.ignore("type");
	}

}
