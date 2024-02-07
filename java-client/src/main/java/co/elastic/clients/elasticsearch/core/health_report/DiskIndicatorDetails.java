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

package co.elastic.clients.elasticsearch.core.health_report;

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

// typedef: _global.health_report.DiskIndicatorDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.DiskIndicatorDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class DiskIndicatorDetails implements JsonpSerializable {
	private final long indicesWithReadonlyBlock;

	private final long nodesWithEnoughDiskSpace;

	private final long nodesOverHighWatermark;

	private final long nodesOverFloodStageWatermark;

	private final long nodesWithUnknownDiskStatus;

	// ---------------------------------------------------------------------------------------------

	private DiskIndicatorDetails(Builder builder) {

		this.indicesWithReadonlyBlock = ApiTypeHelper.requireNonNull(builder.indicesWithReadonlyBlock, this,
				"indicesWithReadonlyBlock");
		this.nodesWithEnoughDiskSpace = ApiTypeHelper.requireNonNull(builder.nodesWithEnoughDiskSpace, this,
				"nodesWithEnoughDiskSpace");
		this.nodesOverHighWatermark = ApiTypeHelper.requireNonNull(builder.nodesOverHighWatermark, this,
				"nodesOverHighWatermark");
		this.nodesOverFloodStageWatermark = ApiTypeHelper.requireNonNull(builder.nodesOverFloodStageWatermark, this,
				"nodesOverFloodStageWatermark");
		this.nodesWithUnknownDiskStatus = ApiTypeHelper.requireNonNull(builder.nodesWithUnknownDiskStatus, this,
				"nodesWithUnknownDiskStatus");

	}

	public static DiskIndicatorDetails of(Function<Builder, ObjectBuilder<DiskIndicatorDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code indices_with_readonly_block}
	 */
	public final long indicesWithReadonlyBlock() {
		return this.indicesWithReadonlyBlock;
	}

	/**
	 * Required - API name: {@code nodes_with_enough_disk_space}
	 */
	public final long nodesWithEnoughDiskSpace() {
		return this.nodesWithEnoughDiskSpace;
	}

	/**
	 * Required - API name: {@code nodes_over_high_watermark}
	 */
	public final long nodesOverHighWatermark() {
		return this.nodesOverHighWatermark;
	}

	/**
	 * Required - API name: {@code nodes_over_flood_stage_watermark}
	 */
	public final long nodesOverFloodStageWatermark() {
		return this.nodesOverFloodStageWatermark;
	}

	/**
	 * Required - API name: {@code nodes_with_unknown_disk_status}
	 */
	public final long nodesWithUnknownDiskStatus() {
		return this.nodesWithUnknownDiskStatus;
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

		generator.writeKey("indices_with_readonly_block");
		generator.write(this.indicesWithReadonlyBlock);

		generator.writeKey("nodes_with_enough_disk_space");
		generator.write(this.nodesWithEnoughDiskSpace);

		generator.writeKey("nodes_over_high_watermark");
		generator.write(this.nodesOverHighWatermark);

		generator.writeKey("nodes_over_flood_stage_watermark");
		generator.write(this.nodesOverFloodStageWatermark);

		generator.writeKey("nodes_with_unknown_disk_status");
		generator.write(this.nodesWithUnknownDiskStatus);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DiskIndicatorDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DiskIndicatorDetails> {
		private Long indicesWithReadonlyBlock;

		private Long nodesWithEnoughDiskSpace;

		private Long nodesOverHighWatermark;

		private Long nodesOverFloodStageWatermark;

		private Long nodesWithUnknownDiskStatus;

		/**
		 * Required - API name: {@code indices_with_readonly_block}
		 */
		public final Builder indicesWithReadonlyBlock(long value) {
			this.indicesWithReadonlyBlock = value;
			return this;
		}

		/**
		 * Required - API name: {@code nodes_with_enough_disk_space}
		 */
		public final Builder nodesWithEnoughDiskSpace(long value) {
			this.nodesWithEnoughDiskSpace = value;
			return this;
		}

		/**
		 * Required - API name: {@code nodes_over_high_watermark}
		 */
		public final Builder nodesOverHighWatermark(long value) {
			this.nodesOverHighWatermark = value;
			return this;
		}

		/**
		 * Required - API name: {@code nodes_over_flood_stage_watermark}
		 */
		public final Builder nodesOverFloodStageWatermark(long value) {
			this.nodesOverFloodStageWatermark = value;
			return this;
		}

		/**
		 * Required - API name: {@code nodes_with_unknown_disk_status}
		 */
		public final Builder nodesWithUnknownDiskStatus(long value) {
			this.nodesWithUnknownDiskStatus = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DiskIndicatorDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DiskIndicatorDetails build() {
			_checkSingleUse();

			return new DiskIndicatorDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DiskIndicatorDetails}
	 */
	public static final JsonpDeserializer<DiskIndicatorDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DiskIndicatorDetails::setupDiskIndicatorDetailsDeserializer);

	protected static void setupDiskIndicatorDetailsDeserializer(ObjectDeserializer<DiskIndicatorDetails.Builder> op) {

		op.add(Builder::indicesWithReadonlyBlock, JsonpDeserializer.longDeserializer(), "indices_with_readonly_block");
		op.add(Builder::nodesWithEnoughDiskSpace, JsonpDeserializer.longDeserializer(), "nodes_with_enough_disk_space");
		op.add(Builder::nodesOverHighWatermark, JsonpDeserializer.longDeserializer(), "nodes_over_high_watermark");
		op.add(Builder::nodesOverFloodStageWatermark, JsonpDeserializer.longDeserializer(),
				"nodes_over_flood_stage_watermark");
		op.add(Builder::nodesWithUnknownDiskStatus, JsonpDeserializer.longDeserializer(),
				"nodes_with_unknown_disk_status");

	}

}
