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

package co.elastic.clients.elasticsearch.indices;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.DataStreamIndex

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.DataStreamIndex">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamIndex implements JsonpSerializable {
	private final String indexName;

	private final String indexUuid;

	// ---------------------------------------------------------------------------------------------

	private DataStreamIndex(Builder builder) {

		this.indexName = ApiTypeHelper.requireNonNull(builder.indexName, this, "indexName");
		this.indexUuid = ApiTypeHelper.requireNonNull(builder.indexUuid, this, "indexUuid");

	}

	public static DataStreamIndex of(Function<Builder, ObjectBuilder<DataStreamIndex>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Name of the backing index.
	 * <p>
	 * API name: {@code index_name}
	 */
	public final String indexName() {
		return this.indexName;
	}

	/**
	 * Required - Universally unique identifier (UUID) for the index.
	 * <p>
	 * API name: {@code index_uuid}
	 */
	public final String indexUuid() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamIndex}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DataStreamIndex> {
		private String indexName;

		private String indexUuid;

		/**
		 * Required - Name of the backing index.
		 * <p>
		 * API name: {@code index_name}
		 */
		public final Builder indexName(String value) {
			this.indexName = value;
			return this;
		}

		/**
		 * Required - Universally unique identifier (UUID) for the index.
		 * <p>
		 * API name: {@code index_uuid}
		 */
		public final Builder indexUuid(String value) {
			this.indexUuid = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamIndex build() {
			_checkSingleUse();

			return new DataStreamIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamIndex}
	 */
	public static final JsonpDeserializer<DataStreamIndex> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DataStreamIndex::setupDataStreamIndexDeserializer);

	protected static void setupDataStreamIndexDeserializer(ObjectDeserializer<DataStreamIndex.Builder> op) {

		op.add(Builder::indexName, JsonpDeserializer.stringDeserializer(), "index_name");
		op.add(Builder::indexUuid, JsonpDeserializer.stringDeserializer(), "index_uuid");

	}

}
