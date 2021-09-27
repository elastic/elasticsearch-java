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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch.snapshot.cleanup_repository.CleanupRepositoryResults;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.cleanup_repository.Response
@JsonpDeserializable
public final class CleanupRepositoryResponse implements JsonpSerializable {
	private final CleanupRepositoryResults results;

	// ---------------------------------------------------------------------------------------------

	public CleanupRepositoryResponse(Builder builder) {

		this.results = Objects.requireNonNull(builder.results, "results");

	}

	/**
	 * API name: {@code results}
	 */
	public CleanupRepositoryResults results() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CleanupRepositoryResponse}.
	 */
	public static class Builder implements ObjectBuilder<CleanupRepositoryResponse> {
		private CleanupRepositoryResults results;

		/**
		 * API name: {@code results}
		 */
		public Builder results(CleanupRepositoryResults value) {
			this.results = value;
			return this;
		}

		/**
		 * API name: {@code results}
		 */
		public Builder results(Function<CleanupRepositoryResults.Builder, ObjectBuilder<CleanupRepositoryResults>> fn) {
			return this.results(fn.apply(new CleanupRepositoryResults.Builder()).build());
		}

		/**
		 * Builds a {@link CleanupRepositoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CleanupRepositoryResponse build() {

			return new CleanupRepositoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CleanupRepositoryResponse}
	 */
	public static final JsonpDeserializer<CleanupRepositoryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CleanupRepositoryResponse::setupCleanupRepositoryResponseDeserializer, Builder::build);

	protected static void setupCleanupRepositoryResponseDeserializer(
			DelegatingDeserializer<CleanupRepositoryResponse.Builder> op) {

		op.add(Builder::results, CleanupRepositoryResults._DESERIALIZER, "results");

	}

}
