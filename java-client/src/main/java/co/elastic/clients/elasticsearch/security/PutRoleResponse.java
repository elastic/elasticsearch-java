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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.put_role.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.put_role.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutRoleResponse implements JsonpSerializable {
	private final CreatedStatus role;

	// ---------------------------------------------------------------------------------------------

	private PutRoleResponse(Builder builder) {

		this.role = ApiTypeHelper.requireNonNull(builder.role, this, "role");

	}

	public static PutRoleResponse of(Function<Builder, ObjectBuilder<PutRoleResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code role}
	 */
	public final CreatedStatus role() {
		return this.role;
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

		generator.writeKey("role");
		this.role.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRoleResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PutRoleResponse> {
		private CreatedStatus role;

		/**
		 * Required - API name: {@code role}
		 */
		public final Builder role(CreatedStatus value) {
			this.role = value;
			return this;
		}

		/**
		 * Required - API name: {@code role}
		 */
		public final Builder role(Function<CreatedStatus.Builder, ObjectBuilder<CreatedStatus>> fn) {
			return this.role(fn.apply(new CreatedStatus.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutRoleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRoleResponse build() {
			_checkSingleUse();

			return new PutRoleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutRoleResponse}
	 */
	public static final JsonpDeserializer<PutRoleResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutRoleResponse::setupPutRoleResponseDeserializer);

	protected static void setupPutRoleResponseDeserializer(ObjectDeserializer<PutRoleResponse.Builder> op) {

		op.add(Builder::role, CreatedStatus._DESERIALIZER, "role");

	}

}
