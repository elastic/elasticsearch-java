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

package co.elastic.clients.elasticsearch.license;

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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: license.get_trial_status.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#license.get_trial_status.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetTrialStatusResponse implements JsonpSerializable {
	private final boolean eligibleToStartTrial;

	// ---------------------------------------------------------------------------------------------

	private GetTrialStatusResponse(Builder builder) {

		this.eligibleToStartTrial = ApiTypeHelper.requireNonNull(builder.eligibleToStartTrial, this,
				"eligibleToStartTrial");

	}

	public static GetTrialStatusResponse of(Function<Builder, ObjectBuilder<GetTrialStatusResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code eligible_to_start_trial}
	 */
	public final boolean eligibleToStartTrial() {
		return this.eligibleToStartTrial;
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

		generator.writeKey("eligible_to_start_trial");
		generator.write(this.eligibleToStartTrial);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTrialStatusResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetTrialStatusResponse> {
		private Boolean eligibleToStartTrial;

		/**
		 * Required - API name: {@code eligible_to_start_trial}
		 */
		public final Builder eligibleToStartTrial(boolean value) {
			this.eligibleToStartTrial = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetTrialStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTrialStatusResponse build() {
			_checkSingleUse();

			return new GetTrialStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTrialStatusResponse}
	 */
	public static final JsonpDeserializer<GetTrialStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetTrialStatusResponse::setupGetTrialStatusResponseDeserializer);

	protected static void setupGetTrialStatusResponseDeserializer(
			ObjectDeserializer<GetTrialStatusResponse.Builder> op) {

		op.add(Builder::eligibleToStartTrial, JsonpDeserializer.booleanDeserializer(), "eligible_to_start_trial");

	}

}
