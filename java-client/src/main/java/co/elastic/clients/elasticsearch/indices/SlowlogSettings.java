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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.SlowlogSettings

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.SlowlogSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlowlogSettings implements JsonpSerializable {
	@Nullable
	private final String level;

	@Nullable
	private final Integer source;

	@Nullable
	private final Boolean reformat;

	@Nullable
	private final SlowlogTresholds threshold;

	// ---------------------------------------------------------------------------------------------

	private SlowlogSettings(Builder builder) {

		this.level = builder.level;
		this.source = builder.source;
		this.reformat = builder.reformat;
		this.threshold = builder.threshold;

	}

	public static SlowlogSettings of(Function<Builder, ObjectBuilder<SlowlogSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code level}
	 */
	@Nullable
	public final String level() {
		return this.level;
	}

	/**
	 * API name: {@code source}
	 */
	@Nullable
	public final Integer source() {
		return this.source;
	}

	/**
	 * API name: {@code reformat}
	 */
	@Nullable
	public final Boolean reformat() {
		return this.reformat;
	}

	/**
	 * API name: {@code threshold}
	 */
	@Nullable
	public final SlowlogTresholds threshold() {
		return this.threshold;
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

		if (this.level != null) {
			generator.writeKey("level");
			generator.write(this.level);

		}
		if (this.source != null) {
			generator.writeKey("source");
			generator.write(this.source);

		}
		if (this.reformat != null) {
			generator.writeKey("reformat");
			generator.write(this.reformat);

		}
		if (this.threshold != null) {
			generator.writeKey("threshold");
			this.threshold.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlowlogSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SlowlogSettings> {
		@Nullable
		private String level;

		@Nullable
		private Integer source;

		@Nullable
		private Boolean reformat;

		@Nullable
		private SlowlogTresholds threshold;

		/**
		 * API name: {@code level}
		 */
		public final Builder level(@Nullable String value) {
			this.level = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public final Builder source(@Nullable Integer value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code reformat}
		 */
		public final Builder reformat(@Nullable Boolean value) {
			this.reformat = value;
			return this;
		}

		/**
		 * API name: {@code threshold}
		 */
		public final Builder threshold(@Nullable SlowlogTresholds value) {
			this.threshold = value;
			return this;
		}

		/**
		 * API name: {@code threshold}
		 */
		public final Builder threshold(Function<SlowlogTresholds.Builder, ObjectBuilder<SlowlogTresholds>> fn) {
			return this.threshold(fn.apply(new SlowlogTresholds.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlowlogSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlowlogSettings build() {
			_checkSingleUse();

			return new SlowlogSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlowlogSettings}
	 */
	public static final JsonpDeserializer<SlowlogSettings> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SlowlogSettings::setupSlowlogSettingsDeserializer);

	protected static void setupSlowlogSettingsDeserializer(ObjectDeserializer<SlowlogSettings.Builder> op) {

		op.add(Builder::level, JsonpDeserializer.stringDeserializer(), "level");
		op.add(Builder::source, JsonpDeserializer.integerDeserializer(), "source");
		op.add(Builder::reformat, JsonpDeserializer.booleanDeserializer(), "reformat");
		op.add(Builder::threshold, SlowlogTresholds._DESERIALIZER, "threshold");

	}

}
