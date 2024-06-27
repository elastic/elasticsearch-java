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

package co.elastic.clients.elasticsearch._types.mapping;

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

// typedef: _types.mapping.SemanticTextProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.SemanticTextProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class SemanticTextProperty implements PropertyVariant, JsonpSerializable {
	private final Map<String, String> meta;

	private final String inferenceId;

	// ---------------------------------------------------------------------------------------------

	private SemanticTextProperty(Builder builder) {

		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.inferenceId = ApiTypeHelper.requireNonNull(builder.inferenceId, this, "inferenceId");

	}

	public static SemanticTextProperty of(Function<Builder, ObjectBuilder<SemanticTextProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.SemanticText;
	}

	/**
	 * API name: {@code meta}
	 */
	public final Map<String, String> meta() {
		return this.meta;
	}

	/**
	 * Required - API name: {@code inference_id}
	 */
	public final String inferenceId() {
		return this.inferenceId;
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

		generator.write("type", "semantic_text");

		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("inference_id");
		generator.write(this.inferenceId);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SemanticTextProperty}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SemanticTextProperty> {
		@Nullable
		private Map<String, String> meta;

		private String inferenceId;

		/**
		 * API name: {@code meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, String> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * API name: {@code meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, String value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code inference_id}
		 */
		public final Builder inferenceId(String value) {
			this.inferenceId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SemanticTextProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SemanticTextProperty build() {
			_checkSingleUse();

			return new SemanticTextProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SemanticTextProperty}
	 */
	public static final JsonpDeserializer<SemanticTextProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SemanticTextProperty::setupSemanticTextPropertyDeserializer);

	protected static void setupSemanticTextPropertyDeserializer(ObjectDeserializer<SemanticTextProperty.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "meta");
		op.add(Builder::inferenceId, JsonpDeserializer.stringDeserializer(), "inference_id");

		op.ignore("type");
	}

}
