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

package co.elastic.clients.elasticsearch.cat.datafeeds;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.datafeeds.DatafeedsRecord
public final class DatafeedsRecord implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final JsonValue state;

	@Nullable
	private final String assignmentExplanation;

	@Nullable
	private final String buckets_count;

	@Nullable
	private final String search_count;

	@Nullable
	private final String search_time;

	@Nullable
	private final String search_bucketAvg;

	@Nullable
	private final String search_expAvgHour;

	@Nullable
	private final String node_id;

	@Nullable
	private final String node_name;

	@Nullable
	private final String node_ephemeralId;

	@Nullable
	private final String node_address;

	// ---------------------------------------------------------------------------------------------

	protected DatafeedsRecord(Builder builder) {

		this.id = builder.id;
		this.state = builder.state;
		this.assignmentExplanation = builder.assignmentExplanation;
		this.buckets_count = builder.buckets_count;
		this.search_count = builder.search_count;
		this.search_time = builder.search_time;
		this.search_bucketAvg = builder.search_bucketAvg;
		this.search_expAvgHour = builder.search_expAvgHour;
		this.node_id = builder.node_id;
		this.node_name = builder.node_name;
		this.node_ephemeralId = builder.node_ephemeralId;
		this.node_address = builder.node_address;

	}

	/**
	 * the datafeed_id
	 *
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * the datafeed state
	 *
	 * API name: {@code state}
	 */
	@Nullable
	public JsonValue state() {
		return this.state;
	}

	/**
	 * why the datafeed is or is not assigned to a node
	 *
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * bucket count
	 *
	 * API name: {@code buckets.count}
	 */
	@Nullable
	public String buckets_count() {
		return this.buckets_count;
	}

	/**
	 * number of searches ran by the datafeed
	 *
	 * API name: {@code search.count}
	 */
	@Nullable
	public String search_count() {
		return this.search_count;
	}

	/**
	 * the total search time
	 *
	 * API name: {@code search.time}
	 */
	@Nullable
	public String search_time() {
		return this.search_time;
	}

	/**
	 * the average search time per bucket (millisecond)
	 *
	 * API name: {@code search.bucket_avg}
	 */
	@Nullable
	public String search_bucketAvg() {
		return this.search_bucketAvg;
	}

	/**
	 * the exponential average search time per hour (millisecond)
	 *
	 * API name: {@code search.exp_avg_hour}
	 */
	@Nullable
	public String search_expAvgHour() {
		return this.search_expAvgHour;
	}

	/**
	 * id of the assigned node
	 *
	 * API name: {@code node.id}
	 */
	@Nullable
	public String node_id() {
		return this.node_id;
	}

	/**
	 * name of the assigned node
	 *
	 * API name: {@code node.name}
	 */
	@Nullable
	public String node_name() {
		return this.node_name;
	}

	/**
	 * ephemeral id of the assigned node
	 *
	 * API name: {@code node.ephemeral_id}
	 */
	@Nullable
	public String node_ephemeralId() {
		return this.node_ephemeralId;
	}

	/**
	 * network address of the assigned node
	 *
	 * API name: {@code node.address}
	 */
	@Nullable
	public String node_address() {
		return this.node_address;
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

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.state != null) {

			generator.writeKey("state");
			generator.write(this.state);

		}
		if (this.assignmentExplanation != null) {

			generator.writeKey("assignment_explanation");
			generator.write(this.assignmentExplanation);

		}
		if (this.buckets_count != null) {

			generator.writeKey("buckets.count");
			generator.write(this.buckets_count);

		}
		if (this.search_count != null) {

			generator.writeKey("search.count");
			generator.write(this.search_count);

		}
		if (this.search_time != null) {

			generator.writeKey("search.time");
			generator.write(this.search_time);

		}
		if (this.search_bucketAvg != null) {

			generator.writeKey("search.bucket_avg");
			generator.write(this.search_bucketAvg);

		}
		if (this.search_expAvgHour != null) {

			generator.writeKey("search.exp_avg_hour");
			generator.write(this.search_expAvgHour);

		}
		if (this.node_id != null) {

			generator.writeKey("node.id");
			generator.write(this.node_id);

		}
		if (this.node_name != null) {

			generator.writeKey("node.name");
			generator.write(this.node_name);

		}
		if (this.node_ephemeralId != null) {

			generator.writeKey("node.ephemeral_id");
			generator.write(this.node_ephemeralId);

		}
		if (this.node_address != null) {

			generator.writeKey("node.address");
			generator.write(this.node_address);

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
		private JsonValue state;

		@Nullable
		private String assignmentExplanation;

		@Nullable
		private String buckets_count;

		@Nullable
		private String search_count;

		@Nullable
		private String search_time;

		@Nullable
		private String search_bucketAvg;

		@Nullable
		private String search_expAvgHour;

		@Nullable
		private String node_id;

		@Nullable
		private String node_name;

		@Nullable
		private String node_ephemeralId;

		@Nullable
		private String node_address;

		/**
		 * the datafeed_id
		 *
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * the datafeed state
		 *
		 * API name: {@code state}
		 */
		public Builder state(@Nullable JsonValue value) {
			this.state = value;
			return this;
		}

		/**
		 * why the datafeed is or is not assigned to a node
		 *
		 * API name: {@code assignment_explanation}
		 */
		public Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * bucket count
		 *
		 * API name: {@code buckets.count}
		 */
		public Builder buckets_count(@Nullable String value) {
			this.buckets_count = value;
			return this;
		}

		/**
		 * number of searches ran by the datafeed
		 *
		 * API name: {@code search.count}
		 */
		public Builder search_count(@Nullable String value) {
			this.search_count = value;
			return this;
		}

		/**
		 * the total search time
		 *
		 * API name: {@code search.time}
		 */
		public Builder search_time(@Nullable String value) {
			this.search_time = value;
			return this;
		}

		/**
		 * the average search time per bucket (millisecond)
		 *
		 * API name: {@code search.bucket_avg}
		 */
		public Builder search_bucketAvg(@Nullable String value) {
			this.search_bucketAvg = value;
			return this;
		}

		/**
		 * the exponential average search time per hour (millisecond)
		 *
		 * API name: {@code search.exp_avg_hour}
		 */
		public Builder search_expAvgHour(@Nullable String value) {
			this.search_expAvgHour = value;
			return this;
		}

		/**
		 * id of the assigned node
		 *
		 * API name: {@code node.id}
		 */
		public Builder node_id(@Nullable String value) {
			this.node_id = value;
			return this;
		}

		/**
		 * name of the assigned node
		 *
		 * API name: {@code node.name}
		 */
		public Builder node_name(@Nullable String value) {
			this.node_name = value;
			return this;
		}

		/**
		 * ephemeral id of the assigned node
		 *
		 * API name: {@code node.ephemeral_id}
		 */
		public Builder node_ephemeralId(@Nullable String value) {
			this.node_ephemeralId = value;
			return this;
		}

		/**
		 * network address of the assigned node
		 *
		 * API name: {@code node.address}
		 */
		public Builder node_address(@Nullable String value) {
			this.node_address = value;
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
	 * Json deserializer for DatafeedsRecord
	 */
	public static final JsonpDeserializer<DatafeedsRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DatafeedsRecord::setupDatafeedsRecordDeserializer);

	protected static void setupDatafeedsRecordDeserializer(DelegatingDeserializer<DatafeedsRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::state, JsonpDeserializer.jsonValueDeserializer(), "state", "s");
		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation", "ae");
		op.add(Builder::buckets_count, JsonpDeserializer.stringDeserializer(), "buckets.count", "bc", "bucketsCount");
		op.add(Builder::search_count, JsonpDeserializer.stringDeserializer(), "search.count", "sc", "searchCount");
		op.add(Builder::search_time, JsonpDeserializer.stringDeserializer(), "search.time", "st", "searchTime");
		op.add(Builder::search_bucketAvg, JsonpDeserializer.stringDeserializer(), "search.bucket_avg", "sba",
				"searchBucketAvg");
		op.add(Builder::search_expAvgHour, JsonpDeserializer.stringDeserializer(), "search.exp_avg_hour", "seah",
				"searchExpAvgHour");
		op.add(Builder::node_id, JsonpDeserializer.stringDeserializer(), "node.id", "ni", "nodeId");
		op.add(Builder::node_name, JsonpDeserializer.stringDeserializer(), "node.name", "nn", "nodeName");
		op.add(Builder::node_ephemeralId, JsonpDeserializer.stringDeserializer(), "node.ephemeral_id", "ne",
				"nodeEphemeralId");
		op.add(Builder::node_address, JsonpDeserializer.stringDeserializer(), "node.address", "na", "nodeAddress");

	}

}
