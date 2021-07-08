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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ShardStatistics
public final class ShardStatistics implements ToJsonp {
	private final Number failed;

	private final Number successful;

	private final Number total;

	@Nullable
	private final List<ShardFailure> failures;

	@Nullable
	private final Number skipped;

	// ---------------------------------------------------------------------------------------------

	protected ShardStatistics(Builder builder) {

		this.failed = Objects.requireNonNull(builder.failed, "failed");
		this.successful = Objects.requireNonNull(builder.successful, "successful");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.failures = builder.failures;
		this.skipped = builder.skipped;

	}

	/**
	 * API name: {@code failed}
	 */
	public Number failed() {
		return this.failed;
	}

	/**
	 * API name: {@code successful}
	 */
	public Number successful() {
		return this.successful;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code failures}
	 */
	@Nullable
	public List<ShardFailure> failures() {
		return this.failures;
	}

	/**
	 * API name: {@code skipped}
	 */
	@Nullable
	public Number skipped() {
		return this.skipped;
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

		generator.writeKey("failed");
		generator.write(this.failed.doubleValue());

		generator.writeKey("successful");
		generator.write(this.successful.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		if (this.failures != null) {

			generator.writeKey("failures");
			generator.writeStartArray();
			for (ShardFailure item0 : this.failures) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.skipped != null) {

			generator.writeKey("skipped");
			generator.write(this.skipped.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStatistics}.
	 */
	public static class Builder implements ObjectBuilder<ShardStatistics> {
		private Number failed;

		private Number successful;

		private Number total;

		@Nullable
		private List<ShardFailure> failures;

		@Nullable
		private Number skipped;

		/**
		 * API name: {@code failed}
		 */
		public Builder failed(Number value) {
			this.failed = value;
			return this;
		}

		/**
		 * API name: {@code successful}
		 */
		public Builder successful(Number value) {
			this.successful = value;
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
		 * API name: {@code failures}
		 */
		public Builder failures(@Nullable List<ShardFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(ShardFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(ShardFailure value) {
			if (this.failures == null) {
				this.failures = new ArrayList<>();
			}
			this.failures.add(value);
			return this;
		}

		/**
		 * Set {@link #failures(List)} to a singleton list.
		 */
		public Builder failures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.failures(fn.apply(new ShardFailure.Builder()).build());
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.addFailures(fn.apply(new ShardFailure.Builder()).build());
		}

		/**
		 * API name: {@code skipped}
		 */
		public Builder skipped(@Nullable Number value) {
			this.skipped = value;
			return this;
		}

		/**
		 * Builds a {@link ShardStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStatistics build() {

			return new ShardStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardStatistics
	 */
	public static final JsonpDeserializer<ShardStatistics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardStatistics::setupShardStatisticsDeserializer);

	protected static void setupShardStatisticsDeserializer(DelegatingDeserializer<ShardStatistics.Builder> op) {

		op.add(Builder::failed, JsonpDeserializer.numberDeserializer(), "failed");
		op.add(Builder::successful, JsonpDeserializer.numberDeserializer(), "successful");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ShardFailure.DESERIALIZER), "failures");
		op.add(Builder::skipped, JsonpDeserializer.numberDeserializer(), "skipped");

	}

}
