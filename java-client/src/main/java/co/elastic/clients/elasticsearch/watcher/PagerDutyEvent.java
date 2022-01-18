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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.PagerDutyEvent

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.PagerDutyEvent">API
 *      specification</a>
 */
@JsonpDeserializable
public class PagerDutyEvent implements JsonpSerializable {
	private final String account;

	private final boolean attachPayload;

	@Nullable
	private final String client;

	@Nullable
	private final String clientUrl;

	private final List<PagerDutyContext> contexts;

	@Nullable
	private final String description;

	@Nullable
	private final PagerDutyEventType eventType;

	private final String incidentKey;

	// ---------------------------------------------------------------------------------------------

	private PagerDutyEvent(Builder builder) {

		this.account = ApiTypeHelper.requireNonNull(builder.account, this, "account");
		this.attachPayload = ApiTypeHelper.requireNonNull(builder.attachPayload, this, "attachPayload");
		this.client = builder.client;
		this.clientUrl = builder.clientUrl;
		this.contexts = ApiTypeHelper.unmodifiableRequired(builder.contexts, this, "contexts");
		this.description = builder.description;
		this.eventType = builder.eventType;
		this.incidentKey = ApiTypeHelper.requireNonNull(builder.incidentKey, this, "incidentKey");

	}

	public static PagerDutyEvent of(Function<Builder, ObjectBuilder<PagerDutyEvent>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code account}
	 */
	public final String account() {
		return this.account;
	}

	/**
	 * Required - API name: {@code attach_payload}
	 */
	public final boolean attachPayload() {
		return this.attachPayload;
	}

	/**
	 * API name: {@code client}
	 */
	@Nullable
	public final String client() {
		return this.client;
	}

	/**
	 * API name: {@code client_url}
	 */
	@Nullable
	public final String clientUrl() {
		return this.clientUrl;
	}

	/**
	 * Required - API name: {@code contexts}
	 */
	public final List<PagerDutyContext> contexts() {
		return this.contexts;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code event_type}
	 */
	@Nullable
	public final PagerDutyEventType eventType() {
		return this.eventType;
	}

	/**
	 * Required - API name: {@code incident_key}
	 */
	public final String incidentKey() {
		return this.incidentKey;
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

		generator.writeKey("account");
		generator.write(this.account);

		generator.writeKey("attach_payload");
		generator.write(this.attachPayload);

		if (this.client != null) {
			generator.writeKey("client");
			generator.write(this.client);

		}
		if (this.clientUrl != null) {
			generator.writeKey("client_url");
			generator.write(this.clientUrl);

		}
		if (ApiTypeHelper.isDefined(this.contexts)) {
			generator.writeKey("contexts");
			generator.writeStartArray();
			for (PagerDutyContext item0 : this.contexts) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.eventType != null) {
			generator.writeKey("event_type");
			this.eventType.serialize(generator, mapper);
		}
		generator.writeKey("incident_key");
		generator.write(this.incidentKey);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyEvent}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PagerDutyEvent> {
		private String account;

		private Boolean attachPayload;

		@Nullable
		private String client;

		@Nullable
		private String clientUrl;

		private List<PagerDutyContext> contexts;

		@Nullable
		private String description;

		@Nullable
		private PagerDutyEventType eventType;

		private String incidentKey;

		/**
		 * Required - API name: {@code account}
		 */
		public final Builder account(String value) {
			this.account = value;
			return this;
		}

		/**
		 * Required - API name: {@code attach_payload}
		 */
		public final Builder attachPayload(boolean value) {
			this.attachPayload = value;
			return this;
		}

		/**
		 * API name: {@code client}
		 */
		public final Builder client(@Nullable String value) {
			this.client = value;
			return this;
		}

		/**
		 * API name: {@code client_url}
		 */
		public final Builder clientUrl(@Nullable String value) {
			this.clientUrl = value;
			return this;
		}

		/**
		 * Required - API name: {@code contexts}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>contexts</code>.
		 */
		public final Builder contexts(List<PagerDutyContext> list) {
			this.contexts = _listAddAll(this.contexts, list);
			return this;
		}

		/**
		 * Required - API name: {@code contexts}
		 * <p>
		 * Adds one or more values to <code>contexts</code>.
		 */
		public final Builder contexts(PagerDutyContext value, PagerDutyContext... values) {
			this.contexts = _listAdd(this.contexts, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code contexts}
		 * <p>
		 * Adds a value to <code>contexts</code> using a builder lambda.
		 */
		public final Builder contexts(Function<PagerDutyContext.Builder, ObjectBuilder<PagerDutyContext>> fn) {
			return contexts(fn.apply(new PagerDutyContext.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code event_type}
		 */
		public final Builder eventType(@Nullable PagerDutyEventType value) {
			this.eventType = value;
			return this;
		}

		/**
		 * Required - API name: {@code incident_key}
		 */
		public final Builder incidentKey(String value) {
			this.incidentKey = value;
			return this;
		}

		/**
		 * Builds a {@link PagerDutyEvent}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PagerDutyEvent build() {
			_checkSingleUse();

			return new PagerDutyEvent(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PagerDutyEvent}
	 */
	public static final JsonpDeserializer<PagerDutyEvent> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PagerDutyEvent::setupPagerDutyEventDeserializer);

	protected static void setupPagerDutyEventDeserializer(ObjectDeserializer<PagerDutyEvent.Builder> op) {

		op.add(Builder::account, JsonpDeserializer.stringDeserializer(), "account");
		op.add(Builder::attachPayload, JsonpDeserializer.booleanDeserializer(), "attach_payload");
		op.add(Builder::client, JsonpDeserializer.stringDeserializer(), "client");
		op.add(Builder::clientUrl, JsonpDeserializer.stringDeserializer(), "client_url");
		op.add(Builder::contexts, JsonpDeserializer.arrayDeserializer(PagerDutyContext._DESERIALIZER), "contexts");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::eventType, PagerDutyEventType._DESERIALIZER, "event_type");
		op.add(Builder::incidentKey, JsonpDeserializer.stringDeserializer(), "incident_key");

	}

}
