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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.WatcherActions
@JsonpDeserializable
public class WatcherActions implements JsonpSerializable {
	private final Map<String, WatcherActionTotals> actions;

	// ---------------------------------------------------------------------------------------------

	private WatcherActions(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiableRequired(builder.actions, this, "actions");

	}

	public static WatcherActions of(Function<Builder, ObjectBuilder<WatcherActions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final Map<String, WatcherActionTotals> actions() {
		return this.actions;
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
			generator.writeStartObject();
			for (Map.Entry<String, WatcherActionTotals> item0 : this.actions.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherActions}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<WatcherActions> {
		private Map<String, WatcherActionTotals> actions;

		/**
		 * Required - API name: {@code actions}
		 */
		public final Builder actions(Map<String, WatcherActionTotals> value) {
			this.actions = value;
			return this;
		}

		/**
		 * Set {@link #actions(Map)} to a singleton map.
		 */
		public Builder actions(String key,
				Function<WatcherActionTotals.Builder, ObjectBuilder<WatcherActionTotals>> fn) {
			return this.actions(Collections.singletonMap(key, fn.apply(new WatcherActionTotals.Builder()).build()));
		}

		public final Builder actions(
				Function<MapBuilder<String, WatcherActionTotals, WatcherActionTotals.Builder>, ObjectBuilder<Map<String, WatcherActionTotals>>> fn) {
			return actions(fn.apply(new MapBuilder<>(WatcherActionTotals.Builder::new)).build());
		}

		/**
		 * Builds a {@link WatcherActions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherActions build() {
			_checkSingleUse();

			return new WatcherActions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatcherActions}
	 */
	public static final JsonpDeserializer<WatcherActions> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WatcherActions::setupWatcherActionsDeserializer, Builder::build);

	protected static void setupWatcherActionsDeserializer(DelegatingDeserializer<WatcherActions.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(WatcherActionTotals._DESERIALIZER), "actions");

	}

}
