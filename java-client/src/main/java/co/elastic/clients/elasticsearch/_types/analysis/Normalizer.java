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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.Normalizer
@JsonpDeserializable
public class Normalizer implements TaggedUnion<NormalizerVariant>, JsonpSerializable {

	public static final String CUSTOM = "custom";
	public static final String LOWERCASE = "lowercase";

	// Tagged union implementation

	private final String _type;
	private final NormalizerVariant _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final NormalizerVariant _get() {
		return _value;
	}

	public Normalizer(NormalizerVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Normalizer(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Normalizer of(Function<Builder, ObjectBuilder<Normalizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code custom} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code custom} kind.
	 */
	public CustomNormalizer custom() {
		return TaggedUnionUtils.get(this, CUSTOM);
	}

	/**
	 * Get the {@code lowercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lowercase} kind.
	 */
	public LowercaseNormalizer lowercase() {
		return TaggedUnionUtils.get(this, LOWERCASE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Normalizer> {
		private String _type;
		private NormalizerVariant _value;

		public Builder custom(CustomNormalizer v) {
			this._type = CUSTOM;
			this._value = v;
			return this;
		}

		public Builder custom(Function<CustomNormalizer.Builder, ObjectBuilder<CustomNormalizer>> f) {
			return this.custom(f.apply(new CustomNormalizer.Builder()).build());
		}

		public Builder lowercase(LowercaseNormalizer v) {
			this._type = LOWERCASE;
			this._value = v;
			return this;
		}

		public Builder lowercase(Function<LowercaseNormalizer.Builder, ObjectBuilder<LowercaseNormalizer>> f) {
			return this.lowercase(f.apply(new LowercaseNormalizer.Builder()).build());
		}

		public Normalizer build() {
			_checkSingleUse();
			return new Normalizer(this);
		}

	}

	protected static void setupNormalizerDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::custom, CustomNormalizer._DESERIALIZER, "custom");
		op.add(Builder::lowercase, LowercaseNormalizer._DESERIALIZER, "lowercase");

		op.setTypeProperty("type");

	}

	public static final JsonpDeserializer<Normalizer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Normalizer::setupNormalizerDeserializer, Builder::build);
}
