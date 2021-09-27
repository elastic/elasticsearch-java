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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.GetStats
@JsonpDeserializable
public final class GetStats implements JsonpSerializable {
	private final Long current;

	@Nullable
	private final String existsTime;

	private final Long existsTimeInMillis;

	private final Long existsTotal;

	@Nullable
	private final String missingTime;

	private final Long missingTimeInMillis;

	private final Long missingTotal;

	@Nullable
	private final String time;

	private final Long timeInMillis;

	private final Long total;

	// ---------------------------------------------------------------------------------------------

	public GetStats(Builder builder) {

		this.current = Objects.requireNonNull(builder.current, "current");
		this.existsTime = builder.existsTime;
		this.existsTimeInMillis = Objects.requireNonNull(builder.existsTimeInMillis, "exists_time_in_millis");
		this.existsTotal = Objects.requireNonNull(builder.existsTotal, "exists_total");
		this.missingTime = builder.missingTime;
		this.missingTimeInMillis = Objects.requireNonNull(builder.missingTimeInMillis, "missing_time_in_millis");
		this.missingTotal = Objects.requireNonNull(builder.missingTotal, "missing_total");
		this.time = builder.time;
		this.timeInMillis = Objects.requireNonNull(builder.timeInMillis, "time_in_millis");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	/**
	 * API name: {@code current}
	 */
	public Long current() {
		return this.current;
	}

	/**
	 * API name: {@code exists_time}
	 */
	@Nullable
	public String existsTime() {
		return this.existsTime;
	}

	/**
	 * API name: {@code exists_time_in_millis}
	 */
	public Long existsTimeInMillis() {
		return this.existsTimeInMillis;
	}

	/**
	 * API name: {@code exists_total}
	 */
	public Long existsTotal() {
		return this.existsTotal;
	}

	/**
	 * API name: {@code missing_time}
	 */
	@Nullable
	public String missingTime() {
		return this.missingTime;
	}

	/**
	 * API name: {@code missing_time_in_millis}
	 */
	public Long missingTimeInMillis() {
		return this.missingTimeInMillis;
	}

	/**
	 * API name: {@code missing_total}
	 */
	public Long missingTotal() {
		return this.missingTotal;
	}

	/**
	 * API name: {@code time}
	 */
	@Nullable
	public String time() {
		return this.time;
	}

	/**
	 * API name: {@code time_in_millis}
	 */
	public Long timeInMillis() {
		return this.timeInMillis;
	}

	/**
	 * API name: {@code total}
	 */
	public Long total() {
		return this.total;
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

		generator.writeKey("current");
		generator.write(this.current);

		if (this.existsTime != null) {

			generator.writeKey("exists_time");
			generator.write(this.existsTime);

		}

		generator.writeKey("exists_time_in_millis");
		generator.write(this.existsTimeInMillis);

		generator.writeKey("exists_total");
		generator.write(this.existsTotal);

		if (this.missingTime != null) {

			generator.writeKey("missing_time");
			generator.write(this.missingTime);

		}

		generator.writeKey("missing_time_in_millis");
		generator.write(this.missingTimeInMillis);

		generator.writeKey("missing_total");
		generator.write(this.missingTotal);

		if (this.time != null) {

			generator.writeKey("time");
			generator.write(this.time);

		}

		generator.writeKey("time_in_millis");
		generator.write(this.timeInMillis);

		generator.writeKey("total");
		generator.write(this.total);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetStats}.
	 */
	public static class Builder implements ObjectBuilder<GetStats> {
		private Long current;

		@Nullable
		private String existsTime;

		private Long existsTimeInMillis;

		private Long existsTotal;

		@Nullable
		private String missingTime;

		private Long missingTimeInMillis;

		private Long missingTotal;

		@Nullable
		private String time;

		private Long timeInMillis;

		private Long total;

		/**
		 * API name: {@code current}
		 */
		public Builder current(Long value) {
			this.current = value;
			return this;
		}

		/**
		 * API name: {@code exists_time}
		 */
		public Builder existsTime(@Nullable String value) {
			this.existsTime = value;
			return this;
		}

		/**
		 * API name: {@code exists_time_in_millis}
		 */
		public Builder existsTimeInMillis(Long value) {
			this.existsTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code exists_total}
		 */
		public Builder existsTotal(Long value) {
			this.existsTotal = value;
			return this;
		}

		/**
		 * API name: {@code missing_time}
		 */
		public Builder missingTime(@Nullable String value) {
			this.missingTime = value;
			return this;
		}

		/**
		 * API name: {@code missing_time_in_millis}
		 */
		public Builder missingTimeInMillis(Long value) {
			this.missingTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code missing_total}
		 */
		public Builder missingTotal(Long value) {
			this.missingTotal = value;
			return this;
		}

		/**
		 * API name: {@code time}
		 */
		public Builder time(@Nullable String value) {
			this.time = value;
			return this;
		}

		/**
		 * API name: {@code time_in_millis}
		 */
		public Builder timeInMillis(Long value) {
			this.timeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Long value) {
			this.total = value;
			return this;
		}

		/**
		 * Builds a {@link GetStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetStats build() {

			return new GetStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetStats}
	 */
	public static final JsonpDeserializer<GetStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetStats::setupGetStatsDeserializer, Builder::build);

	protected static void setupGetStatsDeserializer(DelegatingDeserializer<GetStats.Builder> op) {

		op.add(Builder::current, JsonpDeserializer.longDeserializer(), "current");
		op.add(Builder::existsTime, JsonpDeserializer.stringDeserializer(), "exists_time");
		op.add(Builder::existsTimeInMillis, JsonpDeserializer.longDeserializer(), "exists_time_in_millis");
		op.add(Builder::existsTotal, JsonpDeserializer.longDeserializer(), "exists_total");
		op.add(Builder::missingTime, JsonpDeserializer.stringDeserializer(), "missing_time");
		op.add(Builder::missingTimeInMillis, JsonpDeserializer.longDeserializer(), "missing_time_in_millis");
		op.add(Builder::missingTotal, JsonpDeserializer.longDeserializer(), "missing_total");
		op.add(Builder::time, JsonpDeserializer.stringDeserializer(), "time");
		op.add(Builder::timeInMillis, JsonpDeserializer.longDeserializer(), "time_in_millis");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");

	}

}
