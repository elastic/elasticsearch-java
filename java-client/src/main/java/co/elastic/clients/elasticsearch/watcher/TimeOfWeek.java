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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.TimeOfWeek
@JsonpDeserializable
public final class TimeOfWeek implements JsonpSerializable {
	private final List<String> at;

	private final List<Day> on;

	// ---------------------------------------------------------------------------------------------

	public TimeOfWeek(Builder builder) {

		this.at = ModelTypeHelper.unmodifiableNonNull(builder.at, "at");
		this.on = ModelTypeHelper.unmodifiableNonNull(builder.on, "on");

	}

	public TimeOfWeek(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code at}
	 */
	public List<String> at() {
		return this.at;
	}

	/**
	 * Required - API name: {@code on}
	 */
	public List<Day> on() {
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

		generator.writeKey("on");
		generator.writeStartArray();
		for (Day item0 : this.on) {
			item0.serialize(generator, mapper);
		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimeOfWeek}.
	 */
	public static class Builder implements ObjectBuilder<TimeOfWeek> {
		private List<String> at;

		private List<Day> on;

		/**
		 * Required - API name: {@code at}
		 */
		public Builder at(List<String> value) {
			this.at = value;
			return this;
		}

		/**
		 * Required - API name: {@code at}
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
		 * Required - API name: {@code on}
		 */
		public Builder on(List<Day> value) {
			this.on = value;
			return this;
		}

		/**
		 * Required - API name: {@code on}
		 */
		public Builder on(Day... value) {
			this.on = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #on(List)}, creating the list if needed.
		 */
		public Builder addOn(Day value) {
			if (this.on == null) {
				this.on = new ArrayList<>();
			}
			this.on.add(value);
			return this;
		}

		/**
		 * Builds a {@link TimeOfWeek}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TimeOfWeek build() {

			return new TimeOfWeek(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TimeOfWeek}
	 */
	public static final JsonpDeserializer<TimeOfWeek> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TimeOfWeek::setupTimeOfWeekDeserializer, Builder::build);

	protected static void setupTimeOfWeekDeserializer(DelegatingDeserializer<TimeOfWeek.Builder> op) {

		op.add(Builder::at, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "at");
		op.add(Builder::on, JsonpDeserializer.arrayDeserializer(Day._DESERIALIZER), "on");

	}

}
