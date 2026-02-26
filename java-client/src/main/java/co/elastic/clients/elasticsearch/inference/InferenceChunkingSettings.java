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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
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

// typedef: inference._types.InferenceChunkingSettings

/**
 * Chunking configuration object
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.InferenceChunkingSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceChunkingSettings implements JsonpSerializable {
	@Nullable
	private final Integer maxChunkSize;

	@Nullable
	private final Integer overlap;

	@Nullable
	private final Integer sentenceOverlap;

	@Nullable
	private final String strategy;

	// ---------------------------------------------------------------------------------------------

	private InferenceChunkingSettings(Builder builder) {

		this.maxChunkSize = builder.maxChunkSize;
		this.overlap = builder.overlap;
		this.sentenceOverlap = builder.sentenceOverlap;
		this.strategy = builder.strategy;

	}

	public static InferenceChunkingSettings of(Function<Builder, ObjectBuilder<InferenceChunkingSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The maximum size of a chunk in words. This value cannot be higher than
	 * <code>300</code> or lower than <code>20</code> (for <code>sentence</code>
	 * strategy) or <code>10</code> (for <code>word</code> strategy).
	 * <p>
	 * API name: {@code max_chunk_size}
	 */
	@Nullable
	public final Integer maxChunkSize() {
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
	 * The chunking strategy: <code>sentence</code> or <code>word</code>.
	 * <p>
	 * API name: {@code strategy}
	 */
	@Nullable
	public final String strategy() {
		return this.strategy;
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

		if (this.maxChunkSize != null) {
			generator.writeKey("max_chunk_size");
			generator.write(this.maxChunkSize);

		}
		if (this.overlap != null) {
			generator.writeKey("overlap");
			generator.write(this.overlap);

		}
		if (this.sentenceOverlap != null) {
			generator.writeKey("sentence_overlap");
			generator.write(this.sentenceOverlap);

		}
		if (this.strategy != null) {
			generator.writeKey("strategy");
			generator.write(this.strategy);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceChunkingSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<InferenceChunkingSettings> {
		@Nullable
		private Integer maxChunkSize;

		@Nullable
		private Integer overlap;

		@Nullable
		private Integer sentenceOverlap;

		@Nullable
		private String strategy;

		public Builder() {
		}
		private Builder(InferenceChunkingSettings instance) {
			this.maxChunkSize = instance.maxChunkSize;
			this.overlap = instance.overlap;
			this.sentenceOverlap = instance.sentenceOverlap;
			this.strategy = instance.strategy;

		}
		/**
		 * The maximum size of a chunk in words. This value cannot be higher than
		 * <code>300</code> or lower than <code>20</code> (for <code>sentence</code>
		 * strategy) or <code>10</code> (for <code>word</code> strategy).
		 * <p>
		 * API name: {@code max_chunk_size}
		 */
		public final Builder maxChunkSize(@Nullable Integer value) {
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

		/**
		 * The chunking strategy: <code>sentence</code> or <code>word</code>.
		 * <p>
		 * API name: {@code strategy}
		 */
		public final Builder strategy(@Nullable String value) {
			this.strategy = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceChunkingSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceChunkingSettings build() {
			_checkSingleUse();

			return new InferenceChunkingSettings(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceChunkingSettings}
	 */
	public static final JsonpDeserializer<InferenceChunkingSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceChunkingSettings::setupInferenceChunkingSettingsDeserializer);

	protected static void setupInferenceChunkingSettingsDeserializer(
			ObjectDeserializer<InferenceChunkingSettings.Builder> op) {

		op.add(Builder::maxChunkSize, JsonpDeserializer.integerDeserializer(), "max_chunk_size");
		op.add(Builder::overlap, JsonpDeserializer.integerDeserializer(), "overlap");
		op.add(Builder::sentenceOverlap, JsonpDeserializer.integerDeserializer(), "sentence_overlap");
		op.add(Builder::strategy, JsonpDeserializer.stringDeserializer(), "strategy");

	}

}
