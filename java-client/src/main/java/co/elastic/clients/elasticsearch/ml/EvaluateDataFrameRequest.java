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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.Request

/**
 * Evaluates the data frame analytics for an annotated index. The API packages
 * together commonly used evaluation metrics for various types of machine
 * learning features. This has been designed for use on indexes created by data
 * frame analytics. Evaluation requires both a ground truth field and an
 * analytics result field to be present.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.evaluate_data_frame.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class EvaluateDataFrameRequest extends RequestBase implements JsonpSerializable {
	private final DataframeEvaluation evaluation;

	private final String index;

	@Nullable
	private final Query query;

	// ---------------------------------------------------------------------------------------------

	private EvaluateDataFrameRequest(Builder builder) {

		this.evaluation = ApiTypeHelper.requireNonNull(builder.evaluation, this, "evaluation");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.query = builder.query;

	}

	public static EvaluateDataFrameRequest of(Function<Builder, ObjectBuilder<EvaluateDataFrameRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Defines the type of evaluation you want to perform.
	 * <p>
	 * API name: {@code evaluation}
	 */
	public final DataframeEvaluation evaluation() {
		return this.evaluation;
	}

	/**
	 * Required - Defines the <code>index</code> in which the evaluation will be
	 * performed.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * A query clause that retrieves a subset of data from the source index.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
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

		generator.writeKey("evaluation");
		this.evaluation.serialize(generator, mapper);

		generator.writeKey("index");
		generator.write(this.index);

		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EvaluateDataFrameRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<EvaluateDataFrameRequest> {
		private DataframeEvaluation evaluation;

		private String index;

		@Nullable
		private Query query;

		/**
		 * Required - Defines the type of evaluation you want to perform.
		 * <p>
		 * API name: {@code evaluation}
		 */
		public final Builder evaluation(DataframeEvaluation value) {
			this.evaluation = value;
			return this;
		}

		/**
		 * Required - Defines the type of evaluation you want to perform.
		 * <p>
		 * API name: {@code evaluation}
		 */
		public final Builder evaluation(Function<DataframeEvaluation.Builder, ObjectBuilder<DataframeEvaluation>> fn) {
			return this.evaluation(fn.apply(new DataframeEvaluation.Builder()).build());
		}

		/**
		 * Required - Defines the <code>index</code> in which the evaluation will be
		 * performed.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * A query clause that retrieves a subset of data from the source index.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * A query clause that retrieves a subset of data from the source index.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EvaluateDataFrameRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EvaluateDataFrameRequest build() {
			_checkSingleUse();

			return new EvaluateDataFrameRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EvaluateDataFrameRequest}
	 */
	public static final JsonpDeserializer<EvaluateDataFrameRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EvaluateDataFrameRequest::setupEvaluateDataFrameRequestDeserializer);

	protected static void setupEvaluateDataFrameRequestDeserializer(
			ObjectDeserializer<EvaluateDataFrameRequest.Builder> op) {

		op.add(Builder::evaluation, DataframeEvaluation._DESERIALIZER, "evaluation");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::query, Query._DESERIALIZER, "query");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.evaluate_data_frame}".
	 */
	public static final Endpoint<EvaluateDataFrameRequest, EvaluateDataFrameResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.evaluate_data_frame",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_ml/data_frame/_evaluate";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, EvaluateDataFrameResponse._DESERIALIZER);
}
