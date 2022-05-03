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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

	private final int m;

	private final int efConstruction;

	// ---------------------------------------------------------------------------------------------

	private DenseVectorIndexOptions(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.m = ApiTypeHelper.requireNonNull(builder.m, this, "m");
		this.efConstruction = ApiTypeHelper.requireNonNull(builder.efConstruction, this, "efConstruction");

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
	 * Required - API name: {@code m}
	 */
	public final int m() {
		return this.m;
	}

	/**
	 * Required - API name: {@code ef_construction}
	 */
	public final int efConstruction() {
		return this.efConstruction;
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

		generator.writeKey("m");
		generator.write(this.m);

		generator.writeKey("ef_construction");
		generator.write(this.efConstruction);

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

		private Integer m;

		private Integer efConstruction;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code m}
		 */
		public final Builder m(int value) {
			this.m = value;
			return this;
		}

		/**
		 * Required - API name: {@code ef_construction}
		 */
		public final Builder efConstruction(int value) {
			this.efConstruction = value;
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

	}

}
