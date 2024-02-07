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

package co.elastic.clients.elasticsearch.nodes;

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

// typedef: nodes._types.CgroupCpuStat

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.CgroupCpuStat">API
 *      specification</a>
 */
@JsonpDeserializable
public class CgroupCpuStat implements JsonpSerializable {
	@Nullable
	private final Long numberOfElapsedPeriods;

	@Nullable
	private final Long numberOfTimesThrottled;

	@Nullable
	private final Long timeThrottledNanos;

	// ---------------------------------------------------------------------------------------------

	private CgroupCpuStat(Builder builder) {

		this.numberOfElapsedPeriods = builder.numberOfElapsedPeriods;
		this.numberOfTimesThrottled = builder.numberOfTimesThrottled;
		this.timeThrottledNanos = builder.timeThrottledNanos;

	}

	public static CgroupCpuStat of(Function<Builder, ObjectBuilder<CgroupCpuStat>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of reporting periods (as specified by
	 * <code>cfs_period_micros</code>) that have elapsed.
	 * <p>
	 * API name: {@code number_of_elapsed_periods}
	 */
	@Nullable
	public final Long numberOfElapsedPeriods() {
		return this.numberOfElapsedPeriods;
	}

	/**
	 * The number of times all tasks in the same cgroup as the Elasticsearch process
	 * have been throttled.
	 * <p>
	 * API name: {@code number_of_times_throttled}
	 */
	@Nullable
	public final Long numberOfTimesThrottled() {
		return this.numberOfTimesThrottled;
	}

	/**
	 * The total amount of time, in nanoseconds, for which all tasks in the same
	 * cgroup as the Elasticsearch process have been throttled.
	 * <p>
	 * API name: {@code time_throttled_nanos}
	 */
	@Nullable
	public final Long timeThrottledNanos() {
		return this.timeThrottledNanos;
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

		if (this.numberOfElapsedPeriods != null) {
			generator.writeKey("number_of_elapsed_periods");
			generator.write(this.numberOfElapsedPeriods);

		}
		if (this.numberOfTimesThrottled != null) {
			generator.writeKey("number_of_times_throttled");
			generator.write(this.numberOfTimesThrottled);

		}
		if (this.timeThrottledNanos != null) {
			generator.writeKey("time_throttled_nanos");
			generator.write(this.timeThrottledNanos);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CgroupCpuStat}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CgroupCpuStat> {
		@Nullable
		private Long numberOfElapsedPeriods;

		@Nullable
		private Long numberOfTimesThrottled;

		@Nullable
		private Long timeThrottledNanos;

		/**
		 * The number of reporting periods (as specified by
		 * <code>cfs_period_micros</code>) that have elapsed.
		 * <p>
		 * API name: {@code number_of_elapsed_periods}
		 */
		public final Builder numberOfElapsedPeriods(@Nullable Long value) {
			this.numberOfElapsedPeriods = value;
			return this;
		}

		/**
		 * The number of times all tasks in the same cgroup as the Elasticsearch process
		 * have been throttled.
		 * <p>
		 * API name: {@code number_of_times_throttled}
		 */
		public final Builder numberOfTimesThrottled(@Nullable Long value) {
			this.numberOfTimesThrottled = value;
			return this;
		}

		/**
		 * The total amount of time, in nanoseconds, for which all tasks in the same
		 * cgroup as the Elasticsearch process have been throttled.
		 * <p>
		 * API name: {@code time_throttled_nanos}
		 */
		public final Builder timeThrottledNanos(@Nullable Long value) {
			this.timeThrottledNanos = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CgroupCpuStat}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CgroupCpuStat build() {
			_checkSingleUse();

			return new CgroupCpuStat(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CgroupCpuStat}
	 */
	public static final JsonpDeserializer<CgroupCpuStat> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CgroupCpuStat::setupCgroupCpuStatDeserializer);

	protected static void setupCgroupCpuStatDeserializer(ObjectDeserializer<CgroupCpuStat.Builder> op) {

		op.add(Builder::numberOfElapsedPeriods, JsonpDeserializer.longDeserializer(), "number_of_elapsed_periods");
		op.add(Builder::numberOfTimesThrottled, JsonpDeserializer.longDeserializer(), "number_of_times_throttled");
		op.add(Builder::timeThrottledNanos, JsonpDeserializer.longDeserializer(), "time_throttled_nanos");

	}

}
