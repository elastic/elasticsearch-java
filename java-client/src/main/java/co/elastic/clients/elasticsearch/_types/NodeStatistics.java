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

// typedef: _types.NodeStatistics
public final class NodeStatistics implements ToJsonp {
	@Nullable
	private final List<ErrorCause> failures;

	private final Number total;

	private final Number successful;

	private final Number failed;

	// ---------------------------------------------------------------------------------------------

	protected NodeStatistics(Builder builder) {

		this.failures = builder.failures;
		this.total = Objects.requireNonNull(builder.total, "total");
		this.successful = Objects.requireNonNull(builder.successful, "successful");
		this.failed = Objects.requireNonNull(builder.failed, "failed");

	}

	/**
	 * API name: {@code failures}
	 */
	@Nullable
	public List<ErrorCause> failures() {
		return this.failures;
	}

	/**
	 * Total number of nodes selected by the request.
	 *
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * Number of nodes that responded successfully to the request.
	 *
	 * API name: {@code successful}
	 */
	public Number successful() {
		return this.successful;
	}

	/**
	 * Number of nodes that rejected the request or failed to respond. If this value
	 * is not 0, a reason for the rejection or failure is included in the response.
	 *
	 * API name: {@code failed}
	 */
	public Number failed() {
		return this.failed;
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

		if (this.failures != null) {

			generator.writeKey("failures");
			generator.writeStartArray();
			for (ErrorCause item0 : this.failures) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		generator.writeKey("successful");
		generator.write(this.successful.doubleValue());

		generator.writeKey("failed");
		generator.write(this.failed.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeStatistics}.
	 */
	public static class Builder implements ObjectBuilder<NodeStatistics> {
		@Nullable
		private List<ErrorCause> failures;

		private Number total;

		private Number successful;

		private Number failed;

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(@Nullable List<ErrorCause> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(ErrorCause... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(ErrorCause value) {
			if (this.failures == null) {
				this.failures = new ArrayList<>();
			}
			this.failures.add(value);
			return this;
		}

		/**
		 * Set {@link #failures(List)} to a singleton list.
		 */
		public Builder failures(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.failures(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.addFailures(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Total number of nodes selected by the request.
		 *
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * Number of nodes that responded successfully to the request.
		 *
		 * API name: {@code successful}
		 */
		public Builder successful(Number value) {
			this.successful = value;
			return this;
		}

		/**
		 * Number of nodes that rejected the request or failed to respond. If this value
		 * is not 0, a reason for the rejection or failure is included in the response.
		 *
		 * API name: {@code failed}
		 */
		public Builder failed(Number value) {
			this.failed = value;
			return this;
		}

		/**
		 * Builds a {@link NodeStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeStatistics build() {

			return new NodeStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeStatistics
	 */
	public static final JsonpDeserializer<NodeStatistics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeStatistics::setupNodeStatisticsDeserializer);

	protected static void setupNodeStatisticsDeserializer(DelegatingDeserializer<NodeStatistics.Builder> op) {

		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ErrorCause.DESERIALIZER), "failures");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::successful, JsonpDeserializer.numberDeserializer(), "successful");
		op.add(Builder::failed, JsonpDeserializer.numberDeserializer(), "failed");

	}

}
