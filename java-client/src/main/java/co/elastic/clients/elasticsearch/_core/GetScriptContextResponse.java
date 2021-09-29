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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.elasticsearch._core.get_script_context.Context;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.get_script_context.Response
@JsonpDeserializable
public final class GetScriptContextResponse implements JsonpSerializable {
	private final List<Context> contexts;

	// ---------------------------------------------------------------------------------------------

	public GetScriptContextResponse(Builder builder) {

		this.contexts = ModelTypeHelper.unmodifiableNonNull(builder.contexts, "contexts");

	}

	public GetScriptContextResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code contexts}
	 */
	public List<Context> contexts() {
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

		generator.writeKey("contexts");
		generator.writeStartArray();
		for (Context item0 : this.contexts) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetScriptContextResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetScriptContextResponse> {
		private List<Context> contexts;

		/**
		 * API name: {@code contexts}
		 */
		public Builder contexts(List<Context> value) {
			this.contexts = value;
			return this;
		}

		/**
		 * API name: {@code contexts}
		 */
		public Builder contexts(Context... value) {
			this.contexts = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #contexts(List)}, creating the list if needed. 4
		 */
		public Builder addContexts(Context value) {
			if (this.contexts == null) {
				this.contexts = new ArrayList<>();
			}
			this.contexts.add(value);
			return this;
		}

		/**
		 * Set {@link #contexts(List)} to a singleton list.
		 */
		public Builder contexts(Function<Context.Builder, ObjectBuilder<Context>> fn) {
			return this.contexts(fn.apply(new Context.Builder()).build());
		}

		/**
		 * Add a value to {@link #contexts(List)}, creating the list if needed. 5
		 */
		public Builder addContexts(Function<Context.Builder, ObjectBuilder<Context>> fn) {
			return this.addContexts(fn.apply(new Context.Builder()).build());
		}

		/**
		 * Builds a {@link GetScriptContextResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetScriptContextResponse build() {

			return new GetScriptContextResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetScriptContextResponse}
	 */
	public static final JsonpDeserializer<GetScriptContextResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetScriptContextResponse::setupGetScriptContextResponseDeserializer, Builder::build);

	protected static void setupGetScriptContextResponseDeserializer(
			DelegatingDeserializer<GetScriptContextResponse.Builder> op) {

		op.add(Builder::contexts, JsonpDeserializer.arrayDeserializer(Context._DESERIALIZER), "contexts");

	}

}
