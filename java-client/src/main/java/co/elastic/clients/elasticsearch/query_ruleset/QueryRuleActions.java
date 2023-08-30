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

package co.elastic.clients.elasticsearch.query_ruleset;

import co.elastic.clients.elasticsearch._types.query_dsl.PinnedDoc;
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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: query_ruleset._types.QueryRuleActions

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#query_ruleset._types.QueryRuleActions">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRuleActions implements JsonpSerializable {
	private final List<String> ids;

	private final List<PinnedDoc> docs;

	// ---------------------------------------------------------------------------------------------

	private QueryRuleActions(Builder builder) {

		this.ids = ApiTypeHelper.unmodifiable(builder.ids);
		this.docs = ApiTypeHelper.unmodifiable(builder.docs);

	}

	public static QueryRuleActions of(Function<Builder, ObjectBuilder<QueryRuleActions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	/**
	 * API name: {@code docs}
	 */
	public final List<PinnedDoc> docs() {
		return this.docs;
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

		if (ApiTypeHelper.isDefined(this.ids)) {
			generator.writeKey("ids");
			generator.writeStartArray();
			for (String item0 : this.ids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (PinnedDoc item0 : this.docs) {
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
	 * Builder for {@link QueryRuleActions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<QueryRuleActions> {
		@Nullable
		private List<String> ids;

		@Nullable
		private List<PinnedDoc> docs;

		/**
		 * API name: {@code ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ids</code>.
		 */
		public final Builder ids(List<String> list) {
			this.ids = _listAddAll(this.ids, list);
			return this;
		}

		/**
		 * API name: {@code ids}
		 * <p>
		 * Adds one or more values to <code>ids</code>.
		 */
		public final Builder ids(String value, String... values) {
			this.ids = _listAdd(this.ids, value, values);
			return this;
		}

		/**
		 * API name: {@code docs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docs</code>.
		 */
		public final Builder docs(List<PinnedDoc> list) {
			this.docs = _listAddAll(this.docs, list);
			return this;
		}

		/**
		 * API name: {@code docs}
		 * <p>
		 * Adds one or more values to <code>docs</code>.
		 */
		public final Builder docs(PinnedDoc value, PinnedDoc... values) {
			this.docs = _listAdd(this.docs, value, values);
			return this;
		}

		/**
		 * API name: {@code docs}
		 * <p>
		 * Adds a value to <code>docs</code> using a builder lambda.
		 */
		public final Builder docs(Function<PinnedDoc.Builder, ObjectBuilder<PinnedDoc>> fn) {
			return docs(fn.apply(new PinnedDoc.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryRuleActions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryRuleActions build() {
			_checkSingleUse();

			return new QueryRuleActions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryRuleActions}
	 */
	public static final JsonpDeserializer<QueryRuleActions> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryRuleActions::setupQueryRuleActionsDeserializer);

	protected static void setupQueryRuleActionsDeserializer(ObjectDeserializer<QueryRuleActions.Builder> op) {

		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");
		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(PinnedDoc._DESERIALIZER), "docs");

	}

}
