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

package co.elastic.clients.elasticsearch._types.mapping;

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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.MatchOnlyTextProperty

/**
 * A variant of text that trades scoring and efficiency of positional queries
 * for space efficiency. This field effectively stores data the same way as a
 * text field that only indexes documents (index_options: docs) and disables
 * norms (norms: false). Term queries perform as fast if not faster as on text
 * fields, however queries that need positions such as the match_phrase query
 * perform slower as they need to look at the _source document to verify whether
 * a phrase matches. All queries return constant scores that are equal to 1.0.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.MatchOnlyTextProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class MatchOnlyTextProperty implements PropertyVariant, JsonpSerializable {
	private final Map<String, Property> fields;

	private final Map<String, String> meta;

	private final List<String> copyTo;

	// ---------------------------------------------------------------------------------------------

	private MatchOnlyTextProperty(Builder builder) {

		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.copyTo = ApiTypeHelper.unmodifiable(builder.copyTo);

	}

	public static MatchOnlyTextProperty of(Function<Builder, ObjectBuilder<MatchOnlyTextProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.MatchOnlyText;
	}

	/**
	 * Multi-fields allow the same string value to be indexed in multiple ways for
	 * different purposes, such as one field for search and a multi-field for
	 * sorting and aggregations, or the same string value analyzed by different
	 * analyzers.
	 * <p>
	 * API name: {@code fields}
	 */
	public final Map<String, Property> fields() {
		return this.fields;
	}

	/**
	 * Metadata about the field.
	 * <p>
	 * API name: {@code meta}
	 */
	public final Map<String, String> meta() {
		return this.meta;
	}

	/**
	 * Allows you to copy the values of multiple fields into a group field, which
	 * can then be queried as a single field.
	 * <p>
	 * API name: {@code copy_to}
	 */
	public final List<String> copyTo() {
		return this.copyTo;
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

		generator.write("type", "match_only_text");

		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, Property> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.copyTo)) {
			generator.writeKey("copy_to");
			generator.writeStartArray();
			for (String item0 : this.copyTo) {
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
	 * Builder for {@link MatchOnlyTextProperty}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MatchOnlyTextProperty> {
		@Nullable
		private Map<String, Property> fields;

		@Nullable
		private Map<String, String> meta;

		@Nullable
		private List<String> copyTo;

		/**
		 * Multi-fields allow the same string value to be indexed in multiple ways for
		 * different purposes, such as one field for search and a multi-field for
		 * sorting and aggregations, or the same string value analyzed by different
		 * analyzers.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder fields(Map<String, Property> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * Multi-fields allow the same string value to be indexed in multiple ways for
		 * different purposes, such as one field for search and a multi-field for
		 * sorting and aggregations, or the same string value analyzed by different
		 * analyzers.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder fields(String key, Property value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		/**
		 * Multi-fields allow the same string value to be indexed in multiple ways for
		 * different purposes, such as one field for search and a multi-field for
		 * sorting and aggregations, or the same string value analyzed by different
		 * analyzers.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(String key, Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return fields(key, fn.apply(new Property.Builder()).build());
		}

		/**
		 * Metadata about the field.
		 * <p>
		 * API name: {@code meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, String> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * Metadata about the field.
		 * <p>
		 * API name: {@code meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, String value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * Allows you to copy the values of multiple fields into a group field, which
		 * can then be queried as a single field.
		 * <p>
		 * API name: {@code copy_to}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>copyTo</code>.
		 */
		public final Builder copyTo(List<String> list) {
			this.copyTo = _listAddAll(this.copyTo, list);
			return this;
		}

		/**
		 * Allows you to copy the values of multiple fields into a group field, which
		 * can then be queried as a single field.
		 * <p>
		 * API name: {@code copy_to}
		 * <p>
		 * Adds one or more values to <code>copyTo</code>.
		 */
		public final Builder copyTo(String value, String... values) {
			this.copyTo = _listAdd(this.copyTo, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatchOnlyTextProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchOnlyTextProperty build() {
			_checkSingleUse();

			return new MatchOnlyTextProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatchOnlyTextProperty}
	 */
	public static final JsonpDeserializer<MatchOnlyTextProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MatchOnlyTextProperty::setupMatchOnlyTextPropertyDeserializer);

	protected static void setupMatchOnlyTextPropertyDeserializer(ObjectDeserializer<MatchOnlyTextProperty.Builder> op) {

		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(Property._DESERIALIZER), "fields");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "meta");
		op.add(Builder::copyTo, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "copy_to");

		op.ignore("type");
	}

}
