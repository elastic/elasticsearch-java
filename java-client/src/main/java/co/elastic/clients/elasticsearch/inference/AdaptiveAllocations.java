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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
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

// typedef: inference._types.AdaptiveAllocations

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.AdaptiveAllocations">API
 *      specification</a>
 */
@JsonpDeserializable
public class AdaptiveAllocations implements JsonpSerializable {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final Integer maxNumberOfAllocations;

	@Nullable
	private final Integer minNumberOfAllocations;

	// ---------------------------------------------------------------------------------------------

	private AdaptiveAllocations(Builder builder) {

		this.enabled = builder.enabled;
		this.maxNumberOfAllocations = builder.maxNumberOfAllocations;
		this.minNumberOfAllocations = builder.minNumberOfAllocations;

	}

	public static AdaptiveAllocations of(Function<Builder, ObjectBuilder<AdaptiveAllocations>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Turn on <code>adaptive_allocations</code>.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * The maximum number of allocations to scale to. If set, it must be greater
	 * than or equal to <code>min_number_of_allocations</code>.
	 * <p>
	 * API name: {@code max_number_of_allocations}
	 */
	@Nullable
	public final Integer maxNumberOfAllocations() {
		return this.maxNumberOfAllocations;
	}

	/**
	 * The minimum number of allocations to scale to. If set, it must be greater
	 * than or equal to 0. If not defined, the deployment scales to 0.
	 * <p>
	 * API name: {@code min_number_of_allocations}
	 */
	@Nullable
	public final Integer minNumberOfAllocations() {
		return this.minNumberOfAllocations;
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

		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.maxNumberOfAllocations != null) {
			generator.writeKey("max_number_of_allocations");
			generator.write(this.maxNumberOfAllocations);

		}
		if (this.minNumberOfAllocations != null) {
			generator.writeKey("min_number_of_allocations");
			generator.write(this.minNumberOfAllocations);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AdaptiveAllocations}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AdaptiveAllocations> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private Integer maxNumberOfAllocations;

		@Nullable
		private Integer minNumberOfAllocations;

		/**
		 * Turn on <code>adaptive_allocations</code>.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * The maximum number of allocations to scale to. If set, it must be greater
		 * than or equal to <code>min_number_of_allocations</code>.
		 * <p>
		 * API name: {@code max_number_of_allocations}
		 */
		public final Builder maxNumberOfAllocations(@Nullable Integer value) {
			this.maxNumberOfAllocations = value;
			return this;
		}

		/**
		 * The minimum number of allocations to scale to. If set, it must be greater
		 * than or equal to 0. If not defined, the deployment scales to 0.
		 * <p>
		 * API name: {@code min_number_of_allocations}
		 */
		public final Builder minNumberOfAllocations(@Nullable Integer value) {
			this.minNumberOfAllocations = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AdaptiveAllocations}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AdaptiveAllocations build() {
			_checkSingleUse();

			return new AdaptiveAllocations(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AdaptiveAllocations}
	 */
	public static final JsonpDeserializer<AdaptiveAllocations> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AdaptiveAllocations::setupAdaptiveAllocationsDeserializer);

	protected static void setupAdaptiveAllocationsDeserializer(ObjectDeserializer<AdaptiveAllocations.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::maxNumberOfAllocations, JsonpDeserializer.integerDeserializer(), "max_number_of_allocations");
		op.add(Builder::minNumberOfAllocations, JsonpDeserializer.integerDeserializer(), "min_number_of_allocations");

	}

}
