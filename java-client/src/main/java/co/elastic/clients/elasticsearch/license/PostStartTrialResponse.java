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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: license.post_start_trial.Response
public final class PostStartTrialResponse extends AcknowledgedResponseBase {
	@Nullable
	private final String errorMessage;

	private final Boolean acknowledged;

	private final Boolean trialWasStarted;

	private final LicenseType type;

	// ---------------------------------------------------------------------------------------------

	public PostStartTrialResponse(Builder builder) {
		super(builder);

		this.errorMessage = builder.errorMessage;
		this.acknowledged = Objects.requireNonNull(builder.acknowledged, "acknowledged");
		this.trialWasStarted = Objects.requireNonNull(builder.trialWasStarted, "trial_was_started");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code error_message}
	 */
	@Nullable
	public String errorMessage() {
		return this.errorMessage;
	}

	/**
	 * API name: {@code acknowledged}
	 */
	public Boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * API name: {@code trial_was_started}
	 */
	public Boolean trialWasStarted() {
		return this.trialWasStarted;
	}

	/**
	 * API name: {@code type}
	 */
	public LicenseType type() {
		return this.type;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.errorMessage != null) {

			generator.writeKey("error_message");
			generator.write(this.errorMessage);

		}

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		generator.writeKey("trial_was_started");
		generator.write(this.trialWasStarted);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostStartTrialResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PostStartTrialResponse> {
		@Nullable
		private String errorMessage;

		private Boolean acknowledged;

		private Boolean trialWasStarted;

		private LicenseType type;

		/**
		 * API name: {@code error_message}
		 */
		public Builder errorMessage(@Nullable String value) {
			this.errorMessage = value;
			return this;
		}

		/**
		 * API name: {@code acknowledged}
		 */
		public Builder acknowledged(Boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * API name: {@code trial_was_started}
		 */
		public Builder trialWasStarted(Boolean value) {
			this.trialWasStarted = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(LicenseType value) {
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

			return new PostStartTrialResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostStartTrialResponse}
	 */
	public static final JsonpDeserializer<PostStartTrialResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PostStartTrialResponse::setupPostStartTrialResponseDeserializer);

	protected static void setupPostStartTrialResponseDeserializer(
			DelegatingDeserializer<PostStartTrialResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::errorMessage, JsonpDeserializer.stringDeserializer(), "error_message");
		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::trialWasStarted, JsonpDeserializer.booleanDeserializer(), "trial_was_started");
		op.add(Builder::type, LicenseType.DESERIALIZER, "type");

	}

}
