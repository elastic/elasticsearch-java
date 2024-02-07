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

package co.elastic.clients.elasticsearch.autoscaling.get_autoscaling_capacity;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: autoscaling.get_autoscaling_capacity.AutoscalingDecider

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#autoscaling.get_autoscaling_capacity.AutoscalingDecider">API
 *      specification</a>
 */
@JsonpDeserializable
public class AutoscalingDecider implements JsonpSerializable {
	private final AutoscalingCapacity requiredCapacity;

	@Nullable
	private final String reasonSummary;

	@Nullable
	private final JsonData reasonDetails;

	// ---------------------------------------------------------------------------------------------

	private AutoscalingDecider(Builder builder) {

		this.requiredCapacity = ApiTypeHelper.requireNonNull(builder.requiredCapacity, this, "requiredCapacity");
		this.reasonSummary = builder.reasonSummary;
		this.reasonDetails = builder.reasonDetails;

	}

	public static AutoscalingDecider of(Function<Builder, ObjectBuilder<AutoscalingDecider>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code required_capacity}
	 */
	public final AutoscalingCapacity requiredCapacity() {
		return this.requiredCapacity;
	}

	/**
	 * API name: {@code reason_summary}
	 */
	@Nullable
	public final String reasonSummary() {
		return this.reasonSummary;
	}

	/**
	 * API name: {@code reason_details}
	 */
	@Nullable
	public final JsonData reasonDetails() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoscalingDecider}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AutoscalingDecider> {
		private AutoscalingCapacity requiredCapacity;

		@Nullable
		private String reasonSummary;

		@Nullable
		private JsonData reasonDetails;

		/**
		 * Required - API name: {@code required_capacity}
		 */
		public final Builder requiredCapacity(AutoscalingCapacity value) {
			this.requiredCapacity = value;
			return this;
		}

		/**
		 * Required - API name: {@code required_capacity}
		 */
		public final Builder requiredCapacity(
				Function<AutoscalingCapacity.Builder, ObjectBuilder<AutoscalingCapacity>> fn) {
			return this.requiredCapacity(fn.apply(new AutoscalingCapacity.Builder()).build());
		}

		/**
		 * API name: {@code reason_summary}
		 */
		public final Builder reasonSummary(@Nullable String value) {
			this.reasonSummary = value;
			return this;
		}

		/**
		 * API name: {@code reason_details}
		 */
		public final Builder reasonDetails(@Nullable JsonData value) {
			this.reasonDetails = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AutoscalingDecider}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoscalingDecider build() {
			_checkSingleUse();

			return new AutoscalingDecider(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoscalingDecider}
	 */
	public static final JsonpDeserializer<AutoscalingDecider> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoscalingDecider::setupAutoscalingDeciderDeserializer);

	protected static void setupAutoscalingDeciderDeserializer(ObjectDeserializer<AutoscalingDecider.Builder> op) {

		op.add(Builder::requiredCapacity, AutoscalingCapacity._DESERIALIZER, "required_capacity");
		op.add(Builder::reasonSummary, JsonpDeserializer.stringDeserializer(), "reason_summary");
		op.add(Builder::reasonDetails, JsonData._DESERIALIZER, "reason_details");

	}

}
