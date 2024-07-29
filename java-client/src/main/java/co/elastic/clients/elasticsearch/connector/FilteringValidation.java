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

package co.elastic.clients.elasticsearch.connector;

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

// typedef: connector._types.FilteringValidation

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.FilteringValidation">API
 *      specification</a>
 */
@JsonpDeserializable
public class FilteringValidation implements JsonpSerializable {
	private final List<String> ids;

	private final List<String> messages;

	// ---------------------------------------------------------------------------------------------

	private FilteringValidation(Builder builder) {

		this.ids = ApiTypeHelper.unmodifiableRequired(builder.ids, this, "ids");
		this.messages = ApiTypeHelper.unmodifiableRequired(builder.messages, this, "messages");

	}

	public static FilteringValidation of(Function<Builder, ObjectBuilder<FilteringValidation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	/**
	 * Required - API name: {@code messages}
	 */
	public final List<String> messages() {
		return this.messages;
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

		if (ApiTypeHelper.isDefined(this.ids)) {
			generator.writeKey("ids");
			generator.writeStartArray();
			for (String item0 : this.ids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.messages)) {
			generator.writeKey("messages");
			generator.writeStartArray();
			for (String item0 : this.messages) {
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
	 * Builder for {@link FilteringValidation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FilteringValidation> {
		private List<String> ids;

		private List<String> messages;

		/**
		 * Required - API name: {@code ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ids</code>.
		 */
		public final Builder ids(List<String> list) {
			this.ids = _listAddAll(this.ids, list);
			return this;
		}

		/**
		 * Required - API name: {@code ids}
		 * <p>
		 * Adds one or more values to <code>ids</code>.
		 */
		public final Builder ids(String value, String... values) {
			this.ids = _listAdd(this.ids, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code messages}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>messages</code>.
		 */
		public final Builder messages(List<String> list) {
			this.messages = _listAddAll(this.messages, list);
			return this;
		}

		/**
		 * Required - API name: {@code messages}
		 * <p>
		 * Adds one or more values to <code>messages</code>.
		 */
		public final Builder messages(String value, String... values) {
			this.messages = _listAdd(this.messages, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FilteringValidation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FilteringValidation build() {
			_checkSingleUse();

			return new FilteringValidation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FilteringValidation}
	 */
	public static final JsonpDeserializer<FilteringValidation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FilteringValidation::setupFilteringValidationDeserializer);

	protected static void setupFilteringValidationDeserializer(ObjectDeserializer<FilteringValidation.Builder> op) {

		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");
		op.add(Builder::messages, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"messages");

	}

}
