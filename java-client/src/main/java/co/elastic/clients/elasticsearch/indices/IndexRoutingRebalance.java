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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices._types.IndexRoutingRebalance
public final class IndexRoutingRebalance implements JsonpSerializable {
	private final IndexRoutingRebalanceOptions enable;

	// ---------------------------------------------------------------------------------------------

	public IndexRoutingRebalance(Builder builder) {

		this.enable = Objects.requireNonNull(builder.enable, "enable");

	}

	/**
	 * API name: {@code enable}
	 */
	public IndexRoutingRebalanceOptions enable() {
		return this.enable;
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

		generator.writeKey("enable");
		this.enable.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRoutingRebalance}.
	 */
	public static class Builder implements ObjectBuilder<IndexRoutingRebalance> {
		private IndexRoutingRebalanceOptions enable;

		/**
		 * API name: {@code enable}
		 */
		public Builder enable(IndexRoutingRebalanceOptions value) {
			this.enable = value;
			return this;
		}

		/**
		 * Builds a {@link IndexRoutingRebalance}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRoutingRebalance build() {

			return new IndexRoutingRebalance(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexRoutingRebalance}
	 */
	public static final JsonpDeserializer<IndexRoutingRebalance> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexRoutingRebalance::setupIndexRoutingRebalanceDeserializer);

	protected static void setupIndexRoutingRebalanceDeserializer(
			DelegatingDeserializer<IndexRoutingRebalance.Builder> op) {

		op.add(Builder::enable, IndexRoutingRebalanceOptions.DESERIALIZER, "enable");

	}

}
