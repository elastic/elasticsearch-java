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
public final class AnomalyCause implements JsonpSerializable {
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

	public AnomalyCause(Builder builder) {

		this.actual = ModelTypeHelper.unmodifiableNonNull(builder.actual, "actual");
		this.byFieldName = Objects.requireNonNull(builder.byFieldName, "by_field_name");
		this.byFieldValue = Objects.requireNonNull(builder.byFieldValue, "by_field_value");
		this.correlatedByFieldValue = Objects.requireNonNull(builder.correlatedByFieldValue,
				"correlated_by_field_value");
		this.fieldName = Objects.requireNonNull(builder.fieldName, "field_name");
		this.function = Objects.requireNonNull(builder.function, "function");
		this.functionDescription = Objects.requireNonNull(builder.functionDescription, "function_description");
		this.influencers = ModelTypeHelper.unmodifiableNonNull(builder.influencers, "influencers");
		this.overFieldName = Objects.requireNonNull(builder.overFieldName, "over_field_name");
		this.overFieldValue = Objects.requireNonNull(builder.overFieldValue, "over_field_value");
		this.partitionFieldName = Objects.requireNonNull(builder.partitionFieldName, "partition_field_name");
		this.partitionFieldValue = Objects.requireNonNull(builder.partitionFieldValue, "partition_field_value");
		this.probability = Objects.requireNonNull(builder.probability, "probability");
		this.typical = ModelTypeHelper.unmodifiableNonNull(builder.typical, "typical");

	}

	public AnomalyCause(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code actual}
	 */
	public List<Double> actual() {
		return this.actual;
	}

	/**
	 * API name: {@code by_field_name}
	 */
	public String byFieldName() {
		return this.byFieldName;
	}

	/**
	 * API name: {@code by_field_value}
	 */
	public String byFieldValue() {
		return this.byFieldValue;
	}

	/**
	 * API name: {@code correlated_by_field_value}
	 */
	public String correlatedByFieldValue() {
		return this.correlatedByFieldValue;
	}

	/**
	 * API name: {@code field_name}
	 */
	public String fieldName() {
		return this.fieldName;
	}

	/**
	 * API name: {@code function}
	 */
	public String function() {
		return this.function;
	}

	/**
	 * API name: {@code function_description}
	 */
	public String functionDescription() {
		return this.functionDescription;
	}

	/**
	 * API name: {@code influencers}
	 */
	public List<Influence> influencers() {
		return this.influencers;
	}

	/**
	 * API name: {@code over_field_name}
	 */
	public String overFieldName() {
		return this.overFieldName;
	}

	/**
	 * API name: {@code over_field_value}
	 */
	public String overFieldValue() {
		return this.overFieldValue;
	}

	/**
	 * API name: {@code partition_field_name}
	 */
	public String partitionFieldName() {
		return this.partitionFieldName;
	}

	/**
	 * API name: {@code partition_field_value}
	 */
	public String partitionFieldValue() {
		return this.partitionFieldValue;
	}

	/**
	 * API name: {@code probability}
	 */
	public double probability() {
		return this.probability;
	}

	/**
	 * API name: {@code typical}
	 */
	public List<Double> typical() {
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

		generator.writeKey("actual");
		generator.writeStartArray();
		for (Double item0 : this.actual) {
			generator.write(item0);

		}
		generator.writeEnd();

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

		generator.writeKey("influencers");
		generator.writeStartArray();
		for (Influence item0 : this.influencers) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

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

		generator.writeKey("typical");
		generator.writeStartArray();
		for (Double item0 : this.typical) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnomalyCause}.
	 */
	public static class Builder implements ObjectBuilder<AnomalyCause> {
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
		 * API name: {@code actual}
		 */
		public Builder actual(List<Double> value) {
			this.actual = value;
			return this;
		}

		/**
		 * API name: {@code actual}
		 */
		public Builder actual(Double... value) {
			this.actual = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actual(List)}, creating the list if needed. 4
		 */
		public Builder addActual(Double value) {
			if (this.actual == null) {
				this.actual = new ArrayList<>();
			}
			this.actual.add(value);
			return this;
		}

		/**
		 * API name: {@code by_field_name}
		 */
		public Builder byFieldName(String value) {
			this.byFieldName = value;
			return this;
		}

		/**
		 * API name: {@code by_field_value}
		 */
		public Builder byFieldValue(String value) {
			this.byFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code correlated_by_field_value}
		 */
		public Builder correlatedByFieldValue(String value) {
			this.correlatedByFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code field_name}
		 */
		public Builder fieldName(String value) {
			this.fieldName = value;
			return this;
		}

		/**
		 * API name: {@code function}
		 */
		public Builder function(String value) {
			this.function = value;
			return this;
		}

		/**
		 * API name: {@code function_description}
		 */
		public Builder functionDescription(String value) {
			this.functionDescription = value;
			return this;
		}

		/**
		 * API name: {@code influencers}
		 */
		public Builder influencers(List<Influence> value) {
			this.influencers = value;
			return this;
		}

		/**
		 * API name: {@code influencers}
		 */
		public Builder influencers(Influence... value) {
			this.influencers = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #influencers(List)}, creating the list if needed. 4
		 */
		public Builder addInfluencers(Influence value) {
			if (this.influencers == null) {
				this.influencers = new ArrayList<>();
			}
			this.influencers.add(value);
			return this;
		}

		/**
		 * Set {@link #influencers(List)} to a singleton list.
		 */
		public Builder influencers(Function<Influence.Builder, ObjectBuilder<Influence>> fn) {
			return this.influencers(fn.apply(new Influence.Builder()).build());
		}

		/**
		 * Add a value to {@link #influencers(List)}, creating the list if needed. 5
		 */
		public Builder addInfluencers(Function<Influence.Builder, ObjectBuilder<Influence>> fn) {
			return this.addInfluencers(fn.apply(new Influence.Builder()).build());
		}

		/**
		 * API name: {@code over_field_name}
		 */
		public Builder overFieldName(String value) {
			this.overFieldName = value;
			return this;
		}

		/**
		 * API name: {@code over_field_value}
		 */
		public Builder overFieldValue(String value) {
			this.overFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_name}
		 */
		public Builder partitionFieldName(String value) {
			this.partitionFieldName = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_value}
		 */
		public Builder partitionFieldValue(String value) {
			this.partitionFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code probability}
		 */
		public Builder probability(double value) {
			this.probability = value;
			return this;
		}

		/**
		 * API name: {@code typical}
		 */
		public Builder typical(List<Double> value) {
			this.typical = value;
			return this;
		}

		/**
		 * API name: {@code typical}
		 */
		public Builder typical(Double... value) {
			this.typical = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #typical(List)}, creating the list if needed. 4
		 */
		public Builder addTypical(Double value) {
			if (this.typical == null) {
				this.typical = new ArrayList<>();
			}
			this.typical.add(value);
			return this;
		}

		/**
		 * Builds a {@link AnomalyCause}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnomalyCause build() {

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
