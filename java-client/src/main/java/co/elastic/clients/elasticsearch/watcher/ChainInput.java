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
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: watcher._types.ChainInput

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.ChainInput">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChainInput implements InputVariant, JsonpSerializable {
	private final List<NamedValue<Input>> inputs;

	// ---------------------------------------------------------------------------------------------

	private ChainInput(Builder builder) {

		this.inputs = ApiTypeHelper.unmodifiableRequired(builder.inputs, this, "inputs");

	}

	public static ChainInput of(Function<Builder, ObjectBuilder<ChainInput>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Input variant kind.
	 */
	@Override
	public Input.Kind _inputKind() {
		return Input.Kind.Chain;
	}

	/**
	 * Required - API name: {@code inputs}
	 */
	public final List<NamedValue<Input>> inputs() {
		return this.inputs;
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

		if (ApiTypeHelper.isDefined(this.inputs)) {
			generator.writeKey("inputs");
			generator.writeStartArray();
			for (NamedValue<Input> item0 : this.inputs) {
				generator.writeStartObject();
				generator.writeKey(item0.name());
				item0.value().serialize(generator, mapper);

				generator.writeEnd();

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
	 * Builder for {@link ChainInput}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ChainInput> {
		private List<NamedValue<Input>> inputs;

		/**
		 * Required - API name: {@code inputs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>inputs</code>.
		 */
		public final Builder inputs(List<NamedValue<Input>> list) {
			this.inputs = _listAddAll(this.inputs, list);
			return this;
		}

		/**
		 * Required - API name: {@code inputs}
		 * <p>
		 * Adds one or more values to <code>inputs</code>.
		 */
		public final Builder inputs(NamedValue<Input> value, NamedValue<Input>... values) {
			this.inputs = _listAdd(this.inputs, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChainInput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChainInput build() {
			_checkSingleUse();

			return new ChainInput(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChainInput}
	 */
	public static final JsonpDeserializer<ChainInput> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ChainInput::setupChainInputDeserializer);

	protected static void setupChainInputDeserializer(ObjectDeserializer<ChainInput.Builder> op) {

		op.add(Builder::inputs, JsonpDeserializer.arrayDeserializer(NamedValue.deserializer(() -> Input._DESERIALIZER)),
				"inputs");

	}

}
