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

package co.elastic.clients.elasticsearch.security;

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

// typedef: security.update_api_key.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.update_api_key.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateApiKeyResponse implements JsonpSerializable {
	private final boolean updated;

	// ---------------------------------------------------------------------------------------------

	private UpdateApiKeyResponse(Builder builder) {

		this.updated = ApiTypeHelper.requireNonNull(builder.updated, this, "updated");

	}

	public static UpdateApiKeyResponse of(Function<Builder, ObjectBuilder<UpdateApiKeyResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - If <code>true</code>, the API key was updated. If
	 * <code>false</code>, the API key didn’t change because no change was detected.
	 * <p>
	 * API name: {@code updated}
	 */
	public final boolean updated() {
		return this.updated;
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

		generator.writeKey("updated");
		generator.write(this.updated);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateApiKeyResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<UpdateApiKeyResponse> {
		private Boolean updated;

		/**
		 * Required - If <code>true</code>, the API key was updated. If
		 * <code>false</code>, the API key didn’t change because no change was detected.
		 * <p>
		 * API name: {@code updated}
		 */
		public final Builder updated(boolean value) {
			this.updated = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateApiKeyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateApiKeyResponse build() {
			_checkSingleUse();

			return new UpdateApiKeyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateApiKeyResponse}
	 */
	public static final JsonpDeserializer<UpdateApiKeyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateApiKeyResponse::setupUpdateApiKeyResponseDeserializer);

	protected static void setupUpdateApiKeyResponseDeserializer(ObjectDeserializer<UpdateApiKeyResponse.Builder> op) {

		op.add(Builder::updated, JsonpDeserializer.booleanDeserializer(), "updated");

	}

}
