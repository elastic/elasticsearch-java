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

package co.elastic.clients.elasticsearch.core.health_report;

import co.elastic.clients.elasticsearch._types.LifecycleOperationMode;
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
import java.lang.Long;
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

// typedef: _global.health_report.SlmIndicatorDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.SlmIndicatorDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlmIndicatorDetails implements JsonpSerializable {
	private final LifecycleOperationMode slmStatus;

	private final long policies;

	@Nullable
	private final SlmIndicatorUnhealthyPolicies unhealthyPolicies;

	// ---------------------------------------------------------------------------------------------

	private SlmIndicatorDetails(Builder builder) {

		this.slmStatus = ApiTypeHelper.requireNonNull(builder.slmStatus, this, "slmStatus");
		this.policies = ApiTypeHelper.requireNonNull(builder.policies, this, "policies");
		this.unhealthyPolicies = builder.unhealthyPolicies;

	}

	public static SlmIndicatorDetails of(Function<Builder, ObjectBuilder<SlmIndicatorDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code slm_status}
	 */
	public final LifecycleOperationMode slmStatus() {
		return this.slmStatus;
	}

	/**
	 * Required - API name: {@code policies}
	 */
	public final long policies() {
		return this.policies;
	}

	/**
	 * API name: {@code unhealthy_policies}
	 */
	@Nullable
	public final SlmIndicatorUnhealthyPolicies unhealthyPolicies() {
		return this.unhealthyPolicies;
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

		generator.writeKey("slm_status");
		this.slmStatus.serialize(generator, mapper);
		generator.writeKey("policies");
		generator.write(this.policies);

		if (this.unhealthyPolicies != null) {
			generator.writeKey("unhealthy_policies");
			this.unhealthyPolicies.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlmIndicatorDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SlmIndicatorDetails> {
		private LifecycleOperationMode slmStatus;

		private Long policies;

		@Nullable
		private SlmIndicatorUnhealthyPolicies unhealthyPolicies;

		/**
		 * Required - API name: {@code slm_status}
		 */
		public final Builder slmStatus(LifecycleOperationMode value) {
			this.slmStatus = value;
			return this;
		}

		/**
		 * Required - API name: {@code policies}
		 */
		public final Builder policies(long value) {
			this.policies = value;
			return this;
		}

		/**
		 * API name: {@code unhealthy_policies}
		 */
		public final Builder unhealthyPolicies(@Nullable SlmIndicatorUnhealthyPolicies value) {
			this.unhealthyPolicies = value;
			return this;
		}

		/**
		 * API name: {@code unhealthy_policies}
		 */
		public final Builder unhealthyPolicies(
				Function<SlmIndicatorUnhealthyPolicies.Builder, ObjectBuilder<SlmIndicatorUnhealthyPolicies>> fn) {
			return this.unhealthyPolicies(fn.apply(new SlmIndicatorUnhealthyPolicies.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlmIndicatorDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlmIndicatorDetails build() {
			_checkSingleUse();

			return new SlmIndicatorDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlmIndicatorDetails}
	 */
	public static final JsonpDeserializer<SlmIndicatorDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SlmIndicatorDetails::setupSlmIndicatorDetailsDeserializer);

	protected static void setupSlmIndicatorDetailsDeserializer(ObjectDeserializer<SlmIndicatorDetails.Builder> op) {

		op.add(Builder::slmStatus, LifecycleOperationMode._DESERIALIZER, "slm_status");
		op.add(Builder::policies, JsonpDeserializer.longDeserializer(), "policies");
		op.add(Builder::unhealthyPolicies, SlmIndicatorUnhealthyPolicies._DESERIALIZER, "unhealthy_policies");

	}

}
