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
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: _global.field_caps.FieldCapabilitiesBodyIndexFilterRangeTimestamp
public final class FieldCapabilitiesBodyIndexFilterRangeTimestamp implements ToJsonp {
	@Nullable
	private final Number gte;

	@Nullable
	private final Number gt;

	@Nullable
	private final Number lte;

	@Nullable
	private final Number lt;

	// ---------------------------------------------------------------------------------------------

	protected FieldCapabilitiesBodyIndexFilterRangeTimestamp(Builder builder) {

		this.gte = builder.gte;
		this.gt = builder.gt;
		this.lte = builder.lte;
		this.lt = builder.lt;

	}

	/**
	 * API name: {@code gte}
	 */
	@Nullable
	public Number gte() {
		return this.gte;
	}

	/**
	 * API name: {@code gt}
	 */
	@Nullable
	public Number gt() {
		return this.gt;
	}

	/**
	 * API name: {@code lte}
	 */
	@Nullable
	public Number lte() {
		return this.lte;
	}

	/**
	 * API name: {@code lt}
	 */
	@Nullable
	public Number lt() {
		return this.lt;
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

		if (this.gte != null) {

			generator.writeKey("gte");
			generator.write(this.gte.doubleValue());

		}
		if (this.gt != null) {

			generator.writeKey("gt");
			generator.write(this.gt.doubleValue());

		}
		if (this.lte != null) {

			generator.writeKey("lte");
			generator.write(this.lte.doubleValue());

		}
		if (this.lt != null) {

			generator.writeKey("lt");
			generator.write(this.lt.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapabilitiesBodyIndexFilterRangeTimestamp}.
	 */
	public static class Builder implements ObjectBuilder<FieldCapabilitiesBodyIndexFilterRangeTimestamp> {
		@Nullable
		private Number gte;

		@Nullable
		private Number gt;

		@Nullable
		private Number lte;

		@Nullable
		private Number lt;

		/**
		 * API name: {@code gte}
		 */
		public Builder gte(@Nullable Number value) {
			this.gte = value;
			return this;
		}

		/**
		 * API name: {@code gt}
		 */
		public Builder gt(@Nullable Number value) {
			this.gt = value;
			return this;
		}

		/**
		 * API name: {@code lte}
		 */
		public Builder lte(@Nullable Number value) {
			this.lte = value;
			return this;
		}

		/**
		 * API name: {@code lt}
		 */
		public Builder lt(@Nullable Number value) {
			this.lt = value;
			return this;
		}

		/**
		 * Builds a {@link FieldCapabilitiesBodyIndexFilterRangeTimestamp}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCapabilitiesBodyIndexFilterRangeTimestamp build() {

			return new FieldCapabilitiesBodyIndexFilterRangeTimestamp(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldCapabilitiesBodyIndexFilterRangeTimestamp
	 */
	public static final JsonpDeserializer<FieldCapabilitiesBodyIndexFilterRangeTimestamp> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					FieldCapabilitiesBodyIndexFilterRangeTimestamp::setupFieldCapabilitiesBodyIndexFilterRangeTimestampDeserializer);

	protected static void setupFieldCapabilitiesBodyIndexFilterRangeTimestampDeserializer(
			DelegatingDeserializer<FieldCapabilitiesBodyIndexFilterRangeTimestamp.Builder> op) {

		op.add(Builder::gte, JsonpDeserializer.numberDeserializer(), "gte");
		op.add(Builder::gt, JsonpDeserializer.numberDeserializer(), "gt");
		op.add(Builder::lte, JsonpDeserializer.numberDeserializer(), "lte");
		op.add(Builder::lt, JsonpDeserializer.numberDeserializer(), "lt");

	}

}
