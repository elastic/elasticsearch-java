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

package co.elastic.clients.elasticsearch.query_rules;

import co.elastic.clients.elasticsearch.query_rules.list_rulesets.QueryRulesetListItem;
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

// typedef: query_rules.list_rulesets.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#query_rules.list_rulesets.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ListRulesetsResponse implements JsonpSerializable {
	private final long count;

	private final List<QueryRulesetListItem> results;

	// ---------------------------------------------------------------------------------------------

	private ListRulesetsResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.results = ApiTypeHelper.unmodifiableRequired(builder.results, this, "results");

	}

	public static ListRulesetsResponse of(Function<Builder, ObjectBuilder<ListRulesetsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code results}
	 */
	public final List<QueryRulesetListItem> results() {
		return this.results;
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

		if (ApiTypeHelper.isDefined(this.results)) {
			generator.writeKey("results");
			generator.writeStartArray();
			for (QueryRulesetListItem item0 : this.results) {
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
	 * Builder for {@link ListRulesetsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ListRulesetsResponse> {
		private Long count;

		private List<QueryRulesetListItem> results;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code results}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>results</code>.
		 */
		public final Builder results(List<QueryRulesetListItem> list) {
			this.results = _listAddAll(this.results, list);
			return this;
		}

		/**
		 * Required - API name: {@code results}
		 * <p>
		 * Adds one or more values to <code>results</code>.
		 */
		public final Builder results(QueryRulesetListItem value, QueryRulesetListItem... values) {
			this.results = _listAdd(this.results, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code results}
		 * <p>
		 * Adds a value to <code>results</code> using a builder lambda.
		 */
		public final Builder results(Function<QueryRulesetListItem.Builder, ObjectBuilder<QueryRulesetListItem>> fn) {
			return results(fn.apply(new QueryRulesetListItem.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ListRulesetsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListRulesetsResponse build() {
			_checkSingleUse();

			return new ListRulesetsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ListRulesetsResponse}
	 */
	public static final JsonpDeserializer<ListRulesetsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ListRulesetsResponse::setupListRulesetsResponseDeserializer);

	protected static void setupListRulesetsResponseDeserializer(ObjectDeserializer<ListRulesetsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::results, JsonpDeserializer.arrayDeserializer(QueryRulesetListItem._DESERIALIZER), "results");

	}

}
