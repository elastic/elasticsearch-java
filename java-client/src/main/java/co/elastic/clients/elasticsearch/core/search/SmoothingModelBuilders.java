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
 * Builders for {@link SmoothingModel} variants.
 */
public class SmoothingModelBuilders {
	private SmoothingModelBuilders() {
	}

	/**
	 * Creates a builder for the {@link LaplaceSmoothingModel laplace}
	 * {@code SmoothingModel} variant.
	 */
	public static LaplaceSmoothingModel.Builder laplace() {
		return new LaplaceSmoothingModel.Builder();
	}

	/**
	 * Creates a SmoothingModel of the {@link LaplaceSmoothingModel laplace}
	 * {@code SmoothingModel} variant.
	 */
	public static SmoothingModel laplace(
			Function<LaplaceSmoothingModel.Builder, ObjectBuilder<LaplaceSmoothingModel>> fn) {
		SmoothingModel.Builder builder = new SmoothingModel.Builder();
		builder.laplace(fn.apply(new LaplaceSmoothingModel.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LinearInterpolationSmoothingModel
	 * linear_interpolation} {@code SmoothingModel} variant.
	 */
	public static LinearInterpolationSmoothingModel.Builder linearInterpolation() {
		return new LinearInterpolationSmoothingModel.Builder();
	}

	/**
	 * Creates a SmoothingModel of the {@link LinearInterpolationSmoothingModel
	 * linear_interpolation} {@code SmoothingModel} variant.
	 */
	public static SmoothingModel linearInterpolation(
			Function<LinearInterpolationSmoothingModel.Builder, ObjectBuilder<LinearInterpolationSmoothingModel>> fn) {
		SmoothingModel.Builder builder = new SmoothingModel.Builder();
		builder.linearInterpolation(fn.apply(new LinearInterpolationSmoothingModel.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StupidBackoffSmoothingModel stupid_backoff}
	 * {@code SmoothingModel} variant.
	 */
	public static StupidBackoffSmoothingModel.Builder stupidBackoff() {
		return new StupidBackoffSmoothingModel.Builder();
	}

	/**
	 * Creates a SmoothingModel of the {@link StupidBackoffSmoothingModel
	 * stupid_backoff} {@code SmoothingModel} variant.
	 */
	public static SmoothingModel stupidBackoff(
			Function<StupidBackoffSmoothingModel.Builder, ObjectBuilder<StupidBackoffSmoothingModel>> fn) {
		SmoothingModel.Builder builder = new SmoothingModel.Builder();
		builder.stupidBackoff(fn.apply(new StupidBackoffSmoothingModel.Builder()).build());
		return builder.build();
	}

}
