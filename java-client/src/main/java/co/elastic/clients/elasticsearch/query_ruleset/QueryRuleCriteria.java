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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: query_ruleset._types.QueryRuleCriteria

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#query_ruleset._types.QueryRuleCriteria">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRuleCriteria implements JsonpSerializable {
	private final QueryRuleCriteriaType type;

	private final String metadata;

	private final List<JsonData> values;

	// ---------------------------------------------------------------------------------------------

	private QueryRuleCriteria(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.metadata = ApiTypeHelper.requireNonNull(builder.metadata, this, "metadata");
		this.values = ApiTypeHelper.unmodifiable(builder.values);

	}

	public static QueryRuleCriteria of(Function<Builder, ObjectBuilder<QueryRuleCriteria>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final QueryRuleCriteriaType type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code metadata}
	 */
	public final String metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code values}
	 */
	public final List<JsonData> values() {
		return this.values;
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

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		generator.writeKey("metadata");
		generator.write(this.metadata);

		if (ApiTypeHelper.isDefined(this.values)) {
			generator.writeKey("values");
			generator.writeStartArray();
			for (JsonData item0 : this.values) {
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
	 * Builder for {@link QueryRuleCriteria}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<QueryRuleCriteria> {
		private QueryRuleCriteriaType type;

		private String metadata;

		@Nullable
		private List<JsonData> values;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(QueryRuleCriteriaType value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code metadata}
		 */
		public final Builder metadata(String value) {
			this.metadata = value;
			return this;
		}

		/**
		 * API name: {@code values}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>values</code>.
		 */
		public final Builder values(List<JsonData> list) {
			this.values = _listAddAll(this.values, list);
			return this;
		}

		/**
		 * API name: {@code values}
		 * <p>
		 * Adds one or more values to <code>values</code>.
		 */
		public final Builder values(JsonData value, JsonData... values) {
			this.values = _listAdd(this.values, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryRuleCriteria}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryRuleCriteria build() {
			_checkSingleUse();

			return new QueryRuleCriteria(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryRuleCriteria}
	 */
	public static final JsonpDeserializer<QueryRuleCriteria> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryRuleCriteria::setupQueryRuleCriteriaDeserializer);

	protected static void setupQueryRuleCriteriaDeserializer(ObjectDeserializer<QueryRuleCriteria.Builder> op) {

		op.add(Builder::type, QueryRuleCriteriaType._DESERIALIZER, "type");
		op.add(Builder::metadata, JsonpDeserializer.stringDeserializer(), "metadata");
		op.add(Builder::values, JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER), "values");

	}

}
