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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionResultCondition
@JsonpDeserializable
public final class ExecutionResultCondition implements JsonpSerializable {
	private final boolean met;

	private final ActionStatusOptions status;

	private final ConditionType type;

	// ---------------------------------------------------------------------------------------------

	public ExecutionResultCondition(Builder builder) {

		this.met = Objects.requireNonNull(builder.met, "met");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	public ExecutionResultCondition(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code met}
	 */
	public boolean met() {
		return this.met;
	}

	/**
	 * API name: {@code status}
	 */
	public ActionStatusOptions status() {
		return this.status;
	}

	/**
	 * API name: {@code type}
	 */
	public ConditionType type() {
		return this.type;
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

		generator.writeKey("met");
		generator.write(this.met);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultCondition}.
	 */
	public static class Builder implements ObjectBuilder<ExecutionResultCondition> {
		private Boolean met;

		private ActionStatusOptions status;

		private ConditionType type;

		/**
		 * API name: {@code met}
		 */
		public Builder met(boolean value) {
			this.met = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(ActionStatusOptions value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(ConditionType value) {
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
	 * Json deserializer for {@link ExecutionResultCondition}
	 */
	public static final JsonpDeserializer<ExecutionResultCondition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionResultCondition::setupExecutionResultConditionDeserializer, Builder::build);

	protected static void setupExecutionResultConditionDeserializer(
			DelegatingDeserializer<ExecutionResultCondition.Builder> op) {

		op.add(Builder::met, JsonpDeserializer.booleanDeserializer(), "met");
		op.add(Builder::status, ActionStatusOptions._DESERIALIZER, "status");
		op.add(Builder::type, ConditionType._DESERIALIZER, "type");

	}

}
