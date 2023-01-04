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

import co.elastic.clients.json.JsonData;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationMetrics

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeEvaluationMetrics">API
 *      specification</a>
 */

public abstract class DataframeEvaluationMetrics implements JsonpSerializable {
	@Nullable
	private final DataframeEvaluationClassificationMetricsAucRoc aucRoc;

	private final Map<String, JsonData> precision;

	private final Map<String, JsonData> recall;

	// ---------------------------------------------------------------------------------------------

	protected DataframeEvaluationMetrics(AbstractBuilder<?> builder) {

		this.aucRoc = builder.aucRoc;
		this.precision = ApiTypeHelper.unmodifiable(builder.precision);
		this.recall = ApiTypeHelper.unmodifiable(builder.recall);

	}

	/**
	 * The AUC ROC (area under the curve of the receiver operating characteristic)
	 * score and optionally the curve. It is calculated for a specific class
	 * (provided as &quot;class_name&quot;) treated as positive.
	 * <p>
	 * API name: {@code auc_roc}
	 */
	@Nullable
	public final DataframeEvaluationClassificationMetricsAucRoc aucRoc() {
		return this.aucRoc;
	}

	/**
	 * Precision of predictions (per-class and average).
	 * <p>
	 * API name: {@code precision}
	 */
	public final Map<String, JsonData> precision() {
		return this.precision;
	}

	/**
	 * Recall of predictions (per-class and average).
	 * <p>
	 * API name: {@code recall}
	 */
	public final Map<String, JsonData> recall() {
		return this.recall;
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

		if (this.aucRoc != null) {
			generator.writeKey("auc_roc");
			this.aucRoc.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.precision)) {
			generator.writeKey("precision");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.precision.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.recall)) {
			generator.writeKey("recall");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.recall.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private DataframeEvaluationClassificationMetricsAucRoc aucRoc;

		@Nullable
		private Map<String, JsonData> precision;

		@Nullable
		private Map<String, JsonData> recall;

		/**
		 * The AUC ROC (area under the curve of the receiver operating characteristic)
		 * score and optionally the curve. It is calculated for a specific class
		 * (provided as &quot;class_name&quot;) treated as positive.
		 * <p>
		 * API name: {@code auc_roc}
		 */
		public final BuilderT aucRoc(@Nullable DataframeEvaluationClassificationMetricsAucRoc value) {
			this.aucRoc = value;
			return self();
		}

		/**
		 * The AUC ROC (area under the curve of the receiver operating characteristic)
		 * score and optionally the curve. It is calculated for a specific class
		 * (provided as &quot;class_name&quot;) treated as positive.
		 * <p>
		 * API name: {@code auc_roc}
		 */
		public final BuilderT aucRoc(
				Function<DataframeEvaluationClassificationMetricsAucRoc.Builder, ObjectBuilder<DataframeEvaluationClassificationMetricsAucRoc>> fn) {
			return this.aucRoc(fn.apply(new DataframeEvaluationClassificationMetricsAucRoc.Builder()).build());
		}

		/**
		 * Precision of predictions (per-class and average).
		 * <p>
		 * API name: {@code precision}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>precision</code>.
		 */
		public final BuilderT precision(Map<String, JsonData> map) {
			this.precision = _mapPutAll(this.precision, map);
			return self();
		}

		/**
		 * Precision of predictions (per-class and average).
		 * <p>
		 * API name: {@code precision}
		 * <p>
		 * Adds an entry to <code>precision</code>.
		 */
		public final BuilderT precision(String key, JsonData value) {
			this.precision = _mapPut(this.precision, key, value);
			return self();
		}

		/**
		 * Recall of predictions (per-class and average).
		 * <p>
		 * API name: {@code recall}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>recall</code>.
		 */
		public final BuilderT recall(Map<String, JsonData> map) {
			this.recall = _mapPutAll(this.recall, map);
			return self();
		}

		/**
		 * Recall of predictions (per-class and average).
		 * <p>
		 * API name: {@code recall}
		 * <p>
		 * Adds an entry to <code>recall</code>.
		 */
		public final BuilderT recall(String key, JsonData value) {
			this.recall = _mapPut(this.recall, key, value);
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDataframeEvaluationMetricsDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::aucRoc, DataframeEvaluationClassificationMetricsAucRoc._DESERIALIZER, "auc_roc");
		op.add(AbstractBuilder::precision, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"precision");
		op.add(AbstractBuilder::recall, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "recall");

	}

}
