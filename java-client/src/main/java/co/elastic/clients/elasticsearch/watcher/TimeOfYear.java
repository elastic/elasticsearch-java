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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.TimeOfYear
public final class TimeOfYear implements JsonpSerializable {
	private final List<String> at;

	private final List<Month> int_;

	private final List<Number> on;

	// ---------------------------------------------------------------------------------------------

	public TimeOfYear(Builder builder) {

		this.at = Objects.requireNonNull(builder.at, "at");
		this.int_ = Objects.requireNonNull(builder.int_, "int");
		this.on = Objects.requireNonNull(builder.on, "on");

	}

	/**
	 * API name: {@code at}
	 */
	public List<String> at() {
		return this.at;
	}

	/**
	 * API name: {@code int}
	 */
	public List<Month> int_() {
		return this.int_;
	}

	/**
	 * API name: {@code on}
	 */
	public List<Number> on() {
		return this.on;
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

		generator.writeKey("at");
		generator.writeStartArray();
		for (String item0 : this.at) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("int");
		generator.writeStartArray();
		for (Month item0 : this.int_) {
			item0.serialize(generator, mapper);
		}
		generator.writeEnd();

		generator.writeKey("on");
		generator.writeStartArray();
		for (Number item0 : this.on) {
			generator.write(item0.doubleValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimeOfYear}.
	 */
	public static class Builder implements ObjectBuilder<TimeOfYear> {
		private List<String> at;

		private List<Month> int_;

		private List<Number> on;

		/**
		 * API name: {@code at}
		 */
		public Builder at(List<String> value) {
			this.at = value;
			return this;
		}

		/**
		 * API name: {@code at}
		 */
		public Builder at(String... value) {
			this.at = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #at(List)}, creating the list if needed.
		 */
		public Builder addAt(String value) {
			if (this.at == null) {
				this.at = new ArrayList<>();
			}
			this.at.add(value);
			return this;
		}

		/**
		 * API name: {@code int}
		 */
		public Builder int_(List<Month> value) {
			this.int_ = value;
			return this;
		}

		/**
		 * API name: {@code int}
		 */
		public Builder int_(Month... value) {
			this.int_ = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #int_(List)}, creating the list if needed.
		 */
		public Builder addInt(Month value) {
			if (this.int_ == null) {
				this.int_ = new ArrayList<>();
			}
			this.int_.add(value);
			return this;
		}

		/**
		 * API name: {@code on}
		 */
		public Builder on(List<Number> value) {
			this.on = value;
			return this;
		}

		/**
		 * API name: {@code on}
		 */
		public Builder on(Number... value) {
			this.on = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #on(List)}, creating the list if needed.
		 */
		public Builder addOn(Number value) {
			if (this.on == null) {
				this.on = new ArrayList<>();
			}
			this.on.add(value);
			return this;
		}

		/**
		 * Builds a {@link TimeOfYear}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TimeOfYear build() {

			return new TimeOfYear(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TimeOfYear}
	 */
	public static final JsonpDeserializer<TimeOfYear> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TimeOfYear::setupTimeOfYearDeserializer);

	protected static void setupTimeOfYearDeserializer(DelegatingDeserializer<TimeOfYear.Builder> op) {

		op.add(Builder::at, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "at");
		op.add(Builder::int_, JsonpDeserializer.arrayDeserializer(Month.DESERIALIZER), "int");
		op.add(Builder::on, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.numberDeserializer()), "on");

	}

}
