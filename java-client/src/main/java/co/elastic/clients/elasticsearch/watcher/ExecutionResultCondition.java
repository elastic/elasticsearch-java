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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionResultCondition
public final class ExecutionResultCondition implements ToJsonp {
	private final Boolean met;

	private final JsonValue status;

	private final JsonValue type;

	// ---------------------------------------------------------------------------------------------

	protected ExecutionResultCondition(Builder builder) {

		this.met = Objects.requireNonNull(builder.met, "met");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code met}
	 */
	public Boolean met() {
		return this.met;
	}

	/**
	 * API name: {@code status}
	 */
	public JsonValue status() {
		return this.status;
	}

	/**
	 * API name: {@code type}
	 */
	public JsonValue type() {
		return this.type;
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

		generator.writeKey("met");
		generator.write(this.met);

		generator.writeKey("status");
		generator.write(this.status);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultCondition}.
	 */
	public static class Builder implements ObjectBuilder<ExecutionResultCondition> {
		private Boolean met;

		private JsonValue status;

		private JsonValue type;

		/**
		 * API name: {@code met}
		 */
		public Builder met(Boolean value) {
			this.met = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(JsonValue value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(JsonValue value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link ExecutionResultCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResultCondition build() {

			return new ExecutionResultCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ExecutionResultCondition
	 */
	public static final JsonpDeserializer<ExecutionResultCondition> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ExecutionResultCondition::setupExecutionResultConditionDeserializer);

	protected static void setupExecutionResultConditionDeserializer(
			DelegatingDeserializer<ExecutionResultCondition.Builder> op) {

		op.add(Builder::met, JsonpDeserializer.booleanDeserializer(), "met");
		op.add(Builder::status, JsonpDeserializer.jsonValueDeserializer(), "status");
		op.add(Builder::type, JsonpDeserializer.jsonValueDeserializer(), "type");

	}

}
