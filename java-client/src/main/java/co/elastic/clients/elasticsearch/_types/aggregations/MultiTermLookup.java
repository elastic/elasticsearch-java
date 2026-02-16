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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
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

// typedef: _types.aggregations.MultiTermLookup

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MultiTermLookup">API
 *      specification</a>
 */
@JsonpDeserializable
public class MultiTermLookup implements TaggedUnion<MultiTermLookup.Kind, Object>, JsonpSerializable {

	/**
	 * {@link MultiTermLookup} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.aggregations.MultiTermLookup">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Field("field"),

		Script("script"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	@Nullable
	private final FieldValue missing;

	public MultiTermLookup(MultiTermLookupVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._multiTermLookupKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

		this.missing = null;

	}

	private MultiTermLookup(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

		this.missing = builder.missing;

	}

	public static MultiTermLookup of(Function<Builder, ObjectBuilder<MultiTermLookup>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The value to apply to documents that do not have a value. By default,
	 * documents without a value are ignored.
	 * <p>
	 * API name: {@code missing}
	 */
	@Nullable
	public final FieldValue missing() {
		return this.missing;
	}

	/**
	 * Is this variant instance of kind {@code field}?
	 */
	public boolean isField() {
		return _kind == Kind.Field;
	}

	/**
	 * Get the {@code field} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field} kind.
	 */
	public String field() {
		return TaggedUnionUtils.get(this, Kind.Field);
	}

	/**
	 * Is this variant instance of kind {@code script}?
	 */
	public boolean isScript() {
		return _kind == Kind.Script;
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public Script script() {
		return TaggedUnionUtils.get(this, Kind.Script);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		if (this.missing != null) {
			generator.writeKey("missing");
			this.missing.serialize(generator, mapper);

		}

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Field :
					generator.write(((String) this._value));

					break;
			}
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MultiTermLookup> {
		private Kind _kind;
		private Object _value;

		@Nullable
		private FieldValue missing;

		/**
		 * The value to apply to documents that do not have a value. By default,
		 * documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable FieldValue value) {
			this.missing = value;
			return this;
		}

		/**
		 * The value to apply to documents that do not have a value. By default,
		 * documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder missing(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return this.missing(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * The value to apply to documents that do not have a value. By default,
		 * documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder missing(String value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * The value to apply to documents that do not have a value. By default,
		 * documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder missing(long value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * The value to apply to documents that do not have a value. By default,
		 * documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder missing(double value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * The value to apply to documents that do not have a value. By default,
		 * documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder missing(boolean value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}
		public ContainerBuilder field(String v) {
			this._kind = Kind.Field;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder script(Script v) {
			this._kind = Kind.Script;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		public MultiTermLookup build() {
			_checkSingleUse();
			return new MultiTermLookup(this);
		}

		public class ContainerBuilder implements ObjectBuilder<MultiTermLookup> {

			/**
			 * The value to apply to documents that do not have a value. By default,
			 * documents without a value are ignored.
			 * <p>
			 * API name: {@code missing}
			 */
			public final ContainerBuilder missing(@Nullable FieldValue value) {
				Builder.this.missing = value;
				return this;
			}

			/**
			 * The value to apply to documents that do not have a value. By default,
			 * documents without a value are ignored.
			 * <p>
			 * API name: {@code missing}
			 */
			public final ContainerBuilder missing(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
				return this.missing(fn.apply(new FieldValue.Builder()).build());
			}

			/**
			 * The value to apply to documents that do not have a value. By default,
			 * documents without a value are ignored.
			 * <p>
			 * API name: {@code missing}
			 */
			public final ContainerBuilder missing(String value) {
				Builder.this.missing = FieldValue.of(value);
				return this;
			}

			/**
			 * The value to apply to documents that do not have a value. By default,
			 * documents without a value are ignored.
			 * <p>
			 * API name: {@code missing}
			 */
			public final ContainerBuilder missing(long value) {
				Builder.this.missing = FieldValue.of(value);
				return this;
			}

			/**
			 * The value to apply to documents that do not have a value. By default,
			 * documents without a value are ignored.
			 * <p>
			 * API name: {@code missing}
			 */
			public final ContainerBuilder missing(double value) {
				Builder.this.missing = FieldValue.of(value);
				return this;
			}

			/**
			 * The value to apply to documents that do not have a value. By default,
			 * documents without a value are ignored.
			 * <p>
			 * API name: {@code missing}
			 */
			public final ContainerBuilder missing(boolean value) {
				Builder.this.missing = FieldValue.of(value);
				return this;
			}

			public MultiTermLookup build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupMultiTermLookupDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::missing, FieldValue._DESERIALIZER, "missing");

	}

	public static final JsonpDeserializer<MultiTermLookup> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MultiTermLookup::setupMultiTermLookupDeserializer, Builder::build);
}
