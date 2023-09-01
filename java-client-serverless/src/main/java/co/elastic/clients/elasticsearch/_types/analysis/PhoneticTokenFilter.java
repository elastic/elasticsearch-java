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
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.PhoneticTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.PhoneticTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class PhoneticTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final PhoneticEncoder encoder;

	private final List<PhoneticLanguage> languageset;

	@Nullable
	private final Integer maxCodeLen;

	private final PhoneticNameType nameType;

	@Nullable
	private final Boolean replace;

	private final PhoneticRuleType ruleType;

	// ---------------------------------------------------------------------------------------------

	private PhoneticTokenFilter(Builder builder) {
		super(builder);

		this.encoder = ApiTypeHelper.requireNonNull(builder.encoder, this, "encoder");
		this.languageset = ApiTypeHelper.unmodifiableRequired(builder.languageset, this, "languageset");
		this.maxCodeLen = builder.maxCodeLen;
		this.nameType = ApiTypeHelper.requireNonNull(builder.nameType, this, "nameType");
		this.replace = builder.replace;
		this.ruleType = ApiTypeHelper.requireNonNull(builder.ruleType, this, "ruleType");

	}

	public static PhoneticTokenFilter of(Function<Builder, ObjectBuilder<PhoneticTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Phonetic;
	}

	/**
	 * Required - API name: {@code encoder}
	 */
	public final PhoneticEncoder encoder() {
		return this.encoder;
	}

	/**
	 * Required - API name: {@code languageset}
	 */
	public final List<PhoneticLanguage> languageset() {
		return this.languageset;
	}

	/**
	 * API name: {@code max_code_len}
	 */
	@Nullable
	public final Integer maxCodeLen() {
		return this.maxCodeLen;
	}

	/**
	 * Required - API name: {@code name_type}
	 */
	public final PhoneticNameType nameType() {
		return this.nameType;
	}

	/**
	 * API name: {@code replace}
	 */
	@Nullable
	public final Boolean replace() {
		return this.replace;
	}

	/**
	 * Required - API name: {@code rule_type}
	 */
	public final PhoneticRuleType ruleType() {
		return this.ruleType;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "phonetic");
		super.serializeInternal(generator, mapper);
		generator.writeKey("encoder");
		this.encoder.serialize(generator, mapper);
		if (ApiTypeHelper.isDefined(this.languageset)) {
			generator.writeKey("languageset");
			generator.writeStartArray();
			for (PhoneticLanguage item0 : this.languageset) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.maxCodeLen != null) {
			generator.writeKey("max_code_len");
			generator.write(this.maxCodeLen);

		}
		generator.writeKey("name_type");
		this.nameType.serialize(generator, mapper);
		if (this.replace != null) {
			generator.writeKey("replace");
			generator.write(this.replace);

		}
		generator.writeKey("rule_type");
		this.ruleType.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PhoneticTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PhoneticTokenFilter> {
		private PhoneticEncoder encoder;

		private List<PhoneticLanguage> languageset;

		@Nullable
		private Integer maxCodeLen;

		private PhoneticNameType nameType;

		@Nullable
		private Boolean replace;

		private PhoneticRuleType ruleType;

		/**
		 * Required - API name: {@code encoder}
		 */
		public final Builder encoder(PhoneticEncoder value) {
			this.encoder = value;
			return this;
		}

		/**
		 * Required - API name: {@code languageset}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>languageset</code>.
		 */
		public final Builder languageset(List<PhoneticLanguage> list) {
			this.languageset = _listAddAll(this.languageset, list);
			return this;
		}

		/**
		 * Required - API name: {@code languageset}
		 * <p>
		 * Adds one or more values to <code>languageset</code>.
		 */
		public final Builder languageset(PhoneticLanguage value, PhoneticLanguage... values) {
			this.languageset = _listAdd(this.languageset, value, values);
			return this;
		}

		/**
		 * API name: {@code max_code_len}
		 */
		public final Builder maxCodeLen(@Nullable Integer value) {
			this.maxCodeLen = value;
			return this;
		}

		/**
		 * Required - API name: {@code name_type}
		 */
		public final Builder nameType(PhoneticNameType value) {
			this.nameType = value;
			return this;
		}

		/**
		 * API name: {@code replace}
		 */
		public final Builder replace(@Nullable Boolean value) {
			this.replace = value;
			return this;
		}

		/**
		 * Required - API name: {@code rule_type}
		 */
		public final Builder ruleType(PhoneticRuleType value) {
			this.ruleType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PhoneticTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PhoneticTokenFilter build() {
			_checkSingleUse();

			return new PhoneticTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PhoneticTokenFilter}
	 */
	public static final JsonpDeserializer<PhoneticTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PhoneticTokenFilter::setupPhoneticTokenFilterDeserializer);

	protected static void setupPhoneticTokenFilterDeserializer(ObjectDeserializer<PhoneticTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::encoder, PhoneticEncoder._DESERIALIZER, "encoder");
		op.add(Builder::languageset, JsonpDeserializer.arrayDeserializer(PhoneticLanguage._DESERIALIZER),
				"languageset");
		op.add(Builder::maxCodeLen, JsonpDeserializer.integerDeserializer(), "max_code_len");
		op.add(Builder::nameType, PhoneticNameType._DESERIALIZER, "name_type");
		op.add(Builder::replace, JsonpDeserializer.booleanDeserializer(), "replace");
		op.add(Builder::ruleType, PhoneticRuleType._DESERIALIZER, "rule_type");

		op.ignore("type");
	}

}
