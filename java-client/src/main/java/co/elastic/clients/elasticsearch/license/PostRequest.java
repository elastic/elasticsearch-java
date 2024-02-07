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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
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
import java.lang.Boolean;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

// typedef: license.post.Request

/**
 * Updates the license for the cluster.
 * 
 * @see <a href="../doc-files/api-spec.html#license.post.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PostRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean acknowledge;

	@Nullable
	private final License license;

	private final List<License> licenses;

	// ---------------------------------------------------------------------------------------------

	private PostRequest(Builder builder) {

		this.acknowledge = builder.acknowledge;
		this.license = builder.license;
		this.licenses = ApiTypeHelper.unmodifiable(builder.licenses);

	}

	public static PostRequest of(Function<Builder, ObjectBuilder<PostRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies whether you acknowledge the license changes.
	 * <p>
	 * API name: {@code acknowledge}
	 */
	@Nullable
	public final Boolean acknowledge() {
		return this.acknowledge;
	}

	/**
	 * API name: {@code license}
	 */
	@Nullable
	public final License license() {
		return this.license;
	}

	/**
	 * A sequence of one or more JSON documents containing the license information.
	 * <p>
	 * API name: {@code licenses}
	 */
	public final List<License> licenses() {
		return this.licenses;
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

		if (this.license != null) {
			generator.writeKey("license");
			this.license.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.licenses)) {
			generator.writeKey("licenses");
			generator.writeStartArray();
			for (License item0 : this.licenses) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PostRequest> {
		@Nullable
		private Boolean acknowledge;

		@Nullable
		private License license;

		@Nullable
		private List<License> licenses;

		/**
		 * Specifies whether you acknowledge the license changes.
		 * <p>
		 * API name: {@code acknowledge}
		 */
		public final Builder acknowledge(@Nullable Boolean value) {
			this.acknowledge = value;
			return this;
		}

		/**
		 * API name: {@code license}
		 */
		public final Builder license(@Nullable License value) {
			this.license = value;
			return this;
		}

		/**
		 * API name: {@code license}
		 */
		public final Builder license(Function<License.Builder, ObjectBuilder<License>> fn) {
			return this.license(fn.apply(new License.Builder()).build());
		}

		/**
		 * A sequence of one or more JSON documents containing the license information.
		 * <p>
		 * API name: {@code licenses}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>licenses</code>.
		 */
		public final Builder licenses(List<License> list) {
			this.licenses = _listAddAll(this.licenses, list);
			return this;
		}

		/**
		 * A sequence of one or more JSON documents containing the license information.
		 * <p>
		 * API name: {@code licenses}
		 * <p>
		 * Adds one or more values to <code>licenses</code>.
		 */
		public final Builder licenses(License value, License... values) {
			this.licenses = _listAdd(this.licenses, value, values);
			return this;
		}

		/**
		 * A sequence of one or more JSON documents containing the license information.
		 * <p>
		 * API name: {@code licenses}
		 * <p>
		 * Adds a value to <code>licenses</code> using a builder lambda.
		 */
		public final Builder licenses(Function<License.Builder, ObjectBuilder<License>> fn) {
			return licenses(fn.apply(new License.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostRequest build() {
			_checkSingleUse();

			return new PostRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostRequest}
	 */
	public static final JsonpDeserializer<PostRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PostRequest::setupPostRequestDeserializer);

	protected static void setupPostRequestDeserializer(ObjectDeserializer<PostRequest.Builder> op) {

		op.add(Builder::license, License._DESERIALIZER, "license");
		op.add(Builder::licenses, JsonpDeserializer.arrayDeserializer(License._DESERIALIZER), "licenses");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code license.post}".
	 */
	public static final Endpoint<PostRequest, PostResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/license.post",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_license";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.acknowledge != null) {
					params.put("acknowledge", String.valueOf(request.acknowledge));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PostResponse._DESERIALIZER);
}
