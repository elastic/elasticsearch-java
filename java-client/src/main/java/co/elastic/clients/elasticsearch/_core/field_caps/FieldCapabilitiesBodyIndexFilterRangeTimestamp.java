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

package co.elastic.clients.elasticsearch._core.field_caps;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.field_caps.FieldCapabilitiesBodyIndexFilterRangeTimestamp
@JsonpDeserializable
public final class FieldCapabilitiesBodyIndexFilterRangeTimestamp implements JsonpSerializable {
	@Nullable
	private final Integer gte;

	@Nullable
	private final Integer gt;

	@Nullable
	private final Integer lte;

	@Nullable
	private final Integer lt;

	// ---------------------------------------------------------------------------------------------

	public FieldCapabilitiesBodyIndexFilterRangeTimestamp(Builder builder) {

		this.gte = builder.gte;
		this.gt = builder.gt;
		this.lte = builder.lte;
		this.lt = builder.lt;

	}

	/**
	 * API name: {@code gte}
	 */
	@Nullable
	public Integer gte() {
		return this.gte;
	}

	/**
	 * API name: {@code gt}
	 */
	@Nullable
	public Integer gt() {
		return this.gt;
	}

	/**
	 * API name: {@code lte}
	 */
	@Nullable
	public Integer lte() {
		return this.lte;
	}

	/**
	 * API name: {@code lt}
	 */
	@Nullable
	public Integer lt() {
		return this.lt;
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

		if (this.gte != null) {

			generator.writeKey("gte");
			generator.write(this.gte);

		}
		if (this.gt != null) {

			generator.writeKey("gt");
			generator.write(this.gt);

		}
		if (this.lte != null) {

			generator.writeKey("lte");
			generator.write(this.lte);

		}
		if (this.lt != null) {

			generator.writeKey("lt");
			generator.write(this.lt);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapabilitiesBodyIndexFilterRangeTimestamp}.
	 */
	public static class Builder implements ObjectBuilder<FieldCapabilitiesBodyIndexFilterRangeTimestamp> {
		@Nullable
		private Integer gte;

		@Nullable
		private Integer gt;

		@Nullable
		private Integer lte;

		@Nullable
		private Integer lt;

		/**
		 * API name: {@code gte}
		 */
		public Builder gte(@Nullable Integer value) {
			this.gte = value;
			return this;
		}

		/**
		 * API name: {@code gt}
		 */
		public Builder gt(@Nullable Integer value) {
			this.gt = value;
			return this;
		}

		/**
		 * API name: {@code lte}
		 */
		public Builder lte(@Nullable Integer value) {
			this.lte = value;
			return this;
		}

		/**
		 * API name: {@code lt}
		 */
		public Builder lt(@Nullable Integer value) {
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
	 * Json deserializer for {@link FieldCapabilitiesBodyIndexFilterRangeTimestamp}
	 */
	public static final JsonpDeserializer<FieldCapabilitiesBodyIndexFilterRangeTimestamp> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					FieldCapabilitiesBodyIndexFilterRangeTimestamp::setupFieldCapabilitiesBodyIndexFilterRangeTimestampDeserializer,
					Builder::build);

	protected static void setupFieldCapabilitiesBodyIndexFilterRangeTimestampDeserializer(
			DelegatingDeserializer<FieldCapabilitiesBodyIndexFilterRangeTimestamp.Builder> op) {

		op.add(Builder::gte, JsonpDeserializer.integerDeserializer(), "gte");
		op.add(Builder::gt, JsonpDeserializer.integerDeserializer(), "gt");
		op.add(Builder::lte, JsonpDeserializer.integerDeserializer(), "lte");
		op.add(Builder::lt, JsonpDeserializer.integerDeserializer(), "lt");

	}

}
