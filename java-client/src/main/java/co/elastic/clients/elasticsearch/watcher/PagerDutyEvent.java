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

// typedef: watcher._types.PagerDutyEvent

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.PagerDutyEvent">API
 *      specification</a>
 */
@JsonpDeserializable
public class PagerDutyEvent implements JsonpSerializable {
	@Nullable
	private final String account;

	private final boolean attachPayload;

	@Nullable
	private final String client;

	@Nullable
	private final String clientUrl;

	private final List<PagerDutyContext> contexts;

	private final String description;

	@Nullable
	private final PagerDutyEventType eventType;

	private final String incidentKey;

	@Nullable
	private final PagerDutyEventProxy proxy;

	// ---------------------------------------------------------------------------------------------

	protected PagerDutyEvent(AbstractBuilder<?> builder) {

		this.account = builder.account;
		this.attachPayload = ApiTypeHelper.requireNonNull(builder.attachPayload, this, "attachPayload");
		this.client = builder.client;
		this.clientUrl = builder.clientUrl;
		this.contexts = ApiTypeHelper.unmodifiable(builder.contexts);
		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.eventType = builder.eventType;
		this.incidentKey = ApiTypeHelper.requireNonNull(builder.incidentKey, this, "incidentKey");
		this.proxy = builder.proxy;

	}

	public static PagerDutyEvent pagerDutyEventOf(Function<Builder, ObjectBuilder<PagerDutyEvent>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code account}
	 */
	@Nullable
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
	 * API name: {@code contexts}
	 */
	public final List<PagerDutyContext> contexts() {
		return this.contexts;
	}

	/**
	 * Required - API name: {@code description}
	 */
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
	 * API name: {@code proxy}
	 */
	@Nullable
	public final PagerDutyEventProxy proxy() {
		return this.proxy;
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

		if (this.account != null) {
			generator.writeKey("account");
			generator.write(this.account);

		}
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
		generator.writeKey("description");
		generator.write(this.description);

		if (this.eventType != null) {
			generator.writeKey("event_type");
			this.eventType.serialize(generator, mapper);
		}
		generator.writeKey("incident_key");
		generator.write(this.incidentKey);

		if (this.proxy != null) {
			generator.writeKey("proxy");
			this.proxy.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyEvent}.
	 */

	public static class Builder extends PagerDutyEvent.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PagerDutyEvent> {
		@Override
		protected Builder self() {
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

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private String account;

		private Boolean attachPayload;

		@Nullable
		private String client;

		@Nullable
		private String clientUrl;

		@Nullable
		private List<PagerDutyContext> contexts;

		private String description;

		@Nullable
		private PagerDutyEventType eventType;

		private String incidentKey;

		@Nullable
		private PagerDutyEventProxy proxy;

		/**
		 * API name: {@code account}
		 */
		public final BuilderT account(@Nullable String value) {
			this.account = value;
			return self();
		}

		/**
		 * Required - API name: {@code attach_payload}
		 */
		public final BuilderT attachPayload(boolean value) {
			this.attachPayload = value;
			return self();
		}

		/**
		 * API name: {@code client}
		 */
		public final BuilderT client(@Nullable String value) {
			this.client = value;
			return self();
		}

		/**
		 * API name: {@code client_url}
		 */
		public final BuilderT clientUrl(@Nullable String value) {
			this.clientUrl = value;
			return self();
		}

		/**
		 * API name: {@code contexts}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>contexts</code>.
		 */
		public final BuilderT contexts(List<PagerDutyContext> list) {
			this.contexts = _listAddAll(this.contexts, list);
			return self();
		}

		/**
		 * API name: {@code contexts}
		 * <p>
		 * Adds one or more values to <code>contexts</code>.
		 */
		public final BuilderT contexts(PagerDutyContext value, PagerDutyContext... values) {
			this.contexts = _listAdd(this.contexts, value, values);
			return self();
		}

		/**
		 * API name: {@code contexts}
		 * <p>
		 * Adds a value to <code>contexts</code> using a builder lambda.
		 */
		public final BuilderT contexts(Function<PagerDutyContext.Builder, ObjectBuilder<PagerDutyContext>> fn) {
			return contexts(fn.apply(new PagerDutyContext.Builder()).build());
		}

		/**
		 * Required - API name: {@code description}
		 */
		public final BuilderT description(String value) {
			this.description = value;
			return self();
		}

		/**
		 * API name: {@code event_type}
		 */
		public final BuilderT eventType(@Nullable PagerDutyEventType value) {
			this.eventType = value;
			return self();
		}

		/**
		 * Required - API name: {@code incident_key}
		 */
		public final BuilderT incidentKey(String value) {
			this.incidentKey = value;
			return self();
		}

		/**
		 * API name: {@code proxy}
		 */
		public final BuilderT proxy(@Nullable PagerDutyEventProxy value) {
			this.proxy = value;
			return self();
		}

		/**
		 * API name: {@code proxy}
		 */
		public final BuilderT proxy(Function<PagerDutyEventProxy.Builder, ObjectBuilder<PagerDutyEventProxy>> fn) {
			return this.proxy(fn.apply(new PagerDutyEventProxy.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PagerDutyEvent}
	 */
	public static final JsonpDeserializer<PagerDutyEvent> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PagerDutyEvent::setupPagerDutyEventDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupPagerDutyEventDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::account, JsonpDeserializer.stringDeserializer(), "account");
		op.add(AbstractBuilder::attachPayload, JsonpDeserializer.booleanDeserializer(), "attach_payload");
		op.add(AbstractBuilder::client, JsonpDeserializer.stringDeserializer(), "client");
		op.add(AbstractBuilder::clientUrl, JsonpDeserializer.stringDeserializer(), "client_url");
		op.add(AbstractBuilder::contexts, JsonpDeserializer.arrayDeserializer(PagerDutyContext._DESERIALIZER),
				"contexts", "context");
		op.add(AbstractBuilder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(AbstractBuilder::eventType, PagerDutyEventType._DESERIALIZER, "event_type");
		op.add(AbstractBuilder::incidentKey, JsonpDeserializer.stringDeserializer(), "incident_key");
		op.add(AbstractBuilder::proxy, PagerDutyEventProxy._DESERIALIZER, "proxy");

	}

}
