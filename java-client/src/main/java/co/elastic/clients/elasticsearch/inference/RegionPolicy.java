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

package co.elastic.clients.elasticsearch.inference;

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
import java.lang.Object;
import java.lang.String;
import java.util.List;
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

// typedef: inference._types.RegionPolicy

/**
 * The region policy configuration. Specify exactly one of
 * <code>allowed_geos</code> or <code>allowed_regions</code>.
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.RegionPolicy">API
 *      specification</a>
 */
@JsonpDeserializable
public class RegionPolicy implements TaggedUnion<RegionPolicy.Kind, Object>, JsonpSerializable {

	/**
	 * {@link RegionPolicy} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#inference._types.RegionPolicy">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		AllowedGeos("allowed_geos"),

		AllowedRegions("allowed_regions"),

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

	public RegionPolicy(RegionPolicyVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._regionPolicyKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private RegionPolicy(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static RegionPolicy of(Function<Builder, ObjectBuilder<RegionPolicy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code allowed_geos}?
	 */
	public boolean isAllowedGeos() {
		return _kind == Kind.AllowedGeos;
	}

	/**
	 * Get the {@code allowed_geos} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code allowed_geos} kind.
	 */
	public List<String> allowedGeos() {
		return TaggedUnionUtils.get(this, Kind.AllowedGeos);
	}

	/**
	 * Is this variant instance of kind {@code allowed_regions}?
	 */
	public boolean isAllowedRegions() {
		return _kind == Kind.AllowedRegions;
	}

	/**
	 * Get the {@code allowed_regions} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code allowed_regions}
	 *             kind.
	 */
	public List<CspRegion> allowedRegions() {
		return TaggedUnionUtils.get(this, Kind.AllowedRegions);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case AllowedGeos :
					generator.writeStartArray();
					for (String item0 : ((List<String>) this._value)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case AllowedRegions :
					generator.writeStartArray();
					for (CspRegion item0 : ((List<CspRegion>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RegionPolicy> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<RegionPolicy> allowedGeos(List<String> v) {
			this._kind = Kind.AllowedGeos;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RegionPolicy> allowedRegions(List<CspRegion> v) {
			this._kind = Kind.AllowedRegions;
			this._value = v;
			return this;
		}

		public RegionPolicy build() {
			_checkSingleUse();
			return new RegionPolicy(this);
		}

	}

	protected static void setupRegionPolicyDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::allowedGeos, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"allowed_geos");
		op.add(Builder::allowedRegions, JsonpDeserializer.arrayDeserializer(CspRegion._DESERIALIZER),
				"allowed_regions");

	}

	public static final JsonpDeserializer<RegionPolicy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RegionPolicy::setupRegionPolicyDeserializer, Builder::build);
}
