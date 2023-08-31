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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.Object;
import java.util.EnumSet;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.SortOptions

/**
 *
 * @see <a href=
 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/sort-search-results.html">Documentation
 *      on elastic.co</a>
 * @see <a href="../doc-files/api-spec.html#_types.SortOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class SortOptions implements TaggedUnion<SortOptions.Kind, Object>, JsonpSerializable {

	/**
	 * {@link SortOptions} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#_types.SortOptions">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Score("_score"),

		Doc("_doc"),

		GeoDistance("_geo_distance"),

		Script("_script"),

		Field("field"),

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

	public SortOptions(SortOptionsVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._sortOptionsKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private SortOptions(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SortOptions of(Function<Builder, ObjectBuilder<SortOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code _score}?
	 */
	public boolean isScore() {
		return _kind == Kind.Score;
	}

	/**
	 * Get the {@code _score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code _score} kind.
	 */
	public ScoreSort score() {
		return TaggedUnionUtils.get(this, Kind.Score);
	}

	/**
	 * Is this variant instance of kind {@code _doc}?
	 */
	public boolean isDoc() {
		return _kind == Kind.Doc;
	}

	/**
	 * Get the {@code _doc} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code _doc} kind.
	 */
	public ScoreSort doc() {
		return TaggedUnionUtils.get(this, Kind.Doc);
	}

	/**
	 * Is this variant instance of kind {@code _geo_distance}?
	 */
	public boolean isGeoDistance() {
		return _kind == Kind.GeoDistance;
	}

	/**
	 * Get the {@code _geo_distance} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code _geo_distance} kind.
	 */
	public GeoDistanceSort geoDistance() {
		return TaggedUnionUtils.get(this, Kind.GeoDistance);
	}

	/**
	 * Is this variant instance of kind {@code _script}?
	 */
	public boolean isScript() {
		return _kind == Kind.Script;
	}

	/**
	 * Get the {@code _script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code _script} kind.
	 */
	public ScriptSort script() {
		return TaggedUnionUtils.get(this, Kind.Script);
	}

	/**
	 * Is this variant instance of kind {@code field}?
	 */
	public boolean isField() {
		return _kind == Kind.Field;
	}

	/**
	 * Get the {@code field} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field} kind.
	 */
	public FieldSort field() {
		return TaggedUnionUtils.get(this, Kind.Field);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (isField()) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {

			generator.writeStartObject();

			generator.writeKey(_kind.jsonValue());
			if (_value instanceof JsonpSerializable) {
				((JsonpSerializable) _value).serialize(generator, mapper);
			}

			generator.writeEnd();
		}
	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SortOptions> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<SortOptions> score(ScoreSort v) {
			this._kind = Kind.Score;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SortOptions> score(Function<ScoreSort.Builder, ObjectBuilder<ScoreSort>> fn) {
			return this.score(fn.apply(new ScoreSort.Builder()).build());
		}

		public ObjectBuilder<SortOptions> doc(ScoreSort v) {
			this._kind = Kind.Doc;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SortOptions> doc(Function<ScoreSort.Builder, ObjectBuilder<ScoreSort>> fn) {
			return this.doc(fn.apply(new ScoreSort.Builder()).build());
		}

		public ObjectBuilder<SortOptions> geoDistance(GeoDistanceSort v) {
			this._kind = Kind.GeoDistance;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SortOptions> geoDistance(
				Function<GeoDistanceSort.Builder, ObjectBuilder<GeoDistanceSort>> fn) {
			return this.geoDistance(fn.apply(new GeoDistanceSort.Builder()).build());
		}

		public ObjectBuilder<SortOptions> script(ScriptSort v) {
			this._kind = Kind.Script;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SortOptions> script(Function<ScriptSort.Builder, ObjectBuilder<ScriptSort>> fn) {
			return this.script(fn.apply(new ScriptSort.Builder()).build());
		}

		public ObjectBuilder<SortOptions> field(FieldSort v) {
			this._kind = Kind.Field;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SortOptions> field(Function<FieldSort.Builder, ObjectBuilder<FieldSort>> fn) {
			return this.field(fn.apply(new FieldSort.Builder()).build());
		}

		public SortOptions build() {
			_checkSingleUse();
			return new SortOptions(this);
		}

	}

	public static final JsonpDeserializer<SortOptions> _DESERIALIZER = JsonpDeserializer.lazy(() -> JsonpDeserializer
			.of(EnumSet.of(JsonParser.Event.START_OBJECT, JsonParser.Event.VALUE_STRING), (parser, mapper, event) -> {
				SortOptions.Builder b = new SortOptions.Builder();

				if (event == JsonParser.Event.VALUE_STRING) {
					switch (parser.getString()) {
						case "_score" :
							b.score(s -> s);
							break;
						case "_doc" :
							b.doc(d -> d);
							break;
						default :
							b.field(f -> f.field(parser.getString()));
					}
					return b.build();
				}

				JsonpUtils.expectEvent(parser, JsonParser.Event.START_OBJECT, event);
				JsonpUtils.expectNextEvent(parser, JsonParser.Event.KEY_NAME);
				switch (parser.getString()) {
					case "_score" :
						b.score(ScoreSort._DESERIALIZER.deserialize(parser, mapper));
						break;
					case "_doc" :
						b.doc(ScoreSort._DESERIALIZER.deserialize(parser, mapper));
						break;
					case "_geo_distance" :
						b.geoDistance(GeoDistanceSort._DESERIALIZER.deserialize(parser, mapper));
						break;
					case "_script" :
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
