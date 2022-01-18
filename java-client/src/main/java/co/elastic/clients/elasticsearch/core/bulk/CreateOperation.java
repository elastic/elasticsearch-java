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
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.NdJsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.bulk.CreateOperation

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.bulk.CreateOperation">API
 *      specification</a>
 */

public class CreateOperation<TDocument> extends WriteOperation implements NdJsonpSerializable, BulkOperationVariant {
	private final TDocument document;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private CreateOperation(Builder<TDocument> builder) {
		super(builder);
		this.document = ApiTypeHelper.requireNonNull(builder.document, this, "document");

		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> CreateOperation<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<CreateOperation<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * BulkOperation variant kind.
	 */
	@Override
	public BulkOperation.Kind _bulkOperationKind() {
		return BulkOperation.Kind.Create;
	}

	/**
	 * Required - API name: {@code document}
	 */
	public final TDocument document() {
		return this.document;
	}

	@Override
	public Iterator<?> _serializables() {
		return Arrays.asList(this, this.document).iterator();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateOperation}.
	 */

	public static class Builder<TDocument> extends WriteOperation.AbstractBuilder<Builder<TDocument>>
			implements
				ObjectBuilder<CreateOperation<TDocument>> {
		private TDocument document;

		/**
		 * Required - API name: {@code document}
		 */
		public final Builder<TDocument> document(TDocument value) {
			this.document = value;
			return this;
		}

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link CreateOperation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateOperation<TDocument> build() {
			_checkSingleUse();

			return new CreateOperation<TDocument>(this);
		}
	}

}
