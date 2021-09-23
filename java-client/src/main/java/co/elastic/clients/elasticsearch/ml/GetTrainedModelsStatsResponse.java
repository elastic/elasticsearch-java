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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_trained_models_stats.Response
public final class GetTrainedModelsStatsResponse implements JsonpSerializable {
	private final Number count;

	private final List<TrainedModelStats> trainedModelStats;

	// ---------------------------------------------------------------------------------------------

	public GetTrainedModelsStatsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.trainedModelStats = Objects.requireNonNull(builder.trainedModelStats, "trained_model_stats");

	}

	/**
	 * The total number of trained model statistics that matched the requested ID
	 * patterns. Could be higher than the number of items in the trained_model_stats
	 * array as the size of the array is restricted by the supplied size parameter.
	 * <p>
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * An array of trained model statistics, which are sorted by the model_id value
	 * in ascending order.
	 * <p>
	 * API name: {@code trained_model_stats}
	 */
	public List<TrainedModelStats> trainedModelStats() {
		return this.trainedModelStats;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("trained_model_stats");
		generator.writeStartArray();
		for (TrainedModelStats item0 : this.trainedModelStats) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTrainedModelsStatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetTrainedModelsStatsResponse> {
		private Number count;

		private List<TrainedModelStats> trainedModelStats;

		/**
		 * The total number of trained model statistics that matched the requested ID
		 * patterns. Could be higher than the number of items in the trained_model_stats
		 * array as the size of the array is restricted by the supplied size parameter.
		 * <p>
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * An array of trained model statistics, which are sorted by the model_id value
		 * in ascending order.
		 * <p>
		 * API name: {@code trained_model_stats}
		 */
		public Builder trainedModelStats(List<TrainedModelStats> value) {
			this.trainedModelStats = value;
			return this;
		}

		/**
		 * An array of trained model statistics, which are sorted by the model_id value
		 * in ascending order.
		 * <p>
		 * API name: {@code trained_model_stats}
		 */
		public Builder trainedModelStats(TrainedModelStats... value) {
			this.trainedModelStats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #trainedModelStats(List)}, creating the list if needed.
		 */
		public Builder addTrainedModelStats(TrainedModelStats value) {
			if (this.trainedModelStats == null) {
				this.trainedModelStats = new ArrayList<>();
			}
			this.trainedModelStats.add(value);
			return this;
		}

		/**
		 * Set {@link #trainedModelStats(List)} to a singleton list.
		 */
		public Builder trainedModelStats(Function<TrainedModelStats.Builder, ObjectBuilder<TrainedModelStats>> fn) {
			return this.trainedModelStats(fn.apply(new TrainedModelStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #trainedModelStats(List)}, creating the list if needed.
		 */
		public Builder addTrainedModelStats(Function<TrainedModelStats.Builder, ObjectBuilder<TrainedModelStats>> fn) {
			return this.addTrainedModelStats(fn.apply(new TrainedModelStats.Builder()).build());
		}

		/**
		 * Builds a {@link GetTrainedModelsStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTrainedModelsStatsResponse build() {

			return new GetTrainedModelsStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTrainedModelsStatsResponse}
	 */
	public static final JsonpDeserializer<GetTrainedModelsStatsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					GetTrainedModelsStatsResponse::setupGetTrainedModelsStatsResponseDeserializer);

	protected static void setupGetTrainedModelsStatsResponseDeserializer(
			DelegatingDeserializer<GetTrainedModelsStatsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::trainedModelStats, JsonpDeserializer.arrayDeserializer(TrainedModelStats.DESERIALIZER),
				"trained_model_stats");

	}

}
