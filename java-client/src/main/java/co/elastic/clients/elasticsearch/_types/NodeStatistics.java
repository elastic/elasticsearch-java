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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.NodeStatistics
@JsonpDeserializable
public final class NodeStatistics implements JsonpSerializable {
	@Nullable
	private final List<ErrorCause> failures;

	private final Integer total;

	private final Integer successful;

	private final Integer failed;

	// ---------------------------------------------------------------------------------------------

	public NodeStatistics(Builder builder) {

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
	 * <p>
	 * API name: {@code total}
	 */
	public Integer total() {
		return this.total;
	}

	/**
	 * Number of nodes that responded successfully to the request.
	 * <p>
	 * API name: {@code successful}
	 */
	public Integer successful() {
		return this.successful;
	}

	/**
	 * Number of nodes that rejected the request or failed to respond. If this value
	 * is not 0, a reason for the rejection or failure is included in the response.
	 * <p>
	 * API name: {@code failed}
	 */
	public Integer failed() {
		return this.failed;
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

		if (this.failures != null) {

			generator.writeKey("failures");
			generator.writeStartArray();
			for (ErrorCause item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("successful");
		generator.write(this.successful);

		generator.writeKey("failed");
		generator.write(this.failed);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeStatistics}.
	 */
	public static class Builder implements ObjectBuilder<NodeStatistics> {
		@Nullable
		private List<ErrorCause> failures;

		private Integer total;

		private Integer successful;

		private Integer failed;

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
		 * <p>
		 * API name: {@code total}
		 */
		public Builder total(Integer value) {
			this.total = value;
			return this;
		}

		/**
		 * Number of nodes that responded successfully to the request.
		 * <p>
		 * API name: {@code successful}
		 */
		public Builder successful(Integer value) {
			this.successful = value;
			return this;
		}

		/**
		 * Number of nodes that rejected the request or failed to respond. If this value
		 * is not 0, a reason for the rejection or failure is included in the response.
		 * <p>
		 * API name: {@code failed}
		 */
		public Builder failed(Integer value) {
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
	 * Json deserializer for {@link NodeStatistics}
	 */
	public static final JsonpDeserializer<NodeStatistics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeStatistics::setupNodeStatisticsDeserializer, Builder::build);

	protected static void setupNodeStatisticsDeserializer(DelegatingDeserializer<NodeStatistics.Builder> op) {

		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "failures");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::successful, JsonpDeserializer.integerDeserializer(), "successful");
		op.add(Builder::failed, JsonpDeserializer.integerDeserializer(), "failed");

	}

}
