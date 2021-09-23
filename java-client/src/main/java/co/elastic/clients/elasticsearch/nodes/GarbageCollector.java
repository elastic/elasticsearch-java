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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.GarbageCollector
public final class GarbageCollector implements JsonpSerializable {
	private final Map<String, GarbageCollectorTotal> collectors;

	// ---------------------------------------------------------------------------------------------

	public GarbageCollector(Builder builder) {

		this.collectors = Objects.requireNonNull(builder.collectors, "collectors");

	}

	/**
	 * API name: {@code collectors}
	 */
	public Map<String, GarbageCollectorTotal> collectors() {
		return this.collectors;
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

		generator.writeKey("collectors");
		generator.writeStartObject();
		for (Map.Entry<String, GarbageCollectorTotal> item0 : this.collectors.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GarbageCollector}.
	 */
	public static class Builder implements ObjectBuilder<GarbageCollector> {
		private Map<String, GarbageCollectorTotal> collectors;

		/**
		 * API name: {@code collectors}
		 */
		public Builder collectors(Map<String, GarbageCollectorTotal> value) {
			this.collectors = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #collectors(Map)}, creating the map if needed.
		 */
		public Builder putCollectors(String key, GarbageCollectorTotal value) {
			if (this.collectors == null) {
				this.collectors = new HashMap<>();
			}
			this.collectors.put(key, value);
			return this;
		}

		/**
		 * Set {@link #collectors(Map)} to a singleton map.
		 */
		public Builder collectors(String key,
				Function<GarbageCollectorTotal.Builder, ObjectBuilder<GarbageCollectorTotal>> fn) {
			return this
					.collectors(Collections.singletonMap(key, fn.apply(new GarbageCollectorTotal.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #collectors(Map)}, creating the map if needed.
		 */
		public Builder putCollectors(String key,
				Function<GarbageCollectorTotal.Builder, ObjectBuilder<GarbageCollectorTotal>> fn) {
			return this.putCollectors(key, fn.apply(new GarbageCollectorTotal.Builder()).build());
		}

		/**
		 * Builds a {@link GarbageCollector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GarbageCollector build() {

			return new GarbageCollector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GarbageCollector}
	 */
	public static final JsonpDeserializer<GarbageCollector> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GarbageCollector::setupGarbageCollectorDeserializer);

	protected static void setupGarbageCollectorDeserializer(DelegatingDeserializer<GarbageCollector.Builder> op) {

		op.add(Builder::collectors, JsonpDeserializer.stringMapDeserializer(GarbageCollectorTotal.DESERIALIZER),
				"collectors");

	}

}
