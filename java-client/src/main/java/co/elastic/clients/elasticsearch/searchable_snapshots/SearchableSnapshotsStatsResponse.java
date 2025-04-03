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

package co.elastic.clients.elasticsearch.searchable_snapshots;

import co.elastic.clients.json.JsonData;
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

// typedef: searchable_snapshots.stats.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#searchable_snapshots.stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchableSnapshotsStatsResponse implements JsonpSerializable {
	private final JsonData stats;

	private final JsonData total;

	// ---------------------------------------------------------------------------------------------

	private SearchableSnapshotsStatsResponse(Builder builder) {

		this.stats = ApiTypeHelper.requireNonNull(builder.stats, this, "stats");
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static SearchableSnapshotsStatsResponse of(
			Function<Builder, ObjectBuilder<SearchableSnapshotsStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public final JsonData stats() {
		return this.stats;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final JsonData total() {
		return this.total;
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

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchableSnapshotsStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SearchableSnapshotsStatsResponse> {
		private JsonData stats;

		private JsonData total;

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(JsonData value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(JsonData value) {
			this.total = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchableSnapshotsStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchableSnapshotsStatsResponse build() {
			_checkSingleUse();

			return new SearchableSnapshotsStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchableSnapshotsStatsResponse}
	 */
	public static final JsonpDeserializer<SearchableSnapshotsStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchableSnapshotsStatsResponse::setupSearchableSnapshotsStatsResponseDeserializer);

	protected static void setupSearchableSnapshotsStatsResponseDeserializer(
			ObjectDeserializer<SearchableSnapshotsStatsResponse.Builder> op) {

		op.add(Builder::stats, JsonData._DESERIALIZER, "stats");
		op.add(Builder::total, JsonData._DESERIALIZER, "total");

	}

}
