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

package co.elastic.clients.elasticsearch.indices.recovery;

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

// typedef: indices.recovery.TranslogStatus
@JsonpDeserializable
public class TranslogStatus implements JsonpSerializable {
	private final String percent;

	private final long recovered;

	private final long total;

	private final long totalOnStart;

	@Nullable
	private final String totalTime;

	private final String totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	private TranslogStatus(Builder builder) {

		this.percent = ModelTypeHelper.requireNonNull(builder.percent, this, "percent");
		this.recovered = ModelTypeHelper.requireNonNull(builder.recovered, this, "recovered");
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.totalOnStart = ModelTypeHelper.requireNonNull(builder.totalOnStart, this, "totalOnStart");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = ModelTypeHelper.requireNonNull(builder.totalTimeInMillis, this, "totalTimeInMillis");

	}

	public static TranslogStatus of(Function<Builder, ObjectBuilder<TranslogStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code percent}
	 */
	public final String percent() {
		return this.percent;
	}

	/**
	 * Required - API name: {@code recovered}
	 */
	public final long recovered() {
		return this.recovered;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code total_on_start}
	 */
	public final long totalOnStart() {
		return this.totalOnStart;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public final String totalTime() {
		return this.totalTime;
	}

	/**
	 * Required - API name: {@code total_time_in_millis}
	 */
	public final String totalTimeInMillis() {
		return this.totalTimeInMillis;
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

		generator.writeKey("percent");
		generator.write(this.percent);

		generator.writeKey("recovered");
		generator.write(this.recovered);

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("total_on_start");
		generator.write(this.totalOnStart);

		if (this.totalTime != null) {
			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}
		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TranslogStatus}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TranslogStatus> {
		private String percent;

		private Long recovered;

		private Long total;

		private Long totalOnStart;

		@Nullable
		private String totalTime;

		private String totalTimeInMillis;

		/**
		 * Required - API name: {@code percent}
		 */
		public final Builder percent(String value) {
			this.percent = value;
			return this;
		}

		/**
		 * Required - API name: {@code recovered}
		 */
		public final Builder recovered(long value) {
			this.recovered = value;
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
		 * Required - API name: {@code total_on_start}
		 */
		public final Builder totalOnStart(long value) {
			this.totalOnStart = value;
			return this;
		}

		/**
		 * API name: {@code total_time}
		 */
		public final Builder totalTime(@Nullable String value) {
			this.totalTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_time_in_millis}
		 */
		public final Builder totalTimeInMillis(String value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link TranslogStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TranslogStatus build() {
			_checkSingleUse();

			return new TranslogStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TranslogStatus}
	 */
	public static final JsonpDeserializer<TranslogStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TranslogStatus::setupTranslogStatusDeserializer, Builder::build);

	protected static void setupTranslogStatusDeserializer(DelegatingDeserializer<TranslogStatus.Builder> op) {

		op.add(Builder::percent, JsonpDeserializer.stringDeserializer(), "percent");
		op.add(Builder::recovered, JsonpDeserializer.longDeserializer(), "recovered");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::totalOnStart, JsonpDeserializer.longDeserializer(), "total_on_start");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.stringDeserializer(), "total_time_in_millis");

	}

}
