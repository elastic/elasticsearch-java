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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link FieldSuggester} variants.
 */
public class FieldSuggesterBuilders {
	private FieldSuggesterBuilders() {
	}

	/**
	 * Creates a builder for the {@link CompletionSuggester completion}
	 * {@code FieldSuggester} variant.
	 */
	public static CompletionSuggester.Builder completion() {
		return new CompletionSuggester.Builder();
	}

	/**
	 * Creates a FieldSuggester of the {@link CompletionSuggester completion}
	 * {@code FieldSuggester} variant.
	 */
	public static FieldSuggester completion(
			Function<CompletionSuggester.Builder, ObjectBuilder<CompletionSuggester>> fn) {
		FieldSuggester.Builder builder = new FieldSuggester.Builder();
		builder.completion(fn.apply(new CompletionSuggester.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PhraseSuggester phrase}
	 * {@code FieldSuggester} variant.
	 */
	public static PhraseSuggester.Builder phrase() {
		return new PhraseSuggester.Builder();
	}

	/**
	 * Creates a FieldSuggester of the {@link PhraseSuggester phrase}
	 * {@code FieldSuggester} variant.
	 */
	public static FieldSuggester phrase(Function<PhraseSuggester.Builder, ObjectBuilder<PhraseSuggester>> fn) {
		FieldSuggester.Builder builder = new FieldSuggester.Builder();
		builder.phrase(fn.apply(new PhraseSuggester.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermSuggester term} {@code FieldSuggester}
	 * variant.
	 */
	public static TermSuggester.Builder term() {
		return new TermSuggester.Builder();
	}

	/**
	 * Creates a FieldSuggester of the {@link TermSuggester term}
	 * {@code FieldSuggester} variant.
	 */
	public static FieldSuggester term(Function<TermSuggester.Builder, ObjectBuilder<TermSuggester>> fn) {
		FieldSuggester.Builder builder = new FieldSuggester.Builder();
		builder.term(fn.apply(new TermSuggester.Builder()).build());
		return builder.build();
	}

}
