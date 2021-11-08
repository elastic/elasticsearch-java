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
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.SimulatedActions
@JsonpDeserializable
public class SimulatedActions implements JsonpSerializable {
	private final List<String> actions;

	private final SimulatedActions all;

	private final boolean useAll;

	// ---------------------------------------------------------------------------------------------

	private SimulatedActions(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiableRequired(builder.actions, this, "actions");
		this.all = ModelTypeHelper.requireNonNull(builder.all, this, "all");
		this.useAll = ModelTypeHelper.requireNonNull(builder.useAll, this, "useAll");

	}

	public static SimulatedActions of(Function<Builder, ObjectBuilder<SimulatedActions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final List<String> actions() {
		return this.actions;
	}

	/**
	 * Required - API name: {@code all}
	 */
	public final SimulatedActions all() {
		return this.all;
	}

	/**
	 * Required - API name: {@code use_all}
	 */
	public final boolean useAll() {
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

		if (ModelTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartArray();
			for (String item0 : this.actions) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("all");
		this.all.serialize(generator, mapper);

		generator.writeKey("use_all");
		generator.write(this.useAll);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulatedActions}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SimulatedActions> {
		private List<String> actions;

		private SimulatedActions all;

		private Boolean useAll;

		/**
		 * Required - API name: {@code actions}
		 */
		public final Builder actions(List<String> value) {
			this.actions = value;
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 */
		public final Builder actions(String... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code all}
		 */
		public final Builder all(SimulatedActions value) {
			this.all = value;
			return this;
		}

		/**
		 * Required - API name: {@code all}
		 */
		public final Builder all(Function<SimulatedActions.Builder, ObjectBuilder<SimulatedActions>> fn) {
			return this.all(fn.apply(new SimulatedActions.Builder()).build());
		}

		/**
		 * Required - API name: {@code use_all}
		 */
		public final Builder useAll(boolean value) {
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
			_checkSingleUse();

			return new SimulatedActions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulatedActions}
	 */
	public static final JsonpDeserializer<SimulatedActions> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SimulatedActions::setupSimulatedActionsDeserializer, Builder::build);

	protected static void setupSimulatedActionsDeserializer(DelegatingDeserializer<SimulatedActions.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"actions");
		op.add(Builder::all, SimulatedActions._DESERIALIZER, "all");
		op.add(Builder::useAll, JsonpDeserializer.booleanDeserializer(), "use_all");

	}

}
