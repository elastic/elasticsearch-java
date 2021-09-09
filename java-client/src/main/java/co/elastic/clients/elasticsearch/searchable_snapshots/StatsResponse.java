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

package co.elastic.clients.elasticsearch.searchable_snapshots;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: searchable_snapshots.stats.Response
public final class StatsResponse implements ToJsonp {
	private final JsonValue stats;

	private final JsonValue total;

	// ---------------------------------------------------------------------------------------------

	protected StatsResponse(Builder builder) {

		this.stats = Objects.requireNonNull(builder.stats, "stats");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	/**
	 * API name: {@code stats}
	 */
	public JsonValue stats() {
		return this.stats;
	}

	/**
	 * API name: {@code total}
	 */
	public JsonValue total() {
		return this.total;
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

		generator.writeKey("stats");
		generator.write(this.stats);

		generator.writeKey("total");
		generator.write(this.total);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<StatsResponse> {
		private JsonValue stats;

		private JsonValue total;

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(JsonValue value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(JsonValue value) {
			this.total = value;
			return this;
		}

		/**
		 * Builds a {@link StatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatsResponse build() {

			return new StatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for StatsResponse
	 */
	public static final JsonpDeserializer<StatsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StatsResponse::setupStatsResponseDeserializer);

	protected static void setupStatsResponseDeserializer(DelegatingDeserializer<StatsResponse.Builder> op) {

		op.add(Builder::stats, JsonpDeserializer.jsonValueDeserializer(), "stats");
		op.add(Builder::total, JsonpDeserializer.jsonValueDeserializer(), "total");

	}

}
