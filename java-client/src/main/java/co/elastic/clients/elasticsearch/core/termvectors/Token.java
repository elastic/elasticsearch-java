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

package co.elastic.clients.elasticsearch.core.termvectors;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.termvectors.Token
@JsonpDeserializable
public final class Token implements JsonpSerializable {
	@Nullable
	private final Integer endOffset;

	@Nullable
	private final String payload;

	private final int position;

	@Nullable
	private final Integer startOffset;

	// ---------------------------------------------------------------------------------------------

	public Token(Builder builder) {

		this.endOffset = builder.endOffset;
		this.payload = builder.payload;
		this.position = Objects.requireNonNull(builder.position, "position");
		this.startOffset = builder.startOffset;

	}

	public Token(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code end_offset}
	 */
	@Nullable
	public Integer endOffset() {
		return this.endOffset;
	}

	/**
	 * API name: {@code payload}
	 */
	@Nullable
	public String payload() {
		return this.payload;
	}

	/**
	 * Required - API name: {@code position}
	 */
	public int position() {
		return this.position;
	}

	/**
	 * API name: {@code start_offset}
	 */
	@Nullable
	public Integer startOffset() {
		return this.startOffset;
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

		if (this.endOffset != null) {

			generator.writeKey("end_offset");
			generator.write(this.endOffset);

		}
		if (this.payload != null) {

			generator.writeKey("payload");
			generator.write(this.payload);

		}

		generator.writeKey("position");
		generator.write(this.position);

		if (this.startOffset != null) {

			generator.writeKey("start_offset");
			generator.write(this.startOffset);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Token}.
	 */
	public static class Builder implements ObjectBuilder<Token> {
		@Nullable
		private Integer endOffset;

		@Nullable
		private String payload;

		private Integer position;

		@Nullable
		private Integer startOffset;

		/**
		 * API name: {@code end_offset}
		 */
		public Builder endOffset(@Nullable Integer value) {
			this.endOffset = value;
			return this;
		}

		/**
		 * API name: {@code payload}
		 */
		public Builder payload(@Nullable String value) {
			this.payload = value;
			return this;
		}

		/**
		 * Required - API name: {@code position}
		 */
		public Builder position(int value) {
			this.position = value;
			return this;
		}

		/**
		 * API name: {@code start_offset}
		 */
		public Builder startOffset(@Nullable Integer value) {
			this.startOffset = value;
			return this;
		}

		/**
		 * Builds a {@link Token}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Token build() {

			return new Token(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Token}
	 */
	public static final JsonpDeserializer<Token> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Token::setupTokenDeserializer, Builder::build);

	protected static void setupTokenDeserializer(DelegatingDeserializer<Token.Builder> op) {

		op.add(Builder::endOffset, JsonpDeserializer.integerDeserializer(), "end_offset");
		op.add(Builder::payload, JsonpDeserializer.stringDeserializer(), "payload");
		op.add(Builder::position, JsonpDeserializer.integerDeserializer(), "position");
		op.add(Builder::startOffset, JsonpDeserializer.integerDeserializer(), "start_offset");

	}

}
