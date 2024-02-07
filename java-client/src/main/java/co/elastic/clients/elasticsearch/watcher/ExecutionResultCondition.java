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

// typedef: watcher._types.ExecutionResultCondition

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ExecutionResultCondition">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecutionResultCondition implements JsonpSerializable {
	private final boolean met;

	private final ActionStatusOptions status;

	private final ConditionType type;

	// ---------------------------------------------------------------------------------------------

	private ExecutionResultCondition(Builder builder) {

		this.met = ApiTypeHelper.requireNonNull(builder.met, this, "met");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static ExecutionResultCondition of(Function<Builder, ObjectBuilder<ExecutionResultCondition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code met}
	 */
	public final boolean met() {
		return this.met;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ActionStatusOptions status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final ConditionType type() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultCondition}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExecutionResultCondition> {
		private Boolean met;

		private ActionStatusOptions status;

		private ConditionType type;

		/**
		 * Required - API name: {@code met}
		 */
		public final Builder met(boolean value) {
			this.met = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ActionStatusOptions value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(ConditionType value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecutionResultCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResultCondition build() {
			_checkSingleUse();

			return new ExecutionResultCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionResultCondition}
	 */
	public static final JsonpDeserializer<ExecutionResultCondition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionResultCondition::setupExecutionResultConditionDeserializer);

	protected static void setupExecutionResultConditionDeserializer(
			ObjectDeserializer<ExecutionResultCondition.Builder> op) {

		op.add(Builder::met, JsonpDeserializer.booleanDeserializer(), "met");
		op.add(Builder::status, ActionStatusOptions._DESERIALIZER, "status");
		op.add(Builder::type, ConditionType._DESERIALIZER, "type");

	}

}
