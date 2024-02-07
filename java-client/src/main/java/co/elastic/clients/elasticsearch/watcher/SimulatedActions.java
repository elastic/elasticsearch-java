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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: watcher._types.SimulatedActions

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.SimulatedActions">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimulatedActions implements JsonpSerializable {
	private final List<String> actions;

	private final SimulatedActions all;

	private final boolean useAll;

	// ---------------------------------------------------------------------------------------------

	private SimulatedActions(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiableRequired(builder.actions, this, "actions");
		this.all = ApiTypeHelper.requireNonNull(builder.all, this, "all");
		this.useAll = ApiTypeHelper.requireNonNull(builder.useAll, this, "useAll");

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

		if (ApiTypeHelper.isDefined(this.actions)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulatedActions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SimulatedActions> {
		private List<String> actions;

		private SimulatedActions all;

		private Boolean useAll;

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actions</code>.
		 */
		public final Builder actions(List<String> list) {
			this.actions = _listAddAll(this.actions, list);
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds one or more values to <code>actions</code>.
		 */
		public final Builder actions(String value, String... values) {
			this.actions = _listAdd(this.actions, value, values);
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

		@Override
		protected Builder self() {
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
			SimulatedActions::setupSimulatedActionsDeserializer);

	protected static void setupSimulatedActionsDeserializer(ObjectDeserializer<SimulatedActions.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"actions");
		op.add(Builder::all, SimulatedActions._DESERIALIZER, "all");
		op.add(Builder::useAll, JsonpDeserializer.booleanDeserializer(), "use_all");

	}

}
