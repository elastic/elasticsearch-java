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
	 * Creates a builder for the {@link ArrayCompareCondition array_compare}
	 * {@code Condition} variant.
	 */
	public static ArrayCompareCondition.Builder arrayCompare() {
		return new ArrayCompareCondition.Builder();
	}

	/**
	 * Creates a builder for the {@link CompareCondition compare} {@code Condition}
	 * variant.
	 */
	public static CompareCondition.Builder compare() {
		return new CompareCondition.Builder();
	}

	/**
	 * Creates a builder for the {@link NeverCondition never} {@code Condition}
	 * variant.
	 */
	public static NeverCondition.Builder never() {
		return new NeverCondition.Builder();
	}

	/**
	 * Creates a builder for the {@link ScriptCondition script} {@code Condition}
	 * variant.
	 */
	public static ScriptCondition.Builder script() {
		return new ScriptCondition.Builder();
	}

}
