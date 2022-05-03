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
import javax.annotation.Nullable;

// typedef: security.put_role_mapping.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.put_role_mapping.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutRoleMappingResponse implements JsonpSerializable {
	@Nullable
	private final Boolean created;

	private final CreatedStatus roleMapping;

	// ---------------------------------------------------------------------------------------------

	private PutRoleMappingResponse(Builder builder) {

		this.created = builder.created;
		this.roleMapping = ApiTypeHelper.requireNonNull(builder.roleMapping, this, "roleMapping");

	}

	public static PutRoleMappingResponse of(Function<Builder, ObjectBuilder<PutRoleMappingResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code created}
	 */
	@Nullable
	public final Boolean created() {
		return this.created;
	}

	/**
	 * Required - API name: {@code role_mapping}
	 */
	public final CreatedStatus roleMapping() {
		return this.roleMapping;
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

		if (this.created != null) {
			generator.writeKey("created");
			generator.write(this.created);

		}
		generator.writeKey("role_mapping");
		this.roleMapping.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRoleMappingResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PutRoleMappingResponse> {
		@Nullable
		private Boolean created;

		private CreatedStatus roleMapping;

		/**
		 * API name: {@code created}
		 */
		public final Builder created(@Nullable Boolean value) {
			this.created = value;
			return this;
		}

		/**
		 * Required - API name: {@code role_mapping}
		 */
		public final Builder roleMapping(CreatedStatus value) {
			this.roleMapping = value;
			return this;
		}

		/**
		 * Required - API name: {@code role_mapping}
		 */
		public final Builder roleMapping(Function<CreatedStatus.Builder, ObjectBuilder<CreatedStatus>> fn) {
			return this.roleMapping(fn.apply(new CreatedStatus.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutRoleMappingResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRoleMappingResponse build() {
			_checkSingleUse();

			return new PutRoleMappingResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutRoleMappingResponse}
	 */
	public static final JsonpDeserializer<PutRoleMappingResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutRoleMappingResponse::setupPutRoleMappingResponseDeserializer);

	protected static void setupPutRoleMappingResponseDeserializer(
			ObjectDeserializer<PutRoleMappingResponse.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.booleanDeserializer(), "created");
		op.add(Builder::roleMapping, CreatedStatus._DESERIALIZER, "role_mapping");

	}

}
