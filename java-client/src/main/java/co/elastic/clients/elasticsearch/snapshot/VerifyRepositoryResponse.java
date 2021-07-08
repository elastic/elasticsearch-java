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

import co.elastic.clients.elasticsearch.snapshot.verify_repository.CompactNodeInfo;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.verify_repository.Response
public final class VerifyRepositoryResponse implements ToJsonp {
	private final Map<String, CompactNodeInfo> nodes;

	// ---------------------------------------------------------------------------------------------

	protected VerifyRepositoryResponse(Builder builder) {

		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");

	}

	/**
	 * API name: {@code nodes}
	 */
	public Map<String, CompactNodeInfo> nodes() {
		return this.nodes;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("nodes");
		generator.writeStartObject();
		for (Map.Entry<String, CompactNodeInfo> item0 : this.nodes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VerifyRepositoryResponse}.
	 */
	public static class Builder implements ObjectBuilder<VerifyRepositoryResponse> {
		private Map<String, CompactNodeInfo> nodes;

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(Map<String, CompactNodeInfo> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, CompactNodeInfo value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<CompactNodeInfo.Builder, ObjectBuilder<CompactNodeInfo>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new CompactNodeInfo.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, Function<CompactNodeInfo.Builder, ObjectBuilder<CompactNodeInfo>> fn) {
			return this.putNodes(key, fn.apply(new CompactNodeInfo.Builder()).build());
		}

		/**
		 * Builds a {@link VerifyRepositoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VerifyRepositoryResponse build() {

			return new VerifyRepositoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for VerifyRepositoryResponse
	 */
	public static final JsonpDeserializer<VerifyRepositoryResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, VerifyRepositoryResponse::setupVerifyRepositoryResponseDeserializer);

	protected static void setupVerifyRepositoryResponseDeserializer(
			DelegatingDeserializer<VerifyRepositoryResponse.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(CompactNodeInfo.DESERIALIZER), "nodes");

	}

}
