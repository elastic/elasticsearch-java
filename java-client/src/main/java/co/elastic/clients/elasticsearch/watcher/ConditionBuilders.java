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

package co.elastic.clients.elasticsearch.watcher;

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
 * Builders for {@link Condition} variants.
 * <p>
 * Variants <code>array_compare</code>, <code>compare</code> are not available
 * here as they don't have a dedicated class. Use {@link Condition}'s builder
 * for these.
 * 
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
