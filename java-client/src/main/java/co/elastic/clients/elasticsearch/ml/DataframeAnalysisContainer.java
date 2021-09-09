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

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class DataframeAnalysisContainer extends TaggedUnion<DataframeAnalysisContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		classification("classification"),

		outlierDetection("outlier_detection"),

		regression("regression"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	private DataframeAnalysisContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link DataframeAnalysisContainer} of a {@code classification} kind?
	 */
	public boolean isClassification() {
		return is(Tag.classification);
	}

	/**
	 * Get the {@code classification} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification} kind.
	 */
	public DataframeAnalysisClassification classification() {
		return get(Tag.classification);
	}

	/**
	 * Is this {@link DataframeAnalysisContainer} of a {@code outlier_detection}
	 * kind?
	 */
	public boolean isOutlierDetection() {
		return is(Tag.outlierDetection);
	}

	/**
	 * Get the {@code outlier_detection} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code outlier_detection}
	 *             kind.
	 */
	public DataframeAnalysisOutlierDetection outlierDetection() {
		return get(Tag.outlierDetection);
	}

	/**
	 * Is this {@link DataframeAnalysisContainer} of a {@code regression} kind?
	 */
	public boolean isRegression() {
		return is(Tag.regression);
	}

	/**
	 * Get the {@code regression} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression} kind.
	 */
	public DataframeAnalysisRegression regression() {
		return get(Tag.regression);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<DataframeAnalysisContainer> classification(DataframeAnalysisClassification v) {
			this.$variant = v;
			this.$tag = Tag.classification;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalysisContainer> classification(
				Function<DataframeAnalysisClassification.Builder, ObjectBuilder<DataframeAnalysisClassification>> f) {
			return this.classification(f.apply(new DataframeAnalysisClassification.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisContainer> outlierDetection(DataframeAnalysisOutlierDetection v) {
			this.$variant = v;
			this.$tag = Tag.outlierDetection;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalysisContainer> outlierDetection(
				Function<DataframeAnalysisOutlierDetection.Builder, ObjectBuilder<DataframeAnalysisOutlierDetection>> f) {
			return this.outlierDetection(f.apply(new DataframeAnalysisOutlierDetection.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisContainer> regression(DataframeAnalysisRegression v) {
			this.$variant = v;
			this.$tag = Tag.regression;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<DataframeAnalysisContainer> regression(
				Function<DataframeAnalysisRegression.Builder, ObjectBuilder<DataframeAnalysisRegression>> f) {
			return this.regression(f.apply(new DataframeAnalysisRegression.Builder()).build());
		}

		protected DataframeAnalysisContainer build() {
			return new DataframeAnalysisContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<DataframeAnalysisContainer> DESERIALIZER = JsonpDeserializer
			.lazy(DataframeAnalysisContainer::buildDeserializer);

	private static JsonpDeserializer<DataframeAnalysisContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::classification, DataframeAnalysisClassification.DESERIALIZER, "classification");
		op.add(Builder::outlierDetection, DataframeAnalysisOutlierDetection.DESERIALIZER, "outlier_detection");
		op.add(Builder::regression, DataframeAnalysisRegression.DESERIALIZER, "regression");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
