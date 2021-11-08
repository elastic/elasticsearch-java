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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.PagerDutyEvent
@JsonpDeserializable
public class PagerDutyEvent implements JsonpSerializable {
	private final String account;

	private final boolean attachPayload;

	private final String client;

	private final String clientUrl;

	private final List<PagerDutyContext> context;

	private final String description;

	private final PagerDutyEventType eventType;

	private final String incidentKey;

	// ---------------------------------------------------------------------------------------------

	private PagerDutyEvent(Builder builder) {

		this.account = ModelTypeHelper.requireNonNull(builder.account, this, "account");
		this.attachPayload = ModelTypeHelper.requireNonNull(builder.attachPayload, this, "attachPayload");
		this.client = ModelTypeHelper.requireNonNull(builder.client, this, "client");
		this.clientUrl = ModelTypeHelper.requireNonNull(builder.clientUrl, this, "clientUrl");
		this.context = ModelTypeHelper.unmodifiableRequired(builder.context, this, "context");
		this.description = ModelTypeHelper.requireNonNull(builder.description, this, "description");
		this.eventType = ModelTypeHelper.requireNonNull(builder.eventType, this, "eventType");
		this.incidentKey = ModelTypeHelper.requireNonNull(builder.incidentKey, this, "incidentKey");

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
	 * Required - API name: {@code client}
	 */
	public final String client() {
		return this.client;
	}

	/**
	 * Required - API name: {@code client_url}
	 */
	public final String clientUrl() {
		return this.clientUrl;
	}

	/**
	 * Required - API name: {@code context}
	 */
	public final List<PagerDutyContext> context() {
		return this.context;
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code event_type}
	 */
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

		generator.writeKey("client");
		generator.write(this.client);

		generator.writeKey("client_url");
		generator.write(this.clientUrl);

		if (ModelTypeHelper.isDefined(this.context)) {
			generator.writeKey("context");
			generator.writeStartArray();
			for (PagerDutyContext item0 : this.context) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("event_type");
		this.eventType.serialize(generator, mapper);
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

		private String client;

		private String clientUrl;

		private List<PagerDutyContext> context;

		private String description;

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
		 * Required - API name: {@code client}
		 */
		public final Builder client(String value) {
			this.client = value;
			return this;
		}

		/**
		 * Required - API name: {@code client_url}
		 */
		public final Builder clientUrl(String value) {
			this.clientUrl = value;
			return this;
		}

		/**
		 * Required - API name: {@code context}
		 */
		public final Builder context(List<PagerDutyContext> value) {
			this.context = value;
			return this;
		}

		/**
		 * Required - API name: {@code context}
		 */
		public final Builder context(PagerDutyContext... value) {
			this.context = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code context}
		 */
		@SafeVarargs
		public final Builder context(Function<PagerDutyContext.Builder, ObjectBuilder<PagerDutyContext>>... fns) {
			this.context = new ArrayList<>(fns.length);
			for (Function<PagerDutyContext.Builder, ObjectBuilder<PagerDutyContext>> fn : fns) {
				this.context.add(fn.apply(new PagerDutyContext.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code event_type}
		 */
		public final Builder eventType(PagerDutyEventType value) {
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
			PagerDutyEvent::setupPagerDutyEventDeserializer, Builder::build);

	protected static void setupPagerDutyEventDeserializer(DelegatingDeserializer<PagerDutyEvent.Builder> op) {

		op.add(Builder::account, JsonpDeserializer.stringDeserializer(), "account");
		op.add(Builder::attachPayload, JsonpDeserializer.booleanDeserializer(), "attach_payload");
		op.add(Builder::client, JsonpDeserializer.stringDeserializer(), "client");
		op.add(Builder::clientUrl, JsonpDeserializer.stringDeserializer(), "client_url");
		op.add(Builder::context, JsonpDeserializer.arrayDeserializer(PagerDutyContext._DESERIALIZER), "context");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::eventType, PagerDutyEventType._DESERIALIZER, "event_type");
		op.add(Builder::incidentKey, JsonpDeserializer.stringDeserializer(), "incident_key");

	}

}
