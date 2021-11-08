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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.post_start_trial.Response
@JsonpDeserializable
public class PostStartTrialResponse extends AcknowledgedResponseBase {
	@Nullable
	private final String errorMessage;

	private final boolean trialWasStarted;

	private final LicenseType type;

	// ---------------------------------------------------------------------------------------------

	private PostStartTrialResponse(Builder builder) {
		super(builder);

		this.errorMessage = builder.errorMessage;
		this.trialWasStarted = ModelTypeHelper.requireNonNull(builder.trialWasStarted, this, "trialWasStarted");
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static PostStartTrialResponse of(Function<Builder, ObjectBuilder<PostStartTrialResponse>> fn) {
		return fn.apply(new Builder()).build();
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
	 * Required - API name: {@code type}
	 */
	public final LicenseType type() {
		return this.type;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.errorMessage != null) {
			generator.writeKey("error_message");
			generator.write(this.errorMessage);

		}
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

		private Boolean trialWasStarted;

		private LicenseType type;

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
		 * Required - API name: {@code type}
		 */
		public final Builder type(LicenseType value) {
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
			.lazy(Builder::new, PostStartTrialResponse::setupPostStartTrialResponseDeserializer, Builder::build);

	protected static void setupPostStartTrialResponseDeserializer(
			DelegatingDeserializer<PostStartTrialResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::errorMessage, JsonpDeserializer.stringDeserializer(), "error_message");
		op.add(Builder::trialWasStarted, JsonpDeserializer.booleanDeserializer(), "trial_was_started");
		op.add(Builder::type, LicenseType._DESERIALIZER, "type");

	}

}
