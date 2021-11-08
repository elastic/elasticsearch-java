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

// typedef: _types.analysis.StemmerOverrideTokenFilter
@JsonpDeserializable
public class StemmerOverrideTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final List<String> rules;

	@Nullable
	private final String rulesPath;

	// ---------------------------------------------------------------------------------------------

	private StemmerOverrideTokenFilter(Builder builder) {
		super(builder);

		this.rules = ModelTypeHelper.unmodifiable(builder.rules);
		this.rulesPath = builder.rulesPath;

	}

	public static StemmerOverrideTokenFilter of(Function<Builder, ObjectBuilder<StemmerOverrideTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "stemmer_override";
	}

	/**
	 * API name: {@code rules}
	 */
	public final List<String> rules() {
		return this.rules;
	}

	/**
	 * API name: {@code rules_path}
	 */
	@Nullable
	public final String rulesPath() {
		return this.rulesPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "stemmer_override");
		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.rules)) {
			generator.writeKey("rules");
			generator.writeStartArray();
			for (String item0 : this.rules) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.rulesPath != null) {
			generator.writeKey("rules_path");
			generator.write(this.rulesPath);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StemmerOverrideTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StemmerOverrideTokenFilter> {
		@Nullable
		private List<String> rules;

		@Nullable
		private String rulesPath;

		/**
		 * API name: {@code rules}
		 */
		public final Builder rules(@Nullable List<String> value) {
			this.rules = value;
			return this;
		}

		/**
		 * API name: {@code rules}
		 */
		public final Builder rules(String... value) {
			this.rules = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code rules_path}
		 */
		public final Builder rulesPath(@Nullable String value) {
			this.rulesPath = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StemmerOverrideTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StemmerOverrideTokenFilter build() {
			_checkSingleUse();

			return new StemmerOverrideTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StemmerOverrideTokenFilter}
	 */
	public static final JsonpDeserializer<StemmerOverrideTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, StemmerOverrideTokenFilter::setupStemmerOverrideTokenFilterDeserializer, Builder::build);

	protected static void setupStemmerOverrideTokenFilterDeserializer(
			DelegatingDeserializer<StemmerOverrideTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::rules, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "rules");
		op.add(Builder::rulesPath, JsonpDeserializer.stringDeserializer(), "rules_path");

		op.ignore("type");
	}

}
