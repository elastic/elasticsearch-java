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

package co.elastic.clients.elasticsearch.ml.put_trained_model;

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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.Ensemble

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.put_trained_model.Ensemble">API
 *      specification</a>
 */
@JsonpDeserializable
public class Ensemble implements JsonpSerializable {
	@Nullable
	private final AggregateOutput aggregateOutput;

	private final List<String> classificationLabels;

	private final List<String> featureNames;

	@Nullable
	private final String targetType;

	private final List<TrainedModel> trainedModels;

	// ---------------------------------------------------------------------------------------------

	private Ensemble(Builder builder) {

		this.aggregateOutput = builder.aggregateOutput;
		this.classificationLabels = ApiTypeHelper.unmodifiable(builder.classificationLabels);
		this.featureNames = ApiTypeHelper.unmodifiable(builder.featureNames);
		this.targetType = builder.targetType;
		this.trainedModels = ApiTypeHelper.unmodifiableRequired(builder.trainedModels, this, "trainedModels");

	}

	public static Ensemble of(Function<Builder, ObjectBuilder<Ensemble>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code aggregate_output}
	 */
	@Nullable
	public final AggregateOutput aggregateOutput() {
		return this.aggregateOutput;
	}

	/**
	 * API name: {@code classification_labels}
	 */
	public final List<String> classificationLabels() {
		return this.classificationLabels;
	}

	/**
	 * API name: {@code feature_names}
	 */
	public final List<String> featureNames() {
		return this.featureNames;
	}

	/**
	 * API name: {@code target_type}
	 */
	@Nullable
	public final String targetType() {
		return this.targetType;
	}

	/**
	 * Required - API name: {@code trained_models}
	 */
	public final List<TrainedModel> trainedModels() {
		return this.trainedModels;
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

		if (this.aggregateOutput != null) {
			generator.writeKey("aggregate_output");
			this.aggregateOutput.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.classificationLabels)) {
			generator.writeKey("classification_labels");
			generator.writeStartArray();
			for (String item0 : this.classificationLabels) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.featureNames)) {
			generator.writeKey("feature_names");
			generator.writeStartArray();
			for (String item0 : this.featureNames) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.targetType != null) {
			generator.writeKey("target_type");
			generator.write(this.targetType);

		}
		if (ApiTypeHelper.isDefined(this.trainedModels)) {
			generator.writeKey("trained_models");
			generator.writeStartArray();
			for (TrainedModel item0 : this.trainedModels) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link Ensemble}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Ensemble> {
		@Nullable
		private AggregateOutput aggregateOutput;

		@Nullable
		private List<String> classificationLabels;

		@Nullable
		private List<String> featureNames;

		@Nullable
		private String targetType;

		private List<TrainedModel> trainedModels;

		/**
		 * API name: {@code aggregate_output}
		 */
		public final Builder aggregateOutput(@Nullable AggregateOutput value) {
			this.aggregateOutput = value;
			return this;
		}

		/**
		 * API name: {@code aggregate_output}
		 */
		public final Builder aggregateOutput(Function<AggregateOutput.Builder, ObjectBuilder<AggregateOutput>> fn) {
			return this.aggregateOutput(fn.apply(new AggregateOutput.Builder()).build());
		}

		/**
		 * API name: {@code classification_labels}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>classificationLabels</code>.
		 */
		public final Builder classificationLabels(List<String> list) {
			this.classificationLabels = _listAddAll(this.classificationLabels, list);
			return this;
		}

		/**
		 * API name: {@code classification_labels}
		 * <p>
		 * Adds one or more values to <code>classificationLabels</code>.
		 */
		public final Builder classificationLabels(String value, String... values) {
			this.classificationLabels = _listAdd(this.classificationLabels, value, values);
			return this;
		}

		/**
		 * API name: {@code feature_names}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>featureNames</code>.
		 */
		public final Builder featureNames(List<String> list) {
			this.featureNames = _listAddAll(this.featureNames, list);
			return this;
		}

		/**
		 * API name: {@code feature_names}
		 * <p>
		 * Adds one or more values to <code>featureNames</code>.
		 */
		public final Builder featureNames(String value, String... values) {
			this.featureNames = _listAdd(this.featureNames, value, values);
			return this;
		}

		/**
		 * API name: {@code target_type}
		 */
		public final Builder targetType(@Nullable String value) {
			this.targetType = value;
			return this;
		}

		/**
		 * Required - API name: {@code trained_models}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>trainedModels</code>.
		 */
		public final Builder trainedModels(List<TrainedModel> list) {
			this.trainedModels = _listAddAll(this.trainedModels, list);
			return this;
		}

		/**
		 * Required - API name: {@code trained_models}
		 * <p>
		 * Adds one or more values to <code>trainedModels</code>.
		 */
		public final Builder trainedModels(TrainedModel value, TrainedModel... values) {
			this.trainedModels = _listAdd(this.trainedModels, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code trained_models}
		 * <p>
		 * Adds a value to <code>trainedModels</code> using a builder lambda.
		 */
		public final Builder trainedModels(Function<TrainedModel.Builder, ObjectBuilder<TrainedModel>> fn) {
			return trainedModels(fn.apply(new TrainedModel.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Ensemble}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ensemble build() {
			_checkSingleUse();

			return new Ensemble(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Ensemble}
	 */
	public static final JsonpDeserializer<Ensemble> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Ensemble::setupEnsembleDeserializer);

	protected static void setupEnsembleDeserializer(ObjectDeserializer<Ensemble.Builder> op) {

		op.add(Builder::aggregateOutput, AggregateOutput._DESERIALIZER, "aggregate_output");
		op.add(Builder::classificationLabels,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "classification_labels");
		op.add(Builder::featureNames, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"feature_names");
		op.add(Builder::targetType, JsonpDeserializer.stringDeserializer(), "target_type");
		op.add(Builder::trainedModels, JsonpDeserializer.arrayDeserializer(TrainedModel._DESERIALIZER),
				"trained_models");

	}

}
