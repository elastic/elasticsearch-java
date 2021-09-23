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

package co.elastic.clients.elasticsearch.nodes.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.usage.NodeUsage
public final class NodeUsage implements JsonpSerializable {
	private final Map<String, Number> restActions;

	private final JsonValue since;

	private final JsonValue timestamp;

	private final Map<String, JsonData> aggregations;

	// ---------------------------------------------------------------------------------------------

	public NodeUsage(Builder builder) {

		this.restActions = Objects.requireNonNull(builder.restActions, "rest_actions");
		this.since = Objects.requireNonNull(builder.since, "since");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.aggregations = Objects.requireNonNull(builder.aggregations, "aggregations");

	}

	/**
	 * API name: {@code rest_actions}
	 */
	public Map<String, Number> restActions() {
		return this.restActions;
	}

	/**
	 * API name: {@code since}
	 */
	public JsonValue since() {
		return this.since;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public JsonValue timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code aggregations}
	 */
	public Map<String, JsonData> aggregations() {
		return this.aggregations;
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

		generator.writeKey("rest_actions");
		generator.writeStartObject();
		for (Map.Entry<String, Number> item0 : this.restActions.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue().doubleValue());

		}
		generator.writeEnd();

		generator.writeKey("since");
		generator.write(this.since);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("aggregations");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.aggregations.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeUsage}.
	 */
	public static class Builder implements ObjectBuilder<NodeUsage> {
		private Map<String, Number> restActions;

		private JsonValue since;

		private JsonValue timestamp;

		private Map<String, JsonData> aggregations;

		/**
		 * API name: {@code rest_actions}
		 */
		public Builder restActions(Map<String, Number> value) {
			this.restActions = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #restActions(Map)}, creating the map if needed.
		 */
		public Builder putRestActions(String key, Number value) {
			if (this.restActions == null) {
				this.restActions = new HashMap<>();
			}
			this.restActions.put(key, value);
			return this;
		}

		/**
		 * API name: {@code since}
		 */
		public Builder since(JsonValue value) {
			this.since = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(JsonValue value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code aggregations}
		 */
		public Builder aggregations(Map<String, JsonData> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, JsonData value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link NodeUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeUsage build() {

			return new NodeUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeUsage}
	 */
	public static final JsonpDeserializer<NodeUsage> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeUsage::setupNodeUsageDeserializer);

	protected static void setupNodeUsageDeserializer(DelegatingDeserializer<NodeUsage.Builder> op) {

		op.add(Builder::restActions, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.numberDeserializer()),
				"rest_actions");
		op.add(Builder::since, JsonpDeserializer.jsonValueDeserializer(), "since");
		op.add(Builder::timestamp, JsonpDeserializer.jsonValueDeserializer(), "timestamp");
		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "aggregations");

	}

}
