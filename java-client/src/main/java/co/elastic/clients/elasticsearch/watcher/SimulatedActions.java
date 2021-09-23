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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.SimulatedActions
public final class SimulatedActions implements JsonpSerializable {
	private final List<String> actions;

	private final co.elastic.clients.elasticsearch.watcher.SimulatedActions all;

	private final Boolean useAll;

	// ---------------------------------------------------------------------------------------------

	public SimulatedActions(Builder builder) {

		this.actions = Objects.requireNonNull(builder.actions, "actions");
		this.all = Objects.requireNonNull(builder.all, "all");
		this.useAll = Objects.requireNonNull(builder.useAll, "use_all");

	}

	/**
	 * API name: {@code actions}
	 */
	public List<String> actions() {
		return this.actions;
	}

	/**
	 * API name: {@code all}
	 */
	public co.elastic.clients.elasticsearch.watcher.SimulatedActions all() {
		return this.all;
	}

	/**
	 * API name: {@code use_all}
	 */
	public Boolean useAll() {
		return this.useAll;
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

		generator.writeKey("actions");
		generator.writeStartArray();
		for (String item0 : this.actions) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("all");
		this.all.serialize(generator, mapper);

		generator.writeKey("use_all");
		generator.write(this.useAll);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulatedActions}.
	 */
	public static class Builder implements ObjectBuilder<SimulatedActions> {
		private List<String> actions;

		private co.elastic.clients.elasticsearch.watcher.SimulatedActions all;

		private Boolean useAll;

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(List<String> value) {
			this.actions = value;
			return this;
		}

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(String... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actions(List)}, creating the list if needed.
		 */
		public Builder addActions(String value) {
			if (this.actions == null) {
				this.actions = new ArrayList<>();
			}
			this.actions.add(value);
			return this;
		}

		/**
		 * API name: {@code all}
		 */
		public Builder all(co.elastic.clients.elasticsearch.watcher.SimulatedActions value) {
			this.all = value;
			return this;
		}

		/**
		 * API name: {@code all}
		 */
		public Builder all(
				Function<co.elastic.clients.elasticsearch.watcher.SimulatedActions.Builder, ObjectBuilder<co.elastic.clients.elasticsearch.watcher.SimulatedActions>> fn) {
			return this.all(fn.apply(new co.elastic.clients.elasticsearch.watcher.SimulatedActions.Builder()).build());
		}

		/**
		 * API name: {@code use_all}
		 */
		public Builder useAll(Boolean value) {
			this.useAll = value;
			return this;
		}

		/**
		 * Builds a {@link SimulatedActions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulatedActions build() {

			return new SimulatedActions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulatedActions}
	 */
	public static final JsonpDeserializer<SimulatedActions> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SimulatedActions::setupSimulatedActionsDeserializer);

	protected static void setupSimulatedActionsDeserializer(DelegatingDeserializer<SimulatedActions.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"actions");
		op.add(Builder::all, co.elastic.clients.elasticsearch.watcher.SimulatedActions.DESERIALIZER, "all");
		op.add(Builder::useAll, JsonpDeserializer.booleanDeserializer(), "use_all");

	}

}
