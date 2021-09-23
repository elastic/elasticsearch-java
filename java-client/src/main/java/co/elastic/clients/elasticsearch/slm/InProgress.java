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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: slm._types.InProgress
public final class InProgress implements JsonpSerializable {
	private final String name;

	private final String startTimeMillis;

	private final String state;

	private final String uuid;

	// ---------------------------------------------------------------------------------------------

	public InProgress(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.startTimeMillis = Objects.requireNonNull(builder.startTimeMillis, "start_time_millis");
		this.state = Objects.requireNonNull(builder.state, "state");
		this.uuid = Objects.requireNonNull(builder.uuid, "uuid");

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code start_time_millis}
	 */
	public String startTimeMillis() {
		return this.startTimeMillis;
	}

	/**
	 * API name: {@code state}
	 */
	public String state() {
		return this.state;
	}

	/**
	 * API name: {@code uuid}
	 */
	public String uuid() {
		return this.uuid;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("start_time_millis");
		generator.write(this.startTimeMillis);

		generator.writeKey("state");
		generator.write(this.state);

		generator.writeKey("uuid");
		generator.write(this.uuid);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InProgress}.
	 */
	public static class Builder implements ObjectBuilder<InProgress> {
		private String name;

		private String startTimeMillis;

		private String state;

		private String uuid;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code start_time_millis}
		 */
		public Builder startTimeMillis(String value) {
			this.startTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(String value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code uuid}
		 */
		public Builder uuid(String value) {
			this.uuid = value;
			return this;
		}

		/**
		 * Builds a {@link InProgress}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InProgress build() {

			return new InProgress(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InProgress}
	 */
	public static final JsonpDeserializer<InProgress> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InProgress::setupInProgressDeserializer);

	protected static void setupInProgressDeserializer(DelegatingDeserializer<InProgress.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::startTimeMillis, JsonpDeserializer.stringDeserializer(), "start_time_millis");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid");

	}

}
