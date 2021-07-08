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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import javax.annotation.Nullable;

// typedef: _types.aggregations.HistogramOrder
public final class HistogramOrder implements ToJsonp {
	@Nullable
	private final JsonValue _count;

	@Nullable
	private final JsonValue _key;

	// ---------------------------------------------------------------------------------------------

	protected HistogramOrder(Builder builder) {

		this._count = builder._count;
		this._key = builder._key;

	}

	/**
	 * API name: {@code _count}
	 */
	@Nullable
	public JsonValue _count() {
		return this._count;
	}

	/**
	 * API name: {@code _key}
	 */
	@Nullable
	public JsonValue _key() {
		return this._key;
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

		if (this._count != null) {

			generator.writeKey("_count");
			generator.write(this._count);

		}
		if (this._key != null) {

			generator.writeKey("_key");
			generator.write(this._key);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HistogramOrder}.
	 */
	public static class Builder implements ObjectBuilder<HistogramOrder> {
		@Nullable
		private JsonValue _count;

		@Nullable
		private JsonValue _key;

		/**
		 * API name: {@code _count}
		 */
		public Builder _count(@Nullable JsonValue value) {
			this._count = value;
			return this;
		}

		/**
		 * API name: {@code _key}
		 */
		public Builder _key(@Nullable JsonValue value) {
			this._key = value;
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
	 * Json deserializer for HistogramOrder
	 */
	public static final JsonpDeserializer<HistogramOrder> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, HistogramOrder::setupHistogramOrderDeserializer);

	protected static void setupHistogramOrderDeserializer(DelegatingDeserializer<HistogramOrder.Builder> op) {

		op.add(Builder::_count, JsonpDeserializer.jsonValueDeserializer(), "_count");
		op.add(Builder::_key, JsonpDeserializer.jsonValueDeserializer(), "_key");

	}

}
