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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.CharFilterTypes
@JsonpDeserializable
public final class CharFilterTypes implements JsonpSerializable {
	private final List<FieldTypes> charFilterTypes;

	private final List<FieldTypes> tokenizerTypes;

	private final List<FieldTypes> filterTypes;

	private final List<FieldTypes> analyzerTypes;

	private final List<FieldTypes> builtInCharFilters;

	private final List<FieldTypes> builtInTokenizers;

	private final List<FieldTypes> builtInFilters;

	private final List<FieldTypes> builtInAnalyzers;

	// ---------------------------------------------------------------------------------------------

	public CharFilterTypes(Builder builder) {

		this.charFilterTypes = ModelTypeHelper.unmodifiableNonNull(builder.charFilterTypes, "char_filter_types");
		this.tokenizerTypes = ModelTypeHelper.unmodifiableNonNull(builder.tokenizerTypes, "tokenizer_types");
		this.filterTypes = ModelTypeHelper.unmodifiableNonNull(builder.filterTypes, "filter_types");
		this.analyzerTypes = ModelTypeHelper.unmodifiableNonNull(builder.analyzerTypes, "analyzer_types");
		this.builtInCharFilters = ModelTypeHelper.unmodifiableNonNull(builder.builtInCharFilters,
				"built_in_char_filters");
		this.builtInTokenizers = ModelTypeHelper.unmodifiableNonNull(builder.builtInTokenizers, "built_in_tokenizers");
		this.builtInFilters = ModelTypeHelper.unmodifiableNonNull(builder.builtInFilters, "built_in_filters");
		this.builtInAnalyzers = ModelTypeHelper.unmodifiableNonNull(builder.builtInAnalyzers, "built_in_analyzers");

	}

	public CharFilterTypes(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code char_filter_types}
	 */
	public List<FieldTypes> charFilterTypes() {
		return this.charFilterTypes;
	}

	/**
	 * Required - API name: {@code tokenizer_types}
	 */
	public List<FieldTypes> tokenizerTypes() {
		return this.tokenizerTypes;
	}

	/**
	 * Required - API name: {@code filter_types}
	 */
	public List<FieldTypes> filterTypes() {
		return this.filterTypes;
	}

	/**
	 * Required - API name: {@code analyzer_types}
	 */
	public List<FieldTypes> analyzerTypes() {
		return this.analyzerTypes;
	}

	/**
	 * Required - API name: {@code built_in_char_filters}
	 */
	public List<FieldTypes> builtInCharFilters() {
		return this.builtInCharFilters;
	}

	/**
	 * Required - API name: {@code built_in_tokenizers}
	 */
	public List<FieldTypes> builtInTokenizers() {
		return this.builtInTokenizers;
	}

	/**
	 * Required - API name: {@code built_in_filters}
	 */
	public List<FieldTypes> builtInFilters() {
		return this.builtInFilters;
	}

	/**
	 * Required - API name: {@code built_in_analyzers}
	 */
	public List<FieldTypes> builtInAnalyzers() {
		return this.builtInAnalyzers;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("char_filter_types");
		generator.writeStartArray();
		for (FieldTypes item0 : this.charFilterTypes) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("tokenizer_types");
		generator.writeStartArray();
		for (FieldTypes item0 : this.tokenizerTypes) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("filter_types");
		generator.writeStartArray();
		for (FieldTypes item0 : this.filterTypes) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("analyzer_types");
		generator.writeStartArray();
		for (FieldTypes item0 : this.analyzerTypes) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("built_in_char_filters");
		generator.writeStartArray();
		for (FieldTypes item0 : this.builtInCharFilters) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("built_in_tokenizers");
		generator.writeStartArray();
		for (FieldTypes item0 : this.builtInTokenizers) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("built_in_filters");
		generator.writeStartArray();
		for (FieldTypes item0 : this.builtInFilters) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("built_in_analyzers");
		generator.writeStartArray();
		for (FieldTypes item0 : this.builtInAnalyzers) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CharFilterTypes}.
	 */
	public static class Builder implements ObjectBuilder<CharFilterTypes> {
		private List<FieldTypes> charFilterTypes;

		private List<FieldTypes> tokenizerTypes;

		private List<FieldTypes> filterTypes;

		private List<FieldTypes> analyzerTypes;

		private List<FieldTypes> builtInCharFilters;

		private List<FieldTypes> builtInTokenizers;

		private List<FieldTypes> builtInFilters;

		private List<FieldTypes> builtInAnalyzers;

		/**
		 * Required - API name: {@code char_filter_types}
		 */
		public Builder charFilterTypes(List<FieldTypes> value) {
			this.charFilterTypes = value;
			return this;
		}

		/**
		 * Required - API name: {@code char_filter_types}
		 */
		public Builder charFilterTypes(FieldTypes... value) {
			this.charFilterTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #charFilterTypes(List)}, creating the list if needed.
		 */
		public Builder addCharFilterTypes(FieldTypes value) {
			if (this.charFilterTypes == null) {
				this.charFilterTypes = new ArrayList<>();
			}
			this.charFilterTypes.add(value);
			return this;
		}

		/**
		 * Set {@link #charFilterTypes(List)} to a singleton list.
		 */
		public Builder charFilterTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.charFilterTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Add a value to {@link #charFilterTypes(List)}, creating the list if needed.
		 */
		public Builder addCharFilterTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.addCharFilterTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Required - API name: {@code tokenizer_types}
		 */
		public Builder tokenizerTypes(List<FieldTypes> value) {
			this.tokenizerTypes = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokenizer_types}
		 */
		public Builder tokenizerTypes(FieldTypes... value) {
			this.tokenizerTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tokenizerTypes(List)}, creating the list if needed.
		 */
		public Builder addTokenizerTypes(FieldTypes value) {
			if (this.tokenizerTypes == null) {
				this.tokenizerTypes = new ArrayList<>();
			}
			this.tokenizerTypes.add(value);
			return this;
		}

		/**
		 * Set {@link #tokenizerTypes(List)} to a singleton list.
		 */
		public Builder tokenizerTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.tokenizerTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Add a value to {@link #tokenizerTypes(List)}, creating the list if needed.
		 */
		public Builder addTokenizerTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.addTokenizerTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Required - API name: {@code filter_types}
		 */
		public Builder filterTypes(List<FieldTypes> value) {
			this.filterTypes = value;
			return this;
		}

		/**
		 * Required - API name: {@code filter_types}
		 */
		public Builder filterTypes(FieldTypes... value) {
			this.filterTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filterTypes(List)}, creating the list if needed.
		 */
		public Builder addFilterTypes(FieldTypes value) {
			if (this.filterTypes == null) {
				this.filterTypes = new ArrayList<>();
			}
			this.filterTypes.add(value);
			return this;
		}

		/**
		 * Set {@link #filterTypes(List)} to a singleton list.
		 */
		public Builder filterTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.filterTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Add a value to {@link #filterTypes(List)}, creating the list if needed.
		 */
		public Builder addFilterTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.addFilterTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Required - API name: {@code analyzer_types}
		 */
		public Builder analyzerTypes(List<FieldTypes> value) {
			this.analyzerTypes = value;
			return this;
		}

		/**
		 * Required - API name: {@code analyzer_types}
		 */
		public Builder analyzerTypes(FieldTypes... value) {
			this.analyzerTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #analyzerTypes(List)}, creating the list if needed.
		 */
		public Builder addAnalyzerTypes(FieldTypes value) {
			if (this.analyzerTypes == null) {
				this.analyzerTypes = new ArrayList<>();
			}
			this.analyzerTypes.add(value);
			return this;
		}

		/**
		 * Set {@link #analyzerTypes(List)} to a singleton list.
		 */
		public Builder analyzerTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.analyzerTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Add a value to {@link #analyzerTypes(List)}, creating the list if needed.
		 */
		public Builder addAnalyzerTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.addAnalyzerTypes(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Required - API name: {@code built_in_char_filters}
		 */
		public Builder builtInCharFilters(List<FieldTypes> value) {
			this.builtInCharFilters = value;
			return this;
		}

		/**
		 * Required - API name: {@code built_in_char_filters}
		 */
		public Builder builtInCharFilters(FieldTypes... value) {
			this.builtInCharFilters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #builtInCharFilters(List)}, creating the list if
		 * needed.
		 */
		public Builder addBuiltInCharFilters(FieldTypes value) {
			if (this.builtInCharFilters == null) {
				this.builtInCharFilters = new ArrayList<>();
			}
			this.builtInCharFilters.add(value);
			return this;
		}

		/**
		 * Set {@link #builtInCharFilters(List)} to a singleton list.
		 */
		public Builder builtInCharFilters(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.builtInCharFilters(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Add a value to {@link #builtInCharFilters(List)}, creating the list if
		 * needed.
		 */
		public Builder addBuiltInCharFilters(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.addBuiltInCharFilters(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Required - API name: {@code built_in_tokenizers}
		 */
		public Builder builtInTokenizers(List<FieldTypes> value) {
			this.builtInTokenizers = value;
			return this;
		}

		/**
		 * Required - API name: {@code built_in_tokenizers}
		 */
		public Builder builtInTokenizers(FieldTypes... value) {
			this.builtInTokenizers = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #builtInTokenizers(List)}, creating the list if needed.
		 */
		public Builder addBuiltInTokenizers(FieldTypes value) {
			if (this.builtInTokenizers == null) {
				this.builtInTokenizers = new ArrayList<>();
			}
			this.builtInTokenizers.add(value);
			return this;
		}

		/**
		 * Set {@link #builtInTokenizers(List)} to a singleton list.
		 */
		public Builder builtInTokenizers(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.builtInTokenizers(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Add a value to {@link #builtInTokenizers(List)}, creating the list if needed.
		 */
		public Builder addBuiltInTokenizers(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.addBuiltInTokenizers(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Required - API name: {@code built_in_filters}
		 */
		public Builder builtInFilters(List<FieldTypes> value) {
			this.builtInFilters = value;
			return this;
		}

		/**
		 * Required - API name: {@code built_in_filters}
		 */
		public Builder builtInFilters(FieldTypes... value) {
			this.builtInFilters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #builtInFilters(List)}, creating the list if needed.
		 */
		public Builder addBuiltInFilters(FieldTypes value) {
			if (this.builtInFilters == null) {
				this.builtInFilters = new ArrayList<>();
			}
			this.builtInFilters.add(value);
			return this;
		}

		/**
		 * Set {@link #builtInFilters(List)} to a singleton list.
		 */
		public Builder builtInFilters(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.builtInFilters(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Add a value to {@link #builtInFilters(List)}, creating the list if needed.
		 */
		public Builder addBuiltInFilters(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.addBuiltInFilters(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Required - API name: {@code built_in_analyzers}
		 */
		public Builder builtInAnalyzers(List<FieldTypes> value) {
			this.builtInAnalyzers = value;
			return this;
		}

		/**
		 * Required - API name: {@code built_in_analyzers}
		 */
		public Builder builtInAnalyzers(FieldTypes... value) {
			this.builtInAnalyzers = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #builtInAnalyzers(List)}, creating the list if needed.
		 */
		public Builder addBuiltInAnalyzers(FieldTypes value) {
			if (this.builtInAnalyzers == null) {
				this.builtInAnalyzers = new ArrayList<>();
			}
			this.builtInAnalyzers.add(value);
			return this;
		}

		/**
		 * Set {@link #builtInAnalyzers(List)} to a singleton list.
		 */
		public Builder builtInAnalyzers(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.builtInAnalyzers(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Add a value to {@link #builtInAnalyzers(List)}, creating the list if needed.
		 */
		public Builder addBuiltInAnalyzers(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn) {
			return this.addBuiltInAnalyzers(fn.apply(new FieldTypes.Builder()).build());
		}

		/**
		 * Builds a {@link CharFilterTypes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CharFilterTypes build() {

			return new CharFilterTypes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CharFilterTypes}
	 */
	public static final JsonpDeserializer<CharFilterTypes> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CharFilterTypes::setupCharFilterTypesDeserializer, Builder::build);

	protected static void setupCharFilterTypesDeserializer(DelegatingDeserializer<CharFilterTypes.Builder> op) {

		op.add(Builder::charFilterTypes, JsonpDeserializer.arrayDeserializer(FieldTypes._DESERIALIZER),
				"char_filter_types");
		op.add(Builder::tokenizerTypes, JsonpDeserializer.arrayDeserializer(FieldTypes._DESERIALIZER),
				"tokenizer_types");
		op.add(Builder::filterTypes, JsonpDeserializer.arrayDeserializer(FieldTypes._DESERIALIZER), "filter_types");
		op.add(Builder::analyzerTypes, JsonpDeserializer.arrayDeserializer(FieldTypes._DESERIALIZER), "analyzer_types");
		op.add(Builder::builtInCharFilters, JsonpDeserializer.arrayDeserializer(FieldTypes._DESERIALIZER),
				"built_in_char_filters");
		op.add(Builder::builtInTokenizers, JsonpDeserializer.arrayDeserializer(FieldTypes._DESERIALIZER),
				"built_in_tokenizers");
		op.add(Builder::builtInFilters, JsonpDeserializer.arrayDeserializer(FieldTypes._DESERIALIZER),
				"built_in_filters");
		op.add(Builder::builtInAnalyzers, JsonpDeserializer.arrayDeserializer(FieldTypes._DESERIALIZER),
				"built_in_analyzers");

	}

}
