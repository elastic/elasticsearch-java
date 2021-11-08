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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.knn_search.Response

public class KnnSearchResponse<TDocument> implements JsonpSerializable {
	private final long took;

	private final boolean timedOut;

	private final ShardStatistics shards;

	private final HitsMetadata<TDocument> hits;

	private final Map<String, JsonData> fields;

	@Nullable
	private final Double maxScore;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private KnnSearchResponse(Builder<TDocument> builder) {

		this.took = ModelTypeHelper.requireNonNull(builder.took, this, "took");
		this.timedOut = ModelTypeHelper.requireNonNull(builder.timedOut, this, "timedOut");
		this.shards = ModelTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.hits = ModelTypeHelper.requireNonNull(builder.hits, this, "hits");
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.maxScore = builder.maxScore;
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> KnnSearchResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<KnnSearchResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - Milliseconds it took Elasticsearch to execute the request.
	 * <p>
	 * API name: {@code took}
	 */
	public final long took() {
		return this.took;
	}

	/**
	 * Required - If true, the request timed out before completion; returned results
	 * may be partial or empty.
	 * <p>
	 * API name: {@code timed_out}
	 */
	public final boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * Required - Contains a count of shards used for the request.
	 * <p>
	 * API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - Contains returned documents and metadata.
	 * <p>
	 * API name: {@code hits}
	 */
	public final HitsMetadata<TDocument> hits() {
		return this.hits;
	}

	/**
	 * Contains field values for the documents. These fields must be specified in
	 * the request using the <code>fields</code> parameter.
	 * <p>
	 * API name: {@code fields}
	 */
	public final Map<String, JsonData> fields() {
		return this.fields;
	}

	/**
	 * Highest returned document score. This value is null for requests that do not
	 * sort by score.
	 * <p>
	 * API name: {@code max_score}
	 */
	@Nullable
	public final Double maxScore() {
		return this.maxScore;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("took");
		generator.write(this.took);

		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("hits");
		this.hits.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxScore != null) {
			generator.writeKey("max_score");
			generator.write(this.maxScore);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnSearchResponse}.
	 */
	public static class Builder<TDocument> extends ObjectBuilderBase
			implements
				ObjectBuilder<KnnSearchResponse<TDocument>> {
		private Long took;

		private Boolean timedOut;

		private ShardStatistics shards;

		private HitsMetadata<TDocument> hits;

		@Nullable
		private Map<String, JsonData> fields;

		@Nullable
		private Double maxScore;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - Milliseconds it took Elasticsearch to execute the request.
		 * <p>
		 * API name: {@code took}
		 */
		public final Builder<TDocument> took(long value) {
			this.took = value;
			return this;
		}

		/**
		 * Required - If true, the request timed out before completion; returned results
		 * may be partial or empty.
		 * <p>
		 * API name: {@code timed_out}
		 */
		public final Builder<TDocument> timedOut(boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * Required - Contains a count of shards used for the request.
		 * <p>
		 * API name: {@code _shards}
		 */
		public final Builder<TDocument> shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - Contains a count of shards used for the request.
		 * <p>
		 * API name: {@code _shards}
		 */
		public final Builder<TDocument> shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Required - Contains returned documents and metadata.
		 * <p>
		 * API name: {@code hits}
		 */
		public final Builder<TDocument> hits(HitsMetadata<TDocument> value) {
			this.hits = value;
			return this;
		}

		/**
		 * Required - Contains returned documents and metadata.
		 * <p>
		 * API name: {@code hits}
		 */
		public final Builder<TDocument> hits(
				Function<HitsMetadata.Builder<TDocument>, ObjectBuilder<HitsMetadata<TDocument>>> fn) {
			return this.hits(fn.apply(new HitsMetadata.Builder<TDocument>()).build());
		}

		/**
		 * Contains field values for the documents. These fields must be specified in
		 * the request using the <code>fields</code> parameter.
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder<TDocument> fields(@Nullable Map<String, JsonData> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Highest returned document score. This value is null for requests that do not
		 * sort by score.
		 * <p>
		 * API name: {@code max_score}
		 */
		public final Builder<TDocument> maxScore(@Nullable Double value) {
			this.maxScore = value;
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

		/**
		 * Builds a {@link KnnSearchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnSearchResponse<TDocument> build() {
			_checkSingleUse();

			return new KnnSearchResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for KnnSearchResponse
	 */
	public static <TDocument> JsonpDeserializer<KnnSearchResponse<TDocument>> createKnnSearchResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> KnnSearchResponse.setupKnnSearchResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupKnnSearchResponseDeserializer(
			DelegatingDeserializer<KnnSearchResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::hits, HitsMetadata.createHitsMetadataDeserializer(tDocumentDeserializer), "hits");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "fields");
		op.add(Builder::maxScore, JsonpDeserializer.doubleDeserializer(), "max_score");

	}

}
