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
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_filter.Request
@JsonpDeserializable
public class PutFilterRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String description;

	private final String filterId;

	private final List<String> items;

	// ---------------------------------------------------------------------------------------------

	private PutFilterRequest(Builder builder) {

		this.description = builder.description;
		this.filterId = ModelTypeHelper.requireNonNull(builder.filterId, this, "filterId");
		this.items = ModelTypeHelper.unmodifiable(builder.items);

	}

	public static PutFilterRequest of(Function<Builder, ObjectBuilder<PutFilterRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A description of the filter.
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
	 * The items of the filter. A wildcard <code>*</code> can be used at the
	 * beginning or the end of an item. Up to 10000 items are allowed in each
	 * filter.
	 * <p>
	 * API name: {@code items}
	 */
	public final List<String> items() {
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
		if (ModelTypeHelper.isDefined(this.items)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutFilterRequest> {
		@Nullable
		private String description;

		private String filterId;

		@Nullable
		private List<String> items;

		/**
		 * A description of the filter.
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
		 * The items of the filter. A wildcard <code>*</code> can be used at the
		 * beginning or the end of an item. Up to 10000 items are allowed in each
		 * filter.
		 * <p>
		 * API name: {@code items}
		 */
		public final Builder items(@Nullable List<String> value) {
			this.items = value;
			return this;
		}

		/**
		 * The items of the filter. A wildcard <code>*</code> can be used at the
		 * beginning or the end of an item. Up to 10000 items are allowed in each
		 * filter.
		 * <p>
		 * API name: {@code items}
		 */
		public final Builder items(String... value) {
			this.items = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link PutFilterRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutFilterRequest build() {
			_checkSingleUse();

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
	public static final Endpoint<PutFilterRequest, PutFilterResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

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
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutFilterResponse._DESERIALIZER);
}
