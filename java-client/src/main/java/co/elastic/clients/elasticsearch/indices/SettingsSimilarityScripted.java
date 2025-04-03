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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices._types.SettingsSimilarityScripted

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarityScripted">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarityScripted implements SettingsSimilarityVariant, JsonpSerializable {
	private final Script script;

	@Nullable
	private final Script weightScript;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarityScripted(Builder builder) {

		this.script = ApiTypeHelper.requireNonNull(builder.script, this, "script");
		this.weightScript = builder.weightScript;

	}

	public static SettingsSimilarityScripted of(Function<Builder, ObjectBuilder<SettingsSimilarityScripted>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SettingsSimilarity variant kind.
	 */
	@Override
	public SettingsSimilarity.Kind _settingsSimilarityKind() {
		return SettingsSimilarity.Kind.Scripted;
	}

	/**
	 * Required - API name: {@code script}
	 */
	public final Script script() {
		return this.script;
	}

	/**
	 * API name: {@code weight_script}
	 */
	@Nullable
	public final Script weightScript() {
		return this.weightScript;
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

		generator.write("type", "scripted");

		generator.writeKey("script");
		this.script.serialize(generator, mapper);

		if (this.weightScript != null) {
			generator.writeKey("weight_script");
			this.weightScript.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsSimilarityScripted}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarityScripted> {
		private Script script;

		@Nullable
		private Script weightScript;

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(Script value) {
			this.script = value;
			return this;
		}

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * API name: {@code weight_script}
		 */
		public final Builder weightScript(@Nullable Script value) {
			this.weightScript = value;
			return this;
		}

		/**
		 * API name: {@code weight_script}
		 */
		public final Builder weightScript(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.weightScript(fn.apply(new Script.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsSimilarityScripted}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsSimilarityScripted build() {
			_checkSingleUse();

			return new SettingsSimilarityScripted(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsSimilarityScripted}
	 */
	public static final JsonpDeserializer<SettingsSimilarityScripted> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarityScripted::setupSettingsSimilarityScriptedDeserializer);

	protected static void setupSettingsSimilarityScriptedDeserializer(
			ObjectDeserializer<SettingsSimilarityScripted.Builder> op) {

		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::weightScript, Script._DESERIALIZER, "weight_script");

		op.ignore("type");
	}

}
