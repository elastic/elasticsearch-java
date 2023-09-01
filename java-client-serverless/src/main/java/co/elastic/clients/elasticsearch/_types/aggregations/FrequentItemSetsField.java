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

package co.elastic.clients.elasticsearch._types.aggregations;

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

// typedef: _types.aggregations.FrequentItemSetsField

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.FrequentItemSetsField">API
 *      specification</a>
 */
@JsonpDeserializable
public class FrequentItemSetsField implements JsonpSerializable {
	private final String field;

	private final List<String> exclude;

	private final List<String> include;

	// ---------------------------------------------------------------------------------------------

	private FrequentItemSetsField(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.exclude = ApiTypeHelper.unmodifiable(builder.exclude);
		this.include = ApiTypeHelper.unmodifiable(builder.include);

	}

	public static FrequentItemSetsField of(Function<Builder, ObjectBuilder<FrequentItemSetsField>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Values to exclude. Can be regular expression strings or arrays of strings of
	 * exact terms.
	 * <p>
	 * API name: {@code exclude}
	 */
	public final List<String> exclude() {
		return this.exclude;
	}

	/**
	 * Values to include. Can be regular expression strings or arrays of strings of
	 * exact terms.
	 * <p>
	 * API name: {@code include}
	 */
	public final List<String> include() {
		return this.include;
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

		generator.writeKey("field");
		generator.write(this.field);

		if (ApiTypeHelper.isDefined(this.exclude)) {
			generator.writeKey("exclude");
			generator.writeStartArray();
			for (String item0 : this.exclude) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.include)) {
			generator.writeKey("include");
			generator.writeStartArray();
			for (String item0 : this.include) {
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
	 * Builder for {@link FrequentItemSetsField}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FrequentItemSetsField> {
		private String field;

		@Nullable
		private List<String> exclude;

		@Nullable
		private List<String> include;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Values to exclude. Can be regular expression strings or arrays of strings of
		 * exact terms.
		 * <p>
		 * API name: {@code exclude}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>exclude</code>.
		 */
		public final Builder exclude(List<String> list) {
			this.exclude = _listAddAll(this.exclude, list);
			return this;
		}

		/**
		 * Values to exclude. Can be regular expression strings or arrays of strings of
		 * exact terms.
		 * <p>
		 * API name: {@code exclude}
		 * <p>
		 * Adds one or more values to <code>exclude</code>.
		 */
		public final Builder exclude(String value, String... values) {
			this.exclude = _listAdd(this.exclude, value, values);
			return this;
		}

		/**
		 * Values to include. Can be regular expression strings or arrays of strings of
		 * exact terms.
		 * <p>
		 * API name: {@code include}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>include</code>.
		 */
		public final Builder include(List<String> list) {
			this.include = _listAddAll(this.include, list);
			return this;
		}

		/**
		 * Values to include. Can be regular expression strings or arrays of strings of
		 * exact terms.
		 * <p>
		 * API name: {@code include}
		 * <p>
		 * Adds one or more values to <code>include</code>.
		 */
		public final Builder include(String value, String... values) {
			this.include = _listAdd(this.include, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FrequentItemSetsField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FrequentItemSetsField build() {
			_checkSingleUse();

			return new FrequentItemSetsField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FrequentItemSetsField}
	 */
	public static final JsonpDeserializer<FrequentItemSetsField> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FrequentItemSetsField::setupFrequentItemSetsFieldDeserializer);

	protected static void setupFrequentItemSetsFieldDeserializer(ObjectDeserializer<FrequentItemSetsField.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::exclude, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"exclude");
		op.add(Builder::include, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"include");

	}

}
