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

import co.elastic.clients.elasticsearch._types.Script;
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
 * Builders for {@link MultiTermLookup} variants.
 * <p>
 * Variants <code>field</code> are not available here as they don't have a
 * dedicated class. Use {@link MultiTermLookup}'s builder for these.
 * 
 */
public class MultiTermLookupBuilders {
	private MultiTermLookupBuilders() {
	}

	/**
	 * Creates a builder for the {@link Script script} {@code MultiTermLookup}
	 * variant.
	 */
	public static Script.Builder script() {
		return new Script.Builder();
	}

	/**
	 * Creates a MultiTermLookup of the {@link Script script}
	 * {@code MultiTermLookup} variant.
	 */
	public static MultiTermLookup script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
		MultiTermLookup.Builder builder = new MultiTermLookup.Builder();
		builder.script(fn.apply(new Script.Builder()).build());
		return builder.build();
	}

}
