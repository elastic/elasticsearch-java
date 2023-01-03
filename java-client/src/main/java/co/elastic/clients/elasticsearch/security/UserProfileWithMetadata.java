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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.UserProfileWithMetadata

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.UserProfileWithMetadata">API
 *      specification</a>
 */
@JsonpDeserializable
public class UserProfileWithMetadata extends UserProfile {
	private final long lastSynchronized;

	private final UserProfileHitMetadata doc;

	// ---------------------------------------------------------------------------------------------

	protected UserProfileWithMetadata(AbstractBuilder<?> builder) {
		super(builder);

		this.lastSynchronized = ApiTypeHelper.requireNonNull(builder.lastSynchronized, this, "lastSynchronized");
		this.doc = ApiTypeHelper.requireNonNull(builder.doc, this, "doc");

	}

	public static UserProfileWithMetadata userProfileWithMetadataOf(
			Function<Builder, ObjectBuilder<UserProfileWithMetadata>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code last_synchronized}
	 */
	public final long lastSynchronized() {
		return this.lastSynchronized;
	}

	/**
	 * Required - API name: {@code _doc}
	 */
	public final UserProfileHitMetadata doc() {
		return this.doc;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("last_synchronized");
		generator.write(this.lastSynchronized);

		generator.writeKey("_doc");
		this.doc.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UserProfileWithMetadata}.
	 */

	public static class Builder extends UserProfileWithMetadata.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UserProfileWithMetadata> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UserProfileWithMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UserProfileWithMetadata build() {
			_checkSingleUse();

			return new UserProfileWithMetadata(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				UserProfile.AbstractBuilder<BuilderT> {
		private Long lastSynchronized;

		private UserProfileHitMetadata doc;

		/**
		 * Required - API name: {@code last_synchronized}
		 */
		public final BuilderT lastSynchronized(long value) {
			this.lastSynchronized = value;
			return self();
		}

		/**
		 * Required - API name: {@code _doc}
		 */
		public final BuilderT doc(UserProfileHitMetadata value) {
			this.doc = value;
			return self();
		}

		/**
		 * Required - API name: {@code _doc}
		 */
		public final BuilderT doc(Function<UserProfileHitMetadata.Builder, ObjectBuilder<UserProfileHitMetadata>> fn) {
			return this.doc(fn.apply(new UserProfileHitMetadata.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UserProfileWithMetadata}
	 */
	public static final JsonpDeserializer<UserProfileWithMetadata> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UserProfileWithMetadata::setupUserProfileWithMetadataDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupUserProfileWithMetadataDeserializer(
			ObjectDeserializer<BuilderT> op) {
		UserProfile.setupUserProfileDeserializer(op);
		op.add(AbstractBuilder::lastSynchronized, JsonpDeserializer.longDeserializer(), "last_synchronized");
		op.add(AbstractBuilder::doc, UserProfileHitMetadata._DESERIALIZER, "_doc");

	}

}
