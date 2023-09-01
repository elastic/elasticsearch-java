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

package co.elastic.clients.elasticsearch.indices.validate_query;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.validate_query.IndicesValidationExplanation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.validate_query.IndicesValidationExplanation">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicesValidationExplanation implements JsonpSerializable {
	@Nullable
	private final String error;

	@Nullable
	private final String explanation;

	private final String index;

	private final boolean valid;

	// ---------------------------------------------------------------------------------------------

	private IndicesValidationExplanation(Builder builder) {

		this.error = builder.error;
		this.explanation = builder.explanation;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.valid = ApiTypeHelper.requireNonNull(builder.valid, this, "valid");

	}

	public static IndicesValidationExplanation of(Function<Builder, ObjectBuilder<IndicesValidationExplanation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final String error() {
		return this.error;
	}

	/**
	 * API name: {@code explanation}
	 */
	@Nullable
	public final String explanation() {
		return this.explanation;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code valid}
	 */
	public final boolean valid() {
		return this.valid;
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

		if (this.error != null) {
			generator.writeKey("error");
			generator.write(this.error);

		}
		if (this.explanation != null) {
			generator.writeKey("explanation");
			generator.write(this.explanation);

		}
		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("valid");
		generator.write(this.valid);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesValidationExplanation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndicesValidationExplanation> {
		@Nullable
		private String error;

		@Nullable
		private String explanation;

		private String index;

		private Boolean valid;

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable String value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public final Builder explanation(@Nullable String value) {
			this.explanation = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code valid}
		 */
		public final Builder valid(boolean value) {
			this.valid = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndicesValidationExplanation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesValidationExplanation build() {
			_checkSingleUse();

			return new IndicesValidationExplanation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesValidationExplanation}
	 */
	public static final JsonpDeserializer<IndicesValidationExplanation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndicesValidationExplanation::setupIndicesValidationExplanationDeserializer);

	protected static void setupIndicesValidationExplanationDeserializer(
			ObjectDeserializer<IndicesValidationExplanation.Builder> op) {

		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");
		op.add(Builder::explanation, JsonpDeserializer.stringDeserializer(), "explanation");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::valid, JsonpDeserializer.booleanDeserializer(), "valid");

	}

}
