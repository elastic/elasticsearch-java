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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.analysis.SynonymTokenFilterBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.SynonymTokenFilterBase">API
 *      specification</a>
 */

public abstract class SynonymTokenFilterBase extends TokenFilterBase {
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
	private final String synonymsSet;

	@Nullable
	private final String tokenizer;

	@Nullable
	private final Boolean updateable;

	// ---------------------------------------------------------------------------------------------

	protected SynonymTokenFilterBase(AbstractBuilder<?> builder) {
		super(builder);

		this.expand = builder.expand;
		this.format = builder.format;
		this.lenient = builder.lenient;
		this.synonyms = ApiTypeHelper.unmodifiable(builder.synonyms);
		this.synonymsPath = builder.synonymsPath;
		this.synonymsSet = builder.synonymsSet;
		this.tokenizer = builder.tokenizer;
		this.updateable = builder.updateable;

	}

	/**
	 * Expands definitions for equivalent synonym rules. Defaults to
	 * <code>true</code>.
	 * <p>
	 * API name: {@code expand}
	 */
	@Nullable
	public final Boolean expand() {
		return this.expand;
	}

	/**
	 * Sets the synonym rules format.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final SynonymFormat format() {
		return this.format;
	}

	/**
	 * If <code>true</code> ignores errors while parsing the synonym rules. It is
	 * important to note that only those synonym rules which cannot get parsed are
	 * ignored. Defaults to the value of the <code>updateable</code> setting.
	 * <p>
	 * API name: {@code lenient}
	 */
	@Nullable
	public final Boolean lenient() {
		return this.lenient;
	}

	/**
	 * Used to define inline synonyms.
	 * <p>
	 * API name: {@code synonyms}
	 */
	public final List<String> synonyms() {
		return this.synonyms;
	}

	/**
	 * Used to provide a synonym file. This path must be absolute or relative to the
	 * <code>config</code> location.
	 * <p>
	 * API name: {@code synonyms_path}
	 */
	@Nullable
	public final String synonymsPath() {
		return this.synonymsPath;
	}

	/**
	 * Provide a synonym set created via Synonyms Management APIs.
	 * <p>
	 * API name: {@code synonyms_set}
	 */
	@Nullable
	public final String synonymsSet() {
		return this.synonymsSet;
	}

	/**
	 * Controls the tokenizers that will be used to tokenize the synonym, this
	 * parameter is for backwards compatibility for indices that created before 6.0.
	 * <p>
	 * API name: {@code tokenizer}
	 * 
	 * @deprecated 6.0.0
	 */
	@Deprecated
	@Nullable
	public final String tokenizer() {
		return this.tokenizer;
	}

	/**
	 * If <code>true</code> allows reloading search analyzers to pick up changes to
	 * synonym files. Only to be used for search analyzers. Defaults to
	 * <code>false</code>.
	 * <p>
	 * API name: {@code updateable}
	 */
	@Nullable
	public final Boolean updateable() {
		return this.updateable;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

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
		if (this.synonymsSet != null) {
			generator.writeKey("synonyms_set");
			generator.write(this.synonymsSet);

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

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				TokenFilterBase.AbstractBuilder<BuilderT> {
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
		private String synonymsSet;

		@Nullable
		private String tokenizer;

		@Nullable
		private Boolean updateable;

		/**
		 * Expands definitions for equivalent synonym rules. Defaults to
		 * <code>true</code>.
		 * <p>
		 * API name: {@code expand}
		 */
		public final BuilderT expand(@Nullable Boolean value) {
			this.expand = value;
			return self();
		}

		/**
		 * Sets the synonym rules format.
		 * <p>
		 * API name: {@code format}
		 */
		public final BuilderT format(@Nullable SynonymFormat value) {
			this.format = value;
			return self();
		}

		/**
		 * If <code>true</code> ignores errors while parsing the synonym rules. It is
		 * important to note that only those synonym rules which cannot get parsed are
		 * ignored. Defaults to the value of the <code>updateable</code> setting.
		 * <p>
		 * API name: {@code lenient}
		 */
		public final BuilderT lenient(@Nullable Boolean value) {
			this.lenient = value;
			return self();
		}

		/**
		 * Used to define inline synonyms.
		 * <p>
		 * API name: {@code synonyms}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>synonyms</code>.
		 */
		public final BuilderT synonyms(List<String> list) {
			this.synonyms = _listAddAll(this.synonyms, list);
			return self();
		}

		/**
		 * Used to define inline synonyms.
		 * <p>
		 * API name: {@code synonyms}
		 * <p>
		 * Adds one or more values to <code>synonyms</code>.
		 */
		public final BuilderT synonyms(String value, String... values) {
			this.synonyms = _listAdd(this.synonyms, value, values);
			return self();
		}

		/**
		 * Used to provide a synonym file. This path must be absolute or relative to the
		 * <code>config</code> location.
		 * <p>
		 * API name: {@code synonyms_path}
		 */
		public final BuilderT synonymsPath(@Nullable String value) {
			this.synonymsPath = value;
			return self();
		}

		/**
		 * Provide a synonym set created via Synonyms Management APIs.
		 * <p>
		 * API name: {@code synonyms_set}
		 */
		public final BuilderT synonymsSet(@Nullable String value) {
			this.synonymsSet = value;
			return self();
		}

		/**
		 * Controls the tokenizers that will be used to tokenize the synonym, this
		 * parameter is for backwards compatibility for indices that created before 6.0.
		 * <p>
		 * API name: {@code tokenizer}
		 * 
		 * @deprecated 6.0.0
		 */
		@Deprecated
		public final BuilderT tokenizer(@Nullable String value) {
			this.tokenizer = value;
			return self();
		}

		/**
		 * If <code>true</code> allows reloading search analyzers to pick up changes to
		 * synonym files. Only to be used for search analyzers. Defaults to
		 * <code>false</code>.
		 * <p>
		 * API name: {@code updateable}
		 */
		public final BuilderT updateable(@Nullable Boolean value) {
			this.updateable = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupSynonymTokenFilterBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(AbstractBuilder::expand, JsonpDeserializer.booleanDeserializer(), "expand");
		op.add(AbstractBuilder::format, SynonymFormat._DESERIALIZER, "format");
		op.add(AbstractBuilder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");
		op.add(AbstractBuilder::synonyms, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"synonyms");
		op.add(AbstractBuilder::synonymsPath, JsonpDeserializer.stringDeserializer(), "synonyms_path");
		op.add(AbstractBuilder::synonymsSet, JsonpDeserializer.stringDeserializer(), "synonyms_set");
		op.add(AbstractBuilder::tokenizer, JsonpDeserializer.stringDeserializer(), "tokenizer");
		op.add(AbstractBuilder::updateable, JsonpDeserializer.booleanDeserializer(), "updateable");

	}

}
