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

package co.elastic.clients.elasticsearch.ilm.move_to_step;

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

// typedef: ilm.move_to_step.StepKey
public final class StepKey implements JsonpSerializable {
	private final String action;

	private final String name;

	private final String phase;

	// ---------------------------------------------------------------------------------------------

	public StepKey(Builder builder) {

		this.action = Objects.requireNonNull(builder.action, "action");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.phase = Objects.requireNonNull(builder.phase, "phase");

	}

	/**
	 * API name: {@code action}
	 */
	public String action() {
		return this.action;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code phase}
	 */
	public String phase() {
		return this.phase;
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

		generator.writeKey("action");
		generator.write(this.action);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("phase");
		generator.write(this.phase);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StepKey}.
	 */
	public static class Builder implements ObjectBuilder<StepKey> {
		private String action;

		private String name;

		private String phase;

		/**
		 * API name: {@code action}
		 */
		public Builder action(String value) {
			this.action = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code phase}
		 */
		public Builder phase(String value) {
			this.phase = value;
			return this;
		}

		/**
		 * Builds a {@link StepKey}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StepKey build() {

			return new StepKey(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StepKey}
	 */
	public static final JsonpDeserializer<StepKey> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StepKey::setupStepKeyDeserializer);

	protected static void setupStepKeyDeserializer(DelegatingDeserializer<StepKey.Builder> op) {

		op.add(Builder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::phase, JsonpDeserializer.stringDeserializer(), "phase");

	}

}
