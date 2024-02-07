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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: xpack.usage.Vector

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Vector">API
 *      specification</a>
 */
@JsonpDeserializable
public class Vector extends Base {
	private final int denseVectorDimsAvgCount;

	private final int denseVectorFieldsCount;

	@Nullable
	private final Integer sparseVectorFieldsCount;

	// ---------------------------------------------------------------------------------------------

	private Vector(Builder builder) {
		super(builder);

		this.denseVectorDimsAvgCount = ApiTypeHelper.requireNonNull(builder.denseVectorDimsAvgCount, this,
				"denseVectorDimsAvgCount");
		this.denseVectorFieldsCount = ApiTypeHelper.requireNonNull(builder.denseVectorFieldsCount, this,
				"denseVectorFieldsCount");
		this.sparseVectorFieldsCount = builder.sparseVectorFieldsCount;

	}

	public static Vector of(Function<Builder, ObjectBuilder<Vector>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code dense_vector_dims_avg_count}
	 */
	public final int denseVectorDimsAvgCount() {
		return this.denseVectorDimsAvgCount;
	}

	/**
	 * Required - API name: {@code dense_vector_fields_count}
	 */
	public final int denseVectorFieldsCount() {
		return this.denseVectorFieldsCount;
	}

	/**
	 * API name: {@code sparse_vector_fields_count}
	 */
	@Nullable
	public final Integer sparseVectorFieldsCount() {
		return this.sparseVectorFieldsCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("dense_vector_dims_avg_count");
		generator.write(this.denseVectorDimsAvgCount);

		generator.writeKey("dense_vector_fields_count");
		generator.write(this.denseVectorFieldsCount);

		if (this.sparseVectorFieldsCount != null) {
			generator.writeKey("sparse_vector_fields_count");
			generator.write(this.sparseVectorFieldsCount);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Vector}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Vector> {
		private Integer denseVectorDimsAvgCount;

		private Integer denseVectorFieldsCount;

		@Nullable
		private Integer sparseVectorFieldsCount;

		/**
		 * Required - API name: {@code dense_vector_dims_avg_count}
		 */
		public final Builder denseVectorDimsAvgCount(int value) {
			this.denseVectorDimsAvgCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code dense_vector_fields_count}
		 */
		public final Builder denseVectorFieldsCount(int value) {
			this.denseVectorFieldsCount = value;
			return this;
		}

		/**
		 * API name: {@code sparse_vector_fields_count}
		 */
		public final Builder sparseVectorFieldsCount(@Nullable Integer value) {
			this.sparseVectorFieldsCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Vector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Vector build() {
			_checkSingleUse();

			return new Vector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Vector}
	 */
	public static final JsonpDeserializer<Vector> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Vector::setupVectorDeserializer);

	protected static void setupVectorDeserializer(ObjectDeserializer<Vector.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::denseVectorDimsAvgCount, JsonpDeserializer.integerDeserializer(),
				"dense_vector_dims_avg_count");
		op.add(Builder::denseVectorFieldsCount, JsonpDeserializer.integerDeserializer(), "dense_vector_fields_count");
		op.add(Builder::sparseVectorFieldsCount, JsonpDeserializer.integerDeserializer(), "sparse_vector_fields_count");

	}

}
