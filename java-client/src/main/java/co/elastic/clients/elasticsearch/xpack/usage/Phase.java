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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Long;
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

// typedef: xpack.usage.Phase

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Phase">API
 *      specification</a>
 */
@JsonpDeserializable
public class Phase implements JsonpSerializable {
	private final List<String> actions;

	private final long minAge;

	// ---------------------------------------------------------------------------------------------

	private Phase(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiableRequired(builder.actions, this, "actions");
		this.minAge = ApiTypeHelper.requireNonNull(builder.minAge, this, "minAge", 0);

	}

	public static Phase of(Function<Builder, ObjectBuilder<Phase>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final List<String> actions() {
		return this.actions;
	}

	/**
	 * Required - API name: {@code min_age}
	 */
	public final long minAge() {
		return this.minAge;
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

		if (ApiTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartArray();
			for (String item0 : this.actions) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("min_age");
		generator.write(this.minAge);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Phase}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Phase> {
		private List<String> actions;

		private Long minAge;

		public Builder() {
		}
		private Builder(Phase instance) {
			this.actions = instance.actions;
			this.minAge = instance.minAge;

		}
		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actions</code>.
		 */
		public final Builder actions(List<String> list) {
			this.actions = _listAddAll(this.actions, list);
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds one or more values to <code>actions</code>.
		 */
		public final Builder actions(String value, String... values) {
			this.actions = _listAdd(this.actions, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code min_age}
		 */
		public final Builder minAge(long value) {
			this.minAge = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Phase}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Phase build() {
			_checkSingleUse();

			return new Phase(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Phase}
	 */
	public static final JsonpDeserializer<Phase> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Phase::setupPhaseDeserializer);

	protected static void setupPhaseDeserializer(ObjectDeserializer<Phase.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"actions");
		op.add(Builder::minAge, JsonpDeserializer.longDeserializer(), "min_age");

	}

}
