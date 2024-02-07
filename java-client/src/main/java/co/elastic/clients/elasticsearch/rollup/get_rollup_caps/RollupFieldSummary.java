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

package co.elastic.clients.elasticsearch.rollup.get_rollup_caps;

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.String;
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

// typedef: rollup.get_rollup_caps.RollupFieldSummary

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#rollup.get_rollup_caps.RollupFieldSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class RollupFieldSummary implements JsonpSerializable {
	private final String agg;

	@Nullable
	private final Time calendarInterval;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	private RollupFieldSummary(Builder builder) {

		this.agg = ApiTypeHelper.requireNonNull(builder.agg, this, "agg");
		this.calendarInterval = builder.calendarInterval;
		this.timeZone = builder.timeZone;

	}

	public static RollupFieldSummary of(Function<Builder, ObjectBuilder<RollupFieldSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code agg}
	 */
	public final String agg() {
		return this.agg;
	}

	/**
	 * API name: {@code calendar_interval}
	 */
	@Nullable
	public final Time calendarInterval() {
		return this.calendarInterval;
	}

	/**
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
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

		generator.writeKey("agg");
		generator.write(this.agg);

		if (this.calendarInterval != null) {
			generator.writeKey("calendar_interval");
			this.calendarInterval.serialize(generator, mapper);

		}
		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupFieldSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RollupFieldSummary> {
		private String agg;

		@Nullable
		private Time calendarInterval;

		@Nullable
		private String timeZone;

		/**
		 * Required - API name: {@code agg}
		 */
		public final Builder agg(String value) {
			this.agg = value;
			return this;
		}

		/**
		 * API name: {@code calendar_interval}
		 */
		public final Builder calendarInterval(@Nullable Time value) {
			this.calendarInterval = value;
			return this;
		}

		/**
		 * API name: {@code calendar_interval}
		 */
		public final Builder calendarInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.calendarInterval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RollupFieldSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupFieldSummary build() {
			_checkSingleUse();

			return new RollupFieldSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupFieldSummary}
	 */
	public static final JsonpDeserializer<RollupFieldSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RollupFieldSummary::setupRollupFieldSummaryDeserializer);

	protected static void setupRollupFieldSummaryDeserializer(ObjectDeserializer<RollupFieldSummary.Builder> op) {

		op.add(Builder::agg, JsonpDeserializer.stringDeserializer(), "agg");
		op.add(Builder::calendarInterval, Time._DESERIALIZER, "calendar_interval");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

	}

}
