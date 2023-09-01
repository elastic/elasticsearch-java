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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.NdJsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.BinaryData;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.bulk.UpdateOperation

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.bulk.UpdateOperation">API
 *      specification</a>
 */

public class UpdateOperation<TDocument, TPartialDocument> extends BulkOperationBase
		implements
			NdJsonpSerializable,
			BulkOperationVariant {
	@Nullable
	private final UpdateAction<TDocument, TPartialDocument> action;

	@Nullable
	private final BinaryData binaryAction;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final Integer retryOnConflict;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	@Nullable
	private final JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private UpdateOperation(Builder<TDocument, TPartialDocument> builder) {
		super(builder);
		this.action = builder.action;
		this.binaryAction = builder.binaryAction;

		this.requireAlias = builder.requireAlias;
		this.retryOnConflict = builder.retryOnConflict;
		this.tDocumentSerializer = builder.tDocumentSerializer;
		this.tPartialDocumentSerializer = builder.tPartialDocumentSerializer;

	}

	public static <TDocument, TPartialDocument> UpdateOperation<TDocument, TPartialDocument> of(
			Function<Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateOperation<TDocument, TPartialDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * BulkOperation variant kind.
	 */
	@Override
	public BulkOperation.Kind _bulkOperationKind() {
		return BulkOperation.Kind.Update;
	}

	/**
	 * Update action
	 * <p>
	 * API name: {@code action}
	 */
	@Nullable
	public final UpdateAction<TDocument, TPartialDocument> action() {
		return this.action;
	}

	/**
	 * Serialized representation of the update action. You should use
	 * <code>action</code> instead. This binary representation is used by the
	 * <code>BulkIngester</code> helper to compute the binary size of bulk requests.
	 * <p>
	 * API name: {@code binary_action}
	 */
	@Nullable
	public final BinaryData binaryAction() {
		return this.binaryAction;
	}

	@Override
	public Iterator<?> _serializables() {
		return Arrays.asList(this, this.action, this.binaryAction).iterator();
	}

	/**
	 * API name: {@code require_alias}
	 */
	@Nullable
	public final Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * API name: {@code retry_on_conflict}
	 */
	@Nullable
	public final Integer retryOnConflict() {
		return this.retryOnConflict;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.requireAlias != null) {
			generator.writeKey("require_alias");
			generator.write(this.requireAlias);

		}
		if (this.retryOnConflict != null) {
			generator.writeKey("retry_on_conflict");
			generator.write(this.retryOnConflict);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateOperation}.
	 */

	public static class Builder<TDocument, TPartialDocument>
			extends
				BulkOperationBase.AbstractBuilder<Builder<TDocument, TPartialDocument>>
			implements
				ObjectBuilder<UpdateOperation<TDocument, TPartialDocument>> {
		@Nullable
		private UpdateAction<TDocument, TPartialDocument> action;

		@Nullable
		private BinaryData binaryAction;

		/**
		 * Update action
		 * <p>
		 * API name: {@code action}
		 */
		public final Builder<TDocument, TPartialDocument> action(
				@Nullable UpdateAction<TDocument, TPartialDocument> value) {
			this.action = value;
			return this;
		}

		/**
		 * Update action
		 * <p>
		 * API name: {@code action}
		 */
		public final Builder<TDocument, TPartialDocument> action(
				Function<UpdateAction.Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateAction<TDocument, TPartialDocument>>> fn) {
			return this.action(fn.apply(new UpdateAction.Builder<TDocument, TPartialDocument>()).build());
		}

		/**
		 * Serialized representation of the update action. You should use
		 * <code>action</code> instead. This binary representation is used by the
		 * <code>BulkIngester</code> helper to compute the binary size of bulk requests.
		 * <p>
		 * API name: {@code binary_action}
		 */
		public final Builder<TDocument, TPartialDocument> binaryAction(@Nullable BinaryData value) {
			this.binaryAction = value;
			return this;
		}

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private Integer retryOnConflict;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		@Nullable
		private JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

		/**
		 * API name: {@code require_alias}
		 */
		public final Builder<TDocument, TPartialDocument> requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * API name: {@code retry_on_conflict}
		 */
		public final Builder<TDocument, TPartialDocument> retryOnConflict(@Nullable Integer value) {
			this.retryOnConflict = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument, TPartialDocument> tDocumentSerializer(
				@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Serializer for TPartialDocument. If not set, an attempt will be made to find
		 * a serializer from the JSON context.
		 */
		public final Builder<TDocument, TPartialDocument> tPartialDocumentSerializer(
				@Nullable JsonpSerializer<TPartialDocument> value) {
			this.tPartialDocumentSerializer = value;
			return this;
		}

		@Override
		protected Builder<TDocument, TPartialDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateOperation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateOperation<TDocument, TPartialDocument> build() {
			_checkSingleUse();

			return new UpdateOperation<TDocument, TPartialDocument>(this);
		}
	}

}
