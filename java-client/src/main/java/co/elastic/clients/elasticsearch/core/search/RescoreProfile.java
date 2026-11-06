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

// typedef: _global.search._types.RescoreProfile

/**
 * Profile of a single rescorer.
 * <p>
 * The shape of <code>breakdown</code> depends on the type of rescorer:
 * <code>query</code> and <code>script</code> do not report any steps,
 * <code>learning_to_rank</code> does.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.RescoreProfile">API
 *      specification</a>
 */
@JsonpDeserializable
public class RescoreProfile implements OpenTaggedUnion<RescoreProfile.Kind, Object>, JsonpSerializable {

	/**
	 * {@link RescoreProfile} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_global.search._types.RescoreProfile">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		LearningToRank("learning_to_rank"),

		Query("query"),

		Script("script"),

		/** A custom {@code RescoreProfile} defined by a plugin */
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

	public RescoreProfile(RescoreProfileVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._rescoreProfileKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private RescoreProfile(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static RescoreProfile of(Function<Builder, ObjectBuilder<RescoreProfile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Build a custom plugin-defined {@code RescoreProfile}, given its kind and some
	 * JSON data
	 */
	public RescoreProfile(String kind, JsonData value) {
		this._kind = Kind._Custom;
		this._value = value;
		this._customKind = kind;
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
	public LearningToRankRescoreProfile learningToRank() {
		return TaggedUnionUtils.get(this, Kind.LearningToRank);
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
	public QueryRescoreProfile query() {
		return TaggedUnionUtils.get(this, Kind.Query);
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
	public ScriptRescoreProfile script() {
		return TaggedUnionUtils.get(this, Kind.Script);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code RescoreProfile} defined by a plugin?
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
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RescoreProfile> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<RescoreProfile> learningToRank(LearningToRankRescoreProfile v) {
			this._kind = Kind.LearningToRank;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RescoreProfile> learningToRank(
				Function<LearningToRankRescoreProfile.Builder, ObjectBuilder<LearningToRankRescoreProfile>> fn) {
			return this.learningToRank(fn.apply(new LearningToRankRescoreProfile.Builder()).build());
		}

		public ObjectBuilder<RescoreProfile> query(QueryRescoreProfile v) {
			this._kind = Kind.Query;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RescoreProfile> query(
				Function<QueryRescoreProfile.Builder, ObjectBuilder<QueryRescoreProfile>> fn) {
			return this.query(fn.apply(new QueryRescoreProfile.Builder()).build());
		}

		public ObjectBuilder<RescoreProfile> script(ScriptRescoreProfile v) {
			this._kind = Kind.Script;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RescoreProfile> script(
				Function<ScriptRescoreProfile.Builder, ObjectBuilder<ScriptRescoreProfile>> fn) {
			return this.script(fn.apply(new ScriptRescoreProfile.Builder()).build());
		}

		/**
		 * Define this {@code RescoreProfile} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code RescoreProfile}. It is converted
		 *            internally to {@link JsonData}.
		 */
		public ObjectBuilder<RescoreProfile> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
		}

		public RescoreProfile build() {
			_checkSingleUse();
			return new RescoreProfile(this);
		}

	}

	protected static void setupRescoreProfileDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::learningToRank, LearningToRankRescoreProfile._DESERIALIZER, "learning_to_rank");
		op.add(Builder::query, QueryRescoreProfile._DESERIALIZER, "query");
		op.add(Builder::script, ScriptRescoreProfile._DESERIALIZER, "script");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<RescoreProfile> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RescoreProfile::setupRescoreProfileDeserializer, Builder::build);
}
