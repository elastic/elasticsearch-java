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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: xpack.usage.DataStreamLifecycleEffectiveRetentionStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.DataStreamLifecycleEffectiveRetentionStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamLifecycleEffectiveRetentionStats extends DataStreamLifecycleThresholdStats {
	private final long retainedDataStreams;

	// ---------------------------------------------------------------------------------------------

	private DataStreamLifecycleEffectiveRetentionStats(Builder builder) {
		super(builder);

		this.retainedDataStreams = ApiTypeHelper.requireNonNull(builder.retainedDataStreams, this,
				"retainedDataStreams", 0);

	}

	public static DataStreamLifecycleEffectiveRetentionStats of(
			Function<Builder, ObjectBuilder<DataStreamLifecycleEffectiveRetentionStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of data streams for which an effective retention
	 * applies.
	 * <p>
	 * API name: {@code retained_data_streams}
	 */
	public final long retainedDataStreams() {
		return this.retainedDataStreams;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("retained_data_streams");
		generator.write(this.retainedDataStreams);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamLifecycleEffectiveRetentionStats}.
	 */

	public static class Builder extends DataStreamLifecycleThresholdStats.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataStreamLifecycleEffectiveRetentionStats> {
		private Long retainedDataStreams;

		public Builder() {
		}
		private Builder(DataStreamLifecycleEffectiveRetentionStats instance) {
			this.retainedDataStreams = instance.retainedDataStreams;

		}
		/**
		 * Required - The number of data streams for which an effective retention
		 * applies.
		 * <p>
		 * API name: {@code retained_data_streams}
		 */
		public final Builder retainedDataStreams(long value) {
			this.retainedDataStreams = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamLifecycleEffectiveRetentionStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamLifecycleEffectiveRetentionStats build() {
			_checkSingleUse();

			return new DataStreamLifecycleEffectiveRetentionStats(this);
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
	 * Json deserializer for {@link DataStreamLifecycleEffectiveRetentionStats}
	 */
	public static final JsonpDeserializer<DataStreamLifecycleEffectiveRetentionStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataStreamLifecycleEffectiveRetentionStats::setupDataStreamLifecycleEffectiveRetentionStatsDeserializer);

	protected static void setupDataStreamLifecycleEffectiveRetentionStatsDeserializer(
			ObjectDeserializer<DataStreamLifecycleEffectiveRetentionStats.Builder> op) {
		DataStreamLifecycleThresholdStats.setupDataStreamLifecycleThresholdStatsDeserializer(op);
		op.add(Builder::retainedDataStreams, JsonpDeserializer.longDeserializer(), "retained_data_streams");

	}

}
