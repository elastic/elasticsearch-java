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

package co.elastic.clients.elasticsearch.autoscaling.get_autoscaling_capacity;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
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

// typedef: autoscaling.get_autoscaling_capacity.AutoscalingDecider
public final class AutoscalingDecider implements JsonpSerializable {
	private final AutoscalingCapacity requiredCapacity;

	@Nullable
	private final String reasonSummary;

	@Nullable
	private final JsonData reasonDetails;

	// ---------------------------------------------------------------------------------------------

	public AutoscalingDecider(Builder builder) {

		this.requiredCapacity = Objects.requireNonNull(builder.requiredCapacity, "required_capacity");
		this.reasonSummary = builder.reasonSummary;
		this.reasonDetails = builder.reasonDetails;

	}

	/**
	 * API name: {@code required_capacity}
	 */
	public AutoscalingCapacity requiredCapacity() {
		return this.requiredCapacity;
	}

	/**
	 * API name: {@code reason_summary}
	 */
	@Nullable
	public String reasonSummary() {
		return this.reasonSummary;
	}

	/**
	 * API name: {@code reason_details}
	 */
	@Nullable
	public JsonData reasonDetails() {
		return this.reasonDetails;
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

		generator.writeKey("required_capacity");
		this.requiredCapacity.serialize(generator, mapper);

		if (this.reasonSummary != null) {

			generator.writeKey("reason_summary");
			generator.write(this.reasonSummary);

		}
		if (this.reasonDetails != null) {

			generator.writeKey("reason_details");
			this.reasonDetails.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoscalingDecider}.
	 */
	public static class Builder implements ObjectBuilder<AutoscalingDecider> {
		private AutoscalingCapacity requiredCapacity;

		@Nullable
		private String reasonSummary;

		@Nullable
		private JsonData reasonDetails;

		/**
		 * API name: {@code required_capacity}
		 */
		public Builder requiredCapacity(AutoscalingCapacity value) {
			this.requiredCapacity = value;
			return this;
		}

		/**
		 * API name: {@code required_capacity}
		 */
		public Builder requiredCapacity(Function<AutoscalingCapacity.Builder, ObjectBuilder<AutoscalingCapacity>> fn) {
			return this.requiredCapacity(fn.apply(new AutoscalingCapacity.Builder()).build());
		}

		/**
		 * API name: {@code reason_summary}
		 */
		public Builder reasonSummary(@Nullable String value) {
			this.reasonSummary = value;
			return this;
		}

		/**
		 * API name: {@code reason_details}
		 */
		public Builder reasonDetails(@Nullable JsonData value) {
			this.reasonDetails = value;
			return this;
		}

		/**
		 * Builds a {@link AutoscalingDecider}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoscalingDecider build() {

			return new AutoscalingDecider(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoscalingDecider}
	 */
	public static final JsonpDeserializer<AutoscalingDecider> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AutoscalingDecider::setupAutoscalingDeciderDeserializer);

	protected static void setupAutoscalingDeciderDeserializer(DelegatingDeserializer<AutoscalingDecider.Builder> op) {

		op.add(Builder::requiredCapacity, AutoscalingCapacity.DESERIALIZER, "required_capacity");
		op.add(Builder::reasonSummary, JsonpDeserializer.stringDeserializer(), "reason_summary");
		op.add(Builder::reasonDetails, JsonData.DESERIALIZER, "reason_details");

	}

}
