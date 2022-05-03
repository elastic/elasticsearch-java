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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.Time;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.SlowlogTresholdLevels

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SlowlogTresholdLevels">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlowlogTresholdLevels implements JsonpSerializable {
	@Nullable
	private final Time warn;

	@Nullable
	private final Time info;

	@Nullable
	private final Time debug;

	@Nullable
	private final Time trace;

	// ---------------------------------------------------------------------------------------------

	private SlowlogTresholdLevels(Builder builder) {

		this.warn = builder.warn;
		this.info = builder.info;
		this.debug = builder.debug;
		this.trace = builder.trace;

	}

	public static SlowlogTresholdLevels of(Function<Builder, ObjectBuilder<SlowlogTresholdLevels>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code warn}
	 */
	@Nullable
	public final Time warn() {
		return this.warn;
	}

	/**
	 * API name: {@code info}
	 */
	@Nullable
	public final Time info() {
		return this.info;
	}

	/**
	 * API name: {@code debug}
	 */
	@Nullable
	public final Time debug() {
		return this.debug;
	}

	/**
	 * API name: {@code trace}
	 */
	@Nullable
	public final Time trace() {
		return this.trace;
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

		if (this.warn != null) {
			generator.writeKey("warn");
			this.warn.serialize(generator, mapper);

		}
		if (this.info != null) {
			generator.writeKey("info");
			this.info.serialize(generator, mapper);

		}
		if (this.debug != null) {
			generator.writeKey("debug");
			this.debug.serialize(generator, mapper);

		}
		if (this.trace != null) {
			generator.writeKey("trace");
			this.trace.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlowlogTresholdLevels}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SlowlogTresholdLevels> {
		@Nullable
		private Time warn;

		@Nullable
		private Time info;

		@Nullable
		private Time debug;

		@Nullable
		private Time trace;

		/**
		 * API name: {@code warn}
		 */
		public final Builder warn(@Nullable Time value) {
			this.warn = value;
			return this;
		}

		/**
		 * API name: {@code warn}
		 */
		public final Builder warn(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.warn(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code info}
		 */
		public final Builder info(@Nullable Time value) {
			this.info = value;
			return this;
		}

		/**
		 * API name: {@code info}
		 */
		public final Builder info(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.info(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code debug}
		 */
		public final Builder debug(@Nullable Time value) {
			this.debug = value;
			return this;
		}

		/**
		 * API name: {@code debug}
		 */
		public final Builder debug(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.debug(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code trace}
		 */
		public final Builder trace(@Nullable Time value) {
			this.trace = value;
			return this;
		}

		/**
		 * API name: {@code trace}
		 */
		public final Builder trace(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.trace(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlowlogTresholdLevels}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlowlogTresholdLevels build() {
			_checkSingleUse();

			return new SlowlogTresholdLevels(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlowlogTresholdLevels}
	 */
	public static final JsonpDeserializer<SlowlogTresholdLevels> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SlowlogTresholdLevels::setupSlowlogTresholdLevelsDeserializer);

	protected static void setupSlowlogTresholdLevelsDeserializer(ObjectDeserializer<SlowlogTresholdLevels.Builder> op) {

		op.add(Builder::warn, Time._DESERIALIZER, "warn");
		op.add(Builder::info, Time._DESERIALIZER, "info");
		op.add(Builder::debug, Time._DESERIALIZER, "debug");
		op.add(Builder::trace, Time._DESERIALIZER, "trace");

	}

}
