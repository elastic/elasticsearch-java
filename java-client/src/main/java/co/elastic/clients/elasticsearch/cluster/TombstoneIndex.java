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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster._types.TombstoneIndex
public final class TombstoneIndex implements JsonpSerializable {
	private final String indexName;

	private final String indexUuid;

	// ---------------------------------------------------------------------------------------------

	public TombstoneIndex(Builder builder) {

		this.indexName = Objects.requireNonNull(builder.indexName, "index_name");
		this.indexUuid = Objects.requireNonNull(builder.indexUuid, "index_uuid");

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TombstoneIndex}.
	 */
	public static class Builder implements ObjectBuilder<TombstoneIndex> {
		private String indexName;

		private String indexUuid;

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
		 * Builds a {@link TombstoneIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TombstoneIndex build() {

			return new TombstoneIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TombstoneIndex}
	 */
	public static final JsonpDeserializer<TombstoneIndex> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TombstoneIndex::setupTombstoneIndexDeserializer);

	protected static void setupTombstoneIndexDeserializer(DelegatingDeserializer<TombstoneIndex.Builder> op) {

		op.add(Builder::indexName, JsonpDeserializer.stringDeserializer(), "index_name");
		op.add(Builder::indexUuid, JsonpDeserializer.stringDeserializer(), "index_uuid");

	}

}
