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

import co.elastic.clients.json.JsonData;
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
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.ExplainAnalyzeToken

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.analyze.ExplainAnalyzeToken">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExplainAnalyzeToken implements JsonpSerializable {
	private final Map<String, JsonData> attributes;

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

	private ExplainAnalyzeToken(Builder builder) {

		this.attributes = ApiTypeHelper.unmodifiable(builder.attributes);

		this.bytes = ApiTypeHelper.requireNonNull(builder.bytes, this, "bytes");
		this.endOffset = ApiTypeHelper.requireNonNull(builder.endOffset, this, "endOffset");
		this.keyword = builder.keyword;
		this.position = ApiTypeHelper.requireNonNull(builder.position, this, "position");
		this.positionlength = ApiTypeHelper.requireNonNull(builder.positionlength, this, "positionlength");
		this.startOffset = ApiTypeHelper.requireNonNull(builder.startOffset, this, "startOffset");
		this.termfrequency = ApiTypeHelper.requireNonNull(builder.termfrequency, this, "termfrequency");
		this.token = ApiTypeHelper.requireNonNull(builder.token, this, "token");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static ExplainAnalyzeToken of(Function<Builder, ObjectBuilder<ExplainAnalyzeToken>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Additional tokenizer-specific attributes
	 */
	public final Map<String, JsonData> attributes() {
		return this.attributes;
	}

	/**
	 * Required - API name: {@code bytes}
	 */
	public final String bytes() {
		return this.bytes;
	}

	/**
	 * Required - API name: {@code end_offset}
	 */
	public final long endOffset() {
		return this.endOffset;
	}

	/**
	 * API name: {@code keyword}
	 */
	@Nullable
	public final Boolean keyword() {
		return this.keyword;
	}

	/**
	 * Required - API name: {@code position}
	 */
	public final long position() {
		return this.position;
	}

	/**
	 * Required - API name: {@code positionLength}
	 */
	public final long positionlength() {
		return this.positionlength;
	}

	/**
	 * Required - API name: {@code start_offset}
	 */
	public final long startOffset() {
		return this.startOffset;
	}

	/**
	 * Required - API name: {@code termFrequency}
	 */
	public final long termfrequency() {
		return this.termfrequency;
	}

	/**
	 * Required - API name: {@code token}
	 */
	public final String token() {
		return this.token;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
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

		for (Map.Entry<String, JsonData> item0 : this.attributes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainAnalyzeToken}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExplainAnalyzeToken> {
		@Nullable
		private Map<String, JsonData> attributes = new HashMap<>();

		/**
		 * Additional tokenizer-specific attributes
		 * <p>
		 * Adds all entries of <code>map</code> to <code>attributes</code>.
		 */
		public final Builder attributes(Map<String, JsonData> map) {
			this.attributes = _mapPutAll(this.attributes, map);
			return this;
		}

		/**
		 * Additional tokenizer-specific attributes
		 * <p>
		 * Adds an entry to <code>attributes</code>.
		 */
		public final Builder attributes(String key, JsonData value) {
			this.attributes = _mapPut(this.attributes, key, value);
			return this;
		}

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
		public final Builder bytes(String value) {
			this.bytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code end_offset}
		 */
		public final Builder endOffset(long value) {
			this.endOffset = value;
			return this;
		}

		/**
		 * API name: {@code keyword}
		 */
		public final Builder keyword(@Nullable Boolean value) {
			this.keyword = value;
			return this;
		}

		/**
		 * Required - API name: {@code position}
		 */
		public final Builder position(long value) {
			this.position = value;
			return this;
		}

		/**
		 * Required - API name: {@code positionLength}
		 */
		public final Builder positionlength(long value) {
			this.positionlength = value;
			return this;
		}

		/**
		 * Required - API name: {@code start_offset}
		 */
		public final Builder startOffset(long value) {
			this.startOffset = value;
			return this;
		}

		/**
		 * Required - API name: {@code termFrequency}
		 */
		public final Builder termfrequency(long value) {
			this.termfrequency = value;
			return this;
		}

		/**
		 * Required - API name: {@code token}
		 */
		public final Builder token(String value) {
			this.token = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExplainAnalyzeToken}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainAnalyzeToken build() {
			_checkSingleUse();

			return new ExplainAnalyzeToken(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExplainAnalyzeToken}
	 */
	public static final JsonpDeserializer<ExplainAnalyzeToken> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExplainAnalyzeToken::setupExplainAnalyzeTokenDeserializer);

	protected static void setupExplainAnalyzeTokenDeserializer(ObjectDeserializer<ExplainAnalyzeToken.Builder> op) {

		op.add(Builder::bytes, JsonpDeserializer.stringDeserializer(), "bytes");
		op.add(Builder::endOffset, JsonpDeserializer.longDeserializer(), "end_offset");
		op.add(Builder::keyword, JsonpDeserializer.booleanDeserializer(), "keyword");
		op.add(Builder::position, JsonpDeserializer.longDeserializer(), "position");
		op.add(Builder::positionlength, JsonpDeserializer.longDeserializer(), "positionLength");
		op.add(Builder::startOffset, JsonpDeserializer.longDeserializer(), "start_offset");
		op.add(Builder::termfrequency, JsonpDeserializer.longDeserializer(), "termFrequency");
		op.add(Builder::token, JsonpDeserializer.stringDeserializer(), "token");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.attributes(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
