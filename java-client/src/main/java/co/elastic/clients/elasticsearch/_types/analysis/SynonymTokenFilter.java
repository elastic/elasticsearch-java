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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.SynonymTokenFilter
@JsonpDeserializable
public final class SynonymTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	@Nullable
	private final Boolean expand;

	@Nullable
	private final SynonymFormat format;

	@Nullable
	private final Boolean lenient;

	private final List<String> synonyms;

	@Nullable
	private final String synonymsPath;

	@Nullable
	private final String tokenizer;

	@Nullable
	private final Boolean updateable;

	// ---------------------------------------------------------------------------------------------

	public SynonymTokenFilter(Builder builder) {
		super(builder);

		this.expand = builder.expand;
		this.format = builder.format;
		this.lenient = builder.lenient;
		this.synonyms = ModelTypeHelper.unmodifiableNonNull(builder.synonyms, "synonyms");
		this.synonymsPath = builder.synonymsPath;
		this.tokenizer = builder.tokenizer;
		this.updateable = builder.updateable;

	}

	public SynonymTokenFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "synonym";
	}

	/**
	 * API name: {@code expand}
	 */
	@Nullable
	public Boolean expand() {
		return this.expand;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public SynonymFormat format() {
		return this.format;
	}

	/**
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
		return this.lenient;
	}

	/**
	 * Required - API name: {@code synonyms}
	 */
	public List<String> synonyms() {
		return this.synonyms;
	}

	/**
	 * API name: {@code synonyms_path}
	 */
	@Nullable
	public String synonymsPath() {
		return this.synonymsPath;
	}

	/**
	 * API name: {@code tokenizer}
	 */
	@Nullable
	public String tokenizer() {
		return this.tokenizer;
	}

	/**
	 * API name: {@code updateable}
	 */
	@Nullable
	public Boolean updateable() {
		return this.updateable;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "synonym");
		super.serializeInternal(generator, mapper);
		if (this.expand != null) {

			generator.writeKey("expand");
			generator.write(this.expand);

		}
		if (this.format != null) {

			generator.writeKey("format");
			this.format.serialize(generator, mapper);
		}
		if (this.lenient != null) {

			generator.writeKey("lenient");
			generator.write(this.lenient);

		}

		generator.writeKey("synonyms");
		generator.writeStartArray();
		for (String item0 : this.synonyms) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.synonymsPath != null) {

			generator.writeKey("synonyms_path");
			generator.write(this.synonymsPath);

		}
		if (this.tokenizer != null) {

			generator.writeKey("tokenizer");
			generator.write(this.tokenizer);

		}
		if (this.updateable != null) {

			generator.writeKey("updateable");
			generator.write(this.updateable);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SynonymTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SynonymTokenFilter> {
		@Nullable
		private Boolean expand;

		@Nullable
		private SynonymFormat format;

		@Nullable
		private Boolean lenient;

		private List<String> synonyms;

		@Nullable
		private String synonymsPath;

		@Nullable
		private String tokenizer;

		@Nullable
		private Boolean updateable;

		/**
		 * API name: {@code expand}
		 */
		public Builder expand(@Nullable Boolean value) {
			this.expand = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public Builder format(@Nullable SynonymFormat value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * Required - API name: {@code synonyms}
		 */
		public Builder synonyms(List<String> value) {
			this.synonyms = value;
			return this;
		}

		/**
		 * Required - API name: {@code synonyms}
		 */
		public Builder synonyms(String... value) {
			this.synonyms = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #synonyms(List)}, creating the list if needed.
		 */
		public Builder addSynonyms(String value) {
			if (this.synonyms == null) {
				this.synonyms = new ArrayList<>();
			}
			this.synonyms.add(value);
			return this;
		}

		/**
		 * API name: {@code synonyms_path}
		 */
		public Builder synonymsPath(@Nullable String value) {
			this.synonymsPath = value;
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public Builder tokenizer(@Nullable String value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * API name: {@code updateable}
		 */
		public Builder updateable(@Nullable Boolean value) {
			this.updateable = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SynonymTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SynonymTokenFilter build() {

			return new SynonymTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SynonymTokenFilter}
	 */
	public static final JsonpDeserializer<SynonymTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SynonymTokenFilter::setupSynonymTokenFilterDeserializer, Builder::build);

	protected static void setupSynonymTokenFilterDeserializer(DelegatingDeserializer<SynonymTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::expand, JsonpDeserializer.booleanDeserializer(), "expand");
		op.add(Builder::format, SynonymFormat._DESERIALIZER, "format");
		op.add(Builder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");
		op.add(Builder::synonyms, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"synonyms");
		op.add(Builder::synonymsPath, JsonpDeserializer.stringDeserializer(), "synonyms_path");
		op.add(Builder::tokenizer, JsonpDeserializer.stringDeserializer(), "tokenizer");
		op.add(Builder::updateable, JsonpDeserializer.booleanDeserializer(), "updateable");

		op.ignore("type");
	}

}
