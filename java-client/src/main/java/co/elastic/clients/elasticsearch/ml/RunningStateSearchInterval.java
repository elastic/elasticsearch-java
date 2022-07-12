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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.RunningStateSearchInterval

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.RunningStateSearchInterval">API
 *      specification</a>
 */
@JsonpDeserializable
public class RunningStateSearchInterval implements JsonpSerializable {
	@Nullable
	private final Time end;

	private final long endMs;

	@Nullable
	private final Time start;

	private final long startMs;

	// ---------------------------------------------------------------------------------------------

	private RunningStateSearchInterval(Builder builder) {

		this.end = builder.end;
		this.endMs = ApiTypeHelper.requireNonNull(builder.endMs, this, "endMs");
		this.start = builder.start;
		this.startMs = ApiTypeHelper.requireNonNull(builder.startMs, this, "startMs");

	}

	public static RunningStateSearchInterval of(Function<Builder, ObjectBuilder<RunningStateSearchInterval>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code end}
	 */
	@Nullable
	public final Time end() {
		return this.end;
	}

	/**
	 * Required - API name: {@code end_ms}
	 */
	public final long endMs() {
		return this.endMs;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public final Time start() {
		return this.start;
	}

	/**
	 * Required - API name: {@code start_ms}
	 */
	public final long startMs() {
		return this.startMs;
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

		if (this.end != null) {
			generator.writeKey("end");
			this.end.serialize(generator, mapper);

		}
		generator.writeKey("end_ms");
		generator.write(this.endMs);

		if (this.start != null) {
			generator.writeKey("start");
			this.start.serialize(generator, mapper);

		}
		generator.writeKey("start_ms");
		generator.write(this.startMs);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RunningStateSearchInterval}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RunningStateSearchInterval> {
		@Nullable
		private Time end;

		private Long endMs;

		@Nullable
		private Time start;

		private Long startMs;

		/**
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable Time value) {
			this.end = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public final Builder end(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.end(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code end_ms}
		 */
		public final Builder endMs(long value) {
			this.endMs = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable Time value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public final Builder start(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.start(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code start_ms}
		 */
		public final Builder startMs(long value) {
			this.startMs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RunningStateSearchInterval}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RunningStateSearchInterval build() {
			_checkSingleUse();

			return new RunningStateSearchInterval(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RunningStateSearchInterval}
	 */
	public static final JsonpDeserializer<RunningStateSearchInterval> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RunningStateSearchInterval::setupRunningStateSearchIntervalDeserializer);

	protected static void setupRunningStateSearchIntervalDeserializer(
			ObjectDeserializer<RunningStateSearchInterval.Builder> op) {

		op.add(Builder::end, Time._DESERIALIZER, "end");
		op.add(Builder::endMs, JsonpDeserializer.longDeserializer(), "end_ms");
		op.add(Builder::start, Time._DESERIALIZER, "start");
		op.add(Builder::startMs, JsonpDeserializer.longDeserializer(), "start_ms");

	}

}
