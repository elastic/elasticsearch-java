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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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

// typedef: text_structure.test_grok_pattern.Request

/**
 * Tests a Grok pattern on some text.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#text_structure.test_grok_pattern.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class TestGrokPatternRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String ecsCompatibility;

	private final String grokPattern;

	private final List<String> text;

	// ---------------------------------------------------------------------------------------------

	private TestGrokPatternRequest(Builder builder) {

		this.ecsCompatibility = builder.ecsCompatibility;
		this.grokPattern = ApiTypeHelper.requireNonNull(builder.grokPattern, this, "grokPattern");
		this.text = ApiTypeHelper.unmodifiableRequired(builder.text, this, "text");

	}

	public static TestGrokPatternRequest of(Function<Builder, ObjectBuilder<TestGrokPatternRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The mode of compatibility with ECS compliant Grok patterns (disabled or v1,
	 * default: disabled).
	 * <p>
	 * API name: {@code ecs_compatibility}
	 */
	@Nullable
	public final String ecsCompatibility() {
		return this.ecsCompatibility;
	}

	/**
	 * Required - Grok pattern to run on the text.
	 * <p>
	 * API name: {@code grok_pattern}
	 */
	public final String grokPattern() {
		return this.grokPattern;
	}

	/**
	 * Required - Lines of text to run the Grok pattern on.
	 * <p>
	 * API name: {@code text}
	 */
	public final List<String> text() {
		return this.text;
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

		generator.writeKey("grok_pattern");
		generator.write(this.grokPattern);

		if (ApiTypeHelper.isDefined(this.text)) {
			generator.writeKey("text");
			generator.writeStartArray();
			for (String item0 : this.text) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TestGrokPatternRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TestGrokPatternRequest> {
		@Nullable
		private String ecsCompatibility;

		private String grokPattern;

		private List<String> text;

		/**
		 * The mode of compatibility with ECS compliant Grok patterns (disabled or v1,
		 * default: disabled).
		 * <p>
		 * API name: {@code ecs_compatibility}
		 */
		public final Builder ecsCompatibility(@Nullable String value) {
			this.ecsCompatibility = value;
			return this;
		}

		/**
		 * Required - Grok pattern to run on the text.
		 * <p>
		 * API name: {@code grok_pattern}
		 */
		public final Builder grokPattern(String value) {
			this.grokPattern = value;
			return this;
		}

		/**
		 * Required - Lines of text to run the Grok pattern on.
		 * <p>
		 * API name: {@code text}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>text</code>.
		 */
		public final Builder text(List<String> list) {
			this.text = _listAddAll(this.text, list);
			return this;
		}

		/**
		 * Required - Lines of text to run the Grok pattern on.
		 * <p>
		 * API name: {@code text}
		 * <p>
		 * Adds one or more values to <code>text</code>.
		 */
		public final Builder text(String value, String... values) {
			this.text = _listAdd(this.text, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TestGrokPatternRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TestGrokPatternRequest build() {
			_checkSingleUse();

			return new TestGrokPatternRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TestGrokPatternRequest}
	 */
	public static final JsonpDeserializer<TestGrokPatternRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TestGrokPatternRequest::setupTestGrokPatternRequestDeserializer);

	protected static void setupTestGrokPatternRequestDeserializer(
			ObjectDeserializer<TestGrokPatternRequest.Builder> op) {

		op.add(Builder::grokPattern, JsonpDeserializer.stringDeserializer(), "grok_pattern");
		op.add(Builder::text, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "text");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code text_structure.test_grok_pattern}".
	 */
	public static final Endpoint<TestGrokPatternRequest, TestGrokPatternResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/text_structure.test_grok_pattern",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_text_structure/test_grok_pattern";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ecsCompatibility != null) {
					params.put("ecs_compatibility", request.ecsCompatibility);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, TestGrokPatternResponse._DESERIALIZER);
}
