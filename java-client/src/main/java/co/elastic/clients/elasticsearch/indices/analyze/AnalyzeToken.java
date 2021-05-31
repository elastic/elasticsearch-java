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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.analyze.AnalyzeToken
public final class AnalyzeToken implements ToJsonp {
	private final Number endOffset;

	private final Number position;

	@Nullable
	private final Number positionLength;

	private final Number startOffset;

	private final String token;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected AnalyzeToken(Builder builder) {

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
	public Number endOffset() {
		return this.endOffset;
	}

	/**
	 * API name: {@code position}
	 */
	public Number position() {
		return this.position;
	}

	/**
	 * API name: {@code position_length}
	 */
	@Nullable
	public Number positionLength() {
		return this.positionLength;
	}

	/**
	 * API name: {@code start_offset}
	 */
	public Number startOffset() {
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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("end_offset");
		generator.write(this.endOffset.doubleValue());

		generator.writeKey("position");
		generator.write(this.position.doubleValue());

		if (this.positionLength != null) {

			generator.writeKey("position_length");
			generator.write(this.positionLength.doubleValue());

		}

		generator.writeKey("start_offset");
		generator.write(this.startOffset.doubleValue());

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
		private Number endOffset;

		private Number position;

		@Nullable
		private Number positionLength;

		private Number startOffset;

		private String token;

		private String type;

		/**
		 * API name: {@code end_offset}
		 */
		public Builder endOffset(Number value) {
			this.endOffset = value;
			return this;
		}

		/**
		 * API name: {@code position}
		 */
		public Builder position(Number value) {
			this.position = value;
			return this;
		}

		/**
		 * API name: {@code position_length}
		 */
		public Builder positionLength(@Nullable Number value) {
			this.positionLength = value;
			return this;
		}

		/**
		 * API name: {@code start_offset}
		 */
		public Builder startOffset(Number value) {
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
	 * Json parser for AnalyzeToken
	 */
	public static final JsonpValueParser<AnalyzeToken> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, AnalyzeToken::setupAnalyzeTokenParser);

	protected static void setupAnalyzeTokenParser(DelegatingJsonpValueParser<AnalyzeToken.Builder> op) {

		op.add(Builder::endOffset, JsonpValueParser.numberParser(), "end_offset");
		op.add(Builder::position, JsonpValueParser.numberParser(), "position");
		op.add(Builder::positionLength, JsonpValueParser.numberParser(), "position_length");
		op.add(Builder::startOffset, JsonpValueParser.numberParser(), "start_offset");
		op.add(Builder::token, JsonpValueParser.stringParser(), "token");
		op.add(Builder::type, JsonpValueParser.stringParser(), "type");

	}

}
