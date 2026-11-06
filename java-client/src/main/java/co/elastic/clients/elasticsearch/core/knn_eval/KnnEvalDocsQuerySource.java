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
import java.lang.Integer;
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

// typedef: _global.knn_eval.KnnEvalDocsQuerySource

/**
 * Samples the query vectors from the stored documents.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.knn_eval.KnnEvalDocsQuerySource">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnEvalDocsQuerySource implements KnnEvalQuerySourceVariant, JsonpSerializable {
	private final int size;

	@Nullable
	private final Integer seed;

	// ---------------------------------------------------------------------------------------------

	private KnnEvalDocsQuerySource(Builder builder) {

		this.size = ApiTypeHelper.requireNonNull(builder.size, this, "size", 0);
		this.seed = builder.seed;

	}

	public static KnnEvalDocsQuerySource of(Function<Builder, ObjectBuilder<KnnEvalDocsQuerySource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * KnnEvalQuerySource variant kind.
	 */
	@Override
	public KnnEvalQuerySource.Kind _knnEvalQuerySourceKind() {
		return KnnEvalQuerySource.Kind.Docs;
	}

	/**
	 * Required - The number of documents to sample, from 1 to 1000.
	 * <p>
	 * API name: {@code size}
	 */
	public final int size() {
		return this.size;
	}

	/**
	 * The seed of the sampling, to sample the same documents across requests.
	 * <p>
	 * API name: {@code seed}
	 */
	@Nullable
	public final Integer seed() {
		return this.seed;
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

		generator.write("from", "docs");

		generator.writeKey("size");
		generator.write(this.size);

		if (this.seed != null) {
			generator.writeKey("seed");
			generator.write(this.seed);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnEvalDocsQuerySource}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<KnnEvalDocsQuerySource> {
		private Integer size;

		@Nullable
		private Integer seed;

		public Builder() {
		}
		private Builder(KnnEvalDocsQuerySource instance) {
			this.size = instance.size;
			this.seed = instance.seed;

		}
		/**
		 * Required - The number of documents to sample, from 1 to 1000.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(int value) {
			this.size = value;
			return this;
		}

		/**
		 * The seed of the sampling, to sample the same documents across requests.
		 * <p>
		 * API name: {@code seed}
		 */
		public final Builder seed(@Nullable Integer value) {
			this.seed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnEvalDocsQuerySource}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnEvalDocsQuerySource build() {
			_checkSingleUse();

			return new KnnEvalDocsQuerySource(this);
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
	 * Json deserializer for {@link KnnEvalDocsQuerySource}
	 */
	public static final JsonpDeserializer<KnnEvalDocsQuerySource> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KnnEvalDocsQuerySource::setupKnnEvalDocsQuerySourceDeserializer);

	protected static void setupKnnEvalDocsQuerySourceDeserializer(
			ObjectDeserializer<KnnEvalDocsQuerySource.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::seed, JsonpDeserializer.integerDeserializer(), "seed");

		op.ignore("from");
	}

}
