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

package co.elastic.clients.elasticsearch.core.health_report;

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

// typedef: _global.health_report.ShardsCapacityIndicatorDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.ShardsCapacityIndicatorDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardsCapacityIndicatorDetails implements JsonpSerializable {
	private final ShardsCapacityIndicatorTierDetail data;

	private final ShardsCapacityIndicatorTierDetail frozen;

	// ---------------------------------------------------------------------------------------------

	private ShardsCapacityIndicatorDetails(Builder builder) {

		this.data = ApiTypeHelper.requireNonNull(builder.data, this, "data");
		this.frozen = ApiTypeHelper.requireNonNull(builder.frozen, this, "frozen");

	}

	public static ShardsCapacityIndicatorDetails of(
			Function<Builder, ObjectBuilder<ShardsCapacityIndicatorDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code data}
	 */
	public final ShardsCapacityIndicatorTierDetail data() {
		return this.data;
	}

	/**
	 * Required - API name: {@code frozen}
	 */
	public final ShardsCapacityIndicatorTierDetail frozen() {
		return this.frozen;
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

		generator.writeKey("data");
		this.data.serialize(generator, mapper);

		generator.writeKey("frozen");
		this.frozen.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsCapacityIndicatorDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ShardsCapacityIndicatorDetails> {
		private ShardsCapacityIndicatorTierDetail data;

		private ShardsCapacityIndicatorTierDetail frozen;

		/**
		 * Required - API name: {@code data}
		 */
		public final Builder data(ShardsCapacityIndicatorTierDetail value) {
			this.data = value;
			return this;
		}

		/**
		 * Required - API name: {@code data}
		 */
		public final Builder data(
				Function<ShardsCapacityIndicatorTierDetail.Builder, ObjectBuilder<ShardsCapacityIndicatorTierDetail>> fn) {
			return this.data(fn.apply(new ShardsCapacityIndicatorTierDetail.Builder()).build());
		}

		/**
		 * Required - API name: {@code frozen}
		 */
		public final Builder frozen(ShardsCapacityIndicatorTierDetail value) {
			this.frozen = value;
			return this;
		}

		/**
		 * Required - API name: {@code frozen}
		 */
		public final Builder frozen(
				Function<ShardsCapacityIndicatorTierDetail.Builder, ObjectBuilder<ShardsCapacityIndicatorTierDetail>> fn) {
			return this.frozen(fn.apply(new ShardsCapacityIndicatorTierDetail.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardsCapacityIndicatorDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsCapacityIndicatorDetails build() {
			_checkSingleUse();

			return new ShardsCapacityIndicatorDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsCapacityIndicatorDetails}
	 */
	public static final JsonpDeserializer<ShardsCapacityIndicatorDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardsCapacityIndicatorDetails::setupShardsCapacityIndicatorDetailsDeserializer);

	protected static void setupShardsCapacityIndicatorDetailsDeserializer(
			ObjectDeserializer<ShardsCapacityIndicatorDetails.Builder> op) {

		op.add(Builder::data, ShardsCapacityIndicatorTierDetail._DESERIALIZER, "data");
		op.add(Builder::frozen, ShardsCapacityIndicatorTierDetail._DESERIALIZER, "frozen");

	}

}
