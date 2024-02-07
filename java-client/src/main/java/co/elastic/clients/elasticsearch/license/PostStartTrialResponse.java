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

import co.elastic.clients.elasticsearch._types.AcknowledgedResponse;
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

// typedef: license.post_start_trial.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#license.post_start_trial.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PostStartTrialResponse implements AcknowledgedResponse, JsonpSerializable {
	private final boolean acknowledged;

	@Nullable
	private final String errorMessage;

	private final boolean trialWasStarted;

	@Nullable
	private final LicenseType type;

	// ---------------------------------------------------------------------------------------------

	private PostStartTrialResponse(Builder builder) {

		this.acknowledged = ApiTypeHelper.requireNonNull(builder.acknowledged, this, "acknowledged");
		this.errorMessage = builder.errorMessage;
		this.trialWasStarted = ApiTypeHelper.requireNonNull(builder.trialWasStarted, this, "trialWasStarted");
		this.type = builder.type;

	}

	public static PostStartTrialResponse of(Function<Builder, ObjectBuilder<PostStartTrialResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code acknowledged}
	 */
	public final boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * API name: {@code error_message}
	 */
	@Nullable
	public final String errorMessage() {
		return this.errorMessage;
	}

	/**
	 * Required - API name: {@code trial_was_started}
	 */
	public final boolean trialWasStarted() {
		return this.trialWasStarted;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public final LicenseType type() {
		return this.type;
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

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		if (this.errorMessage != null) {
			generator.writeKey("error_message");
			generator.write(this.errorMessage);

		}
		generator.writeKey("trial_was_started");
		generator.write(this.trialWasStarted);

		if (this.type != null) {
			generator.writeKey("type");
			this.type.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostStartTrialResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PostStartTrialResponse> {
		private Boolean acknowledged;

		@Nullable
		private String errorMessage;

		private Boolean trialWasStarted;

		@Nullable
		private LicenseType type;

		/**
		 * Required - API name: {@code acknowledged}
		 */
		public final Builder acknowledged(boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * API name: {@code error_message}
		 */
		public final Builder errorMessage(@Nullable String value) {
			this.errorMessage = value;
			return this;
		}

		/**
		 * Required - API name: {@code trial_was_started}
		 */
		public final Builder trialWasStarted(boolean value) {
			this.trialWasStarted = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable LicenseType value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostStartTrialResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostStartTrialResponse build() {
			_checkSingleUse();

			return new PostStartTrialResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostStartTrialResponse}
	 */
	public static final JsonpDeserializer<PostStartTrialResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PostStartTrialResponse::setupPostStartTrialResponseDeserializer);

	protected static void setupPostStartTrialResponseDeserializer(
			ObjectDeserializer<PostStartTrialResponse.Builder> op) {

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::errorMessage, JsonpDeserializer.stringDeserializer(), "error_message");
		op.add(Builder::trialWasStarted, JsonpDeserializer.booleanDeserializer(), "trial_was_started");
		op.add(Builder::type, LicenseType._DESERIALIZER, "type");

	}

}
