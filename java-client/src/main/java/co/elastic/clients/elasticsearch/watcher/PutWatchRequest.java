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
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Transform;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.put_watch.Request
@JsonpDeserializable
public final class PutWatchRequest extends RequestBase implements JsonpSerializable {
	private final String id;

	@Nullable
	private final Boolean active;

	@Nullable
	private final Long ifPrimaryTerm;

	@Nullable
	private final Long ifSequenceNumber;

	@Nullable
	private final Long version;

	@Nullable
	private final Map<String, Action> actions;

	@Nullable
	private final Condition condition;

	@Nullable
	private final Input input;

	@Nullable
	private final Map<String, JsonData> metadata;

	@Nullable
	private final String throttlePeriod;

	@Nullable
	private final Transform transform;

	@Nullable
	private final Trigger trigger;

	// ---------------------------------------------------------------------------------------------

	public PutWatchRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.active = builder.active;
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSequenceNumber = builder.ifSequenceNumber;
		this.version = builder.version;
		this.actions = ModelTypeHelper.unmodifiable(builder.actions);
		this.condition = builder.condition;
		this.input = builder.input;
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.throttlePeriod = builder.throttlePeriod;
		this.transform = builder.transform;
		this.trigger = builder.trigger;

	}

	public PutWatchRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Watch ID
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
	public Long ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * API name: {@code if_sequence_number}
	 */
	@Nullable
	public Long ifSequenceNumber() {
		return this.ifSequenceNumber;
	}

	/**
	 * Explicit version number for concurrency control
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
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
	public Condition condition() {
		return this.condition;
	}

	/**
	 * API name: {@code input}
	 */
	@Nullable
	public Input input() {
		return this.input;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonData> metadata() {
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
	public Transform transform() {
		return this.transform;
	}

	/**
	 * API name: {@code trigger}
	 */
	@Nullable
	public Trigger trigger() {
		return this.trigger;
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

		if (this.actions != null) {

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
		if (this.metadata != null) {

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
			generator.write(this.throttlePeriod);

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
	public static class Builder implements ObjectBuilder<PutWatchRequest> {
		private String id;

		@Nullable
		private Boolean active;

		@Nullable
		private Long ifPrimaryTerm;

		@Nullable
		private Long ifSequenceNumber;

		@Nullable
		private Long version;

		@Nullable
		private Map<String, Action> actions;

		@Nullable
		private Condition condition;

		@Nullable
		private Input input;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private String throttlePeriod;

		@Nullable
		private Transform transform;

		@Nullable
		private Trigger trigger;

		/**
		 * Required - Watch ID
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
		public Builder ifPrimaryTerm(@Nullable Long value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code if_sequence_number}
		 */
		public Builder ifSequenceNumber(@Nullable Long value) {
			this.ifSequenceNumber = value;
			return this;
		}

		/**
		 * Explicit version number for concurrency control
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
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
		public Builder condition(@Nullable Condition value) {
			this.condition = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public Builder condition(Function<Condition.Builder, ObjectBuilder<Condition>> fn) {
			return this.condition(fn.apply(new Condition.Builder()).build());
		}

		/**
		 * API name: {@code input}
		 */
		public Builder input(@Nullable Input value) {
			this.input = value;
			return this;
		}

		/**
		 * API name: {@code input}
		 */
		public Builder input(Function<Input.Builder, ObjectBuilder<Input>> fn) {
			return this.input(fn.apply(new Input.Builder()).build());
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonData value) {
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
		public Builder transform(@Nullable Transform value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Function<Transform.Builder, ObjectBuilder<Transform>> fn) {
			return this.transform(fn.apply(new Transform.Builder()).build());
		}

		/**
		 * API name: {@code trigger}
		 */
		public Builder trigger(@Nullable Trigger value) {
			this.trigger = value;
			return this;
		}

		/**
		 * API name: {@code trigger}
		 */
		public Builder trigger(Function<Trigger.Builder, ObjectBuilder<Trigger>> fn) {
			return this.trigger(fn.apply(new Trigger.Builder()).build());
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
	 * Json deserializer for {@link PutWatchRequest}
	 */
	public static final JsonpDeserializer<PutWatchRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutWatchRequest::setupPutWatchRequestDeserializer, Builder::build);

	protected static void setupPutWatchRequestDeserializer(DelegatingDeserializer<PutWatchRequest.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(Action._DESERIALIZER), "actions");
		op.add(Builder::condition, Condition._DESERIALIZER, "condition");
		op.add(Builder::input, Input._DESERIALIZER, "input");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::throttlePeriod, JsonpDeserializer.stringDeserializer(), "throttle_period");
		op.add(Builder::transform, Transform._DESERIALIZER, "transform");
		op.add(Builder::trigger, Trigger._DESERIALIZER, "trigger");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.put_watch}".
	 */
	public static final Endpoint<PutWatchRequest, PutWatchResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.active != null) {
					params.put("active", String.valueOf(request.active));
				}
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", String.valueOf(request.ifPrimaryTerm));
				}
				if (request.ifSequenceNumber != null) {
					params.put("if_sequence_number", String.valueOf(request.ifSequenceNumber));
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutWatchResponse._DESERIALIZER);
}
