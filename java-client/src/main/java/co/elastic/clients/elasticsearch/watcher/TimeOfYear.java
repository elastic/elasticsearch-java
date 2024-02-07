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

package co.elastic.clients.elasticsearch.watcher;

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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: watcher._types.TimeOfYear

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.TimeOfYear">API
 *      specification</a>
 */
@JsonpDeserializable
public class TimeOfYear implements JsonpSerializable {
	private final List<String> at;

	private final List<Month> int_;

	private final List<Integer> on;

	// ---------------------------------------------------------------------------------------------

	private TimeOfYear(Builder builder) {

		this.at = ApiTypeHelper.unmodifiableRequired(builder.at, this, "at");
		this.int_ = ApiTypeHelper.unmodifiableRequired(builder.int_, this, "int_");
		this.on = ApiTypeHelper.unmodifiableRequired(builder.on, this, "on");

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

		if (ApiTypeHelper.isDefined(this.at)) {
			generator.writeKey("at");
			generator.writeStartArray();
			for (String item0 : this.at) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.int_)) {
			generator.writeKey("int");
			generator.writeStartArray();
			for (Month item0 : this.int_) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.on)) {
			generator.writeKey("on");
			generator.writeStartArray();
			for (Integer item0 : this.on) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimeOfYear}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TimeOfYear> {
		private List<String> at;

		private List<Month> int_;

		private List<Integer> on;

		/**
		 * Required - API name: {@code at}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>at</code>.
		 */
		public final Builder at(List<String> list) {
			this.at = _listAddAll(this.at, list);
			return this;
		}

		/**
		 * Required - API name: {@code at}
		 * <p>
		 * Adds one or more values to <code>at</code>.
		 */
		public final Builder at(String value, String... values) {
			this.at = _listAdd(this.at, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code int}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>int_</code>.
		 */
		public final Builder int_(List<Month> list) {
			this.int_ = _listAddAll(this.int_, list);
			return this;
		}

		/**
		 * Required - API name: {@code int}
		 * <p>
		 * Adds one or more values to <code>int_</code>.
		 */
		public final Builder int_(Month value, Month... values) {
			this.int_ = _listAdd(this.int_, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code on}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>on</code>.
		 */
		public final Builder on(List<Integer> list) {
			this.on = _listAddAll(this.on, list);
			return this;
		}

		/**
		 * Required - API name: {@code on}
		 * <p>
		 * Adds one or more values to <code>on</code>.
		 */
		public final Builder on(Integer value, Integer... values) {
			this.on = _listAdd(this.on, value, values);
			return this;
		}

		@Override
		protected Builder self() {
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
			TimeOfYear::setupTimeOfYearDeserializer);

	protected static void setupTimeOfYearDeserializer(ObjectDeserializer<TimeOfYear.Builder> op) {

		op.add(Builder::at, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "at");
		op.add(Builder::int_, JsonpDeserializer.arrayDeserializer(Month._DESERIALIZER), "int");
		op.add(Builder::on, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.integerDeserializer()), "on");

	}

}
