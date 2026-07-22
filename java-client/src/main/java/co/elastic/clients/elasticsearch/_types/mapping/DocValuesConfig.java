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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: _types.mapping.DocValuesConfig

/**
 * Configuration object for doc values when sub-parameters are needed.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DocValuesConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class DocValuesConfig implements JsonpSerializable {
	@Nullable
	private final Boolean multiValue;

	@Nullable
	private final Boolean nullability;

	// ---------------------------------------------------------------------------------------------

	private DocValuesConfig(Builder builder) {

		this.multiValue = builder.multiValue;
		this.nullability = builder.nullability;

	}

	public static DocValuesConfig of(Function<Builder, ObjectBuilder<DocValuesConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>false</code>, the field is treated as single-valued, enabling
	 * optimized storage. Only has an effect when columnar index mode is active.
	 * <p>
	 * API name: {@code multi_value}
	 */
	@Nullable
	public final Boolean multiValue() {
		return this.multiValue;
	}

	/**
	 * If <code>false</code>, every document must provide a non-null value for the
	 * field: a document that omits the field, sets it to <code>null</code>, or
	 * supplies only null values (an empty array or an all-null array) is rejected
	 * at index time. A field that defines <code>null_value</code> is always exempt,
	 * since the configured default removes the absence of a value. Only has an
	 * effect when columnar index mode is active.
	 * <p>
	 * API name: {@code nullability}
	 */
	@Nullable
	public final Boolean nullability() {
		return this.nullability;
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

		if (this.multiValue != null) {
			generator.writeKey("multi_value");
			generator.write(this.multiValue);

		}
		if (this.nullability != null) {
			generator.writeKey("nullability");
			generator.write(this.nullability);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocValuesConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DocValuesConfig> {
		@Nullable
		private Boolean multiValue;

		@Nullable
		private Boolean nullability;

		public Builder() {
		}
		private Builder(DocValuesConfig instance) {
			this.multiValue = instance.multiValue;
			this.nullability = instance.nullability;

		}
		/**
		 * If <code>false</code>, the field is treated as single-valued, enabling
		 * optimized storage. Only has an effect when columnar index mode is active.
		 * <p>
		 * API name: {@code multi_value}
		 */
		public final Builder multiValue(@Nullable Boolean value) {
			this.multiValue = value;
			return this;
		}

		/**
		 * If <code>false</code>, every document must provide a non-null value for the
		 * field: a document that omits the field, sets it to <code>null</code>, or
		 * supplies only null values (an empty array or an all-null array) is rejected
		 * at index time. A field that defines <code>null_value</code> is always exempt,
		 * since the configured default removes the absence of a value. Only has an
		 * effect when columnar index mode is active.
		 * <p>
		 * API name: {@code nullability}
		 */
		public final Builder nullability(@Nullable Boolean value) {
			this.nullability = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DocValuesConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocValuesConfig build() {
			_checkSingleUse();

			return new DocValuesConfig(this);
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
	 * Json deserializer for {@link DocValuesConfig}
	 */
	public static final JsonpDeserializer<DocValuesConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DocValuesConfig::setupDocValuesConfigDeserializer);

	protected static void setupDocValuesConfigDeserializer(ObjectDeserializer<DocValuesConfig.Builder> op) {

		op.add(Builder::multiValue, JsonpDeserializer.booleanDeserializer(), "multi_value");
		op.add(Builder::nullability, JsonpDeserializer.booleanDeserializer(), "nullability");

	}

}
