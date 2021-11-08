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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ScriptCondition
@JsonpDeserializable
public class ScriptCondition implements ConditionVariant, JsonpSerializable {
	private final String lang;

	private final Map<String, JsonData> params;

	private final String source;

	// ---------------------------------------------------------------------------------------------

	private ScriptCondition(Builder builder) {

		this.lang = ModelTypeHelper.requireNonNull(builder.lang, this, "lang");
		this.params = ModelTypeHelper.unmodifiable(builder.params);
		this.source = ModelTypeHelper.requireNonNull(builder.source, this, "source");

	}

	public static ScriptCondition of(Function<Builder, ObjectBuilder<ScriptCondition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Condition} variant type
	 */
	@Override
	public String _variantType() {
		return "script";
	}

	/**
	 * Required - API name: {@code lang}
	 */
	public final String lang() {
		return this.lang;
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * Required - API name: {@code source}
	 */
	public final String source() {
		return this.source;
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

		generator.writeKey("lang");
		generator.write(this.lang);

		if (ModelTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("source");
		generator.write(this.source);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptCondition}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ScriptCondition> {
		private String lang;

		@Nullable
		private Map<String, JsonData> params;

		private String source;

		/**
		 * Required - API name: {@code lang}
		 */
		public final Builder lang(String value) {
			this.lang = value;
			return this;
		}

		/**
		 * API name: {@code params}
		 */
		public final Builder params(@Nullable Map<String, JsonData> value) {
			this.params = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(String value) {
			this.source = value;
			return this;
		}

		/**
		 * Builds a {@link ScriptCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptCondition build() {
			_checkSingleUse();

			return new ScriptCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptCondition}
	 */
	public static final JsonpDeserializer<ScriptCondition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ScriptCondition::setupScriptConditionDeserializer, Builder::build);

	protected static void setupScriptConditionDeserializer(DelegatingDeserializer<ScriptCondition.Builder> op) {

		op.add(Builder::lang, JsonpDeserializer.stringDeserializer(), "lang");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

}
