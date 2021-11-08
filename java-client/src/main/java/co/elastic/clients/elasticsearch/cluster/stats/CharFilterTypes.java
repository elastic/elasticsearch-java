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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.CharFilterTypes
@JsonpDeserializable
public class CharFilterTypes implements JsonpSerializable {
	private final List<FieldTypes> charFilterTypes;

	private final List<FieldTypes> tokenizerTypes;

	private final List<FieldTypes> filterTypes;

	private final List<FieldTypes> analyzerTypes;

	private final List<FieldTypes> builtInCharFilters;

	private final List<FieldTypes> builtInTokenizers;

	private final List<FieldTypes> builtInFilters;

	private final List<FieldTypes> builtInAnalyzers;

	// ---------------------------------------------------------------------------------------------

	private CharFilterTypes(Builder builder) {

		this.charFilterTypes = ModelTypeHelper.unmodifiableRequired(builder.charFilterTypes, this, "charFilterTypes");
		this.tokenizerTypes = ModelTypeHelper.unmodifiableRequired(builder.tokenizerTypes, this, "tokenizerTypes");
		this.filterTypes = ModelTypeHelper.unmodifiableRequired(builder.filterTypes, this, "filterTypes");
		this.analyzerTypes = ModelTypeHelper.unmodifiableRequired(builder.analyzerTypes, this, "analyzerTypes");
		this.builtInCharFilters = ModelTypeHelper.unmodifiableRequired(builder.builtInCharFilters, this,
				"builtInCharFilters");
		this.builtInTokenizers = ModelTypeHelper.unmodifiableRequired(builder.builtInTokenizers, this,
				"builtInTokenizers");
		this.builtInFilters = ModelTypeHelper.unmodifiableRequired(builder.builtInFilters, this, "builtInFilters");
		this.builtInAnalyzers = ModelTypeHelper.unmodifiableRequired(builder.builtInAnalyzers, this,
				"builtInAnalyzers");

	}

	public static CharFilterTypes of(Function<Builder, ObjectBuilder<CharFilterTypes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code char_filter_types}
	 */
	public final List<FieldTypes> charFilterTypes() {
		return this.charFilterTypes;
	}

	/**
	 * Required - API name: {@code tokenizer_types}
	 */
	public final List<FieldTypes> tokenizerTypes() {
		return this.tokenizerTypes;
	}

	/**
	 * Required - API name: {@code filter_types}
	 */
	public final List<FieldTypes> filterTypes() {
		return this.filterTypes;
	}

	/**
	 * Required - API name: {@code analyzer_types}
	 */
	public final List<FieldTypes> analyzerTypes() {
		return this.analyzerTypes;
	}

	/**
	 * Required - API name: {@code built_in_char_filters}
	 */
	public final List<FieldTypes> builtInCharFilters() {
		return this.builtInCharFilters;
	}

	/**
	 * Required - API name: {@code built_in_tokenizers}
	 */
	public final List<FieldTypes> builtInTokenizers() {
		return this.builtInTokenizers;
	}

	/**
	 * Required - API name: {@code built_in_filters}
	 */
	public final List<FieldTypes> builtInFilters() {
		return this.builtInFilters;
	}

	/**
	 * Required - API name: {@code built_in_analyzers}
	 */
	public final List<FieldTypes> builtInAnalyzers() {
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

		if (ModelTypeHelper.isDefined(this.charFilterTypes)) {
			generator.writeKey("char_filter_types");
			generator.writeStartArray();
			for (FieldTypes item0 : this.charFilterTypes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.tokenizerTypes)) {
			generator.writeKey("tokenizer_types");
			generator.writeStartArray();
			for (FieldTypes item0 : this.tokenizerTypes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.filterTypes)) {
			generator.writeKey("filter_types");
			generator.writeStartArray();
			for (FieldTypes item0 : this.filterTypes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.analyzerTypes)) {
			generator.writeKey("analyzer_types");
			generator.writeStartArray();
			for (FieldTypes item0 : this.analyzerTypes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.builtInCharFilters)) {
			generator.writeKey("built_in_char_filters");
			generator.writeStartArray();
			for (FieldTypes item0 : this.builtInCharFilters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.builtInTokenizers)) {
			generator.writeKey("built_in_tokenizers");
			generator.writeStartArray();
			for (FieldTypes item0 : this.builtInTokenizers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.builtInFilters)) {
			generator.writeKey("built_in_filters");
			generator.writeStartArray();
			for (FieldTypes item0 : this.builtInFilters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.builtInAnalyzers)) {
			generator.writeKey("built_in_analyzers");
			generator.writeStartArray();
			for (FieldTypes item0 : this.builtInAnalyzers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CharFilterTypes}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CharFilterTypes> {
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
		public final Builder charFilterTypes(List<FieldTypes> value) {
			this.charFilterTypes = value;
			return this;
		}

		/**
		 * Required - API name: {@code char_filter_types}
		 */
		public final Builder charFilterTypes(FieldTypes... value) {
			this.charFilterTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code char_filter_types}
		 */
		@SafeVarargs
		public final Builder charFilterTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>>... fns) {
			this.charFilterTypes = new ArrayList<>(fns.length);
			for (Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn : fns) {
				this.charFilterTypes.add(fn.apply(new FieldTypes.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code tokenizer_types}
		 */
		public final Builder tokenizerTypes(List<FieldTypes> value) {
			this.tokenizerTypes = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokenizer_types}
		 */
		public final Builder tokenizerTypes(FieldTypes... value) {
			this.tokenizerTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code tokenizer_types}
		 */
		@SafeVarargs
		public final Builder tokenizerTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>>... fns) {
			this.tokenizerTypes = new ArrayList<>(fns.length);
			for (Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn : fns) {
				this.tokenizerTypes.add(fn.apply(new FieldTypes.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code filter_types}
		 */
		public final Builder filterTypes(List<FieldTypes> value) {
			this.filterTypes = value;
			return this;
		}

		/**
		 * Required - API name: {@code filter_types}
		 */
		public final Builder filterTypes(FieldTypes... value) {
			this.filterTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code filter_types}
		 */
		@SafeVarargs
		public final Builder filterTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>>... fns) {
			this.filterTypes = new ArrayList<>(fns.length);
			for (Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn : fns) {
				this.filterTypes.add(fn.apply(new FieldTypes.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code analyzer_types}
		 */
		public final Builder analyzerTypes(List<FieldTypes> value) {
			this.analyzerTypes = value;
			return this;
		}

		/**
		 * Required - API name: {@code analyzer_types}
		 */
		public final Builder analyzerTypes(FieldTypes... value) {
			this.analyzerTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code analyzer_types}
		 */
		@SafeVarargs
		public final Builder analyzerTypes(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>>... fns) {
			this.analyzerTypes = new ArrayList<>(fns.length);
			for (Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn : fns) {
				this.analyzerTypes.add(fn.apply(new FieldTypes.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code built_in_char_filters}
		 */
		public final Builder builtInCharFilters(List<FieldTypes> value) {
			this.builtInCharFilters = value;
			return this;
		}

		/**
		 * Required - API name: {@code built_in_char_filters}
		 */
		public final Builder builtInCharFilters(FieldTypes... value) {
			this.builtInCharFilters = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code built_in_char_filters}
		 */
		@SafeVarargs
		public final Builder builtInCharFilters(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>>... fns) {
			this.builtInCharFilters = new ArrayList<>(fns.length);
			for (Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn : fns) {
				this.builtInCharFilters.add(fn.apply(new FieldTypes.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code built_in_tokenizers}
		 */
		public final Builder builtInTokenizers(List<FieldTypes> value) {
			this.builtInTokenizers = value;
			return this;
		}

		/**
		 * Required - API name: {@code built_in_tokenizers}
		 */
		public final Builder builtInTokenizers(FieldTypes... value) {
			this.builtInTokenizers = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code built_in_tokenizers}
		 */
		@SafeVarargs
		public final Builder builtInTokenizers(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>>... fns) {
			this.builtInTokenizers = new ArrayList<>(fns.length);
			for (Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn : fns) {
				this.builtInTokenizers.add(fn.apply(new FieldTypes.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code built_in_filters}
		 */
		public final Builder builtInFilters(List<FieldTypes> value) {
			this.builtInFilters = value;
			return this;
		}

		/**
		 * Required - API name: {@code built_in_filters}
		 */
		public final Builder builtInFilters(FieldTypes... value) {
			this.builtInFilters = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code built_in_filters}
		 */
		@SafeVarargs
		public final Builder builtInFilters(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>>... fns) {
			this.builtInFilters = new ArrayList<>(fns.length);
			for (Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn : fns) {
				this.builtInFilters.add(fn.apply(new FieldTypes.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code built_in_analyzers}
		 */
		public final Builder builtInAnalyzers(List<FieldTypes> value) {
			this.builtInAnalyzers = value;
			return this;
		}

		/**
		 * Required - API name: {@code built_in_analyzers}
		 */
		public final Builder builtInAnalyzers(FieldTypes... value) {
			this.builtInAnalyzers = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code built_in_analyzers}
		 */
		@SafeVarargs
		public final Builder builtInAnalyzers(Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>>... fns) {
			this.builtInAnalyzers = new ArrayList<>(fns.length);
			for (Function<FieldTypes.Builder, ObjectBuilder<FieldTypes>> fn : fns) {
				this.builtInAnalyzers.add(fn.apply(new FieldTypes.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link CharFilterTypes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CharFilterTypes build() {
			_checkSingleUse();

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
