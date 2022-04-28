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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link SortOptions} variants.
 */
public class SortOptionsBuilders {
	private SortOptionsBuilders() {
	}

	/**
	 * Creates a builder for the {@link ScoreSort _score} {@code SortOptions}
	 * variant.
	 */
	public static ScoreSort.Builder score() {
		return new ScoreSort.Builder();
	}

	/**
	 * Creates a SortOptions of the {@link ScoreSort _score} {@code SortOptions}
	 * variant.
	 */
	public static SortOptions score(Function<ScoreSort.Builder, ObjectBuilder<ScoreSort>> fn) {
		SortOptions.Builder builder = new SortOptions.Builder();
		builder.score(fn.apply(new ScoreSort.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScoreSort _doc} {@code SortOptions} variant.
	 */
	public static ScoreSort.Builder doc() {
		return new ScoreSort.Builder();
	}

	/**
	 * Creates a SortOptions of the {@link ScoreSort _doc} {@code SortOptions}
	 * variant.
	 */
	public static SortOptions doc(Function<ScoreSort.Builder, ObjectBuilder<ScoreSort>> fn) {
		SortOptions.Builder builder = new SortOptions.Builder();
		builder.doc(fn.apply(new ScoreSort.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoDistanceSort _geo_distance}
	 * {@code SortOptions} variant.
	 */
	public static GeoDistanceSort.Builder geoDistance() {
		return new GeoDistanceSort.Builder();
	}

	/**
	 * Creates a SortOptions of the {@link GeoDistanceSort _geo_distance}
	 * {@code SortOptions} variant.
	 */
	public static SortOptions geoDistance(Function<GeoDistanceSort.Builder, ObjectBuilder<GeoDistanceSort>> fn) {
		SortOptions.Builder builder = new SortOptions.Builder();
		builder.geoDistance(fn.apply(new GeoDistanceSort.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScriptSort _script} {@code SortOptions}
	 * variant.
	 */
	public static ScriptSort.Builder script() {
		return new ScriptSort.Builder();
	}

	/**
	 * Creates a SortOptions of the {@link ScriptSort _script} {@code SortOptions}
	 * variant.
	 */
	public static SortOptions script(Function<ScriptSort.Builder, ObjectBuilder<ScriptSort>> fn) {
		SortOptions.Builder builder = new SortOptions.Builder();
		builder.script(fn.apply(new ScriptSort.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FieldSort field} {@code SortOptions}
	 * variant.
	 */
	public static FieldSort.Builder field() {
		return new FieldSort.Builder();
	}

	/**
	 * Creates a SortOptions of the {@link FieldSort field} {@code SortOptions}
	 * variant.
	 */
	public static SortOptions field(Function<FieldSort.Builder, ObjectBuilder<FieldSort>> fn) {
		SortOptions.Builder builder = new SortOptions.Builder();
		builder.field(fn.apply(new FieldSort.Builder()).build());
		return builder.build();
	}

}
