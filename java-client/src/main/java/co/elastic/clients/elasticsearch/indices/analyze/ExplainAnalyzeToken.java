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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.ExplainAnalyzeToken
@JsonpDeserializable
public final class ExplainAnalyzeToken implements JsonpSerializable {
	private final String bytes;

	private final long endOffset;

	@Nullable
	private final Boolean keyword;

	private final long position;

	private final long positionlength;

	private final long startOffset;

	private final long termfrequency;

	private final String token;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	public ExplainAnalyzeToken(Builder builder) {

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

	public ExplainAnalyzeToken(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code bytes}
	 */
	public String bytes() {
		return this.bytes;
	}

	/**
	 * Required - API name: {@code end_offset}
	 */
	public long endOffset() {
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
	 * Required - API name: {@code position}
	 */
	public long position() {
		return this.position;
	}

	/**
	 * Required - API name: {@code positionLength}
	 */
	public long positionlength() {
		return this.positionlength;
	}

	/**
	 * Required - API name: {@code start_offset}
	 */
	public long startOffset() {
		return this.startOffset;
	}

	/**
	 * Required - API name: {@code termFrequency}
	 */
	public long termfrequency() {
		return this.termfrequency;
	}

	/**
	 * Required - API name: {@code token}
	 */
	public String token() {
		return this.token;
	}

	/**
	 * Required - API name: {@code type}
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

		generator.writeKey("bytes");
		generator.write(this.bytes);

		generator.writeKey("end_offset");
		generator.write(this.endOffset);

		if (this.keyword != null) {

			generator.writeKey("keyword");
			generator.write(this.keyword);

		}

		generator.writeKey("position");
		generator.write(this.position);

		generator.writeKey("positionLength");
		generator.write(this.positionlength);

		generator.writeKey("start_offset");
		generator.write(this.startOffset);

		generator.writeKey("termFrequency");
		generator.write(this.termfrequency);

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

		private Long endOffset;

		@Nullable
		private Boolean keyword;

		private Long position;

		private Long positionlength;

		private Long startOffset;

		private Long termfrequency;

		private String token;

		private String type;

		/**
		 * Required - API name: {@code bytes}
		 */
		public Builder bytes(String value) {
			this.bytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code end_offset}
		 */
		public Builder endOffset(long value) {
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
		 * Required - API name: {@code position}
		 */
		public Builder position(long value) {
			this.position = value;
			return this;
		}

		/**
		 * Required - API name: {@code positionLength}
		 */
		public Builder positionlength(long value) {
			this.positionlength = value;
			return this;
		}

		/**
		 * Required - API name: {@code start_offset}
		 */
		public Builder startOffset(long value) {
			this.startOffset = value;
			return this;
		}

		/**
		 * Required - API name: {@code termFrequency}
		 */
		public Builder termfrequency(long value) {
			this.termfrequency = value;
			return this;
		}

		/**
		 * Required - API name: {@code token}
		 */
		public Builder token(String value) {
			this.token = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
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
	 * Json deserializer for {@link ExplainAnalyzeToken}
	 */
	public static final JsonpDeserializer<ExplainAnalyzeToken> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExplainAnalyzeToken::setupExplainAnalyzeTokenDeserializer, Builder::build);

	protected static void setupExplainAnalyzeTokenDeserializer(DelegatingDeserializer<ExplainAnalyzeToken.Builder> op) {

		op.add(Builder::bytes, JsonpDeserializer.stringDeserializer(), "bytes");
		op.add(Builder::endOffset, JsonpDeserializer.longDeserializer(), "end_offset");
		op.add(Builder::keyword, JsonpDeserializer.booleanDeserializer(), "keyword");
		op.add(Builder::position, JsonpDeserializer.longDeserializer(), "position");
		op.add(Builder::positionlength, JsonpDeserializer.longDeserializer(), "positionLength");
		op.add(Builder::startOffset, JsonpDeserializer.longDeserializer(), "start_offset");
		op.add(Builder::termfrequency, JsonpDeserializer.longDeserializer(), "termFrequency");
		op.add(Builder::token, JsonpDeserializer.stringDeserializer(), "token");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
