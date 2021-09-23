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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ChainTransform
public final class ChainTransform implements Transform, JsonpSerializable {
	private final List<Transform> transforms;

	// ---------------------------------------------------------------------------------------------

	public ChainTransform(Builder builder) {

		this.transforms = Objects.requireNonNull(builder.transforms, "transforms");

	}

	/**
	 * {@link Transform} variant type
	 */
	@Override
	public String _type() {
		return "chain";
	}

	/**
	 * API name: {@code transforms}
	 */
	public List<Transform> transforms() {
		return this.transforms;
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
		generator.writeStartObject(_type());

		generator.writeKey("transforms");
		generator.writeStartArray();
		for (Transform item0 : this.transforms) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChainTransform}.
	 */
	public static class Builder implements ObjectBuilder<ChainTransform> {
		private List<Transform> transforms;

		/**
		 * API name: {@code transforms}
		 */
		public Builder transforms(List<Transform> value) {
			this.transforms = value;
			return this;
		}

		/**
		 * API name: {@code transforms}
		 */
		public Builder transforms(Transform... value) {
			this.transforms = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #transforms(List)}, creating the list if needed.
		 */
		public Builder addTransforms(Transform value) {
			if (this.transforms == null) {
				this.transforms = new ArrayList<>();
			}
			this.transforms.add(value);
			return this;
		}

		/**
		 * Set {@link #transforms(List)} to a singleton list.
		 */
		public Builder transforms(Function<Transform.Builder, ObjectBuilder<Transform>> fn) {
			return this.transforms(fn.apply(new Transform.Builder()).build());
		}

		/**
		 * Add a value to {@link #transforms(List)}, creating the list if needed.
		 */
		public Builder addTransforms(Function<Transform.Builder, ObjectBuilder<Transform>> fn) {
			return this.addTransforms(fn.apply(new Transform.Builder()).build());
		}

		/**
		 * Builds a {@link ChainTransform}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChainTransform build() {

			return new ChainTransform(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<ChainTransform.Builder, ChainTransform.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(ChainTransform::setupChainTransformDeserializer);

	protected static void setupChainTransformDeserializer(DelegatingDeserializer<ChainTransform.Builder> op) {

		op.add(Builder::transforms, JsonpDeserializer.arrayDeserializer(Transform.DESERIALIZER), "transforms");

	}

}
