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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: _types.aggregations.TrendChange

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.TrendChange">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrendChange implements ChangeTypeVariant, JsonpSerializable {
	private final double pValue;

	private final double rValue;

	private final int changePoint;

	// ---------------------------------------------------------------------------------------------

	private TrendChange(Builder builder) {

		this.pValue = ApiTypeHelper.requireNonNull(builder.pValue, this, "pValue", 0);
		this.rValue = ApiTypeHelper.requireNonNull(builder.rValue, this, "rValue", 0);
		this.changePoint = ApiTypeHelper.requireNonNull(builder.changePoint, this, "changePoint", 0);

	}

	public static TrendChange of(Function<Builder, ObjectBuilder<TrendChange>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * ChangeType variant kind.
	 */
	@Override
	public ChangeType.Kind _changeTypeKind() {
		return ChangeType.Kind.TrendChange;
	}

	/**
	 * Required - API name: {@code p_value}
	 */
	public final double pValue() {
		return this.pValue;
	}

	/**
	 * Required - API name: {@code r_value}
	 */
	public final double rValue() {
		return this.rValue;
	}

	/**
	 * Required - API name: {@code change_point}
	 */
	public final int changePoint() {
		return this.changePoint;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("p_value");
		generator.write(this.pValue);

		generator.writeKey("r_value");
		generator.write(this.rValue);

		generator.writeKey("change_point");
		generator.write(this.changePoint);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrendChange}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TrendChange> {
		private Double pValue;

		private Double rValue;

		private Integer changePoint;

		/**
		 * Required - API name: {@code p_value}
		 */
		public final Builder pValue(double value) {
			this.pValue = value;
			return this;
		}

		/**
		 * Required - API name: {@code r_value}
		 */
		public final Builder rValue(double value) {
			this.rValue = value;
			return this;
		}

		/**
		 * Required - API name: {@code change_point}
		 */
		public final Builder changePoint(int value) {
			this.changePoint = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrendChange}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrendChange build() {
			_checkSingleUse();

			return new TrendChange(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrendChange}
	 */
	public static final JsonpDeserializer<TrendChange> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TrendChange::setupTrendChangeDeserializer);

	protected static void setupTrendChangeDeserializer(ObjectDeserializer<TrendChange.Builder> op) {

		op.add(Builder::pValue, JsonpDeserializer.doubleDeserializer(), "p_value");
		op.add(Builder::rValue, JsonpDeserializer.doubleDeserializer(), "r_value");
		op.add(Builder::changePoint, JsonpDeserializer.integerDeserializer(), "change_point");

	}

}
