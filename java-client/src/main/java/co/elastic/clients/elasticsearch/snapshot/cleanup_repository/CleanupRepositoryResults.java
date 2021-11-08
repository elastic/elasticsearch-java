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

package co.elastic.clients.elasticsearch.snapshot.cleanup_repository;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: snapshot.cleanup_repository.CleanupRepositoryResults
@JsonpDeserializable
public class CleanupRepositoryResults implements JsonpSerializable {
	private final long deletedBlobs;

	private final long deletedBytes;

	// ---------------------------------------------------------------------------------------------

	private CleanupRepositoryResults(Builder builder) {

		this.deletedBlobs = ModelTypeHelper.requireNonNull(builder.deletedBlobs, this, "deletedBlobs");
		this.deletedBytes = ModelTypeHelper.requireNonNull(builder.deletedBytes, this, "deletedBytes");

	}

	public static CleanupRepositoryResults of(Function<Builder, ObjectBuilder<CleanupRepositoryResults>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code deleted_blobs}
	 */
	public final long deletedBlobs() {
		return this.deletedBlobs;
	}

	/**
	 * Required - API name: {@code deleted_bytes}
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CleanupRepositoryResults}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CleanupRepositoryResults> {
		private Long deletedBlobs;

		private Long deletedBytes;

		/**
		 * Required - API name: {@code deleted_blobs}
		 */
		public final Builder deletedBlobs(long value) {
			this.deletedBlobs = value;
			return this;
		}

		/**
		 * Required - API name: {@code deleted_bytes}
		 */
		public final Builder deletedBytes(long value) {
			this.deletedBytes = value;
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
			.lazy(Builder::new, CleanupRepositoryResults::setupCleanupRepositoryResultsDeserializer, Builder::build);

	protected static void setupCleanupRepositoryResultsDeserializer(
			DelegatingDeserializer<CleanupRepositoryResults.Builder> op) {

		op.add(Builder::deletedBlobs, JsonpDeserializer.longDeserializer(), "deleted_blobs");
		op.add(Builder::deletedBytes, JsonpDeserializer.longDeserializer(), "deleted_bytes");

	}

}
