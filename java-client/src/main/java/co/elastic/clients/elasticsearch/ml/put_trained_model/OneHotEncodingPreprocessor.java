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

package co.elastic.clients.elasticsearch.ml.put_trained_model;

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

// typedef: ml.put_trained_model.OneHotEncodingPreprocessor

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.put_trained_model.OneHotEncodingPreprocessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class OneHotEncodingPreprocessor implements PreprocessorVariant, JsonpSerializable {
	private final String field;

	private final Map<String, String> hotMap;

	// ---------------------------------------------------------------------------------------------

	private OneHotEncodingPreprocessor(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.hotMap = ApiTypeHelper.unmodifiableRequired(builder.hotMap, this, "hotMap");

	}

	public static OneHotEncodingPreprocessor of(Function<Builder, ObjectBuilder<OneHotEncodingPreprocessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Preprocessor variant kind.
	 */
	@Override
	public Preprocessor.Kind _preprocessorKind() {
		return Preprocessor.Kind.OneHotEncoding;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code hot_map}
	 */
	public final Map<String, String> hotMap() {
		return this.hotMap;
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

		generator.writeKey("field");
		generator.write(this.field);

		if (ApiTypeHelper.isDefined(this.hotMap)) {
			generator.writeKey("hot_map");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.hotMap.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OneHotEncodingPreprocessor}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<OneHotEncodingPreprocessor> {
		private String field;

		private Map<String, String> hotMap;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code hot_map}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>hotMap</code>.
		 */
		public final Builder hotMap(Map<String, String> map) {
			this.hotMap = _mapPutAll(this.hotMap, map);
			return this;
		}

		/**
		 * Required - API name: {@code hot_map}
		 * <p>
		 * Adds an entry to <code>hotMap</code>.
		 */
		public final Builder hotMap(String key, String value) {
			this.hotMap = _mapPut(this.hotMap, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OneHotEncodingPreprocessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OneHotEncodingPreprocessor build() {
			_checkSingleUse();

			return new OneHotEncodingPreprocessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OneHotEncodingPreprocessor}
	 */
	public static final JsonpDeserializer<OneHotEncodingPreprocessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OneHotEncodingPreprocessor::setupOneHotEncodingPreprocessorDeserializer);

	protected static void setupOneHotEncodingPreprocessorDeserializer(
			ObjectDeserializer<OneHotEncodingPreprocessor.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::hotMap, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"hot_map");

	}

}
