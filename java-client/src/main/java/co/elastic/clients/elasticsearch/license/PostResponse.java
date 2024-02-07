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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponse;
import co.elastic.clients.elasticsearch.license.post.Acknowledgement;
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

// typedef: license.post.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#license.post.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PostResponse implements AcknowledgedResponse, JsonpSerializable {
	@Nullable
	private final Acknowledgement acknowledge;

	private final boolean acknowledged;

	private final LicenseStatus licenseStatus;

	// ---------------------------------------------------------------------------------------------

	private PostResponse(Builder builder) {

		this.acknowledge = builder.acknowledge;
		this.acknowledged = ApiTypeHelper.requireNonNull(builder.acknowledged, this, "acknowledged");
		this.licenseStatus = ApiTypeHelper.requireNonNull(builder.licenseStatus, this, "licenseStatus");

	}

	public static PostResponse of(Function<Builder, ObjectBuilder<PostResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code acknowledge}
	 */
	@Nullable
	public final Acknowledgement acknowledge() {
		return this.acknowledge;
	}

	/**
	 * Required - API name: {@code acknowledged}
	 */
	public final boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * Required - API name: {@code license_status}
	 */
	public final LicenseStatus licenseStatus() {
		return this.licenseStatus;
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

		if (this.acknowledge != null) {
			generator.writeKey("acknowledge");
			this.acknowledge.serialize(generator, mapper);

		}
		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		generator.writeKey("license_status");
		this.licenseStatus.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PostResponse> {
		@Nullable
		private Acknowledgement acknowledge;

		private Boolean acknowledged;

		private LicenseStatus licenseStatus;

		/**
		 * API name: {@code acknowledge}
		 */
		public final Builder acknowledge(@Nullable Acknowledgement value) {
			this.acknowledge = value;
			return this;
		}

		/**
		 * API name: {@code acknowledge}
		 */
		public final Builder acknowledge(Function<Acknowledgement.Builder, ObjectBuilder<Acknowledgement>> fn) {
			return this.acknowledge(fn.apply(new Acknowledgement.Builder()).build());
		}

		/**
		 * Required - API name: {@code acknowledged}
		 */
		public final Builder acknowledged(boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * Required - API name: {@code license_status}
		 */
		public final Builder licenseStatus(LicenseStatus value) {
			this.licenseStatus = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostResponse build() {
			_checkSingleUse();

			return new PostResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostResponse}
	 */
	public static final JsonpDeserializer<PostResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PostResponse::setupPostResponseDeserializer);

	protected static void setupPostResponseDeserializer(ObjectDeserializer<PostResponse.Builder> op) {

		op.add(Builder::acknowledge, Acknowledgement._DESERIALIZER, "acknowledge");
		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::licenseStatus, LicenseStatus._DESERIALIZER, "license_status");

	}

}
