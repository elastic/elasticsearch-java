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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch.snapshot.cleanup_repository.CleanupRepositoryResults;
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

// typedef: snapshot.cleanup_repository.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot.cleanup_repository.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class CleanupRepositoryResponse implements JsonpSerializable {
	private final CleanupRepositoryResults results;

	// ---------------------------------------------------------------------------------------------

	private CleanupRepositoryResponse(Builder builder) {

		this.results = ApiTypeHelper.requireNonNull(builder.results, this, "results");

	}

	public static CleanupRepositoryResponse of(Function<Builder, ObjectBuilder<CleanupRepositoryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Statistics for cleanup operations.
	 * <p>
	 * API name: {@code results}
	 */
	public final CleanupRepositoryResults results() {
		return this.results;
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

		generator.writeKey("results");
		this.results.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CleanupRepositoryResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CleanupRepositoryResponse> {
		private CleanupRepositoryResults results;

		/**
		 * Required - Statistics for cleanup operations.
		 * <p>
		 * API name: {@code results}
		 */
		public final Builder results(CleanupRepositoryResults value) {
			this.results = value;
			return this;
		}

		/**
		 * Required - Statistics for cleanup operations.
		 * <p>
		 * API name: {@code results}
		 */
		public final Builder results(
				Function<CleanupRepositoryResults.Builder, ObjectBuilder<CleanupRepositoryResults>> fn) {
			return this.results(fn.apply(new CleanupRepositoryResults.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CleanupRepositoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CleanupRepositoryResponse build() {
			_checkSingleUse();

			return new CleanupRepositoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CleanupRepositoryResponse}
	 */
	public static final JsonpDeserializer<CleanupRepositoryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CleanupRepositoryResponse::setupCleanupRepositoryResponseDeserializer);

	protected static void setupCleanupRepositoryResponseDeserializer(
			ObjectDeserializer<CleanupRepositoryResponse.Builder> op) {

		op.add(Builder::results, CleanupRepositoryResults._DESERIALIZER, "results");

	}

}
