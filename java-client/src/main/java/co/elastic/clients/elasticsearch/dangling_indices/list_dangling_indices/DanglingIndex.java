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

package co.elastic.clients.elasticsearch.dangling_indices.list_dangling_indices;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: dangling_indices.list_dangling_indices.DanglingIndex
public final class DanglingIndex implements JsonpSerializable {
	private final String indexName;

	private final String indexUuid;

	private final JsonValue creationDateMillis;

	private final List<String> nodeIds;

	// ---------------------------------------------------------------------------------------------

	public DanglingIndex(Builder builder) {

		this.indexName = Objects.requireNonNull(builder.indexName, "index_name");
		this.indexUuid = Objects.requireNonNull(builder.indexUuid, "index_uuid");
		this.creationDateMillis = Objects.requireNonNull(builder.creationDateMillis, "creation_date_millis");
		this.nodeIds = Objects.requireNonNull(builder.nodeIds, "node_ids");

	}

	/**
	 * API name: {@code index_name}
	 */
	public String indexName() {
		return this.indexName;
	}

	/**
	 * API name: {@code index_uuid}
	 */
	public String indexUuid() {
		return this.indexUuid;
	}

	/**
	 * API name: {@code creation_date_millis}
	 */
	public JsonValue creationDateMillis() {
		return this.creationDateMillis;
	}

	/**
	 * API name: {@code node_ids}
	 */
	public List<String> nodeIds() {
		return this.nodeIds;
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

		generator.writeKey("index_name");
		generator.write(this.indexName);

		generator.writeKey("index_uuid");
		generator.write(this.indexUuid);

		generator.writeKey("creation_date_millis");
		generator.write(this.creationDateMillis);

		generator.writeKey("node_ids");
		generator.writeStartArray();
		for (String item0 : this.nodeIds) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DanglingIndex}.
	 */
	public static class Builder implements ObjectBuilder<DanglingIndex> {
		private String indexName;

		private String indexUuid;

		private JsonValue creationDateMillis;

		private List<String> nodeIds;

		/**
		 * API name: {@code index_name}
		 */
		public Builder indexName(String value) {
			this.indexName = value;
			return this;
		}

		/**
		 * API name: {@code index_uuid}
		 */
		public Builder indexUuid(String value) {
			this.indexUuid = value;
			return this;
		}

		/**
		 * API name: {@code creation_date_millis}
		 */
		public Builder creationDateMillis(JsonValue value) {
			this.creationDateMillis = value;
			return this;
		}

		/**
		 * API name: {@code node_ids}
		 */
		public Builder nodeIds(List<String> value) {
			this.nodeIds = value;
			return this;
		}

		/**
		 * API name: {@code node_ids}
		 */
		public Builder nodeIds(String... value) {
			this.nodeIds = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodeIds(List)}, creating the list if needed.
		 */
		public Builder addNodeIds(String value) {
			if (this.nodeIds == null) {
				this.nodeIds = new ArrayList<>();
			}
			this.nodeIds.add(value);
			return this;
		}

		/**
		 * Builds a {@link DanglingIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DanglingIndex build() {

			return new DanglingIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DanglingIndex}
	 */
	public static final JsonpDeserializer<DanglingIndex> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DanglingIndex::setupDanglingIndexDeserializer);

	protected static void setupDanglingIndexDeserializer(DelegatingDeserializer<DanglingIndex.Builder> op) {

		op.add(Builder::indexName, JsonpDeserializer.stringDeserializer(), "index_name");
		op.add(Builder::indexUuid, JsonpDeserializer.stringDeserializer(), "index_uuid");
		op.add(Builder::creationDateMillis, JsonpDeserializer.jsonValueDeserializer(), "creation_date_millis");
		op.add(Builder::nodeIds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"node_ids");

	}

}
