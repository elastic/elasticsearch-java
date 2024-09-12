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

import co.elastic.clients.util.ObjectBuilder;
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

/**
 * Builders for {@link Validation} variants.
 */
public class ValidationBuilders {
	private ValidationBuilders() {
	}

	/**
	 * Creates a builder for the {@link GreaterThanValidation greater_than}
	 * {@code Validation} variant.
	 */
	public static GreaterThanValidation.Builder greaterThan() {
		return new GreaterThanValidation.Builder();
	}

	/**
	 * Creates a Validation of the {@link GreaterThanValidation greater_than}
	 * {@code Validation} variant.
	 */
	public static Validation greaterThan(
			Function<GreaterThanValidation.Builder, ObjectBuilder<GreaterThanValidation>> fn) {
		Validation.Builder builder = new Validation.Builder();
		builder.greaterThan(fn.apply(new GreaterThanValidation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IncludedInValidation included_in}
	 * {@code Validation} variant.
	 */
	public static IncludedInValidation.Builder includedIn() {
		return new IncludedInValidation.Builder();
	}

	/**
	 * Creates a Validation of the {@link IncludedInValidation included_in}
	 * {@code Validation} variant.
	 */
	public static Validation includedIn(
			Function<IncludedInValidation.Builder, ObjectBuilder<IncludedInValidation>> fn) {
		Validation.Builder builder = new Validation.Builder();
		builder.includedIn(fn.apply(new IncludedInValidation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LessThanValidation less_than}
	 * {@code Validation} variant.
	 */
	public static LessThanValidation.Builder lessThan() {
		return new LessThanValidation.Builder();
	}

	/**
	 * Creates a Validation of the {@link LessThanValidation less_than}
	 * {@code Validation} variant.
	 */
	public static Validation lessThan(Function<LessThanValidation.Builder, ObjectBuilder<LessThanValidation>> fn) {
		Validation.Builder builder = new Validation.Builder();
		builder.lessThan(fn.apply(new LessThanValidation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ListTypeValidation list_type}
	 * {@code Validation} variant.
	 */
	public static ListTypeValidation.Builder listType() {
		return new ListTypeValidation.Builder();
	}

	/**
	 * Creates a Validation of the {@link ListTypeValidation list_type}
	 * {@code Validation} variant.
	 */
	public static Validation listType(Function<ListTypeValidation.Builder, ObjectBuilder<ListTypeValidation>> fn) {
		Validation.Builder builder = new Validation.Builder();
		builder.listType(fn.apply(new ListTypeValidation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RegexValidation regex} {@code Validation}
	 * variant.
	 */
	public static RegexValidation.Builder regex() {
		return new RegexValidation.Builder();
	}

	/**
	 * Creates a Validation of the {@link RegexValidation regex} {@code Validation}
	 * variant.
	 */
	public static Validation regex(Function<RegexValidation.Builder, ObjectBuilder<RegexValidation>> fn) {
		Validation.Builder builder = new Validation.Builder();
		builder.regex(fn.apply(new RegexValidation.Builder()).build());
		return builder.build();
	}

}
