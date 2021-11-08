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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.AnomalyCause
@JsonpDeserializable
public class AnomalyCause implements JsonpSerializable {
	private final List<Double> actual;

	private final String byFieldName;

	private final String byFieldValue;

	private final String correlatedByFieldValue;

	private final String fieldName;

	private final String function;

	private final String functionDescription;

	private final List<Influence> influencers;

	private final String overFieldName;

	private final String overFieldValue;

	private final String partitionFieldName;

	private final String partitionFieldValue;

	private final double probability;

	private final List<Double> typical;

	// ---------------------------------------------------------------------------------------------

	private AnomalyCause(Builder builder) {

		this.actual = ModelTypeHelper.unmodifiableRequired(builder.actual, this, "actual");
		this.byFieldName = ModelTypeHelper.requireNonNull(builder.byFieldName, this, "byFieldName");
		this.byFieldValue = ModelTypeHelper.requireNonNull(builder.byFieldValue, this, "byFieldValue");
		this.correlatedByFieldValue = ModelTypeHelper.requireNonNull(builder.correlatedByFieldValue, this,
				"correlatedByFieldValue");
		this.fieldName = ModelTypeHelper.requireNonNull(builder.fieldName, this, "fieldName");
		this.function = ModelTypeHelper.requireNonNull(builder.function, this, "function");
		this.functionDescription = ModelTypeHelper.requireNonNull(builder.functionDescription, this,
				"functionDescription");
		this.influencers = ModelTypeHelper.unmodifiableRequired(builder.influencers, this, "influencers");
		this.overFieldName = ModelTypeHelper.requireNonNull(builder.overFieldName, this, "overFieldName");
		this.overFieldValue = ModelTypeHelper.requireNonNull(builder.overFieldValue, this, "overFieldValue");
		this.partitionFieldName = ModelTypeHelper.requireNonNull(builder.partitionFieldName, this,
				"partitionFieldName");
		this.partitionFieldValue = ModelTypeHelper.requireNonNull(builder.partitionFieldValue, this,
				"partitionFieldValue");
		this.probability = ModelTypeHelper.requireNonNull(builder.probability, this, "probability");
		this.typical = ModelTypeHelper.unmodifiableRequired(builder.typical, this, "typical");

	}

	public static AnomalyCause of(Function<Builder, ObjectBuilder<AnomalyCause>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code actual}
	 */
	public final List<Double> actual() {
		return this.actual;
	}

	/**
	 * Required - API name: {@code by_field_name}
	 */
	public final String byFieldName() {
		return this.byFieldName;
	}

	/**
	 * Required - API name: {@code by_field_value}
	 */
	public final String byFieldValue() {
		return this.byFieldValue;
	}

	/**
	 * Required - API name: {@code correlated_by_field_value}
	 */
	public final String correlatedByFieldValue() {
		return this.correlatedByFieldValue;
	}

	/**
	 * Required - API name: {@code field_name}
	 */
	public final String fieldName() {
		return this.fieldName;
	}

	/**
	 * Required - API name: {@code function}
	 */
	public final String function() {
		return this.function;
	}

	/**
	 * Required - API name: {@code function_description}
	 */
	public final String functionDescription() {
		return this.functionDescription;
	}

	/**
	 * Required - API name: {@code influencers}
	 */
	public final List<Influence> influencers() {
		return this.influencers;
	}

	/**
	 * Required - API name: {@code over_field_name}
	 */
	public final String overFieldName() {
		return this.overFieldName;
	}

	/**
	 * Required - API name: {@code over_field_value}
	 */
	public final String overFieldValue() {
		return this.overFieldValue;
	}

	/**
	 * Required - API name: {@code partition_field_name}
	 */
	public final String partitionFieldName() {
		return this.partitionFieldName;
	}

	/**
	 * Required - API name: {@code partition_field_value}
	 */
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
	 * Required - API name: {@code typical}
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

		if (ModelTypeHelper.isDefined(this.actual)) {
			generator.writeKey("actual");
			generator.writeStartArray();
			for (Double item0 : this.actual) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("by_field_name");
		generator.write(this.byFieldName);

		generator.writeKey("by_field_value");
		generator.write(this.byFieldValue);

		generator.writeKey("correlated_by_field_value");
		generator.write(this.correlatedByFieldValue);

		generator.writeKey("field_name");
		generator.write(this.fieldName);

		generator.writeKey("function");
		generator.write(this.function);

		generator.writeKey("function_description");
		generator.write(this.functionDescription);

		if (ModelTypeHelper.isDefined(this.influencers)) {
			generator.writeKey("influencers");
			generator.writeStartArray();
			for (Influence item0 : this.influencers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("over_field_name");
		generator.write(this.overFieldName);

		generator.writeKey("over_field_value");
		generator.write(this.overFieldValue);

		generator.writeKey("partition_field_name");
		generator.write(this.partitionFieldName);

		generator.writeKey("partition_field_value");
		generator.write(this.partitionFieldValue);

		generator.writeKey("probability");
		generator.write(this.probability);

		if (ModelTypeHelper.isDefined(this.typical)) {
			generator.writeKey("typical");
			generator.writeStartArray();
			for (Double item0 : this.typical) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnomalyCause}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AnomalyCause> {
		private List<Double> actual;

		private String byFieldName;

		private String byFieldValue;

		private String correlatedByFieldValue;

		private String fieldName;

		private String function;

		private String functionDescription;

		private List<Influence> influencers;

		private String overFieldName;

		private String overFieldValue;

		private String partitionFieldName;

		private String partitionFieldValue;

		private Double probability;

		private List<Double> typical;

		/**
		 * Required - API name: {@code actual}
		 */
		public final Builder actual(List<Double> value) {
			this.actual = value;
			return this;
		}

		/**
		 * Required - API name: {@code actual}
		 */
		public final Builder actual(Double... value) {
			this.actual = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code by_field_name}
		 */
		public final Builder byFieldName(String value) {
			this.byFieldName = value;
			return this;
		}

		/**
		 * Required - API name: {@code by_field_value}
		 */
		public final Builder byFieldValue(String value) {
			this.byFieldValue = value;
			return this;
		}

		/**
		 * Required - API name: {@code correlated_by_field_value}
		 */
		public final Builder correlatedByFieldValue(String value) {
			this.correlatedByFieldValue = value;
			return this;
		}

		/**
		 * Required - API name: {@code field_name}
		 */
		public final Builder fieldName(String value) {
			this.fieldName = value;
			return this;
		}

		/**
		 * Required - API name: {@code function}
		 */
		public final Builder function(String value) {
			this.function = value;
			return this;
		}

		/**
		 * Required - API name: {@code function_description}
		 */
		public final Builder functionDescription(String value) {
			this.functionDescription = value;
			return this;
		}

		/**
		 * Required - API name: {@code influencers}
		 */
		public final Builder influencers(List<Influence> value) {
			this.influencers = value;
			return this;
		}

		/**
		 * Required - API name: {@code influencers}
		 */
		public final Builder influencers(Influence... value) {
			this.influencers = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code influencers}
		 */
		@SafeVarargs
		public final Builder influencers(Function<Influence.Builder, ObjectBuilder<Influence>>... fns) {
			this.influencers = new ArrayList<>(fns.length);
			for (Function<Influence.Builder, ObjectBuilder<Influence>> fn : fns) {
				this.influencers.add(fn.apply(new Influence.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code over_field_name}
		 */
		public final Builder overFieldName(String value) {
			this.overFieldName = value;
			return this;
		}

		/**
		 * Required - API name: {@code over_field_value}
		 */
		public final Builder overFieldValue(String value) {
			this.overFieldValue = value;
			return this;
		}

		/**
		 * Required - API name: {@code partition_field_name}
		 */
		public final Builder partitionFieldName(String value) {
			this.partitionFieldName = value;
			return this;
		}

		/**
		 * Required - API name: {@code partition_field_value}
		 */
		public final Builder partitionFieldValue(String value) {
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
		 * Required - API name: {@code typical}
		 */
		public final Builder typical(List<Double> value) {
			this.typical = value;
			return this;
		}

		/**
		 * Required - API name: {@code typical}
		 */
		public final Builder typical(Double... value) {
			this.typical = Arrays.asList(value);
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnomalyCause}
	 */
	public static final JsonpDeserializer<AnomalyCause> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AnomalyCause::setupAnomalyCauseDeserializer, Builder::build);

	protected static void setupAnomalyCauseDeserializer(DelegatingDeserializer<AnomalyCause.Builder> op) {

		op.add(Builder::actual, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()), "actual");
		op.add(Builder::byFieldName, JsonpDeserializer.stringDeserializer(), "by_field_name");
		op.add(Builder::byFieldValue, JsonpDeserializer.stringDeserializer(), "by_field_value");
		op.add(Builder::correlatedByFieldValue, JsonpDeserializer.stringDeserializer(), "correlated_by_field_value");
		op.add(Builder::fieldName, JsonpDeserializer.stringDeserializer(), "field_name");
		op.add(Builder::function, JsonpDeserializer.stringDeserializer(), "function");
		op.add(Builder::functionDescription, JsonpDeserializer.stringDeserializer(), "function_description");
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
