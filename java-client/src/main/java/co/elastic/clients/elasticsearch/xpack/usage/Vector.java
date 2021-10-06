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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Vector
@JsonpDeserializable
public final class Vector extends Base {
	private final int denseVectorDimsAvgCount;

	private final int denseVectorFieldsCount;

	@Nullable
	private final Integer sparseVectorFieldsCount;

	// ---------------------------------------------------------------------------------------------

	public Vector(Builder builder) {
		super(builder);

		this.denseVectorDimsAvgCount = Objects.requireNonNull(builder.denseVectorDimsAvgCount,
				"dense_vector_dims_avg_count");
		this.denseVectorFieldsCount = Objects.requireNonNull(builder.denseVectorFieldsCount,
				"dense_vector_fields_count");
		this.sparseVectorFieldsCount = builder.sparseVectorFieldsCount;

	}

	public Vector(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code dense_vector_dims_avg_count}
	 */
	public int denseVectorDimsAvgCount() {
		return this.denseVectorDimsAvgCount;
	}

	/**
	 * Required - API name: {@code dense_vector_fields_count}
	 */
	public int denseVectorFieldsCount() {
		return this.denseVectorFieldsCount;
	}

	/**
	 * API name: {@code sparse_vector_fields_count}
	 */
	@Nullable
	public Integer sparseVectorFieldsCount() {
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
		public Builder denseVectorDimsAvgCount(int value) {
			this.denseVectorDimsAvgCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code dense_vector_fields_count}
		 */
		public Builder denseVectorFieldsCount(int value) {
			this.denseVectorFieldsCount = value;
			return this;
		}

		/**
		 * API name: {@code sparse_vector_fields_count}
		 */
		public Builder sparseVectorFieldsCount(@Nullable Integer value) {
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

			return new Vector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Vector}
	 */
	public static final JsonpDeserializer<Vector> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Vector::setupVectorDeserializer, Builder::build);

	protected static void setupVectorDeserializer(DelegatingDeserializer<Vector.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::denseVectorDimsAvgCount, JsonpDeserializer.integerDeserializer(),
				"dense_vector_dims_avg_count");
		op.add(Builder::denseVectorFieldsCount, JsonpDeserializer.integerDeserializer(), "dense_vector_fields_count");
		op.add(Builder::sparseVectorFieldsCount, JsonpDeserializer.integerDeserializer(), "sparse_vector_fields_count");

	}

}
