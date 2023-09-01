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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.analysis.Analyzer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.HighlightField

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.HighlightField">API
 *      specification</a>
 */
@JsonpDeserializable
public class HighlightField extends HighlightBase {
	@Nullable
	private final Integer fragmentOffset;

	private final List<String> matchedFields;

	@Nullable
	private final Analyzer analyzer;

	// ---------------------------------------------------------------------------------------------

	private HighlightField(Builder builder) {
		super(builder);

		this.fragmentOffset = builder.fragmentOffset;
		this.matchedFields = ApiTypeHelper.unmodifiable(builder.matchedFields);
		this.analyzer = builder.analyzer;

	}

	public static HighlightField of(Function<Builder, ObjectBuilder<HighlightField>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code fragment_offset}
	 */
	@Nullable
	public final Integer fragmentOffset() {
		return this.fragmentOffset;
	}

	/**
	 * API name: {@code matched_fields}
	 */
	public final List<String> matchedFields() {
		return this.matchedFields;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final Analyzer analyzer() {
		return this.analyzer;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.fragmentOffset != null) {
			generator.writeKey("fragment_offset");
			generator.write(this.fragmentOffset);

		}
		if (ApiTypeHelper.isDefined(this.matchedFields)) {
			generator.writeKey("matched_fields");
			generator.writeStartArray();
			for (String item0 : this.matchedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.analyzer != null) {
			generator.writeKey("analyzer");
			this.analyzer.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HighlightField}.
	 */

	public static class Builder extends HighlightBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HighlightField> {
		@Nullable
		private Integer fragmentOffset;

		@Nullable
		private List<String> matchedFields;

		@Nullable
		private Analyzer analyzer;

		/**
		 * API name: {@code fragment_offset}
		 */
		public final Builder fragmentOffset(@Nullable Integer value) {
			this.fragmentOffset = value;
			return this;
		}

		/**
		 * API name: {@code matched_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>matchedFields</code>.
		 */
		public final Builder matchedFields(List<String> list) {
			this.matchedFields = _listAddAll(this.matchedFields, list);
			return this;
		}

		/**
		 * API name: {@code matched_fields}
		 * <p>
		 * Adds one or more values to <code>matchedFields</code>.
		 */
		public final Builder matchedFields(String value, String... values) {
			this.matchedFields = _listAdd(this.matchedFields, value, values);
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable Analyzer value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(Function<Analyzer.Builder, ObjectBuilder<Analyzer>> fn) {
			return this.analyzer(fn.apply(new Analyzer.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HighlightField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HighlightField build() {
			_checkSingleUse();

			return new HighlightField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HighlightField}
	 */
	public static final JsonpDeserializer<HighlightField> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HighlightField::setupHighlightFieldDeserializer);

	protected static void setupHighlightFieldDeserializer(ObjectDeserializer<HighlightField.Builder> op) {
		HighlightBase.setupHighlightBaseDeserializer(op);
		op.add(Builder::fragmentOffset, JsonpDeserializer.integerDeserializer(), "fragment_offset");
		op.add(Builder::matchedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"matched_fields");
		op.add(Builder::analyzer, Analyzer._DESERIALIZER, "analyzer");

	}

}
