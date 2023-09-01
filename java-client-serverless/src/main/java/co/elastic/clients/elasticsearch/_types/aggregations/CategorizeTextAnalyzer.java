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
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CategorizeTextAnalyzer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CategorizeTextAnalyzer">API
 *      specification</a>
 */
@JsonpDeserializable
public class CategorizeTextAnalyzer implements TaggedUnion<CategorizeTextAnalyzer.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Custom, Builtin

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

	private CategorizeTextAnalyzer(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private CategorizeTextAnalyzer(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static CategorizeTextAnalyzer of(Function<Builder, ObjectBuilder<CategorizeTextAnalyzer>> fn) {
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
	public CustomCategorizeTextAnalyzer custom() {
		return TaggedUnionUtils.get(this, Kind.Custom);
	}

	/**
	 * Is this variant instance of kind {@code builtin}?
	 */
	public boolean isBuiltin() {
		return _kind == Kind.Builtin;
	}

	/**
	 * Get the {@code builtin} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code builtin} kind.
	 */
	public String builtin() {
		return TaggedUnionUtils.get(this, Kind.Builtin);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Builtin :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CategorizeTextAnalyzer> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<CategorizeTextAnalyzer> custom(CustomCategorizeTextAnalyzer v) {
			this._kind = Kind.Custom;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CategorizeTextAnalyzer> custom(
				Function<CustomCategorizeTextAnalyzer.Builder, ObjectBuilder<CustomCategorizeTextAnalyzer>> fn) {
			return this.custom(fn.apply(new CustomCategorizeTextAnalyzer.Builder()).build());
		}

		public ObjectBuilder<CategorizeTextAnalyzer> builtin(String v) {
			this._kind = Kind.Builtin;
			this._value = v;
			return this;
		}

		public CategorizeTextAnalyzer build() {
			_checkSingleUse();
			return new CategorizeTextAnalyzer(this);
		}

	}

	private static JsonpDeserializer<CategorizeTextAnalyzer> buildCategorizeTextAnalyzerDeserializer() {
		return new UnionDeserializer.Builder<CategorizeTextAnalyzer, Kind, Object>(CategorizeTextAnalyzer::new, false)
				.addMember(Kind.Custom, CustomCategorizeTextAnalyzer._DESERIALIZER)
				.addMember(Kind.Builtin, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<CategorizeTextAnalyzer> _DESERIALIZER = JsonpDeserializer
			.lazy(CategorizeTextAnalyzer::buildCategorizeTextAnalyzerDeserializer);
}
