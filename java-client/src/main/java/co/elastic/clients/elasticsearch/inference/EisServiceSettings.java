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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference._types.EisServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EisServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class EisServiceSettings implements JsonpSerializable {
	private final String modelId;

	@Nullable
	private final RateLimitSetting rateLimit;

	// ---------------------------------------------------------------------------------------------

	private EisServiceSettings(Builder builder) {

		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.rateLimit = builder.rateLimit;

	}

	public static EisServiceSettings of(Function<Builder, ObjectBuilder<EisServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the model to use for the inference task.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned. By
	 * default, the <code>elastic</code> service sets the number of requests allowed
	 * per minute to <code>240</code> in case of <code>chat_completion</code>.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
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

		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EisServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EisServiceSettings> {
		private String modelId;

		@Nullable
		private RateLimitSetting rateLimit;

		/**
		 * Required - The name of the model to use for the inference task.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned. By
		 * default, the <code>elastic</code> service sets the number of requests allowed
		 * per minute to <code>240</code> in case of <code>chat_completion</code>.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned. By
		 * default, the <code>elastic</code> service sets the number of requests allowed
		 * per minute to <code>240</code> in case of <code>chat_completion</code>.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EisServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EisServiceSettings build() {
			_checkSingleUse();

			return new EisServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EisServiceSettings}
	 */
	public static final JsonpDeserializer<EisServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EisServiceSettings::setupEisServiceSettingsDeserializer);

	protected static void setupEisServiceSettingsDeserializer(ObjectDeserializer<EisServiceSettings.Builder> op) {

		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");

	}

}
