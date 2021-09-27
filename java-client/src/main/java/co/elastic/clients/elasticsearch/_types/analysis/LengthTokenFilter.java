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
import java.util.Objects;

// typedef: _types.analysis.LengthTokenFilter
@JsonpDeserializable
public final class LengthTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final int max;

	private final int min;

	// ---------------------------------------------------------------------------------------------

	public LengthTokenFilter(Builder builder) {
		super(builder);

		this.max = Objects.requireNonNull(builder.max, "max");
		this.min = Objects.requireNonNull(builder.min, "min");

	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "length";
	}

	/**
	 * API name: {@code max}
	 */
	public int max() {
		return this.max;
	}

	/**
	 * API name: {@code min}
	 */
	public int min() {
		return this.min;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "length");
		super.serializeInternal(generator, mapper);

		generator.writeKey("max");
		generator.write(this.max);

		generator.writeKey("min");
		generator.write(this.min);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LengthTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<LengthTokenFilter> {
		private Integer max;

		private Integer min;

		/**
		 * API name: {@code max}
		 */
		public Builder max(int value) {
			this.max = value;
			return this;
		}

		/**
		 * API name: {@code min}
		 */
		public Builder min(int value) {
			this.min = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LengthTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LengthTokenFilter build() {

			return new LengthTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LengthTokenFilter}
	 */
	public static final JsonpDeserializer<LengthTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LengthTokenFilter::setupLengthTokenFilterDeserializer, Builder::build);

	protected static void setupLengthTokenFilterDeserializer(DelegatingDeserializer<LengthTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::max, JsonpDeserializer.integerDeserializer(), "max");
		op.add(Builder::min, JsonpDeserializer.integerDeserializer(), "min");

		op.ignore("type");
	}

}
