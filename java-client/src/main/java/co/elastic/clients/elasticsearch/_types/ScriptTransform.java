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

import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ScriptTransform

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.ScriptTransform">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScriptTransform implements TransformVariant, JsonpSerializable {
	@Nullable
	private final String lang;

	private final Map<String, JsonData> params;

	@Nullable
	private final String source;

	@Nullable
	private final String id;

	// ---------------------------------------------------------------------------------------------

	private ScriptTransform(Builder builder) {

		this.lang = builder.lang;
		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.source = builder.source;
		this.id = builder.id;

	}

	public static ScriptTransform of(Function<Builder, ObjectBuilder<ScriptTransform>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Transform variant kind.
	 */
	@Override
	public Transform.Kind _transformKind() {
		return Transform.Kind.Script;
	}

	/**
	 * API name: {@code lang}
	 */
	@Nullable
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
	 * API name: {@code source}
	 */
	@Nullable
	public final String source() {
		return this.source;
	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
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

		if (this.lang != null) {
			generator.writeKey("lang");
			generator.write(this.lang);

		}
		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.source != null) {
			generator.writeKey("source");
			generator.write(this.source);

		}
		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptTransform}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ScriptTransform> {
		@Nullable
		private String lang;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private String source;

		@Nullable
		private String id;

		/**
		 * API name: {@code lang}
		 */
		public final Builder lang(@Nullable String value) {
			this.lang = value;
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final Builder params(Map<String, JsonData> map) {
			this.params = _mapPutAll(this.params, map);
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final Builder params(String key, JsonData value) {
			this.params = _mapPut(this.params, key, value);
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public final Builder source(@Nullable String value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScriptTransform}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptTransform build() {
			_checkSingleUse();

			return new ScriptTransform(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptTransform}
	 */
	public static final JsonpDeserializer<ScriptTransform> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ScriptTransform::setupScriptTransformDeserializer);

	protected static void setupScriptTransformDeserializer(ObjectDeserializer<ScriptTransform.Builder> op) {

		op.add(Builder::lang, JsonpDeserializer.stringDeserializer(), "lang");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");

	}

}
