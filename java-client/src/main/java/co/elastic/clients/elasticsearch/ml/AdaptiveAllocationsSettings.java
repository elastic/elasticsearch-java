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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Boolean;
import java.lang.Integer;
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

// typedef: ml._types.AdaptiveAllocationsSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.AdaptiveAllocationsSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AdaptiveAllocationsSettings implements JsonpSerializable {
	private final boolean enabled;

	@Nullable
	private final Integer minNumberOfAllocations;

	@Nullable
	private final Integer maxNumberOfAllocations;

	// ---------------------------------------------------------------------------------------------

	private AdaptiveAllocationsSettings(Builder builder) {

		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled");
		this.minNumberOfAllocations = builder.minNumberOfAllocations;
		this.maxNumberOfAllocations = builder.maxNumberOfAllocations;

	}

	public static AdaptiveAllocationsSettings of(Function<Builder, ObjectBuilder<AdaptiveAllocationsSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - If true, adaptive_allocations is enabled
	 * <p>
	 * API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
	}

	/**
	 * Specifies the minimum number of allocations to scale to. If set, it must be
	 * greater than or equal to 0. If not defined, the deployment scales to 0.
	 * <p>
	 * API name: {@code min_number_of_allocations}
	 */
	@Nullable
	public final Integer minNumberOfAllocations() {
		return this.minNumberOfAllocations;
	}

	/**
	 * Specifies the maximum number of allocations to scale to. If set, it must be
	 * greater than or equal to min_number_of_allocations.
	 * <p>
	 * API name: {@code max_number_of_allocations}
	 */
	@Nullable
	public final Integer maxNumberOfAllocations() {
		return this.maxNumberOfAllocations;
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

		generator.writeKey("enabled");
		generator.write(this.enabled);

		if (this.minNumberOfAllocations != null) {
			generator.writeKey("min_number_of_allocations");
			generator.write(this.minNumberOfAllocations);

		}
		if (this.maxNumberOfAllocations != null) {
			generator.writeKey("max_number_of_allocations");
			generator.write(this.maxNumberOfAllocations);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AdaptiveAllocationsSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AdaptiveAllocationsSettings> {
		private Boolean enabled;

		@Nullable
		private Integer minNumberOfAllocations;

		@Nullable
		private Integer maxNumberOfAllocations;

		/**
		 * Required - If true, adaptive_allocations is enabled
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Specifies the minimum number of allocations to scale to. If set, it must be
		 * greater than or equal to 0. If not defined, the deployment scales to 0.
		 * <p>
		 * API name: {@code min_number_of_allocations}
		 */
		public final Builder minNumberOfAllocations(@Nullable Integer value) {
			this.minNumberOfAllocations = value;
			return this;
		}

		/**
		 * Specifies the maximum number of allocations to scale to. If set, it must be
		 * greater than or equal to min_number_of_allocations.
		 * <p>
		 * API name: {@code max_number_of_allocations}
		 */
		public final Builder maxNumberOfAllocations(@Nullable Integer value) {
			this.maxNumberOfAllocations = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AdaptiveAllocationsSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AdaptiveAllocationsSettings build() {
			_checkSingleUse();

			return new AdaptiveAllocationsSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AdaptiveAllocationsSettings}
	 */
	public static final JsonpDeserializer<AdaptiveAllocationsSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AdaptiveAllocationsSettings::setupAdaptiveAllocationsSettingsDeserializer);

	protected static void setupAdaptiveAllocationsSettingsDeserializer(
			ObjectDeserializer<AdaptiveAllocationsSettings.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::minNumberOfAllocations, JsonpDeserializer.integerDeserializer(), "min_number_of_allocations");
		op.add(Builder::maxNumberOfAllocations, JsonpDeserializer.integerDeserializer(), "max_number_of_allocations");

	}

}
