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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.update_filter.Request

/**
 * Updates the description of a filter, adds items, or removes items from the
 * list.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.update_filter.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateFilterRequest extends RequestBase implements JsonpSerializable {
	private final List<String> addItems;

	@Nullable
	private final String description;

	private final String filterId;

	private final List<String> removeItems;

	// ---------------------------------------------------------------------------------------------

	private UpdateFilterRequest(Builder builder) {

		this.addItems = ApiTypeHelper.unmodifiable(builder.addItems);
		this.description = builder.description;
		this.filterId = ApiTypeHelper.requireNonNull(builder.filterId, this, "filterId");
		this.removeItems = ApiTypeHelper.unmodifiable(builder.removeItems);

	}

	public static UpdateFilterRequest of(Function<Builder, ObjectBuilder<UpdateFilterRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The items to add to the filter.
	 * <p>
	 * API name: {@code add_items}
	 */
	public final List<String> addItems() {
		return this.addItems;
	}

	/**
	 * A description for the filter.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - A string that uniquely identifies a filter.
	 * <p>
	 * API name: {@code filter_id}
	 */
	public final String filterId() {
		return this.filterId;
	}

	/**
	 * The items to remove from the filter.
	 * <p>
	 * API name: {@code remove_items}
	 */
	public final List<String> removeItems() {
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

		if (ApiTypeHelper.isDefined(this.addItems)) {
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
		if (ApiTypeHelper.isDefined(this.removeItems)) {
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

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateFilterRequest> {
		@Nullable
		private List<String> addItems;

		@Nullable
		private String description;

		private String filterId;

		@Nullable
		private List<String> removeItems;

		/**
		 * The items to add to the filter.
		 * <p>
		 * API name: {@code add_items}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>addItems</code>.
		 */
		public final Builder addItems(List<String> list) {
			this.addItems = _listAddAll(this.addItems, list);
			return this;
		}

		/**
		 * The items to add to the filter.
		 * <p>
		 * API name: {@code add_items}
		 * <p>
		 * Adds one or more values to <code>addItems</code>.
		 */
		public final Builder addItems(String value, String... values) {
			this.addItems = _listAdd(this.addItems, value, values);
			return this;
		}

		/**
		 * A description for the filter.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - A string that uniquely identifies a filter.
		 * <p>
		 * API name: {@code filter_id}
		 */
		public final Builder filterId(String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * The items to remove from the filter.
		 * <p>
		 * API name: {@code remove_items}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>removeItems</code>.
		 */
		public final Builder removeItems(List<String> list) {
			this.removeItems = _listAddAll(this.removeItems, list);
			return this;
		}

		/**
		 * The items to remove from the filter.
		 * <p>
		 * API name: {@code remove_items}
		 * <p>
		 * Adds one or more values to <code>removeItems</code>.
		 */
		public final Builder removeItems(String value, String... values) {
			this.removeItems = _listAdd(this.removeItems, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateFilterRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateFilterRequest build() {
			_checkSingleUse();

			return new UpdateFilterRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateFilterRequest}
	 */
	public static final JsonpDeserializer<UpdateFilterRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateFilterRequest::setupUpdateFilterRequestDeserializer);

	protected static void setupUpdateFilterRequestDeserializer(ObjectDeserializer<UpdateFilterRequest.Builder> op) {

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
	public static final Endpoint<UpdateFilterRequest, UpdateFilterResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.update_filter",

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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _filterId = 1 << 0;

				int propsSet = 0;

				propsSet |= _filterId;

				if (propsSet == (_filterId)) {
					params.put("filterId", request.filterId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, UpdateFilterResponse._DESERIALIZER);
}
