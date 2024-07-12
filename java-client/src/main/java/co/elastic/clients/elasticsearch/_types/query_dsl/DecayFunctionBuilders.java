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
 * Builders for {@link DecayFunction} variants.
 */
public class DecayFunctionBuilders {
	private DecayFunctionBuilders() {
	}

	/**
	 * Creates a builder for the {@link DateDecayFunction date}
	 * {@code DecayFunction} variant.
	 */
	public static DateDecayFunction.Builder date() {
		return new DateDecayFunction.Builder();
	}

	/**
	 * Creates a DecayFunction of the {@link DateDecayFunction date}
	 * {@code DecayFunction} variant.
	 */
	public static DecayFunction date(Function<DateDecayFunction.Builder, ObjectBuilder<DateDecayFunction>> fn) {
		DecayFunction.Builder builder = new DecayFunction.Builder();
		builder.date(fn.apply(new DateDecayFunction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoDecayFunction geo} {@code DecayFunction}
	 * variant.
	 */
	public static GeoDecayFunction.Builder geo() {
		return new GeoDecayFunction.Builder();
	}

	/**
	 * Creates a DecayFunction of the {@link GeoDecayFunction geo}
	 * {@code DecayFunction} variant.
	 */
	public static DecayFunction geo(Function<GeoDecayFunction.Builder, ObjectBuilder<GeoDecayFunction>> fn) {
		DecayFunction.Builder builder = new DecayFunction.Builder();
		builder.geo(fn.apply(new GeoDecayFunction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NumericDecayFunction numeric}
	 * {@code DecayFunction} variant.
	 */
	public static NumericDecayFunction.Builder numeric() {
		return new NumericDecayFunction.Builder();
	}

	/**
	 * Creates a DecayFunction of the {@link NumericDecayFunction numeric}
	 * {@code DecayFunction} variant.
	 */
	public static DecayFunction numeric(
			Function<NumericDecayFunction.Builder, ObjectBuilder<NumericDecayFunction>> fn) {
		DecayFunction.Builder builder = new DecayFunction.Builder();
		builder.numeric(fn.apply(new NumericDecayFunction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UntypedDecayFunction untyped}
	 * {@code DecayFunction} variant.
	 */
	public static UntypedDecayFunction.Builder untyped() {
		return new UntypedDecayFunction.Builder();
	}

	/**
	 * Creates a DecayFunction of the {@link UntypedDecayFunction untyped}
	 * {@code DecayFunction} variant.
	 */
	public static DecayFunction untyped(
			Function<UntypedDecayFunction.Builder, ObjectBuilder<UntypedDecayFunction>> fn) {
		DecayFunction.Builder builder = new DecayFunction.Builder();
		builder.untyped(fn.apply(new UntypedDecayFunction.Builder()).build());
		return builder.build();
	}

}
