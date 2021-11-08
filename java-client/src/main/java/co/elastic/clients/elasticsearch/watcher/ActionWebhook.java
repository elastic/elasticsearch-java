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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ActionWebhook
@JsonpDeserializable
public class ActionWebhook implements JsonpSerializable {
	private final String host;

	private final int port;

	// ---------------------------------------------------------------------------------------------

	private ActionWebhook(Builder builder) {

		this.host = ModelTypeHelper.requireNonNull(builder.host, this, "host");
		this.port = ModelTypeHelper.requireNonNull(builder.port, this, "port");

	}

	public static ActionWebhook of(Function<Builder, ObjectBuilder<ActionWebhook>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code host}
	 */
	public final String host() {
		return this.host;
	}

	/**
	 * Required - API name: {@code port}
	 */
	public final int port() {
		return this.port;
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

		generator.writeKey("host");
		generator.write(this.host);

		generator.writeKey("port");
		generator.write(this.port);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ActionWebhook}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ActionWebhook> {
		private String host;

		private Integer port;

		/**
		 * Required - API name: {@code host}
		 */
		public final Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * Required - API name: {@code port}
		 */
		public final Builder port(int value) {
			this.port = value;
			return this;
		}

		/**
		 * Builds a {@link ActionWebhook}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ActionWebhook build() {
			_checkSingleUse();

			return new ActionWebhook(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ActionWebhook}
	 */
	public static final JsonpDeserializer<ActionWebhook> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ActionWebhook::setupActionWebhookDeserializer, Builder::build);

	protected static void setupActionWebhookDeserializer(DelegatingDeserializer<ActionWebhook.Builder> op) {

		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::port, JsonpDeserializer.integerDeserializer(), "port");

	}

}
