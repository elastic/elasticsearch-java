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

package co.elastic.clients.elasticsearch.snapshot.cleanup_repository;

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
import java.util.Objects;
import java.util.function.Function;

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

// typedef: snapshot.cleanup_repository.CleanupRepositoryResults

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#snapshot.cleanup_repository.CleanupRepositoryResults">API
 *      specification</a>
 */
@JsonpDeserializable
public class CleanupRepositoryResults implements JsonpSerializable {
	private final long deletedBlobs;

	private final long deletedBytes;

	// ---------------------------------------------------------------------------------------------

	private CleanupRepositoryResults(Builder builder) {

		this.deletedBlobs = ApiTypeHelper.requireNonNull(builder.deletedBlobs, this, "deletedBlobs");
		this.deletedBytes = ApiTypeHelper.requireNonNull(builder.deletedBytes, this, "deletedBytes");

	}

	public static CleanupRepositoryResults of(Function<Builder, ObjectBuilder<CleanupRepositoryResults>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Number of binary large objects (blobs) removed during cleanup.
	 * <p>
	 * API name: {@code deleted_blobs}
	 */
	public final long deletedBlobs() {
		return this.deletedBlobs;
	}

	/**
	 * Required - Number of bytes freed by cleanup operations.
	 * <p>
	 * API name: {@code deleted_bytes}
	 */
	public final long deletedBytes() {
		return this.deletedBytes;
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

		generator.writeKey("deleted_blobs");
		generator.write(this.deletedBlobs);

		generator.writeKey("deleted_bytes");
		generator.write(this.deletedBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CleanupRepositoryResults}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CleanupRepositoryResults> {
		private Long deletedBlobs;

		private Long deletedBytes;

		/**
		 * Required - Number of binary large objects (blobs) removed during cleanup.
		 * <p>
		 * API name: {@code deleted_blobs}
		 */
		public final Builder deletedBlobs(long value) {
			this.deletedBlobs = value;
			return this;
		}

		/**
		 * Required - Number of bytes freed by cleanup operations.
		 * <p>
		 * API name: {@code deleted_bytes}
		 */
		public final Builder deletedBytes(long value) {
			this.deletedBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CleanupRepositoryResults}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CleanupRepositoryResults build() {
			_checkSingleUse();

			return new CleanupRepositoryResults(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CleanupRepositoryResults}
	 */
	public static final JsonpDeserializer<CleanupRepositoryResults> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CleanupRepositoryResults::setupCleanupRepositoryResultsDeserializer);

	protected static void setupCleanupRepositoryResultsDeserializer(
			ObjectDeserializer<CleanupRepositoryResults.Builder> op) {

		op.add(Builder::deletedBlobs, JsonpDeserializer.longDeserializer(), "deleted_blobs");
		op.add(Builder::deletedBytes, JsonpDeserializer.longDeserializer(), "deleted_bytes");

	}

}
