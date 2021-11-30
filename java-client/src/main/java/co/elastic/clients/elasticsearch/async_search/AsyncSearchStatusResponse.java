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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: async_search.status.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/async_search/status/AsyncSearchStatusResponse.ts#L24-L29">API
 *      specification</a>
 */
@JsonpDeserializable
public class AsyncSearchStatusResponse<TDocument> extends AsyncSearchResponseBase {
	private final ShardStatistics shards;

	private final int completionStatus;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private AsyncSearchStatusResponse(Builder<TDocument> builder) {
		super(builder);

		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.completionStatus = ApiTypeHelper.requireNonNull(builder.completionStatus, this, "completionStatus");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> AsyncSearchStatusResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<AsyncSearchStatusResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code completion_status}
	 */
	public final int completionStatus() {
		return this.completionStatus;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("completion_status");
		generator.write(this.completionStatus);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AsyncSearchStatusResponse}.
	 */

	public static class Builder<TDocument> extends AsyncSearchResponseBase.AbstractBuilder<Builder<TDocument>>
			implements
				ObjectBuilder<AsyncSearchStatusResponse<TDocument>> {
		private ShardStatistics shards;

		private Integer completionStatus;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder<TDocument> shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder<TDocument> shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code completion_status}
		 */
		public final Builder<TDocument> completionStatus(int value) {
			this.completionStatus = value;
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
		 * Builds a {@link AsyncSearchStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AsyncSearchStatusResponse<TDocument> build() {
			_checkSingleUse();

			return new AsyncSearchStatusResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for AsyncSearchStatusResponse
	 */
	public static <TDocument> JsonpDeserializer<AsyncSearchStatusResponse<TDocument>> createAsyncSearchStatusResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> AsyncSearchStatusResponse.setupAsyncSearchStatusResponseDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link AsyncSearchStatusResponse} based on named
	 * deserializers provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<AsyncSearchStatusResponse<Object>> _DESERIALIZER = createAsyncSearchStatusResponseDeserializer(
			new NamedDeserializer<>("co.elastic.clients:Deserializer:async_search.status.TDocument"));

	protected static <TDocument> void setupAsyncSearchStatusResponseDeserializer(
			ObjectDeserializer<AsyncSearchStatusResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		AsyncSearchResponseBase.setupAsyncSearchResponseBaseDeserializer(op);
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::completionStatus, JsonpDeserializer.integerDeserializer(), "completion_status");

	}

}
