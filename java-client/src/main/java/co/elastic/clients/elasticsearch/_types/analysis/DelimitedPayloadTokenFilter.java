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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.DelimitedPayloadTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.DelimitedPayloadTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class DelimitedPayloadTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final String delimiter;

	@Nullable
	private final DelimitedPayloadEncoding encoding;

	// ---------------------------------------------------------------------------------------------

	private DelimitedPayloadTokenFilter(Builder builder) {
		super(builder);

		this.delimiter = builder.delimiter;
		this.encoding = builder.encoding;

	}

	public static DelimitedPayloadTokenFilter of(Function<Builder, ObjectBuilder<DelimitedPayloadTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.DelimitedPayload;
	}

	/**
	 * API name: {@code delimiter}
	 */
	@Nullable
	public final String delimiter() {
		return this.delimiter;
	}

	/**
	 * API name: {@code encoding}
	 */
	@Nullable
	public final DelimitedPayloadEncoding encoding() {
		return this.encoding;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "delimited_payload");
		super.serializeInternal(generator, mapper);
		if (this.delimiter != null) {
			generator.writeKey("delimiter");
			generator.write(this.delimiter);

		}
		if (this.encoding != null) {
			generator.writeKey("encoding");
			this.encoding.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DelimitedPayloadTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DelimitedPayloadTokenFilter> {
		@Nullable
		private String delimiter;

		@Nullable
		private DelimitedPayloadEncoding encoding;

		/**
		 * API name: {@code delimiter}
		 */
		public final Builder delimiter(@Nullable String value) {
			this.delimiter = value;
			return this;
		}

		/**
		 * API name: {@code encoding}
		 */
		public final Builder encoding(@Nullable DelimitedPayloadEncoding value) {
			this.encoding = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DelimitedPayloadTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DelimitedPayloadTokenFilter build() {
			_checkSingleUse();

			return new DelimitedPayloadTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DelimitedPayloadTokenFilter}
	 */
	public static final JsonpDeserializer<DelimitedPayloadTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DelimitedPayloadTokenFilter::setupDelimitedPayloadTokenFilterDeserializer);

	protected static void setupDelimitedPayloadTokenFilterDeserializer(
			ObjectDeserializer<DelimitedPayloadTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::delimiter, JsonpDeserializer.stringDeserializer(), "delimiter");
		op.add(Builder::encoding, DelimitedPayloadEncoding._DESERIALIZER, "encoding");

		op.ignore("type");
	}

}
