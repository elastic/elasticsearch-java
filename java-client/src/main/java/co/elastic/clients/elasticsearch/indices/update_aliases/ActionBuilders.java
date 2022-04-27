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

package co.elastic.clients.elasticsearch.indices.update_aliases;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link Action} variants.
 */
public class ActionBuilders {
	private ActionBuilders() {
	}

	/**
	 * Creates a builder for the {@link AddAction add} {@code Action} variant.
	 */
	public static AddAction.Builder add() {
		return new AddAction.Builder();
	}

	/**
	 * Creates a Action of the {@link AddAction add} {@code Action} variant.
	 */
	public static Action add(Function<AddAction.Builder, ObjectBuilder<AddAction>> fn) {
		Action.Builder builder = new Action.Builder();
		builder.add(fn.apply(new AddAction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RemoveAction remove} {@code Action} variant.
	 */
	public static RemoveAction.Builder remove() {
		return new RemoveAction.Builder();
	}

	/**
	 * Creates a Action of the {@link RemoveAction remove} {@code Action} variant.
	 */
	public static Action remove(Function<RemoveAction.Builder, ObjectBuilder<RemoveAction>> fn) {
		Action.Builder builder = new Action.Builder();
		builder.remove(fn.apply(new RemoveAction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RemoveIndexAction remove_index}
	 * {@code Action} variant.
	 */
	public static RemoveIndexAction.Builder removeIndex() {
		return new RemoveIndexAction.Builder();
	}

	/**
	 * Creates a Action of the {@link RemoveIndexAction remove_index} {@code Action}
	 * variant.
	 */
	public static Action removeIndex(Function<RemoveIndexAction.Builder, ObjectBuilder<RemoveIndexAction>> fn) {
		Action.Builder builder = new Action.Builder();
		builder.removeIndex(fn.apply(new RemoveIndexAction.Builder()).build());
		return builder.build();
	}

}
