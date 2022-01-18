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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml._types.DatafeedRunningState

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.DatafeedRunningState">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatafeedRunningState implements JsonpSerializable {
	private final boolean realTimeConfigured;

	private final boolean realTimeRunning;

	// ---------------------------------------------------------------------------------------------

	private DatafeedRunningState(Builder builder) {

		this.realTimeConfigured = ApiTypeHelper.requireNonNull(builder.realTimeConfigured, this, "realTimeConfigured");
		this.realTimeRunning = ApiTypeHelper.requireNonNull(builder.realTimeRunning, this, "realTimeRunning");

	}

	public static DatafeedRunningState of(Function<Builder, ObjectBuilder<DatafeedRunningState>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code real_time_configured}
	 */
	public final boolean realTimeConfigured() {
		return this.realTimeConfigured;
	}

	/**
	 * Required - API name: {@code real_time_running}
	 */
	public final boolean realTimeRunning() {
		return this.realTimeRunning;
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

		generator.writeKey("real_time_configured");
		generator.write(this.realTimeConfigured);

		generator.writeKey("real_time_running");
		generator.write(this.realTimeRunning);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedRunningState}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DatafeedRunningState> {
		private Boolean realTimeConfigured;

		private Boolean realTimeRunning;

		/**
		 * Required - API name: {@code real_time_configured}
		 */
		public final Builder realTimeConfigured(boolean value) {
			this.realTimeConfigured = value;
			return this;
		}

		/**
		 * Required - API name: {@code real_time_running}
		 */
		public final Builder realTimeRunning(boolean value) {
			this.realTimeRunning = value;
			return this;
		}

		/**
		 * Builds a {@link DatafeedRunningState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedRunningState build() {
			_checkSingleUse();

			return new DatafeedRunningState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DatafeedRunningState}
	 */
	public static final JsonpDeserializer<DatafeedRunningState> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DatafeedRunningState::setupDatafeedRunningStateDeserializer);

	protected static void setupDatafeedRunningStateDeserializer(ObjectDeserializer<DatafeedRunningState.Builder> op) {

		op.add(Builder::realTimeConfigured, JsonpDeserializer.booleanDeserializer(), "real_time_configured");
		op.add(Builder::realTimeRunning, JsonpDeserializer.booleanDeserializer(), "real_time_running");

	}

}
