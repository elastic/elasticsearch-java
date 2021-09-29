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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsMemoryEstimation
@JsonpDeserializable
public final class DataframeAnalyticsMemoryEstimation implements JsonpSerializable {
	private final String expectedMemoryWithDisk;

	private final String expectedMemoryWithoutDisk;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalyticsMemoryEstimation(Builder builder) {

		this.expectedMemoryWithDisk = Objects.requireNonNull(builder.expectedMemoryWithDisk,
				"expected_memory_with_disk");
		this.expectedMemoryWithoutDisk = Objects.requireNonNull(builder.expectedMemoryWithoutDisk,
				"expected_memory_without_disk");

	}

	public DataframeAnalyticsMemoryEstimation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Estimated memory usage under the assumption that overflowing to disk is
	 * allowed during data frame analytics. expected_memory_with_disk is usually
	 * smaller than expected_memory_without_disk as using disk allows to limit the
	 * main memory needed to perform data frame analytics.
	 * <p>
	 * API name: {@code expected_memory_with_disk}
	 */
	public String expectedMemoryWithDisk() {
		return this.expectedMemoryWithDisk;
	}

	/**
	 * Estimated memory usage under the assumption that the whole data frame
	 * analytics should happen in memory (i.e. without overflowing to disk).
	 * <p>
	 * API name: {@code expected_memory_without_disk}
	 */
	public String expectedMemoryWithoutDisk() {
		return this.expectedMemoryWithoutDisk;
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

		generator.writeKey("expected_memory_with_disk");
		generator.write(this.expectedMemoryWithDisk);

		generator.writeKey("expected_memory_without_disk");
		generator.write(this.expectedMemoryWithoutDisk);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsMemoryEstimation}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalyticsMemoryEstimation> {
		private String expectedMemoryWithDisk;

		private String expectedMemoryWithoutDisk;

		/**
		 * Estimated memory usage under the assumption that overflowing to disk is
		 * allowed during data frame analytics. expected_memory_with_disk is usually
		 * smaller than expected_memory_without_disk as using disk allows to limit the
		 * main memory needed to perform data frame analytics.
		 * <p>
		 * API name: {@code expected_memory_with_disk}
		 */
		public Builder expectedMemoryWithDisk(String value) {
			this.expectedMemoryWithDisk = value;
			return this;
		}

		/**
		 * Estimated memory usage under the assumption that the whole data frame
		 * analytics should happen in memory (i.e. without overflowing to disk).
		 * <p>
		 * API name: {@code expected_memory_without_disk}
		 */
		public Builder expectedMemoryWithoutDisk(String value) {
			this.expectedMemoryWithoutDisk = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsMemoryEstimation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsMemoryEstimation build() {

			return new DataframeAnalyticsMemoryEstimation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsMemoryEstimation}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsMemoryEstimation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalyticsMemoryEstimation::setupDataframeAnalyticsMemoryEstimationDeserializer,
					Builder::build);

	protected static void setupDataframeAnalyticsMemoryEstimationDeserializer(
			DelegatingDeserializer<DataframeAnalyticsMemoryEstimation.Builder> op) {

		op.add(Builder::expectedMemoryWithDisk, JsonpDeserializer.stringDeserializer(), "expected_memory_with_disk");
		op.add(Builder::expectedMemoryWithoutDisk, JsonpDeserializer.stringDeserializer(),
				"expected_memory_without_disk");

	}

}
