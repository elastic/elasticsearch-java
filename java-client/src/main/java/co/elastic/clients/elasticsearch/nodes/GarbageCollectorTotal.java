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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes._types.GarbageCollectorTotal
public final class GarbageCollectorTotal implements ToJsonp {
	private final Number collectionCount;

	private final String collectionTime;

	private final Number collectionTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	protected GarbageCollectorTotal(Builder builder) {

		this.collectionCount = Objects.requireNonNull(builder.collectionCount, "collection_count");
		this.collectionTime = Objects.requireNonNull(builder.collectionTime, "collection_time");
		this.collectionTimeInMillis = Objects.requireNonNull(builder.collectionTimeInMillis,
				"collection_time_in_millis");

	}

	/**
	 * API name: {@code collection_count}
	 */
	public Number collectionCount() {
		return this.collectionCount;
	}

	/**
	 * API name: {@code collection_time}
	 */
	public String collectionTime() {
		return this.collectionTime;
	}

	/**
	 * API name: {@code collection_time_in_millis}
	 */
	public Number collectionTimeInMillis() {
		return this.collectionTimeInMillis;
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

		generator.writeKey("collection_count");
		generator.write(this.collectionCount.doubleValue());

		generator.writeKey("collection_time");
		generator.write(this.collectionTime);

		generator.writeKey("collection_time_in_millis");
		generator.write(this.collectionTimeInMillis.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GarbageCollectorTotal}.
	 */
	public static class Builder implements ObjectBuilder<GarbageCollectorTotal> {
		private Number collectionCount;

		private String collectionTime;

		private Number collectionTimeInMillis;

		/**
		 * API name: {@code collection_count}
		 */
		public Builder collectionCount(Number value) {
			this.collectionCount = value;
			return this;
		}

		/**
		 * API name: {@code collection_time}
		 */
		public Builder collectionTime(String value) {
			this.collectionTime = value;
			return this;
		}

		/**
		 * API name: {@code collection_time_in_millis}
		 */
		public Builder collectionTimeInMillis(Number value) {
			this.collectionTimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link GarbageCollectorTotal}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GarbageCollectorTotal build() {

			return new GarbageCollectorTotal(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GarbageCollectorTotal
	 */
	public static final JsonpDeserializer<GarbageCollectorTotal> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GarbageCollectorTotal::setupGarbageCollectorTotalDeserializer);

	protected static void setupGarbageCollectorTotalDeserializer(
			DelegatingDeserializer<GarbageCollectorTotal.Builder> op) {

		op.add(Builder::collectionCount, JsonpDeserializer.numberDeserializer(), "collection_count");
		op.add(Builder::collectionTime, JsonpDeserializer.stringDeserializer(), "collection_time");
		op.add(Builder::collectionTimeInMillis, JsonpDeserializer.numberDeserializer(), "collection_time_in_millis");

	}

}
