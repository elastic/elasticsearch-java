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

package co.elastic.clients.elasticsearch._global.field_caps;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.field_caps.FieldCapabilitiesBodyIndexFilterRange
public final class FieldCapabilitiesBodyIndexFilterRange implements ToJsonp {
	private final FieldCapabilitiesBodyIndexFilterRangeTimestamp timestamp;

	// ---------------------------------------------------------------------------------------------

	protected FieldCapabilitiesBodyIndexFilterRange(Builder builder) {

		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	/**
	 * API name: {@code timestamp}
	 */
	public FieldCapabilitiesBodyIndexFilterRangeTimestamp timestamp() {
		return this.timestamp;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("timestamp");
		this.timestamp.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapabilitiesBodyIndexFilterRange}.
	 */
	public static class Builder implements ObjectBuilder<FieldCapabilitiesBodyIndexFilterRange> {
		private FieldCapabilitiesBodyIndexFilterRangeTimestamp timestamp;

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(FieldCapabilitiesBodyIndexFilterRangeTimestamp value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(
				Function<FieldCapabilitiesBodyIndexFilterRangeTimestamp.Builder, ObjectBuilder<FieldCapabilitiesBodyIndexFilterRangeTimestamp>> fn) {
			return this.timestamp(fn.apply(new FieldCapabilitiesBodyIndexFilterRangeTimestamp.Builder()).build());
		}

		/**
		 * Builds a {@link FieldCapabilitiesBodyIndexFilterRange}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCapabilitiesBodyIndexFilterRange build() {

			return new FieldCapabilitiesBodyIndexFilterRange(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldCapabilitiesBodyIndexFilterRange
	 */
	public static final JsonpDeserializer<FieldCapabilitiesBodyIndexFilterRange> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					FieldCapabilitiesBodyIndexFilterRange::setupFieldCapabilitiesBodyIndexFilterRangeDeserializer);

	protected static void setupFieldCapabilitiesBodyIndexFilterRangeDeserializer(
			DelegatingDeserializer<FieldCapabilitiesBodyIndexFilterRange.Builder> op) {

		op.add(Builder::timestamp, FieldCapabilitiesBodyIndexFilterRangeTimestamp.DESERIALIZER, "timestamp");

	}

}
