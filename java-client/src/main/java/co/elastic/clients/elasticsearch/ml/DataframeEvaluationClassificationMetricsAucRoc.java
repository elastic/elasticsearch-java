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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationClassificationMetricsAucRoc

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeEvaluationClassificationMetricsAucRoc">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeEvaluationClassificationMetricsAucRoc implements JsonpSerializable {
	@Nullable
	private final String className;

	@Nullable
	private final Boolean includeCurve;

	// ---------------------------------------------------------------------------------------------

	private DataframeEvaluationClassificationMetricsAucRoc(Builder builder) {

		this.className = builder.className;
		this.includeCurve = builder.includeCurve;

	}

	public static DataframeEvaluationClassificationMetricsAucRoc of(
			Function<Builder, ObjectBuilder<DataframeEvaluationClassificationMetricsAucRoc>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Name of the only class that is treated as positive during AUC ROC
	 * calculation. Other classes are treated as negative (&quot;one-vs-all&quot;
	 * strategy). All the evaluated documents must have class_name in the list of
	 * their top classes.
	 * <p>
	 * API name: {@code class_name}
	 */
	@Nullable
	public final String className() {
		return this.className;
	}

	/**
	 * Whether or not the curve should be returned in addition to the score. Default
	 * value is false.
	 * <p>
	 * API name: {@code include_curve}
	 */
	@Nullable
	public final Boolean includeCurve() {
		return this.includeCurve;
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

		if (this.className != null) {
			generator.writeKey("class_name");
			generator.write(this.className);

		}
		if (this.includeCurve != null) {
			generator.writeKey("include_curve");
			generator.write(this.includeCurve);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationClassificationMetricsAucRoc}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeEvaluationClassificationMetricsAucRoc> {
		@Nullable
		private String className;

		@Nullable
		private Boolean includeCurve;

		/**
		 * Name of the only class that is treated as positive during AUC ROC
		 * calculation. Other classes are treated as negative (&quot;one-vs-all&quot;
		 * strategy). All the evaluated documents must have class_name in the list of
		 * their top classes.
		 * <p>
		 * API name: {@code class_name}
		 */
		public final Builder className(@Nullable String value) {
			this.className = value;
			return this;
		}

		/**
		 * Whether or not the curve should be returned in addition to the score. Default
		 * value is false.
		 * <p>
		 * API name: {@code include_curve}
		 */
		public final Builder includeCurve(@Nullable Boolean value) {
			this.includeCurve = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationClassificationMetricsAucRoc}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationClassificationMetricsAucRoc build() {
			_checkSingleUse();

			return new DataframeEvaluationClassificationMetricsAucRoc(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationClassificationMetricsAucRoc}
	 */
	public static final JsonpDeserializer<DataframeEvaluationClassificationMetricsAucRoc> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeEvaluationClassificationMetricsAucRoc::setupDataframeEvaluationClassificationMetricsAucRocDeserializer);

	protected static void setupDataframeEvaluationClassificationMetricsAucRocDeserializer(
			ObjectDeserializer<DataframeEvaluationClassificationMetricsAucRoc.Builder> op) {

		op.add(Builder::className, JsonpDeserializer.stringDeserializer(), "class_name");
		op.add(Builder::includeCurve, JsonpDeserializer.booleanDeserializer(), "include_curve");

	}

}
