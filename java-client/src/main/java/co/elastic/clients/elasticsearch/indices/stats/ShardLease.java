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

// typedef: indices.stats.ShardLease

/**
 *
 * @see <a href="../../doc-files/api-spec.html#indices.stats.ShardLease">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardLease implements JsonpSerializable {
	private final String id;

	private final long retainingSeqNo;

	private final long timestamp;

	private final String source;

	// ---------------------------------------------------------------------------------------------

	private ShardLease(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.retainingSeqNo = ApiTypeHelper.requireNonNull(builder.retainingSeqNo, this, "retainingSeqNo");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");

	}

	public static ShardLease of(Function<Builder, ObjectBuilder<ShardLease>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code retaining_seq_no}
	 */
	public final long retainingSeqNo() {
		return this.retainingSeqNo;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - API name: {@code source}
	 */
	public final String source() {
		return this.source;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("retaining_seq_no");
		generator.write(this.retainingSeqNo);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("source");
		generator.write(this.source);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardLease}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardLease> {
		private String id;

		private Long retainingSeqNo;

		private Long timestamp;

		private String source;

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code retaining_seq_no}
		 */
		public final Builder retainingSeqNo(long value) {
			this.retainingSeqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(String value) {
			this.source = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardLease}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardLease build() {
			_checkSingleUse();

			return new ShardLease(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardLease}
	 */
	public static final JsonpDeserializer<ShardLease> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardLease::setupShardLeaseDeserializer);

	protected static void setupShardLeaseDeserializer(ObjectDeserializer<ShardLease.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::retainingSeqNo, JsonpDeserializer.longDeserializer(), "retaining_seq_no");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

}
