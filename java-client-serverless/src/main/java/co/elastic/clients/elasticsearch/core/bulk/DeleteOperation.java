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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _global.bulk.DeleteOperation

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.bulk.DeleteOperation">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeleteOperation extends BulkOperationBase implements BulkOperationVariant {
	// ---------------------------------------------------------------------------------------------

	private DeleteOperation(Builder builder) {
		super(builder);

	}

	public static DeleteOperation of(Function<Builder, ObjectBuilder<DeleteOperation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * BulkOperation variant kind.
	 */
	@Override
	public BulkOperation.Kind _bulkOperationKind() {
		return BulkOperation.Kind.Delete;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteOperation}.
	 */

	public static class Builder extends BulkOperationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteOperation> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteOperation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteOperation build() {
			_checkSingleUse();

			return new DeleteOperation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteOperation}
	 */
	public static final JsonpDeserializer<DeleteOperation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DeleteOperation::setupDeleteOperationDeserializer);

	protected static void setupDeleteOperationDeserializer(ObjectDeserializer<DeleteOperation.Builder> op) {
		BulkOperationBase.setupBulkOperationBaseDeserializer(op);

	}

}
