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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.ActionWebhook
public final class ActionWebhook implements ToJsonp {
	private final String host;

	private final Number port;

	// ---------------------------------------------------------------------------------------------

	protected ActionWebhook(Builder builder) {

		this.host = Objects.requireNonNull(builder.host, "host");
		this.port = Objects.requireNonNull(builder.port, "port");

	}

	/**
	 * API name: {@code host}
	 */
	public String host() {
		return this.host;
	}

	/**
	 * API name: {@code port}
	 */
	public Number port() {
		return this.port;
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

		generator.writeKey("host");
		generator.write(this.host);

		generator.writeKey("port");
		generator.write(this.port.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ActionWebhook}.
	 */
	public static class Builder implements ObjectBuilder<ActionWebhook> {
		private String host;

		private Number port;

		/**
		 * API name: {@code host}
		 */
		public Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * API name: {@code port}
		 */
		public Builder port(Number value) {
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

			return new ActionWebhook(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ActionWebhook
	 */
	public static final JsonpDeserializer<ActionWebhook> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ActionWebhook::setupActionWebhookDeserializer);

	protected static void setupActionWebhookDeserializer(DelegatingDeserializer<ActionWebhook.Builder> op) {

		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::port, JsonpDeserializer.numberDeserializer(), "port");

	}

}
