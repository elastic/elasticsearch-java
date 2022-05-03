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
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DetectionRule

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.DetectionRule">API
 *      specification</a>
 */
@JsonpDeserializable
public class DetectionRule implements JsonpSerializable {
	private final List<RuleAction> actions;

	private final List<RuleCondition> conditions;

	private final Map<String, FilterRef> scope;

	// ---------------------------------------------------------------------------------------------

	private DetectionRule(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiable(builder.actions);
		this.conditions = ApiTypeHelper.unmodifiable(builder.conditions);
		this.scope = ApiTypeHelper.unmodifiable(builder.scope);

	}

	public static DetectionRule of(Function<Builder, ObjectBuilder<DetectionRule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The set of actions to be triggered when the rule applies. If more than one
	 * action is specified the effects of all actions are combined.
	 * <p>
	 * API name: {@code actions}
	 */
	public final List<RuleAction> actions() {
		return this.actions;
	}

	/**
	 * An array of numeric conditions when the rule applies. A rule must either have
	 * a non-empty scope or at least one condition. Multiple conditions are combined
	 * together with a logical AND.
	 * <p>
	 * API name: {@code conditions}
	 */
	public final List<RuleCondition> conditions() {
		return this.conditions;
	}

	/**
	 * A scope of series where the rule applies. A rule must either have a non-empty
	 * scope or at least one condition. By default, the scope includes all series.
	 * Scoping is allowed for any of the fields that are also specified in
	 * <code>by_field_name</code>, <code>over_field_name</code>, or
	 * <code>partition_field_name</code>.
	 * <p>
	 * API name: {@code scope}
	 */
	public final Map<String, FilterRef> scope() {
		return this.scope;
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

		if (ApiTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartArray();
			for (RuleAction item0 : this.actions) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.conditions)) {
			generator.writeKey("conditions");
			generator.writeStartArray();
			for (RuleCondition item0 : this.conditions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.scope)) {
			generator.writeKey("scope");
			generator.writeStartObject();
			for (Map.Entry<String, FilterRef> item0 : this.scope.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link DetectionRule}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DetectionRule> {
		@Nullable
		private List<RuleAction> actions;

		@Nullable
		private List<RuleCondition> conditions;

		@Nullable
		private Map<String, FilterRef> scope;

		/**
		 * The set of actions to be triggered when the rule applies. If more than one
		 * action is specified the effects of all actions are combined.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actions</code>.
		 */
		public final Builder actions(List<RuleAction> list) {
			this.actions = _listAddAll(this.actions, list);
			return this;
		}

		/**
		 * The set of actions to be triggered when the rule applies. If more than one
		 * action is specified the effects of all actions are combined.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds one or more values to <code>actions</code>.
		 */
		public final Builder actions(RuleAction value, RuleAction... values) {
			this.actions = _listAdd(this.actions, value, values);
			return this;
		}

		/**
		 * An array of numeric conditions when the rule applies. A rule must either have
		 * a non-empty scope or at least one condition. Multiple conditions are combined
		 * together with a logical AND.
		 * <p>
		 * API name: {@code conditions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>conditions</code>.
		 */
		public final Builder conditions(List<RuleCondition> list) {
			this.conditions = _listAddAll(this.conditions, list);
			return this;
		}

		/**
		 * An array of numeric conditions when the rule applies. A rule must either have
		 * a non-empty scope or at least one condition. Multiple conditions are combined
		 * together with a logical AND.
		 * <p>
		 * API name: {@code conditions}
		 * <p>
		 * Adds one or more values to <code>conditions</code>.
		 */
		public final Builder conditions(RuleCondition value, RuleCondition... values) {
			this.conditions = _listAdd(this.conditions, value, values);
			return this;
		}

		/**
		 * An array of numeric conditions when the rule applies. A rule must either have
		 * a non-empty scope or at least one condition. Multiple conditions are combined
		 * together with a logical AND.
		 * <p>
		 * API name: {@code conditions}
		 * <p>
		 * Adds a value to <code>conditions</code> using a builder lambda.
		 */
		public final Builder conditions(Function<RuleCondition.Builder, ObjectBuilder<RuleCondition>> fn) {
			return conditions(fn.apply(new RuleCondition.Builder()).build());
		}

		/**
		 * A scope of series where the rule applies. A rule must either have a non-empty
		 * scope or at least one condition. By default, the scope includes all series.
		 * Scoping is allowed for any of the fields that are also specified in
		 * <code>by_field_name</code>, <code>over_field_name</code>, or
		 * <code>partition_field_name</code>.
		 * <p>
		 * API name: {@code scope}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>scope</code>.
		 */
		public final Builder scope(Map<String, FilterRef> map) {
			this.scope = _mapPutAll(this.scope, map);
			return this;
		}

		/**
		 * A scope of series where the rule applies. A rule must either have a non-empty
		 * scope or at least one condition. By default, the scope includes all series.
		 * Scoping is allowed for any of the fields that are also specified in
		 * <code>by_field_name</code>, <code>over_field_name</code>, or
		 * <code>partition_field_name</code>.
		 * <p>
		 * API name: {@code scope}
		 * <p>
		 * Adds an entry to <code>scope</code>.
		 */
		public final Builder scope(String key, FilterRef value) {
			this.scope = _mapPut(this.scope, key, value);
			return this;
		}

		/**
		 * A scope of series where the rule applies. A rule must either have a non-empty
		 * scope or at least one condition. By default, the scope includes all series.
		 * Scoping is allowed for any of the fields that are also specified in
		 * <code>by_field_name</code>, <code>over_field_name</code>, or
		 * <code>partition_field_name</code>.
		 * <p>
		 * API name: {@code scope}
		 * <p>
		 * Adds an entry to <code>scope</code> using a builder lambda.
		 */
		public final Builder scope(String key, Function<FilterRef.Builder, ObjectBuilder<FilterRef>> fn) {
			return scope(key, fn.apply(new FilterRef.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DetectionRule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DetectionRule build() {
			_checkSingleUse();

			return new DetectionRule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DetectionRule}
	 */
	public static final JsonpDeserializer<DetectionRule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DetectionRule::setupDetectionRuleDeserializer);

	protected static void setupDetectionRuleDeserializer(ObjectDeserializer<DetectionRule.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(RuleAction._DESERIALIZER), "actions");
		op.add(Builder::conditions, JsonpDeserializer.arrayDeserializer(RuleCondition._DESERIALIZER), "conditions");
		op.add(Builder::scope, JsonpDeserializer.stringMapDeserializer(FilterRef._DESERIALIZER), "scope");

	}

}
