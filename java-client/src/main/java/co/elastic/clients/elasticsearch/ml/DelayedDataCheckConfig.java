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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DelayedDataCheckConfig
@JsonpDeserializable
public final class DelayedDataCheckConfig implements JsonpSerializable {
	@Nullable
	private final String checkWindow;

	private final boolean enabled;

	// ---------------------------------------------------------------------------------------------

	public DelayedDataCheckConfig(Builder builder) {

		this.checkWindow = builder.checkWindow;
		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");

	}

	/**
	 * The window of time that is searched for late data. This window of time ends
	 * with the latest finalized bucket. It defaults to null, which causes an
	 * appropriate check_window to be calculated when the real-time datafeed runs.
	 * In particular, the default <code>check_window</code> span calculation is
	 * based on the maximum of <code>2h</code> or <code>8 * bucket_span</code>.
	 * <p>
	 * API name: {@code check_window}
	 */
	@Nullable
	public String checkWindow() {
		return this.checkWindow;
	}

	/**
	 * Specifies whether the datafeed periodically checks for delayed data.
	 * <p>
	 * API name: {@code enabled}
	 */
	public boolean enabled() {
		return this.enabled;
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

		if (this.checkWindow != null) {

			generator.writeKey("check_window");
			generator.write(this.checkWindow);

		}

		generator.writeKey("enabled");
		generator.write(this.enabled);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DelayedDataCheckConfig}.
	 */
	public static class Builder implements ObjectBuilder<DelayedDataCheckConfig> {
		@Nullable
		private String checkWindow;

		private Boolean enabled;

		/**
		 * The window of time that is searched for late data. This window of time ends
		 * with the latest finalized bucket. It defaults to null, which causes an
		 * appropriate check_window to be calculated when the real-time datafeed runs.
		 * In particular, the default <code>check_window</code> span calculation is
		 * based on the maximum of <code>2h</code> or <code>8 * bucket_span</code>.
		 * <p>
		 * API name: {@code check_window}
		 */
		public Builder checkWindow(@Nullable String value) {
			this.checkWindow = value;
			return this;
		}

		/**
		 * Specifies whether the datafeed periodically checks for delayed data.
		 * <p>
		 * API name: {@code enabled}
		 */
		public Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Builds a {@link DelayedDataCheckConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DelayedDataCheckConfig build() {

			return new DelayedDataCheckConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DelayedDataCheckConfig}
	 */
	public static final JsonpDeserializer<DelayedDataCheckConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DelayedDataCheckConfig::setupDelayedDataCheckConfigDeserializer, Builder::build);

	protected static void setupDelayedDataCheckConfigDeserializer(
			DelegatingDeserializer<DelayedDataCheckConfig.Builder> op) {

		op.add(Builder::checkWindow, JsonpDeserializer.stringDeserializer(), "check_window");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
