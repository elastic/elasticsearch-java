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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.SoftDeletes

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.SoftDeletes">API
 *      specification</a>
 */
@JsonpDeserializable
public class SoftDeletes implements JsonpSerializable {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final RetentionLease retentionLease;

	// ---------------------------------------------------------------------------------------------

	private SoftDeletes(Builder builder) {

		this.enabled = builder.enabled;
		this.retentionLease = builder.retentionLease;

	}

	public static SoftDeletes of(Function<Builder, ObjectBuilder<SoftDeletes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Indicates whether soft deletes are enabled on the index.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * The maximum period to retain a shard history retention lease before it is
	 * considered expired. Shard history retention leases ensure that soft deletes
	 * are retained during merges on the Lucene index. If a soft delete is merged
	 * away before it can be replicated to a follower the following process will
	 * fail due to incomplete history on the leader.
	 * <p>
	 * API name: {@code retention_lease}
	 */
	@Nullable
	public final RetentionLease retentionLease() {
		return this.retentionLease;
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

		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.retentionLease != null) {
			generator.writeKey("retention_lease");
			this.retentionLease.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SoftDeletes}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SoftDeletes> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private RetentionLease retentionLease;

		/**
		 * Indicates whether soft deletes are enabled on the index.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * The maximum period to retain a shard history retention lease before it is
		 * considered expired. Shard history retention leases ensure that soft deletes
		 * are retained during merges on the Lucene index. If a soft delete is merged
		 * away before it can be replicated to a follower the following process will
		 * fail due to incomplete history on the leader.
		 * <p>
		 * API name: {@code retention_lease}
		 */
		public final Builder retentionLease(@Nullable RetentionLease value) {
			this.retentionLease = value;
			return this;
		}

		/**
		 * The maximum period to retain a shard history retention lease before it is
		 * considered expired. Shard history retention leases ensure that soft deletes
		 * are retained during merges on the Lucene index. If a soft delete is merged
		 * away before it can be replicated to a follower the following process will
		 * fail due to incomplete history on the leader.
		 * <p>
		 * API name: {@code retention_lease}
		 */
		public final Builder retentionLease(Function<RetentionLease.Builder, ObjectBuilder<RetentionLease>> fn) {
			return this.retentionLease(fn.apply(new RetentionLease.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SoftDeletes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SoftDeletes build() {
			_checkSingleUse();

			return new SoftDeletes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SoftDeletes}
	 */
	public static final JsonpDeserializer<SoftDeletes> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SoftDeletes::setupSoftDeletesDeserializer);

	protected static void setupSoftDeletesDeserializer(ObjectDeserializer<SoftDeletes.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::retentionLease, RetentionLease._DESERIALIZER, "retention_lease");

	}

}
