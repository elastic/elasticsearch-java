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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.Transform;
import co.elastic.clients.elasticsearch._types.TransformVariant;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
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

// typedef: watcher.put_watch.Request

/**
 * Create or update a watch. When a watch is registered, a new document that
 * represents the watch is added to the <code>.watches</code> index and its
 * trigger is immediately registered with the relevant trigger engine. Typically
 * for the <code>schedule</code> trigger, the scheduler is the trigger engine.
 * <p>
 * IMPORTANT: You must use Kibana or this API to create a watch. Do not add a
 * watch directly to the <code>.watches</code> index by using the Elasticsearch
 * index API. If Elasticsearch security features are enabled, do not give users
 * write privileges on the <code>.watches</code> index.
 * <p>
 * When you add a watch you can also define its initial active state by setting
 * the <em>active</em> parameter.
 * <p>
 * When Elasticsearch security features are enabled, your watch can index or
 * search only on indices for which the user that stored the watch has
 * privileges. If the user is able to read index <code>a</code>, but not index
 * <code>b</code>, the same will apply when the watch runs.
 * 
 * @see <a href="../doc-files/api-spec.html#watcher.put_watch.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutWatchRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, Action> actions;

	@Nullable
	private final Boolean active;

	@Nullable
	private final Condition condition;

	private final String id;

	@Nullable
	private final Long ifPrimaryTerm;

	@Nullable
	private final Long ifSeqNo;

	@Nullable
	private final Input input;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final Time throttlePeriod;

	@Nullable
	private final Long throttlePeriodInMillis;

	@Nullable
	private final Transform transform;

	@Nullable
	private final Trigger trigger;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	private PutWatchRequest(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiable(builder.actions);
		this.active = builder.active;
		this.condition = builder.condition;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.input = builder.input;
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.throttlePeriod = builder.throttlePeriod;
		this.throttlePeriodInMillis = builder.throttlePeriodInMillis;
		this.transform = builder.transform;
		this.trigger = builder.trigger;
		this.version = builder.version;

	}

	public static PutWatchRequest of(Function<Builder, ObjectBuilder<PutWatchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The list of actions that will be run if the condition matches.
	 * <p>
	 * API name: {@code actions}
	 */
	public final Map<String, Action> actions() {
		return this.actions;
	}

	/**
	 * The initial state of the watch. The default value is <code>true</code>, which
	 * means the watch is active by default.
	 * <p>
	 * API name: {@code active}
	 */
	@Nullable
	public final Boolean active() {
		return this.active;
	}

	/**
	 * The condition that defines if the actions should be run.
	 * <p>
	 * API name: {@code condition}
	 */
	@Nullable
	public final Condition condition() {
		return this.condition;
	}

	/**
	 * Required - The identifier for the watch.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * only update the watch if the last operation that has changed the watch has
	 * the specified primary term
	 * <p>
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public final Long ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * only update the watch if the last operation that has changed the watch has
	 * the specified sequence number
	 * <p>
	 * API name: {@code if_seq_no}
	 */
	@Nullable
	public final Long ifSeqNo() {
		return this.ifSeqNo;
	}

	/**
	 * The input that defines the input that loads the data for the watch.
	 * <p>
	 * API name: {@code input}
	 */
	@Nullable
	public final Input input() {
		return this.input;
	}

	/**
	 * Metadata JSON that will be copied into the history entries.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * The minimum time between actions being run. The default is 5 seconds. This
	 * default can be changed in the config file with the setting
	 * <code>xpack.watcher.throttle.period.default_period</code>. If both this value
	 * and the <code>throttle_period_in_millis</code> parameter are specified,
	 * Watcher uses the last parameter included in the request.
	 * <p>
	 * API name: {@code throttle_period}
	 */
	@Nullable
	public final Time throttlePeriod() {
		return this.throttlePeriod;
	}

	/**
	 * Minimum time in milliseconds between actions being run. Defaults to 5000. If
	 * both this value and the throttle_period parameter are specified, Watcher uses
	 * the last parameter included in the request.
	 * <p>
	 * API name: {@code throttle_period_in_millis}
	 */
	@Nullable
	public final Long throttlePeriodInMillis() {
		return this.throttlePeriodInMillis;
	}

	/**
	 * The transform that processes the watch payload to prepare it for the watch
	 * actions.
	 * <p>
	 * API name: {@code transform}
	 */
	@Nullable
	public final Transform transform() {
		return this.transform;
	}

	/**
	 * The trigger that defines when the watch should run.
	 * <p>
	 * API name: {@code trigger}
	 */
	@Nullable
	public final Trigger trigger() {
		return this.trigger;
	}

	/**
	 * Explicit version number for concurrency control
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
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
			for (Map.Entry<String, Action> item0 : this.actions.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.condition != null) {
			generator.writeKey("condition");
			this.condition.serialize(generator, mapper);

		}
		if (this.input != null) {
			generator.writeKey("input");
			this.input.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.throttlePeriod != null) {
			generator.writeKey("throttle_period");
			this.throttlePeriod.serialize(generator, mapper);

		}
		if (this.throttlePeriodInMillis != null) {
			generator.writeKey("throttle_period_in_millis");
			generator.write(this.throttlePeriodInMillis);

		}
		if (this.transform != null) {
			generator.writeKey("transform");
			this.transform.serialize(generator, mapper);

		}
		if (this.trigger != null) {
			generator.writeKey("trigger");
			this.trigger.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutWatchRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutWatchRequest> {
		@Nullable
		private Map<String, Action> actions;

		@Nullable
		private Boolean active;

		@Nullable
		private Condition condition;

		private String id;

		@Nullable
		private Long ifPrimaryTerm;

		@Nullable
		private Long ifSeqNo;

		@Nullable
		private Input input;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private Time throttlePeriod;

		@Nullable
		private Long throttlePeriodInMillis;

		@Nullable
		private Transform transform;

		@Nullable
		private Trigger trigger;

		@Nullable
		private Long version;

		/**
		 * The list of actions that will be run if the condition matches.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>actions</code>.
		 */
		public final Builder actions(Map<String, Action> map) {
			this.actions = _mapPutAll(this.actions, map);
			return this;
		}

		/**
		 * The list of actions that will be run if the condition matches.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds an entry to <code>actions</code>.
		 */
		public final Builder actions(String key, Action value) {
			this.actions = _mapPut(this.actions, key, value);
			return this;
		}

		/**
		 * The list of actions that will be run if the condition matches.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds an entry to <code>actions</code> using a builder lambda.
		 */
		public final Builder actions(String key, Function<Action.Builder, ObjectBuilder<Action>> fn) {
			return actions(key, fn.apply(new Action.Builder()).build());
		}

		/**
		 * The initial state of the watch. The default value is <code>true</code>, which
		 * means the watch is active by default.
		 * <p>
		 * API name: {@code active}
		 */
		public final Builder active(@Nullable Boolean value) {
			this.active = value;
			return this;
		}

		/**
		 * The condition that defines if the actions should be run.
		 * <p>
		 * API name: {@code condition}
		 */
		public final Builder condition(@Nullable Condition value) {
			this.condition = value;
			return this;
		}

		/**
		 * The condition that defines if the actions should be run.
		 * <p>
		 * API name: {@code condition}
		 */
		public final Builder condition(Function<Condition.Builder, ObjectBuilder<Condition>> fn) {
			return this.condition(fn.apply(new Condition.Builder()).build());
		}

		/**
		 * The condition that defines if the actions should be run.
		 * <p>
		 * API name: {@code condition}
		 */
		public final Builder condition(ConditionVariant value) {
			this.condition = value._toCondition();
			return this;
		}

		/**
		 * Required - The identifier for the watch.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * only update the watch if the last operation that has changed the watch has
		 * the specified primary term
		 * <p>
		 * API name: {@code if_primary_term}
		 */
		public final Builder ifPrimaryTerm(@Nullable Long value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * only update the watch if the last operation that has changed the watch has
		 * the specified sequence number
		 * <p>
		 * API name: {@code if_seq_no}
		 */
		public final Builder ifSeqNo(@Nullable Long value) {
			this.ifSeqNo = value;
			return this;
		}

		/**
		 * The input that defines the input that loads the data for the watch.
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(@Nullable Input value) {
			this.input = value;
			return this;
		}

		/**
		 * The input that defines the input that loads the data for the watch.
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(Function<Input.Builder, ObjectBuilder<Input>> fn) {
			return this.input(fn.apply(new Input.Builder()).build());
		}

		/**
		 * The input that defines the input that loads the data for the watch.
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(InputVariant value) {
			this.input = value._toInput();
			return this;
		}

		/**
		 * Metadata JSON that will be copied into the history entries.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Metadata JSON that will be copied into the history entries.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		/**
		 * The minimum time between actions being run. The default is 5 seconds. This
		 * default can be changed in the config file with the setting
		 * <code>xpack.watcher.throttle.period.default_period</code>. If both this value
		 * and the <code>throttle_period_in_millis</code> parameter are specified,
		 * Watcher uses the last parameter included in the request.
		 * <p>
		 * API name: {@code throttle_period}
		 */
		public final Builder throttlePeriod(@Nullable Time value) {
			this.throttlePeriod = value;
			return this;
		}

		/**
		 * The minimum time between actions being run. The default is 5 seconds. This
		 * default can be changed in the config file with the setting
		 * <code>xpack.watcher.throttle.period.default_period</code>. If both this value
		 * and the <code>throttle_period_in_millis</code> parameter are specified,
		 * Watcher uses the last parameter included in the request.
		 * <p>
		 * API name: {@code throttle_period}
		 */
		public final Builder throttlePeriod(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.throttlePeriod(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Minimum time in milliseconds between actions being run. Defaults to 5000. If
		 * both this value and the throttle_period parameter are specified, Watcher uses
		 * the last parameter included in the request.
		 * <p>
		 * API name: {@code throttle_period_in_millis}
		 */
		public final Builder throttlePeriodInMillis(@Nullable Long value) {
			this.throttlePeriodInMillis = value;
			return this;
		}

		/**
		 * The transform that processes the watch payload to prepare it for the watch
		 * actions.
		 * <p>
		 * API name: {@code transform}
		 */
		public final Builder transform(@Nullable Transform value) {
			this.transform = value;
			return this;
		}

		/**
		 * The transform that processes the watch payload to prepare it for the watch
		 * actions.
		 * <p>
		 * API name: {@code transform}
		 */
		public final Builder transform(Function<Transform.Builder, ObjectBuilder<Transform>> fn) {
			return this.transform(fn.apply(new Transform.Builder()).build());
		}

		/**
		 * The transform that processes the watch payload to prepare it for the watch
		 * actions.
		 * <p>
		 * API name: {@code transform}
		 */
		public final Builder transform(TransformVariant value) {
			this.transform = value._toTransform();
			return this;
		}

		/**
		 * The trigger that defines when the watch should run.
		 * <p>
		 * API name: {@code trigger}
		 */
		public final Builder trigger(@Nullable Trigger value) {
			this.trigger = value;
			return this;
		}

		/**
		 * The trigger that defines when the watch should run.
		 * <p>
		 * API name: {@code trigger}
		 */
		public final Builder trigger(Function<Trigger.Builder, ObjectBuilder<Trigger>> fn) {
			return this.trigger(fn.apply(new Trigger.Builder()).build());
		}

		/**
		 * The trigger that defines when the watch should run.
		 * <p>
		 * API name: {@code trigger}
		 */
		public final Builder trigger(TriggerVariant value) {
			this.trigger = value._toTrigger();
			return this;
		}

		/**
		 * Explicit version number for concurrency control
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutWatchRequest build() {
			_checkSingleUse();

			return new PutWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutWatchRequest}
	 */
	public static final JsonpDeserializer<PutWatchRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutWatchRequest::setupPutWatchRequestDeserializer);

	protected static void setupPutWatchRequestDeserializer(ObjectDeserializer<PutWatchRequest.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(Action._DESERIALIZER), "actions");
		op.add(Builder::condition, Condition._DESERIALIZER, "condition");
		op.add(Builder::input, Input._DESERIALIZER, "input");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::throttlePeriod, Time._DESERIALIZER, "throttle_period");
		op.add(Builder::throttlePeriodInMillis, JsonpDeserializer.longDeserializer(), "throttle_period_in_millis");
		op.add(Builder::transform, Transform._DESERIALIZER, "transform");
		op.add(Builder::trigger, Trigger._DESERIALIZER, "trigger");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.put_watch}".
	 */
	public static final Endpoint<PutWatchRequest, PutWatchResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/watcher.put_watch",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.active != null) {
					params.put("active", String.valueOf(request.active));
				}
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", String.valueOf(request.ifPrimaryTerm));
				}
				if (request.ifSeqNo != null) {
					params.put("if_seq_no", String.valueOf(request.ifSeqNo));
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutWatchResponse._DESERIALIZER);
}
