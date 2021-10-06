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

package co.elastic.clients.elasticsearch.snapshot;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot._types.ShardsStatsSummary
@JsonpDeserializable
public final class ShardsStatsSummary implements JsonpSerializable {
	private final ShardsStatsSummaryItem incremental;

	private final ShardsStatsSummaryItem total;

	private final long startTimeInMillis;

	private final long timeInMillis;

	// ---------------------------------------------------------------------------------------------

	public ShardsStatsSummary(Builder builder) {

		this.incremental = Objects.requireNonNull(builder.incremental, "incremental");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.startTimeInMillis = Objects.requireNonNull(builder.startTimeInMillis, "start_time_in_millis");
		this.timeInMillis = Objects.requireNonNull(builder.timeInMillis, "time_in_millis");

	}

	public ShardsStatsSummary(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code incremental}
	 */
	public ShardsStatsSummaryItem incremental() {
		return this.incremental;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public ShardsStatsSummaryItem total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code start_time_in_millis}
	 */
	public long startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * Required - API name: {@code time_in_millis}
	 */
	public long timeInMillis() {
		return this.timeInMillis;
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

		generator.writeKey("incremental");
		this.incremental.serialize(generator, mapper);

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

		generator.writeKey("time_in_millis");
		generator.write(this.timeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsStatsSummary}.
	 */
	public static class Builder implements ObjectBuilder<ShardsStatsSummary> {
		private ShardsStatsSummaryItem incremental;

		private ShardsStatsSummaryItem total;

		private Long startTimeInMillis;

		private Long timeInMillis;

		/**
		 * Required - API name: {@code incremental}
		 */
		public Builder incremental(ShardsStatsSummaryItem value) {
			this.incremental = value;
			return this;
		}

		/**
		 * Required - API name: {@code incremental}
		 */
		public Builder incremental(Function<ShardsStatsSummaryItem.Builder, ObjectBuilder<ShardsStatsSummaryItem>> fn) {
			return this.incremental(fn.apply(new ShardsStatsSummaryItem.Builder()).build());
		}

		/**
		 * Required - API name: {@code total}
		 */
		public Builder total(ShardsStatsSummaryItem value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public Builder total(Function<ShardsStatsSummaryItem.Builder, ObjectBuilder<ShardsStatsSummaryItem>> fn) {
			return this.total(fn.apply(new ShardsStatsSummaryItem.Builder()).build());
		}

		/**
		 * Required - API name: {@code start_time_in_millis}
		 */
		public Builder startTimeInMillis(long value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_in_millis}
		 */
		public Builder timeInMillis(long value) {
			this.timeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link ShardsStatsSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsStatsSummary build() {

			return new ShardsStatsSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsStatsSummary}
	 */
	public static final JsonpDeserializer<ShardsStatsSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardsStatsSummary::setupShardsStatsSummaryDeserializer, Builder::build);

	protected static void setupShardsStatsSummaryDeserializer(DelegatingDeserializer<ShardsStatsSummary.Builder> op) {

		op.add(Builder::incremental, ShardsStatsSummaryItem._DESERIALIZER, "incremental");
		op.add(Builder::total, ShardsStatsSummaryItem._DESERIALIZER, "total");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(Builder::timeInMillis, JsonpDeserializer.longDeserializer(), "time_in_millis");

	}

}
