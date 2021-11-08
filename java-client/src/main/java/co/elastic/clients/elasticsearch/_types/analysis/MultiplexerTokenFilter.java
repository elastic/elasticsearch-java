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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.MultiplexerTokenFilter
@JsonpDeserializable
public class MultiplexerTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final List<String> filters;

	private final boolean preserveOriginal;

	// ---------------------------------------------------------------------------------------------

	private MultiplexerTokenFilter(Builder builder) {
		super(builder);

		this.filters = ModelTypeHelper.unmodifiableRequired(builder.filters, this, "filters");
		this.preserveOriginal = ModelTypeHelper.requireNonNull(builder.preserveOriginal, this, "preserveOriginal");

	}

	public static MultiplexerTokenFilter of(Function<Builder, ObjectBuilder<MultiplexerTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "multiplexer";
	}

	/**
	 * Required - API name: {@code filters}
	 */
	public final List<String> filters() {
		return this.filters;
	}

	/**
	 * Required - API name: {@code preserve_original}
	 */
	public final boolean preserveOriginal() {
		return this.preserveOriginal;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "multiplexer");
		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.filters)) {
			generator.writeKey("filters");
			generator.writeStartArray();
			for (String item0 : this.filters) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
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
		 * Required - API name: {@code filters}
		 */
		public final Builder filters(List<String> value) {
			this.filters = value;
			return this;
		}

		/**
		 * Required - API name: {@code filters}
		 */
		public final Builder filters(String... value) {
			this.filters = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code preserve_original}
		 */
		public final Builder preserveOriginal(boolean value) {
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
			_checkSingleUse();

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
