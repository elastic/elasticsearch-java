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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._core.search.SortOrder;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.HistogramOrder
public final class HistogramOrder implements JsonpSerializable {
	@Nullable
	private final SortOrder count;

	@Nullable
	private final SortOrder key;

	// ---------------------------------------------------------------------------------------------

	public HistogramOrder(Builder builder) {

		this.count = builder.count;
		this.key = builder.key;

	}

	/**
	 * API name: {@code _count}
	 */
	@Nullable
	public SortOrder count() {
		return this.count;
	}

	/**
	 * API name: {@code _key}
	 */
	@Nullable
	public SortOrder key() {
		return this.key;
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

		if (this.count != null) {

			generator.writeKey("_count");
			this.count.serialize(generator, mapper);
		}
		if (this.key != null) {

			generator.writeKey("_key");
			this.key.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HistogramOrder}.
	 */
	public static class Builder implements ObjectBuilder<HistogramOrder> {
		@Nullable
		private SortOrder count;

		@Nullable
		private SortOrder key;

		/**
		 * API name: {@code _count}
		 */
		public Builder count(@Nullable SortOrder value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code _key}
		 */
		public Builder key(@Nullable SortOrder value) {
			this.key = value;
			return this;
		}

		/**
		 * Builds a {@link HistogramOrder}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HistogramOrder build() {

			return new HistogramOrder(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HistogramOrder}
	 */
	public static final JsonpDeserializer<HistogramOrder> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, HistogramOrder::setupHistogramOrderDeserializer);

	protected static void setupHistogramOrderDeserializer(DelegatingDeserializer<HistogramOrder.Builder> op) {

		op.add(Builder::count, SortOrder.DESERIALIZER, "_count");
		op.add(Builder::key, SortOrder.DESERIALIZER, "_key");

	}

}
