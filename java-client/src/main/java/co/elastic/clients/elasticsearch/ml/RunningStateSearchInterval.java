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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml._types.RunningStateSearchInterval

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.RunningStateSearchInterval">API
 *      specification</a>
 */
@JsonpDeserializable
public class RunningStateSearchInterval implements JsonpSerializable {
	private final long endMs;

	private final long startMs;

	// ---------------------------------------------------------------------------------------------

	private RunningStateSearchInterval(Builder builder) {

		this.endMs = ApiTypeHelper.requireNonNull(builder.endMs, this, "endMs");
		this.startMs = ApiTypeHelper.requireNonNull(builder.startMs, this, "startMs");

	}

	public static RunningStateSearchInterval of(Function<Builder, ObjectBuilder<RunningStateSearchInterval>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code end_ms}
	 */
	public final long endMs() {
		return this.endMs;
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

		generator.writeKey("end_ms");
		generator.write(this.endMs);

		generator.writeKey("start_ms");
		generator.write(this.startMs);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RunningStateSearchInterval}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RunningStateSearchInterval> {
		private Long endMs;

		private Long startMs;

		/**
		 * Required - API name: {@code end_ms}
		 */
		public final Builder endMs(long value) {
			this.endMs = value;
			return this;
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

		op.add(Builder::endMs, JsonpDeserializer.longDeserializer(), "end_ms");
		op.add(Builder::startMs, JsonpDeserializer.longDeserializer(), "start_ms");

	}

}
