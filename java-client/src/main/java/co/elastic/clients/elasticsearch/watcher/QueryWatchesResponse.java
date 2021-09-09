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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.query_watches.Response
public final class QueryWatchesResponse implements ToJsonp {
	private final Number count;

	private final List<QueryWatch> watches;

	// ---------------------------------------------------------------------------------------------

	protected QueryWatchesResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.watches = Objects.requireNonNull(builder.watches, "watches");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code watches}
	 */
	public List<QueryWatch> watches() {
		return this.watches;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("watches");
		generator.writeStartArray();
		for (QueryWatch item0 : this.watches) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryWatchesResponse}.
	 */
	public static class Builder implements ObjectBuilder<QueryWatchesResponse> {
		private Number count;

		private List<QueryWatch> watches;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code watches}
		 */
		public Builder watches(List<QueryWatch> value) {
			this.watches = value;
			return this;
		}

		/**
		 * API name: {@code watches}
		 */
		public Builder watches(QueryWatch... value) {
			this.watches = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #watches(List)}, creating the list if needed.
		 */
		public Builder addWatches(QueryWatch value) {
			if (this.watches == null) {
				this.watches = new ArrayList<>();
			}
			this.watches.add(value);
			return this;
		}

		/**
		 * Set {@link #watches(List)} to a singleton list.
		 */
		public Builder watches(Function<QueryWatch.Builder, ObjectBuilder<QueryWatch>> fn) {
			return this.watches(fn.apply(new QueryWatch.Builder()).build());
		}

		/**
		 * Add a value to {@link #watches(List)}, creating the list if needed.
		 */
		public Builder addWatches(Function<QueryWatch.Builder, ObjectBuilder<QueryWatch>> fn) {
			return this.addWatches(fn.apply(new QueryWatch.Builder()).build());
		}

		/**
		 * Builds a {@link QueryWatchesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryWatchesResponse build() {

			return new QueryWatchesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for QueryWatchesResponse
	 */
	public static final JsonpDeserializer<QueryWatchesResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, QueryWatchesResponse::setupQueryWatchesResponseDeserializer);

	protected static void setupQueryWatchesResponseDeserializer(
			DelegatingDeserializer<QueryWatchesResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::watches, JsonpDeserializer.arrayDeserializer(QueryWatch.DESERIALIZER), "watches");

	}

}
