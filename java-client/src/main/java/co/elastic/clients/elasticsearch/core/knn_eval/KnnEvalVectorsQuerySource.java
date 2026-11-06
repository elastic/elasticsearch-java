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

// typedef: _global.knn_eval.KnnEvalVectorsQuerySource

/**
 * Uses the query vectors in the request.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.knn_eval.KnnEvalVectorsQuerySource">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnEvalVectorsQuerySource implements KnnEvalQuerySourceVariant, JsonpSerializable {
	private final List<KnnEvalQueryVector> vectors;

	// ---------------------------------------------------------------------------------------------

	private KnnEvalVectorsQuerySource(Builder builder) {

		this.vectors = ApiTypeHelper.unmodifiableRequired(builder.vectors, this, "vectors");

	}

	public static KnnEvalVectorsQuerySource of(Function<Builder, ObjectBuilder<KnnEvalVectorsQuerySource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * KnnEvalQuerySource variant kind.
	 */
	@Override
	public KnnEvalQuerySource.Kind _knnEvalQuerySourceKind() {
		return KnnEvalQuerySource.Kind.Vectors;
	}

	/**
	 * Required - The query vectors, from 1 to 1000 entries with unique identifiers.
	 * <p>
	 * API name: {@code vectors}
	 */
	public final List<KnnEvalQueryVector> vectors() {
		return this.vectors;
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

		generator.write("from", "vectors");

		if (ApiTypeHelper.isDefined(this.vectors)) {
			generator.writeKey("vectors");
			generator.writeStartArray();
			for (KnnEvalQueryVector item0 : this.vectors) {
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
	 * Builder for {@link KnnEvalVectorsQuerySource}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<KnnEvalVectorsQuerySource> {
		private List<KnnEvalQueryVector> vectors;

		public Builder() {
		}
		private Builder(KnnEvalVectorsQuerySource instance) {
			this.vectors = instance.vectors;

		}
		/**
		 * Required - The query vectors, from 1 to 1000 entries with unique identifiers.
		 * <p>
		 * API name: {@code vectors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>vectors</code>.
		 */
		public final Builder vectors(List<KnnEvalQueryVector> list) {
			this.vectors = _listAddAll(this.vectors, list);
			return this;
		}

		/**
		 * Required - The query vectors, from 1 to 1000 entries with unique identifiers.
		 * <p>
		 * API name: {@code vectors}
		 * <p>
		 * Adds one or more values to <code>vectors</code>.
		 */
		public final Builder vectors(KnnEvalQueryVector value, KnnEvalQueryVector... values) {
			this.vectors = _listAdd(this.vectors, value, values);
			return this;
		}

		/**
		 * Required - The query vectors, from 1 to 1000 entries with unique identifiers.
		 * <p>
		 * API name: {@code vectors}
		 * <p>
		 * Adds a value to <code>vectors</code> using a builder lambda.
		 */
		public final Builder vectors(Function<KnnEvalQueryVector.Builder, ObjectBuilder<KnnEvalQueryVector>> fn) {
			return vectors(fn.apply(new KnnEvalQueryVector.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnEvalVectorsQuerySource}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnEvalVectorsQuerySource build() {
			_checkSingleUse();

			return new KnnEvalVectorsQuerySource(this);
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
	 * Json deserializer for {@link KnnEvalVectorsQuerySource}
	 */
	public static final JsonpDeserializer<KnnEvalVectorsQuerySource> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KnnEvalVectorsQuerySource::setupKnnEvalVectorsQuerySourceDeserializer);

	protected static void setupKnnEvalVectorsQuerySourceDeserializer(
			ObjectDeserializer<KnnEvalVectorsQuerySource.Builder> op) {

		op.add(Builder::vectors, JsonpDeserializer.arrayDeserializer(KnnEvalQueryVector._DESERIALIZER), "vectors");

		op.ignore("from");
	}

}
