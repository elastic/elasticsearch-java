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

// typedef: _types.analysis.TruncateTokenFilter
@JsonpDeserializable
public final class TruncateTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final int length;

	// ---------------------------------------------------------------------------------------------

	public TruncateTokenFilter(Builder builder) {
		super(builder);

		this.length = Objects.requireNonNull(builder.length, "length");

	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "truncate";
	}

	/**
	 * API name: {@code length}
	 */
	public int length() {
		return this.length;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "truncate");
		super.serializeInternal(generator, mapper);

		generator.writeKey("length");
		generator.write(this.length);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TruncateTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TruncateTokenFilter> {
		private Integer length;

		/**
		 * API name: {@code length}
		 */
		public Builder length(int value) {
			this.length = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TruncateTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TruncateTokenFilter build() {

			return new TruncateTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TruncateTokenFilter}
	 */
	public static final JsonpDeserializer<TruncateTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TruncateTokenFilter::setupTruncateTokenFilterDeserializer, Builder::build);

	protected static void setupTruncateTokenFilterDeserializer(DelegatingDeserializer<TruncateTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::length, JsonpDeserializer.integerDeserializer(), "length");

		op.ignore("type");
	}

}
