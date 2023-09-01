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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisClassification

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalysisClassification">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalysisClassification extends DataframeAnalysisBase implements DataframeAnalysisVariant {
	@Nullable
	private final String classAssignmentObjective;

	@Nullable
	private final Integer numTopClasses;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalysisClassification(Builder builder) {
		super(builder);

		this.classAssignmentObjective = builder.classAssignmentObjective;
		this.numTopClasses = builder.numTopClasses;

	}

	public static DataframeAnalysisClassification of(
			Function<Builder, ObjectBuilder<DataframeAnalysisClassification>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DataframeAnalysis variant kind.
	 */
	@Override
	public DataframeAnalysis.Kind _dataframeAnalysisKind() {
		return DataframeAnalysis.Kind.Classification;
	}

	/**
	 * API name: {@code class_assignment_objective}
	 */
	@Nullable
	public final String classAssignmentObjective() {
		return this.classAssignmentObjective;
	}

	/**
	 * Defines the number of categories for which the predicted probabilities are
	 * reported. It must be non-negative or -1. If it is -1 or greater than the
	 * total number of categories, probabilities are reported for all categories; if
	 * you have a large number of categories, there could be a significant effect on
	 * the size of your destination index. NOTE: To use the AUC ROC evaluation
	 * method, <code>num_top_classes</code> must be set to -1 or a value greater
	 * than or equal to the total number of categories.
	 * <p>
	 * API name: {@code num_top_classes}
	 */
	@Nullable
	public final Integer numTopClasses() {
		return this.numTopClasses;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.classAssignmentObjective != null) {
			generator.writeKey("class_assignment_objective");
			generator.write(this.classAssignmentObjective);

		}
		if (this.numTopClasses != null) {
			generator.writeKey("num_top_classes");
			generator.write(this.numTopClasses);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalysisClassification}.
	 */

	public static class Builder extends DataframeAnalysisBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataframeAnalysisClassification> {
		@Nullable
		private String classAssignmentObjective;

		@Nullable
		private Integer numTopClasses;

		/**
		 * API name: {@code class_assignment_objective}
		 */
		public final Builder classAssignmentObjective(@Nullable String value) {
			this.classAssignmentObjective = value;
			return this;
		}

		/**
		 * Defines the number of categories for which the predicted probabilities are
		 * reported. It must be non-negative or -1. If it is -1 or greater than the
		 * total number of categories, probabilities are reported for all categories; if
		 * you have a large number of categories, there could be a significant effect on
		 * the size of your destination index. NOTE: To use the AUC ROC evaluation
		 * method, <code>num_top_classes</code> must be set to -1 or a value greater
		 * than or equal to the total number of categories.
		 * <p>
		 * API name: {@code num_top_classes}
		 */
		public final Builder numTopClasses(@Nullable Integer value) {
			this.numTopClasses = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisClassification}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisClassification build() {
			_checkSingleUse();

			return new DataframeAnalysisClassification(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalysisClassification}
	 */
	public static final JsonpDeserializer<DataframeAnalysisClassification> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalysisClassification::setupDataframeAnalysisClassificationDeserializer);

	protected static void setupDataframeAnalysisClassificationDeserializer(
			ObjectDeserializer<DataframeAnalysisClassification.Builder> op) {
		DataframeAnalysisBase.setupDataframeAnalysisBaseDeserializer(op);
		op.add(Builder::classAssignmentObjective, JsonpDeserializer.stringDeserializer(), "class_assignment_objective");
		op.add(Builder::numTopClasses, JsonpDeserializer.integerDeserializer(), "num_top_classes");

	}

}
