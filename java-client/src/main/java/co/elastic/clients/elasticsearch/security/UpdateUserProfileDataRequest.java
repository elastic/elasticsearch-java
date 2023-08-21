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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.update_user_profile_data.Request

/**
 * Updates specific data for the user profile that's associated with the
 * specified unique ID.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.update_user_profile_data.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateUserProfileDataRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, JsonData> data;

	@Nullable
	private final Long ifPrimaryTerm;

	@Nullable
	private final Long ifSeqNo;

	private final Map<String, JsonData> labels;

	@Nullable
	private final Refresh refresh;

	private final String uid;

	// ---------------------------------------------------------------------------------------------

	private UpdateUserProfileDataRequest(Builder builder) {

		this.data = ApiTypeHelper.unmodifiable(builder.data);
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.labels = ApiTypeHelper.unmodifiable(builder.labels);
		this.refresh = builder.refresh;
		this.uid = ApiTypeHelper.requireNonNull(builder.uid, this, "uid");

	}

	public static UpdateUserProfileDataRequest of(Function<Builder, ObjectBuilder<UpdateUserProfileDataRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Non-searchable data that you want to associate with the user profile. This
	 * field supports a nested data structure.
	 * <p>
	 * API name: {@code data}
	 */
	public final Map<String, JsonData> data() {
		return this.data;
	}

	/**
	 * Only perform the operation if the document has this primary term.
	 * <p>
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public final Long ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * Only perform the operation if the document has this sequence number.
	 * <p>
	 * API name: {@code if_seq_no}
	 */
	@Nullable
	public final Long ifSeqNo() {
		return this.ifSeqNo;
	}

	/**
	 * Searchable data that you want to associate with the user profile. This field
	 * supports a nested data structure.
	 * <p>
	 * API name: {@code labels}
	 */
	public final Map<String, JsonData> labels() {
		return this.labels;
	}

	/**
	 * If 'true', Elasticsearch refreshes the affected shards to make this operation
	 * visible to search, if 'wait_for' then wait for a refresh to make this
	 * operation visible to search, if 'false' do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * Required - A unique identifier for the user profile.
	 * <p>
	 * API name: {@code uid}
	 */
	public final String uid() {
		return this.uid;
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

		if (ApiTypeHelper.isDefined(this.data)) {
			generator.writeKey("data");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.data.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.labels)) {
			generator.writeKey("labels");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.labels.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateUserProfileDataRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateUserProfileDataRequest> {
		@Nullable
		private Map<String, JsonData> data;

		@Nullable
		private Long ifPrimaryTerm;

		@Nullable
		private Long ifSeqNo;

		@Nullable
		private Map<String, JsonData> labels;

		@Nullable
		private Refresh refresh;

		private String uid;

		/**
		 * Non-searchable data that you want to associate with the user profile. This
		 * field supports a nested data structure.
		 * <p>
		 * API name: {@code data}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>data</code>.
		 */
		public final Builder data(Map<String, JsonData> map) {
			this.data = _mapPutAll(this.data, map);
			return this;
		}

		/**
		 * Non-searchable data that you want to associate with the user profile. This
		 * field supports a nested data structure.
		 * <p>
		 * API name: {@code data}
		 * <p>
		 * Adds an entry to <code>data</code>.
		 */
		public final Builder data(String key, JsonData value) {
			this.data = _mapPut(this.data, key, value);
			return this;
		}

		/**
		 * Only perform the operation if the document has this primary term.
		 * <p>
		 * API name: {@code if_primary_term}
		 */
		public final Builder ifPrimaryTerm(@Nullable Long value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * Only perform the operation if the document has this sequence number.
		 * <p>
		 * API name: {@code if_seq_no}
		 */
		public final Builder ifSeqNo(@Nullable Long value) {
			this.ifSeqNo = value;
			return this;
		}

		/**
		 * Searchable data that you want to associate with the user profile. This field
		 * supports a nested data structure.
		 * <p>
		 * API name: {@code labels}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>labels</code>.
		 */
		public final Builder labels(Map<String, JsonData> map) {
			this.labels = _mapPutAll(this.labels, map);
			return this;
		}

		/**
		 * Searchable data that you want to associate with the user profile. This field
		 * supports a nested data structure.
		 * <p>
		 * API name: {@code labels}
		 * <p>
		 * Adds an entry to <code>labels</code>.
		 */
		public final Builder labels(String key, JsonData value) {
			this.labels = _mapPut(this.labels, key, value);
			return this;
		}

		/**
		 * If 'true', Elasticsearch refreshes the affected shards to make this operation
		 * visible to search, if 'wait_for' then wait for a refresh to make this
		 * operation visible to search, if 'false' do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Required - A unique identifier for the user profile.
		 * <p>
		 * API name: {@code uid}
		 */
		public final Builder uid(String value) {
			this.uid = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateUserProfileDataRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateUserProfileDataRequest build() {
			_checkSingleUse();

			return new UpdateUserProfileDataRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateUserProfileDataRequest}
	 */
	public static final JsonpDeserializer<UpdateUserProfileDataRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateUserProfileDataRequest::setupUpdateUserProfileDataRequestDeserializer);

	protected static void setupUpdateUserProfileDataRequestDeserializer(
			ObjectDeserializer<UpdateUserProfileDataRequest.Builder> op) {

		op.add(Builder::data, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "data");
		op.add(Builder::labels, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "labels");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.update_user_profile_data}".
	 */
	public static final Endpoint<UpdateUserProfileDataRequest, UpdateUserProfileDataResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.update_user_profile_data",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _uid = 1 << 0;

				int propsSet = 0;

				propsSet |= _uid;

				if (propsSet == (_uid)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/profile");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.uid, buf);
					buf.append("/_data");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _uid = 1 << 0;

				int propsSet = 0;

				propsSet |= _uid;

				if (propsSet == (_uid)) {
					params.put("uid", request.uid);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ifSeqNo != null) {
					params.put("if_seq_no", String.valueOf(request.ifSeqNo));
				}
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", String.valueOf(request.ifPrimaryTerm));
				}
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, UpdateUserProfileDataResponse._DESERIALIZER);
}
