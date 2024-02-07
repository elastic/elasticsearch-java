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

package co.elastic.clients.elasticsearch.watcher;

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
import java.lang.Integer;
import java.util.List;
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

// typedef: watcher.query_watches.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher.query_watches.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryWatchesResponse implements JsonpSerializable {
	private final int count;

	private final List<QueryWatch> watches;

	// ---------------------------------------------------------------------------------------------

	private QueryWatchesResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.watches = ApiTypeHelper.unmodifiableRequired(builder.watches, this, "watches");

	}

	public static QueryWatchesResponse of(Function<Builder, ObjectBuilder<QueryWatchesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code watches}
	 */
	public final List<QueryWatch> watches() {
		return this.watches;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ApiTypeHelper.isDefined(this.watches)) {
			generator.writeKey("watches");
			generator.writeStartArray();
			for (QueryWatch item0 : this.watches) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link QueryWatchesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<QueryWatchesResponse> {
		private Integer count;

		private List<QueryWatch> watches;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code watches}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>watches</code>.
		 */
		public final Builder watches(List<QueryWatch> list) {
			this.watches = _listAddAll(this.watches, list);
			return this;
		}

		/**
		 * Required - API name: {@code watches}
		 * <p>
		 * Adds one or more values to <code>watches</code>.
		 */
		public final Builder watches(QueryWatch value, QueryWatch... values) {
			this.watches = _listAdd(this.watches, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code watches}
		 * <p>
		 * Adds a value to <code>watches</code> using a builder lambda.
		 */
		public final Builder watches(Function<QueryWatch.Builder, ObjectBuilder<QueryWatch>> fn) {
			return watches(fn.apply(new QueryWatch.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryWatchesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryWatchesResponse build() {
			_checkSingleUse();

			return new QueryWatchesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryWatchesResponse}
	 */
	public static final JsonpDeserializer<QueryWatchesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryWatchesResponse::setupQueryWatchesResponseDeserializer);

	protected static void setupQueryWatchesResponseDeserializer(ObjectDeserializer<QueryWatchesResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::watches, JsonpDeserializer.arrayDeserializer(QueryWatch._DESERIALIZER), "watches");

	}

}
