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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.stats.IndicesVersions
public final class IndicesVersions implements JsonpSerializable {
	private final Number indexCount;

	private final Number primaryShardCount;

	private final Number totalPrimaryBytes;

	private final String version;

	// ---------------------------------------------------------------------------------------------

	public IndicesVersions(Builder builder) {

		this.indexCount = Objects.requireNonNull(builder.indexCount, "index_count");
		this.primaryShardCount = Objects.requireNonNull(builder.primaryShardCount, "primary_shard_count");
		this.totalPrimaryBytes = Objects.requireNonNull(builder.totalPrimaryBytes, "total_primary_bytes");
		this.version = Objects.requireNonNull(builder.version, "version");

	}

	/**
	 * API name: {@code index_count}
	 */
	public Number indexCount() {
		return this.indexCount;
	}

	/**
	 * API name: {@code primary_shard_count}
	 */
	public Number primaryShardCount() {
		return this.primaryShardCount;
	}

	/**
	 * API name: {@code total_primary_bytes}
	 */
	public Number totalPrimaryBytes() {
		return this.totalPrimaryBytes;
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
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

		generator.writeKey("index_count");
		generator.write(this.indexCount.doubleValue());

		generator.writeKey("primary_shard_count");
		generator.write(this.primaryShardCount.doubleValue());

		generator.writeKey("total_primary_bytes");
		generator.write(this.totalPrimaryBytes.doubleValue());

		generator.writeKey("version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesVersions}.
	 */
	public static class Builder implements ObjectBuilder<IndicesVersions> {
		private Number indexCount;

		private Number primaryShardCount;

		private Number totalPrimaryBytes;

		private String version;

		/**
		 * API name: {@code index_count}
		 */
		public Builder indexCount(Number value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * API name: {@code primary_shard_count}
		 */
		public Builder primaryShardCount(Number value) {
			this.primaryShardCount = value;
			return this;
		}

		/**
		 * API name: {@code total_primary_bytes}
		 */
		public Builder totalPrimaryBytes(Number value) {
			this.totalPrimaryBytes = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesVersions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesVersions build() {

			return new IndicesVersions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesVersions}
	 */
	public static final JsonpDeserializer<IndicesVersions> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndicesVersions::setupIndicesVersionsDeserializer);

	protected static void setupIndicesVersionsDeserializer(DelegatingDeserializer<IndicesVersions.Builder> op) {

		op.add(Builder::indexCount, JsonpDeserializer.numberDeserializer(), "index_count");
		op.add(Builder::primaryShardCount, JsonpDeserializer.numberDeserializer(), "primary_shard_count");
		op.add(Builder::totalPrimaryBytes, JsonpDeserializer.numberDeserializer(), "total_primary_bytes");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
