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
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: searchable_snapshots.stats.Response
@JsonpDeserializable
public final class StatsResponse implements JsonpSerializable {
	private final JsonData stats;

	private final JsonData total;

	// ---------------------------------------------------------------------------------------------

	public StatsResponse(Builder builder) {

		this.stats = Objects.requireNonNull(builder.stats, "stats");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	public StatsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public JsonData stats() {
		return this.stats;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public JsonData total() {
		return this.total;
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

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<StatsResponse> {
		private JsonData stats;

		private JsonData total;

		/**
		 * Required - API name: {@code stats}
		 */
		public Builder stats(JsonData value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public Builder total(JsonData value) {
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
	 * Json deserializer for {@link StatsResponse}
	 */
	public static final JsonpDeserializer<StatsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StatsResponse::setupStatsResponseDeserializer, Builder::build);

	protected static void setupStatsResponseDeserializer(DelegatingDeserializer<StatsResponse.Builder> op) {

		op.add(Builder::stats, JsonData._DESERIALIZER, "stats");
		op.add(Builder::total, JsonData._DESERIALIZER, "total");

	}

}
