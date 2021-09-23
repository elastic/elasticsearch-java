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

package co.elastic.clients.elasticsearch._core.rank_eval;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalMetricDetail
public final class RankEvalMetricDetail implements JsonpSerializable {
	private final Number metricScore;

	private final List<UnratedDocument> unratedDocs;

	private final List<RankEvalHitItem> hits;

	private final Map<String, Map<String, JsonData>> metricDetails;

	// ---------------------------------------------------------------------------------------------

	public RankEvalMetricDetail(Builder builder) {

		this.metricScore = Objects.requireNonNull(builder.metricScore, "metric_score");
		this.unratedDocs = Objects.requireNonNull(builder.unratedDocs, "unrated_docs");
		this.hits = Objects.requireNonNull(builder.hits, "hits");
		this.metricDetails = Objects.requireNonNull(builder.metricDetails, "metric_details");

	}

	/**
	 * The metric_score in the details section shows the contribution of this query
	 * to the global quality metric score
	 * <p>
	 * API name: {@code metric_score}
	 */
	public Number metricScore() {
		return this.metricScore;
	}

	/**
	 * The unrated_docs section contains an _index and _id entry for each document
	 * in the search result for this query that didn’t have a ratings value. This
	 * can be used to ask the user to supply ratings for these documents
	 * <p>
	 * API name: {@code unrated_docs}
	 */
	public List<UnratedDocument> unratedDocs() {
		return this.unratedDocs;
	}

	/**
	 * The hits section shows a grouping of the search results with their supplied
	 * ratings
	 * <p>
	 * API name: {@code hits}
	 */
	public List<RankEvalHitItem> hits() {
		return this.hits;
	}

	/**
	 * The metric_details give additional information about the calculated quality
	 * metric (e.g. how many of the retrieved documents were relevant). The content
	 * varies for each metric but allows for better interpretation of the results
	 * <p>
	 * API name: {@code metric_details}
	 */
	public Map<String, Map<String, JsonData>> metricDetails() {
		return this.metricDetails;
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

		generator.writeKey("metric_score");
		generator.write(this.metricScore.doubleValue());

		generator.writeKey("unrated_docs");
		generator.writeStartArray();
		for (UnratedDocument item0 : this.unratedDocs) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("hits");
		generator.writeStartArray();
		for (RankEvalHitItem item0 : this.hits) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("metric_details");
		generator.writeStartObject();
		for (Map.Entry<String, Map<String, JsonData>> item0 : this.metricDetails.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item1 : item0.getValue().entrySet()) {
				generator.writeKey(item1.getKey());
				item1.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalMetricDetail}.
	 */
	public static class Builder implements ObjectBuilder<RankEvalMetricDetail> {
		private Number metricScore;

		private List<UnratedDocument> unratedDocs;

		private List<RankEvalHitItem> hits;

		private Map<String, Map<String, JsonData>> metricDetails;

		/**
		 * The metric_score in the details section shows the contribution of this query
		 * to the global quality metric score
		 * <p>
		 * API name: {@code metric_score}
		 */
		public Builder metricScore(Number value) {
			this.metricScore = value;
			return this;
		}

		/**
		 * The unrated_docs section contains an _index and _id entry for each document
		 * in the search result for this query that didn’t have a ratings value. This
		 * can be used to ask the user to supply ratings for these documents
		 * <p>
		 * API name: {@code unrated_docs}
		 */
		public Builder unratedDocs(List<UnratedDocument> value) {
			this.unratedDocs = value;
			return this;
		}

		/**
		 * The unrated_docs section contains an _index and _id entry for each document
		 * in the search result for this query that didn’t have a ratings value. This
		 * can be used to ask the user to supply ratings for these documents
		 * <p>
		 * API name: {@code unrated_docs}
		 */
		public Builder unratedDocs(UnratedDocument... value) {
			this.unratedDocs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #unratedDocs(List)}, creating the list if needed.
		 */
		public Builder addUnratedDocs(UnratedDocument value) {
			if (this.unratedDocs == null) {
				this.unratedDocs = new ArrayList<>();
			}
			this.unratedDocs.add(value);
			return this;
		}

		/**
		 * Set {@link #unratedDocs(List)} to a singleton list.
		 */
		public Builder unratedDocs(Function<UnratedDocument.Builder, ObjectBuilder<UnratedDocument>> fn) {
			return this.unratedDocs(fn.apply(new UnratedDocument.Builder()).build());
		}

		/**
		 * Add a value to {@link #unratedDocs(List)}, creating the list if needed.
		 */
		public Builder addUnratedDocs(Function<UnratedDocument.Builder, ObjectBuilder<UnratedDocument>> fn) {
			return this.addUnratedDocs(fn.apply(new UnratedDocument.Builder()).build());
		}

		/**
		 * The hits section shows a grouping of the search results with their supplied
		 * ratings
		 * <p>
		 * API name: {@code hits}
		 */
		public Builder hits(List<RankEvalHitItem> value) {
			this.hits = value;
			return this;
		}

		/**
		 * The hits section shows a grouping of the search results with their supplied
		 * ratings
		 * <p>
		 * API name: {@code hits}
		 */
		public Builder hits(RankEvalHitItem... value) {
			this.hits = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #hits(List)}, creating the list if needed.
		 */
		public Builder addHits(RankEvalHitItem value) {
			if (this.hits == null) {
				this.hits = new ArrayList<>();
			}
			this.hits.add(value);
			return this;
		}

		/**
		 * Set {@link #hits(List)} to a singleton list.
		 */
		public Builder hits(Function<RankEvalHitItem.Builder, ObjectBuilder<RankEvalHitItem>> fn) {
			return this.hits(fn.apply(new RankEvalHitItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #hits(List)}, creating the list if needed.
		 */
		public Builder addHits(Function<RankEvalHitItem.Builder, ObjectBuilder<RankEvalHitItem>> fn) {
			return this.addHits(fn.apply(new RankEvalHitItem.Builder()).build());
		}

		/**
		 * The metric_details give additional information about the calculated quality
		 * metric (e.g. how many of the retrieved documents were relevant). The content
		 * varies for each metric but allows for better interpretation of the results
		 * <p>
		 * API name: {@code metric_details}
		 */
		public Builder metricDetails(Map<String, Map<String, JsonData>> value) {
			this.metricDetails = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metricDetails(Map)}, creating the map if needed.
		 */
		public Builder putMetricDetails(String key, Map<String, JsonData> value) {
			if (this.metricDetails == null) {
				this.metricDetails = new HashMap<>();
			}
			this.metricDetails.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link RankEvalMetricDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalMetricDetail build() {

			return new RankEvalMetricDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalMetricDetail}
	 */
	public static final JsonpDeserializer<RankEvalMetricDetail> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RankEvalMetricDetail::setupRankEvalMetricDetailDeserializer);

	protected static void setupRankEvalMetricDetailDeserializer(
			DelegatingDeserializer<RankEvalMetricDetail.Builder> op) {

		op.add(Builder::metricScore, JsonpDeserializer.numberDeserializer(), "metric_score");
		op.add(Builder::unratedDocs, JsonpDeserializer.arrayDeserializer(UnratedDocument.DESERIALIZER), "unrated_docs");
		op.add(Builder::hits, JsonpDeserializer.arrayDeserializer(RankEvalHitItem.DESERIALIZER), "hits");
		op.add(Builder::metricDetails,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER)),
				"metric_details");

	}

}
