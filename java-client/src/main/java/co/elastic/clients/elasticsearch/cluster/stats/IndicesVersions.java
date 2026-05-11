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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
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

// typedef: cluster.stats.IndicesVersions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.IndicesVersions">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicesVersions implements JsonpSerializable {
	private final int indexCount;

	private final int primaryShardCount;

	private final long totalPrimaryBytes;

	@Nullable
	private final String totalPrimarySize;

	private final String version;

	// ---------------------------------------------------------------------------------------------

	private IndicesVersions(Builder builder) {

		this.indexCount = ApiTypeHelper.requireNonNull(builder.indexCount, this, "indexCount", 0);
		this.primaryShardCount = ApiTypeHelper.requireNonNull(builder.primaryShardCount, this, "primaryShardCount", 0);
		this.totalPrimaryBytes = ApiTypeHelper.requireNonNull(builder.totalPrimaryBytes, this, "totalPrimaryBytes", 0);
		this.totalPrimarySize = builder.totalPrimarySize;
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static IndicesVersions of(Function<Builder, ObjectBuilder<IndicesVersions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index_count}
	 */
	public final int indexCount() {
		return this.indexCount;
	}

	/**
	 * Required - API name: {@code primary_shard_count}
	 */
	public final int primaryShardCount() {
		return this.primaryShardCount;
	}

	/**
	 * Required - API name: {@code total_primary_bytes}
	 */
	public final long totalPrimaryBytes() {
		return this.totalPrimaryBytes;
	}

	/**
	 * API name: {@code total_primary_size}
	 */
	@Nullable
	public final String totalPrimarySize() {
		return this.totalPrimarySize;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final String version() {
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
		generator.write(this.indexCount);

		generator.writeKey("primary_shard_count");
		generator.write(this.primaryShardCount);

		generator.writeKey("total_primary_bytes");
		generator.write(this.totalPrimaryBytes);

		if (this.totalPrimarySize != null) {
			generator.writeKey("total_primary_size");
			generator.write(this.totalPrimarySize);

		}
		generator.writeKey("version");
		generator.write(this.version);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesVersions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndicesVersions> {
		private Integer indexCount;

		private Integer primaryShardCount;

		private Long totalPrimaryBytes;

		@Nullable
		private String totalPrimarySize;

		private String version;

		public Builder() {
		}
		private Builder(IndicesVersions instance) {
			this.indexCount = instance.indexCount;
			this.primaryShardCount = instance.primaryShardCount;
			this.totalPrimaryBytes = instance.totalPrimaryBytes;
			this.totalPrimarySize = instance.totalPrimarySize;
			this.version = instance.version;

		}
		/**
		 * Required - API name: {@code index_count}
		 */
		public final Builder indexCount(int value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code primary_shard_count}
		 */
		public final Builder primaryShardCount(int value) {
			this.primaryShardCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_primary_bytes}
		 */
		public final Builder totalPrimaryBytes(long value) {
			this.totalPrimaryBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_primary_size}
		 */
		public final Builder totalPrimarySize(@Nullable String value) {
			this.totalPrimarySize = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndicesVersions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesVersions build() {
			_checkSingleUse();

			return new IndicesVersions(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesVersions}
	 */
	public static final JsonpDeserializer<IndicesVersions> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndicesVersions::setupIndicesVersionsDeserializer);

	protected static void setupIndicesVersionsDeserializer(ObjectDeserializer<IndicesVersions.Builder> op) {

		op.add(Builder::indexCount, JsonpDeserializer.integerDeserializer(), "index_count");
		op.add(Builder::primaryShardCount, JsonpDeserializer.integerDeserializer(), "primary_shard_count");
		op.add(Builder::totalPrimaryBytes, JsonpDeserializer.longDeserializer(), "total_primary_bytes");
		op.add(Builder::totalPrimarySize, JsonpDeserializer.stringDeserializer(), "total_primary_size");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
