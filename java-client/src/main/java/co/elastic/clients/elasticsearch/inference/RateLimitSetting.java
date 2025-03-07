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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: inference._types.RateLimitSetting

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.RateLimitSetting">API
 *      specification</a>
 */
@JsonpDeserializable
public class RateLimitSetting implements JsonpSerializable {
	@Nullable
	private final Integer requestsPerMinute;

	// ---------------------------------------------------------------------------------------------

	private RateLimitSetting(Builder builder) {

		this.requestsPerMinute = builder.requestsPerMinute;

	}

	public static RateLimitSetting of(Function<Builder, ObjectBuilder<RateLimitSetting>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of requests allowed per minute.
	 * <p>
	 * API name: {@code requests_per_minute}
	 */
	@Nullable
	public final Integer requestsPerMinute() {
		return this.requestsPerMinute;
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

		if (this.requestsPerMinute != null) {
			generator.writeKey("requests_per_minute");
			generator.write(this.requestsPerMinute);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RateLimitSetting}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RateLimitSetting> {
		@Nullable
		private Integer requestsPerMinute;

		/**
		 * The number of requests allowed per minute.
		 * <p>
		 * API name: {@code requests_per_minute}
		 */
		public final Builder requestsPerMinute(@Nullable Integer value) {
			this.requestsPerMinute = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RateLimitSetting}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RateLimitSetting build() {
			_checkSingleUse();

			return new RateLimitSetting(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RateLimitSetting}
	 */
	public static final JsonpDeserializer<RateLimitSetting> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RateLimitSetting::setupRateLimitSettingDeserializer);

	protected static void setupRateLimitSettingDeserializer(ObjectDeserializer<RateLimitSetting.Builder> op) {

		op.add(Builder::requestsPerMinute, JsonpDeserializer.integerDeserializer(), "requests_per_minute");

	}

}
