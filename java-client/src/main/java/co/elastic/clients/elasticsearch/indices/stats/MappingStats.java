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

package co.elastic.clients.elasticsearch.indices.stats;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.stats.MappingStats

/**
 *
 * @see <a href="../../doc-files/api-spec.html#indices.stats.MappingStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class MappingStats implements JsonpSerializable {
	private final long totalCount;

	@Nullable
	private final String totalEstimatedOverhead;

	private final long totalEstimatedOverheadInBytes;

	// ---------------------------------------------------------------------------------------------

	private MappingStats(Builder builder) {

		this.totalCount = ApiTypeHelper.requireNonNull(builder.totalCount, this, "totalCount");
		this.totalEstimatedOverhead = builder.totalEstimatedOverhead;
		this.totalEstimatedOverheadInBytes = ApiTypeHelper.requireNonNull(builder.totalEstimatedOverheadInBytes, this,
				"totalEstimatedOverheadInBytes");

	}

	public static MappingStats of(Function<Builder, ObjectBuilder<MappingStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total_count}
	 */
	public final long totalCount() {
		return this.totalCount;
	}

	/**
	 * API name: {@code total_estimated_overhead}
	 */
	@Nullable
	public final String totalEstimatedOverhead() {
		return this.totalEstimatedOverhead;
	}

	/**
	 * Required - API name: {@code total_estimated_overhead_in_bytes}
	 */
	public final long totalEstimatedOverheadInBytes() {
		return this.totalEstimatedOverheadInBytes;
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

		generator.writeKey("total_count");
		generator.write(this.totalCount);

		if (this.totalEstimatedOverhead != null) {
			generator.writeKey("total_estimated_overhead");
			generator.write(this.totalEstimatedOverhead);

		}
		generator.writeKey("total_estimated_overhead_in_bytes");
		generator.write(this.totalEstimatedOverheadInBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MappingStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MappingStats> {
		private Long totalCount;

		@Nullable
		private String totalEstimatedOverhead;

		private Long totalEstimatedOverheadInBytes;

		/**
		 * Required - API name: {@code total_count}
		 */
		public final Builder totalCount(long value) {
			this.totalCount = value;
			return this;
		}

		/**
		 * API name: {@code total_estimated_overhead}
		 */
		public final Builder totalEstimatedOverhead(@Nullable String value) {
			this.totalEstimatedOverhead = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_estimated_overhead_in_bytes}
		 */
		public final Builder totalEstimatedOverheadInBytes(long value) {
			this.totalEstimatedOverheadInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MappingStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MappingStats build() {
			_checkSingleUse();

			return new MappingStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MappingStats}
	 */
	public static final JsonpDeserializer<MappingStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MappingStats::setupMappingStatsDeserializer);

	protected static void setupMappingStatsDeserializer(ObjectDeserializer<MappingStats.Builder> op) {

		op.add(Builder::totalCount, JsonpDeserializer.longDeserializer(), "total_count");
		op.add(Builder::totalEstimatedOverhead, JsonpDeserializer.stringDeserializer(), "total_estimated_overhead");
		op.add(Builder::totalEstimatedOverheadInBytes, JsonpDeserializer.longDeserializer(),
				"total_estimated_overhead_in_bytes");

	}

}
