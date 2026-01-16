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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.elasticsearch._types.mapping.ChunkRescorerChunkingSettings;
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

// typedef: _types.ChunkRescorer

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.ChunkRescorer">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChunkRescorer implements JsonpSerializable {
	@Nullable
	private final Integer size;

	@Nullable
	private final ChunkRescorerChunkingSettings chunkingSettings;

	// ---------------------------------------------------------------------------------------------

	private ChunkRescorer(Builder builder) {

		this.size = builder.size;
		this.chunkingSettings = builder.chunkingSettings;

	}

	public static ChunkRescorer of(Function<Builder, ObjectBuilder<ChunkRescorer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of chunks per document to evaluate for reranking.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Chunking settings to apply
	 * <p>
	 * API name: {@code chunking_settings}
	 */
	@Nullable
	public final ChunkRescorerChunkingSettings chunkingSettings() {
		return this.chunkingSettings;
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

		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.chunkingSettings != null) {
			generator.writeKey("chunking_settings");
			this.chunkingSettings.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChunkRescorer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ChunkRescorer> {
		@Nullable
		private Integer size;

		@Nullable
		private ChunkRescorerChunkingSettings chunkingSettings;

		public Builder() {
		}
		private Builder(ChunkRescorer instance) {
			this.size = instance.size;
			this.chunkingSettings = instance.chunkingSettings;

		}
		/**
		 * The number of chunks per document to evaluate for reranking.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Chunking settings to apply
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(@Nullable ChunkRescorerChunkingSettings value) {
			this.chunkingSettings = value;
			return this;
		}

		/**
		 * Chunking settings to apply
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(
				Function<ChunkRescorerChunkingSettings.Builder, ObjectBuilder<ChunkRescorerChunkingSettings>> fn) {
			return this.chunkingSettings(fn.apply(new ChunkRescorerChunkingSettings.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChunkRescorer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChunkRescorer build() {
			_checkSingleUse();

			return new ChunkRescorer(this);
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
	 * Json deserializer for {@link ChunkRescorer}
	 */
	public static final JsonpDeserializer<ChunkRescorer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ChunkRescorer::setupChunkRescorerDeserializer);

	protected static void setupChunkRescorerDeserializer(ObjectDeserializer<ChunkRescorer.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::chunkingSettings, ChunkRescorerChunkingSettings._DESERIALIZER, "chunking_settings");

	}

}
