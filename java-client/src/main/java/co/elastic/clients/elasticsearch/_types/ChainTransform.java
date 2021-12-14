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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ChainTransform

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_types/Transform.ts#L36-L38">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChainTransform implements TransformVariant, JsonpSerializable {
	private final List<Transform> transforms;

	// ---------------------------------------------------------------------------------------------

	private ChainTransform(Builder builder) {

		this.transforms = ApiTypeHelper.unmodifiableRequired(builder.transforms, this, "transforms");

	}

	public static ChainTransform of(Function<Builder, ObjectBuilder<ChainTransform>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Transform variant kind.
	 */
	@Override
	public Transform.Kind _transformKind() {
		return Transform.Kind.Chain;
	}

	/**
	 * Required - API name: {@code transforms}
	 */
	public final List<Transform> transforms() {
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

		if (ApiTypeHelper.isDefined(this.transforms)) {
			generator.writeKey("transforms");
			generator.writeStartArray();
			for (Transform item0 : this.transforms) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChainTransform}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ChainTransform> {
		private List<Transform> transforms;

		/**
		 * Required - API name: {@code transforms}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>transforms</code>.
		 */
		public final Builder transforms(List<Transform> list) {
			this.transforms = _listAddAll(this.transforms, list);
			return this;
		}

		/**
		 * Required - API name: {@code transforms}
		 * <p>
		 * Adds one or more values to <code>transforms</code>.
		 */
		public final Builder transforms(Transform value, Transform... values) {
			this.transforms = _listAdd(this.transforms, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code transforms}
		 * <p>
		 * Adds a value to <code>transforms</code> using a builder lambda.
		 */
		public final Builder transforms(Function<Transform.Builder, ObjectBuilder<Transform>> fn) {
			return transforms(fn.apply(new Transform.Builder()).build());
		}

		/**
		 * Builds a {@link ChainTransform}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChainTransform build() {
			_checkSingleUse();

			return new ChainTransform(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChainTransform}
	 */
	public static final JsonpDeserializer<ChainTransform> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ChainTransform::setupChainTransformDeserializer);

	protected static void setupChainTransformDeserializer(ObjectDeserializer<ChainTransform.Builder> op) {

		op.add(Builder::transforms, JsonpDeserializer.arrayDeserializer(Transform._DESERIALIZER), "transforms");

	}

}
