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

package co.elastic.clients.elasticsearch.esql;

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
import java.lang.Double;
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

// typedef: esql._types.EsqlApproximationSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#esql._types.EsqlApproximationSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class EsqlApproximationSettings implements JsonpSerializable {
	@Nullable
	private final Integer rows;

	@Nullable
	private final Double confidenceLevel;

	// ---------------------------------------------------------------------------------------------

	private EsqlApproximationSettings(Builder builder) {

		this.rows = builder.rows;
		this.confidenceLevel = builder.confidenceLevel;

	}

	public static EsqlApproximationSettings of(Function<Builder, ObjectBuilder<EsqlApproximationSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of sampled rows used for approximating the query. It must be at
	 * least 10,000. A null value uses the system default.
	 * <p>
	 * API name: {@code rows}
	 */
	@Nullable
	public final Integer rows() {
		return this.rows;
	}

	/**
	 * The confidence level of the computed confidence intervals. A null value
	 * disables computing confidence intervals.
	 * <p>
	 * API name: {@code confidence_level}
	 */
	@Nullable
	public final Double confidenceLevel() {
		return this.confidenceLevel;
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

		if (this.rows != null) {
			generator.writeKey("rows");
			generator.write(this.rows);

		}
		if (this.confidenceLevel != null) {
			generator.writeKey("confidence_level");
			generator.write(this.confidenceLevel);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EsqlApproximationSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EsqlApproximationSettings> {
		@Nullable
		private Integer rows;

		@Nullable
		private Double confidenceLevel;

		public Builder() {
		}
		private Builder(EsqlApproximationSettings instance) {
			this.rows = instance.rows;
			this.confidenceLevel = instance.confidenceLevel;

		}
		/**
		 * The number of sampled rows used for approximating the query. It must be at
		 * least 10,000. A null value uses the system default.
		 * <p>
		 * API name: {@code rows}
		 */
		public final Builder rows(@Nullable Integer value) {
			this.rows = value;
			return this;
		}

		/**
		 * The confidence level of the computed confidence intervals. A null value
		 * disables computing confidence intervals.
		 * <p>
		 * API name: {@code confidence_level}
		 */
		public final Builder confidenceLevel(@Nullable Double value) {
			this.confidenceLevel = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EsqlApproximationSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EsqlApproximationSettings build() {
			_checkSingleUse();

			return new EsqlApproximationSettings(this);
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
	 * Json deserializer for {@link EsqlApproximationSettings}
	 */
	public static final JsonpDeserializer<EsqlApproximationSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EsqlApproximationSettings::setupEsqlApproximationSettingsDeserializer);

	protected static void setupEsqlApproximationSettingsDeserializer(
			ObjectDeserializer<EsqlApproximationSettings.Builder> op) {

		op.add(Builder::rows, JsonpDeserializer.integerDeserializer(), "rows");
		op.add(Builder::confidenceLevel, JsonpDeserializer.doubleDeserializer(), "confidence_level");

	}

}
