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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
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

// typedef: _types.aggregations.PValueHeuristic

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.PValueHeuristic">API
 *      specification</a>
 */
@JsonpDeserializable
public class PValueHeuristic implements JsonpSerializable {
	@Nullable
	private final Boolean backgroundIsSuperset;

	@Nullable
	private final Long normalizeAbove;

	// ---------------------------------------------------------------------------------------------

	private PValueHeuristic(Builder builder) {

		this.backgroundIsSuperset = builder.backgroundIsSuperset;
		this.normalizeAbove = builder.normalizeAbove;

	}

	public static PValueHeuristic of(Function<Builder, ObjectBuilder<PValueHeuristic>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code background_is_superset}
	 */
	@Nullable
	public final Boolean backgroundIsSuperset() {
		return this.backgroundIsSuperset;
	}

	/**
	 * Should the results be normalized when above the given value. Allows for
	 * consistent significance results at various scales. Note: <code>0</code> is a
	 * special value which means no normalization
	 * <p>
	 * API name: {@code normalize_above}
	 */
	@Nullable
	public final Long normalizeAbove() {
		return this.normalizeAbove;
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

		if (this.backgroundIsSuperset != null) {
			generator.writeKey("background_is_superset");
			generator.write(this.backgroundIsSuperset);

		}
		if (this.normalizeAbove != null) {
			generator.writeKey("normalize_above");
			generator.write(this.normalizeAbove);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PValueHeuristic}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PValueHeuristic> {
		@Nullable
		private Boolean backgroundIsSuperset;

		@Nullable
		private Long normalizeAbove;

		public Builder() {
		}
		private Builder(PValueHeuristic instance) {
			this.backgroundIsSuperset = instance.backgroundIsSuperset;
			this.normalizeAbove = instance.normalizeAbove;

		}
		/**
		 * API name: {@code background_is_superset}
		 */
		public final Builder backgroundIsSuperset(@Nullable Boolean value) {
			this.backgroundIsSuperset = value;
			return this;
		}

		/**
		 * Should the results be normalized when above the given value. Allows for
		 * consistent significance results at various scales. Note: <code>0</code> is a
		 * special value which means no normalization
		 * <p>
		 * API name: {@code normalize_above}
		 */
		public final Builder normalizeAbove(@Nullable Long value) {
			this.normalizeAbove = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PValueHeuristic}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PValueHeuristic build() {
			_checkSingleUse();

			return new PValueHeuristic(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PValueHeuristic}
	 */
	public static final JsonpDeserializer<PValueHeuristic> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PValueHeuristic::setupPValueHeuristicDeserializer);

	protected static void setupPValueHeuristicDeserializer(ObjectDeserializer<PValueHeuristic.Builder> op) {

		op.add(Builder::backgroundIsSuperset, JsonpDeserializer.booleanDeserializer(), "background_is_superset");
		op.add(Builder::normalizeAbove, JsonpDeserializer.longDeserializer(), "normalize_above");

	}

}
