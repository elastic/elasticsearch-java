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
import java.lang.Boolean;
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

// typedef: _types.mapping.DocValues

/**
 * Defines whether doc values are enabled for a field. Can be a simple boolean,
 * or a configuration object for finer-grained control over sub-parameters such
 * as <code>multi_value</code>.
 * 
 * @see <a href="../../doc-files/api-spec.html#_types.mapping.DocValues">API
 *      specification</a>
 */
@JsonpDeserializable
public class DocValues implements TaggedUnion<DocValues.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Config, Enabled

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

	private DocValues(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private DocValues(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DocValues of(Function<Builder, ObjectBuilder<DocValues>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code config}?
	 */
	public boolean isConfig() {
		return _kind == Kind.Config;
	}

	/**
	 * Get the {@code config} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code config} kind.
	 */
	public DocValuesConfig config() {
		return TaggedUnionUtils.get(this, Kind.Config);
	}

	/**
	 * Is this variant instance of kind {@code enabled}?
	 */
	public boolean isEnabled() {
		return _kind == Kind.Enabled;
	}

	/**
	 * Get the {@code enabled} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code enabled} kind.
	 */
	public Boolean enabled() {
		return TaggedUnionUtils.get(this, Kind.Enabled);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Enabled :
					generator.write(((Boolean) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DocValues> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<DocValues> config(DocValuesConfig v) {
			this._kind = Kind.Config;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DocValues> config(Function<DocValuesConfig.Builder, ObjectBuilder<DocValuesConfig>> fn) {
			return this.config(fn.apply(new DocValuesConfig.Builder()).build());
		}

		public ObjectBuilder<DocValues> enabled(Boolean v) {
			this._kind = Kind.Enabled;
			this._value = v;
			return this;
		}

		public DocValues build() {
			_checkSingleUse();
			return new DocValues(this);
		}

	}

	private static JsonpDeserializer<DocValues> buildDocValuesDeserializer() {
		return new UnionDeserializer.Builder<DocValues, Kind, Object>(DocValues::new, false)
				.addMember(Kind.Config, DocValuesConfig._DESERIALIZER)
				.addMember(Kind.Enabled, JsonpDeserializer.booleanDeserializer()).build();
	}

	public static final JsonpDeserializer<DocValues> _DESERIALIZER = JsonpDeserializer
			.lazy(DocValues::buildDocValuesDeserializer);
}
