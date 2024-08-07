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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: _types.query_dsl.DateDecayFunction

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.DateDecayFunction">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateDecayFunction extends DecayFunctionBase<String, Time> implements DecayFunctionVariant {
	// ---------------------------------------------------------------------------------------------

	private DateDecayFunction(Builder builder) {
		super(builder);

	}

	public static DateDecayFunction of(Function<Builder, ObjectBuilder<DateDecayFunction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DecayFunction variant kind.
	 */
	@Override
	public DecayFunction.Kind _decayFunctionKind() {
		return DecayFunction.Kind.Date;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateDecayFunction}.
	 */

	public static class Builder extends DecayFunctionBase.AbstractBuilder<String, Time, Builder>
			implements
				ObjectBuilder<DateDecayFunction> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateDecayFunction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateDecayFunction build() {
			_checkSingleUse();
			super.tOriginSerializer(null);
			super.tScaleSerializer(null);

			return new DateDecayFunction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateDecayFunction}
	 */
	public static final JsonpDeserializer<DateDecayFunction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateDecayFunction::setupDateDecayFunctionDeserializer);

	protected static void setupDateDecayFunctionDeserializer(ObjectDeserializer<DateDecayFunction.Builder> op) {
		DecayFunctionBase.setupDecayFunctionBaseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				Time._DESERIALIZER);

	}

}
