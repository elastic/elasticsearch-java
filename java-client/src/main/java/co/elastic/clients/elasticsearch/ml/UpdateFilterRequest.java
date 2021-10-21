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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.update_filter.Request
@JsonpDeserializable
public final class UpdateFilterRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final List<String> addItems;

	@Nullable
	private final String description;

	private final String filterId;

	@Nullable
	private final List<String> removeItems;

	// ---------------------------------------------------------------------------------------------

	public UpdateFilterRequest(Builder builder) {

		this.addItems = ModelTypeHelper.unmodifiable(builder.addItems);
		this.description = builder.description;
		this.filterId = Objects.requireNonNull(builder.filterId, "filter_id");
		this.removeItems = ModelTypeHelper.unmodifiable(builder.removeItems);

	}

	public UpdateFilterRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code add_items}
	 */
	@Nullable
	public List<String> addItems() {
		return this.addItems;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * Required - The ID of the filter to update
	 * <p>
	 * API name: {@code filter_id}
	 */
	public String filterId() {
		return this.filterId;
	}

	/**
	 * API name: {@code remove_items}
	 */
	@Nullable
	public List<String> removeItems() {
		return this.removeItems;
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

		if (this.addItems != null) {

			generator.writeKey("add_items");
			generator.writeStartArray();
			for (String item0 : this.addItems) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.removeItems != null) {

			generator.writeKey("remove_items");
			generator.writeStartArray();
			for (String item0 : this.removeItems) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateFilterRequest}.
	 */
	public static class Builder implements ObjectBuilder<UpdateFilterRequest> {
		@Nullable
		private List<String> addItems;

		@Nullable
		private String description;

		private String filterId;

		@Nullable
		private List<String> removeItems;

		/**
		 * API name: {@code add_items}
		 */
		public Builder addItems(@Nullable List<String> value) {
			this.addItems = value;
			return this;
		}

		/**
		 * API name: {@code add_items}
		 */
		public Builder addItems(String... value) {
			this.addItems = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #addItems(List)}, creating the list if needed.
		 */
		public Builder addAddItems(String value) {
			if (this.addItems == null) {
				this.addItems = new ArrayList<>();
			}
			this.addItems.add(value);
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
		 * Required - The ID of the filter to update
		 * <p>
		 * API name: {@code filter_id}
		 */
		public Builder filterId(String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * API name: {@code remove_items}
		 */
		public Builder removeItems(@Nullable List<String> value) {
			this.removeItems = value;
			return this;
		}

		/**
		 * API name: {@code remove_items}
		 */
		public Builder removeItems(String... value) {
			this.removeItems = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #removeItems(List)}, creating the list if needed.
		 */
		public Builder addRemoveItems(String value) {
			if (this.removeItems == null) {
				this.removeItems = new ArrayList<>();
			}
			this.removeItems.add(value);
			return this;
		}

		/**
		 * Builds a {@link UpdateFilterRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateFilterRequest build() {

			return new UpdateFilterRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateFilterRequest}
	 */
	public static final JsonpDeserializer<UpdateFilterRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateFilterRequest::setupUpdateFilterRequestDeserializer, Builder::build);

	protected static void setupUpdateFilterRequestDeserializer(DelegatingDeserializer<UpdateFilterRequest.Builder> op) {

		op.add(Builder::addItems, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"add_items");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::removeItems, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"remove_items");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.update_filter}".
	 */
	public static final Endpoint<UpdateFilterRequest, UpdateFilterResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _filterId = 1 << 0;

				int propsSet = 0;

				propsSet |= _filterId;

				if (propsSet == (_filterId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/filters");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.filterId, buf);
					buf.append("/_update");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, UpdateFilterResponse._DESERIALIZER);
}
