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

package co.elastic.clients.elasticsearch.security;

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

// typedef: security._types.Restriction

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.Restriction">API
 *      specification</a>
 */
@JsonpDeserializable
public class Restriction implements JsonpSerializable {
	private final List<String> workflows;

	// ---------------------------------------------------------------------------------------------

	private Restriction(Builder builder) {

		this.workflows = ApiTypeHelper.unmodifiableRequired(builder.workflows, this, "workflows");

	}

	public static Restriction of(Function<Builder, ObjectBuilder<Restriction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code workflows}
	 */
	public final List<String> workflows() {
		return this.workflows;
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

		if (ApiTypeHelper.isDefined(this.workflows)) {
			generator.writeKey("workflows");
			generator.writeStartArray();
			for (String item0 : this.workflows) {
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
	 * Builder for {@link Restriction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Restriction> {
		private List<String> workflows;

		/**
		 * Required - API name: {@code workflows}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>workflows</code>.
		 */
		public final Builder workflows(List<String> list) {
			this.workflows = _listAddAll(this.workflows, list);
			return this;
		}

		/**
		 * Required - API name: {@code workflows}
		 * <p>
		 * Adds one or more values to <code>workflows</code>.
		 */
		public final Builder workflows(String value, String... values) {
			this.workflows = _listAdd(this.workflows, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Restriction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Restriction build() {
			_checkSingleUse();

			return new Restriction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Restriction}
	 */
	public static final JsonpDeserializer<Restriction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Restriction::setupRestrictionDeserializer);

	protected static void setupRestrictionDeserializer(ObjectDeserializer<Restriction.Builder> op) {

		op.add(Builder::workflows, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"workflows");

	}

}
