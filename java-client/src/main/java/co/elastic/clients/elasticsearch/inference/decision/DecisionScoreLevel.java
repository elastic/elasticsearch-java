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

package co.elastic.clients.elasticsearch.inference.decision;

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

// typedef: inference.decision.DecisionScoreLevel

/**
 * A level of a <code>score</code> question: either a plain label, or an object
 * with a label and an optional description.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.decision.DecisionScoreLevel">API
 *      specification</a>
 */
@JsonpDeserializable
public class DecisionScoreLevel implements TaggedUnion<DecisionScoreLevel.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Object, Label

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

	private DecisionScoreLevel(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private DecisionScoreLevel(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DecisionScoreLevel of(Function<Builder, ObjectBuilder<DecisionScoreLevel>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code object}?
	 */
	public boolean isObject() {
		return _kind == Kind.Object;
	}

	/**
	 * Get the {@code object} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code object} kind.
	 */
	public DecisionScoreLevelObject object() {
		return TaggedUnionUtils.get(this, Kind.Object);
	}

	/**
	 * Is this variant instance of kind {@code label}?
	 */
	public boolean isLabel() {
		return _kind == Kind.Label;
	}

	/**
	 * Get the {@code label} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code label} kind.
	 */
	public String label() {
		return TaggedUnionUtils.get(this, Kind.Label);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Label :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DecisionScoreLevel> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<DecisionScoreLevel> object(DecisionScoreLevelObject v) {
			this._kind = Kind.Object;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DecisionScoreLevel> object(
				Function<DecisionScoreLevelObject.Builder, ObjectBuilder<DecisionScoreLevelObject>> fn) {
			return this.object(fn.apply(new DecisionScoreLevelObject.Builder()).build());
		}

		public ObjectBuilder<DecisionScoreLevel> label(String v) {
			this._kind = Kind.Label;
			this._value = v;
			return this;
		}

		public DecisionScoreLevel build() {
			_checkSingleUse();
			return new DecisionScoreLevel(this);
		}

	}

	private static JsonpDeserializer<DecisionScoreLevel> buildDecisionScoreLevelDeserializer() {
		return new UnionDeserializer.Builder<DecisionScoreLevel, Kind, Object>(DecisionScoreLevel::new, false)
				.addMember(Kind.Object, DecisionScoreLevelObject._DESERIALIZER)
				.addMember(Kind.Label, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<DecisionScoreLevel> _DESERIALIZER = JsonpDeserializer
			.lazy(DecisionScoreLevel::buildDecisionScoreLevelDeserializer);
}
