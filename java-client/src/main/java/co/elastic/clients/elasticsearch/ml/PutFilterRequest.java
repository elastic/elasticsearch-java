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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.put_filter.Request
@JsonpDeserializable
public final class PutFilterRequest extends RequestBase implements JsonpSerializable {
	private final String filterId;

	@Nullable
	private final String description;

	@Nullable
	private final List<String> items;

	// ---------------------------------------------------------------------------------------------

	public PutFilterRequest(Builder builder) {

		this.filterId = Objects.requireNonNull(builder.filterId, "filter_id");
		this.description = builder.description;
		this.items = builder.items;

	}

	/**
	 * The ID of the filter to create
	 * <p>
	 * API name: {@code filter_id}
	 */
	public String filterId() {
		return this.filterId;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code items}
	 */
	@Nullable
	public List<String> items() {
		return this.items;
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
		if (this.items != null) {

			generator.writeKey("items");
			generator.writeStartArray();
			for (String item0 : this.items) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutFilterRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutFilterRequest> {
		private String filterId;

		@Nullable
		private String description;

		@Nullable
		private List<String> items;

		/**
		 * The ID of the filter to create
		 * <p>
		 * API name: {@code filter_id}
		 */
		public Builder filterId(String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code items}
		 */
		public Builder items(@Nullable List<String> value) {
			this.items = value;
			return this;
		}

		/**
		 * API name: {@code items}
		 */
		public Builder items(String... value) {
			this.items = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #items(List)}, creating the list if needed.
		 */
		public Builder addItems(String value) {
			if (this.items == null) {
				this.items = new ArrayList<>();
			}
			this.items.add(value);
			return this;
		}

		/**
		 * Builds a {@link PutFilterRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutFilterRequest build() {

			return new PutFilterRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutFilterRequest}
	 */
	public static final JsonpDeserializer<PutFilterRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutFilterRequest::setupPutFilterRequestDeserializer, Builder::build);

	protected static void setupPutFilterRequestDeserializer(DelegatingDeserializer<PutFilterRequest.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::items, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "items");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_filter}".
	 */
	public static final Endpoint<PutFilterRequest, PutFilterResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _filterId = 1 << 0;

				int propsSet = 0;

				if (request.filterId() != null)
					propsSet |= _filterId;

				if (propsSet == (_filterId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/filters");
					buf.append("/");
					buf.append(request.filterId);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PutFilterResponse._DESERIALIZER);
}
