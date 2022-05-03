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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: security._types.UserProfileHitMetadata

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.UserProfileHitMetadata">API
 *      specification</a>
 */
@JsonpDeserializable
public class UserProfileHitMetadata implements JsonpSerializable {
	private final long primaryTerm;

	private final long seqNo;

	// ---------------------------------------------------------------------------------------------

	private UserProfileHitMetadata(Builder builder) {

		this.primaryTerm = ApiTypeHelper.requireNonNull(builder.primaryTerm, this, "primaryTerm");
		this.seqNo = ApiTypeHelper.requireNonNull(builder.seqNo, this, "seqNo");

	}

	public static UserProfileHitMetadata of(Function<Builder, ObjectBuilder<UserProfileHitMetadata>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code _primary_term}
	 */
	public final long primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * Required - API name: {@code _seq_no}
	 */
	public final long seqNo() {
		return this.seqNo;
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

		generator.writeKey("_primary_term");
		generator.write(this.primaryTerm);

		generator.writeKey("_seq_no");
		generator.write(this.seqNo);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UserProfileHitMetadata}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<UserProfileHitMetadata> {
		private Long primaryTerm;

		private Long seqNo;

		/**
		 * Required - API name: {@code _primary_term}
		 */
		public final Builder primaryTerm(long value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * Required - API name: {@code _seq_no}
		 */
		public final Builder seqNo(long value) {
			this.seqNo = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UserProfileHitMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UserProfileHitMetadata build() {
			_checkSingleUse();

			return new UserProfileHitMetadata(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UserProfileHitMetadata}
	 */
	public static final JsonpDeserializer<UserProfileHitMetadata> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UserProfileHitMetadata::setupUserProfileHitMetadataDeserializer);

	protected static void setupUserProfileHitMetadataDeserializer(
			ObjectDeserializer<UserProfileHitMetadata.Builder> op) {

		op.add(Builder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(Builder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");

	}

}
