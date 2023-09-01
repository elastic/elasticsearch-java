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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link InferenceConfig} variants.
 */
public class InferenceConfigBuilders {
	private InferenceConfigBuilders() {
	}

	/**
	 * Creates a builder for the {@link InferenceConfigRegression regression}
	 * {@code InferenceConfig} variant.
	 */
	public static InferenceConfigRegression.Builder regression() {
		return new InferenceConfigRegression.Builder();
	}

	/**
	 * Creates a InferenceConfig of the {@link InferenceConfigRegression regression}
	 * {@code InferenceConfig} variant.
	 */
	public static InferenceConfig regression(
			Function<InferenceConfigRegression.Builder, ObjectBuilder<InferenceConfigRegression>> fn) {
		InferenceConfig.Builder builder = new InferenceConfig.Builder();
		builder.regression(fn.apply(new InferenceConfigRegression.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link InferenceConfigClassification
	 * classification} {@code InferenceConfig} variant.
	 */
	public static InferenceConfigClassification.Builder classification() {
		return new InferenceConfigClassification.Builder();
	}

	/**
	 * Creates a InferenceConfig of the {@link InferenceConfigClassification
	 * classification} {@code InferenceConfig} variant.
	 */
	public static InferenceConfig classification(
			Function<InferenceConfigClassification.Builder, ObjectBuilder<InferenceConfigClassification>> fn) {
		InferenceConfig.Builder builder = new InferenceConfig.Builder();
		builder.classification(fn.apply(new InferenceConfigClassification.Builder()).build());
		return builder.build();
	}

}
