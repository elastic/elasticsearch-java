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

package co.elastic.clients.elasticsearch.text_structure;

import co.elastic.clients.elasticsearch.text_structure.test_grok_pattern.MatchedText;
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
import java.util.List;
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

// typedef: text_structure.test_grok_pattern.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#text_structure.test_grok_pattern.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class TestGrokPatternResponse implements JsonpSerializable {
	private final List<MatchedText> matches;

	// ---------------------------------------------------------------------------------------------

	private TestGrokPatternResponse(Builder builder) {

		this.matches = ApiTypeHelper.unmodifiableRequired(builder.matches, this, "matches");

	}

	public static TestGrokPatternResponse of(Function<Builder, ObjectBuilder<TestGrokPatternResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code matches}
	 */
	public final List<MatchedText> matches() {
		return this.matches;
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

		if (ApiTypeHelper.isDefined(this.matches)) {
			generator.writeKey("matches");
			generator.writeStartArray();
			for (MatchedText item0 : this.matches) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link TestGrokPatternResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TestGrokPatternResponse> {
		private List<MatchedText> matches;

		/**
		 * Required - API name: {@code matches}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>matches</code>.
		 */
		public final Builder matches(List<MatchedText> list) {
			this.matches = _listAddAll(this.matches, list);
			return this;
		}

		/**
		 * Required - API name: {@code matches}
		 * <p>
		 * Adds one or more values to <code>matches</code>.
		 */
		public final Builder matches(MatchedText value, MatchedText... values) {
			this.matches = _listAdd(this.matches, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code matches}
		 * <p>
		 * Adds a value to <code>matches</code> using a builder lambda.
		 */
		public final Builder matches(Function<MatchedText.Builder, ObjectBuilder<MatchedText>> fn) {
			return matches(fn.apply(new MatchedText.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TestGrokPatternResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TestGrokPatternResponse build() {
			_checkSingleUse();

			return new TestGrokPatternResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TestGrokPatternResponse}
	 */
	public static final JsonpDeserializer<TestGrokPatternResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TestGrokPatternResponse::setupTestGrokPatternResponseDeserializer);

	protected static void setupTestGrokPatternResponseDeserializer(
			ObjectDeserializer<TestGrokPatternResponse.Builder> op) {

		op.add(Builder::matches, JsonpDeserializer.arrayDeserializer(MatchedText._DESERIALIZER), "matches");

	}

}
