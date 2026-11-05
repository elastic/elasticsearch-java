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

package co.elastic.clients.elasticsearch.indices.segments;

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

// typedef: indices.segments.SegmentAutoCalibration

/**
 * The auto-calibration information of a <code>dense_vector</code> field in a
 * segment.
 * <p>
 * The shape of <code>parameters</code> depends on the quantization method of
 * the field.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.segments.SegmentAutoCalibration">API
 *      specification</a>
 */
@JsonpDeserializable
public class SegmentAutoCalibration implements OpenTaggedUnion<SegmentAutoCalibration.Kind, Object>, JsonpSerializable {

	/**
	 * {@link SegmentAutoCalibration} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#indices.segments.SegmentAutoCalibration">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Osq("osq"),

		/** A custom {@code SegmentAutoCalibration} defined by a plugin */
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

	public SegmentAutoCalibration(SegmentAutoCalibrationVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._segmentAutoCalibrationKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private SegmentAutoCalibration(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static SegmentAutoCalibration of(Function<Builder, ObjectBuilder<SegmentAutoCalibration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Build a custom plugin-defined {@code SegmentAutoCalibration}, given its kind
	 * and some JSON data
	 */
	public SegmentAutoCalibration(String kind, JsonData value) {
		this._kind = Kind._Custom;
		this._value = value;
		this._customKind = kind;
	}

	/**
	 * Is this variant instance of kind {@code osq}?
	 */
	public boolean isOsq() {
		return _kind == Kind.Osq;
	}

	/**
	 * Get the {@code osq} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code osq} kind.
	 */
	public OsqSegmentAutoCalibration osq() {
		return TaggedUnionUtils.get(this, Kind.Osq);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code SegmentAutoCalibration} defined by a plugin?
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SegmentAutoCalibration> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<SegmentAutoCalibration> osq(OsqSegmentAutoCalibration v) {
			this._kind = Kind.Osq;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SegmentAutoCalibration> osq(
				Function<OsqSegmentAutoCalibration.Builder, ObjectBuilder<OsqSegmentAutoCalibration>> fn) {
			return this.osq(fn.apply(new OsqSegmentAutoCalibration.Builder()).build());
		}

		/**
		 * Define this {@code SegmentAutoCalibration} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code SegmentAutoCalibration}. It is
		 *            converted internally to {@link JsonData}.
		 */
		public ObjectBuilder<SegmentAutoCalibration> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
		}

		public SegmentAutoCalibration build() {
			_checkSingleUse();
			return new SegmentAutoCalibration(this);
		}

	}

	protected static void setupSegmentAutoCalibrationDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::osq, OsqSegmentAutoCalibration._DESERIALIZER, "osq");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<SegmentAutoCalibration> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SegmentAutoCalibration::setupSegmentAutoCalibrationDeserializer, Builder::build);
}
