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
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.MultiplexerTokenFilter
@JsonpDeserializable
public final class MultiplexerTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final List<String> filters;

	private final Boolean preserveOriginal;

	// ---------------------------------------------------------------------------------------------

	public MultiplexerTokenFilter(Builder builder) {
		super(builder);

		this.filters = Objects.requireNonNull(builder.filters, "filters");
		this.preserveOriginal = Objects.requireNonNull(builder.preserveOriginal, "preserve_original");

	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "multiplexer";
	}

	/**
	 * API name: {@code filters}
	 */
	public List<String> filters() {
		return this.filters;
	}

	/**
	 * API name: {@code preserve_original}
	 */
	public Boolean preserveOriginal() {
		return this.preserveOriginal;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "multiplexer");
		super.serializeInternal(generator, mapper);

		generator.writeKey("filters");
		generator.writeStartArray();
		for (String item0 : this.filters) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("preserve_original");
		generator.write(this.preserveOriginal);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiplexerTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MultiplexerTokenFilter> {
		private List<String> filters;

		private Boolean preserveOriginal;

		/**
		 * API name: {@code filters}
		 */
		public Builder filters(List<String> value) {
			this.filters = value;
			return this;
		}

		/**
		 * API name: {@code filters}
		 */
		public Builder filters(String... value) {
			this.filters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filters(List)}, creating the list if needed.
		 */
		public Builder addFilters(String value) {
			if (this.filters == null) {
				this.filters = new ArrayList<>();
			}
			this.filters.add(value);
			return this;
		}

		/**
		 * API name: {@code preserve_original}
		 */
		public Builder preserveOriginal(Boolean value) {
			this.preserveOriginal = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiplexerTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiplexerTokenFilter build() {

			return new MultiplexerTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultiplexerTokenFilter}
	 */
	public static final JsonpDeserializer<MultiplexerTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MultiplexerTokenFilter::setupMultiplexerTokenFilterDeserializer, Builder::build);

	protected static void setupMultiplexerTokenFilterDeserializer(
			DelegatingDeserializer<MultiplexerTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::filters, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"filters");
		op.add(Builder::preserveOriginal, JsonpDeserializer.booleanDeserializer(), "preserve_original");

		op.ignore("type");
	}

}
