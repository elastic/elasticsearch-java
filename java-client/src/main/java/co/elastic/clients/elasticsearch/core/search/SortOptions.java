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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.Object;
import java.util.EnumSet;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.SortOptions
// union type: Container[]
@JsonpDeserializable
public class SortOptions implements TaggedUnion<Object>, JsonpSerializable {

	public static final String SCORE = "_score";
	public static final String DOC = "_doc";
	public static final String GEO_DISTANCE = "_geo_distance";
	public static final String SCRIPT = "_script";
	public static final String FIELD = "field";

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public SortOptions(SortOptionsVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private SortOptions(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SortOptions of(Function<Builder, ObjectBuilder<SortOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code _score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code _score} kind.
	 */
	public ScoreSort score() {
		return TaggedUnionUtils.get(this, SCORE);
	}

	/**
	 * Get the {@code _doc} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code _doc} kind.
	 */
	public ScoreSort doc() {
		return TaggedUnionUtils.get(this, DOC);
	}

	/**
	 * Get the {@code _geo_distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code _geo_distance} kind.
	 */
	public GeoDistanceSort geoDistance() {
		return TaggedUnionUtils.get(this, GEO_DISTANCE);
	}

	/**
	 * Get the {@code _script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code _script} kind.
	 */
	public ScriptSort script() {
		return TaggedUnionUtils.get(this, SCRIPT);
	}

	/**
	 * Get the {@code field} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field} kind.
	 */
	public FieldSort field() {
		return TaggedUnionUtils.get(this, FIELD);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_is(FIELD)) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {

			generator.writeStartObject();

			generator.writeKey(_type);
			if (_value instanceof JsonpSerializable) {
				((JsonpSerializable) _value).serialize(generator, mapper);
			}

			generator.writeEnd();
		}
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SortOptions> {
		private String _type;
		private Object _value;

		public Builder score(ScoreSort v) {
			this._type = SCORE;
			this._value = v;
			return this;
		}

		public Builder score(Function<ScoreSort.Builder, ObjectBuilder<ScoreSort>> f) {
			return this.score(f.apply(new ScoreSort.Builder()).build());
		}

		public Builder doc(ScoreSort v) {
			this._type = DOC;
			this._value = v;
			return this;
		}

		public Builder doc(Function<ScoreSort.Builder, ObjectBuilder<ScoreSort>> f) {
			return this.doc(f.apply(new ScoreSort.Builder()).build());
		}

		public Builder geoDistance(GeoDistanceSort v) {
			this._type = GEO_DISTANCE;
			this._value = v;
			return this;
		}

		public Builder geoDistance(Function<GeoDistanceSort.Builder, ObjectBuilder<GeoDistanceSort>> f) {
			return this.geoDistance(f.apply(new GeoDistanceSort.Builder()).build());
		}

		public Builder script(ScriptSort v) {
			this._type = SCRIPT;
			this._value = v;
			return this;
		}

		public Builder script(Function<ScriptSort.Builder, ObjectBuilder<ScriptSort>> f) {
			return this.script(f.apply(new ScriptSort.Builder()).build());
		}

		public Builder field(FieldSort v) {
			this._type = FIELD;
			this._value = v;
			return this;
		}

		public Builder field(Function<FieldSort.Builder, ObjectBuilder<FieldSort>> f) {
			return this.field(f.apply(new FieldSort.Builder()).build());
		}

		public SortOptions build() {
			_checkSingleUse();
			return new SortOptions(this);
		}

	}

	public static final JsonpDeserializer<SortOptions> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT), (parser, mapper) -> {
				SortOptions.Builder b = new SortOptions.Builder();
				JsonpUtils.expectNextEvent(parser, JsonParser.Event.START_OBJECT);
				JsonpUtils.expectNextEvent(parser, JsonParser.Event.KEY_NAME);
				switch (parser.getString()) {
					case SCORE :
						b.score(ScoreSort._DESERIALIZER.deserialize(parser, mapper));
						break;
					case DOC :
						b.doc(ScoreSort._DESERIALIZER.deserialize(parser, mapper));
						break;
					case GEO_DISTANCE :
						b.geoDistance(GeoDistanceSort._DESERIALIZER.deserialize(parser, mapper));
						break;
					case SCRIPT :
						b.script(ScriptSort._DESERIALIZER.deserialize(parser, mapper));
						break;
					default :
						// Consumes END_OBJECT
						return b.field(FieldSort._DESERIALIZER.deserialize(parser, mapper, JsonParser.Event.KEY_NAME))
								.build();
				}

				JsonpUtils.expectNextEvent(parser, JsonParser.Event.END_OBJECT);
				return b.build();
			}));
}
