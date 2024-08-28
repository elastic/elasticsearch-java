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

package co.elastic.clients.elasticsearch.connector;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
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

// typedef: connector._types.FilteringRule

/**
 *
 * @see <a href="../doc-files/api-spec.html#connector._types.FilteringRule">API
 *      specification</a>
 */
@JsonpDeserializable
public class FilteringRule implements JsonpSerializable {
	@Nullable
	private final DateTime createdAt;

	private final String field;

	private final String id;

	private final int order;

	private final FilteringPolicy policy;

	private final FilteringRuleRule rule;

	@Nullable
	private final DateTime updatedAt;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	private FilteringRule(Builder builder) {

		this.createdAt = builder.createdAt;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.order = ApiTypeHelper.requireNonNull(builder.order, this, "order");
		this.policy = ApiTypeHelper.requireNonNull(builder.policy, this, "policy");
		this.rule = ApiTypeHelper.requireNonNull(builder.rule, this, "rule");
		this.updatedAt = builder.updatedAt;
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static FilteringRule of(Function<Builder, ObjectBuilder<FilteringRule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code created_at}
	 */
	@Nullable
	public final DateTime createdAt() {
		return this.createdAt;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code order}
	 */
	public final int order() {
		return this.order;
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public final FilteringPolicy policy() {
		return this.policy;
	}

	/**
	 * Required - API name: {@code rule}
	 */
	public final FilteringRuleRule rule() {
		return this.rule;
	}

	/**
	 * API name: {@code updated_at}
	 */
	@Nullable
	public final DateTime updatedAt() {
		return this.updatedAt;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final String value() {
		return this.value;
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

		if (this.createdAt != null) {
			generator.writeKey("created_at");
			this.createdAt.serialize(generator, mapper);
		}
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("order");
		generator.write(this.order);

		generator.writeKey("policy");
		this.policy.serialize(generator, mapper);
		generator.writeKey("rule");
		this.rule.serialize(generator, mapper);
		if (this.updatedAt != null) {
			generator.writeKey("updated_at");
			this.updatedAt.serialize(generator, mapper);
		}
		generator.writeKey("value");
		generator.write(this.value);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FilteringRule}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FilteringRule> {
		@Nullable
		private DateTime createdAt;

		private String field;

		private String id;

		private Integer order;

		private FilteringPolicy policy;

		private FilteringRuleRule rule;

		@Nullable
		private DateTime updatedAt;

		private String value;

		/**
		 * API name: {@code created_at}
		 */
		public final Builder createdAt(@Nullable DateTime value) {
			this.createdAt = value;
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code order}
		 */
		public final Builder order(int value) {
			this.order = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(FilteringPolicy value) {
			this.policy = value;
			return this;
		}

		/**
		 * Required - API name: {@code rule}
		 */
		public final Builder rule(FilteringRuleRule value) {
			this.rule = value;
			return this;
		}

		/**
		 * API name: {@code updated_at}
		 */
		public final Builder updatedAt(@Nullable DateTime value) {
			this.updatedAt = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FilteringRule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FilteringRule build() {
			_checkSingleUse();

			return new FilteringRule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FilteringRule}
	 */
	public static final JsonpDeserializer<FilteringRule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FilteringRule::setupFilteringRuleDeserializer);

	protected static void setupFilteringRuleDeserializer(ObjectDeserializer<FilteringRule.Builder> op) {

		op.add(Builder::createdAt, DateTime._DESERIALIZER, "created_at");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::order, JsonpDeserializer.integerDeserializer(), "order");
		op.add(Builder::policy, FilteringPolicy._DESERIALIZER, "policy");
		op.add(Builder::rule, FilteringRuleRule._DESERIALIZER, "rule");
		op.add(Builder::updatedAt, DateTime._DESERIALIZER, "updated_at");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
