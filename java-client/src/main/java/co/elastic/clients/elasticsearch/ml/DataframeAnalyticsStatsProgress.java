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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsStatsProgress
@JsonpDeserializable
public final class DataframeAnalyticsStatsProgress implements JsonpSerializable {
	private final String phase;

	private final Integer progressPercent;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalyticsStatsProgress(Builder builder) {

		this.phase = Objects.requireNonNull(builder.phase, "phase");
		this.progressPercent = Objects.requireNonNull(builder.progressPercent, "progress_percent");

	}

	/**
	 * Defines the phase of the data frame analytics job.
	 * <p>
	 * API name: {@code phase}
	 */
	public String phase() {
		return this.phase;
	}

	/**
	 * The progress that the data frame analytics job has made expressed in
	 * percentage.
	 * <p>
	 * API name: {@code progress_percent}
	 */
	public Integer progressPercent() {
		return this.progressPercent;
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

		generator.writeKey("phase");
		generator.write(this.phase);

		generator.writeKey("progress_percent");
		generator.write(this.progressPercent);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsStatsProgress}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalyticsStatsProgress> {
		private String phase;

		private Integer progressPercent;

		/**
		 * Defines the phase of the data frame analytics job.
		 * <p>
		 * API name: {@code phase}
		 */
		public Builder phase(String value) {
			this.phase = value;
			return this;
		}

		/**
		 * The progress that the data frame analytics job has made expressed in
		 * percentage.
		 * <p>
		 * API name: {@code progress_percent}
		 */
		public Builder progressPercent(Integer value) {
			this.progressPercent = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsStatsProgress}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsStatsProgress build() {

			return new DataframeAnalyticsStatsProgress(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsStatsProgress}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsStatsProgress> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalyticsStatsProgress::setupDataframeAnalyticsStatsProgressDeserializer,
					Builder::build);

	protected static void setupDataframeAnalyticsStatsProgressDeserializer(
			DelegatingDeserializer<DataframeAnalyticsStatsProgress.Builder> op) {

		op.add(Builder::phase, JsonpDeserializer.stringDeserializer(), "phase");
		op.add(Builder::progressPercent, JsonpDeserializer.integerDeserializer(), "progress_percent");

	}

}
