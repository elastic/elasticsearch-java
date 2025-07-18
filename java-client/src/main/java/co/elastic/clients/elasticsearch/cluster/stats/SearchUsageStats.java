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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
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

// typedef: cluster.stats.SearchUsageStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.SearchUsageStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchUsageStats implements JsonpSerializable {
	private final long total;

	private final Map<String, Long> queries;

	private final Map<String, Long> rescorers;

	private final Map<String, Long> sections;

	private final Map<String, Long> retrievers;

	// ---------------------------------------------------------------------------------------------

	private SearchUsageStats(Builder builder) {

		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total", 0);
		this.queries = ApiTypeHelper.unmodifiableRequired(builder.queries, this, "queries");
		this.rescorers = ApiTypeHelper.unmodifiableRequired(builder.rescorers, this, "rescorers");
		this.sections = ApiTypeHelper.unmodifiableRequired(builder.sections, this, "sections");
		this.retrievers = ApiTypeHelper.unmodifiableRequired(builder.retrievers, this, "retrievers");

	}

	public static SearchUsageStats of(Function<Builder, ObjectBuilder<SearchUsageStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code queries}
	 */
	public final Map<String, Long> queries() {
		return this.queries;
	}

	/**
	 * Required - API name: {@code rescorers}
	 */
	public final Map<String, Long> rescorers() {
		return this.rescorers;
	}

	/**
	 * Required - API name: {@code sections}
	 */
	public final Map<String, Long> sections() {
		return this.sections;
	}

	/**
	 * Required - API name: {@code retrievers}
	 */
	public final Map<String, Long> retrievers() {
		return this.retrievers;
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

		generator.writeKey("total");
		generator.write(this.total);

		if (ApiTypeHelper.isDefined(this.queries)) {
			generator.writeKey("queries");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.queries.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.rescorers)) {
			generator.writeKey("rescorers");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.rescorers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.sections)) {
			generator.writeKey("sections");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.sections.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.retrievers)) {
			generator.writeKey("retrievers");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.retrievers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchUsageStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SearchUsageStats> {
		private Long total;

		private Map<String, Long> queries;

		private Map<String, Long> rescorers;

		private Map<String, Long> sections;

		private Map<String, Long> retrievers;

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(long value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code queries}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>queries</code>.
		 */
		public final Builder queries(Map<String, Long> map) {
			this.queries = _mapPutAll(this.queries, map);
			return this;
		}

		/**
		 * Required - API name: {@code queries}
		 * <p>
		 * Adds an entry to <code>queries</code>.
		 */
		public final Builder queries(String key, Long value) {
			this.queries = _mapPut(this.queries, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code rescorers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>rescorers</code>.
		 */
		public final Builder rescorers(Map<String, Long> map) {
			this.rescorers = _mapPutAll(this.rescorers, map);
			return this;
		}

		/**
		 * Required - API name: {@code rescorers}
		 * <p>
		 * Adds an entry to <code>rescorers</code>.
		 */
		public final Builder rescorers(String key, Long value) {
			this.rescorers = _mapPut(this.rescorers, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code sections}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>sections</code>.
		 */
		public final Builder sections(Map<String, Long> map) {
			this.sections = _mapPutAll(this.sections, map);
			return this;
		}

		/**
		 * Required - API name: {@code sections}
		 * <p>
		 * Adds an entry to <code>sections</code>.
		 */
		public final Builder sections(String key, Long value) {
			this.sections = _mapPut(this.sections, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code retrievers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>retrievers</code>.
		 */
		public final Builder retrievers(Map<String, Long> map) {
			this.retrievers = _mapPutAll(this.retrievers, map);
			return this;
		}

		/**
		 * Required - API name: {@code retrievers}
		 * <p>
		 * Adds an entry to <code>retrievers</code>.
		 */
		public final Builder retrievers(String key, Long value) {
			this.retrievers = _mapPut(this.retrievers, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchUsageStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchUsageStats build() {
			_checkSingleUse();

			return new SearchUsageStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchUsageStats}
	 */
	public static final JsonpDeserializer<SearchUsageStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchUsageStats::setupSearchUsageStatsDeserializer);

	protected static void setupSearchUsageStatsDeserializer(ObjectDeserializer<SearchUsageStats.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::queries, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"queries");
		op.add(Builder::rescorers, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"rescorers");
		op.add(Builder::sections, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"sections");
		op.add(Builder::retrievers, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"retrievers");

	}

}
