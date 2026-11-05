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

package co.elastic.clients.elasticsearch.indices.update_aliases;

import co.elastic.clients.elasticsearch.indices.AliasesResponseBody;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
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

// typedef: indices.update_aliases.IndicesUpdateAliasesResponseBody

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.update_aliases.IndicesUpdateAliasesResponseBody">API
 *      specification</a>
 */

public abstract class IndicesUpdateAliasesResponseBody extends AliasesResponseBody {
	private final List<AliasActionResult> actionResults;

	// ---------------------------------------------------------------------------------------------

	protected IndicesUpdateAliasesResponseBody(AbstractBuilder<?> builder) {
		super(builder);

		this.actionResults = ApiTypeHelper.unmodifiable(builder.actionResults);

	}

	/**
	 * Results for each action in the request. Returned only when
	 * <code>errors</code> is <code>true</code>.
	 * <p>
	 * API name: {@code action_results}
	 */
	public final List<AliasActionResult> actionResults() {
		return this.actionResults;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.actionResults)) {
			generator.writeKey("action_results");
			generator.writeStartArray();
			for (AliasActionResult item0 : this.actionResults) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AliasesResponseBody.AbstractBuilder<BuilderT> {
		@Nullable
		private List<AliasActionResult> actionResults;

		/**
		 * Results for each action in the request. Returned only when
		 * <code>errors</code> is <code>true</code>.
		 * <p>
		 * API name: {@code action_results}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actionResults</code>.
		 */
		public final BuilderT actionResults(List<AliasActionResult> list) {
			this.actionResults = _listAddAll(this.actionResults, list);
			return self();
		}

		/**
		 * Results for each action in the request. Returned only when
		 * <code>errors</code> is <code>true</code>.
		 * <p>
		 * API name: {@code action_results}
		 * <p>
		 * Adds one or more values to <code>actionResults</code>.
		 */
		public final BuilderT actionResults(AliasActionResult value, AliasActionResult... values) {
			this.actionResults = _listAdd(this.actionResults, value, values);
			return self();
		}

		/**
		 * Results for each action in the request. Returned only when
		 * <code>errors</code> is <code>true</code>.
		 * <p>
		 * API name: {@code action_results}
		 * <p>
		 * Adds a value to <code>actionResults</code> using a builder lambda.
		 */
		public final BuilderT actionResults(Function<AliasActionResult.Builder, ObjectBuilder<AliasActionResult>> fn) {
			return actionResults(fn.apply(new AliasActionResult.Builder()).build());
		}

		protected AbstractBuilder() {
		}

		protected AbstractBuilder(IndicesUpdateAliasesResponseBody instance) {
			super(instance);
			this.actionResults = instance.actionResults;

		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupIndicesUpdateAliasesResponseBodyDeserializer(
			ObjectDeserializer<BuilderT> op) {
		AliasesResponseBody.setupAliasesResponseBodyDeserializer(op);
		op.add(AbstractBuilder::actionResults, JsonpDeserializer.arrayDeserializer(AliasActionResult._DESERIALIZER),
				"action_results");

	}

}
