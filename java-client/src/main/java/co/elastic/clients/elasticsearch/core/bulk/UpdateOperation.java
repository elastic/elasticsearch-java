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

package co.elastic.clients.elasticsearch.core.bulk;

import co.elastic.clients.elasticsearch.core.search.SourceConfig;
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
import java.lang.String;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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
	private final String pipeline;

	@Nullable
	private final Boolean listExecutedPipelines;

	@Nullable
	private final SourceConfig source;

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
		this.pipeline = builder.pipeline;
		this.listExecutedPipelines = builder.listExecutedPipelines;
		this.source = builder.source;
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
	 * If <code>true</code>, the request's actions must target an index alias.
	 * <p>
	 * API name: {@code require_alias}
	 */
	@Nullable
	public final Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * The number of times an update should be retried in the case of a version
	 * conflict.
	 * <p>
	 * API name: {@code retry_on_conflict}
	 */
	@Nullable
	public final Integer retryOnConflict() {
		return this.retryOnConflict;
	}

	/**
	 * The ID of the pipeline to use to preprocess the <code>upsert</code> document,
	 * if one is created. If the index has a default ingest pipeline specified,
	 * setting the value to <code>_none</code> turns off the default ingest pipeline
	 * for this request. If a final pipeline is configured, it will always run
	 * regardless of the value of this parameter.
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
	}

	/**
	 * If <code>true</code>, the response includes the ingest pipelines that were
	 * run for the <code>upsert</code> document, if one is created.
	 * <p>
	 * API name: {@code list_executed_pipelines}
	 */
	@Nullable
	public final Boolean listExecutedPipelines() {
		return this.listExecutedPipelines;
	}

	/**
	 * If <code>false</code>, source retrieval is turned off. You can also specify a
	 * comma-separated list of the fields you want to retrieve. If set, it overrides
	 * the <code>_source</code> value in the update source line.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceConfig source() {
		return this.source;
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
		if (this.pipeline != null) {
			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}
		if (this.listExecutedPipelines != null) {
			generator.writeKey("list_executed_pipelines");
			generator.write(this.listExecutedPipelines);

		}
		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

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
		private String pipeline;

		@Nullable
		private Boolean listExecutedPipelines;

		@Nullable
		private SourceConfig source;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		@Nullable
		private JsonpSerializer<TPartialDocument> tPartialDocumentSerializer;

		public Builder() {
		}
		private Builder(UpdateOperation<TDocument, TPartialDocument> instance) {
			super(instance);
			this.requireAlias = instance.requireAlias;
			this.retryOnConflict = instance.retryOnConflict;
			this.pipeline = instance.pipeline;
			this.listExecutedPipelines = instance.listExecutedPipelines;
			this.source = instance.source;
			this.tDocumentSerializer = instance.tDocumentSerializer;
			this.tPartialDocumentSerializer = instance.tPartialDocumentSerializer;
			this.action = instance.action;
			this.binaryAction = instance.binaryAction;

		}
		/**
		 * If <code>true</code>, the request's actions must target an index alias.
		 * <p>
		 * API name: {@code require_alias}
		 */
		public final Builder<TDocument, TPartialDocument> requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * The number of times an update should be retried in the case of a version
		 * conflict.
		 * <p>
		 * API name: {@code retry_on_conflict}
		 */
		public final Builder<TDocument, TPartialDocument> retryOnConflict(@Nullable Integer value) {
			this.retryOnConflict = value;
			return this;
		}

		/**
		 * The ID of the pipeline to use to preprocess the <code>upsert</code> document,
		 * if one is created. If the index has a default ingest pipeline specified,
		 * setting the value to <code>_none</code> turns off the default ingest pipeline
		 * for this request. If a final pipeline is configured, it will always run
		 * regardless of the value of this parameter.
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final Builder<TDocument, TPartialDocument> pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes the ingest pipelines that were
		 * run for the <code>upsert</code> document, if one is created.
		 * <p>
		 * API name: {@code list_executed_pipelines}
		 */
		public final Builder<TDocument, TPartialDocument> listExecutedPipelines(@Nullable Boolean value) {
			this.listExecutedPipelines = value;
			return this;
		}

		/**
		 * If <code>false</code>, source retrieval is turned off. You can also specify a
		 * comma-separated list of the fields you want to retrieve. If set, it overrides
		 * the <code>_source</code> value in the update source line.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder<TDocument, TPartialDocument> source(@Nullable SourceConfig value) {
			this.source = value;
			return this;
		}

		/**
		 * If <code>false</code>, source retrieval is turned off. You can also specify a
		 * comma-separated list of the fields you want to retrieve. If set, it overrides
		 * the <code>_source</code> value in the update source line.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder<TDocument, TPartialDocument> source(
				Function<SourceConfig.Builder, ObjectBuilder<SourceConfig>> fn) {
			return this.source(fn.apply(new SourceConfig.Builder()).build());
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

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
}
