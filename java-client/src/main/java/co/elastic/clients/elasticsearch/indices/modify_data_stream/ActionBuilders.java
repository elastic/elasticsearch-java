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

package co.elastic.clients.elasticsearch.indices.modify_data_stream;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link Action} variants.
 */
public class ActionBuilders {
	private ActionBuilders() {
	}

	/**
	 * Creates a builder for the {@link IndexAndDataStreamAction add_backing_index}
	 * {@code Action} variant.
	 */
	public static IndexAndDataStreamAction.Builder addBackingIndex() {
		return new IndexAndDataStreamAction.Builder();
	}

	/**
	 * Creates a Action of the {@link IndexAndDataStreamAction add_backing_index}
	 * {@code Action} variant.
	 */
	public static Action addBackingIndex(
			Function<IndexAndDataStreamAction.Builder, ObjectBuilder<IndexAndDataStreamAction>> fn) {
		Action.Builder builder = new Action.Builder();
		builder.addBackingIndex(fn.apply(new IndexAndDataStreamAction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IndexAndDataStreamAction
	 * remove_backing_index} {@code Action} variant.
	 */
	public static IndexAndDataStreamAction.Builder removeBackingIndex() {
		return new IndexAndDataStreamAction.Builder();
	}

	/**
	 * Creates a Action of the {@link IndexAndDataStreamAction remove_backing_index}
	 * {@code Action} variant.
	 */
	public static Action removeBackingIndex(
			Function<IndexAndDataStreamAction.Builder, ObjectBuilder<IndexAndDataStreamAction>> fn) {
		Action.Builder builder = new Action.Builder();
		builder.removeBackingIndex(fn.apply(new IndexAndDataStreamAction.Builder()).build());
		return builder.build();
	}

}
