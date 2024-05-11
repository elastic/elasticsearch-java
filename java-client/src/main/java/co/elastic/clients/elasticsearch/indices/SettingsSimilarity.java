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
public class SettingsSimilarity
		implements
			TaggedUnion<SettingsSimilarity.Kind, SettingsSimilarityVariant>,
			JsonpSerializable {

	/**
	 * {@link SettingsSimilarity} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarity">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Bm25("BM25"),

		Boolean("boolean"),

		Dfi("DFI"),

		Dfr("DFR"),

		Ib("IB"),

		LMDirichlet("LMDirichlet"),

		LMJelinekMercer("LMJelinekMercer"),

		Scripted("scripted"),

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
	private final SettingsSimilarityVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final SettingsSimilarityVariant _get() {
		return _value;
	}

	public SettingsSimilarity(SettingsSimilarityVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._settingsSimilarityKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private SettingsSimilarity(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SettingsSimilarity of(Function<Builder, ObjectBuilder<SettingsSimilarity>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code BM25}?
	 */
	public boolean isBm25() {
		return _kind == Kind.Bm25;
	}

	/**
	 * Get the {@code BM25} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code BM25} kind.
	 */
	public SettingsSimilarityBm25 bm25() {
		return TaggedUnionUtils.get(this, Kind.Bm25);
	}

	/**
	 * Is this variant instance of kind {@code boolean}?
	 */
	public boolean isBoolean() {
		return _kind == Kind.Boolean;
	}

	/**
	 * Get the {@code boolean} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code boolean} kind.
	 */
	public SettingsSimilarityBoolean boolean_() {
		return TaggedUnionUtils.get(this, Kind.Boolean);
	}

	/**
	 * Is this variant instance of kind {@code DFI}?
	 */
	public boolean isDfi() {
		return _kind == Kind.Dfi;
	}

	/**
	 * Get the {@code DFI} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code DFI} kind.
	 */
	public SettingsSimilarityDfi dfi() {
		return TaggedUnionUtils.get(this, Kind.Dfi);
	}

	/**
	 * Is this variant instance of kind {@code DFR}?
	 */
	public boolean isDfr() {
		return _kind == Kind.Dfr;
	}

	/**
	 * Get the {@code DFR} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code DFR} kind.
	 */
	public SettingsSimilarityDfr dfr() {
		return TaggedUnionUtils.get(this, Kind.Dfr);
	}

	/**
	 * Is this variant instance of kind {@code IB}?
	 */
	public boolean isIb() {
		return _kind == Kind.Ib;
	}

	/**
	 * Get the {@code IB} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code IB} kind.
	 */
	public SettingsSimilarityIb ib() {
		return TaggedUnionUtils.get(this, Kind.Ib);
	}

	/**
	 * Is this variant instance of kind {@code LMDirichlet}?
	 */
	public boolean isLMDirichlet() {
		return _kind == Kind.LMDirichlet;
	}

	/**
	 * Get the {@code LMDirichlet} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code LMDirichlet} kind.
	 */
	public SettingsSimilarityLmd lmdirichlet() {
		return TaggedUnionUtils.get(this, Kind.LMDirichlet);
	}

	/**
	 * Is this variant instance of kind {@code LMJelinekMercer}?
	 */
	public boolean isLMJelinekMercer() {
		return _kind == Kind.LMJelinekMercer;
	}

	/**
	 * Get the {@code LMJelinekMercer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code LMJelinekMercer}
	 *             kind.
	 */
	public SettingsSimilarityLmj lmjelinekmercer() {
		return TaggedUnionUtils.get(this, Kind.LMJelinekMercer);
	}

	/**
	 * Is this variant instance of kind {@code scripted}?
	 */
	public boolean isScripted() {
		return _kind == Kind.Scripted;
	}

	/**
	 * Get the {@code scripted} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code scripted} kind.
	 */
	public SettingsSimilarityScripted scripted() {
		return TaggedUnionUtils.get(this, Kind.Scripted);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarity> {
		private Kind _kind;
		private SettingsSimilarityVariant _value;

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

		public ObjectBuilder<SettingsSimilarity> boolean_(SettingsSimilarityBoolean v) {
			this._kind = Kind.Boolean;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> boolean_(
				Function<SettingsSimilarityBoolean.Builder, ObjectBuilder<SettingsSimilarityBoolean>> fn) {
			return this.boolean_(fn.apply(new SettingsSimilarityBoolean.Builder()).build());
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

		public ObjectBuilder<SettingsSimilarity> lmdirichlet(SettingsSimilarityLmd v) {
			this._kind = Kind.LMDirichlet;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> lmdirichlet(
				Function<SettingsSimilarityLmd.Builder, ObjectBuilder<SettingsSimilarityLmd>> fn) {
			return this.lmdirichlet(fn.apply(new SettingsSimilarityLmd.Builder()).build());
		}

		public ObjectBuilder<SettingsSimilarity> lmjelinekmercer(SettingsSimilarityLmj v) {
			this._kind = Kind.LMJelinekMercer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> lmjelinekmercer(
				Function<SettingsSimilarityLmj.Builder, ObjectBuilder<SettingsSimilarityLmj>> fn) {
			return this.lmjelinekmercer(fn.apply(new SettingsSimilarityLmj.Builder()).build());
		}

		public ObjectBuilder<SettingsSimilarity> scripted(SettingsSimilarityScripted v) {
			this._kind = Kind.Scripted;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SettingsSimilarity> scripted(
				Function<SettingsSimilarityScripted.Builder, ObjectBuilder<SettingsSimilarityScripted>> fn) {
			return this.scripted(fn.apply(new SettingsSimilarityScripted.Builder()).build());
		}

		public SettingsSimilarity build() {
			_checkSingleUse();
			return new SettingsSimilarity(this);
		}

	}

	protected static void setupSettingsSimilarityDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::bm25, SettingsSimilarityBm25._DESERIALIZER, "BM25");
		op.add(Builder::boolean_, SettingsSimilarityBoolean._DESERIALIZER, "boolean");
		op.add(Builder::dfi, SettingsSimilarityDfi._DESERIALIZER, "DFI");
		op.add(Builder::dfr, SettingsSimilarityDfr._DESERIALIZER, "DFR");
		op.add(Builder::ib, SettingsSimilarityIb._DESERIALIZER, "IB");
		op.add(Builder::lmdirichlet, SettingsSimilarityLmd._DESERIALIZER, "LMDirichlet");
		op.add(Builder::lmjelinekmercer, SettingsSimilarityLmj._DESERIALIZER, "LMJelinekMercer");
		op.add(Builder::scripted, SettingsSimilarityScripted._DESERIALIZER, "scripted");

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<SettingsSimilarity> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarity::setupSettingsSimilarityDeserializer, Builder::build);
}
