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

package co.elastic.clients.elasticsearch.cluster.allocation_explain;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.UnassignedInformation
@JsonpDeserializable
public final class UnassignedInformation implements JsonpSerializable {
	private final String at;

	@Nullable
	private final String lastAllocationStatus;

	private final UnassignedInformationReason reason;

	@Nullable
	private final String details;

	@Nullable
	private final Integer failedAllocationAttempts;

	@Nullable
	private final Boolean delayed;

	@Nullable
	private final String allocationStatus;

	// ---------------------------------------------------------------------------------------------

	public UnassignedInformation(Builder builder) {

		this.at = Objects.requireNonNull(builder.at, "at");
		this.lastAllocationStatus = builder.lastAllocationStatus;
		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.details = builder.details;
		this.failedAllocationAttempts = builder.failedAllocationAttempts;
		this.delayed = builder.delayed;
		this.allocationStatus = builder.allocationStatus;

	}

	public UnassignedInformation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code at}
	 */
	public String at() {
		return this.at;
	}

	/**
	 * API name: {@code last_allocation_status}
	 */
	@Nullable
	public String lastAllocationStatus() {
		return this.lastAllocationStatus;
	}

	/**
	 * API name: {@code reason}
	 */
	public UnassignedInformationReason reason() {
		return this.reason;
	}

	/**
	 * API name: {@code details}
	 */
	@Nullable
	public String details() {
		return this.details;
	}

	/**
	 * API name: {@code failed_allocation_attempts}
	 */
	@Nullable
	public Integer failedAllocationAttempts() {
		return this.failedAllocationAttempts;
	}

	/**
	 * API name: {@code delayed}
	 */
	@Nullable
	public Boolean delayed() {
		return this.delayed;
	}

	/**
	 * API name: {@code allocation_status}
	 */
	@Nullable
	public String allocationStatus() {
		return this.allocationStatus;
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

		generator.writeKey("at");
		generator.write(this.at);

		if (this.lastAllocationStatus != null) {

			generator.writeKey("last_allocation_status");
			generator.write(this.lastAllocationStatus);

		}

		generator.writeKey("reason");
		this.reason.serialize(generator, mapper);
		if (this.details != null) {

			generator.writeKey("details");
			generator.write(this.details);

		}
		if (this.failedAllocationAttempts != null) {

			generator.writeKey("failed_allocation_attempts");
			generator.write(this.failedAllocationAttempts);

		}
		if (this.delayed != null) {

			generator.writeKey("delayed");
			generator.write(this.delayed);

		}
		if (this.allocationStatus != null) {

			generator.writeKey("allocation_status");
			generator.write(this.allocationStatus);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UnassignedInformation}.
	 */
	public static class Builder implements ObjectBuilder<UnassignedInformation> {
		private String at;

		@Nullable
		private String lastAllocationStatus;

		private UnassignedInformationReason reason;

		@Nullable
		private String details;

		@Nullable
		private Integer failedAllocationAttempts;

		@Nullable
		private Boolean delayed;

		@Nullable
		private String allocationStatus;

		/**
		 * API name: {@code at}
		 */
		public Builder at(String value) {
			this.at = value;
			return this;
		}

		/**
		 * API name: {@code last_allocation_status}
		 */
		public Builder lastAllocationStatus(@Nullable String value) {
			this.lastAllocationStatus = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(UnassignedInformationReason value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public Builder details(@Nullable String value) {
			this.details = value;
			return this;
		}

		/**
		 * API name: {@code failed_allocation_attempts}
		 */
		public Builder failedAllocationAttempts(@Nullable Integer value) {
			this.failedAllocationAttempts = value;
			return this;
		}

		/**
		 * API name: {@code delayed}
		 */
		public Builder delayed(@Nullable Boolean value) {
			this.delayed = value;
			return this;
		}

		/**
		 * API name: {@code allocation_status}
		 */
		public Builder allocationStatus(@Nullable String value) {
			this.allocationStatus = value;
			return this;
		}

		/**
		 * Builds a {@link UnassignedInformation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UnassignedInformation build() {

			return new UnassignedInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UnassignedInformation}
	 */
	public static final JsonpDeserializer<UnassignedInformation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UnassignedInformation::setupUnassignedInformationDeserializer, Builder::build);

	protected static void setupUnassignedInformationDeserializer(
			DelegatingDeserializer<UnassignedInformation.Builder> op) {

		op.add(Builder::at, JsonpDeserializer.stringDeserializer(), "at");
		op.add(Builder::lastAllocationStatus, JsonpDeserializer.stringDeserializer(), "last_allocation_status");
		op.add(Builder::reason, UnassignedInformationReason._DESERIALIZER, "reason");
		op.add(Builder::details, JsonpDeserializer.stringDeserializer(), "details");
		op.add(Builder::failedAllocationAttempts, JsonpDeserializer.integerDeserializer(),
				"failed_allocation_attempts");
		op.add(Builder::delayed, JsonpDeserializer.booleanDeserializer(), "delayed");
		op.add(Builder::allocationStatus, JsonpDeserializer.stringDeserializer(), "allocation_status");

	}

}
