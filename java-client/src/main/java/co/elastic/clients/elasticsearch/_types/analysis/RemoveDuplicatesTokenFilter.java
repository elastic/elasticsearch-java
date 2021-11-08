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

// typedef: _types.analysis.RemoveDuplicatesTokenFilter
@JsonpDeserializable
public class RemoveDuplicatesTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	// ---------------------------------------------------------------------------------------------

	private RemoveDuplicatesTokenFilter(Builder builder) {
		super(builder);

	}

	public static RemoveDuplicatesTokenFilter of(Function<Builder, ObjectBuilder<RemoveDuplicatesTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "remove_duplicates";
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "remove_duplicates");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoveDuplicatesTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RemoveDuplicatesTokenFilter> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RemoveDuplicatesTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoveDuplicatesTokenFilter build() {
			_checkSingleUse();

			return new RemoveDuplicatesTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemoveDuplicatesTokenFilter}
	 */
	public static final JsonpDeserializer<RemoveDuplicatesTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, RemoveDuplicatesTokenFilter::setupRemoveDuplicatesTokenFilterDeserializer, Builder::build);

	protected static void setupRemoveDuplicatesTokenFilterDeserializer(
			DelegatingDeserializer<RemoveDuplicatesTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);

		op.ignore("type");
	}

}
