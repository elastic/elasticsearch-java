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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.TimeOfYear
@JsonpDeserializable
public class TimeOfYear implements JsonpSerializable {
	private final List<String> at;

	private final List<Month> int_;

	private final List<Integer> on;

	// ---------------------------------------------------------------------------------------------

	private TimeOfYear(Builder builder) {

		this.at = ModelTypeHelper.unmodifiableRequired(builder.at, this, "at");
		this.int_ = ModelTypeHelper.unmodifiableRequired(builder.int_, this, "int_");
		this.on = ModelTypeHelper.unmodifiableRequired(builder.on, this, "on");

	}

	public static TimeOfYear of(Function<Builder, ObjectBuilder<TimeOfYear>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code at}
	 */
	public final List<String> at() {
		return this.at;
	}

	/**
	 * Required - API name: {@code int}
	 */
	public final List<Month> int_() {
		return this.int_;
	}

	/**
	 * Required - API name: {@code on}
	 */
	public final List<Integer> on() {
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

		if (ModelTypeHelper.isDefined(this.at)) {
			generator.writeKey("at");
			generator.writeStartArray();
			for (String item0 : this.at) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.int_)) {
			generator.writeKey("int");
			generator.writeStartArray();
			for (Month item0 : this.int_) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.on)) {
			generator.writeKey("on");
			generator.writeStartArray();
			for (Integer item0 : this.on) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimeOfYear}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TimeOfYear> {
		private List<String> at;

		private List<Month> int_;

		private List<Integer> on;

		/**
		 * Required - API name: {@code at}
		 */
		public final Builder at(List<String> value) {
			this.at = value;
			return this;
		}

		/**
		 * Required - API name: {@code at}
		 */
		public final Builder at(String... value) {
			this.at = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code int}
		 */
		public final Builder int_(List<Month> value) {
			this.int_ = value;
			return this;
		}

		/**
		 * Required - API name: {@code int}
		 */
		public final Builder int_(Month... value) {
			this.int_ = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code on}
		 */
		public final Builder on(List<Integer> value) {
			this.on = value;
			return this;
		}

		/**
		 * Required - API name: {@code on}
		 */
		public final Builder on(Integer... value) {
			this.on = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link TimeOfYear}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TimeOfYear build() {
			_checkSingleUse();

			return new TimeOfYear(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TimeOfYear}
	 */
	public static final JsonpDeserializer<TimeOfYear> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TimeOfYear::setupTimeOfYearDeserializer, Builder::build);

	protected static void setupTimeOfYearDeserializer(DelegatingDeserializer<TimeOfYear.Builder> op) {

		op.add(Builder::at, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "at");
		op.add(Builder::int_, JsonpDeserializer.arrayDeserializer(Month._DESERIALIZER), "int");
		op.add(Builder::on, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.integerDeserializer()), "on");

	}

}
