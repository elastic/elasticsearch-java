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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: indices._types.Translog

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.Translog">API
 *      specification</a>
 */
@JsonpDeserializable
public class Translog implements JsonpSerializable {
	@Nullable
	private final Time syncInterval;

	@Nullable
	private final TranslogDurability durability;

	@Nullable
	private final String flushThresholdSize;

	@Nullable
	private final TranslogRetention retention;

	// ---------------------------------------------------------------------------------------------

	private Translog(Builder builder) {

		this.syncInterval = builder.syncInterval;
		this.durability = builder.durability;
		this.flushThresholdSize = builder.flushThresholdSize;
		this.retention = builder.retention;

	}

	public static Translog of(Function<Builder, ObjectBuilder<Translog>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * How often the translog is fsynced to disk and committed, regardless of write
	 * operations. Values less than 100ms are not allowed.
	 * <p>
	 * API name: {@code sync_interval}
	 */
	@Nullable
	public final Time syncInterval() {
		return this.syncInterval;
	}

	/**
	 * Whether or not to <code>fsync</code> and commit the translog after every
	 * index, delete, update, or bulk request.
	 * <p>
	 * API name: {@code durability}
	 */
	@Nullable
	public final TranslogDurability durability() {
		return this.durability;
	}

	/**
	 * The translog stores all operations that are not yet safely persisted in
	 * Lucene (i.e., are not part of a Lucene commit point). Although these
	 * operations are available for reads, they will need to be replayed if the
	 * shard was stopped and had to be recovered. This setting controls the maximum
	 * total size of these operations, to prevent recoveries from taking too long.
	 * Once the maximum size has been reached a flush will happen, generating a new
	 * Lucene commit point.
	 * <p>
	 * API name: {@code flush_threshold_size}
	 */
	@Nullable
	public final String flushThresholdSize() {
		return this.flushThresholdSize;
	}

	/**
	 * API name: {@code retention}
	 */
	@Nullable
	public final TranslogRetention retention() {
		return this.retention;
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

		if (this.syncInterval != null) {
			generator.writeKey("sync_interval");
			this.syncInterval.serialize(generator, mapper);

		}
		if (this.durability != null) {
			generator.writeKey("durability");
			this.durability.serialize(generator, mapper);
		}
		if (this.flushThresholdSize != null) {
			generator.writeKey("flush_threshold_size");
			generator.write(this.flushThresholdSize);

		}
		if (this.retention != null) {
			generator.writeKey("retention");
			this.retention.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Translog}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Translog> {
		@Nullable
		private Time syncInterval;

		@Nullable
		private TranslogDurability durability;

		@Nullable
		private String flushThresholdSize;

		@Nullable
		private TranslogRetention retention;

		/**
		 * How often the translog is fsynced to disk and committed, regardless of write
		 * operations. Values less than 100ms are not allowed.
		 * <p>
		 * API name: {@code sync_interval}
		 */
		public final Builder syncInterval(@Nullable Time value) {
			this.syncInterval = value;
			return this;
		}

		/**
		 * How often the translog is fsynced to disk and committed, regardless of write
		 * operations. Values less than 100ms are not allowed.
		 * <p>
		 * API name: {@code sync_interval}
		 */
		public final Builder syncInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.syncInterval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Whether or not to <code>fsync</code> and commit the translog after every
		 * index, delete, update, or bulk request.
		 * <p>
		 * API name: {@code durability}
		 */
		public final Builder durability(@Nullable TranslogDurability value) {
			this.durability = value;
			return this;
		}

		/**
		 * The translog stores all operations that are not yet safely persisted in
		 * Lucene (i.e., are not part of a Lucene commit point). Although these
		 * operations are available for reads, they will need to be replayed if the
		 * shard was stopped and had to be recovered. This setting controls the maximum
		 * total size of these operations, to prevent recoveries from taking too long.
		 * Once the maximum size has been reached a flush will happen, generating a new
		 * Lucene commit point.
		 * <p>
		 * API name: {@code flush_threshold_size}
		 */
		public final Builder flushThresholdSize(@Nullable String value) {
			this.flushThresholdSize = value;
			return this;
		}

		/**
		 * API name: {@code retention}
		 */
		public final Builder retention(@Nullable TranslogRetention value) {
			this.retention = value;
			return this;
		}

		/**
		 * API name: {@code retention}
		 */
		public final Builder retention(Function<TranslogRetention.Builder, ObjectBuilder<TranslogRetention>> fn) {
			return this.retention(fn.apply(new TranslogRetention.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Translog}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Translog build() {
			_checkSingleUse();

			return new Translog(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Translog}
	 */
	public static final JsonpDeserializer<Translog> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Translog::setupTranslogDeserializer);

	protected static void setupTranslogDeserializer(ObjectDeserializer<Translog.Builder> op) {

		op.add(Builder::syncInterval, Time._DESERIALIZER, "sync_interval");
		op.add(Builder::durability, TranslogDurability._DESERIALIZER, "durability");
		op.add(Builder::flushThresholdSize, JsonpDeserializer.stringDeserializer(), "flush_threshold_size");
		op.add(Builder::retention, TranslogRetention._DESERIALIZER, "retention");

	}

}
