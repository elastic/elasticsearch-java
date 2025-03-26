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

package co.elastic.clients.elasticsearch.inference.put_azureaistudio;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.lang.Integer;
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

// typedef: inference.put_azureaistudio.AzureAiStudioTaskSettings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.put_azureaistudio.AzureAiStudioTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AzureAiStudioTaskSettings implements JsonpSerializable {
	@Nullable
	private final Float doSample;

	@Nullable
	private final Integer maxNewTokens;

	@Nullable
	private final Float temperature;

	@Nullable
	private final Float topP;

	@Nullable
	private final String user;

	// ---------------------------------------------------------------------------------------------

	private AzureAiStudioTaskSettings(Builder builder) {

		this.doSample = builder.doSample;
		this.maxNewTokens = builder.maxNewTokens;
		this.temperature = builder.temperature;
		this.topP = builder.topP;
		this.user = builder.user;

	}

	public static AzureAiStudioTaskSettings of(Function<Builder, ObjectBuilder<AzureAiStudioTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * For a <code>completion</code> task, instruct the inference process to perform
	 * sampling. It has no effect unless <code>temperature</code> or
	 * <code>top_p</code> is specified.
	 * <p>
	 * API name: {@code do_sample}
	 */
	@Nullable
	public final Float doSample() {
		return this.doSample;
	}

	/**
	 * For a <code>completion</code> task, provide a hint for the maximum number of
	 * output tokens to be generated.
	 * <p>
	 * API name: {@code max_new_tokens}
	 */
	@Nullable
	public final Integer maxNewTokens() {
		return this.maxNewTokens;
	}

	/**
	 * For a <code>completion</code> task, control the apparent creativity of
	 * generated completions with a sampling temperature. It must be a number in the
	 * range of 0.0 to 2.0. It should not be used if <code>top_p</code> is
	 * specified.
	 * <p>
	 * API name: {@code temperature}
	 */
	@Nullable
	public final Float temperature() {
		return this.temperature;
	}

	/**
	 * For a <code>completion</code> task, make the model consider the results of
	 * the tokens with nucleus sampling probability. It is an alternative value to
	 * <code>temperature</code> and must be a number in the range of 0.0 to 2.0. It
	 * should not be used if <code>temperature</code> is specified.
	 * <p>
	 * API name: {@code top_p}
	 */
	@Nullable
	public final Float topP() {
		return this.topP;
	}

	/**
	 * For a <code>text_embedding</code> task, specify the user issuing the request.
	 * This information can be used for abuse detection.
	 * <p>
	 * API name: {@code user}
	 */
	@Nullable
	public final String user() {
		return this.user;
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

		if (this.doSample != null) {
			generator.writeKey("do_sample");
			generator.write(this.doSample);

		}
		if (this.maxNewTokens != null) {
			generator.writeKey("max_new_tokens");
			generator.write(this.maxNewTokens);

		}
		if (this.temperature != null) {
			generator.writeKey("temperature");
			generator.write(this.temperature);

		}
		if (this.topP != null) {
			generator.writeKey("top_p");
			generator.write(this.topP);

		}
		if (this.user != null) {
			generator.writeKey("user");
			generator.write(this.user);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AzureAiStudioTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AzureAiStudioTaskSettings> {
		@Nullable
		private Float doSample;

		@Nullable
		private Integer maxNewTokens;

		@Nullable
		private Float temperature;

		@Nullable
		private Float topP;

		@Nullable
		private String user;

		/**
		 * For a <code>completion</code> task, instruct the inference process to perform
		 * sampling. It has no effect unless <code>temperature</code> or
		 * <code>top_p</code> is specified.
		 * <p>
		 * API name: {@code do_sample}
		 */
		public final Builder doSample(@Nullable Float value) {
			this.doSample = value;
			return this;
		}

		/**
		 * For a <code>completion</code> task, provide a hint for the maximum number of
		 * output tokens to be generated.
		 * <p>
		 * API name: {@code max_new_tokens}
		 */
		public final Builder maxNewTokens(@Nullable Integer value) {
			this.maxNewTokens = value;
			return this;
		}

		/**
		 * For a <code>completion</code> task, control the apparent creativity of
		 * generated completions with a sampling temperature. It must be a number in the
		 * range of 0.0 to 2.0. It should not be used if <code>top_p</code> is
		 * specified.
		 * <p>
		 * API name: {@code temperature}
		 */
		public final Builder temperature(@Nullable Float value) {
			this.temperature = value;
			return this;
		}

		/**
		 * For a <code>completion</code> task, make the model consider the results of
		 * the tokens with nucleus sampling probability. It is an alternative value to
		 * <code>temperature</code> and must be a number in the range of 0.0 to 2.0. It
		 * should not be used if <code>temperature</code> is specified.
		 * <p>
		 * API name: {@code top_p}
		 */
		public final Builder topP(@Nullable Float value) {
			this.topP = value;
			return this;
		}

		/**
		 * For a <code>text_embedding</code> task, specify the user issuing the request.
		 * This information can be used for abuse detection.
		 * <p>
		 * API name: {@code user}
		 */
		public final Builder user(@Nullable String value) {
			this.user = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AzureAiStudioTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AzureAiStudioTaskSettings build() {
			_checkSingleUse();

			return new AzureAiStudioTaskSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AzureAiStudioTaskSettings}
	 */
	public static final JsonpDeserializer<AzureAiStudioTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AzureAiStudioTaskSettings::setupAzureAiStudioTaskSettingsDeserializer);

	protected static void setupAzureAiStudioTaskSettingsDeserializer(
			ObjectDeserializer<AzureAiStudioTaskSettings.Builder> op) {

		op.add(Builder::doSample, JsonpDeserializer.floatDeserializer(), "do_sample");
		op.add(Builder::maxNewTokens, JsonpDeserializer.integerDeserializer(), "max_new_tokens");
		op.add(Builder::temperature, JsonpDeserializer.floatDeserializer(), "temperature");
		op.add(Builder::topP, JsonpDeserializer.floatDeserializer(), "top_p");
		op.add(Builder::user, JsonpDeserializer.stringDeserializer(), "user");

	}

}
