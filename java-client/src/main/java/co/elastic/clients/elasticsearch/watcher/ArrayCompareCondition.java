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
import java.lang.String;
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

// typedef: watcher._types.ArrayCompareCondition

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ArrayCompareCondition">API
 *      specification</a>
 */
@JsonpDeserializable
public class ArrayCompareCondition implements JsonpSerializable {
	private final ConditionOp operator;

	private final ArrayCompareOpParams params;

	private final String path;

	// ---------------------------------------------------------------------------------------------

	private ArrayCompareCondition(Builder builder) {

		this.operator = ApiTypeHelper.requireNonNull(builder.operator, this, "operator");
		this.params = ApiTypeHelper.requireNonNull(builder.params, this, "params");

		this.path = ApiTypeHelper.requireNonNull(builder.path, this, "path");

	}

	public static ArrayCompareCondition of(Function<Builder, ObjectBuilder<ArrayCompareCondition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required -
	 */
	public final ConditionOp operator() {
		return this.operator;
	}

	/**
	 * Required -
	 */
	public final ArrayCompareOpParams params() {
		return this.params;
	}

	/**
	 * Required - API name: {@code path}
	 */
	public final String path() {
		return this.path;
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
		generator.writeKey(this.operator.jsonValue());
		this.params.serialize(generator, mapper);

		generator.writeKey("path");
		generator.write(this.path);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ArrayCompareCondition}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ArrayCompareCondition> {
		private ConditionOp operator;

		private ArrayCompareOpParams params;

		/**
		 * Required -
		 */
		public final Builder operator(ConditionOp value) {
			this.operator = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder params(ArrayCompareOpParams value) {
			this.params = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder params(Function<ArrayCompareOpParams.Builder, ObjectBuilder<ArrayCompareOpParams>> fn) {
			return this.params(fn.apply(new ArrayCompareOpParams.Builder()).build());
		}

		private String path;

		/**
		 * Required - API name: {@code path}
		 */
		public final Builder path(String value) {
			this.path = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ArrayCompareCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ArrayCompareCondition build() {
			_checkSingleUse();

			return new ArrayCompareCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ArrayCompareCondition}
	 */
	public static final JsonpDeserializer<ArrayCompareCondition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ArrayCompareCondition::setupArrayCompareConditionDeserializer);

	protected static void setupArrayCompareConditionDeserializer(ObjectDeserializer<ArrayCompareCondition.Builder> op) {

		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.operator(ConditionOp._DESERIALIZER.parse(name));
			builder.params(ArrayCompareOpParams._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
