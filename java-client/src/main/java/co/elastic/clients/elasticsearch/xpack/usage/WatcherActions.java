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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.String;
import java.util.Map;
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

// typedef: xpack.usage.WatcherActions

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.WatcherActions">API
 *      specification</a>
 */
@JsonpDeserializable
public class WatcherActions implements JsonpSerializable {
	private final Map<String, WatcherActionTotals> actions;

	// ---------------------------------------------------------------------------------------------

	private WatcherActions(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiableRequired(builder.actions, this, "actions");

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

		if (ApiTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartObject();
			for (Map.Entry<String, WatcherActionTotals> item0 : this.actions.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherActions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<WatcherActions> {
		private Map<String, WatcherActionTotals> actions;

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>actions</code>.
		 */
		public final Builder actions(Map<String, WatcherActionTotals> map) {
			this.actions = _mapPutAll(this.actions, map);
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds an entry to <code>actions</code>.
		 */
		public final Builder actions(String key, WatcherActionTotals value) {
			this.actions = _mapPut(this.actions, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds an entry to <code>actions</code> using a builder lambda.
		 */
		public final Builder actions(String key,
				Function<WatcherActionTotals.Builder, ObjectBuilder<WatcherActionTotals>> fn) {
			return actions(key, fn.apply(new WatcherActionTotals.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
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
			WatcherActions::setupWatcherActionsDeserializer);

	protected static void setupWatcherActionsDeserializer(ObjectDeserializer<WatcherActions.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(WatcherActionTotals._DESERIALIZER), "actions");

	}

}
