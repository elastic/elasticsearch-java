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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.scripts_painless_execute.Response

public class ScriptsPainlessExecuteResponse<TResult> implements JsonpSerializable {
	private final TResult result;

	@Nullable
	private final JsonpSerializer<TResult> tResultSerializer;

	// ---------------------------------------------------------------------------------------------

	private ScriptsPainlessExecuteResponse(Builder<TResult> builder) {

		this.result = ModelTypeHelper.requireNonNull(builder.result, this, "result");
		this.tResultSerializer = builder.tResultSerializer;

	}

	public static <TResult> ScriptsPainlessExecuteResponse<TResult> of(
			Function<Builder<TResult>, ObjectBuilder<ScriptsPainlessExecuteResponse<TResult>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code result}
	 */
	public final TResult result() {
		return this.result;
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

		generator.writeKey("result");
		JsonpUtils.serialize(this.result, generator, tResultSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptsPainlessExecuteResponse}.
	 */
	public static class Builder<TResult> extends ObjectBuilderBase
			implements
				ObjectBuilder<ScriptsPainlessExecuteResponse<TResult>> {
		private TResult result;

		@Nullable
		private JsonpSerializer<TResult> tResultSerializer;

		/**
		 * Required - API name: {@code result}
		 */
		public final Builder<TResult> result(TResult value) {
			this.result = value;
			return this;
		}

		/**
		 * Serializer for TResult. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TResult> tResultSerializer(@Nullable JsonpSerializer<TResult> value) {
			this.tResultSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link ScriptsPainlessExecuteResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptsPainlessExecuteResponse<TResult> build() {
			_checkSingleUse();

			return new ScriptsPainlessExecuteResponse<TResult>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for ScriptsPainlessExecuteResponse
	 */
	public static <TResult> JsonpDeserializer<ScriptsPainlessExecuteResponse<TResult>> createScriptsPainlessExecuteResponseDeserializer(
			JsonpDeserializer<TResult> tResultDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TResult>>) Builder::new,
				op -> ScriptsPainlessExecuteResponse.setupScriptsPainlessExecuteResponseDeserializer(op,
						tResultDeserializer));
	};

	protected static <TResult> void setupScriptsPainlessExecuteResponseDeserializer(
			DelegatingDeserializer<ScriptsPainlessExecuteResponse.Builder<TResult>> op,
			JsonpDeserializer<TResult> tResultDeserializer) {

		op.add(Builder::result, tResultDeserializer, "result");

	}

}
