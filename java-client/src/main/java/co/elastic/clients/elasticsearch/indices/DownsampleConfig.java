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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.DownsampleConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.DownsampleConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class DownsampleConfig implements JsonpSerializable {
	private final Time fixedInterval;

	// ---------------------------------------------------------------------------------------------

	private DownsampleConfig(Builder builder) {

		this.fixedInterval = ApiTypeHelper.requireNonNull(builder.fixedInterval, this, "fixedInterval");

	}

	public static DownsampleConfig of(Function<Builder, ObjectBuilder<DownsampleConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The interval at which to aggregate the original time series index.
	 * <p>
	 * API name: {@code fixed_interval}
	 */
	public final Time fixedInterval() {
		return this.fixedInterval;
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

		generator.writeKey("fixed_interval");
		this.fixedInterval.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DownsampleConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DownsampleConfig> {
		private Time fixedInterval;

		/**
		 * Required - The interval at which to aggregate the original time series index.
		 * <p>
		 * API name: {@code fixed_interval}
		 */
		public final Builder fixedInterval(Time value) {
			this.fixedInterval = value;
			return this;
		}

		/**
		 * Required - The interval at which to aggregate the original time series index.
		 * <p>
		 * API name: {@code fixed_interval}
		 */
		public final Builder fixedInterval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.fixedInterval(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DownsampleConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DownsampleConfig build() {
			_checkSingleUse();

			return new DownsampleConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DownsampleConfig}
	 */
	public static final JsonpDeserializer<DownsampleConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DownsampleConfig::setupDownsampleConfigDeserializer);

	protected static void setupDownsampleConfigDeserializer(ObjectDeserializer<DownsampleConfig.Builder> op) {

		op.add(Builder::fixedInterval, Time._DESERIALIZER, "fixed_interval");

	}

}
