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
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
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

// typedef: watcher._types.WatchStatus

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.WatchStatus">API
 *      specification</a>
 */
@JsonpDeserializable
public class WatchStatus implements JsonpSerializable {
	private final Map<String, ActionStatus> actions;

	@Nullable
	private final DateTime lastChecked;

	@Nullable
	private final DateTime lastMetCondition;

	private final ActivationState state;

	private final long version;

	@Nullable
	private final String executionState;

	// ---------------------------------------------------------------------------------------------

	private WatchStatus(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiableRequired(builder.actions, this, "actions");
		this.lastChecked = builder.lastChecked;
		this.lastMetCondition = builder.lastMetCondition;
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.executionState = builder.executionState;

	}

	public static WatchStatus of(Function<Builder, ObjectBuilder<WatchStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final Map<String, ActionStatus> actions() {
		return this.actions;
	}

	/**
	 * API name: {@code last_checked}
	 */
	@Nullable
	public final DateTime lastChecked() {
		return this.lastChecked;
	}

	/**
	 * API name: {@code last_met_condition}
	 */
	@Nullable
	public final DateTime lastMetCondition() {
		return this.lastMetCondition;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final ActivationState state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * API name: {@code execution_state}
	 */
	@Nullable
	public final String executionState() {
		return this.executionState;
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
			for (Map.Entry<String, ActionStatus> item0 : this.actions.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.lastChecked != null) {
			generator.writeKey("last_checked");
			this.lastChecked.serialize(generator, mapper);
		}
		if (this.lastMetCondition != null) {
			generator.writeKey("last_met_condition");
			this.lastMetCondition.serialize(generator, mapper);
		}
		generator.writeKey("state");
		this.state.serialize(generator, mapper);

		generator.writeKey("version");
		generator.write(this.version);

		if (this.executionState != null) {
			generator.writeKey("execution_state");
			generator.write(this.executionState);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatchStatus}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<WatchStatus> {
		private Map<String, ActionStatus> actions;

		@Nullable
		private DateTime lastChecked;

		@Nullable
		private DateTime lastMetCondition;

		private ActivationState state;

		private Long version;

		@Nullable
		private String executionState;

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>actions</code>.
		 */
		public final Builder actions(Map<String, ActionStatus> map) {
			this.actions = _mapPutAll(this.actions, map);
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds an entry to <code>actions</code>.
		 */
		public final Builder actions(String key, ActionStatus value) {
			this.actions = _mapPut(this.actions, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds an entry to <code>actions</code> using a builder lambda.
		 */
		public final Builder actions(String key, Function<ActionStatus.Builder, ObjectBuilder<ActionStatus>> fn) {
			return actions(key, fn.apply(new ActionStatus.Builder()).build());
		}

		/**
		 * API name: {@code last_checked}
		 */
		public final Builder lastChecked(@Nullable DateTime value) {
			this.lastChecked = value;
			return this;
		}

		/**
		 * API name: {@code last_met_condition}
		 */
		public final Builder lastMetCondition(@Nullable DateTime value) {
			this.lastMetCondition = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(ActivationState value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(Function<ActivationState.Builder, ObjectBuilder<ActivationState>> fn) {
			return this.state(fn.apply(new ActivationState.Builder()).build());
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code execution_state}
		 */
		public final Builder executionState(@Nullable String value) {
			this.executionState = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WatchStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatchStatus build() {
			_checkSingleUse();

			return new WatchStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatchStatus}
	 */
	public static final JsonpDeserializer<WatchStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WatchStatus::setupWatchStatusDeserializer);

	protected static void setupWatchStatusDeserializer(ObjectDeserializer<WatchStatus.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(ActionStatus._DESERIALIZER), "actions");
		op.add(Builder::lastChecked, DateTime._DESERIALIZER, "last_checked");
		op.add(Builder::lastMetCondition, DateTime._DESERIALIZER, "last_met_condition");
		op.add(Builder::state, ActivationState._DESERIALIZER, "state");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::executionState, JsonpDeserializer.stringDeserializer(), "execution_state");

	}

}
