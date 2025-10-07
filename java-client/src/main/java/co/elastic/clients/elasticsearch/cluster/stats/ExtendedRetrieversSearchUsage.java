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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: cluster.stats.ExtendedRetrieversSearchUsage

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ExtendedRetrieversSearchUsage">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExtendedRetrieversSearchUsage implements JsonpSerializable {
	@Nullable
	private final ExtendedTextSimilarityRetrieverUsage textSimilarityReranker;

	// ---------------------------------------------------------------------------------------------

	private ExtendedRetrieversSearchUsage(Builder builder) {

		this.textSimilarityReranker = builder.textSimilarityReranker;

	}

	public static ExtendedRetrieversSearchUsage of(Function<Builder, ObjectBuilder<ExtendedRetrieversSearchUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code text_similarity_reranker}
	 */
	@Nullable
	public final ExtendedTextSimilarityRetrieverUsage textSimilarityReranker() {
		return this.textSimilarityReranker;
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

		if (this.textSimilarityReranker != null) {
			generator.writeKey("text_similarity_reranker");
			this.textSimilarityReranker.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExtendedRetrieversSearchUsage}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExtendedRetrieversSearchUsage> {
		@Nullable
		private ExtendedTextSimilarityRetrieverUsage textSimilarityReranker;

		/**
		 * API name: {@code text_similarity_reranker}
		 */
		public final Builder textSimilarityReranker(@Nullable ExtendedTextSimilarityRetrieverUsage value) {
			this.textSimilarityReranker = value;
			return this;
		}

		/**
		 * API name: {@code text_similarity_reranker}
		 */
		public final Builder textSimilarityReranker(
				Function<ExtendedTextSimilarityRetrieverUsage.Builder, ObjectBuilder<ExtendedTextSimilarityRetrieverUsage>> fn) {
			return this.textSimilarityReranker(fn.apply(new ExtendedTextSimilarityRetrieverUsage.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExtendedRetrieversSearchUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedRetrieversSearchUsage build() {
			_checkSingleUse();

			return new ExtendedRetrieversSearchUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExtendedRetrieversSearchUsage}
	 */
	public static final JsonpDeserializer<ExtendedRetrieversSearchUsage> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExtendedRetrieversSearchUsage::setupExtendedRetrieversSearchUsageDeserializer);

	protected static void setupExtendedRetrieversSearchUsageDeserializer(
			ObjectDeserializer<ExtendedRetrieversSearchUsage.Builder> op) {

		op.add(Builder::textSimilarityReranker, ExtendedTextSimilarityRetrieverUsage._DESERIALIZER,
				"text_similarity_reranker");

	}

}
