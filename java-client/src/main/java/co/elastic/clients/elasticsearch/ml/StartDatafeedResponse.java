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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.start_datafeed.Response
@JsonpDeserializable
public final class StartDatafeedResponse implements JsonpSerializable {
	private final List<String> node;

	private final Boolean started;

	// ---------------------------------------------------------------------------------------------

	public StartDatafeedResponse(Builder builder) {

		this.node = Objects.requireNonNull(builder.node, "node");
		this.started = Objects.requireNonNull(builder.started, "started");

	}

	/**
	 * API name: {@code node}
	 */
	public List<String> node() {
		return this.node;
	}

	/**
	 * API name: {@code started}
	 */
	public Boolean started() {
		return this.started;
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

		generator.writeKey("node");
		generator.writeStartArray();
		for (String item0 : this.node) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("started");
		generator.write(this.started);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartDatafeedResponse}.
	 */
	public static class Builder implements ObjectBuilder<StartDatafeedResponse> {
		private List<String> node;

		private Boolean started;

		/**
		 * API name: {@code node}
		 */
		public Builder node(List<String> value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(String... value) {
			this.node = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #node(List)}, creating the list if needed.
		 */
		public Builder addNode(String value) {
			if (this.node == null) {
				this.node = new ArrayList<>();
			}
			this.node.add(value);
			return this;
		}

		/**
		 * API name: {@code started}
		 */
		public Builder started(Boolean value) {
			this.started = value;
			return this;
		}

		/**
		 * Builds a {@link StartDatafeedResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartDatafeedResponse build() {

			return new StartDatafeedResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StartDatafeedResponse}
	 */
	public static final JsonpDeserializer<StartDatafeedResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StartDatafeedResponse::setupStartDatafeedResponseDeserializer, Builder::build);

	protected static void setupStartDatafeedResponseDeserializer(
			DelegatingDeserializer<StartDatafeedResponse.Builder> op) {

		op.add(Builder::node, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "node");
		op.add(Builder::started, JsonpDeserializer.booleanDeserializer(), "started");

	}

}
