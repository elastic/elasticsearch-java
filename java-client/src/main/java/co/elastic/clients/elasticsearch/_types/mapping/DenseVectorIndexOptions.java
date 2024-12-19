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
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
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

// typedef: _types.mapping.DenseVectorIndexOptions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DenseVectorIndexOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class DenseVectorIndexOptions implements JsonpSerializable {
	private final String type;

	@Nullable
	private final Integer m;

	@Nullable
	private final Integer efConstruction;

	@Nullable
	private final Float confidenceInterval;

	// ---------------------------------------------------------------------------------------------

	private DenseVectorIndexOptions(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.m = builder.m;
		this.efConstruction = builder.efConstruction;
		this.confidenceInterval = builder.confidenceInterval;

	}

	public static DenseVectorIndexOptions of(Function<Builder, ObjectBuilder<DenseVectorIndexOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code m}
	 */
	@Nullable
	public final Integer m() {
		return this.m;
	}

	/**
	 * API name: {@code ef_construction}
	 */
	@Nullable
	public final Integer efConstruction() {
		return this.efConstruction;
	}

	/**
	 * API name: {@code confidence_interval}
	 */
	@Nullable
	public final Float confidenceInterval() {
		return this.confidenceInterval;
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

		generator.writeKey("type");
		generator.write(this.type);

		if (this.m != null) {
			generator.writeKey("m");
			generator.write(this.m);

		}
		if (this.efConstruction != null) {
			generator.writeKey("ef_construction");
			generator.write(this.efConstruction);

		}
		if (this.confidenceInterval != null) {
			generator.writeKey("confidence_interval");
			generator.write(this.confidenceInterval);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DenseVectorIndexOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DenseVectorIndexOptions> {
		private String type;

		@Nullable
		private Integer m;

		@Nullable
		private Integer efConstruction;

		@Nullable
		private Float confidenceInterval;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code m}
		 */
		public final Builder m(@Nullable Integer value) {
			this.m = value;
			return this;
		}

		/**
		 * API name: {@code ef_construction}
		 */
		public final Builder efConstruction(@Nullable Integer value) {
			this.efConstruction = value;
			return this;
		}

		/**
		 * API name: {@code confidence_interval}
		 */
		public final Builder confidenceInterval(@Nullable Float value) {
			this.confidenceInterval = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DenseVectorIndexOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DenseVectorIndexOptions build() {
			_checkSingleUse();

			return new DenseVectorIndexOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DenseVectorIndexOptions}
	 */
	public static final JsonpDeserializer<DenseVectorIndexOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DenseVectorIndexOptions::setupDenseVectorIndexOptionsDeserializer);

	protected static void setupDenseVectorIndexOptionsDeserializer(
			ObjectDeserializer<DenseVectorIndexOptions.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::m, JsonpDeserializer.integerDeserializer(), "m");
		op.add(Builder::efConstruction, JsonpDeserializer.integerDeserializer(), "ef_construction");
		op.add(Builder::confidenceInterval, JsonpDeserializer.floatDeserializer(), "confidence_interval");

	}

}
