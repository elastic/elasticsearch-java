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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.CustomAnalyzer
@JsonpDeserializable
public class CustomAnalyzer implements AnalyzerVariant, JsonpSerializable {
	private final List<String> charFilter;

	private final List<String> filter;

	@Nullable
	private final Integer positionIncrementGap;

	@Nullable
	private final Integer positionOffsetGap;

	private final String tokenizer;

	// ---------------------------------------------------------------------------------------------

	private CustomAnalyzer(Builder builder) {

		this.charFilter = ModelTypeHelper.unmodifiable(builder.charFilter);
		this.filter = ModelTypeHelper.unmodifiable(builder.filter);
		this.positionIncrementGap = builder.positionIncrementGap;
		this.positionOffsetGap = builder.positionOffsetGap;
		this.tokenizer = ModelTypeHelper.requireNonNull(builder.tokenizer, this, "tokenizer");

	}

	public static CustomAnalyzer of(Function<Builder, ObjectBuilder<CustomAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Analyzer} variant type
	 */
	@Override
	public String _variantType() {
		return "custom";
	}

	/**
	 * API name: {@code char_filter}
	 */
	public final List<String> charFilter() {
		return this.charFilter;
	}

	/**
	 * API name: {@code filter}
	 */
	public final List<String> filter() {
		return this.filter;
	}

	/**
	 * API name: {@code position_increment_gap}
	 */
	@Nullable
	public final Integer positionIncrementGap() {
		return this.positionIncrementGap;
	}

	/**
	 * API name: {@code position_offset_gap}
	 */
	@Nullable
	public final Integer positionOffsetGap() {
		return this.positionOffsetGap;
	}

	/**
	 * Required - API name: {@code tokenizer}
	 */
	public final String tokenizer() {
		return this.tokenizer;
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

		generator.write("type", "custom");

		if (ModelTypeHelper.isDefined(this.charFilter)) {
			generator.writeKey("char_filter");
			generator.writeStartArray();
			for (String item0 : this.charFilter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.filter)) {
			generator.writeKey("filter");
			generator.writeStartArray();
			for (String item0 : this.filter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.positionIncrementGap != null) {
			generator.writeKey("position_increment_gap");
			generator.write(this.positionIncrementGap);

		}
		if (this.positionOffsetGap != null) {
			generator.writeKey("position_offset_gap");
			generator.write(this.positionOffsetGap);

		}
		generator.writeKey("tokenizer");
		generator.write(this.tokenizer);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CustomAnalyzer}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CustomAnalyzer> {
		@Nullable
		private List<String> charFilter;

		@Nullable
		private List<String> filter;

		@Nullable
		private Integer positionIncrementGap;

		@Nullable
		private Integer positionOffsetGap;

		private String tokenizer;

		/**
		 * API name: {@code char_filter}
		 */
		public final Builder charFilter(@Nullable List<String> value) {
			this.charFilter = value;
			return this;
		}

		/**
		 * API name: {@code char_filter}
		 */
		public final Builder charFilter(String... value) {
			this.charFilter = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable List<String> value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(String... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code position_increment_gap}
		 */
		public final Builder positionIncrementGap(@Nullable Integer value) {
			this.positionIncrementGap = value;
			return this;
		}

		/**
		 * API name: {@code position_offset_gap}
		 */
		public final Builder positionOffsetGap(@Nullable Integer value) {
			this.positionOffsetGap = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokenizer}
		 */
		public final Builder tokenizer(String value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * Builds a {@link CustomAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CustomAnalyzer build() {
			_checkSingleUse();

			return new CustomAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CustomAnalyzer}
	 */
	public static final JsonpDeserializer<CustomAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CustomAnalyzer::setupCustomAnalyzerDeserializer, Builder::build);

	protected static void setupCustomAnalyzerDeserializer(DelegatingDeserializer<CustomAnalyzer.Builder> op) {

		op.add(Builder::charFilter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"char_filter");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "filter");
		op.add(Builder::positionIncrementGap, JsonpDeserializer.integerDeserializer(), "position_increment_gap");
		op.add(Builder::positionOffsetGap, JsonpDeserializer.integerDeserializer(), "position_offset_gap");
		op.add(Builder::tokenizer, JsonpDeserializer.stringDeserializer(), "tokenizer");

		op.ignore("type");
	}

}
