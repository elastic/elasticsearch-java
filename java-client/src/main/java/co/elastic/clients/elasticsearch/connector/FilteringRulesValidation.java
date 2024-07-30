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

package co.elastic.clients.elasticsearch.connector;

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

// typedef: connector._types.FilteringRulesValidation

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.FilteringRulesValidation">API
 *      specification</a>
 */
@JsonpDeserializable
public class FilteringRulesValidation implements JsonpSerializable {
	private final List<FilteringValidation> errors;

	private final FilteringValidationState state;

	// ---------------------------------------------------------------------------------------------

	private FilteringRulesValidation(Builder builder) {

		this.errors = ApiTypeHelper.unmodifiableRequired(builder.errors, this, "errors");
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");

	}

	public static FilteringRulesValidation of(Function<Builder, ObjectBuilder<FilteringRulesValidation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code errors}
	 */
	public final List<FilteringValidation> errors() {
		return this.errors;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final FilteringValidationState state() {
		return this.state;
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

		if (ApiTypeHelper.isDefined(this.errors)) {
			generator.writeKey("errors");
			generator.writeStartArray();
			for (FilteringValidation item0 : this.errors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("state");
		this.state.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FilteringRulesValidation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FilteringRulesValidation> {
		private List<FilteringValidation> errors;

		private FilteringValidationState state;

		/**
		 * Required - API name: {@code errors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>errors</code>.
		 */
		public final Builder errors(List<FilteringValidation> list) {
			this.errors = _listAddAll(this.errors, list);
			return this;
		}

		/**
		 * Required - API name: {@code errors}
		 * <p>
		 * Adds one or more values to <code>errors</code>.
		 */
		public final Builder errors(FilteringValidation value, FilteringValidation... values) {
			this.errors = _listAdd(this.errors, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code errors}
		 * <p>
		 * Adds a value to <code>errors</code> using a builder lambda.
		 */
		public final Builder errors(Function<FilteringValidation.Builder, ObjectBuilder<FilteringValidation>> fn) {
			return errors(fn.apply(new FilteringValidation.Builder()).build());
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(FilteringValidationState value) {
			this.state = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FilteringRulesValidation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FilteringRulesValidation build() {
			_checkSingleUse();

			return new FilteringRulesValidation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FilteringRulesValidation}
	 */
	public static final JsonpDeserializer<FilteringRulesValidation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FilteringRulesValidation::setupFilteringRulesValidationDeserializer);

	protected static void setupFilteringRulesValidationDeserializer(
			ObjectDeserializer<FilteringRulesValidation.Builder> op) {

		op.add(Builder::errors, JsonpDeserializer.arrayDeserializer(FilteringValidation._DESERIALIZER), "errors");
		op.add(Builder::state, FilteringValidationState._DESERIALIZER, "state");

	}

}
