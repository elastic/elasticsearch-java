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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch.core.scripts_painless_execute.PainlessContext;
import co.elastic.clients.elasticsearch.core.scripts_painless_execute.PainlessContextSetup;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
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

// typedef: _global.scripts_painless_execute.Request

/**
 * Run a script.
 * <p>
 * Runs a script and returns a result. Use this API to build and test scripts,
 * such as when defining a script for a runtime field. This API requires very
 * few dependencies and is especially useful if you don't have permissions to
 * write documents on a cluster.
 * <p>
 * The API uses several <em>contexts</em>, which control how scripts are run,
 * what variables are available at runtime, and what the return type is.
 * <p>
 * Each context requires a script, but additional parameters depend on the
 * context you're using for that script.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.scripts_painless_execute.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScriptsPainlessExecuteRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final PainlessContext context;

	@Nullable
	private final PainlessContextSetup contextSetup;

	@Nullable
	private final Script script;

	// ---------------------------------------------------------------------------------------------

	private ScriptsPainlessExecuteRequest(Builder builder) {

		this.context = builder.context;
		this.contextSetup = builder.contextSetup;
		this.script = builder.script;

	}

	public static ScriptsPainlessExecuteRequest of(Function<Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The context that the script should run in. NOTE: Result ordering in the field
	 * contexts is not guaranteed.
	 * <p>
	 * API name: {@code context}
	 */
	@Nullable
	public final PainlessContext context() {
		return this.context;
	}

	/**
	 * Additional parameters for the <code>context</code>. NOTE: This parameter is
	 * required for all contexts except <code>painless_test</code>, which is the
	 * default if no value is provided for <code>context</code>.
	 * <p>
	 * API name: {@code context_setup}
	 */
	@Nullable
	public final PainlessContextSetup contextSetup() {
		return this.contextSetup;
	}

	/**
	 * The Painless script to run.
	 * <p>
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
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

		if (this.context != null) {
			generator.writeKey("context");
			this.context.serialize(generator, mapper);
		}
		if (this.contextSetup != null) {
			generator.writeKey("context_setup");
			this.contextSetup.serialize(generator, mapper);

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptsPainlessExecuteRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ScriptsPainlessExecuteRequest> {
		@Nullable
		private PainlessContext context;

		@Nullable
		private PainlessContextSetup contextSetup;

		@Nullable
		private Script script;

		public Builder() {
		}
		private Builder(ScriptsPainlessExecuteRequest instance) {
			this.context = instance.context;
			this.contextSetup = instance.contextSetup;
			this.script = instance.script;

		}
		/**
		 * The context that the script should run in. NOTE: Result ordering in the field
		 * contexts is not guaranteed.
		 * <p>
		 * API name: {@code context}
		 */
		public final Builder context(@Nullable PainlessContext value) {
			this.context = value;
			return this;
		}

		/**
		 * Additional parameters for the <code>context</code>. NOTE: This parameter is
		 * required for all contexts except <code>painless_test</code>, which is the
		 * default if no value is provided for <code>context</code>.
		 * <p>
		 * API name: {@code context_setup}
		 */
		public final Builder contextSetup(@Nullable PainlessContextSetup value) {
			this.contextSetup = value;
			return this;
		}

		/**
		 * Additional parameters for the <code>context</code>. NOTE: This parameter is
		 * required for all contexts except <code>painless_test</code>, which is the
		 * default if no value is provided for <code>context</code>.
		 * <p>
		 * API name: {@code context_setup}
		 */
		public final Builder contextSetup(
				Function<PainlessContextSetup.Builder, ObjectBuilder<PainlessContextSetup>> fn) {
			return this.contextSetup(fn.apply(new PainlessContextSetup.Builder()).build());
		}

		/**
		 * The Painless script to run.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * The Painless script to run.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScriptsPainlessExecuteRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptsPainlessExecuteRequest build() {
			_checkSingleUse();

			return new ScriptsPainlessExecuteRequest(this);
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
	 * Json deserializer for {@link ScriptsPainlessExecuteRequest}
	 */
	public static final JsonpDeserializer<ScriptsPainlessExecuteRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScriptsPainlessExecuteRequest::setupScriptsPainlessExecuteRequestDeserializer);

	protected static void setupScriptsPainlessExecuteRequestDeserializer(
			ObjectDeserializer<ScriptsPainlessExecuteRequest.Builder> op) {

		op.add(Builder::context, PainlessContext._DESERIALIZER, "context");
		op.add(Builder::contextSetup, PainlessContextSetup._DESERIALIZER, "context_setup");
		op.add(Builder::script, Script._DESERIALIZER, "script");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code scripts_painless_execute}".
	 */
	public static final SimpleEndpoint<ScriptsPainlessExecuteRequest, ?> _ENDPOINT = new SimpleEndpoint<>(
			"es/scripts_painless_execute",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_scripts/painless/_execute";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, ScriptsPainlessExecuteResponse._DESERIALIZER);

	/**
	 * Create an "{@code scripts_painless_execute}" endpoint.
	 */
	public static <TResult> Endpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse> createScriptsPainlessExecuteEndpoint(
			JsonpDeserializer<TResult> tResultDeserializer) {
		return _ENDPOINT.withResponseDeserializer(
				ScriptsPainlessExecuteResponse.createScriptsPainlessExecuteResponseDeserializer(tResultDeserializer));
	}
}
