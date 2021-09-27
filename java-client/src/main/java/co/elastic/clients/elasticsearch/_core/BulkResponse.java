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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.elasticsearch._core.bulk.ResponseItem;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.bulk.Response
@JsonpDeserializable
public final class BulkResponse implements JsonpSerializable {
	private final boolean errors;

	private final List<ResponseItem> items;

	private final long took;

	@Nullable
	private final Long ingestTook;

	// ---------------------------------------------------------------------------------------------

	public BulkResponse(Builder builder) {

		this.errors = Objects.requireNonNull(builder.errors, "errors");
		this.items = Objects.requireNonNull(builder.items, "items");
		this.took = Objects.requireNonNull(builder.took, "took");
		this.ingestTook = builder.ingestTook;

	}

	/**
	 * API name: {@code errors}
	 */
	public boolean errors() {
		return this.errors;
	}

	/**
	 * API name: {@code items}
	 */
	public List<ResponseItem> items() {
		return this.items;
	}

	/**
	 * API name: {@code took}
	 */
	public long took() {
		return this.took;
	}

	/**
	 * API name: {@code ingest_took}
	 */
	@Nullable
	public Long ingestTook() {
		return this.ingestTook;
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

		generator.writeKey("errors");
		generator.write(this.errors);

		generator.writeKey("items");
		generator.writeStartArray();
		for (ResponseItem item0 : this.items) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("took");
		generator.write(this.took);

		if (this.ingestTook != null) {

			generator.writeKey("ingest_took");
			generator.write(this.ingestTook);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkResponse}.
	 */
	public static class Builder implements ObjectBuilder<BulkResponse> {
		private Boolean errors;

		private List<ResponseItem> items;

		private Long took;

		@Nullable
		private Long ingestTook;

		/**
		 * API name: {@code errors}
		 */
		public Builder errors(boolean value) {
			this.errors = value;
			return this;
		}

		/**
		 * API name: {@code items}
		 */
		public Builder items(List<ResponseItem> value) {
			this.items = value;
			return this;
		}

		/**
		 * API name: {@code items}
		 */
		public Builder items(ResponseItem... value) {
			this.items = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #items(List)}, creating the list if needed.
		 */
		public Builder addItems(ResponseItem value) {
			if (this.items == null) {
				this.items = new ArrayList<>();
			}
			this.items.add(value);
			return this;
		}

		/**
		 * Set {@link #items(List)} to a singleton list.
		 */
		public Builder items(Function<ResponseItem.Builder, ObjectBuilder<ResponseItem>> fn) {
			return this.items(fn.apply(new ResponseItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #items(List)}, creating the list if needed.
		 */
		public Builder addItems(Function<ResponseItem.Builder, ObjectBuilder<ResponseItem>> fn) {
			return this.addItems(fn.apply(new ResponseItem.Builder()).build());
		}

		/**
		 * API name: {@code took}
		 */
		public Builder took(long value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code ingest_took}
		 */
		public Builder ingestTook(@Nullable Long value) {
			this.ingestTook = value;
			return this;
		}

		/**
		 * Builds a {@link BulkResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkResponse build() {

			return new BulkResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkResponse}
	 */
	public static final JsonpDeserializer<BulkResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BulkResponse::setupBulkResponseDeserializer, Builder::build);

	protected static void setupBulkResponseDeserializer(DelegatingDeserializer<BulkResponse.Builder> op) {

		op.add(Builder::errors, JsonpDeserializer.booleanDeserializer(), "errors");
		op.add(Builder::items, JsonpDeserializer.arrayDeserializer(ResponseItem._DESERIALIZER), "items");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::ingestTook, JsonpDeserializer.longDeserializer(), "ingest_took");

	}

}
