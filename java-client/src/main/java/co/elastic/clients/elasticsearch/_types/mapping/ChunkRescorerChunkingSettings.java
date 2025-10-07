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

package co.elastic.clients.elasticsearch._types.mapping;

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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: _types.mapping.ChunkRescorerChunkingSettings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.ChunkRescorerChunkingSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChunkRescorerChunkingSettings implements JsonpSerializable {
	@Nullable
	private final String strategy;

	@Nullable
	private final String separatorGroup;

	private final List<String> separators;

	private final int maxChunkSize;

	@Nullable
	private final Integer overlap;

	@Nullable
	private final Integer sentenceOverlap;

	// ---------------------------------------------------------------------------------------------

	private ChunkRescorerChunkingSettings(Builder builder) {

		this.strategy = builder.strategy;
		this.separatorGroup = builder.separatorGroup;
		this.separators = ApiTypeHelper.unmodifiable(builder.separators);
		this.maxChunkSize = ApiTypeHelper.requireNonNull(builder.maxChunkSize, this, "maxChunkSize", 0);
		this.overlap = builder.overlap;
		this.sentenceOverlap = builder.sentenceOverlap;

	}

	public static ChunkRescorerChunkingSettings of(Function<Builder, ObjectBuilder<ChunkRescorerChunkingSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The chunking strategy: <code>sentence</code>, <code>word</code>,
	 * <code>none</code> or <code>recursive</code>.
	 * <ul>
	 * <li>If <code>strategy</code> is set to <code>recursive</code>, you must also
	 * specify:</li>
	 * </ul>
	 * <ul>
	 * <li><code>max_chunk_size</code></li>
	 * <li>either <code>separators</code> or<code>separator_group</code></li>
	 * </ul>
	 * <p>
	 * Learn more about different chunking strategies in the linked documentation.
	 * <p>
	 * API name: {@code strategy}
	 */
	@Nullable
	public final String strategy() {
		return this.strategy;
	}

	/**
	 * Only applicable to the <code>recursive</code> strategy and required when
	 * using it.
	 * <p>
	 * Sets a predefined list of separators in the saved chunking settings based on
	 * the selected text type. Values can be <code>markdown</code> or
	 * <code>plaintext</code>.
	 * <p>
	 * Using this parameter is an alternative to manually specifying a custom
	 * <code>separators</code> list.
	 * <p>
	 * API name: {@code separator_group}
	 */
	@Nullable
	public final String separatorGroup() {
		return this.separatorGroup;
	}

	/**
	 * Only applicable to the <code>recursive</code> strategy and required when
	 * using it.
	 * <p>
	 * A list of strings used as possible split points when chunking text.
	 * <p>
	 * Each string can be a plain string or a regular expression (regex) pattern.
	 * The system tries each separator in order to split the text, starting from the
	 * first item in the list.
	 * <p>
	 * After splitting, it attempts to recombine smaller pieces into larger chunks
	 * that stay within the <code>max_chunk_size</code> limit, to reduce the total
	 * number of chunks generated.
	 * <p>
	 * API name: {@code separators}
	 */
	public final List<String> separators() {
		return this.separators;
	}

	/**
	 * Required - The maximum size of a chunk in words. This value cannot be lower
	 * than <code>20</code> (for <code>sentence</code> strategy) or <code>10</code>
	 * (for <code>word</code> strategy). This value should not exceed the window
	 * size for the associated model.
	 * <p>
	 * API name: {@code max_chunk_size}
	 */
	public final int maxChunkSize() {
		return this.maxChunkSize;
	}

	/**
	 * The number of overlapping words for chunks. It is applicable only to a
	 * <code>word</code> chunking strategy. This value cannot be higher than half
	 * the <code>max_chunk_size</code> value.
	 * <p>
	 * API name: {@code overlap}
	 */
	@Nullable
	public final Integer overlap() {
		return this.overlap;
	}

	/**
	 * The number of overlapping sentences for chunks. It is applicable only for a
	 * <code>sentence</code> chunking strategy. It can be either <code>1</code> or
	 * <code>0</code>.
	 * <p>
	 * API name: {@code sentence_overlap}
	 */
	@Nullable
	public final Integer sentenceOverlap() {
		return this.sentenceOverlap;
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

		if (this.strategy != null) {
			generator.writeKey("strategy");
			generator.write(this.strategy);

		}
		if (this.separatorGroup != null) {
			generator.writeKey("separator_group");
			generator.write(this.separatorGroup);

		}
		if (ApiTypeHelper.isDefined(this.separators)) {
			generator.writeKey("separators");
			generator.writeStartArray();
			for (String item0 : this.separators) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("max_chunk_size");
		generator.write(this.maxChunkSize);

		if (this.overlap != null) {
			generator.writeKey("overlap");
			generator.write(this.overlap);

		}
		if (this.sentenceOverlap != null) {
			generator.writeKey("sentence_overlap");
			generator.write(this.sentenceOverlap);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChunkRescorerChunkingSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ChunkRescorerChunkingSettings> {
		@Nullable
		private String strategy;

		@Nullable
		private String separatorGroup;

		@Nullable
		private List<String> separators;

		private Integer maxChunkSize;

		@Nullable
		private Integer overlap;

		@Nullable
		private Integer sentenceOverlap;

		/**
		 * The chunking strategy: <code>sentence</code>, <code>word</code>,
		 * <code>none</code> or <code>recursive</code>.
		 * <ul>
		 * <li>If <code>strategy</code> is set to <code>recursive</code>, you must also
		 * specify:</li>
		 * </ul>
		 * <ul>
		 * <li><code>max_chunk_size</code></li>
		 * <li>either <code>separators</code> or<code>separator_group</code></li>
		 * </ul>
		 * <p>
		 * Learn more about different chunking strategies in the linked documentation.
		 * <p>
		 * API name: {@code strategy}
		 */
		public final Builder strategy(@Nullable String value) {
			this.strategy = value;
			return this;
		}

		/**
		 * Only applicable to the <code>recursive</code> strategy and required when
		 * using it.
		 * <p>
		 * Sets a predefined list of separators in the saved chunking settings based on
		 * the selected text type. Values can be <code>markdown</code> or
		 * <code>plaintext</code>.
		 * <p>
		 * Using this parameter is an alternative to manually specifying a custom
		 * <code>separators</code> list.
		 * <p>
		 * API name: {@code separator_group}
		 */
		public final Builder separatorGroup(@Nullable String value) {
			this.separatorGroup = value;
			return this;
		}

		/**
		 * Only applicable to the <code>recursive</code> strategy and required when
		 * using it.
		 * <p>
		 * A list of strings used as possible split points when chunking text.
		 * <p>
		 * Each string can be a plain string or a regular expression (regex) pattern.
		 * The system tries each separator in order to split the text, starting from the
		 * first item in the list.
		 * <p>
		 * After splitting, it attempts to recombine smaller pieces into larger chunks
		 * that stay within the <code>max_chunk_size</code> limit, to reduce the total
		 * number of chunks generated.
		 * <p>
		 * API name: {@code separators}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>separators</code>.
		 */
		public final Builder separators(List<String> list) {
			this.separators = _listAddAll(this.separators, list);
			return this;
		}

		/**
		 * Only applicable to the <code>recursive</code> strategy and required when
		 * using it.
		 * <p>
		 * A list of strings used as possible split points when chunking text.
		 * <p>
		 * Each string can be a plain string or a regular expression (regex) pattern.
		 * The system tries each separator in order to split the text, starting from the
		 * first item in the list.
		 * <p>
		 * After splitting, it attempts to recombine smaller pieces into larger chunks
		 * that stay within the <code>max_chunk_size</code> limit, to reduce the total
		 * number of chunks generated.
		 * <p>
		 * API name: {@code separators}
		 * <p>
		 * Adds one or more values to <code>separators</code>.
		 */
		public final Builder separators(String value, String... values) {
			this.separators = _listAdd(this.separators, value, values);
			return this;
		}

		/**
		 * Required - The maximum size of a chunk in words. This value cannot be lower
		 * than <code>20</code> (for <code>sentence</code> strategy) or <code>10</code>
		 * (for <code>word</code> strategy). This value should not exceed the window
		 * size for the associated model.
		 * <p>
		 * API name: {@code max_chunk_size}
		 */
		public final Builder maxChunkSize(int value) {
			this.maxChunkSize = value;
			return this;
		}

		/**
		 * The number of overlapping words for chunks. It is applicable only to a
		 * <code>word</code> chunking strategy. This value cannot be higher than half
		 * the <code>max_chunk_size</code> value.
		 * <p>
		 * API name: {@code overlap}
		 */
		public final Builder overlap(@Nullable Integer value) {
			this.overlap = value;
			return this;
		}

		/**
		 * The number of overlapping sentences for chunks. It is applicable only for a
		 * <code>sentence</code> chunking strategy. It can be either <code>1</code> or
		 * <code>0</code>.
		 * <p>
		 * API name: {@code sentence_overlap}
		 */
		public final Builder sentenceOverlap(@Nullable Integer value) {
			this.sentenceOverlap = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChunkRescorerChunkingSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChunkRescorerChunkingSettings build() {
			_checkSingleUse();

			return new ChunkRescorerChunkingSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChunkRescorerChunkingSettings}
	 */
	public static final JsonpDeserializer<ChunkRescorerChunkingSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChunkRescorerChunkingSettings::setupChunkRescorerChunkingSettingsDeserializer);

	protected static void setupChunkRescorerChunkingSettingsDeserializer(
			ObjectDeserializer<ChunkRescorerChunkingSettings.Builder> op) {

		op.add(Builder::strategy, JsonpDeserializer.stringDeserializer(), "strategy");
		op.add(Builder::separatorGroup, JsonpDeserializer.stringDeserializer(), "separator_group");
		op.add(Builder::separators, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"separators");
		op.add(Builder::maxChunkSize, JsonpDeserializer.integerDeserializer(), "max_chunk_size");
		op.add(Builder::overlap, JsonpDeserializer.integerDeserializer(), "overlap");
		op.add(Builder::sentenceOverlap, JsonpDeserializer.integerDeserializer(), "sentence_overlap");

	}

}
