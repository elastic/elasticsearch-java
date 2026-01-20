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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Double;
import java.lang.String;
import java.util.List;
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

// typedef: ml._types.AnomalyCause

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.AnomalyCause">API
 *      specification</a>
 */
@JsonpDeserializable
public class AnomalyCause implements JsonpSerializable {
	private final List<Double> actual;

	@Nullable
	private final String byFieldName;

	@Nullable
	private final String byFieldValue;

	@Nullable
	private final String correlatedByFieldValue;

	@Nullable
	private final String fieldName;

	@Nullable
	private final String function;

	@Nullable
	private final String functionDescription;

	@Nullable
	private final GeoResults geoResults;

	private final List<Influence> influencers;

	@Nullable
	private final String overFieldName;

	@Nullable
	private final String overFieldValue;

	@Nullable
	private final String partitionFieldName;

	@Nullable
	private final String partitionFieldValue;

	private final double probability;

	private final List<Double> typical;

	// ---------------------------------------------------------------------------------------------

	private AnomalyCause(Builder builder) {

		this.actual = ApiTypeHelper.unmodifiable(builder.actual);
		this.byFieldName = builder.byFieldName;
		this.byFieldValue = builder.byFieldValue;
		this.correlatedByFieldValue = builder.correlatedByFieldValue;
		this.fieldName = builder.fieldName;
		this.function = builder.function;
		this.functionDescription = builder.functionDescription;
		this.geoResults = builder.geoResults;
		this.influencers = ApiTypeHelper.unmodifiable(builder.influencers);
		this.overFieldName = builder.overFieldName;
		this.overFieldValue = builder.overFieldValue;
		this.partitionFieldName = builder.partitionFieldName;
		this.partitionFieldValue = builder.partitionFieldValue;
		this.probability = ApiTypeHelper.requireNonNull(builder.probability, this, "probability", 0);
		this.typical = ApiTypeHelper.unmodifiable(builder.typical);

	}

	public static AnomalyCause of(Function<Builder, ObjectBuilder<AnomalyCause>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code actual}
	 */
	public final List<Double> actual() {
		return this.actual;
	}

	/**
	 * API name: {@code by_field_name}
	 */
	@Nullable
	public final String byFieldName() {
		return this.byFieldName;
	}

	/**
	 * API name: {@code by_field_value}
	 */
	@Nullable
	public final String byFieldValue() {
		return this.byFieldValue;
	}

	/**
	 * API name: {@code correlated_by_field_value}
	 */
	@Nullable
	public final String correlatedByFieldValue() {
		return this.correlatedByFieldValue;
	}

	/**
	 * API name: {@code field_name}
	 */
	@Nullable
	public final String fieldName() {
		return this.fieldName;
	}

	/**
	 * API name: {@code function}
	 */
	@Nullable
	public final String function() {
		return this.function;
	}

	/**
	 * API name: {@code function_description}
	 */
	@Nullable
	public final String functionDescription() {
		return this.functionDescription;
	}

	/**
	 * API name: {@code geo_results}
	 */
	@Nullable
	public final GeoResults geoResults() {
		return this.geoResults;
	}

	/**
	 * API name: {@code influencers}
	 */
	public final List<Influence> influencers() {
		return this.influencers;
	}

	/**
	 * API name: {@code over_field_name}
	 */
	@Nullable
	public final String overFieldName() {
		return this.overFieldName;
	}

	/**
	 * API name: {@code over_field_value}
	 */
	@Nullable
	public final String overFieldValue() {
		return this.overFieldValue;
	}

	/**
	 * API name: {@code partition_field_name}
	 */
	@Nullable
	public final String partitionFieldName() {
		return this.partitionFieldName;
	}

	/**
	 * API name: {@code partition_field_value}
	 */
	@Nullable
	public final String partitionFieldValue() {
		return this.partitionFieldValue;
	}

	/**
	 * Required - API name: {@code probability}
	 */
	public final double probability() {
		return this.probability;
	}

	/**
	 * API name: {@code typical}
	 */
	public final List<Double> typical() {
		return this.typical;
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

		if (ApiTypeHelper.isDefined(this.actual)) {
			generator.writeKey("actual");
			generator.writeStartArray();
			for (Double item0 : this.actual) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.byFieldName != null) {
			generator.writeKey("by_field_name");
			generator.write(this.byFieldName);

		}
		if (this.byFieldValue != null) {
			generator.writeKey("by_field_value");
			generator.write(this.byFieldValue);

		}
		if (this.correlatedByFieldValue != null) {
			generator.writeKey("correlated_by_field_value");
			generator.write(this.correlatedByFieldValue);

		}
		if (this.fieldName != null) {
			generator.writeKey("field_name");
			generator.write(this.fieldName);

		}
		if (this.function != null) {
			generator.writeKey("function");
			generator.write(this.function);

		}
		if (this.functionDescription != null) {
			generator.writeKey("function_description");
			generator.write(this.functionDescription);

		}
		if (this.geoResults != null) {
			generator.writeKey("geo_results");
			this.geoResults.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.influencers)) {
			generator.writeKey("influencers");
			generator.writeStartArray();
			for (Influence item0 : this.influencers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.overFieldName != null) {
			generator.writeKey("over_field_name");
			generator.write(this.overFieldName);

		}
		if (this.overFieldValue != null) {
			generator.writeKey("over_field_value");
			generator.write(this.overFieldValue);

		}
		if (this.partitionFieldName != null) {
			generator.writeKey("partition_field_name");
			generator.write(this.partitionFieldName);

		}
		if (this.partitionFieldValue != null) {
			generator.writeKey("partition_field_value");
			generator.write(this.partitionFieldValue);

		}
		generator.writeKey("probability");
		generator.write(this.probability);

		if (ApiTypeHelper.isDefined(this.typical)) {
			generator.writeKey("typical");
			generator.writeStartArray();
			for (Double item0 : this.typical) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnomalyCause}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AnomalyCause> {
		@Nullable
		private List<Double> actual;

		@Nullable
		private String byFieldName;

		@Nullable
		private String byFieldValue;

		@Nullable
		private String correlatedByFieldValue;

		@Nullable
		private String fieldName;

		@Nullable
		private String function;

		@Nullable
		private String functionDescription;

		@Nullable
		private GeoResults geoResults;

		@Nullable
		private List<Influence> influencers;

		@Nullable
		private String overFieldName;

		@Nullable
		private String overFieldValue;

		@Nullable
		private String partitionFieldName;

		@Nullable
		private String partitionFieldValue;

		private Double probability;

		@Nullable
		private List<Double> typical;

		public Builder() {
		}
		private Builder(AnomalyCause instance) {
			this.actual = instance.actual;
			this.byFieldName = instance.byFieldName;
			this.byFieldValue = instance.byFieldValue;
			this.correlatedByFieldValue = instance.correlatedByFieldValue;
			this.fieldName = instance.fieldName;
			this.function = instance.function;
			this.functionDescription = instance.functionDescription;
			this.geoResults = instance.geoResults;
			this.influencers = instance.influencers;
			this.overFieldName = instance.overFieldName;
			this.overFieldValue = instance.overFieldValue;
			this.partitionFieldName = instance.partitionFieldName;
			this.partitionFieldValue = instance.partitionFieldValue;
			this.probability = instance.probability;
			this.typical = instance.typical;

		}
		/**
		 * API name: {@code actual}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actual</code>.
		 */
		public final Builder actual(List<Double> list) {
			this.actual = _listAddAll(this.actual, list);
			return this;
		}

		/**
		 * API name: {@code actual}
		 * <p>
		 * Adds one or more values to <code>actual</code>.
		 */
		public final Builder actual(Double value, Double... values) {
			this.actual = _listAdd(this.actual, value, values);
			return this;
		}

		/**
		 * API name: {@code by_field_name}
		 */
		public final Builder byFieldName(@Nullable String value) {
			this.byFieldName = value;
			return this;
		}

		/**
		 * API name: {@code by_field_value}
		 */
		public final Builder byFieldValue(@Nullable String value) {
			this.byFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code correlated_by_field_value}
		 */
		public final Builder correlatedByFieldValue(@Nullable String value) {
			this.correlatedByFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code field_name}
		 */
		public final Builder fieldName(@Nullable String value) {
			this.fieldName = value;
			return this;
		}

		/**
		 * API name: {@code function}
		 */
		public final Builder function(@Nullable String value) {
			this.function = value;
			return this;
		}

		/**
		 * API name: {@code function_description}
		 */
		public final Builder functionDescription(@Nullable String value) {
			this.functionDescription = value;
			return this;
		}

		/**
		 * API name: {@code geo_results}
		 */
		public final Builder geoResults(@Nullable GeoResults value) {
			this.geoResults = value;
			return this;
		}

		/**
		 * API name: {@code geo_results}
		 */
		public final Builder geoResults(Function<GeoResults.Builder, ObjectBuilder<GeoResults>> fn) {
			return this.geoResults(fn.apply(new GeoResults.Builder()).build());
		}

		/**
		 * API name: {@code influencers}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>influencers</code>.
		 */
		public final Builder influencers(List<Influence> list) {
			this.influencers = _listAddAll(this.influencers, list);
			return this;
		}

		/**
		 * API name: {@code influencers}
		 * <p>
		 * Adds one or more values to <code>influencers</code>.
		 */
		public final Builder influencers(Influence value, Influence... values) {
			this.influencers = _listAdd(this.influencers, value, values);
			return this;
		}

		/**
		 * API name: {@code influencers}
		 * <p>
		 * Adds a value to <code>influencers</code> using a builder lambda.
		 */
		public final Builder influencers(Function<Influence.Builder, ObjectBuilder<Influence>> fn) {
			return influencers(fn.apply(new Influence.Builder()).build());
		}

		/**
		 * API name: {@code over_field_name}
		 */
		public final Builder overFieldName(@Nullable String value) {
			this.overFieldName = value;
			return this;
		}

		/**
		 * API name: {@code over_field_value}
		 */
		public final Builder overFieldValue(@Nullable String value) {
			this.overFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_name}
		 */
		public final Builder partitionFieldName(@Nullable String value) {
			this.partitionFieldName = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_value}
		 */
		public final Builder partitionFieldValue(@Nullable String value) {
			this.partitionFieldValue = value;
			return this;
		}

		/**
		 * Required - API name: {@code probability}
		 */
		public final Builder probability(double value) {
			this.probability = value;
			return this;
		}

		/**
		 * API name: {@code typical}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>typical</code>.
		 */
		public final Builder typical(List<Double> list) {
			this.typical = _listAddAll(this.typical, list);
			return this;
		}

		/**
		 * API name: {@code typical}
		 * <p>
		 * Adds one or more values to <code>typical</code>.
		 */
		public final Builder typical(Double value, Double... values) {
			this.typical = _listAdd(this.typical, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AnomalyCause}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnomalyCause build() {
			_checkSingleUse();

			return new AnomalyCause(this);
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
	 * Json deserializer for {@link AnomalyCause}
	 */
	public static final JsonpDeserializer<AnomalyCause> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AnomalyCause::setupAnomalyCauseDeserializer);

	protected static void setupAnomalyCauseDeserializer(ObjectDeserializer<AnomalyCause.Builder> op) {

		op.add(Builder::actual, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()), "actual");
		op.add(Builder::byFieldName, JsonpDeserializer.stringDeserializer(), "by_field_name");
		op.add(Builder::byFieldValue, JsonpDeserializer.stringDeserializer(), "by_field_value");
		op.add(Builder::correlatedByFieldValue, JsonpDeserializer.stringDeserializer(), "correlated_by_field_value");
		op.add(Builder::fieldName, JsonpDeserializer.stringDeserializer(), "field_name");
		op.add(Builder::function, JsonpDeserializer.stringDeserializer(), "function");
		op.add(Builder::functionDescription, JsonpDeserializer.stringDeserializer(), "function_description");
		op.add(Builder::geoResults, GeoResults._DESERIALIZER, "geo_results");
		op.add(Builder::influencers, JsonpDeserializer.arrayDeserializer(Influence._DESERIALIZER), "influencers");
		op.add(Builder::overFieldName, JsonpDeserializer.stringDeserializer(), "over_field_name");
		op.add(Builder::overFieldValue, JsonpDeserializer.stringDeserializer(), "over_field_value");
		op.add(Builder::partitionFieldName, JsonpDeserializer.stringDeserializer(), "partition_field_name");
		op.add(Builder::partitionFieldValue, JsonpDeserializer.stringDeserializer(), "partition_field_value");
		op.add(Builder::probability, JsonpDeserializer.doubleDeserializer(), "probability");
		op.add(Builder::typical, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()),
				"typical");

	}

}
