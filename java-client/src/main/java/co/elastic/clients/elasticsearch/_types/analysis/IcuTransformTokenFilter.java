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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.IcuTransformTokenFilter
@JsonpDeserializable
public class IcuTransformTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final IcuTransformDirection dir;

	private final String id;

	// ---------------------------------------------------------------------------------------------

	private IcuTransformTokenFilter(Builder builder) {
		super(builder);

		this.dir = ModelTypeHelper.requireNonNull(builder.dir, this, "dir");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");

	}

	public static IcuTransformTokenFilter of(Function<Builder, ObjectBuilder<IcuTransformTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "icu_transform";
	}

	/**
	 * Required - API name: {@code dir}
	 */
	public final IcuTransformDirection dir() {
		return this.dir;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "icu_transform");
		super.serializeInternal(generator, mapper);
		generator.writeKey("dir");
		this.dir.serialize(generator, mapper);
		generator.writeKey("id");
		generator.write(this.id);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IcuTransformTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IcuTransformTokenFilter> {
		private IcuTransformDirection dir;

		private String id;

		/**
		 * Required - API name: {@code dir}
		 */
		public final Builder dir(IcuTransformDirection value) {
			this.dir = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IcuTransformTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IcuTransformTokenFilter build() {
			_checkSingleUse();

			return new IcuTransformTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IcuTransformTokenFilter}
	 */
	public static final JsonpDeserializer<IcuTransformTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IcuTransformTokenFilter::setupIcuTransformTokenFilterDeserializer, Builder::build);

	protected static void setupIcuTransformTokenFilterDeserializer(
			DelegatingDeserializer<IcuTransformTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::dir, IcuTransformDirection._DESERIALIZER, "dir");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");

		op.ignore("type");
	}

}
