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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_datafeeds.DatafeedsRecord
@JsonpDeserializable
public final class DatafeedsRecord implements JsonpSerializable {
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

	public DatafeedsRecord(Builder builder) {

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

	public DatafeedsRecord(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * the datafeed_id
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * the datafeed state
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public DatafeedState state() {
		return this.state;
	}

	/**
	 * why the datafeed is or is not assigned to a node
	 * <p>
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * bucket count
	 * <p>
	 * API name: {@code buckets.count}
	 */
	@Nullable
	public String bucketsCount() {
		return this.bucketsCount;
	}

	/**
	 * number of searches ran by the datafeed
	 * <p>
	 * API name: {@code search.count}
	 */
	@Nullable
	public String searchCount() {
		return this.searchCount;
	}

	/**
	 * the total search time
	 * <p>
	 * API name: {@code search.time}
	 */
	@Nullable
	public String searchTime() {
		return this.searchTime;
	}

	/**
	 * the average search time per bucket (millisecond)
	 * <p>
	 * API name: {@code search.bucket_avg}
	 */
	@Nullable
	public String searchBucketAvg() {
		return this.searchBucketAvg;
	}

	/**
	 * the exponential average search time per hour (millisecond)
	 * <p>
	 * API name: {@code search.exp_avg_hour}
	 */
	@Nullable
	public String searchExpAvgHour() {
		return this.searchExpAvgHour;
	}

	/**
	 * id of the assigned node
	 * <p>
	 * API name: {@code node.id}
	 */
	@Nullable
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * name of the assigned node
	 * <p>
	 * API name: {@code node.name}
	 */
	@Nullable
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * ephemeral id of the assigned node
	 * <p>
	 * API name: {@code node.ephemeral_id}
	 */
	@Nullable
	public String nodeEphemeralId() {
		return this.nodeEphemeralId;
	}

	/**
	 * network address of the assigned node
	 * <p>
	 * API name: {@code node.address}
	 */
	@Nullable
	public String nodeAddress() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedsRecord}.
	 */
	public static class Builder implements ObjectBuilder<DatafeedsRecord> {
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
		 * the datafeed_id
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * the datafeed state
		 * <p>
		 * API name: {@code state}
		 */
		public Builder state(@Nullable DatafeedState value) {
			this.state = value;
			return this;
		}

		/**
		 * why the datafeed is or is not assigned to a node
		 * <p>
		 * API name: {@code assignment_explanation}
		 */
		public Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * bucket count
		 * <p>
		 * API name: {@code buckets.count}
		 */
		public Builder bucketsCount(@Nullable String value) {
			this.bucketsCount = value;
			return this;
		}

		/**
		 * number of searches ran by the datafeed
		 * <p>
		 * API name: {@code search.count}
		 */
		public Builder searchCount(@Nullable String value) {
			this.searchCount = value;
			return this;
		}

		/**
		 * the total search time
		 * <p>
		 * API name: {@code search.time}
		 */
		public Builder searchTime(@Nullable String value) {
			this.searchTime = value;
			return this;
		}

		/**
		 * the average search time per bucket (millisecond)
		 * <p>
		 * API name: {@code search.bucket_avg}
		 */
		public Builder searchBucketAvg(@Nullable String value) {
			this.searchBucketAvg = value;
			return this;
		}

		/**
		 * the exponential average search time per hour (millisecond)
		 * <p>
		 * API name: {@code search.exp_avg_hour}
		 */
		public Builder searchExpAvgHour(@Nullable String value) {
			this.searchExpAvgHour = value;
			return this;
		}

		/**
		 * id of the assigned node
		 * <p>
		 * API name: {@code node.id}
		 */
		public Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * name of the assigned node
		 * <p>
		 * API name: {@code node.name}
		 */
		public Builder nodeName(@Nullable String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * ephemeral id of the assigned node
		 * <p>
		 * API name: {@code node.ephemeral_id}
		 */
		public Builder nodeEphemeralId(@Nullable String value) {
			this.nodeEphemeralId = value;
			return this;
		}

		/**
		 * network address of the assigned node
		 * <p>
		 * API name: {@code node.address}
		 */
		public Builder nodeAddress(@Nullable String value) {
			this.nodeAddress = value;
			return this;
		}

		/**
		 * Builds a {@link DatafeedsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedsRecord build() {

			return new DatafeedsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DatafeedsRecord}
	 */
	public static final JsonpDeserializer<DatafeedsRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DatafeedsRecord::setupDatafeedsRecordDeserializer, Builder::build);

	protected static void setupDatafeedsRecordDeserializer(DelegatingDeserializer<DatafeedsRecord.Builder> op) {

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
