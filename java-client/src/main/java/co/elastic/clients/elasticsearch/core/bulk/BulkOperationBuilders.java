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

package co.elastic.clients.elasticsearch.core.bulk;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link BulkOperation} variants.
 */
public class BulkOperationBuilders {
	private BulkOperationBuilders() {
	}

	/**
	 * Creates a builder for the {@link IndexOperation index} {@code BulkOperation}
	 * variant.
	 */
	public static IndexOperation.Builder index() {
		return new IndexOperation.Builder();
	}

	/**
	 * Creates a BulkOperation of the {@link IndexOperation index}
	 * {@code BulkOperation} variant.
	 */
	public static BulkOperation index(Function<IndexOperation.Builder, ObjectBuilder<IndexOperation>> fn) {
		BulkOperation.Builder builder = new BulkOperation.Builder();
		builder.index(fn.apply(new IndexOperation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CreateOperation create}
	 * {@code BulkOperation} variant.
	 */
	public static CreateOperation.Builder create() {
		return new CreateOperation.Builder();
	}

	/**
	 * Creates a BulkOperation of the {@link CreateOperation create}
	 * {@code BulkOperation} variant.
	 */
	public static BulkOperation create(Function<CreateOperation.Builder, ObjectBuilder<CreateOperation>> fn) {
		BulkOperation.Builder builder = new BulkOperation.Builder();
		builder.create(fn.apply(new CreateOperation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UpdateOperation update}
	 * {@code BulkOperation} variant.
	 */
	public static UpdateOperation.Builder update() {
		return new UpdateOperation.Builder();
	}

	/**
	 * Creates a BulkOperation of the {@link UpdateOperation update}
	 * {@code BulkOperation} variant.
	 */
	public static BulkOperation update(Function<UpdateOperation.Builder, ObjectBuilder<UpdateOperation>> fn) {
		BulkOperation.Builder builder = new BulkOperation.Builder();
		builder.update(fn.apply(new UpdateOperation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DeleteOperation delete}
	 * {@code BulkOperation} variant.
	 */
	public static DeleteOperation.Builder delete() {
		return new DeleteOperation.Builder();
	}

	/**
	 * Creates a BulkOperation of the {@link DeleteOperation delete}
	 * {@code BulkOperation} variant.
	 */
	public static BulkOperation delete(Function<DeleteOperation.Builder, ObjectBuilder<DeleteOperation>> fn) {
		BulkOperation.Builder builder = new BulkOperation.Builder();
		builder.delete(fn.apply(new DeleteOperation.Builder()).build());
		return builder.build();
	}

}
