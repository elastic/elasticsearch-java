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

package co.elastic.clients.elasticsearch.core.health_report;

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

// typedef: _global.health_report.ProjectEncryptionKeyDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.ProjectEncryptionKeyDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class ProjectEncryptionKeyDetails implements JsonpSerializable {
	@Nullable
	private final String activeKeyId;

	private final String activePasswordId;

	private final boolean encryptionRequired;

	@Nullable
	private final Integer keyCount;

	@Nullable
	private final String metadataPasswordId;

	private final String state;

	// ---------------------------------------------------------------------------------------------

	private ProjectEncryptionKeyDetails(Builder builder) {

		this.activeKeyId = builder.activeKeyId;
		this.activePasswordId = ApiTypeHelper.requireNonNull(builder.activePasswordId, this, "activePasswordId");
		this.encryptionRequired = ApiTypeHelper.requireNonNull(builder.encryptionRequired, this, "encryptionRequired",
				false);
		this.keyCount = builder.keyCount;
		this.metadataPasswordId = builder.metadataPasswordId;
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");

	}

	public static ProjectEncryptionKeyDetails of(Function<Builder, ObjectBuilder<ProjectEncryptionKeyDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code active_key_id}
	 */
	@Nullable
	public final String activeKeyId() {
		return this.activeKeyId;
	}

	/**
	 * Required - API name: {@code active_password_id}
	 */
	public final String activePasswordId() {
		return this.activePasswordId;
	}

	/**
	 * Required - Whether callers must refuse to store secrets when the service is
	 * not ready. If <code>false</code>, callers may fall back to storing secrets in
	 * plaintext (with a warning).
	 * <p>
	 * API name: {@code encryption_required}
	 */
	public final boolean encryptionRequired() {
		return this.encryptionRequired;
	}

	/**
	 * API name: {@code key_count}
	 */
	@Nullable
	public final Integer keyCount() {
		return this.keyCount;
	}

	/**
	 * API name: {@code metadata_password_id}
	 */
	@Nullable
	public final String metadataPasswordId() {
		return this.metadataPasswordId;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final String state() {
		return this.state;
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

		if (this.activeKeyId != null) {
			generator.writeKey("active_key_id");
			generator.write(this.activeKeyId);

		}
		generator.writeKey("active_password_id");
		generator.write(this.activePasswordId);

		generator.writeKey("encryption_required");
		generator.write(this.encryptionRequired);

		if (this.keyCount != null) {
			generator.writeKey("key_count");
			generator.write(this.keyCount);

		}
		if (this.metadataPasswordId != null) {
			generator.writeKey("metadata_password_id");
			generator.write(this.metadataPasswordId);

		}
		generator.writeKey("state");
		generator.write(this.state);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ProjectEncryptionKeyDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ProjectEncryptionKeyDetails> {
		@Nullable
		private String activeKeyId;

		private String activePasswordId;

		private Boolean encryptionRequired;

		@Nullable
		private Integer keyCount;

		@Nullable
		private String metadataPasswordId;

		private String state;

		public Builder() {
		}
		private Builder(ProjectEncryptionKeyDetails instance) {
			this.activeKeyId = instance.activeKeyId;
			this.activePasswordId = instance.activePasswordId;
			this.encryptionRequired = instance.encryptionRequired;
			this.keyCount = instance.keyCount;
			this.metadataPasswordId = instance.metadataPasswordId;
			this.state = instance.state;

		}
		/**
		 * API name: {@code active_key_id}
		 */
		public final Builder activeKeyId(@Nullable String value) {
			this.activeKeyId = value;
			return this;
		}

		/**
		 * Required - API name: {@code active_password_id}
		 */
		public final Builder activePasswordId(String value) {
			this.activePasswordId = value;
			return this;
		}

		/**
		 * Required - Whether callers must refuse to store secrets when the service is
		 * not ready. If <code>false</code>, callers may fall back to storing secrets in
		 * plaintext (with a warning).
		 * <p>
		 * API name: {@code encryption_required}
		 */
		public final Builder encryptionRequired(boolean value) {
			this.encryptionRequired = value;
			return this;
		}

		/**
		 * API name: {@code key_count}
		 */
		public final Builder keyCount(@Nullable Integer value) {
			this.keyCount = value;
			return this;
		}

		/**
		 * API name: {@code metadata_password_id}
		 */
		public final Builder metadataPasswordId(@Nullable String value) {
			this.metadataPasswordId = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(String value) {
			this.state = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ProjectEncryptionKeyDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ProjectEncryptionKeyDetails build() {
			_checkSingleUse();

			return new ProjectEncryptionKeyDetails(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ProjectEncryptionKeyDetails}
	 */
	public static final JsonpDeserializer<ProjectEncryptionKeyDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ProjectEncryptionKeyDetails::setupProjectEncryptionKeyDetailsDeserializer);

	protected static void setupProjectEncryptionKeyDetailsDeserializer(
			ObjectDeserializer<ProjectEncryptionKeyDetails.Builder> op) {

		op.add(Builder::activeKeyId, JsonpDeserializer.stringDeserializer(), "active_key_id");
		op.add(Builder::activePasswordId, JsonpDeserializer.stringDeserializer(), "active_password_id");
		op.add(Builder::encryptionRequired, JsonpDeserializer.booleanDeserializer(), "encryption_required");
		op.add(Builder::keyCount, JsonpDeserializer.integerDeserializer(), "key_count");
		op.add(Builder::metadataPasswordId, JsonpDeserializer.stringDeserializer(), "metadata_password_id");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");

	}

}
