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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: _global.health_report.ShardsAvailabilityIndicator

/**
 * SHARDS_AVAILABILITY
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.ShardsAvailabilityIndicator">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardsAvailabilityIndicator extends BaseIndicator {
	@Nullable
	private final ShardsAvailabilityIndicatorDetails details;

	// ---------------------------------------------------------------------------------------------

	private ShardsAvailabilityIndicator(Builder builder) {
		super(builder);

		this.details = builder.details;

	}

	public static ShardsAvailabilityIndicator of(Function<Builder, ObjectBuilder<ShardsAvailabilityIndicator>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code details}
	 */
	@Nullable
	public final ShardsAvailabilityIndicatorDetails details() {
		return this.details;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.details != null) {
			generator.writeKey("details");
			this.details.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsAvailabilityIndicator}.
	 */

	public static class Builder extends BaseIndicator.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ShardsAvailabilityIndicator> {
		@Nullable
		private ShardsAvailabilityIndicatorDetails details;

		/**
		 * API name: {@code details}
		 */
		public final Builder details(@Nullable ShardsAvailabilityIndicatorDetails value) {
			this.details = value;
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public final Builder details(
				Function<ShardsAvailabilityIndicatorDetails.Builder, ObjectBuilder<ShardsAvailabilityIndicatorDetails>> fn) {
			return this.details(fn.apply(new ShardsAvailabilityIndicatorDetails.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardsAvailabilityIndicator}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsAvailabilityIndicator build() {
			_checkSingleUse();

			return new ShardsAvailabilityIndicator(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsAvailabilityIndicator}
	 */
	public static final JsonpDeserializer<ShardsAvailabilityIndicator> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardsAvailabilityIndicator::setupShardsAvailabilityIndicatorDeserializer);

	protected static void setupShardsAvailabilityIndicatorDeserializer(
			ObjectDeserializer<ShardsAvailabilityIndicator.Builder> op) {
		BaseIndicator.setupBaseIndicatorDeserializer(op);
		op.add(Builder::details, ShardsAvailabilityIndicatorDetails._DESERIALIZER, "details");

	}

}
