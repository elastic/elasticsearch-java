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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.FingerprintTokenFilter
@JsonpDeserializable
public final class FingerprintTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final int maxOutputSize;

	private final String separator;

	// ---------------------------------------------------------------------------------------------

	public FingerprintTokenFilter(Builder builder) {
		super(builder);

		this.maxOutputSize = Objects.requireNonNull(builder.maxOutputSize, "max_output_size");
		this.separator = Objects.requireNonNull(builder.separator, "separator");

	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "fingerprint";
	}

	/**
	 * API name: {@code max_output_size}
	 */
	public int maxOutputSize() {
		return this.maxOutputSize;
	}

	/**
	 * API name: {@code separator}
	 */
	public String separator() {
		return this.separator;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "fingerprint");
		super.serializeInternal(generator, mapper);

		generator.writeKey("max_output_size");
		generator.write(this.maxOutputSize);

		generator.writeKey("separator");
		generator.write(this.separator);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FingerprintTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FingerprintTokenFilter> {
		private Integer maxOutputSize;

		private String separator;

		/**
		 * API name: {@code max_output_size}
		 */
		public Builder maxOutputSize(int value) {
			this.maxOutputSize = value;
			return this;
		}

		/**
		 * API name: {@code separator}
		 */
		public Builder separator(String value) {
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

			return new FingerprintTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FingerprintTokenFilter}
	 */
	public static final JsonpDeserializer<FingerprintTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FingerprintTokenFilter::setupFingerprintTokenFilterDeserializer, Builder::build);

	protected static void setupFingerprintTokenFilterDeserializer(
			DelegatingDeserializer<FingerprintTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::maxOutputSize, JsonpDeserializer.integerDeserializer(), "max_output_size");
		op.add(Builder::separator, JsonpDeserializer.stringDeserializer(), "separator");

		op.ignore("type");
	}

}
