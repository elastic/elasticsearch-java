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

package co.elastic.clients.elasticsearch.connector;

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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
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

// typedef: connector.post.Request

/**
 * Creates a connector.
 * 
 * @see <a href="../doc-files/api-spec.html#connector.post.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PostRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String description;

	@Nullable
	private final String indexName;

	@Nullable
	private final Boolean isNative;

	@Nullable
	private final String language;

	@Nullable
	private final String name;

	@Nullable
	private final String serviceType;

	// ---------------------------------------------------------------------------------------------

	private PostRequest(Builder builder) {

		this.description = builder.description;
		this.indexName = builder.indexName;
		this.isNative = builder.isNative;
		this.language = builder.language;
		this.name = builder.name;
		this.serviceType = builder.serviceType;

	}

	public static PostRequest of(Function<Builder, ObjectBuilder<PostRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code index_name}
	 */
	@Nullable
	public final String indexName() {
		return this.indexName;
	}

	/**
	 * API name: {@code is_native}
	 */
	@Nullable
	public final Boolean isNative() {
		return this.isNative;
	}

	/**
	 * API name: {@code language}
	 */
	@Nullable
	public final String language() {
		return this.language;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code service_type}
	 */
	@Nullable
	public final String serviceType() {
		return this.serviceType;
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

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.indexName != null) {
			generator.writeKey("index_name");
			generator.write(this.indexName);

		}
		if (this.isNative != null) {
			generator.writeKey("is_native");
			generator.write(this.isNative);

		}
		if (this.language != null) {
			generator.writeKey("language");
			generator.write(this.language);

		}
		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.serviceType != null) {
			generator.writeKey("service_type");
			generator.write(this.serviceType);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PostRequest> {
		@Nullable
		private String description;

		@Nullable
		private String indexName;

		@Nullable
		private Boolean isNative;

		@Nullable
		private String language;

		@Nullable
		private String name;

		@Nullable
		private String serviceType;

		/**
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code index_name}
		 */
		public final Builder indexName(@Nullable String value) {
			this.indexName = value;
			return this;
		}

		/**
		 * API name: {@code is_native}
		 */
		public final Builder isNative(@Nullable Boolean value) {
			this.isNative = value;
			return this;
		}

		/**
		 * API name: {@code language}
		 */
		public final Builder language(@Nullable String value) {
			this.language = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code service_type}
		 */
		public final Builder serviceType(@Nullable String value) {
			this.serviceType = value;
			return this;
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

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::indexName, JsonpDeserializer.stringDeserializer(), "index_name");
		op.add(Builder::isNative, JsonpDeserializer.booleanDeserializer(), "is_native");
		op.add(Builder::language, JsonpDeserializer.stringDeserializer(), "language");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::serviceType, JsonpDeserializer.stringDeserializer(), "service_type");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.post}".
	 */
	public static final Endpoint<PostRequest, PostResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.post",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_connector";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PostResponse._DESERIALIZER);
}
