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

package co.elastic.clients.elasticsearch.indices.segments;

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

// typedef: indices.segments.OsqSegmentAutoCalibration

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.segments.OsqSegmentAutoCalibration">API
 *      specification</a>
 */
@JsonpDeserializable
public class OsqSegmentAutoCalibration extends SegmentAutoCalibrationBase implements SegmentAutoCalibrationVariant {
	@Nullable
	private final OsqSegmentAutoCalibrationParameters parameters;

	// ---------------------------------------------------------------------------------------------

	private OsqSegmentAutoCalibration(Builder builder) {
		super(builder);

		this.parameters = builder.parameters;

	}

	public static OsqSegmentAutoCalibration of(Function<Builder, ObjectBuilder<OsqSegmentAutoCalibration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SegmentAutoCalibration variant kind.
	 */
	@Override
	public SegmentAutoCalibration.Kind _segmentAutoCalibrationKind() {
		return SegmentAutoCalibration.Kind.Osq;
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
	 * Builder for {@link OsqSegmentAutoCalibration}.
	 */

	public static class Builder extends SegmentAutoCalibrationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<OsqSegmentAutoCalibration> {
		@Nullable
		private OsqSegmentAutoCalibrationParameters parameters;

		public Builder() {
		}
		private Builder(OsqSegmentAutoCalibration instance) {
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
		 * Builds a {@link OsqSegmentAutoCalibration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OsqSegmentAutoCalibration build() {
			_checkSingleUse();

			return new OsqSegmentAutoCalibration(this);
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
	 * Json deserializer for {@link OsqSegmentAutoCalibration}
	 */
	public static final JsonpDeserializer<OsqSegmentAutoCalibration> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OsqSegmentAutoCalibration::setupOsqSegmentAutoCalibrationDeserializer);

	protected static void setupOsqSegmentAutoCalibrationDeserializer(
			ObjectDeserializer<OsqSegmentAutoCalibration.Builder> op) {
		SegmentAutoCalibrationBase.setupSegmentAutoCalibrationBaseDeserializer(op);
		op.add(Builder::parameters, OsqSegmentAutoCalibrationParameters._DESERIALIZER, "parameters");

		op.ignore("type");
	}

}
