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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.elasticsearch._global.bulk.ResponseItemContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.bulk.Response
public final class BulkResponse implements ToJsonp {
	private final Boolean errors;

	private final List<ResponseItemContainer> items;

	private final Number took;

	@Nullable
	private final Number ingestTook;

	// ---------------------------------------------------------------------------------------------

	protected BulkResponse(Builder builder) {

		this.errors = Objects.requireNonNull(builder.errors, "errors");
		this.items = Objects.requireNonNull(builder.items, "items");
		this.took = Objects.requireNonNull(builder.took, "took");
		this.ingestTook = builder.ingestTook;

	}

	/**
	 * API name: {@code errors}
	 */
	public Boolean errors() {
		return this.errors;
	}

	/**
	 * API name: {@code items}
	 */
	public List<ResponseItemContainer> items() {
		return this.items;
	}

	/**
	 * API name: {@code took}
	 */
	public Number took() {
		return this.took;
	}

	/**
	 * API name: {@code ingest_took}
	 */
	@Nullable
	public Number ingestTook() {
		return this.ingestTook;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("errors");
		generator.write(this.errors);

		generator.writeKey("items");
		generator.writeStartArray();
		for (ResponseItemContainer item0 : this.items) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("took");
		generator.write(this.took.doubleValue());

		if (this.ingestTook != null) {

			generator.writeKey("ingest_took");
			generator.write(this.ingestTook.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkResponse}.
	 */
	public static class Builder implements ObjectBuilder<BulkResponse> {
		private Boolean errors;

		private List<ResponseItemContainer> items;

		private Number took;

		@Nullable
		private Number ingestTook;

		/**
		 * API name: {@code errors}
		 */
		public Builder errors(Boolean value) {
			this.errors = value;
			return this;
		}

		/**
		 * API name: {@code items}
		 */
		public Builder items(List<ResponseItemContainer> value) {
			this.items = value;
			return this;
		}

		/**
		 * API name: {@code items}
		 */
		public Builder items(ResponseItemContainer... value) {
			this.items = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #items(List)}, creating the list if needed.
		 */
		public Builder addItems(ResponseItemContainer value) {
			if (this.items == null) {
				this.items = new ArrayList<>();
			}
			this.items.add(value);
			return this;
		}

		/**
		 * Set {@link #items(List)} to a singleton list.
		 */
		public Builder items(Function<ResponseItemContainer.Builder, ObjectBuilder<ResponseItemContainer>> fn) {
			return this.items(fn.apply(new ResponseItemContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #items(List)}, creating the list if needed.
		 */
		public Builder addItems(Function<ResponseItemContainer.Builder, ObjectBuilder<ResponseItemContainer>> fn) {
			return this.addItems(fn.apply(new ResponseItemContainer.Builder()).build());
		}

		/**
		 * API name: {@code took}
		 */
		public Builder took(Number value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code ingest_took}
		 */
		public Builder ingestTook(@Nullable Number value) {
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
	 * Json deserializer for BulkResponse
	 */
	public static final JsonpDeserializer<BulkResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, BulkResponse::setupBulkResponseDeserializer);

	protected static void setupBulkResponseDeserializer(DelegatingDeserializer<BulkResponse.Builder> op) {

		op.add(Builder::errors, JsonpDeserializer.booleanDeserializer(), "errors");
		op.add(Builder::items, JsonpDeserializer.arrayDeserializer(ResponseItemContainer.DESERIALIZER), "items");
		op.add(Builder::took, JsonpDeserializer.numberDeserializer(), "took");
		op.add(Builder::ingestTook, JsonpDeserializer.numberDeserializer(), "ingest_took");

	}

}
