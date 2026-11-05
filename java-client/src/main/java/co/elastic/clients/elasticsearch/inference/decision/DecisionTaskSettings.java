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

package co.elastic.clients.elasticsearch.inference.decision;

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

// typedef: inference.decision.DecisionTaskSettings

/**
 * The task settings of the <code>decision</code> task.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.decision.DecisionTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class DecisionTaskSettings implements JsonpSerializable {
	private final Map<String, DecisionQuestion> questions;

	// ---------------------------------------------------------------------------------------------

	private DecisionTaskSettings(Builder builder) {

		this.questions = ApiTypeHelper.unmodifiable(builder.questions);

	}

	public static DecisionTaskSettings of(Function<Builder, ObjectBuilder<DecisionTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The questions to answer, keyed by question name. The answers in the response
	 * use the same names. The questions replace the ones of the inference endpoint
	 * as a whole. At least one question is required.
	 * <p>
	 * API name: {@code questions}
	 */
	public final Map<String, DecisionQuestion> questions() {
		return this.questions;
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

		if (ApiTypeHelper.isDefined(this.questions)) {
			generator.writeKey("questions");
			generator.writeStartObject();
			for (Map.Entry<String, DecisionQuestion> item0 : this.questions.entrySet()) {
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
	 * Builder for {@link DecisionTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DecisionTaskSettings> {
		@Nullable
		private Map<String, DecisionQuestion> questions;

		public Builder() {
		}
		private Builder(DecisionTaskSettings instance) {
			this.questions = instance.questions;

		}
		/**
		 * The questions to answer, keyed by question name. The answers in the response
		 * use the same names. The questions replace the ones of the inference endpoint
		 * as a whole. At least one question is required.
		 * <p>
		 * API name: {@code questions}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>questions</code>.
		 */
		public final Builder questions(Map<String, DecisionQuestion> map) {
			this.questions = _mapPutAll(this.questions, map);
			return this;
		}

		/**
		 * The questions to answer, keyed by question name. The answers in the response
		 * use the same names. The questions replace the ones of the inference endpoint
		 * as a whole. At least one question is required.
		 * <p>
		 * API name: {@code questions}
		 * <p>
		 * Adds an entry to <code>questions</code>.
		 */
		public final Builder questions(String key, DecisionQuestion value) {
			this.questions = _mapPut(this.questions, key, value);
			return this;
		}

		/**
		 * The questions to answer, keyed by question name. The answers in the response
		 * use the same names. The questions replace the ones of the inference endpoint
		 * as a whole. At least one question is required.
		 * <p>
		 * API name: {@code questions}
		 * <p>
		 * Adds an entry to <code>questions</code> using a builder lambda.
		 */
		public final Builder questions(String key,
				Function<DecisionQuestion.Builder, ObjectBuilder<DecisionQuestion>> fn) {
			return questions(key, fn.apply(new DecisionQuestion.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DecisionTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DecisionTaskSettings build() {
			_checkSingleUse();

			return new DecisionTaskSettings(this);
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
	 * Json deserializer for {@link DecisionTaskSettings}
	 */
	public static final JsonpDeserializer<DecisionTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DecisionTaskSettings::setupDecisionTaskSettingsDeserializer);

	protected static void setupDecisionTaskSettingsDeserializer(ObjectDeserializer<DecisionTaskSettings.Builder> op) {

		op.add(Builder::questions, JsonpDeserializer.stringMapDeserializer(DecisionQuestion._DESERIALIZER),
				"questions");

	}

}
