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

package co.elastic.clients.elasticsearch._types.mapping;

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
 * Builders for {@link DynamicTemplate} variants.
 */
public class DynamicTemplateBuilders {
	private DynamicTemplateBuilders() {
	}

	/**
	 * Creates a builder for the {@link Property mapping} {@code DynamicTemplate}
	 * variant.
	 */
	public static Property.Builder mapping() {
		return new Property.Builder();
	}

	/**
	 * Creates a DynamicTemplate of the {@link Property mapping}
	 * {@code DynamicTemplate} variant.
	 */
	public static DynamicTemplate mapping(Function<Property.Builder, ObjectBuilder<Property>> fn) {
		DynamicTemplate.Builder builder = new DynamicTemplate.Builder();
		builder.mapping(fn.apply(new Property.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Property runtime} {@code DynamicTemplate}
	 * variant.
	 */
	public static Property.Builder runtime() {
		return new Property.Builder();
	}

	/**
	 * Creates a DynamicTemplate of the {@link Property runtime}
	 * {@code DynamicTemplate} variant.
	 */
	public static DynamicTemplate runtime(Function<Property.Builder, ObjectBuilder<Property>> fn) {
		DynamicTemplate.Builder builder = new DynamicTemplate.Builder();
		builder.runtime(fn.apply(new Property.Builder()).build());
		return builder.build();
	}

}
