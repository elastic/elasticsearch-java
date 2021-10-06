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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.OneHotEncodingPreprocessor
@JsonpDeserializable
public final class OneHotEncodingPreprocessor implements PreprocessorVariant, JsonpSerializable {
	private final String field;

	private final Map<String, String> hotMap;

	// ---------------------------------------------------------------------------------------------

	public OneHotEncodingPreprocessor(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.hotMap = ModelTypeHelper.unmodifiableNonNull(builder.hotMap, "hot_map");

	}

	public OneHotEncodingPreprocessor(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Preprocessor} variant type
	 */
	@Override
	public String _variantType() {
		return "one_hot_encoding";
	}

	/**
	 * Required - API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code hot_map}
	 */
	public Map<String, String> hotMap() {
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

		generator.writeKey("hot_map");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.hotMap.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OneHotEncodingPreprocessor}.
	 */
	public static class Builder implements ObjectBuilder<OneHotEncodingPreprocessor> {
		private String field;

		private Map<String, String> hotMap;

		/**
		 * Required - API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code hot_map}
		 */
		public Builder hotMap(Map<String, String> value) {
			this.hotMap = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #hotMap(Map)}, creating the map if needed.
		 */
		public Builder putHotMap(String key, String value) {
			if (this.hotMap == null) {
				this.hotMap = new HashMap<>();
			}
			this.hotMap.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link OneHotEncodingPreprocessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OneHotEncodingPreprocessor build() {

			return new OneHotEncodingPreprocessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OneHotEncodingPreprocessor}
	 */
	public static final JsonpDeserializer<OneHotEncodingPreprocessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, OneHotEncodingPreprocessor::setupOneHotEncodingPreprocessorDeserializer, Builder::build);

	protected static void setupOneHotEncodingPreprocessorDeserializer(
			DelegatingDeserializer<OneHotEncodingPreprocessor.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::hotMap, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"hot_map");

	}

}
