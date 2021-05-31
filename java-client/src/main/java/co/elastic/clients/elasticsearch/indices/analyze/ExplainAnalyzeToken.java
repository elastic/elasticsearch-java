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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.analyze.ExplainAnalyzeToken
public final class ExplainAnalyzeToken implements ToJsonp {
	private final String bytes;

	private final Number endOffset;

	@Nullable
	private final Boolean keyword;

	private final Number position;

	private final Number positionlength;

	private final Number startOffset;

	private final Number termfrequency;

	private final String token;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected ExplainAnalyzeToken(Builder builder) {

		this.bytes = Objects.requireNonNull(builder.bytes, "bytes");
		this.endOffset = Objects.requireNonNull(builder.endOffset, "end_offset");
		this.keyword = builder.keyword;
		this.position = Objects.requireNonNull(builder.position, "position");
		this.positionlength = Objects.requireNonNull(builder.positionlength, "positionLength");
		this.startOffset = Objects.requireNonNull(builder.startOffset, "start_offset");
		this.termfrequency = Objects.requireNonNull(builder.termfrequency, "termFrequency");
		this.token = Objects.requireNonNull(builder.token, "token");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code bytes}
	 */
	public String bytes() {
		return this.bytes;
	}

	/**
	 * API name: {@code end_offset}
	 */
	public Number endOffset() {
		return this.endOffset;
	}

	/**
	 * API name: {@code keyword}
	 */
	@Nullable
	public Boolean keyword() {
		return this.keyword;
	}

	/**
	 * API name: {@code position}
	 */
	public Number position() {
		return this.position;
	}

	/**
	 * API name: {@code positionLength}
	 */
	public Number positionlength() {
		return this.positionlength;
	}

	/**
	 * API name: {@code start_offset}
	 */
	public Number startOffset() {
		return this.startOffset;
	}

	/**
	 * API name: {@code termFrequency}
	 */
	public Number termfrequency() {
		return this.termfrequency;
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

		generator.writeKey("bytes");
		generator.write(this.bytes);

		generator.writeKey("end_offset");
		generator.write(this.endOffset.doubleValue());

		if (this.keyword != null) {

			generator.writeKey("keyword");
			generator.write(this.keyword);

		}

		generator.writeKey("position");
		generator.write(this.position.doubleValue());

		generator.writeKey("positionLength");
		generator.write(this.positionlength.doubleValue());

		generator.writeKey("start_offset");
		generator.write(this.startOffset.doubleValue());

		generator.writeKey("termFrequency");
		generator.write(this.termfrequency.doubleValue());

		generator.writeKey("token");
		generator.write(this.token);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainAnalyzeToken}.
	 */
	public static class Builder implements ObjectBuilder<ExplainAnalyzeToken> {
		private String bytes;

		private Number endOffset;

		@Nullable
		private Boolean keyword;

		private Number position;

		private Number positionlength;

		private Number startOffset;

		private Number termfrequency;

		private String token;

		private String type;

		/**
		 * API name: {@code bytes}
		 */
		public Builder bytes(String value) {
			this.bytes = value;
			return this;
		}

		/**
		 * API name: {@code end_offset}
		 */
		public Builder endOffset(Number value) {
			this.endOffset = value;
			return this;
		}

		/**
		 * API name: {@code keyword}
		 */
		public Builder keyword(@Nullable Boolean value) {
			this.keyword = value;
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
		 * API name: {@code positionLength}
		 */
		public Builder positionlength(Number value) {
			this.positionlength = value;
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
		 * API name: {@code termFrequency}
		 */
		public Builder termfrequency(Number value) {
			this.termfrequency = value;
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
		 * Builds a {@link ExplainAnalyzeToken}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainAnalyzeToken build() {

			return new ExplainAnalyzeToken(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ExplainAnalyzeToken
	 */
	public static final JsonpValueParser<ExplainAnalyzeToken> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ExplainAnalyzeToken::setupExplainAnalyzeTokenParser);

	protected static void setupExplainAnalyzeTokenParser(DelegatingJsonpValueParser<ExplainAnalyzeToken.Builder> op) {

		op.add(Builder::bytes, JsonpValueParser.stringParser(), "bytes");
		op.add(Builder::endOffset, JsonpValueParser.numberParser(), "end_offset");
		op.add(Builder::keyword, JsonpValueParser.booleanParser(), "keyword");
		op.add(Builder::position, JsonpValueParser.numberParser(), "position");
		op.add(Builder::positionlength, JsonpValueParser.numberParser(), "positionLength");
		op.add(Builder::startOffset, JsonpValueParser.numberParser(), "start_offset");
		op.add(Builder::termfrequency, JsonpValueParser.numberParser(), "termFrequency");
		op.add(Builder::token, JsonpValueParser.stringParser(), "token");
		op.add(Builder::type, JsonpValueParser.stringParser(), "type");

	}

}
