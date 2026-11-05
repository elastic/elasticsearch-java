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

package co.elastic.clients.elasticsearch.core.knn_eval;

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
import java.lang.Float;
import java.lang.String;
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

// typedef: _global.knn_eval.KnnEvalQueryVector

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.knn_eval.KnnEvalQueryVector">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnEvalQueryVector implements JsonpSerializable {
	private final String id;

	private final List<Float> queryVector;

	// ---------------------------------------------------------------------------------------------

	private KnnEvalQueryVector(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.queryVector = ApiTypeHelper.unmodifiableRequired(builder.queryVector, this, "queryVector");

	}

	public static KnnEvalQueryVector of(Function<Builder, ObjectBuilder<KnnEvalQueryVector>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The identifier of the query, which identifies it in the
	 * <code>failures</code> of the response.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - The query vector.
	 * <p>
	 * API name: {@code query_vector}
	 */
	public final List<Float> queryVector() {
		return this.queryVector;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (ApiTypeHelper.isDefined(this.queryVector)) {
			generator.writeKey("query_vector");
			generator.writeStartArray();
			for (Float item0 : this.queryVector) {
				generator.write(item0);

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
	 * Builder for {@link KnnEvalQueryVector}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<KnnEvalQueryVector> {
		private String id;

		private List<Float> queryVector;

		public Builder() {
		}
		private Builder(KnnEvalQueryVector instance) {
			this.id = instance.id;
			this.queryVector = instance.queryVector;

		}
		/**
		 * Required - The identifier of the query, which identifies it in the
		 * <code>failures</code> of the response.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The query vector.
		 * <p>
		 * API name: {@code query_vector}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>queryVector</code>.
		 */
		public final Builder queryVector(List<Float> list) {
			this.queryVector = _listAddAll(this.queryVector, list);
			return this;
		}

		/**
		 * Required - The query vector.
		 * <p>
		 * API name: {@code query_vector}
		 * <p>
		 * Adds one or more values to <code>queryVector</code>.
		 */
		public final Builder queryVector(Float value, Float... values) {
			this.queryVector = _listAdd(this.queryVector, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnEvalQueryVector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnEvalQueryVector build() {
			_checkSingleUse();

			return new KnnEvalQueryVector(this);
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
	 * Json deserializer for {@link KnnEvalQueryVector}
	 */
	public static final JsonpDeserializer<KnnEvalQueryVector> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KnnEvalQueryVector::setupKnnEvalQueryVectorDeserializer);

	protected static void setupKnnEvalQueryVectorDeserializer(ObjectDeserializer<KnnEvalQueryVector.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::queryVector, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.floatDeserializer()),
				"query_vector");

	}

}
