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

package co.elastic.clients.elasticsearch._types.mapping;

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

// typedef: _types.mapping.DynamicTemplate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DynamicTemplate">API
 *      specification</a>
 */
@JsonpDeserializable
public class DynamicTemplate implements TaggedUnion<DynamicTemplate.Kind, Object>, JsonpSerializable {

	/**
	 * {@link DynamicTemplate} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.mapping.DynamicTemplate">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Mapping("mapping"),

		Runtime("runtime"),

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

	private final List<String> match;

	private final List<String> pathMatch;

	private final List<String> unmatch;

	private final List<String> pathUnmatch;

	private final List<String> matchMappingType;

	private final List<String> unmatchMappingType;

	@Nullable
	private final MatchType matchPattern;

	public DynamicTemplate(DynamicTemplateVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._dynamicTemplateKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

		this.match = null;
		this.pathMatch = null;
		this.unmatch = null;
		this.pathUnmatch = null;
		this.matchMappingType = null;
		this.unmatchMappingType = null;
		this.matchPattern = null;

	}

	private DynamicTemplate(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

		this.match = ApiTypeHelper.unmodifiable(builder.match);
		this.pathMatch = ApiTypeHelper.unmodifiable(builder.pathMatch);
		this.unmatch = ApiTypeHelper.unmodifiable(builder.unmatch);
		this.pathUnmatch = ApiTypeHelper.unmodifiable(builder.pathUnmatch);
		this.matchMappingType = ApiTypeHelper.unmodifiable(builder.matchMappingType);
		this.unmatchMappingType = ApiTypeHelper.unmodifiable(builder.unmatchMappingType);
		this.matchPattern = builder.matchPattern;

	}

	public static DynamicTemplate of(Function<Builder, ObjectBuilder<DynamicTemplate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code match}
	 */
	public final List<String> match() {
		return this.match;
	}

	/**
	 * API name: {@code path_match}
	 */
	public final List<String> pathMatch() {
		return this.pathMatch;
	}

	/**
	 * API name: {@code unmatch}
	 */
	public final List<String> unmatch() {
		return this.unmatch;
	}

	/**
	 * API name: {@code path_unmatch}
	 */
	public final List<String> pathUnmatch() {
		return this.pathUnmatch;
	}

	/**
	 * API name: {@code match_mapping_type}
	 */
	public final List<String> matchMappingType() {
		return this.matchMappingType;
	}

	/**
	 * API name: {@code unmatch_mapping_type}
	 */
	public final List<String> unmatchMappingType() {
		return this.unmatchMappingType;
	}

	/**
	 * API name: {@code match_pattern}
	 */
	@Nullable
	public final MatchType matchPattern() {
		return this.matchPattern;
	}

	/**
	 * Is this variant instance of kind {@code mapping}?
	 */
	public boolean isMapping() {
		return _kind == Kind.Mapping;
	}

	/**
	 * Get the {@code mapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code mapping} kind.
	 */
	public Property mapping() {
		return TaggedUnionUtils.get(this, Kind.Mapping);
	}

	/**
	 * Is this variant instance of kind {@code runtime}?
	 */
	public boolean isRuntime() {
		return _kind == Kind.Runtime;
	}

	/**
	 * Get the {@code runtime} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code runtime} kind.
	 */
	public Property runtime() {
		return TaggedUnionUtils.get(this, Kind.Runtime);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		if (ApiTypeHelper.isDefined(this.match)) {
			generator.writeKey("match");
			generator.writeStartArray();
			for (String item0 : this.match) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.pathMatch)) {
			generator.writeKey("path_match");
			generator.writeStartArray();
			for (String item0 : this.pathMatch) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.unmatch)) {
			generator.writeKey("unmatch");
			generator.writeStartArray();
			for (String item0 : this.unmatch) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.pathUnmatch)) {
			generator.writeKey("path_unmatch");
			generator.writeStartArray();
			for (String item0 : this.pathUnmatch) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.matchMappingType)) {
			generator.writeKey("match_mapping_type");
			generator.writeStartArray();
			for (String item0 : this.matchMappingType) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.unmatchMappingType)) {
			generator.writeKey("unmatch_mapping_type");
			generator.writeStartArray();
			for (String item0 : this.unmatchMappingType) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.matchPattern != null) {
			generator.writeKey("match_pattern");
			this.matchPattern.serialize(generator, mapper);
		}

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DynamicTemplate> {
		private Kind _kind;
		private Object _value;

		@Nullable
		private List<String> match;

		@Nullable
		private List<String> pathMatch;

		@Nullable
		private List<String> unmatch;

		@Nullable
		private List<String> pathUnmatch;

		@Nullable
		private List<String> matchMappingType;

		@Nullable
		private List<String> unmatchMappingType;

		@Nullable
		private MatchType matchPattern;

		/**
		 * API name: {@code match}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>match</code>.
		 */
		public final Builder match(List<String> list) {
			this.match = _listAddAll(this.match, list);
			return this;
		}

		/**
		 * API name: {@code match}
		 * <p>
		 * Adds one or more values to <code>match</code>.
		 */
		public final Builder match(String value, String... values) {
			this.match = _listAdd(this.match, value, values);
			return this;
		}

		/**
		 * API name: {@code path_match}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>pathMatch</code>.
		 */
		public final Builder pathMatch(List<String> list) {
			this.pathMatch = _listAddAll(this.pathMatch, list);
			return this;
		}

		/**
		 * API name: {@code path_match}
		 * <p>
		 * Adds one or more values to <code>pathMatch</code>.
		 */
		public final Builder pathMatch(String value, String... values) {
			this.pathMatch = _listAdd(this.pathMatch, value, values);
			return this;
		}

		/**
		 * API name: {@code unmatch}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>unmatch</code>.
		 */
		public final Builder unmatch(List<String> list) {
			this.unmatch = _listAddAll(this.unmatch, list);
			return this;
		}

		/**
		 * API name: {@code unmatch}
		 * <p>
		 * Adds one or more values to <code>unmatch</code>.
		 */
		public final Builder unmatch(String value, String... values) {
			this.unmatch = _listAdd(this.unmatch, value, values);
			return this;
		}

		/**
		 * API name: {@code path_unmatch}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>pathUnmatch</code>.
		 */
		public final Builder pathUnmatch(List<String> list) {
			this.pathUnmatch = _listAddAll(this.pathUnmatch, list);
			return this;
		}

		/**
		 * API name: {@code path_unmatch}
		 * <p>
		 * Adds one or more values to <code>pathUnmatch</code>.
		 */
		public final Builder pathUnmatch(String value, String... values) {
			this.pathUnmatch = _listAdd(this.pathUnmatch, value, values);
			return this;
		}

		/**
		 * API name: {@code match_mapping_type}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>matchMappingType</code>.
		 */
		public final Builder matchMappingType(List<String> list) {
			this.matchMappingType = _listAddAll(this.matchMappingType, list);
			return this;
		}

		/**
		 * API name: {@code match_mapping_type}
		 * <p>
		 * Adds one or more values to <code>matchMappingType</code>.
		 */
		public final Builder matchMappingType(String value, String... values) {
			this.matchMappingType = _listAdd(this.matchMappingType, value, values);
			return this;
		}

		/**
		 * API name: {@code unmatch_mapping_type}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>unmatchMappingType</code>.
		 */
		public final Builder unmatchMappingType(List<String> list) {
			this.unmatchMappingType = _listAddAll(this.unmatchMappingType, list);
			return this;
		}

		/**
		 * API name: {@code unmatch_mapping_type}
		 * <p>
		 * Adds one or more values to <code>unmatchMappingType</code>.
		 */
		public final Builder unmatchMappingType(String value, String... values) {
			this.unmatchMappingType = _listAdd(this.unmatchMappingType, value, values);
			return this;
		}

		/**
		 * API name: {@code match_pattern}
		 */
		public final Builder matchPattern(@Nullable MatchType value) {
			this.matchPattern = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}
		public ContainerBuilder mapping(Property v) {
			this._kind = Kind.Mapping;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder mapping(Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return this.mapping(fn.apply(new Property.Builder()).build());
		}

		public ContainerBuilder runtime(Property v) {
			this._kind = Kind.Runtime;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder runtime(Function<Property.Builder, ObjectBuilder<Property>> fn) {
			return this.runtime(fn.apply(new Property.Builder()).build());
		}

		public DynamicTemplate build() {
			_checkSingleUse();
			return new DynamicTemplate(this);
		}

		public class ContainerBuilder implements ObjectBuilder<DynamicTemplate> {

			/**
			 * API name: {@code match}
			 * <p>
			 * Adds all elements of <code>list</code> to <code>match</code>.
			 */
			public final ContainerBuilder match(List<String> list) {
				Builder.this.match = _listAddAll(Builder.this.match, list);
				return this;
			}

			/**
			 * API name: {@code match}
			 * <p>
			 * Adds one or more values to <code>match</code>.
			 */
			public final ContainerBuilder match(String value, String... values) {
				Builder.this.match = _listAdd(Builder.this.match, value, values);
				return this;
			}

			/**
			 * API name: {@code path_match}
			 * <p>
			 * Adds all elements of <code>list</code> to <code>pathMatch</code>.
			 */
			public final ContainerBuilder pathMatch(List<String> list) {
				Builder.this.pathMatch = _listAddAll(Builder.this.pathMatch, list);
				return this;
			}

			/**
			 * API name: {@code path_match}
			 * <p>
			 * Adds one or more values to <code>pathMatch</code>.
			 */
			public final ContainerBuilder pathMatch(String value, String... values) {
				Builder.this.pathMatch = _listAdd(Builder.this.pathMatch, value, values);
				return this;
			}

			/**
			 * API name: {@code unmatch}
			 * <p>
			 * Adds all elements of <code>list</code> to <code>unmatch</code>.
			 */
			public final ContainerBuilder unmatch(List<String> list) {
				Builder.this.unmatch = _listAddAll(Builder.this.unmatch, list);
				return this;
			}

			/**
			 * API name: {@code unmatch}
			 * <p>
			 * Adds one or more values to <code>unmatch</code>.
			 */
			public final ContainerBuilder unmatch(String value, String... values) {
				Builder.this.unmatch = _listAdd(Builder.this.unmatch, value, values);
				return this;
			}

			/**
			 * API name: {@code path_unmatch}
			 * <p>
			 * Adds all elements of <code>list</code> to <code>pathUnmatch</code>.
			 */
			public final ContainerBuilder pathUnmatch(List<String> list) {
				Builder.this.pathUnmatch = _listAddAll(Builder.this.pathUnmatch, list);
				return this;
			}

			/**
			 * API name: {@code path_unmatch}
			 * <p>
			 * Adds one or more values to <code>pathUnmatch</code>.
			 */
			public final ContainerBuilder pathUnmatch(String value, String... values) {
				Builder.this.pathUnmatch = _listAdd(Builder.this.pathUnmatch, value, values);
				return this;
			}

			/**
			 * API name: {@code match_mapping_type}
			 * <p>
			 * Adds all elements of <code>list</code> to <code>matchMappingType</code>.
			 */
			public final ContainerBuilder matchMappingType(List<String> list) {
				Builder.this.matchMappingType = _listAddAll(Builder.this.matchMappingType, list);
				return this;
			}

			/**
			 * API name: {@code match_mapping_type}
			 * <p>
			 * Adds one or more values to <code>matchMappingType</code>.
			 */
			public final ContainerBuilder matchMappingType(String value, String... values) {
				Builder.this.matchMappingType = _listAdd(Builder.this.matchMappingType, value, values);
				return this;
			}

			/**
			 * API name: {@code unmatch_mapping_type}
			 * <p>
			 * Adds all elements of <code>list</code> to <code>unmatchMappingType</code>.
			 */
			public final ContainerBuilder unmatchMappingType(List<String> list) {
				Builder.this.unmatchMappingType = _listAddAll(Builder.this.unmatchMappingType, list);
				return this;
			}

			/**
			 * API name: {@code unmatch_mapping_type}
			 * <p>
			 * Adds one or more values to <code>unmatchMappingType</code>.
			 */
			public final ContainerBuilder unmatchMappingType(String value, String... values) {
				Builder.this.unmatchMappingType = _listAdd(Builder.this.unmatchMappingType, value, values);
				return this;
			}

			/**
			 * API name: {@code match_pattern}
			 */
			public final ContainerBuilder matchPattern(@Nullable MatchType value) {
				Builder.this.matchPattern = value;
				return this;
			}

			public DynamicTemplate build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupDynamicTemplateDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::mapping, Property._DESERIALIZER, "mapping");
		op.add(Builder::runtime, Property._DESERIALIZER, "runtime");
		op.add(Builder::match, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "match");
		op.add(Builder::pathMatch, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"path_match");
		op.add(Builder::unmatch, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"unmatch");
		op.add(Builder::pathUnmatch, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"path_unmatch");
		op.add(Builder::matchMappingType, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"match_mapping_type");
		op.add(Builder::unmatchMappingType, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"unmatch_mapping_type");
		op.add(Builder::matchPattern, MatchType._DESERIALIZER, "match_pattern");

	}

	public static final JsonpDeserializer<DynamicTemplate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DynamicTemplate::setupDynamicTemplateDeserializer, Builder::build);
}
