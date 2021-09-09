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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.TransformContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.put_watch.Request
public final class PutWatchRequest extends RequestBase implements ToJsonp {
	private final String id;

	@Nullable
	private final Boolean active;

	@Nullable
	private final Number ifPrimaryTerm;

	@Nullable
	private final Number ifSequenceNumber;

	@Nullable
	private final Number version;

	@Nullable
	private final Map<String, Action> actions;

	@Nullable
	private final ConditionContainer condition;

	@Nullable
	private final InputContainer input;

	@Nullable
	private final Map<String, JsonValue> metadata;

	@Nullable
	private final String throttlePeriod;

	@Nullable
	private final TransformContainer transform;

	@Nullable
	private final TriggerContainer trigger;

	// ---------------------------------------------------------------------------------------------

	protected PutWatchRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.active = builder.active;
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSequenceNumber = builder.ifSequenceNumber;
		this.version = builder.version;
		this.actions = builder.actions;
		this.condition = builder.condition;
		this.input = builder.input;
		this.metadata = builder.metadata;
		this.throttlePeriod = builder.throttlePeriod;
		this.transform = builder.transform;
		this.trigger = builder.trigger;

	}

	/**
	 * Watch ID
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Specify whether the watch is in/active by default
	 * <p>
	 * API name: {@code active}
	 */
	@Nullable
	public Boolean active() {
		return this.active;
	}

	/**
	 * only update the watch if the last operation that has changed the watch has
	 * the specified primary term
	 * <p>
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public Number ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * API name: {@code if_sequence_number}
	 */
	@Nullable
	public Number ifSequenceNumber() {
		return this.ifSequenceNumber;
	}

	/**
	 * Explicit version number for concurrency control
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code actions}
	 */
	@Nullable
	public Map<String, Action> actions() {
		return this.actions;
	}

	/**
	 * API name: {@code condition}
	 */
	@Nullable
	public ConditionContainer condition() {
		return this.condition;
	}

	/**
	 * API name: {@code input}
	 */
	@Nullable
	public InputContainer input() {
		return this.input;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonValue> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code throttle_period}
	 */
	@Nullable
	public String throttlePeriod() {
		return this.throttlePeriod;
	}

	/**
	 * API name: {@code transform}
	 */
	@Nullable
	public TransformContainer transform() {
		return this.transform;
	}

	/**
	 * API name: {@code trigger}
	 */
	@Nullable
	public TriggerContainer trigger() {
		return this.trigger;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.actions != null) {

			generator.writeKey("actions");
			generator.writeStartObject();
			for (Map.Entry<String, Action> item0 : this.actions.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.condition != null) {

			generator.writeKey("condition");
			this.condition.toJsonp(generator, mapper);

		}
		if (this.input != null) {

			generator.writeKey("input");
			this.input.toJsonp(generator, mapper);

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.throttlePeriod != null) {

			generator.writeKey("throttle_period");
			generator.write(this.throttlePeriod);

		}
		if (this.transform != null) {

			generator.writeKey("transform");
			this.transform.toJsonp(generator, mapper);

		}
		if (this.trigger != null) {

			generator.writeKey("trigger");
			this.trigger.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutWatchRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutWatchRequest> {
		private String id;

		@Nullable
		private Boolean active;

		@Nullable
		private Number ifPrimaryTerm;

		@Nullable
		private Number ifSequenceNumber;

		@Nullable
		private Number version;

		@Nullable
		private Map<String, Action> actions;

		@Nullable
		private ConditionContainer condition;

		@Nullable
		private InputContainer input;

		@Nullable
		private Map<String, JsonValue> metadata;

		@Nullable
		private String throttlePeriod;

		@Nullable
		private TransformContainer transform;

		@Nullable
		private TriggerContainer trigger;

		/**
		 * Watch ID
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Specify whether the watch is in/active by default
		 * <p>
		 * API name: {@code active}
		 */
		public Builder active(@Nullable Boolean value) {
			this.active = value;
			return this;
		}

		/**
		 * only update the watch if the last operation that has changed the watch has
		 * the specified primary term
		 * <p>
		 * API name: {@code if_primary_term}
		 */
		public Builder ifPrimaryTerm(@Nullable Number value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code if_sequence_number}
		 */
		public Builder ifSequenceNumber(@Nullable Number value) {
			this.ifSequenceNumber = value;
			return this;
		}

		/**
		 * Explicit version number for concurrency control
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(@Nullable Map<String, Action> value) {
			this.actions = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #actions(Map)}, creating the map if needed.
		 */
		public Builder putActions(String key, Action value) {
			if (this.actions == null) {
				this.actions = new HashMap<>();
			}
			this.actions.put(key, value);
			return this;
		}

		/**
		 * Set {@link #actions(Map)} to a singleton map.
		 */
		public Builder actions(String key, Function<Action.Builder, ObjectBuilder<Action>> fn) {
			return this.actions(Collections.singletonMap(key, fn.apply(new Action.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #actions(Map)}, creating the map if needed.
		 */
		public Builder putActions(String key, Function<Action.Builder, ObjectBuilder<Action>> fn) {
			return this.putActions(key, fn.apply(new Action.Builder()).build());
		}

		/**
		 * API name: {@code condition}
		 */
		public Builder condition(@Nullable ConditionContainer value) {
			this.condition = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public Builder condition(Function<ConditionContainer.Builder, ObjectBuilder<ConditionContainer>> fn) {
			return this.condition(fn.apply(new ConditionContainer.Builder()).build());
		}

		/**
		 * API name: {@code input}
		 */
		public Builder input(@Nullable InputContainer value) {
			this.input = value;
			return this;
		}

		/**
		 * API name: {@code input}
		 */
		public Builder input(Function<InputContainer.Builder, ObjectBuilder<InputContainer>> fn) {
			return this.input(fn.apply(new InputContainer.Builder()).build());
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonValue> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonValue value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * API name: {@code throttle_period}
		 */
		public Builder throttlePeriod(@Nullable String value) {
			this.throttlePeriod = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(@Nullable TransformContainer value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Function<TransformContainer.Builder, ObjectBuilder<TransformContainer>> fn) {
			return this.transform(fn.apply(new TransformContainer.Builder()).build());
		}

		/**
		 * API name: {@code trigger}
		 */
		public Builder trigger(@Nullable TriggerContainer value) {
			this.trigger = value;
			return this;
		}

		/**
		 * API name: {@code trigger}
		 */
		public Builder trigger(Function<TriggerContainer.Builder, ObjectBuilder<TriggerContainer>> fn) {
			return this.trigger(fn.apply(new TriggerContainer.Builder()).build());
		}

		/**
		 * Builds a {@link PutWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutWatchRequest build() {

			return new PutWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutWatchRequest
	 */
	public static final JsonpDeserializer<PutWatchRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutWatchRequest::setupPutWatchRequestDeserializer);

	protected static void setupPutWatchRequestDeserializer(DelegatingDeserializer<PutWatchRequest.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(Action.DESERIALIZER), "actions");
		op.add(Builder::condition, ConditionContainer.DESERIALIZER, "condition");
		op.add(Builder::input, InputContainer.DESERIALIZER, "input");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"metadata");
		op.add(Builder::throttlePeriod, JsonpDeserializer.stringDeserializer(), "throttle_period");
		op.add(Builder::transform, TransformContainer.DESERIALIZER, "transform");
		op.add(Builder::trigger, TriggerContainer.DESERIALIZER, "trigger");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.put_watch}".
	 */
	public static final Endpoint<PutWatchRequest, PutWatchResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.active != null) {
					params.put("active", String.valueOf(request.active));
				}
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", request.ifPrimaryTerm.toString());
				}
				if (request.ifSequenceNumber != null) {
					params.put("if_sequence_number", request.ifSequenceNumber.toString());
				}
				if (request.version != null) {
					params.put("version", request.version.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutWatchResponse.DESERIALIZER);
}
