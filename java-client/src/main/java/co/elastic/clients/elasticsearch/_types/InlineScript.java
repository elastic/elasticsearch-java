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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.InlineScript
public final class InlineScript extends ScriptBase {
	private final String source;

	// ---------------------------------------------------------------------------------------------

	protected InlineScript(Builder builder) {
		super(builder);
		this.source = Objects.requireNonNull(builder.source, "source");

	}

	/**
	 * API name: {@code source}
	 */
	public String source() {
		return this.source;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("source");
		generator.write(this.source);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InlineScript}.
	 */
	public static class Builder extends ScriptBase.AbstractBuilder<Builder> implements ObjectBuilder<InlineScript> {
		private String source;

		/**
		 * API name: {@code source}
		 */
		public Builder source(String value) {
			this.source = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InlineScript}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InlineScript build() {

			return new InlineScript(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for InlineScript
	 */
	public static final JsonpDeserializer<InlineScript> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InlineScript::setupInlineScriptDeserializer);

	protected static void setupInlineScriptDeserializer(DelegatingDeserializer<InlineScript.Builder> op) {
		ScriptBase.setupScriptBaseDeserializer(op);
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

}
