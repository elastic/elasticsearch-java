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
import co.elastic.clients.util.ModelTypeHelper;
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

public class UpdateOperation<TDocument> extends OperationBase implements NdJsonpSerializable, OperationVariant {
	private final TDocument document;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final Integer retryOnConflict;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private UpdateOperation(Builder<TDocument> builder) {
		super(builder);
		this.document = ModelTypeHelper.requireNonNull(builder.document, this, "document");

		this.requireAlias = builder.requireAlias;
		this.retryOnConflict = builder.retryOnConflict;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> UpdateOperation<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<UpdateOperation<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * {@link Operation} variant type
	 */
	@Override
	public String _variantType() {
		return "update";
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
	public static class Builder<TDocument> extends OperationBase.AbstractBuilder<Builder<TDocument>>
			implements
				ObjectBuilder<UpdateOperation<TDocument>> {
		private TDocument document;

		/**
		 * Required - API name: {@code document}
		 */
		public final Builder<TDocument> document(TDocument value) {
			this.document = value;
			return this;
		}

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private Integer retryOnConflict;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code require_alias}
		 */
		public final Builder<TDocument> requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * API name: {@code retry_on_conflict}
		 */
		public final Builder<TDocument> retryOnConflict(@Nullable Integer value) {
			this.retryOnConflict = value;
			return this;
		}

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
		 * Builds a {@link UpdateOperation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateOperation<TDocument> build() {
			_checkSingleUse();

			return new UpdateOperation<TDocument>(this);
		}
	}

}
