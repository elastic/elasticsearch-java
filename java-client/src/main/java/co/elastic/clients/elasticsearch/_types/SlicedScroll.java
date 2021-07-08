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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.SlicedScroll
public final class SlicedScroll implements ToJsonp {
	@Nullable
	private final String field;

	private final Number id;

	private final Number max;

	// ---------------------------------------------------------------------------------------------

	protected SlicedScroll(Builder builder) {

		this.field = builder.field;
		this.id = Objects.requireNonNull(builder.id, "id");
		this.max = Objects.requireNonNull(builder.max, "max");

	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code id}
	 */
	public Number id() {
		return this.id;
	}

	/**
	 * API name: {@code max}
	 */
	public Number max() {
		return this.max;
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

		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}

		generator.writeKey("id");
		generator.write(this.id.doubleValue());

		generator.writeKey("max");
		generator.write(this.max.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlicedScroll}.
	 */
	public static class Builder implements ObjectBuilder<SlicedScroll> {
		@Nullable
		private String field;

		private Number id;

		private Number max;

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(Number value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code max}
		 */
		public Builder max(Number value) {
			this.max = value;
			return this;
		}

		/**
		 * Builds a {@link SlicedScroll}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlicedScroll build() {

			return new SlicedScroll(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SlicedScroll
	 */
	public static final JsonpDeserializer<SlicedScroll> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SlicedScroll::setupSlicedScrollDeserializer);

	protected static void setupSlicedScrollDeserializer(DelegatingDeserializer<SlicedScroll.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::id, JsonpDeserializer.numberDeserializer(), "id");
		op.add(Builder::max, JsonpDeserializer.numberDeserializer(), "max");

	}

}
