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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link Condition} variants.
 */
public class ConditionBuilders {
	private ConditionBuilders() {
	}

	/**
	 * Creates a builder for the {@link AlwaysCondition always} {@code Condition}
	 * variant.
	 */
	public static AlwaysCondition.Builder always() {
		return new AlwaysCondition.Builder();
	}

	/**
	 * Creates a Condition of the {@link AlwaysCondition always} {@code Condition}
	 * variant.
	 */
	public static Condition always(Function<AlwaysCondition.Builder, ObjectBuilder<AlwaysCondition>> fn) {
		Condition.Builder builder = new Condition.Builder();
		builder.always(fn.apply(new AlwaysCondition.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ArrayCompareCondition array_compare}
	 * {@code Condition} variant.
	 */
	public static ArrayCompareCondition.Builder arrayCompare() {
		return new ArrayCompareCondition.Builder();
	}

	/**
	 * Creates a Condition of the {@link ArrayCompareCondition array_compare}
	 * {@code Condition} variant.
	 */
	public static Condition arrayCompare(
			Function<ArrayCompareCondition.Builder, ObjectBuilder<ArrayCompareCondition>> fn) {
		Condition.Builder builder = new Condition.Builder();
		builder.arrayCompare(fn.apply(new ArrayCompareCondition.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CompareCondition compare} {@code Condition}
	 * variant.
	 */
	public static CompareCondition.Builder compare() {
		return new CompareCondition.Builder();
	}

	/**
	 * Creates a Condition of the {@link CompareCondition compare} {@code Condition}
	 * variant.
	 */
	public static Condition compare(Function<CompareCondition.Builder, ObjectBuilder<CompareCondition>> fn) {
		Condition.Builder builder = new Condition.Builder();
		builder.compare(fn.apply(new CompareCondition.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NeverCondition never} {@code Condition}
	 * variant.
	 */
	public static NeverCondition.Builder never() {
		return new NeverCondition.Builder();
	}

	/**
	 * Creates a Condition of the {@link NeverCondition never} {@code Condition}
	 * variant.
	 */
	public static Condition never(Function<NeverCondition.Builder, ObjectBuilder<NeverCondition>> fn) {
		Condition.Builder builder = new Condition.Builder();
		builder.never(fn.apply(new NeverCondition.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScriptCondition script} {@code Condition}
	 * variant.
	 */
	public static ScriptCondition.Builder script() {
		return new ScriptCondition.Builder();
	}

	/**
	 * Creates a Condition of the {@link ScriptCondition script} {@code Condition}
	 * variant.
	 */
	public static Condition script(Function<ScriptCondition.Builder, ObjectBuilder<ScriptCondition>> fn) {
		Condition.Builder builder = new Condition.Builder();
		builder.script(fn.apply(new ScriptCondition.Builder()).build());
		return builder.build();
	}

}
