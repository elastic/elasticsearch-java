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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.TermSuggestOption

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.TermSuggestOption">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermSuggestOption implements JsonpSerializable {
	private final String text;

	private final double score;

	private final long freq;

	@Nullable
	private final String highlighted;

	@Nullable
	private final Boolean collateMatch;

	// ---------------------------------------------------------------------------------------------

	private TermSuggestOption(Builder builder) {

		this.text = ApiTypeHelper.requireNonNull(builder.text, this, "text");
		this.score = ApiTypeHelper.requireNonNull(builder.score, this, "score");
		this.freq = ApiTypeHelper.requireNonNull(builder.freq, this, "freq");
		this.highlighted = builder.highlighted;
		this.collateMatch = builder.collateMatch;

	}

	public static TermSuggestOption of(Function<Builder, ObjectBuilder<TermSuggestOption>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code text}
	 */
	public final String text() {
		return this.text;
	}

	/**
	 * Required - API name: {@code score}
	 */
	public final double score() {
		return this.score;
	}

	/**
	 * Required - API name: {@code freq}
	 */
	public final long freq() {
		return this.freq;
	}

	/**
	 * API name: {@code highlighted}
	 */
	@Nullable
	public final String highlighted() {
		return this.highlighted;
	}

	/**
	 * API name: {@code collate_match}
	 */
	@Nullable
	public final Boolean collateMatch() {
		return this.collateMatch;
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

		generator.writeKey("text");
		generator.write(this.text);

		generator.writeKey("score");
		generator.write(this.score);

		generator.writeKey("freq");
		generator.write(this.freq);

		if (this.highlighted != null) {
			generator.writeKey("highlighted");
			generator.write(this.highlighted);

		}
		if (this.collateMatch != null) {
			generator.writeKey("collate_match");
			generator.write(this.collateMatch);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermSuggestOption}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TermSuggestOption> {
		private String text;

		private Double score;

		private Long freq;

		@Nullable
		private String highlighted;

		@Nullable
		private Boolean collateMatch;

		/**
		 * Required - API name: {@code text}
		 */
		public final Builder text(String value) {
			this.text = value;
			return this;
		}

		/**
		 * Required - API name: {@code score}
		 */
		public final Builder score(double value) {
			this.score = value;
			return this;
		}

		/**
		 * Required - API name: {@code freq}
		 */
		public final Builder freq(long value) {
			this.freq = value;
			return this;
		}

		/**
		 * API name: {@code highlighted}
		 */
		public final Builder highlighted(@Nullable String value) {
			this.highlighted = value;
			return this;
		}

		/**
		 * API name: {@code collate_match}
		 */
		public final Builder collateMatch(@Nullable Boolean value) {
			this.collateMatch = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermSuggestOption}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermSuggestOption build() {
			_checkSingleUse();

			return new TermSuggestOption(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermSuggestOption}
	 */
	public static final JsonpDeserializer<TermSuggestOption> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TermSuggestOption::setupTermSuggestOptionDeserializer);

	protected static void setupTermSuggestOptionDeserializer(ObjectDeserializer<TermSuggestOption.Builder> op) {

		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
		op.add(Builder::score, JsonpDeserializer.doubleDeserializer(), "score");
		op.add(Builder::freq, JsonpDeserializer.longDeserializer(), "freq");
		op.add(Builder::highlighted, JsonpDeserializer.stringDeserializer(), "highlighted");
		op.add(Builder::collateMatch, JsonpDeserializer.booleanDeserializer(), "collate_match");

	}

}
