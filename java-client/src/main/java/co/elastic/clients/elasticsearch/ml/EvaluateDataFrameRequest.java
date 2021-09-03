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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.Request
public final class EvaluateDataFrameRequest extends RequestBase implements ToJsonp {
	private final DataframeEvaluationContainer evaluation;

	private final String index;

	@Nullable
	private final QueryContainer query;

	// ---------------------------------------------------------------------------------------------

	protected EvaluateDataFrameRequest(Builder builder) {

		this.evaluation = Objects.requireNonNull(builder.evaluation, "evaluation");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.query = builder.query;

	}

	/**
	 * Defines the type of evaluation you want to perform.
	 * <p>
	 * API name: {@code evaluation}
	 */
	public DataframeEvaluationContainer evaluation() {
		return this.evaluation;
	}

	/**
	 * Defines the index in which the evaluation will be performed.
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * A query clause that retrieves a subset of data from the source index.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public QueryContainer query() {
		return this.query;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("evaluation");
		this.evaluation.toJsonp(generator, mapper);

		generator.writeKey("index");
		generator.write(this.index);

		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EvaluateDataFrameRequest}.
	 */
	public static class Builder implements ObjectBuilder<EvaluateDataFrameRequest> {
		private DataframeEvaluationContainer evaluation;

		private String index;

		@Nullable
		private QueryContainer query;

		/**
		 * Defines the type of evaluation you want to perform.
		 * <p>
		 * API name: {@code evaluation}
		 */
		public Builder evaluation(DataframeEvaluationContainer value) {
			this.evaluation = value;
			return this;
		}

		/**
		 * Defines the type of evaluation you want to perform.
		 * <p>
		 * API name: {@code evaluation}
		 */
		public Builder evaluation(
				Function<DataframeEvaluationContainer.Builder, ObjectBuilder<DataframeEvaluationContainer>> fn) {
			return this.evaluation(fn.apply(new DataframeEvaluationContainer.Builder()).build());
		}

		/**
		 * Defines the index in which the evaluation will be performed.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * A query clause that retrieves a subset of data from the source index.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(@Nullable QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * A query clause that retrieves a subset of data from the source index.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * Builds a {@link EvaluateDataFrameRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EvaluateDataFrameRequest build() {

			return new EvaluateDataFrameRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for EvaluateDataFrameRequest
	 */
	public static final JsonpDeserializer<EvaluateDataFrameRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, EvaluateDataFrameRequest::setupEvaluateDataFrameRequestDeserializer);

	protected static void setupEvaluateDataFrameRequestDeserializer(
			DelegatingDeserializer<EvaluateDataFrameRequest.Builder> op) {

		op.add(Builder::evaluation, DataframeEvaluationContainer.DESERIALIZER, "evaluation");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.evaluate_data_frame}".
	 */
	public static final Endpoint<EvaluateDataFrameRequest, EvaluateDataFrameResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_ml/data_frame/_evaluate";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, EvaluateDataFrameResponse.DESERIALIZER);
}
