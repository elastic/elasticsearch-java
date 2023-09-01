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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.RuleCondition

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.RuleCondition">API
 *      specification</a>
 */
@JsonpDeserializable
public class RuleCondition implements JsonpSerializable {
	private final AppliesTo appliesTo;

	private final ConditionOperator operator;

	private final double value;

	// ---------------------------------------------------------------------------------------------

	private RuleCondition(Builder builder) {

		this.appliesTo = ApiTypeHelper.requireNonNull(builder.appliesTo, this, "appliesTo");
		this.operator = ApiTypeHelper.requireNonNull(builder.operator, this, "operator");
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static RuleCondition of(Function<Builder, ObjectBuilder<RuleCondition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Specifies the result property to which the condition applies. If
	 * your detector uses <code>lat_long</code>, <code>metric</code>,
	 * <code>rare</code>, or <code>freq_rare</code> functions, you can only specify
	 * conditions that apply to time.
	 * <p>
	 * API name: {@code applies_to}
	 */
	public final AppliesTo appliesTo() {
		return this.appliesTo;
	}

	/**
	 * Required - Specifies the condition operator. The available options are
	 * greater than, greater than or equals, less than, and less than or equals.
	 * <p>
	 * API name: {@code operator}
	 */
	public final ConditionOperator operator() {
		return this.operator;
	}

	/**
	 * Required - The value that is compared against the <code>applies_to</code>
	 * field using the operator.
	 * <p>
	 * API name: {@code value}
	 */
	public final double value() {
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

		generator.writeKey("applies_to");
		this.appliesTo.serialize(generator, mapper);
		generator.writeKey("operator");
		this.operator.serialize(generator, mapper);
		generator.writeKey("value");
		generator.write(this.value);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuleCondition}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RuleCondition> {
		private AppliesTo appliesTo;

		private ConditionOperator operator;

		private Double value;

		/**
		 * Required - Specifies the result property to which the condition applies. If
		 * your detector uses <code>lat_long</code>, <code>metric</code>,
		 * <code>rare</code>, or <code>freq_rare</code> functions, you can only specify
		 * conditions that apply to time.
		 * <p>
		 * API name: {@code applies_to}
		 */
		public final Builder appliesTo(AppliesTo value) {
			this.appliesTo = value;
			return this;
		}

		/**
		 * Required - Specifies the condition operator. The available options are
		 * greater than, greater than or equals, less than, and less than or equals.
		 * <p>
		 * API name: {@code operator}
		 */
		public final Builder operator(ConditionOperator value) {
			this.operator = value;
			return this;
		}

		/**
		 * Required - The value that is compared against the <code>applies_to</code>
		 * field using the operator.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(double value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RuleCondition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RuleCondition build() {
			_checkSingleUse();

			return new RuleCondition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RuleCondition}
	 */
	public static final JsonpDeserializer<RuleCondition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RuleCondition::setupRuleConditionDeserializer);

	protected static void setupRuleConditionDeserializer(ObjectDeserializer<RuleCondition.Builder> op) {

		op.add(Builder::appliesTo, AppliesTo._DESERIALIZER, "applies_to");
		op.add(Builder::operator, ConditionOperator._DESERIALIZER, "operator");
		op.add(Builder::value, JsonpDeserializer.doubleDeserializer(), "value");

	}

}
