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

package co.elastic.clients.elasticsearch.inference;

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
import java.lang.String;
import java.util.Map;
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

// typedef: inference._types.DecisionResult

/**
 *
 * @see <a href="../doc-files/api-spec.html#inference._types.DecisionResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class DecisionResult implements JsonpSerializable {
	private final Map<String, DecisionAnswer> answers;

	// ---------------------------------------------------------------------------------------------

	private DecisionResult(Builder builder) {

		this.answers = ApiTypeHelper.unmodifiableRequired(builder.answers, this, "answers");

	}

	public static DecisionResult of(Function<Builder, ObjectBuilder<DecisionResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The answers, keyed by the name of the question they answer.
	 * <p>
	 * API name: {@code answers}
	 */
	public final Map<String, DecisionAnswer> answers() {
		return this.answers;
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

		if (ApiTypeHelper.isDefined(this.answers)) {
			generator.writeKey("answers");
			generator.writeStartObject();
			for (Map.Entry<String, DecisionAnswer> item0 : this.answers.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DecisionResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DecisionResult> {
		private Map<String, DecisionAnswer> answers;

		public Builder() {
		}
		private Builder(DecisionResult instance) {
			this.answers = instance.answers;

		}
		/**
		 * Required - The answers, keyed by the name of the question they answer.
		 * <p>
		 * API name: {@code answers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>answers</code>.
		 */
		public final Builder answers(Map<String, DecisionAnswer> map) {
			this.answers = _mapPutAll(this.answers, map);
			return this;
		}

		/**
		 * Required - The answers, keyed by the name of the question they answer.
		 * <p>
		 * API name: {@code answers}
		 * <p>
		 * Adds an entry to <code>answers</code>.
		 */
		public final Builder answers(String key, DecisionAnswer value) {
			this.answers = _mapPut(this.answers, key, value);
			return this;
		}

		/**
		 * Required - The answers, keyed by the name of the question they answer.
		 * <p>
		 * API name: {@code answers}
		 * <p>
		 * Adds an entry to <code>answers</code> using a builder lambda.
		 */
		public final Builder answers(String key, Function<DecisionAnswer.Builder, ObjectBuilder<DecisionAnswer>> fn) {
			return answers(key, fn.apply(new DecisionAnswer.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DecisionResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DecisionResult build() {
			_checkSingleUse();

			return new DecisionResult(this);
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
	 * Json deserializer for {@link DecisionResult}
	 */
	public static final JsonpDeserializer<DecisionResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DecisionResult::setupDecisionResultDeserializer);

	protected static void setupDecisionResultDeserializer(ObjectDeserializer<DecisionResult.Builder> op) {

		op.add(Builder::answers, JsonpDeserializer.stringMapDeserializer(DecisionAnswer._DESERIALIZER), "answers");

	}

}
