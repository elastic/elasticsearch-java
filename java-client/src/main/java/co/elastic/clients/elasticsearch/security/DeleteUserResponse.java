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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: security.delete_user.Response
@JsonpDeserializable
public class DeleteUserResponse implements JsonpSerializable {
	private final boolean found;

	// ---------------------------------------------------------------------------------------------

	private DeleteUserResponse(Builder builder) {

		this.found = ModelTypeHelper.requireNonNull(builder.found, this, "found");

	}

	public static DeleteUserResponse of(Function<Builder, ObjectBuilder<DeleteUserResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code found}
	 */
	public final boolean found() {
		return this.found;
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

		generator.writeKey("found");
		generator.write(this.found);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteUserResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeleteUserResponse> {
		private Boolean found;

		/**
		 * Required - API name: {@code found}
		 */
		public final Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteUserResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteUserResponse build() {
			_checkSingleUse();

			return new DeleteUserResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteUserResponse}
	 */
	public static final JsonpDeserializer<DeleteUserResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeleteUserResponse::setupDeleteUserResponseDeserializer, Builder::build);

	protected static void setupDeleteUserResponseDeserializer(DelegatingDeserializer<DeleteUserResponse.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");

	}

}
