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

// typedef: cat.allocation.AllocationRecord

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cat.allocation.AllocationRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class AllocationRecord implements JsonpSerializable {
	@Nullable
	private final String shards;

	@Nullable
	private final String diskIndices;

	@Nullable
	private final String diskUsed;

	@Nullable
	private final String diskAvail;

	@Nullable
	private final String diskTotal;

	@Nullable
	private final String diskPercent;

	@Nullable
	private final String host;

	@Nullable
	private final String ip;

	@Nullable
	private final String node;

	// ---------------------------------------------------------------------------------------------

	private AllocationRecord(Builder builder) {

		this.shards = builder.shards;
		this.diskIndices = builder.diskIndices;
		this.diskUsed = builder.diskUsed;
		this.diskAvail = builder.diskAvail;
		this.diskTotal = builder.diskTotal;
		this.diskPercent = builder.diskPercent;
		this.host = builder.host;
		this.ip = builder.ip;
		this.node = builder.node;

	}

	public static AllocationRecord of(Function<Builder, ObjectBuilder<AllocationRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * number of shards on node
	 * <p>
	 * API name: {@code shards}
	 */
	@Nullable
	public final String shards() {
		return this.shards;
	}

	/**
	 * disk used by ES indices
	 * <p>
	 * API name: {@code disk.indices}
	 */
	@Nullable
	public final String diskIndices() {
		return this.diskIndices;
	}

	/**
	 * disk used (total, not just ES)
	 * <p>
	 * API name: {@code disk.used}
	 */
	@Nullable
	public final String diskUsed() {
		return this.diskUsed;
	}

	/**
	 * disk available
	 * <p>
	 * API name: {@code disk.avail}
	 */
	@Nullable
	public final String diskAvail() {
		return this.diskAvail;
	}

	/**
	 * total capacity of all volumes
	 * <p>
	 * API name: {@code disk.total}
	 */
	@Nullable
	public final String diskTotal() {
		return this.diskTotal;
	}

	/**
	 * percent disk used
	 * <p>
	 * API name: {@code disk.percent}
	 */
	@Nullable
	public final String diskPercent() {
		return this.diskPercent;
	}

	/**
	 * host of node
	 * <p>
	 * API name: {@code host}
	 */
	@Nullable
	public final String host() {
		return this.host;
	}

	/**
	 * ip of node
	 * <p>
	 * API name: {@code ip}
	 */
	@Nullable
	public final String ip() {
		return this.ip;
	}

	/**
	 * name of node
	 * <p>
	 * API name: {@code node}
	 */
	@Nullable
	public final String node() {
		return this.node;
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

		if (this.shards != null) {
			generator.writeKey("shards");
			generator.write(this.shards);

		}
		if (this.diskIndices != null) {
			generator.writeKey("disk.indices");
			generator.write(this.diskIndices);

		}
		if (this.diskUsed != null) {
			generator.writeKey("disk.used");
			generator.write(this.diskUsed);

		}
		if (this.diskAvail != null) {
			generator.writeKey("disk.avail");
			generator.write(this.diskAvail);

		}
		if (this.diskTotal != null) {
			generator.writeKey("disk.total");
			generator.write(this.diskTotal);

		}
		if (this.diskPercent != null) {
			generator.writeKey("disk.percent");
			generator.write(this.diskPercent);

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AllocationRecord> {
		@Nullable
		private String shards;

		@Nullable
		private String diskIndices;

		@Nullable
		private String diskUsed;

		@Nullable
		private String diskAvail;

		@Nullable
		private String diskTotal;

		@Nullable
		private String diskPercent;

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
		public final Builder shards(@Nullable String value) {
			this.shards = value;
			return this;
		}

		/**
		 * disk used by ES indices
		 * <p>
		 * API name: {@code disk.indices}
		 */
		public final Builder diskIndices(@Nullable String value) {
			this.diskIndices = value;
			return this;
		}

		/**
		 * disk used (total, not just ES)
		 * <p>
		 * API name: {@code disk.used}
		 */
		public final Builder diskUsed(@Nullable String value) {
			this.diskUsed = value;
			return this;
		}

		/**
		 * disk available
		 * <p>
		 * API name: {@code disk.avail}
		 */
		public final Builder diskAvail(@Nullable String value) {
			this.diskAvail = value;
			return this;
		}

		/**
		 * total capacity of all volumes
		 * <p>
		 * API name: {@code disk.total}
		 */
		public final Builder diskTotal(@Nullable String value) {
			this.diskTotal = value;
			return this;
		}

		/**
		 * percent disk used
		 * <p>
		 * API name: {@code disk.percent}
		 */
		public final Builder diskPercent(@Nullable String value) {
			this.diskPercent = value;
			return this;
		}

		/**
		 * host of node
		 * <p>
		 * API name: {@code host}
		 */
		public final Builder host(@Nullable String value) {
			this.host = value;
			return this;
		}

		/**
		 * ip of node
		 * <p>
		 * API name: {@code ip}
		 */
		public final Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * name of node
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(@Nullable String value) {
			this.node = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AllocationRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationRecord build() {
			_checkSingleUse();

			return new AllocationRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AllocationRecord}
	 */
	public static final JsonpDeserializer<AllocationRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AllocationRecord::setupAllocationRecordDeserializer);

	protected static void setupAllocationRecordDeserializer(ObjectDeserializer<AllocationRecord.Builder> op) {

		op.add(Builder::shards, JsonpDeserializer.stringDeserializer(), "shards", "s");
		op.add(Builder::diskIndices, JsonpDeserializer.stringDeserializer(), "disk.indices", "di", "diskIndices");
		op.add(Builder::diskUsed, JsonpDeserializer.stringDeserializer(), "disk.used", "du", "diskUsed");
		op.add(Builder::diskAvail, JsonpDeserializer.stringDeserializer(), "disk.avail", "da", "diskAvail");
		op.add(Builder::diskTotal, JsonpDeserializer.stringDeserializer(), "disk.total", "dt", "diskTotal");
		op.add(Builder::diskPercent, JsonpDeserializer.stringDeserializer(), "disk.percent", "dp", "diskPercent");
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host", "h");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node", "n");

	}

}
