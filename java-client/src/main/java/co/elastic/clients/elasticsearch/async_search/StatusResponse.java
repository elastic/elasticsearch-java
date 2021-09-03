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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: async_search.status.Response
public final class StatusResponse<TDocument> extends AsyncSearchResponseBase {
	private final ShardStatistics shards;

	private final Number completionStatus;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	protected StatusResponse(Builder<TDocument> builder) {
		super(builder);
		this.shards = Objects.requireNonNull(builder.shards, "_shards");
		this.completionStatus = Objects.requireNonNull(builder.completionStatus, "completion_status");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * API name: {@code completion_status}
	 */
	public Number completionStatus() {
		return this.completionStatus;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("_shards");
		this.shards.toJsonp(generator, mapper);

		generator.writeKey("completion_status");
		generator.write(this.completionStatus.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatusResponse}.
	 */
	public static class Builder<TDocument> extends AsyncSearchResponseBase.AbstractBuilder<Builder<TDocument>>
			implements
				ObjectBuilder<StatusResponse<TDocument>> {
		private ShardStatistics shards;

		private Number completionStatus;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * API name: {@code _shards}
		 */
		public Builder<TDocument> shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder<TDocument> shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code completion_status}
		 */
		public Builder<TDocument> completionStatus(Number value) {
			this.completionStatus = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link StatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatusResponse<TDocument> build() {

			return new StatusResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for StatusResponse
	 */
	public static <TDocument> JsonpDeserializer<StatusResponse<TDocument>> createStatusResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> StatusResponse.setupStatusResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupStatusResponseDeserializer(
			DelegatingDeserializer<StatusResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		AsyncSearchResponseBase.setupAsyncSearchResponseBaseDeserializer(op);
		op.add(Builder::shards, ShardStatistics.DESERIALIZER, "_shards");
		op.add(Builder::completionStatus, JsonpDeserializer.numberDeserializer(), "completion_status");

	}

}
