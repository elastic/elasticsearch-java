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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch.indices.get_sample.RawDocument;
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

// typedef: indices.get_sample.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.get_sample.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetSampleResponse implements JsonpSerializable {
	private final List<RawDocument> sample;

	// ---------------------------------------------------------------------------------------------

	private GetSampleResponse(Builder builder) {

		this.sample = ApiTypeHelper.unmodifiableRequired(builder.sample, this, "sample");

	}

	public static GetSampleResponse of(Function<Builder, ObjectBuilder<GetSampleResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code sample}
	 */
	public final List<RawDocument> sample() {
		return this.sample;
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

		if (ApiTypeHelper.isDefined(this.sample)) {
			generator.writeKey("sample");
			generator.writeStartArray();
			for (RawDocument item0 : this.sample) {
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
	 * Builder for {@link GetSampleResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetSampleResponse> {
		private List<RawDocument> sample;

		/**
		 * Required - API name: {@code sample}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sample</code>.
		 */
		public final Builder sample(List<RawDocument> list) {
			this.sample = _listAddAll(this.sample, list);
			return this;
		}

		/**
		 * Required - API name: {@code sample}
		 * <p>
		 * Adds one or more values to <code>sample</code>.
		 */
		public final Builder sample(RawDocument value, RawDocument... values) {
			this.sample = _listAdd(this.sample, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code sample}
		 * <p>
		 * Adds a value to <code>sample</code> using a builder lambda.
		 */
		public final Builder sample(Function<RawDocument.Builder, ObjectBuilder<RawDocument>> fn) {
			return sample(fn.apply(new RawDocument.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSampleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSampleResponse build() {
			_checkSingleUse();

			return new GetSampleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetSampleResponse}
	 */
	public static final JsonpDeserializer<GetSampleResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetSampleResponse::setupGetSampleResponseDeserializer);

	protected static void setupGetSampleResponseDeserializer(ObjectDeserializer<GetSampleResponse.Builder> op) {

		op.add(Builder::sample, JsonpDeserializer.arrayDeserializer(RawDocument._DESERIALIZER), "sample");

	}

}
