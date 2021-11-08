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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ChainInput
@JsonpDeserializable
public class ChainInput implements InputVariant, JsonpSerializable {
	private final List<Input> inputs;

	// ---------------------------------------------------------------------------------------------

	private ChainInput(Builder builder) {

		this.inputs = ModelTypeHelper.unmodifiableRequired(builder.inputs, this, "inputs");

	}

	public static ChainInput of(Function<Builder, ObjectBuilder<ChainInput>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Input} variant type
	 */
	@Override
	public String _variantType() {
		return "chain";
	}

	/**
	 * Required - API name: {@code inputs}
	 */
	public final List<Input> inputs() {
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

		if (ModelTypeHelper.isDefined(this.inputs)) {
			generator.writeKey("inputs");
			generator.writeStartArray();
			for (Input item0 : this.inputs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChainInput}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ChainInput> {
		private List<Input> inputs;

		/**
		 * Required - API name: {@code inputs}
		 */
		public final Builder inputs(List<Input> value) {
			this.inputs = value;
			return this;
		}

		/**
		 * Required - API name: {@code inputs}
		 */
		public final Builder inputs(Input... value) {
			this.inputs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code inputs}
		 */
		@SafeVarargs
		public final Builder inputs(Function<Input.Builder, ObjectBuilder<Input>>... fns) {
			this.inputs = new ArrayList<>(fns.length);
			for (Function<Input.Builder, ObjectBuilder<Input>> fn : fns) {
				this.inputs.add(fn.apply(new Input.Builder()).build());
			}
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
			ChainInput::setupChainInputDeserializer, Builder::build);

	protected static void setupChainInputDeserializer(DelegatingDeserializer<ChainInput.Builder> op) {

		op.add(Builder::inputs, JsonpDeserializer.arrayDeserializer(Input._DESERIALIZER), "inputs");

	}

}
