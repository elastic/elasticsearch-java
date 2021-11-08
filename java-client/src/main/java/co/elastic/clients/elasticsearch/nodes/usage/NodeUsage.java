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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.usage.NodeUsage
@JsonpDeserializable
public class NodeUsage implements JsonpSerializable {
	private final Map<String, Integer> restActions;

	private final String since;

	private final String timestamp;

	private final Map<String, JsonData> aggregations;

	// ---------------------------------------------------------------------------------------------

	private NodeUsage(Builder builder) {

		this.restActions = ModelTypeHelper.unmodifiableRequired(builder.restActions, this, "restActions");
		this.since = ModelTypeHelper.requireNonNull(builder.since, this, "since");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.aggregations = ModelTypeHelper.unmodifiableRequired(builder.aggregations, this, "aggregations");

	}

	public static NodeUsage of(Function<Builder, ObjectBuilder<NodeUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code rest_actions}
	 */
	public final Map<String, Integer> restActions() {
		return this.restActions;
	}

	/**
	 * Required - API name: {@code since}
	 */
	public final String since() {
		return this.since;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final String timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - API name: {@code aggregations}
	 */
	public final Map<String, JsonData> aggregations() {
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

		if (ModelTypeHelper.isDefined(this.restActions)) {
			generator.writeKey("rest_actions");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.restActions.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("since");
		generator.write(this.since);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		if (ModelTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeUsage}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeUsage> {
		private Map<String, Integer> restActions;

		private String since;

		private String timestamp;

		private Map<String, JsonData> aggregations;

		/**
		 * Required - API name: {@code rest_actions}
		 */
		public final Builder restActions(Map<String, Integer> value) {
			this.restActions = value;
			return this;
		}

		/**
		 * Required - API name: {@code since}
		 */
		public final Builder since(String value) {
			this.since = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code aggregations}
		 */
		public final Builder aggregations(Map<String, JsonData> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Builds a {@link NodeUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeUsage build() {
			_checkSingleUse();

			return new NodeUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeUsage}
	 */
	public static final JsonpDeserializer<NodeUsage> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeUsage::setupNodeUsageDeserializer, Builder::build);

	protected static void setupNodeUsageDeserializer(DelegatingDeserializer<NodeUsage.Builder> op) {

		op.add(Builder::restActions, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"rest_actions");
		op.add(Builder::since, JsonpDeserializer.stringDeserializer(), "since");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");
		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "aggregations");

	}

}
