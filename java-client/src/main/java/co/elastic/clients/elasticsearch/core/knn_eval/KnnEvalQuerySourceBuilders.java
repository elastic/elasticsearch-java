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

package co.elastic.clients.elasticsearch.core.knn_eval;

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
 * Builders for {@link KnnEvalQuerySource} variants.
 */
public class KnnEvalQuerySourceBuilders {
	private KnnEvalQuerySourceBuilders() {
	}

	/**
	 * Creates a builder for the {@link KnnEvalDocsQuerySource docs}
	 * {@code KnnEvalQuerySource} variant.
	 */
	public static KnnEvalDocsQuerySource.Builder docs() {
		return new KnnEvalDocsQuerySource.Builder();
	}

	/**
	 * Creates a KnnEvalQuerySource of the {@link KnnEvalDocsQuerySource docs}
	 * {@code KnnEvalQuerySource} variant.
	 */
	public static KnnEvalQuerySource docs(
			Function<KnnEvalDocsQuerySource.Builder, ObjectBuilder<KnnEvalDocsQuerySource>> fn) {
		KnnEvalQuerySource.Builder builder = new KnnEvalQuerySource.Builder();
		builder.docs(fn.apply(new KnnEvalDocsQuerySource.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KnnEvalVectorsQuerySource vectors}
	 * {@code KnnEvalQuerySource} variant.
	 */
	public static KnnEvalVectorsQuerySource.Builder vectors() {
		return new KnnEvalVectorsQuerySource.Builder();
	}

	/**
	 * Creates a KnnEvalQuerySource of the {@link KnnEvalVectorsQuerySource vectors}
	 * {@code KnnEvalQuerySource} variant.
	 */
	public static KnnEvalQuerySource vectors(
			Function<KnnEvalVectorsQuerySource.Builder, ObjectBuilder<KnnEvalVectorsQuerySource>> fn) {
		KnnEvalQuerySource.Builder builder = new KnnEvalQuerySource.Builder();
		builder.vectors(fn.apply(new KnnEvalVectorsQuerySource.Builder()).build());
		return builder.build();
	}

}
