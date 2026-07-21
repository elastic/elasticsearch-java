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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Boolean;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: xpack.usage.DataStreamLifecycleGlobalRetentionStats

/**
 * The <code>affected_data_streams</code> and <code>retention_millis</code>
 * fields are only present when this global retention is defined.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.DataStreamLifecycleGlobalRetentionStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamLifecycleGlobalRetentionStats implements JsonpSerializable {
	private final boolean defined;

	@Nullable
	private final Long affectedDataStreams;

	@Nullable
	private final Long retentionMillis;

	// ---------------------------------------------------------------------------------------------

	private DataStreamLifecycleGlobalRetentionStats(Builder builder) {

		this.defined = ApiTypeHelper.requireNonNull(builder.defined, this, "defined", false);
		this.affectedDataStreams = builder.affectedDataStreams;
		this.retentionMillis = builder.retentionMillis;

	}

	public static DataStreamLifecycleGlobalRetentionStats of(
			Function<Builder, ObjectBuilder<DataStreamLifecycleGlobalRetentionStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Whether this global retention is defined for the cluster.
	 * <p>
	 * API name: {@code defined}
	 */
	public final boolean defined() {
		return this.defined;
	}

	/**
	 * The number of data streams affected by this global retention.
	 * <p>
	 * API name: {@code affected_data_streams}
	 */
	@Nullable
	public final Long affectedDataStreams() {
		return this.affectedDataStreams;
	}

	/**
	 * The global retention period in milliseconds.
	 * <p>
	 * API name: {@code retention_millis}
	 */
	@Nullable
	public final Long retentionMillis() {
		return this.retentionMillis;
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

		generator.writeKey("defined");
		generator.write(this.defined);

		if (this.affectedDataStreams != null) {
			generator.writeKey("affected_data_streams");
			generator.write(this.affectedDataStreams);

		}
		if (this.retentionMillis != null) {
			generator.writeKey("retention_millis");
			generator.write(this.retentionMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamLifecycleGlobalRetentionStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamLifecycleGlobalRetentionStats> {
		private Boolean defined;

		@Nullable
		private Long affectedDataStreams;

		@Nullable
		private Long retentionMillis;

		public Builder() {
		}
		private Builder(DataStreamLifecycleGlobalRetentionStats instance) {
			this.defined = instance.defined;
			this.affectedDataStreams = instance.affectedDataStreams;
			this.retentionMillis = instance.retentionMillis;

		}
		/**
		 * Required - Whether this global retention is defined for the cluster.
		 * <p>
		 * API name: {@code defined}
		 */
		public final Builder defined(boolean value) {
			this.defined = value;
			return this;
		}

		/**
		 * The number of data streams affected by this global retention.
		 * <p>
		 * API name: {@code affected_data_streams}
		 */
		public final Builder affectedDataStreams(@Nullable Long value) {
			this.affectedDataStreams = value;
			return this;
		}

		/**
		 * The global retention period in milliseconds.
		 * <p>
		 * API name: {@code retention_millis}
		 */
		public final Builder retentionMillis(@Nullable Long value) {
			this.retentionMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamLifecycleGlobalRetentionStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamLifecycleGlobalRetentionStats build() {
			_checkSingleUse();

			return new DataStreamLifecycleGlobalRetentionStats(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamLifecycleGlobalRetentionStats}
	 */
	public static final JsonpDeserializer<DataStreamLifecycleGlobalRetentionStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataStreamLifecycleGlobalRetentionStats::setupDataStreamLifecycleGlobalRetentionStatsDeserializer);

	protected static void setupDataStreamLifecycleGlobalRetentionStatsDeserializer(
			ObjectDeserializer<DataStreamLifecycleGlobalRetentionStats.Builder> op) {

		op.add(Builder::defined, JsonpDeserializer.booleanDeserializer(), "defined");
		op.add(Builder::affectedDataStreams, JsonpDeserializer.longDeserializer(), "affected_data_streams");
		op.add(Builder::retentionMillis, JsonpDeserializer.longDeserializer(), "retention_millis");

	}

}
