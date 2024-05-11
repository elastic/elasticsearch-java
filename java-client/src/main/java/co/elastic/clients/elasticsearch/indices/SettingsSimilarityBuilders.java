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

package co.elastic.clients.elasticsearch.indices;

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
 * Builders for {@link SettingsSimilarity} variants.
 */
public class SettingsSimilarityBuilders {
	private SettingsSimilarityBuilders() {
	}

	/**
	 * Creates a builder for the {@link SettingsSimilarityBm25 BM25}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarityBm25.Builder bm25() {
		return new SettingsSimilarityBm25.Builder();
	}

	/**
	 * Creates a SettingsSimilarity of the {@link SettingsSimilarityBm25 BM25}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarity bm25(
			Function<SettingsSimilarityBm25.Builder, ObjectBuilder<SettingsSimilarityBm25>> fn) {
		SettingsSimilarity.Builder builder = new SettingsSimilarity.Builder();
		builder.bm25(fn.apply(new SettingsSimilarityBm25.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SettingsSimilarityBoolean boolean}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarityBoolean.Builder boolean_() {
		return new SettingsSimilarityBoolean.Builder();
	}

	/**
	 * Creates a SettingsSimilarity of the {@link SettingsSimilarityBoolean boolean}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarity boolean_(
			Function<SettingsSimilarityBoolean.Builder, ObjectBuilder<SettingsSimilarityBoolean>> fn) {
		SettingsSimilarity.Builder builder = new SettingsSimilarity.Builder();
		builder.boolean_(fn.apply(new SettingsSimilarityBoolean.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SettingsSimilarityDfi DFI}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarityDfi.Builder dfi() {
		return new SettingsSimilarityDfi.Builder();
	}

	/**
	 * Creates a SettingsSimilarity of the {@link SettingsSimilarityDfi DFI}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarity dfi(
			Function<SettingsSimilarityDfi.Builder, ObjectBuilder<SettingsSimilarityDfi>> fn) {
		SettingsSimilarity.Builder builder = new SettingsSimilarity.Builder();
		builder.dfi(fn.apply(new SettingsSimilarityDfi.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SettingsSimilarityDfr DFR}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarityDfr.Builder dfr() {
		return new SettingsSimilarityDfr.Builder();
	}

	/**
	 * Creates a SettingsSimilarity of the {@link SettingsSimilarityDfr DFR}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarity dfr(
			Function<SettingsSimilarityDfr.Builder, ObjectBuilder<SettingsSimilarityDfr>> fn) {
		SettingsSimilarity.Builder builder = new SettingsSimilarity.Builder();
		builder.dfr(fn.apply(new SettingsSimilarityDfr.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SettingsSimilarityIb IB}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarityIb.Builder ib() {
		return new SettingsSimilarityIb.Builder();
	}

	/**
	 * Creates a SettingsSimilarity of the {@link SettingsSimilarityIb IB}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarity ib(
			Function<SettingsSimilarityIb.Builder, ObjectBuilder<SettingsSimilarityIb>> fn) {
		SettingsSimilarity.Builder builder = new SettingsSimilarity.Builder();
		builder.ib(fn.apply(new SettingsSimilarityIb.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SettingsSimilarityLmd LMDirichlet}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarityLmd.Builder lmdirichlet() {
		return new SettingsSimilarityLmd.Builder();
	}

	/**
	 * Creates a SettingsSimilarity of the {@link SettingsSimilarityLmd LMDirichlet}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarity lmdirichlet(
			Function<SettingsSimilarityLmd.Builder, ObjectBuilder<SettingsSimilarityLmd>> fn) {
		SettingsSimilarity.Builder builder = new SettingsSimilarity.Builder();
		builder.lmdirichlet(fn.apply(new SettingsSimilarityLmd.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SettingsSimilarityLmj LMJelinekMercer}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarityLmj.Builder lmjelinekmercer() {
		return new SettingsSimilarityLmj.Builder();
	}

	/**
	 * Creates a SettingsSimilarity of the {@link SettingsSimilarityLmj
	 * LMJelinekMercer} {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarity lmjelinekmercer(
			Function<SettingsSimilarityLmj.Builder, ObjectBuilder<SettingsSimilarityLmj>> fn) {
		SettingsSimilarity.Builder builder = new SettingsSimilarity.Builder();
		builder.lmjelinekmercer(fn.apply(new SettingsSimilarityLmj.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SettingsSimilarityScripted scripted}
	 * {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarityScripted.Builder scripted() {
		return new SettingsSimilarityScripted.Builder();
	}

	/**
	 * Creates a SettingsSimilarity of the {@link SettingsSimilarityScripted
	 * scripted} {@code SettingsSimilarity} variant.
	 */
	public static SettingsSimilarity scripted(
			Function<SettingsSimilarityScripted.Builder, ObjectBuilder<SettingsSimilarityScripted>> fn) {
		SettingsSimilarity.Builder builder = new SettingsSimilarity.Builder();
		builder.scripted(fn.apply(new SettingsSimilarityScripted.Builder()).build());
		return builder.build();
	}

}
