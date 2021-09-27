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

// typedef: _types.analysis.SynonymGraphTokenFilter
@JsonpDeserializable
public final class SynonymGraphTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final boolean expand;

	private final SynonymFormat format;

	private final boolean lenient;

	private final List<String> synonyms;

	private final String synonymsPath;

	private final String tokenizer;

	private final boolean updateable;

	// ---------------------------------------------------------------------------------------------

	public SynonymGraphTokenFilter(Builder builder) {
		super(builder);

		this.expand = Objects.requireNonNull(builder.expand, "expand");
		this.format = Objects.requireNonNull(builder.format, "format");
		this.lenient = Objects.requireNonNull(builder.lenient, "lenient");
		this.synonyms = Objects.requireNonNull(builder.synonyms, "synonyms");
		this.synonymsPath = Objects.requireNonNull(builder.synonymsPath, "synonyms_path");
		this.tokenizer = Objects.requireNonNull(builder.tokenizer, "tokenizer");
		this.updateable = Objects.requireNonNull(builder.updateable, "updateable");

	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "synonym_graph";
	}

	/**
	 * API name: {@code expand}
	 */
	public boolean expand() {
		return this.expand;
	}

	/**
	 * API name: {@code format}
	 */
	public SynonymFormat format() {
		return this.format;
	}

	/**
	 * API name: {@code lenient}
	 */
	public boolean lenient() {
		return this.lenient;
	}

	/**
	 * API name: {@code synonyms}
	 */
	public List<String> synonyms() {
		return this.synonyms;
	}

	/**
	 * API name: {@code synonyms_path}
	 */
	public String synonymsPath() {
		return this.synonymsPath;
	}

	/**
	 * API name: {@code tokenizer}
	 */
	public String tokenizer() {
		return this.tokenizer;
	}

	/**
	 * API name: {@code updateable}
	 */
	public boolean updateable() {
		return this.updateable;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "synonym_graph");
		super.serializeInternal(generator, mapper);

		generator.writeKey("expand");
		generator.write(this.expand);

		generator.writeKey("format");
		this.format.serialize(generator, mapper);

		generator.writeKey("lenient");
		generator.write(this.lenient);

		generator.writeKey("synonyms");
		generator.writeStartArray();
		for (String item0 : this.synonyms) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("synonyms_path");
		generator.write(this.synonymsPath);

		generator.writeKey("tokenizer");
		generator.write(this.tokenizer);

		generator.writeKey("updateable");
		generator.write(this.updateable);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SynonymGraphTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SynonymGraphTokenFilter> {
		private Boolean expand;

		private SynonymFormat format;

		private Boolean lenient;

		private List<String> synonyms;

		private String synonymsPath;

		private String tokenizer;

		private Boolean updateable;

		/**
		 * API name: {@code expand}
		 */
		public Builder expand(boolean value) {
			this.expand = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public Builder format(SynonymFormat value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code lenient}
		 */
		public Builder lenient(boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * API name: {@code synonyms}
		 */
		public Builder synonyms(List<String> value) {
			this.synonyms = value;
			return this;
		}

		/**
		 * API name: {@code synonyms}
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
		public Builder synonymsPath(String value) {
			this.synonymsPath = value;
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public Builder tokenizer(String value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * API name: {@code updateable}
		 */
		public Builder updateable(boolean value) {
			this.updateable = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SynonymGraphTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SynonymGraphTokenFilter build() {

			return new SynonymGraphTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SynonymGraphTokenFilter}
	 */
	public static final JsonpDeserializer<SynonymGraphTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SynonymGraphTokenFilter::setupSynonymGraphTokenFilterDeserializer, Builder::build);

	protected static void setupSynonymGraphTokenFilterDeserializer(
			DelegatingDeserializer<SynonymGraphTokenFilter.Builder> op) {
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
