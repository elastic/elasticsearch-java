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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices._types.SettingsSimilarity

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarity">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarity implements OpenTaggedUnion<SettingsSimilarity.Kind, Object>, JsonpSerializable {

	/**
	 * {@link SettingsSimilarity} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarity">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Bm25("bm25"),

		Dfi("dfi"),

		Dfr("dfr"),

		Ib("ib"),

		Lmd("lmd"),

		Lmj("lmj"),

		ScriptedTfidf("scripted_tfidf"),

		/** A custom {@code SettingsSimilarity} defined by a plugin */
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

	public SettingsSimilarity(SettingsSimilarityVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._settingsSimilarityKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private SettingsSimilarity(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static SettingsSimilarity of(Function<Builder, ObjectBuilder<SettingsSimilarity>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code bm25}?
	 */
	public boolean isBm25() {
		return _kind == Kind.Bm25;
	}

	/**
	 * Get the {@code bm25} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bm25} kind.
	 */
	public SettingsSimilarityBm25 bm25() {
		return TaggedUnionUtils.get(this, Kind.Bm25);
	}

	/**
	 * Is this variant instance of kind {@code dfi}?
	 */
	public boolean isDfi() {
		return _kind == Kind.Dfi;
	}

	/**
	 * Get the {@code dfi} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dfi} kind.
	 */
	public SettingsSimilarityDfi dfi() {
		return TaggedUnionUtils.get(this, Kind.Dfi);
	}

	/**
	 * Is this variant instance of kind {@code dfr}?
	 */
	public boolean isDfr() {
		return _kind == Kind.Dfr;
	}

	/**
	 * Get the {@code dfr} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dfr} kind.
	 */
	public SettingsSimilarityDfr dfr() {
		return TaggedUnionUtils.get(this, Kind.Dfr);
	}

	/**
	 * Is this variant instance of kind {@code ib}?
	 */
	public boolean isIb() {
		return _kind == Kind.Ib;
	}

	/**
	 * Get the {@code ib} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ib} kind.
	 */
	public SettingsSimilarityIb ib() {
		return TaggedUnionUtils.get(this, Kind.Ib);
	}

	/**
	 * Is this variant instance of kind {@code lmd}?
	 */
	public boolean isLmd() {
		return _kind == Kind.Lmd;
	}

	/**
	 * Get the {@code lmd} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lmd} kind.
	 */
	public SettingsSimilarityLmd lmd() {
		return TaggedUnionUtils.get(this, Kind.Lmd);
	}

	/**
	 * Is this variant instance of kind {@code lmj}?
	 */
	public boolean isLmj() {
		return _kind == Kind.Lmj;
	}

	/**
	 * Get the {@code lmj} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lmj} kind.
	 */
	public SettingsSimilarityLmj lmj() {
		return TaggedUnionUtils.get(this, Kind.Lmj);
	}

	/**
	 * Is this variant instance of kind {@code scripted_tfidf}?
	 */
	public boolean isScriptedTfidf() {
		return _kind == Kind.ScriptedTfidf;
	}

	/**
	 * Get the {@code scripted_tfidf} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code scripted_tfidf} kind.
	 */
	public SettingsSimilarityScriptedTfidf scriptedTfidf() {
		return TaggedUnionUtils.get(this, Kind.ScriptedTfidf);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code SettingsSimilarity} defined by a plugin?
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarity> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<SettingsSimilarity> bm25(SettingsSimilarityBm25 v) {
			this._kind = Kind.Bm25;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> bm25(
				Function<SettingsSimilarityBm25.Builder, ObjectBuilder<SettingsSimilarityBm25>> fn) {
			return this.bm25(fn.apply(new SettingsSimilarityBm25.Builder()).build());
		}

		public ObjectBuilder<SettingsSimilarity> dfi(SettingsSimilarityDfi v) {
			this._kind = Kind.Dfi;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> dfi(
				Function<SettingsSimilarityDfi.Builder, ObjectBuilder<SettingsSimilarityDfi>> fn) {
			return this.dfi(fn.apply(new SettingsSimilarityDfi.Builder()).build());
		}

		public ObjectBuilder<SettingsSimilarity> dfr(SettingsSimilarityDfr v) {
			this._kind = Kind.Dfr;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> dfr(
				Function<SettingsSimilarityDfr.Builder, ObjectBuilder<SettingsSimilarityDfr>> fn) {
			return this.dfr(fn.apply(new SettingsSimilarityDfr.Builder()).build());
		}

		public ObjectBuilder<SettingsSimilarity> ib(SettingsSimilarityIb v) {
			this._kind = Kind.Ib;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> ib(
				Function<SettingsSimilarityIb.Builder, ObjectBuilder<SettingsSimilarityIb>> fn) {
			return this.ib(fn.apply(new SettingsSimilarityIb.Builder()).build());
		}

		public ObjectBuilder<SettingsSimilarity> lmd(SettingsSimilarityLmd v) {
			this._kind = Kind.Lmd;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> lmd(
				Function<SettingsSimilarityLmd.Builder, ObjectBuilder<SettingsSimilarityLmd>> fn) {
			return this.lmd(fn.apply(new SettingsSimilarityLmd.Builder()).build());
		}

		public ObjectBuilder<SettingsSimilarity> lmj(SettingsSimilarityLmj v) {
			this._kind = Kind.Lmj;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> lmj(
				Function<SettingsSimilarityLmj.Builder, ObjectBuilder<SettingsSimilarityLmj>> fn) {
			return this.lmj(fn.apply(new SettingsSimilarityLmj.Builder()).build());
		}

		public ObjectBuilder<SettingsSimilarity> scriptedTfidf(SettingsSimilarityScriptedTfidf v) {
			this._kind = Kind.ScriptedTfidf;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> scriptedTfidf(
				Function<SettingsSimilarityScriptedTfidf.Builder, ObjectBuilder<SettingsSimilarityScriptedTfidf>> fn) {
			return this.scriptedTfidf(fn.apply(new SettingsSimilarityScriptedTfidf.Builder()).build());
		}

		/**
		 * Define this {@code SettingsSimilarity} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code SettingsSimilarity}. It is
		 *            converted internally to {@link JsonData}.
		 */
		public ObjectBuilder<SettingsSimilarity> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
		}

		public SettingsSimilarity build() {
			_checkSingleUse();
			return new SettingsSimilarity(this);
		}

	}

	protected static void setupSettingsSimilarityDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::bm25, SettingsSimilarityBm25._DESERIALIZER, "bm25");
		op.add(Builder::dfi, SettingsSimilarityDfi._DESERIALIZER, "dfi");
		op.add(Builder::dfr, SettingsSimilarityDfr._DESERIALIZER, "dfr");
		op.add(Builder::ib, SettingsSimilarityIb._DESERIALIZER, "ib");
		op.add(Builder::lmd, SettingsSimilarityLmd._DESERIALIZER, "lmd");
		op.add(Builder::lmj, SettingsSimilarityLmj._DESERIALIZER, "lmj");
		op.add(Builder::scriptedTfidf, SettingsSimilarityScriptedTfidf._DESERIALIZER, "scripted_tfidf");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

	public static final JsonpDeserializer<SettingsSimilarity> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarity::setupSettingsSimilarityDeserializer, Builder::build);
}
