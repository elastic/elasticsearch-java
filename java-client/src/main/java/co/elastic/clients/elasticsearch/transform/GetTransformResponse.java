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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.EmptyTransform;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform.Response
@JsonpDeserializable
public final class GetTransformResponse implements JsonpSerializable {
	private final long count;

	private final List<EmptyTransform> transforms;

	// ---------------------------------------------------------------------------------------------

	public GetTransformResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.transforms = Objects.requireNonNull(builder.transforms, "transforms");

	}

	/**
	 * API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * API name: {@code transforms}
	 */
	public List<EmptyTransform> transforms() {
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("transforms");
		generator.writeStartArray();
		for (EmptyTransform item0 : this.transforms) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTransformResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetTransformResponse> {
		private Long count;

		private List<EmptyTransform> transforms;

		/**
		 * API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code transforms}
		 */
		public Builder transforms(List<EmptyTransform> value) {
			this.transforms = value;
			return this;
		}

		/**
		 * API name: {@code transforms}
		 */
		public Builder transforms(EmptyTransform... value) {
			this.transforms = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #transforms(List)}, creating the list if needed.
		 */
		public Builder addTransforms(EmptyTransform value) {
			if (this.transforms == null) {
				this.transforms = new ArrayList<>();
			}
			this.transforms.add(value);
			return this;
		}

		/**
		 * Set {@link #transforms(List)} to a singleton list.
		 */
		public Builder transforms(Function<EmptyTransform.Builder, ObjectBuilder<EmptyTransform>> fn) {
			return this.transforms(fn.apply(new EmptyTransform.Builder()).build());
		}

		/**
		 * Add a value to {@link #transforms(List)}, creating the list if needed.
		 */
		public Builder addTransforms(Function<EmptyTransform.Builder, ObjectBuilder<EmptyTransform>> fn) {
			return this.addTransforms(fn.apply(new EmptyTransform.Builder()).build());
		}

		/**
		 * Builds a {@link GetTransformResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTransformResponse build() {

			return new GetTransformResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTransformResponse}
	 */
	public static final JsonpDeserializer<GetTransformResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetTransformResponse::setupGetTransformResponseDeserializer, Builder::build);

	protected static void setupGetTransformResponseDeserializer(
			DelegatingDeserializer<GetTransformResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::transforms, JsonpDeserializer.arrayDeserializer(EmptyTransform._DESERIALIZER), "transforms");

	}

}
