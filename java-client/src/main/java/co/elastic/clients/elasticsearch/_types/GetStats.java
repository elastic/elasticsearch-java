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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.GetStats
@JsonpDeserializable
public class GetStats implements JsonpSerializable {
	private final long current;

	@Nullable
	private final String existsTime;

	private final long existsTimeInMillis;

	private final long existsTotal;

	@Nullable
	private final String missingTime;

	private final long missingTimeInMillis;

	private final long missingTotal;

	@Nullable
	private final String time;

	private final long timeInMillis;

	private final long total;

	// ---------------------------------------------------------------------------------------------

	private GetStats(Builder builder) {

		this.current = ModelTypeHelper.requireNonNull(builder.current, this, "current");
		this.existsTime = builder.existsTime;
		this.existsTimeInMillis = ModelTypeHelper.requireNonNull(builder.existsTimeInMillis, this,
				"existsTimeInMillis");
		this.existsTotal = ModelTypeHelper.requireNonNull(builder.existsTotal, this, "existsTotal");
		this.missingTime = builder.missingTime;
		this.missingTimeInMillis = ModelTypeHelper.requireNonNull(builder.missingTimeInMillis, this,
				"missingTimeInMillis");
		this.missingTotal = ModelTypeHelper.requireNonNull(builder.missingTotal, this, "missingTotal");
		this.time = builder.time;
		this.timeInMillis = ModelTypeHelper.requireNonNull(builder.timeInMillis, this, "timeInMillis");
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static GetStats of(Function<Builder, ObjectBuilder<GetStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code current}
	 */
	public final long current() {
		return this.current;
	}

	/**
	 * API name: {@code exists_time}
	 */
	@Nullable
	public final String existsTime() {
		return this.existsTime;
	}

	/**
	 * Required - API name: {@code exists_time_in_millis}
	 */
	public final long existsTimeInMillis() {
		return this.existsTimeInMillis;
	}

	/**
	 * Required - API name: {@code exists_total}
	 */
	public final long existsTotal() {
		return this.existsTotal;
	}

	/**
	 * API name: {@code missing_time}
	 */
	@Nullable
	public final String missingTime() {
		return this.missingTime;
	}

	/**
	 * Required - API name: {@code missing_time_in_millis}
	 */
	public final long missingTimeInMillis() {
		return this.missingTimeInMillis;
	}

	/**
	 * Required - API name: {@code missing_total}
	 */
	public final long missingTotal() {
		return this.missingTotal;
	}

	/**
	 * API name: {@code time}
	 */
	@Nullable
	public final String time() {
		return this.time;
	}

	/**
	 * Required - API name: {@code time_in_millis}
	 */
	public final long timeInMillis() {
		return this.timeInMillis;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetStats> {
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
		 * Required - API name: {@code current}
		 */
		public final Builder current(long value) {
			this.current = value;
			return this;
		}

		/**
		 * API name: {@code exists_time}
		 */
		public final Builder existsTime(@Nullable String value) {
			this.existsTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code exists_time_in_millis}
		 */
		public final Builder existsTimeInMillis(long value) {
			this.existsTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code exists_total}
		 */
		public final Builder existsTotal(long value) {
			this.existsTotal = value;
			return this;
		}

		/**
		 * API name: {@code missing_time}
		 */
		public final Builder missingTime(@Nullable String value) {
			this.missingTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code missing_time_in_millis}
		 */
		public final Builder missingTimeInMillis(long value) {
			this.missingTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code missing_total}
		 */
		public final Builder missingTotal(long value) {
			this.missingTotal = value;
			return this;
		}

		/**
		 * API name: {@code time}
		 */
		public final Builder time(@Nullable String value) {
			this.time = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_in_millis}
		 */
		public final Builder timeInMillis(long value) {
			this.timeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(long value) {
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
			_checkSingleUse();

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
