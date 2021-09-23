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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.JobStatistics
public final class JobStatistics implements JsonpSerializable {
	private final Number avg;

	private final Number max;

	private final Number min;

	private final Number total;

	// ---------------------------------------------------------------------------------------------

	public JobStatistics(Builder builder) {

		this.avg = Objects.requireNonNull(builder.avg, "avg");
		this.max = Objects.requireNonNull(builder.max, "max");
		this.min = Objects.requireNonNull(builder.min, "min");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	/**
	 * API name: {@code avg}
	 */
	public Number avg() {
		return this.avg;
	}

	/**
	 * API name: {@code max}
	 */
	public Number max() {
		return this.max;
	}

	/**
	 * API name: {@code min}
	 */
	public Number min() {
		return this.min;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
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

		generator.writeKey("avg");
		generator.write(this.avg.doubleValue());

		generator.writeKey("max");
		generator.write(this.max.doubleValue());

		generator.writeKey("min");
		generator.write(this.min.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobStatistics}.
	 */
	public static class Builder implements ObjectBuilder<JobStatistics> {
		private Number avg;

		private Number max;

		private Number min;

		private Number total;

		/**
		 * API name: {@code avg}
		 */
		public Builder avg(Number value) {
			this.avg = value;
			return this;
		}

		/**
		 * API name: {@code max}
		 */
		public Builder max(Number value) {
			this.max = value;
			return this;
		}

		/**
		 * API name: {@code min}
		 */
		public Builder min(Number value) {
			this.min = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * Builds a {@link JobStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobStatistics build() {

			return new JobStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JobStatistics}
	 */
	public static final JsonpDeserializer<JobStatistics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, JobStatistics::setupJobStatisticsDeserializer);

	protected static void setupJobStatisticsDeserializer(DelegatingDeserializer<JobStatistics.Builder> op) {

		op.add(Builder::avg, JsonpDeserializer.numberDeserializer(), "avg");
		op.add(Builder::max, JsonpDeserializer.numberDeserializer(), "max");
		op.add(Builder::min, JsonpDeserializer.numberDeserializer(), "min");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");

	}

}
