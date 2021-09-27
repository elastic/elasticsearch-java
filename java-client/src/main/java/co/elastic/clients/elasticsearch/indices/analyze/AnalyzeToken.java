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

package co.elastic.clients.elasticsearch.indices.analyze;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.analyze.AnalyzeToken
@JsonpDeserializable
public final class AnalyzeToken implements JsonpSerializable {
	private final Long endOffset;

	private final Long position;

	@Nullable
	private final Long positionLength;

	private final Long startOffset;

	private final String token;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	public AnalyzeToken(Builder builder) {

		this.endOffset = Objects.requireNonNull(builder.endOffset, "end_offset");
		this.position = Objects.requireNonNull(builder.position, "position");
		this.positionLength = builder.positionLength;
		this.startOffset = Objects.requireNonNull(builder.startOffset, "start_offset");
		this.token = Objects.requireNonNull(builder.token, "token");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code end_offset}
	 */
	public Long endOffset() {
		return this.endOffset;
	}

	/**
	 * API name: {@code position}
	 */
	public Long position() {
		return this.position;
	}

	/**
	 * API name: {@code position_length}
	 */
	@Nullable
	public Long positionLength() {
		return this.positionLength;
	}

	/**
	 * API name: {@code start_offset}
	 */
	public Long startOffset() {
		return this.startOffset;
	}

	/**
	 * API name: {@code token}
	 */
	public String token() {
		return this.token;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
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

		generator.writeKey("end_offset");
		generator.write(this.endOffset);

		generator.writeKey("position");
		generator.write(this.position);

		if (this.positionLength != null) {

			generator.writeKey("position_length");
			generator.write(this.positionLength);

		}

		generator.writeKey("start_offset");
		generator.write(this.startOffset);

		generator.writeKey("token");
		generator.write(this.token);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyzeToken}.
	 */
	public static class Builder implements ObjectBuilder<AnalyzeToken> {
		private Long endOffset;

		private Long position;

		@Nullable
		private Long positionLength;

		private Long startOffset;

		private String token;

		private String type;

		/**
		 * API name: {@code end_offset}
		 */
		public Builder endOffset(Long value) {
			this.endOffset = value;
			return this;
		}

		/**
		 * API name: {@code position}
		 */
		public Builder position(Long value) {
			this.position = value;
			return this;
		}

		/**
		 * API name: {@code position_length}
		 */
		public Builder positionLength(@Nullable Long value) {
			this.positionLength = value;
			return this;
		}

		/**
		 * API name: {@code start_offset}
		 */
		public Builder startOffset(Long value) {
			this.startOffset = value;
			return this;
		}

		/**
		 * API name: {@code token}
		 */
		public Builder token(String value) {
			this.token = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link AnalyzeToken}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyzeToken build() {

			return new AnalyzeToken(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalyzeToken}
	 */
	public static final JsonpDeserializer<AnalyzeToken> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AnalyzeToken::setupAnalyzeTokenDeserializer, Builder::build);

	protected static void setupAnalyzeTokenDeserializer(DelegatingDeserializer<AnalyzeToken.Builder> op) {

		op.add(Builder::endOffset, JsonpDeserializer.longDeserializer(), "end_offset");
		op.add(Builder::position, JsonpDeserializer.longDeserializer(), "position");
		op.add(Builder::positionLength, JsonpDeserializer.longDeserializer(), "position_length");
		op.add(Builder::startOffset, JsonpDeserializer.longDeserializer(), "start_offset");
		op.add(Builder::token, JsonpDeserializer.stringDeserializer(), "token");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
