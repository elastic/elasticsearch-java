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

package co.elastic.clients.elasticsearch.cat.allocation;

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

// typedef: cat.allocation.AllocationRecord
public final class AllocationRecord implements ToJsonp {
	@Nullable
	private final String shards;

	@Nullable
	private final JsonValue disk_indices;

	@Nullable
	private final JsonValue disk_used;

	@Nullable
	private final JsonValue disk_avail;

	@Nullable
	private final JsonValue disk_total;

	@Nullable
	private final JsonValue disk_percent;

	@Nullable
	private final String host;

	@Nullable
	private final String ip;

	@Nullable
	private final String node;

	// ---------------------------------------------------------------------------------------------

	protected AllocationRecord(Builder builder) {

		this.shards = builder.shards;
		this.disk_indices = builder.disk_indices;
		this.disk_used = builder.disk_used;
		this.disk_avail = builder.disk_avail;
		this.disk_total = builder.disk_total;
		this.disk_percent = builder.disk_percent;
		this.host = builder.host;
		this.ip = builder.ip;
		this.node = builder.node;

	}

	/**
	 * number of shards on node
	 * <p>
	 * API name: {@code shards}
	 */
	@Nullable
	public String shards() {
		return this.shards;
	}

	/**
	 * disk used by ES indices
	 * <p>
	 * API name: {@code disk.indices}
	 */
	@Nullable
	public JsonValue disk_indices() {
		return this.disk_indices;
	}

	/**
	 * disk used (total, not just ES)
	 * <p>
	 * API name: {@code disk.used}
	 */
	@Nullable
	public JsonValue disk_used() {
		return this.disk_used;
	}

	/**
	 * disk available
	 * <p>
	 * API name: {@code disk.avail}
	 */
	@Nullable
	public JsonValue disk_avail() {
		return this.disk_avail;
	}

	/**
	 * total capacity of all volumes
	 * <p>
	 * API name: {@code disk.total}
	 */
	@Nullable
	public JsonValue disk_total() {
		return this.disk_total;
	}

	/**
	 * percent disk used
	 * <p>
	 * API name: {@code disk.percent}
	 */
	@Nullable
	public JsonValue disk_percent() {
		return this.disk_percent;
	}

	/**
	 * host of node
	 * <p>
	 * API name: {@code host}
	 */
	@Nullable
	public String host() {
		return this.host;
	}

	/**
	 * ip of node
	 * <p>
	 * API name: {@code ip}
	 */
	@Nullable
	public String ip() {
		return this.ip;
	}

	/**
	 * name of node
	 * <p>
	 * API name: {@code node}
	 */
	@Nullable
	public String node() {
		return this.node;
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

		if (this.shards != null) {

			generator.writeKey("shards");
			generator.write(this.shards);

		}
		if (this.disk_indices != null) {

			generator.writeKey("disk.indices");
			generator.write(this.disk_indices);

		}
		if (this.disk_used != null) {

			generator.writeKey("disk.used");
			generator.write(this.disk_used);

		}
		if (this.disk_avail != null) {

			generator.writeKey("disk.avail");
			generator.write(this.disk_avail);

		}
		if (this.disk_total != null) {

			generator.writeKey("disk.total");
			generator.write(this.disk_total);

		}
		if (this.disk_percent != null) {

			generator.writeKey("disk.percent");
			generator.write(this.disk_percent);

		}
		if (this.host != null) {

			generator.writeKey("host");
			generator.write(this.host);

		}
		if (this.ip != null) {

			generator.writeKey("ip");
			generator.write(this.ip);

		}
		if (this.node != null) {

			generator.writeKey("node");
			generator.write(this.node);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationRecord}.
	 */
	public static class Builder implements ObjectBuilder<AllocationRecord> {
		@Nullable
		private String shards;

		@Nullable
		private JsonValue disk_indices;

		@Nullable
		private JsonValue disk_used;

		@Nullable
		private JsonValue disk_avail;

		@Nullable
		private JsonValue disk_total;

		@Nullable
		private JsonValue disk_percent;

		@Nullable
		private String host;

		@Nullable
		private String ip;

		@Nullable
		private String node;

		/**
		 * number of shards on node
		 * <p>
		 * API name: {@code shards}
		 */
		public Builder shards(@Nullable String value) {
			this.shards = value;
			return this;
		}

		/**
		 * disk used by ES indices
		 * <p>
		 * API name: {@code disk.indices}
		 */
		public Builder disk_indices(@Nullable JsonValue value) {
			this.disk_indices = value;
			return this;
		}

		/**
		 * disk used (total, not just ES)
		 * <p>
		 * API name: {@code disk.used}
		 */
		public Builder disk_used(@Nullable JsonValue value) {
			this.disk_used = value;
			return this;
		}

		/**
		 * disk available
		 * <p>
		 * API name: {@code disk.avail}
		 */
		public Builder disk_avail(@Nullable JsonValue value) {
			this.disk_avail = value;
			return this;
		}

		/**
		 * total capacity of all volumes
		 * <p>
		 * API name: {@code disk.total}
		 */
		public Builder disk_total(@Nullable JsonValue value) {
			this.disk_total = value;
			return this;
		}

		/**
		 * percent disk used
		 * <p>
		 * API name: {@code disk.percent}
		 */
		public Builder disk_percent(@Nullable JsonValue value) {
			this.disk_percent = value;
			return this;
		}

		/**
		 * host of node
		 * <p>
		 * API name: {@code host}
		 */
		public Builder host(@Nullable String value) {
			this.host = value;
			return this;
		}

		/**
		 * ip of node
		 * <p>
		 * API name: {@code ip}
		 */
		public Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * name of node
		 * <p>
		 * API name: {@code node}
		 */
		public Builder node(@Nullable String value) {
			this.node = value;
			return this;
		}

		/**
		 * Builds a {@link AllocationRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationRecord build() {

			return new AllocationRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AllocationRecord
	 */
	public static final JsonpDeserializer<AllocationRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AllocationRecord::setupAllocationRecordDeserializer);

	protected static void setupAllocationRecordDeserializer(DelegatingDeserializer<AllocationRecord.Builder> op) {

		op.add(Builder::shards, JsonpDeserializer.stringDeserializer(), "shards", "s");
		op.add(Builder::disk_indices, JsonpDeserializer.jsonValueDeserializer(), "disk.indices", "di", "diskIndices");
		op.add(Builder::disk_used, JsonpDeserializer.jsonValueDeserializer(), "disk.used", "du", "diskUsed");
		op.add(Builder::disk_avail, JsonpDeserializer.jsonValueDeserializer(), "disk.avail", "da", "diskAvail");
		op.add(Builder::disk_total, JsonpDeserializer.jsonValueDeserializer(), "disk.total", "dt", "diskTotal");
		op.add(Builder::disk_percent, JsonpDeserializer.jsonValueDeserializer(), "disk.percent", "dp", "diskPercent");
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host", "h");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node", "n");

	}

}
