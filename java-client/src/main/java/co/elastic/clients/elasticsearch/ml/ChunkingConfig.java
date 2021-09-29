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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.ChunkingConfig
@JsonpDeserializable
public final class ChunkingConfig implements JsonpSerializable {
	private final ChunkingMode mode;

	@Nullable
	private final String timeSpan;

	// ---------------------------------------------------------------------------------------------

	public ChunkingConfig(Builder builder) {

		this.mode = Objects.requireNonNull(builder.mode, "mode");
		this.timeSpan = builder.timeSpan;

	}

	public ChunkingConfig(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * If the mode is <code>auto</code>, the chunk size is dynamically calculated;
	 * this is the recommended value when the datafeed does not use aggregations. If
	 * the mode is <code>manual</code>, chunking is applied according to the
	 * specified <code>time_span</code>; use this mode when the datafeed uses
	 * aggregations. If the mode is <code>off</code>, no chunking is applied.
	 * <p>
	 * API name: {@code mode}
	 */
	public ChunkingMode mode() {
		return this.mode;
	}

	/**
	 * The time span that each search will be querying. This setting is only
	 * applicable when the <code>mode</code> is set to <code>manual</code>.
	 * <p>
	 * API name: {@code time_span}
	 */
	@Nullable
	public String timeSpan() {
		return this.timeSpan;
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

		generator.writeKey("mode");
		this.mode.serialize(generator, mapper);
		if (this.timeSpan != null) {

			generator.writeKey("time_span");
			generator.write(this.timeSpan);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChunkingConfig}.
	 */
	public static class Builder implements ObjectBuilder<ChunkingConfig> {
		private ChunkingMode mode;

		@Nullable
		private String timeSpan;

		/**
		 * If the mode is <code>auto</code>, the chunk size is dynamically calculated;
		 * this is the recommended value when the datafeed does not use aggregations. If
		 * the mode is <code>manual</code>, chunking is applied according to the
		 * specified <code>time_span</code>; use this mode when the datafeed uses
		 * aggregations. If the mode is <code>off</code>, no chunking is applied.
		 * <p>
		 * API name: {@code mode}
		 */
		public Builder mode(ChunkingMode value) {
			this.mode = value;
			return this;
		}

		/**
		 * The time span that each search will be querying. This setting is only
		 * applicable when the <code>mode</code> is set to <code>manual</code>.
		 * <p>
		 * API name: {@code time_span}
		 */
		public Builder timeSpan(@Nullable String value) {
			this.timeSpan = value;
			return this;
		}

		/**
		 * Builds a {@link ChunkingConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChunkingConfig build() {

			return new ChunkingConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChunkingConfig}
	 */
	public static final JsonpDeserializer<ChunkingConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ChunkingConfig::setupChunkingConfigDeserializer, Builder::build);

	protected static void setupChunkingConfigDeserializer(DelegatingDeserializer<ChunkingConfig.Builder> op) {

		op.add(Builder::mode, ChunkingMode._DESERIALIZER, "mode");
		op.add(Builder::timeSpan, JsonpDeserializer.stringDeserializer(), "time_span");

	}

}
