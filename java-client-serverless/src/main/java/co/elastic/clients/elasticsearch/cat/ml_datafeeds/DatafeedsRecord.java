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

package co.elastic.clients.elasticsearch.cat.ml_datafeeds;

import co.elastic.clients.elasticsearch.ml.DatafeedState;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_datafeeds.DatafeedsRecord

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cat.ml_datafeeds.DatafeedsRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatafeedsRecord implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final DatafeedState state;

	@Nullable
	private final String assignmentExplanation;

	@Nullable
	private final String bucketsCount;

	@Nullable
	private final String searchCount;

	@Nullable
	private final String searchTime;

	@Nullable
	private final String searchBucketAvg;

	@Nullable
	private final String searchExpAvgHour;

	@Nullable
	private final String nodeId;

	@Nullable
	private final String nodeName;

	@Nullable
	private final String nodeEphemeralId;

	@Nullable
	private final String nodeAddress;

	// ---------------------------------------------------------------------------------------------

	private DatafeedsRecord(Builder builder) {

		this.id = builder.id;
		this.state = builder.state;
		this.assignmentExplanation = builder.assignmentExplanation;
		this.bucketsCount = builder.bucketsCount;
		this.searchCount = builder.searchCount;
		this.searchTime = builder.searchTime;
		this.searchBucketAvg = builder.searchBucketAvg;
		this.searchExpAvgHour = builder.searchExpAvgHour;
		this.nodeId = builder.nodeId;
		this.nodeName = builder.nodeName;
		this.nodeEphemeralId = builder.nodeEphemeralId;
		this.nodeAddress = builder.nodeAddress;

	}

	public static DatafeedsRecord of(Function<Builder, ObjectBuilder<DatafeedsRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The datafeed identifier.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * The status of the datafeed.
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public final DatafeedState state() {
		return this.state;
	}

	/**
	 * For started datafeeds only, contains messages relating to the selection of a
	 * node.
	 * <p>
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public final String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * The number of buckets processed.
	 * <p>
	 * API name: {@code buckets.count}
	 */
	@Nullable
	public final String bucketsCount() {
		return this.bucketsCount;
	}

	/**
	 * The number of searches run by the datafeed.
	 * <p>
	 * API name: {@code search.count}
	 */
	@Nullable
	public final String searchCount() {
		return this.searchCount;
	}

	/**
	 * The total time the datafeed spent searching, in milliseconds.
	 * <p>
	 * API name: {@code search.time}
	 */
	@Nullable
	public final String searchTime() {
		return this.searchTime;
	}

	/**
	 * The average search time per bucket, in milliseconds.
	 * <p>
	 * API name: {@code search.bucket_avg}
	 */
	@Nullable
	public final String searchBucketAvg() {
		return this.searchBucketAvg;
	}

	/**
	 * The exponential average search time per hour, in milliseconds.
	 * <p>
	 * API name: {@code search.exp_avg_hour}
	 */
	@Nullable
	public final String searchExpAvgHour() {
		return this.searchExpAvgHour;
	}

	/**
	 * The unique identifier of the assigned node. For started datafeeds only, this
	 * information pertains to the node upon which the datafeed is started.
	 * <p>
	 * API name: {@code node.id}
	 */
	@Nullable
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * The name of the assigned node. For started datafeeds only, this information
	 * pertains to the node upon which the datafeed is started.
	 * <p>
	 * API name: {@code node.name}
	 */
	@Nullable
	public final String nodeName() {
		return this.nodeName;
	}

	/**
	 * The ephemeral identifier of the assigned node. For started datafeeds only,
	 * this information pertains to the node upon which the datafeed is started.
	 * <p>
	 * API name: {@code node.ephemeral_id}
	 */
	@Nullable
	public final String nodeEphemeralId() {
		return this.nodeEphemeralId;
	}

	/**
	 * The network address of the assigned node. For started datafeeds only, this
	 * information pertains to the node upon which the datafeed is started.
	 * <p>
	 * API name: {@code node.address}
	 */
	@Nullable
	public final String nodeAddress() {
		return this.nodeAddress;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.state != null) {
			generator.writeKey("state");
			this.state.serialize(generator, mapper);
		}
		if (this.assignmentExplanation != null) {
			generator.writeKey("assignment_explanation");
			generator.write(this.assignmentExplanation);

		}
		if (this.bucketsCount != null) {
			generator.writeKey("buckets.count");
			generator.write(this.bucketsCount);

		}
		if (this.searchCount != null) {
			generator.writeKey("search.count");
			generator.write(this.searchCount);

		}
		if (this.searchTime != null) {
			generator.writeKey("search.time");
			generator.write(this.searchTime);

		}
		if (this.searchBucketAvg != null) {
			generator.writeKey("search.bucket_avg");
			generator.write(this.searchBucketAvg);

		}
		if (this.searchExpAvgHour != null) {
			generator.writeKey("search.exp_avg_hour");
			generator.write(this.searchExpAvgHour);

		}
		if (this.nodeId != null) {
			generator.writeKey("node.id");
			generator.write(this.nodeId);

		}
		if (this.nodeName != null) {
			generator.writeKey("node.name");
			generator.write(this.nodeName);

		}
		if (this.nodeEphemeralId != null) {
			generator.writeKey("node.ephemeral_id");
			generator.write(this.nodeEphemeralId);

		}
		if (this.nodeAddress != null) {
			generator.writeKey("node.address");
			generator.write(this.nodeAddress);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedsRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DatafeedsRecord> {
		@Nullable
		private String id;

		@Nullable
		private DatafeedState state;

		@Nullable
		private String assignmentExplanation;

		@Nullable
		private String bucketsCount;

		@Nullable
		private String searchCount;

		@Nullable
		private String searchTime;

		@Nullable
		private String searchBucketAvg;

		@Nullable
		private String searchExpAvgHour;

		@Nullable
		private String nodeId;

		@Nullable
		private String nodeName;

		@Nullable
		private String nodeEphemeralId;

		@Nullable
		private String nodeAddress;

		/**
		 * The datafeed identifier.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * The status of the datafeed.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(@Nullable DatafeedState value) {
			this.state = value;
			return this;
		}

		/**
		 * For started datafeeds only, contains messages relating to the selection of a
		 * node.
		 * <p>
		 * API name: {@code assignment_explanation}
		 */
		public final Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * The number of buckets processed.
		 * <p>
		 * API name: {@code buckets.count}
		 */
		public final Builder bucketsCount(@Nullable String value) {
			this.bucketsCount = value;
			return this;
		}

		/**
		 * The number of searches run by the datafeed.
		 * <p>
		 * API name: {@code search.count}
		 */
		public final Builder searchCount(@Nullable String value) {
			this.searchCount = value;
			return this;
		}

		/**
		 * The total time the datafeed spent searching, in milliseconds.
		 * <p>
		 * API name: {@code search.time}
		 */
		public final Builder searchTime(@Nullable String value) {
			this.searchTime = value;
			return this;
		}

		/**
		 * The average search time per bucket, in milliseconds.
		 * <p>
		 * API name: {@code search.bucket_avg}
		 */
		public final Builder searchBucketAvg(@Nullable String value) {
			this.searchBucketAvg = value;
			return this;
		}

		/**
		 * The exponential average search time per hour, in milliseconds.
		 * <p>
		 * API name: {@code search.exp_avg_hour}
		 */
		public final Builder searchExpAvgHour(@Nullable String value) {
			this.searchExpAvgHour = value;
			return this;
		}

		/**
		 * The unique identifier of the assigned node. For started datafeeds only, this
		 * information pertains to the node upon which the datafeed is started.
		 * <p>
		 * API name: {@code node.id}
		 */
		public final Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * The name of the assigned node. For started datafeeds only, this information
		 * pertains to the node upon which the datafeed is started.
		 * <p>
		 * API name: {@code node.name}
		 */
		public final Builder nodeName(@Nullable String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * The ephemeral identifier of the assigned node. For started datafeeds only,
		 * this information pertains to the node upon which the datafeed is started.
		 * <p>
		 * API name: {@code node.ephemeral_id}
		 */
		public final Builder nodeEphemeralId(@Nullable String value) {
			this.nodeEphemeralId = value;
			return this;
		}

		/**
		 * The network address of the assigned node. For started datafeeds only, this
		 * information pertains to the node upon which the datafeed is started.
		 * <p>
		 * API name: {@code node.address}
		 */
		public final Builder nodeAddress(@Nullable String value) {
			this.nodeAddress = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DatafeedsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedsRecord build() {
			_checkSingleUse();

			return new DatafeedsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DatafeedsRecord}
	 */
	public static final JsonpDeserializer<DatafeedsRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DatafeedsRecord::setupDatafeedsRecordDeserializer);

	protected static void setupDatafeedsRecordDeserializer(ObjectDeserializer<DatafeedsRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::state, DatafeedState._DESERIALIZER, "state", "s");
		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation", "ae");
		op.add(Builder::bucketsCount, JsonpDeserializer.stringDeserializer(), "buckets.count", "bc", "bucketsCount");
		op.add(Builder::searchCount, JsonpDeserializer.stringDeserializer(), "search.count", "sc", "searchCount");
		op.add(Builder::searchTime, JsonpDeserializer.stringDeserializer(), "search.time", "st", "searchTime");
		op.add(Builder::searchBucketAvg, JsonpDeserializer.stringDeserializer(), "search.bucket_avg", "sba",
				"searchBucketAvg");
		op.add(Builder::searchExpAvgHour, JsonpDeserializer.stringDeserializer(), "search.exp_avg_hour", "seah",
				"searchExpAvgHour");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node.id", "ni", "nodeId");
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node.name", "nn", "nodeName");
		op.add(Builder::nodeEphemeralId, JsonpDeserializer.stringDeserializer(), "node.ephemeral_id", "ne",
				"nodeEphemeralId");
		op.add(Builder::nodeAddress, JsonpDeserializer.stringDeserializer(), "node.address", "na", "nodeAddress");

	}

}
