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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.indices.validate_query.IndicesValidationExplanation;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.validate_query.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.validate_query.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ValidateQueryResponse implements JsonpSerializable {
	private final List<IndicesValidationExplanation> explanations;

	@Nullable
	private final ShardStatistics shards;

	private final boolean valid;

	@Nullable
	private final String error;

	// ---------------------------------------------------------------------------------------------

	private ValidateQueryResponse(Builder builder) {

		this.explanations = ApiTypeHelper.unmodifiable(builder.explanations);
		this.shards = builder.shards;
		this.valid = ApiTypeHelper.requireNonNull(builder.valid, this, "valid");
		this.error = builder.error;

	}

	public static ValidateQueryResponse of(Function<Builder, ObjectBuilder<ValidateQueryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code explanations}
	 */
	public final List<IndicesValidationExplanation> explanations() {
		return this.explanations;
	}

	/**
	 * API name: {@code _shards}
	 */
	@Nullable
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code valid}
	 */
	public final boolean valid() {
		return this.valid;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final String error() {
		return this.error;
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

		if (ApiTypeHelper.isDefined(this.explanations)) {
			generator.writeKey("explanations");
			generator.writeStartArray();
			for (IndicesValidationExplanation item0 : this.explanations) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.shards != null) {
			generator.writeKey("_shards");
			this.shards.serialize(generator, mapper);

		}
		generator.writeKey("valid");
		generator.write(this.valid);

		if (this.error != null) {
			generator.writeKey("error");
			generator.write(this.error);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ValidateQueryResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ValidateQueryResponse> {
		@Nullable
		private List<IndicesValidationExplanation> explanations;

		@Nullable
		private ShardStatistics shards;

		private Boolean valid;

		@Nullable
		private String error;

		/**
		 * API name: {@code explanations}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>explanations</code>.
		 */
		public final Builder explanations(List<IndicesValidationExplanation> list) {
			this.explanations = _listAddAll(this.explanations, list);
			return this;
		}

		/**
		 * API name: {@code explanations}
		 * <p>
		 * Adds one or more values to <code>explanations</code>.
		 */
		public final Builder explanations(IndicesValidationExplanation value, IndicesValidationExplanation... values) {
			this.explanations = _listAdd(this.explanations, value, values);
			return this;
		}

		/**
		 * API name: {@code explanations}
		 * <p>
		 * Adds a value to <code>explanations</code> using a builder lambda.
		 */
		public final Builder explanations(
				Function<IndicesValidationExplanation.Builder, ObjectBuilder<IndicesValidationExplanation>> fn) {
			return explanations(fn.apply(new IndicesValidationExplanation.Builder()).build());
		}

		/**
		 * API name: {@code _shards}
		 */
		public final Builder shards(@Nullable ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public final Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code valid}
		 */
		public final Builder valid(boolean value) {
			this.valid = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable String value) {
			this.error = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ValidateQueryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ValidateQueryResponse build() {
			_checkSingleUse();

			return new ValidateQueryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ValidateQueryResponse}
	 */
	public static final JsonpDeserializer<ValidateQueryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ValidateQueryResponse::setupValidateQueryResponseDeserializer);

	protected static void setupValidateQueryResponseDeserializer(ObjectDeserializer<ValidateQueryResponse.Builder> op) {

		op.add(Builder::explanations, JsonpDeserializer.arrayDeserializer(IndicesValidationExplanation._DESERIALIZER),
				"explanations");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::valid, JsonpDeserializer.booleanDeserializer(), "valid");
		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");

	}

}
