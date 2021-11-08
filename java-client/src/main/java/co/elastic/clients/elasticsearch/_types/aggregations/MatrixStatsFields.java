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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MatrixStatsFields
@JsonpDeserializable
public class MatrixStatsFields implements JsonpSerializable {
	private final String name;

	private final long count;

	private final double mean;

	private final double variance;

	private final double skewness;

	private final double kurtosis;

	private final Map<String, Double> covariance;

	private final Map<String, Double> correlation;

	// ---------------------------------------------------------------------------------------------

	private MatrixStatsFields(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.mean = ModelTypeHelper.requireNonNull(builder.mean, this, "mean");
		this.variance = ModelTypeHelper.requireNonNull(builder.variance, this, "variance");
		this.skewness = ModelTypeHelper.requireNonNull(builder.skewness, this, "skewness");
		this.kurtosis = ModelTypeHelper.requireNonNull(builder.kurtosis, this, "kurtosis");
		this.covariance = ModelTypeHelper.unmodifiableRequired(builder.covariance, this, "covariance");
		this.correlation = ModelTypeHelper.unmodifiableRequired(builder.correlation, this, "correlation");

	}

	public static MatrixStatsFields of(Function<Builder, ObjectBuilder<MatrixStatsFields>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code mean}
	 */
	public final double mean() {
		return this.mean;
	}

	/**
	 * Required - API name: {@code variance}
	 */
	public final double variance() {
		return this.variance;
	}

	/**
	 * Required - API name: {@code skewness}
	 */
	public final double skewness() {
		return this.skewness;
	}

	/**
	 * Required - API name: {@code kurtosis}
	 */
	public final double kurtosis() {
		return this.kurtosis;
	}

	/**
	 * Required - API name: {@code covariance}
	 */
	public final Map<String, Double> covariance() {
		return this.covariance;
	}

	/**
	 * Required - API name: {@code correlation}
	 */
	public final Map<String, Double> correlation() {
		return this.correlation;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("mean");
		generator.write(this.mean);

		generator.writeKey("variance");
		generator.write(this.variance);

		generator.writeKey("skewness");
		generator.write(this.skewness);

		generator.writeKey("kurtosis");
		generator.write(this.kurtosis);

		if (ModelTypeHelper.isDefined(this.covariance)) {
			generator.writeKey("covariance");
			generator.writeStartObject();
			for (Map.Entry<String, Double> item0 : this.covariance.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.correlation)) {
			generator.writeKey("correlation");
			generator.writeStartObject();
			for (Map.Entry<String, Double> item0 : this.correlation.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatrixStatsFields}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MatrixStatsFields> {
		private String name;

		private Long count;

		private Double mean;

		private Double variance;

		private Double skewness;

		private Double kurtosis;

		private Map<String, Double> covariance;

		private Map<String, Double> correlation;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code mean}
		 */
		public final Builder mean(double value) {
			this.mean = value;
			return this;
		}

		/**
		 * Required - API name: {@code variance}
		 */
		public final Builder variance(double value) {
			this.variance = value;
			return this;
		}

		/**
		 * Required - API name: {@code skewness}
		 */
		public final Builder skewness(double value) {
			this.skewness = value;
			return this;
		}

		/**
		 * Required - API name: {@code kurtosis}
		 */
		public final Builder kurtosis(double value) {
			this.kurtosis = value;
			return this;
		}

		/**
		 * Required - API name: {@code covariance}
		 */
		public final Builder covariance(Map<String, Double> value) {
			this.covariance = value;
			return this;
		}

		/**
		 * Required - API name: {@code correlation}
		 */
		public final Builder correlation(Map<String, Double> value) {
			this.correlation = value;
			return this;
		}

		/**
		 * Builds a {@link MatrixStatsFields}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatrixStatsFields build() {
			_checkSingleUse();

			return new MatrixStatsFields(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatrixStatsFields}
	 */
	public static final JsonpDeserializer<MatrixStatsFields> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MatrixStatsFields::setupMatrixStatsFieldsDeserializer, Builder::build);

	protected static void setupMatrixStatsFieldsDeserializer(DelegatingDeserializer<MatrixStatsFields.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::mean, JsonpDeserializer.doubleDeserializer(), "mean");
		op.add(Builder::variance, JsonpDeserializer.doubleDeserializer(), "variance");
		op.add(Builder::skewness, JsonpDeserializer.doubleDeserializer(), "skewness");
		op.add(Builder::kurtosis, JsonpDeserializer.doubleDeserializer(), "kurtosis");
		op.add(Builder::covariance, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"covariance");
		op.add(Builder::correlation, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"correlation");

	}

}
