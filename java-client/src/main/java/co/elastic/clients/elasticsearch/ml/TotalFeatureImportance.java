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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TotalFeatureImportance
@JsonpDeserializable
public final class TotalFeatureImportance implements JsonpSerializable {
	private final String featureName;

	private final List<TotalFeatureImportanceStatistics> importance;

	private final List<TotalFeatureImportanceClass> classes;

	// ---------------------------------------------------------------------------------------------

	public TotalFeatureImportance(Builder builder) {

		this.featureName = Objects.requireNonNull(builder.featureName, "feature_name");
		this.importance = Objects.requireNonNull(builder.importance, "importance");
		this.classes = Objects.requireNonNull(builder.classes, "classes");

	}

	/**
	 * The feature for which this importance was calculated.
	 * <p>
	 * API name: {@code feature_name}
	 */
	public String featureName() {
		return this.featureName;
	}

	/**
	 * A collection of feature importance statistics related to the training data
	 * set for this particular feature.
	 * <p>
	 * API name: {@code importance}
	 */
	public List<TotalFeatureImportanceStatistics> importance() {
		return this.importance;
	}

	/**
	 * If the trained model is a classification model, feature importance statistics
	 * are gathered per target class value.
	 * <p>
	 * API name: {@code classes}
	 */
	public List<TotalFeatureImportanceClass> classes() {
		return this.classes;
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

		generator.writeKey("feature_name");
		generator.write(this.featureName);

		generator.writeKey("importance");
		generator.writeStartArray();
		for (TotalFeatureImportanceStatistics item0 : this.importance) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("classes");
		generator.writeStartArray();
		for (TotalFeatureImportanceClass item0 : this.classes) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TotalFeatureImportance}.
	 */
	public static class Builder implements ObjectBuilder<TotalFeatureImportance> {
		private String featureName;

		private List<TotalFeatureImportanceStatistics> importance;

		private List<TotalFeatureImportanceClass> classes;

		/**
		 * The feature for which this importance was calculated.
		 * <p>
		 * API name: {@code feature_name}
		 */
		public Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * A collection of feature importance statistics related to the training data
		 * set for this particular feature.
		 * <p>
		 * API name: {@code importance}
		 */
		public Builder importance(List<TotalFeatureImportanceStatistics> value) {
			this.importance = value;
			return this;
		}

		/**
		 * A collection of feature importance statistics related to the training data
		 * set for this particular feature.
		 * <p>
		 * API name: {@code importance}
		 */
		public Builder importance(TotalFeatureImportanceStatistics... value) {
			this.importance = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #importance(List)}, creating the list if needed.
		 */
		public Builder addImportance(TotalFeatureImportanceStatistics value) {
			if (this.importance == null) {
				this.importance = new ArrayList<>();
			}
			this.importance.add(value);
			return this;
		}

		/**
		 * Set {@link #importance(List)} to a singleton list.
		 */
		public Builder importance(
				Function<TotalFeatureImportanceStatistics.Builder, ObjectBuilder<TotalFeatureImportanceStatistics>> fn) {
			return this.importance(fn.apply(new TotalFeatureImportanceStatistics.Builder()).build());
		}

		/**
		 * Add a value to {@link #importance(List)}, creating the list if needed.
		 */
		public Builder addImportance(
				Function<TotalFeatureImportanceStatistics.Builder, ObjectBuilder<TotalFeatureImportanceStatistics>> fn) {
			return this.addImportance(fn.apply(new TotalFeatureImportanceStatistics.Builder()).build());
		}

		/**
		 * If the trained model is a classification model, feature importance statistics
		 * are gathered per target class value.
		 * <p>
		 * API name: {@code classes}
		 */
		public Builder classes(List<TotalFeatureImportanceClass> value) {
			this.classes = value;
			return this;
		}

		/**
		 * If the trained model is a classification model, feature importance statistics
		 * are gathered per target class value.
		 * <p>
		 * API name: {@code classes}
		 */
		public Builder classes(TotalFeatureImportanceClass... value) {
			this.classes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #classes(List)}, creating the list if needed.
		 */
		public Builder addClasses(TotalFeatureImportanceClass value) {
			if (this.classes == null) {
				this.classes = new ArrayList<>();
			}
			this.classes.add(value);
			return this;
		}

		/**
		 * Set {@link #classes(List)} to a singleton list.
		 */
		public Builder classes(
				Function<TotalFeatureImportanceClass.Builder, ObjectBuilder<TotalFeatureImportanceClass>> fn) {
			return this.classes(fn.apply(new TotalFeatureImportanceClass.Builder()).build());
		}

		/**
		 * Add a value to {@link #classes(List)}, creating the list if needed.
		 */
		public Builder addClasses(
				Function<TotalFeatureImportanceClass.Builder, ObjectBuilder<TotalFeatureImportanceClass>> fn) {
			return this.addClasses(fn.apply(new TotalFeatureImportanceClass.Builder()).build());
		}

		/**
		 * Builds a {@link TotalFeatureImportance}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TotalFeatureImportance build() {

			return new TotalFeatureImportance(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TotalFeatureImportance}
	 */
	public static final JsonpDeserializer<TotalFeatureImportance> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TotalFeatureImportance::setupTotalFeatureImportanceDeserializer, Builder::build);

	protected static void setupTotalFeatureImportanceDeserializer(
			DelegatingDeserializer<TotalFeatureImportance.Builder> op) {

		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::importance, JsonpDeserializer.arrayDeserializer(TotalFeatureImportanceStatistics._DESERIALIZER),
				"importance");
		op.add(Builder::classes, JsonpDeserializer.arrayDeserializer(TotalFeatureImportanceClass._DESERIALIZER),
				"classes");

	}

}
