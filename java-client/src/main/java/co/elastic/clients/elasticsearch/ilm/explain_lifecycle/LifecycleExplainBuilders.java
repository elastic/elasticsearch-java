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

package co.elastic.clients.elasticsearch.ilm.explain_lifecycle;

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
 * Builders for {@link LifecycleExplain} variants.
 */
public class LifecycleExplainBuilders {
	private LifecycleExplainBuilders() {
	}

	/**
	 * Creates a builder for the {@link LifecycleExplainManaged true}
	 * {@code LifecycleExplain} variant.
	 */
	public static LifecycleExplainManaged.Builder true_() {
		return new LifecycleExplainManaged.Builder();
	}

	/**
	 * Creates a LifecycleExplain of the {@link LifecycleExplainManaged true}
	 * {@code LifecycleExplain} variant.
	 */
	public static LifecycleExplain true_(
			Function<LifecycleExplainManaged.Builder, ObjectBuilder<LifecycleExplainManaged>> fn) {
		LifecycleExplain.Builder builder = new LifecycleExplain.Builder();
		builder.true_(fn.apply(new LifecycleExplainManaged.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LifecycleExplainUnmanaged false}
	 * {@code LifecycleExplain} variant.
	 */
	public static LifecycleExplainUnmanaged.Builder false_() {
		return new LifecycleExplainUnmanaged.Builder();
	}

	/**
	 * Creates a LifecycleExplain of the {@link LifecycleExplainUnmanaged false}
	 * {@code LifecycleExplain} variant.
	 */
	public static LifecycleExplain false_(
			Function<LifecycleExplainUnmanaged.Builder, ObjectBuilder<LifecycleExplainUnmanaged>> fn) {
		LifecycleExplain.Builder builder = new LifecycleExplain.Builder();
		builder.false_(fn.apply(new LifecycleExplainUnmanaged.Builder()).build());
		return builder.build();
	}

}
