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

package co.elastic.clients.elasticsearch._types.analysis;

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

// typedef: _types.analysis.Normalizer

/**
 *
 * @see <a href=
 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/analysis-normalizers.html">Documentation
 *      on elastic.co</a>
 * @see <a href="../../doc-files/api-spec.html#_types.analysis.Normalizer">API
 *      specification</a>
 */
@JsonpDeserializable
public class Normalizer implements TaggedUnion<Normalizer.Kind, NormalizerVariant>, JsonpSerializable {

	/**
	 * {@link Normalizer} variant kinds.
	 * 
	 * @see <a href="../../doc-files/api-spec.html#_types.analysis.Normalizer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Custom("custom"),

		Lowercase("lowercase"),

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
	private final NormalizerVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final NormalizerVariant _get() {
		return _value;
	}

	public Normalizer(NormalizerVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._normalizerKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Normalizer(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Normalizer of(Function<Builder, ObjectBuilder<Normalizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code custom}?
	 */
	public boolean isCustom() {
		return _kind == Kind.Custom;
	}

	/**
	 * Get the {@code custom} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code custom} kind.
	 */
	public CustomNormalizer custom() {
		return TaggedUnionUtils.get(this, Kind.Custom);
	}

	/**
	 * Is this variant instance of kind {@code lowercase}?
	 */
	public boolean isLowercase() {
		return _kind == Kind.Lowercase;
	}

	/**
	 * Get the {@code lowercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lowercase} kind.
	 */
	public LowercaseNormalizer lowercase() {
		return TaggedUnionUtils.get(this, Kind.Lowercase);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Normalizer> {
		private Kind _kind;
		private NormalizerVariant _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Normalizer> custom(CustomNormalizer v) {
			this._kind = Kind.Custom;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Normalizer> custom(
				Function<CustomNormalizer.Builder, ObjectBuilder<CustomNormalizer>> fn) {
			return this.custom(fn.apply(new CustomNormalizer.Builder()).build());
		}

		public ObjectBuilder<Normalizer> lowercase(LowercaseNormalizer v) {
			this._kind = Kind.Lowercase;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Normalizer> lowercase(
				Function<LowercaseNormalizer.Builder, ObjectBuilder<LowercaseNormalizer>> fn) {
			return this.lowercase(fn.apply(new LowercaseNormalizer.Builder()).build());
		}

		public Normalizer build() {
			_checkSingleUse();
			return new Normalizer(this);
		}

	}

	protected static void setupNormalizerDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::custom, CustomNormalizer._DESERIALIZER, "custom");
		op.add(Builder::lowercase, LowercaseNormalizer._DESERIALIZER, "lowercase");

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<Normalizer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Normalizer::setupNormalizerDeserializer, Builder::build);
}
