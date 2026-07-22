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

import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.Map;
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

// typedef: watcher._types.ExecutionResultConditionResolved

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ExecutionResultConditionResolved">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecutionResultConditionResolved implements JsonpSerializable {
	private final Map<String, JsonData> resolvedValues;

	// ---------------------------------------------------------------------------------------------

	private ExecutionResultConditionResolved(Builder builder) {

		this.resolvedValues = ApiTypeHelper.unmodifiable(builder.resolvedValues);

	}

	public static ExecutionResultConditionResolved of(
			Function<Builder, ObjectBuilder<ExecutionResultConditionResolved>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code resolved_values}
	 */
	public final Map<String, JsonData> resolvedValues() {
		return this.resolvedValues;
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

		if (ApiTypeHelper.isDefined(this.resolvedValues)) {
			generator.writeKey("resolved_values");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.resolvedValues.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultConditionResolved}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExecutionResultConditionResolved> {
		@Nullable
		private Map<String, JsonData> resolvedValues;

		public Builder() {
		}
		private Builder(ExecutionResultConditionResolved instance) {
			this.resolvedValues = instance.resolvedValues;

		}
		/**
		 * API name: {@code resolved_values}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>resolvedValues</code>.
		 */
		public final Builder resolvedValues(Map<String, JsonData> map) {
			this.resolvedValues = _mapPutAll(this.resolvedValues, map);
			return this;
		}

		/**
		 * API name: {@code resolved_values}
		 * <p>
		 * Adds an entry to <code>resolvedValues</code>.
		 */
		public final Builder resolvedValues(String key, JsonData value) {
			this.resolvedValues = _mapPut(this.resolvedValues, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecutionResultConditionResolved}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResultConditionResolved build() {
			_checkSingleUse();

			return new ExecutionResultConditionResolved(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionResultConditionResolved}
	 */
	public static final JsonpDeserializer<ExecutionResultConditionResolved> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionResultConditionResolved::setupExecutionResultConditionResolvedDeserializer);

	protected static void setupExecutionResultConditionResolvedDeserializer(
			ObjectDeserializer<ExecutionResultConditionResolved.Builder> op) {

		op.add(Builder::resolvedValues, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"resolved_values");

	}

}
