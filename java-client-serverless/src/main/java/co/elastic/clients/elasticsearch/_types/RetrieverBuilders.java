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

package co.elastic.clients.elasticsearch._types;

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
 * Builders for {@link Retriever} variants.
 */
public class RetrieverBuilders {
	private RetrieverBuilders() {
	}

	/**
	 * Creates a builder for the {@link StandardRetriever standard}
	 * {@code Retriever} variant.
	 */
	public static StandardRetriever.Builder standard() {
		return new StandardRetriever.Builder();
	}

	/**
	 * Creates a Retriever of the {@link StandardRetriever standard}
	 * {@code Retriever} variant.
	 */
	public static Retriever standard(Function<StandardRetriever.Builder, ObjectBuilder<StandardRetriever>> fn) {
		Retriever.Builder builder = new Retriever.Builder();
		builder.standard(fn.apply(new StandardRetriever.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KnnRetriever knn} {@code Retriever} variant.
	 */
	public static KnnRetriever.Builder knn() {
		return new KnnRetriever.Builder();
	}

	/**
	 * Creates a Retriever of the {@link KnnRetriever knn} {@code Retriever}
	 * variant.
	 */
	public static Retriever knn(Function<KnnRetriever.Builder, ObjectBuilder<KnnRetriever>> fn) {
		Retriever.Builder builder = new Retriever.Builder();
		builder.knn(fn.apply(new KnnRetriever.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RRFRetriever rrf} {@code Retriever} variant.
	 */
	public static RRFRetriever.Builder rrf() {
		return new RRFRetriever.Builder();
	}

	/**
	 * Creates a Retriever of the {@link RRFRetriever rrf} {@code Retriever}
	 * variant.
	 */
	public static Retriever rrf(Function<RRFRetriever.Builder, ObjectBuilder<RRFRetriever>> fn) {
		Retriever.Builder builder = new Retriever.Builder();
		builder.rrf(fn.apply(new RRFRetriever.Builder()).build());
		return builder.build();
	}

}
