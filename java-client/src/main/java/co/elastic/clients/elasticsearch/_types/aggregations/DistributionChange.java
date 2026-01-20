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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: _types.aggregations.DistributionChange

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.DistributionChange">API
 *      specification</a>
 */
@JsonpDeserializable
public class DistributionChange extends AbstractChangePoint implements ChangeTypeVariant {
	// ---------------------------------------------------------------------------------------------

	private DistributionChange(Builder builder) {
		super(builder);

	}

	public static DistributionChange of(Function<Builder, ObjectBuilder<DistributionChange>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * ChangeType variant kind.
	 */
	@Override
	public ChangeType.Kind _changeTypeKind() {
		return ChangeType.Kind.DistributionChange;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DistributionChange}.
	 */

	public static class Builder extends AbstractChangePoint.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DistributionChange> {
		public Builder() {
		}
		private Builder(DistributionChange instance) {

		}
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DistributionChange}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DistributionChange build() {
			_checkSingleUse();

			return new DistributionChange(this);
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
	 * Json deserializer for {@link DistributionChange}
	 */
	public static final JsonpDeserializer<DistributionChange> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DistributionChange::setupDistributionChangeDeserializer);

	protected static void setupDistributionChangeDeserializer(ObjectDeserializer<DistributionChange.Builder> op) {
		AbstractChangePoint.setupAbstractChangePointDeserializer(op);

	}

}
