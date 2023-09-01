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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.indices.modify_data_stream.Action;
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
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.modify_data_stream.Request

/**
 * Performs one or more data stream modification actions in a single atomic
 * operation.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.modify_data_stream.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ModifyDataStreamRequest extends RequestBase implements JsonpSerializable {
	private final List<Action> actions;

	// ---------------------------------------------------------------------------------------------

	private ModifyDataStreamRequest(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiableRequired(builder.actions, this, "actions");

	}

	public static ModifyDataStreamRequest of(Function<Builder, ObjectBuilder<ModifyDataStreamRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Actions to perform.
	 * <p>
	 * API name: {@code actions}
	 */
	public final List<Action> actions() {
		return this.actions;
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

		if (ApiTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartArray();
			for (Action item0 : this.actions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModifyDataStreamRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ModifyDataStreamRequest> {
		private List<Action> actions;

		/**
		 * Required - Actions to perform.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actions</code>.
		 */
		public final Builder actions(List<Action> list) {
			this.actions = _listAddAll(this.actions, list);
			return this;
		}

		/**
		 * Required - Actions to perform.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds one or more values to <code>actions</code>.
		 */
		public final Builder actions(Action value, Action... values) {
			this.actions = _listAdd(this.actions, value, values);
			return this;
		}

		/**
		 * Required - Actions to perform.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds a value to <code>actions</code> using a builder lambda.
		 */
		public final Builder actions(Function<Action.Builder, ObjectBuilder<Action>> fn) {
			return actions(fn.apply(new Action.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ModifyDataStreamRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModifyDataStreamRequest build() {
			_checkSingleUse();

			return new ModifyDataStreamRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ModifyDataStreamRequest}
	 */
	public static final JsonpDeserializer<ModifyDataStreamRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ModifyDataStreamRequest::setupModifyDataStreamRequestDeserializer);

	protected static void setupModifyDataStreamRequestDeserializer(
			ObjectDeserializer<ModifyDataStreamRequest.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(Action._DESERIALIZER), "actions");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.modify_data_stream}".
	 */
	public static final Endpoint<ModifyDataStreamRequest, ModifyDataStreamResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.modify_data_stream",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_data_stream/_modify";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, ModifyDataStreamResponse._DESERIALIZER);
}
