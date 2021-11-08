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
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.KeepTypesTokenFilter
@JsonpDeserializable
public class KeepTypesTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	@Nullable
	private final KeepTypesMode mode;

	private final List<String> types;

	// ---------------------------------------------------------------------------------------------

	private KeepTypesTokenFilter(Builder builder) {
		super(builder);

		this.mode = builder.mode;
		this.types = ModelTypeHelper.unmodifiable(builder.types);

	}

	public static KeepTypesTokenFilter of(Function<Builder, ObjectBuilder<KeepTypesTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "keep_types";
	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public final KeepTypesMode mode() {
		return this.mode;
	}

	/**
	 * API name: {@code types}
	 */
	public final List<String> types() {
		return this.types;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "keep_types");
		super.serializeInternal(generator, mapper);
		if (this.mode != null) {
			generator.writeKey("mode");
			this.mode.serialize(generator, mapper);
		}
		if (ModelTypeHelper.isDefined(this.types)) {
			generator.writeKey("types");
			generator.writeStartArray();
			for (String item0 : this.types) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KeepTypesTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KeepTypesTokenFilter> {
		@Nullable
		private KeepTypesMode mode;

		@Nullable
		private List<String> types;

		/**
		 * API name: {@code mode}
		 */
		public final Builder mode(@Nullable KeepTypesMode value) {
			this.mode = value;
			return this;
		}

		/**
		 * API name: {@code types}
		 */
		public final Builder types(@Nullable List<String> value) {
			this.types = value;
			return this;
		}

		/**
		 * API name: {@code types}
		 */
		public final Builder types(String... value) {
			this.types = Arrays.asList(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KeepTypesTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KeepTypesTokenFilter build() {
			_checkSingleUse();

			return new KeepTypesTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KeepTypesTokenFilter}
	 */
	public static final JsonpDeserializer<KeepTypesTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KeepTypesTokenFilter::setupKeepTypesTokenFilterDeserializer, Builder::build);

	protected static void setupKeepTypesTokenFilterDeserializer(
			DelegatingDeserializer<KeepTypesTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::mode, KeepTypesMode._DESERIALIZER, "mode");
		op.add(Builder::types, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "types");

		op.ignore("type");
	}

}
