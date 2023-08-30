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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.elasticsearch._types.Script;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.ScriptScoreFunction

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.ScriptScoreFunction">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScriptScoreFunction implements FunctionScoreVariant, JsonpSerializable {
	private final Script script;

	// ---------------------------------------------------------------------------------------------

	private ScriptScoreFunction(Builder builder) {

		this.script = ApiTypeHelper.requireNonNull(builder.script, this, "script");

	}

	public static ScriptScoreFunction of(Function<Builder, ObjectBuilder<ScriptScoreFunction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * FunctionScore variant kind.
	 */
	@Override
	public FunctionScore.Kind _functionScoreKind() {
		return FunctionScore.Kind.ScriptScore;
	}

	/**
	 * Required - A script that computes a score.
	 * <p>
	 * API name: {@code script}
	 */
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

		generator.writeKey("script");
		this.script.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptScoreFunction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ScriptScoreFunction> {
		private Script script;

		/**
		 * Required - A script that computes a score.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Script value) {
			this.script = value;
			return this;
		}

		/**
		 * Required - A script that computes a score.
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
		 * Builds a {@link ScriptScoreFunction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptScoreFunction build() {
			_checkSingleUse();

			return new ScriptScoreFunction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptScoreFunction}
	 */
	public static final JsonpDeserializer<ScriptScoreFunction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScriptScoreFunction::setupScriptScoreFunctionDeserializer);

	protected static void setupScriptScoreFunctionDeserializer(ObjectDeserializer<ScriptScoreFunction.Builder> op) {

		op.add(Builder::script, Script._DESERIALIZER, "script");

	}

}
