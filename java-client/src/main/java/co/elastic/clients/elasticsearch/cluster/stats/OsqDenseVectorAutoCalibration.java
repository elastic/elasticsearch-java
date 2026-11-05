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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.elasticsearch.indices.segments.OsqSegmentAutoCalibrationParameters;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: cluster.stats.OsqDenseVectorAutoCalibration

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.OsqDenseVectorAutoCalibration">API
 *      specification</a>
 */
@JsonpDeserializable
public class OsqDenseVectorAutoCalibration extends DenseVectorAutoCalibrationBase
		implements
			DenseVectorAutoCalibrationVariant {
	@Nullable
	private final OsqSegmentAutoCalibrationParameters parameters;

	// ---------------------------------------------------------------------------------------------

	private OsqDenseVectorAutoCalibration(Builder builder) {
		super(builder);

		this.parameters = builder.parameters;

	}

	public static OsqDenseVectorAutoCalibration of(Function<Builder, ObjectBuilder<OsqDenseVectorAutoCalibration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DenseVectorAutoCalibration variant kind.
	 */
	@Override
	public DenseVectorAutoCalibration.Kind _denseVectorAutoCalibrationKind() {
		return DenseVectorAutoCalibration.Kind.Osq;
	}

	/**
	 * The calibration parameters.
	 * <p>
	 * API name: {@code parameters}
	 */
	@Nullable
	public final OsqSegmentAutoCalibrationParameters parameters() {
		return this.parameters;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "osq");
		super.serializeInternal(generator, mapper);
		if (this.parameters != null) {
			generator.writeKey("parameters");
			this.parameters.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OsqDenseVectorAutoCalibration}.
	 */

	public static class Builder extends DenseVectorAutoCalibrationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<OsqDenseVectorAutoCalibration> {
		@Nullable
		private OsqSegmentAutoCalibrationParameters parameters;

		public Builder() {
		}
		private Builder(OsqDenseVectorAutoCalibration instance) {
			super(instance);
			this.parameters = instance.parameters;

		}
		/**
		 * The calibration parameters.
		 * <p>
		 * API name: {@code parameters}
		 */
		public final Builder parameters(@Nullable OsqSegmentAutoCalibrationParameters value) {
			this.parameters = value;
			return this;
		}

		/**
		 * The calibration parameters.
		 * <p>
		 * API name: {@code parameters}
		 */
		public final Builder parameters(
				Function<OsqSegmentAutoCalibrationParameters.Builder, ObjectBuilder<OsqSegmentAutoCalibrationParameters>> fn) {
			return this.parameters(fn.apply(new OsqSegmentAutoCalibrationParameters.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OsqDenseVectorAutoCalibration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OsqDenseVectorAutoCalibration build() {
			_checkSingleUse();

			return new OsqDenseVectorAutoCalibration(this);
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
	 * Json deserializer for {@link OsqDenseVectorAutoCalibration}
	 */
	public static final JsonpDeserializer<OsqDenseVectorAutoCalibration> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OsqDenseVectorAutoCalibration::setupOsqDenseVectorAutoCalibrationDeserializer);

	protected static void setupOsqDenseVectorAutoCalibrationDeserializer(
			ObjectDeserializer<OsqDenseVectorAutoCalibration.Builder> op) {
		DenseVectorAutoCalibrationBase.setupDenseVectorAutoCalibrationBaseDeserializer(op);
		op.add(Builder::parameters, OsqSegmentAutoCalibrationParameters._DESERIALIZER, "parameters");

		op.ignore("type");
	}

}
