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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonData;
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
import co.elastic.clients.util.OpenTaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Object;
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

// typedef: _global.search._types.Rescore

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.Rescore">API
 *      specification</a>
 */
@JsonpDeserializable
public class Rescore implements OpenTaggedUnion<Rescore.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Rescore} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_global.search._types.Rescore">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Query("query"),

		LearningToRank("learning_to_rank"),

		/** A custom {@code Rescore} defined by a plugin */
		_Custom(null)

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
	private final Integer windowSize;

	public Rescore(RescoreVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._rescoreKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

		this.windowSize = null;

	}

	private Rescore(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

		this.windowSize = builder.windowSize;

	}

	public static Rescore of(Function<Builder, ObjectBuilder<Rescore>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code window_size}
	 */
	@Nullable
	public final Integer windowSize() {
		return this.windowSize;
	}

	/**
	 * Is this variant instance of kind {@code query}?
	 */
	public boolean isQuery() {
		return _kind == Kind.Query;
	}

	/**
	 * Get the {@code query} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code query} kind.
	 */
	public RescoreQuery query() {
		return TaggedUnionUtils.get(this, Kind.Query);
	}

	/**
	 * Is this variant instance of kind {@code learning_to_rank}?
	 */
	public boolean isLearningToRank() {
		return _kind == Kind.LearningToRank;
	}

	/**
	 * Get the {@code learning_to_rank} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code learning_to_rank}
	 *             kind.
	 */
	public LearningToRank learningToRank() {
		return TaggedUnionUtils.get(this, Kind.LearningToRank);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code Rescore} defined by a plugin?
	 */
	public boolean _isCustom() {
		return _kind == Kind._Custom;
	}

	/**
	 * Get the actual kind when {@code _kind()} equals {@link Kind#_Custom}
	 * (plugin-defined variant).
	 */
	@Nullable
	public final String _customKind() {
		return _customKind;
	}

	/**
	 * Get the custom plugin-defined variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not {@link Kind#_Custom}.
	 */
	public JsonData _custom() {
		return TaggedUnionUtils.get(this, Kind._Custom);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		if (this.windowSize != null) {
			generator.writeKey("window_size");
			generator.write(this.windowSize);

		}

		generator.writeKey(_kind == Kind._Custom ? _customKind : _kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Rescore> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Nullable
		private Integer windowSize;

		/**
		 * API name: {@code window_size}
		 */
		public final Builder windowSize(@Nullable Integer value) {
			this.windowSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}
		public ContainerBuilder query(RescoreQuery v) {
			this._kind = Kind.Query;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder query(Function<RescoreQuery.Builder, ObjectBuilder<RescoreQuery>> fn) {
			return this.query(fn.apply(new RescoreQuery.Builder()).build());
		}

		public ContainerBuilder learningToRank(LearningToRank v) {
			this._kind = Kind.LearningToRank;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder learningToRank(Function<LearningToRank.Builder, ObjectBuilder<LearningToRank>> fn) {
			return this.learningToRank(fn.apply(new LearningToRank.Builder()).build());
		}

		/**
		 * Define this {@code Rescore} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code Rescore}. It is converted
		 *            internally to {@link JsonData}.
		 */
		public ContainerBuilder _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return new ContainerBuilder();
		}

		public Rescore build() {
			_checkSingleUse();
			return new Rescore(this);
		}

		public class ContainerBuilder implements ObjectBuilder<Rescore> {

			/**
			 * API name: {@code window_size}
			 */
			public final ContainerBuilder windowSize(@Nullable Integer value) {
				Builder.this.windowSize = value;
				return this;
			}

			public Rescore build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupRescoreDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::windowSize, JsonpDeserializer.integerDeserializer(), "window_size");
		op.add(Builder::query, RescoreQuery._DESERIALIZER, "query");
		op.add(Builder::learningToRank, LearningToRank._DESERIALIZER, "learning_to_rank");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

	public static final JsonpDeserializer<Rescore> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Rescore::setupRescoreDeserializer, Builder::build);
}
