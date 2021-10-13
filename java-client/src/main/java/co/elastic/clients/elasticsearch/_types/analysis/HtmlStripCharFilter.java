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
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.analysis.HtmlStripCharFilter
@JsonpDeserializable
public final class HtmlStripCharFilter extends CharFilterBase implements CharFilterVariant {
	// ---------------------------------------------------------------------------------------------

	public HtmlStripCharFilter(Builder builder) {
		super(builder);

	}

	public HtmlStripCharFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link CharFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "html_strip";
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "html_strip");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HtmlStripCharFilter}.
	 */
	public static class Builder extends CharFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HtmlStripCharFilter> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HtmlStripCharFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HtmlStripCharFilter build() {

			return new HtmlStripCharFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HtmlStripCharFilter}
	 */
	public static final JsonpDeserializer<HtmlStripCharFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HtmlStripCharFilter::setupHtmlStripCharFilterDeserializer, Builder::build);

	protected static void setupHtmlStripCharFilterDeserializer(DelegatingDeserializer<HtmlStripCharFilter.Builder> op) {
		CharFilterBase.setupCharFilterBaseDeserializer(op);

		op.ignore("type");
	}

}
