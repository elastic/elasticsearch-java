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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.StemmerOverrideTokenFilter
@JsonpDeserializable
public final class StemmerOverrideTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final List<String> rules;

	private final String rulesPath;

	// ---------------------------------------------------------------------------------------------

	public StemmerOverrideTokenFilter(Builder builder) {
		super(builder);

		this.rules = ModelTypeHelper.unmodifiableNonNull(builder.rules, "rules");
		this.rulesPath = Objects.requireNonNull(builder.rulesPath, "rules_path");

	}

	public StemmerOverrideTokenFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "stemmer_override";
	}

	/**
	 * Required - API name: {@code rules}
	 */
	public List<String> rules() {
		return this.rules;
	}

	/**
	 * Required - API name: {@code rules_path}
	 */
	public String rulesPath() {
		return this.rulesPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "stemmer_override");
		super.serializeInternal(generator, mapper);

		generator.writeKey("rules");
		generator.writeStartArray();
		for (String item0 : this.rules) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("rules_path");
		generator.write(this.rulesPath);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StemmerOverrideTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StemmerOverrideTokenFilter> {
		private List<String> rules;

		private String rulesPath;

		/**
		 * Required - API name: {@code rules}
		 */
		public Builder rules(List<String> value) {
			this.rules = value;
			return this;
		}

		/**
		 * Required - API name: {@code rules}
		 */
		public Builder rules(String... value) {
			this.rules = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #rules(List)}, creating the list if needed.
		 */
		public Builder addRules(String value) {
			if (this.rules == null) {
				this.rules = new ArrayList<>();
			}
			this.rules.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code rules_path}
		 */
		public Builder rulesPath(String value) {
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
