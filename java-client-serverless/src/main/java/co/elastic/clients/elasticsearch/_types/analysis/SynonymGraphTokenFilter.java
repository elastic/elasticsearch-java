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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.SynonymGraphTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.SynonymGraphTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class SynonymGraphTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
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

	private SynonymGraphTokenFilter(Builder builder) {
		super(builder);

		this.expand = builder.expand;
		this.format = builder.format;
		this.lenient = builder.lenient;
		this.synonyms = ApiTypeHelper.unmodifiable(builder.synonyms);
		this.synonymsPath = builder.synonymsPath;
		this.tokenizer = builder.tokenizer;
		this.updateable = builder.updateable;

	}

	public static SynonymGraphTokenFilter of(Function<Builder, ObjectBuilder<SynonymGraphTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.SynonymGraph;
	}

	/**
	 * API name: {@code expand}
	 */
	@Nullable
	public final Boolean expand() {
		return this.expand;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final SynonymFormat format() {
		return this.format;
	}

	/**
	 * API name: {@code lenient}
	 */
	@Nullable
	public final Boolean lenient() {
		return this.lenient;
	}

	/**
	 * API name: {@code synonyms}
	 */
	public final List<String> synonyms() {
		return this.synonyms;
	}

	/**
	 * API name: {@code synonyms_path}
	 */
	@Nullable
	public final String synonymsPath() {
		return this.synonymsPath;
	}

	/**
	 * API name: {@code tokenizer}
	 */
	@Nullable
	public final String tokenizer() {
		return this.tokenizer;
	}

	/**
	 * API name: {@code updateable}
	 */
	@Nullable
	public final Boolean updateable() {
		return this.updateable;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "synonym_graph");
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
		if (ApiTypeHelper.isDefined(this.synonyms)) {
			generator.writeKey("synonyms");
			generator.writeStartArray();
			for (String item0 : this.synonyms) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
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
	 * Builder for {@link SynonymGraphTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SynonymGraphTokenFilter> {
		@Nullable
		private Boolean expand;

		@Nullable
		private SynonymFormat format;

		@Nullable
		private Boolean lenient;

		@Nullable
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
		public final Builder expand(@Nullable Boolean value) {
			this.expand = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable SynonymFormat value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code lenient}
		 */
		public final Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * API name: {@code synonyms}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>synonyms</code>.
		 */
		public final Builder synonyms(List<String> list) {
			this.synonyms = _listAddAll(this.synonyms, list);
			return this;
		}

		/**
		 * API name: {@code synonyms}
		 * <p>
		 * Adds one or more values to <code>synonyms</code>.
		 */
		public final Builder synonyms(String value, String... values) {
			this.synonyms = _listAdd(this.synonyms, value, values);
			return this;
		}

		/**
		 * API name: {@code synonyms_path}
		 */
		public final Builder synonymsPath(@Nullable String value) {
			this.synonymsPath = value;
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public final Builder tokenizer(@Nullable String value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * API name: {@code updateable}
		 */
		public final Builder updateable(@Nullable Boolean value) {
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
			_checkSingleUse();

			return new SynonymGraphTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SynonymGraphTokenFilter}
	 */
	public static final JsonpDeserializer<SynonymGraphTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SynonymGraphTokenFilter::setupSynonymGraphTokenFilterDeserializer);

	protected static void setupSynonymGraphTokenFilterDeserializer(
			ObjectDeserializer<SynonymGraphTokenFilter.Builder> op) {
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
