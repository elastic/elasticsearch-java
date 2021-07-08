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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._global.scripts_painless_execute.PainlessContextSetup;
import co.elastic.clients.elasticsearch._types.InlineScript;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.scripts_painless_execute.Request
public final class ScriptsPainlessExecuteRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String context;

	@Nullable
	private final PainlessContextSetup contextSetup;

	@Nullable
	private final InlineScript script;

	// ---------------------------------------------------------------------------------------------

	protected ScriptsPainlessExecuteRequest(Builder builder) {

		this.context = builder.context;
		this.contextSetup = builder.contextSetup;
		this.script = builder.script;

	}

	/**
	 * API name: {@code context}
	 */
	@Nullable
	public String context() {
		return this.context;
	}

	/**
	 * API name: {@code context_setup}
	 */
	@Nullable
	public PainlessContextSetup contextSetup() {
		return this.contextSetup;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public InlineScript script() {
		return this.script;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.context != null) {

			generator.writeKey("context");
			generator.write(this.context);

		}
		if (this.contextSetup != null) {

			generator.writeKey("context_setup");
			this.contextSetup.toJsonp(generator, mapper);

		}
		if (this.script != null) {

			generator.writeKey("script");
			this.script.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptsPainlessExecuteRequest}.
	 */
	public static class Builder implements ObjectBuilder<ScriptsPainlessExecuteRequest> {
		@Nullable
		private String context;

		@Nullable
		private PainlessContextSetup contextSetup;

		@Nullable
		private InlineScript script;

		/**
		 * API name: {@code context}
		 */
		public Builder context(@Nullable String value) {
			this.context = value;
			return this;
		}

		/**
		 * API name: {@code context_setup}
		 */
		public Builder contextSetup(@Nullable PainlessContextSetup value) {
			this.contextSetup = value;
			return this;
		}

		/**
		 * API name: {@code context_setup}
		 */
		public Builder contextSetup(Function<PainlessContextSetup.Builder, ObjectBuilder<PainlessContextSetup>> fn) {
			return this.contextSetup(fn.apply(new PainlessContextSetup.Builder()).build());
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable InlineScript value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(Function<InlineScript.Builder, ObjectBuilder<InlineScript>> fn) {
			return this.script(fn.apply(new InlineScript.Builder()).build());
		}

		/**
		 * Builds a {@link ScriptsPainlessExecuteRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptsPainlessExecuteRequest build() {

			return new ScriptsPainlessExecuteRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ScriptsPainlessExecuteRequest
	 */
	public static final JsonpDeserializer<ScriptsPainlessExecuteRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					ScriptsPainlessExecuteRequest::setupScriptsPainlessExecuteRequestDeserializer);

	protected static void setupScriptsPainlessExecuteRequestDeserializer(
			DelegatingDeserializer<ScriptsPainlessExecuteRequest.Builder> op) {

		op.add(Builder::context, JsonpDeserializer.stringDeserializer(), "context");
		op.add(Builder::contextSetup, PainlessContextSetup.DESERIALIZER, "context_setup");
		op.add(Builder::script, InlineScript.DESERIALIZER, "script");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code scripts_painless_execute}".
	 */
	private static final Endpoint.Simple<ScriptsPainlessExecuteRequest, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_scripts/painless/_execute";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, null);

	/**
	 * Create an "{@code scripts_painless_execute}" endpoint.
	 */
	public static <TResult> Endpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ElasticsearchError> createScriptsPainlessExecuteEndpoint(
			JsonpDeserializer<TResult> tResultDeserializer) {
		return ENDPOINT.withResponseDeserializer(
				ScriptsPainlessExecuteResponse.createScriptsPainlessExecuteResponseDeserializer(tResultDeserializer));
	}
}
