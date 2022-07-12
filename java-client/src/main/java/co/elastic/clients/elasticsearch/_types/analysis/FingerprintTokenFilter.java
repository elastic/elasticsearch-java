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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.FingerprintTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.FingerprintTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class FingerprintTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final Integer maxOutputSize;

	@Nullable
	private final String separator;

	// ---------------------------------------------------------------------------------------------

	private FingerprintTokenFilter(Builder builder) {
		super(builder);

		this.maxOutputSize = builder.maxOutputSize;
		this.separator = builder.separator;

	}

	public static FingerprintTokenFilter of(Function<Builder, ObjectBuilder<FingerprintTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Fingerprint;
	}

	/**
	 * API name: {@code max_output_size}
	 */
	@Nullable
	public final Integer maxOutputSize() {
		return this.maxOutputSize;
	}

	/**
	 * API name: {@code separator}
	 */
	@Nullable
	public final String separator() {
		return this.separator;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "fingerprint");
		super.serializeInternal(generator, mapper);
		if (this.maxOutputSize != null) {
			generator.writeKey("max_output_size");
			generator.write(this.maxOutputSize);

		}
		if (this.separator != null) {
			generator.writeKey("separator");
			generator.write(this.separator);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FingerprintTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FingerprintTokenFilter> {
		@Nullable
		private Integer maxOutputSize;

		@Nullable
		private String separator;

		/**
		 * API name: {@code max_output_size}
		 */
		public final Builder maxOutputSize(@Nullable Integer value) {
			this.maxOutputSize = value;
			return this;
		}

		/**
		 * API name: {@code separator}
		 */
		public final Builder separator(@Nullable String value) {
			this.separator = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FingerprintTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FingerprintTokenFilter build() {
			_checkSingleUse();

			return new FingerprintTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FingerprintTokenFilter}
	 */
	public static final JsonpDeserializer<FingerprintTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FingerprintTokenFilter::setupFingerprintTokenFilterDeserializer);

	protected static void setupFingerprintTokenFilterDeserializer(
			ObjectDeserializer<FingerprintTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::maxOutputSize, JsonpDeserializer.integerDeserializer(), "max_output_size");
		op.add(Builder::separator, JsonpDeserializer.stringDeserializer(), "separator");

		op.ignore("type");
	}

}
