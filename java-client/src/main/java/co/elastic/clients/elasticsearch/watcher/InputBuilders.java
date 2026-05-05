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
import java.lang.String;
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
 * Builders for {@link Input} variants.
 * <p>
 * Variants <code>simple</code> are not available here as they don't have a
 * dedicated class. Use {@link Input}'s builder for these.
 * 
 */
public class InputBuilders {
	private InputBuilders() {
	}

	/**
	 * Creates a builder for the {@link ChainInput chain} {@code Input} variant.
	 */
	public static ChainInput.Builder chain() {
		return new ChainInput.Builder();
	}

	/**
	 * Creates a Input of the {@link ChainInput chain} {@code Input} variant.
	 */
	public static Input chain(Function<ChainInput.Builder, ObjectBuilder<ChainInput>> fn) {
		Input.Builder builder = new Input.Builder();
		builder.chain(fn.apply(new ChainInput.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HttpInput http} {@code Input} variant.
	 */
	public static HttpInput.Builder http() {
		return new HttpInput.Builder();
	}

	/**
	 * Creates a Input of the {@link HttpInput http} {@code Input} variant.
	 */
	public static Input http(Function<HttpInput.Builder, ObjectBuilder<HttpInput>> fn) {
		Input.Builder builder = new Input.Builder();
		builder.http(fn.apply(new HttpInput.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SearchInput search} {@code Input} variant.
	 */
	public static SearchInput.Builder search() {
		return new SearchInput.Builder();
	}

	/**
	 * Creates a Input of the {@link SearchInput search} {@code Input} variant.
	 */
	public static Input search(Function<SearchInput.Builder, ObjectBuilder<SearchInput>> fn) {
		Input.Builder builder = new Input.Builder();
		builder.search(fn.apply(new SearchInput.Builder()).build());
		return builder.build();
	}

}
