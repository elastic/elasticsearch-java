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

// typedef: inference._types.CompletionInferenceResult

/**
 * Defines the completion result.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CompletionInferenceResult">API
 *      specification</a>
 */

public abstract class CompletionInferenceResult implements JsonpSerializable {
	private final List<CompletionResult> completion;

	// ---------------------------------------------------------------------------------------------

	protected CompletionInferenceResult(AbstractBuilder<?> builder) {

		this.completion = ApiTypeHelper.unmodifiableRequired(builder.completion, this, "completion");

	}

	/**
	 * Required - API name: {@code completion}
	 */
	public final List<CompletionResult> completion() {
		return this.completion;
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

		if (ApiTypeHelper.isDefined(this.completion)) {
			generator.writeKey("completion");
			generator.writeStartArray();
			for (CompletionResult item0 : this.completion) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private List<CompletionResult> completion;

		/**
		 * Required - API name: {@code completion}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>completion</code>.
		 */
		public final BuilderT completion(List<CompletionResult> list) {
			this.completion = _listAddAll(this.completion, list);
			return self();
		}

		/**
		 * Required - API name: {@code completion}
		 * <p>
		 * Adds one or more values to <code>completion</code>.
		 */
		public final BuilderT completion(CompletionResult value, CompletionResult... values) {
			this.completion = _listAdd(this.completion, value, values);
			return self();
		}

		/**
		 * Required - API name: {@code completion}
		 * <p>
		 * Adds a value to <code>completion</code> using a builder lambda.
		 */
		public final BuilderT completion(Function<CompletionResult.Builder, ObjectBuilder<CompletionResult>> fn) {
			return completion(fn.apply(new CompletionResult.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupCompletionInferenceResultDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::completion, JsonpDeserializer.arrayDeserializer(CompletionResult._DESERIALIZER),
				"completion");

	}

}
