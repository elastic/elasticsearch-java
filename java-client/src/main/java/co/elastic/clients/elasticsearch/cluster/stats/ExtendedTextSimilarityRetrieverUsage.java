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
import java.lang.Long;
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

// typedef: cluster.stats.ExtendedTextSimilarityRetrieverUsage

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ExtendedTextSimilarityRetrieverUsage">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExtendedTextSimilarityRetrieverUsage implements JsonpSerializable {
	@Nullable
	private final Long chunkRescorer;

	// ---------------------------------------------------------------------------------------------

	private ExtendedTextSimilarityRetrieverUsage(Builder builder) {

		this.chunkRescorer = builder.chunkRescorer;

	}

	public static ExtendedTextSimilarityRetrieverUsage of(
			Function<Builder, ObjectBuilder<ExtendedTextSimilarityRetrieverUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code chunk_rescorer}
	 */
	@Nullable
	public final Long chunkRescorer() {
		return this.chunkRescorer;
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

		if (this.chunkRescorer != null) {
			generator.writeKey("chunk_rescorer");
			generator.write(this.chunkRescorer);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExtendedTextSimilarityRetrieverUsage}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExtendedTextSimilarityRetrieverUsage> {
		@Nullable
		private Long chunkRescorer;

		/**
		 * API name: {@code chunk_rescorer}
		 */
		public final Builder chunkRescorer(@Nullable Long value) {
			this.chunkRescorer = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExtendedTextSimilarityRetrieverUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedTextSimilarityRetrieverUsage build() {
			_checkSingleUse();

			return new ExtendedTextSimilarityRetrieverUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExtendedTextSimilarityRetrieverUsage}
	 */
	public static final JsonpDeserializer<ExtendedTextSimilarityRetrieverUsage> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					ExtendedTextSimilarityRetrieverUsage::setupExtendedTextSimilarityRetrieverUsageDeserializer);

	protected static void setupExtendedTextSimilarityRetrieverUsageDeserializer(
			ObjectDeserializer<ExtendedTextSimilarityRetrieverUsage.Builder> op) {

		op.add(Builder::chunkRescorer, JsonpDeserializer.longDeserializer(), "chunk_rescorer");

	}

}
