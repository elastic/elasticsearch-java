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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.get_script_context.Context;
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

// typedef: _global.get_script_context.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.get_script_context.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetScriptContextResponse implements JsonpSerializable {
	private final List<Context> contexts;

	// ---------------------------------------------------------------------------------------------

	private GetScriptContextResponse(Builder builder) {

		this.contexts = ApiTypeHelper.unmodifiableRequired(builder.contexts, this, "contexts");

	}

	public static GetScriptContextResponse of(Function<Builder, ObjectBuilder<GetScriptContextResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code contexts}
	 */
	public final List<Context> contexts() {
		return this.contexts;
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

		if (ApiTypeHelper.isDefined(this.contexts)) {
			generator.writeKey("contexts");
			generator.writeStartArray();
			for (Context item0 : this.contexts) {
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
	 * Builder for {@link GetScriptContextResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetScriptContextResponse> {
		private List<Context> contexts;

		/**
		 * Required - API name: {@code contexts}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>contexts</code>.
		 */
		public final Builder contexts(List<Context> list) {
			this.contexts = _listAddAll(this.contexts, list);
			return this;
		}

		/**
		 * Required - API name: {@code contexts}
		 * <p>
		 * Adds one or more values to <code>contexts</code>.
		 */
		public final Builder contexts(Context value, Context... values) {
			this.contexts = _listAdd(this.contexts, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code contexts}
		 * <p>
		 * Adds a value to <code>contexts</code> using a builder lambda.
		 */
		public final Builder contexts(Function<Context.Builder, ObjectBuilder<Context>> fn) {
			return contexts(fn.apply(new Context.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetScriptContextResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetScriptContextResponse build() {
			_checkSingleUse();

			return new GetScriptContextResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetScriptContextResponse}
	 */
	public static final JsonpDeserializer<GetScriptContextResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetScriptContextResponse::setupGetScriptContextResponseDeserializer);

	protected static void setupGetScriptContextResponseDeserializer(
			ObjectDeserializer<GetScriptContextResponse.Builder> op) {

		op.add(Builder::contexts, JsonpDeserializer.arrayDeserializer(Context._DESERIALIZER), "contexts");

	}

}
