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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.post.Request
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
		this.licenses = ModelTypeHelper.unmodifiable(builder.licenses);

	}

	public static PostRequest of(Function<Builder, ObjectBuilder<PostRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * whether the user has acknowledged acknowledge messages (default: false)
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
		if (ModelTypeHelper.isDefined(this.licenses)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PostRequest> {
		@Nullable
		private Boolean acknowledge;

		@Nullable
		private License license;

		@Nullable
		private List<License> licenses;

		/**
		 * whether the user has acknowledged acknowledge messages (default: false)
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
		 * API name: {@code licenses}
		 */
		public final Builder licenses(@Nullable List<License> value) {
			this.licenses = value;
			return this;
		}

		/**
		 * API name: {@code licenses}
		 */
		public final Builder licenses(License... value) {
			this.licenses = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code licenses}
		 */
		@SafeVarargs
		public final Builder licenses(Function<License.Builder, ObjectBuilder<License>>... fns) {
			this.licenses = new ArrayList<>(fns.length);
			for (Function<License.Builder, ObjectBuilder<License>> fn : fns) {
				this.licenses.add(fn.apply(new License.Builder()).build());
			}
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
			PostRequest::setupPostRequestDeserializer, Builder::build);

	protected static void setupPostRequestDeserializer(DelegatingDeserializer<PostRequest.Builder> op) {

		op.add(Builder::license, License._DESERIALIZER, "license");
		op.add(Builder::licenses, JsonpDeserializer.arrayDeserializer(License._DESERIALIZER), "licenses");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code license.post}".
	 */
	public static final Endpoint<PostRequest, PostResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_license";

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
