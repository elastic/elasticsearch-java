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

package co.elastic.clients.elasticsearch.project;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
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

// typedef: project.tags.Request

/**
 * Get tags.
 * <p>
 * Get the tags that are defined for the project.
 * 
 * @see <a href="../doc-files/api-spec.html#project.tags.Request">API
 *      specification</a>
 */

public class TagsRequest extends RequestBase {
	@Nullable
	private final String projectRouting;

	// ---------------------------------------------------------------------------------------------

	private TagsRequest(Builder builder) {

		this.projectRouting = builder.projectRouting;

	}

	public static TagsRequest of(Function<Builder, ObjectBuilder<TagsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A Lucene query using project metadata tags used to filter which projects are
	 * returned in the response, such as _alias:_origin or _alias:<em>pr</em>.
	 * <p>
	 * API name: {@code project_routing}
	 */
	@Nullable
	public final String projectRouting() {
		return this.projectRouting;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TagsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<TagsRequest> {
		@Nullable
		private String projectRouting;

		public Builder() {
		}
		private Builder(TagsRequest instance) {
			this.projectRouting = instance.projectRouting;

		}
		/**
		 * A Lucene query using project metadata tags used to filter which projects are
		 * returned in the response, such as _alias:_origin or _alias:<em>pr</em>.
		 * <p>
		 * API name: {@code project_routing}
		 */
		public final Builder projectRouting(@Nullable String value) {
			this.projectRouting = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TagsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TagsRequest build() {
			_checkSingleUse();

			return new TagsRequest(this);
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
	 * Endpoint "{@code project.tags}".
	 */
	public static final Endpoint<TagsRequest, TagsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/project.tags",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_project/tags";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.projectRouting != null) {
					params.put("project_routing", request.projectRouting);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, TagsResponse._DESERIALIZER);
}
