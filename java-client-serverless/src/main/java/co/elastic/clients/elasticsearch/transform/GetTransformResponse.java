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

import co.elastic.clients.elasticsearch.transform.get_transform.TransformSummary;
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
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#transform.get_transform.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetTransformResponse implements JsonpSerializable {
	private final long count;

	private final List<TransformSummary> transforms;

	// ---------------------------------------------------------------------------------------------

	private GetTransformResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.transforms = ApiTypeHelper.unmodifiableRequired(builder.transforms, this, "transforms");

	}

	public static GetTransformResponse of(Function<Builder, ObjectBuilder<GetTransformResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code transforms}
	 */
	public final List<TransformSummary> transforms() {
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

		if (ApiTypeHelper.isDefined(this.transforms)) {
			generator.writeKey("transforms");
			generator.writeStartArray();
			for (TransformSummary item0 : this.transforms) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link GetTransformResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetTransformResponse> {
		private Long count;

		private List<TransformSummary> transforms;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code transforms}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>transforms</code>.
		 */
		public final Builder transforms(List<TransformSummary> list) {
			this.transforms = _listAddAll(this.transforms, list);
			return this;
		}

		/**
		 * Required - API name: {@code transforms}
		 * <p>
		 * Adds one or more values to <code>transforms</code>.
		 */
		public final Builder transforms(TransformSummary value, TransformSummary... values) {
			this.transforms = _listAdd(this.transforms, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code transforms}
		 * <p>
		 * Adds a value to <code>transforms</code> using a builder lambda.
		 */
		public final Builder transforms(Function<TransformSummary.Builder, ObjectBuilder<TransformSummary>> fn) {
			return transforms(fn.apply(new TransformSummary.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetTransformResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTransformResponse build() {
			_checkSingleUse();

			return new GetTransformResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTransformResponse}
	 */
	public static final JsonpDeserializer<GetTransformResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetTransformResponse::setupGetTransformResponseDeserializer);

	protected static void setupGetTransformResponseDeserializer(ObjectDeserializer<GetTransformResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::transforms, JsonpDeserializer.arrayDeserializer(TransformSummary._DESERIALIZER), "transforms");

	}

}
