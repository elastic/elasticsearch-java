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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DetectionRule
@JsonpDeserializable
public final class DetectionRule implements JsonpSerializable {
	@Nullable
	private final List<RuleAction> actions;

	@Nullable
	private final List<RuleCondition> conditions;

	@Nullable
	private final Map<String, FilterRef> scope;

	// ---------------------------------------------------------------------------------------------

	public DetectionRule(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiable(builder.actions);
		this.conditions = ModelTypeHelper.unmodifiable(builder.conditions);
		this.scope = ModelTypeHelper.unmodifiable(builder.scope);

	}

	public DetectionRule(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The set of actions to be triggered when the rule applies. If more than one
	 * action is specified the effects of all actions are combined.
	 * <p>
	 * API name: {@code actions}
	 */
	@Nullable
	public List<RuleAction> actions() {
		return this.actions;
	}

	/**
	 * An array of numeric conditions when the rule applies. A rule must either have
	 * a non-empty scope or at least one condition. Multiple conditions are combined
	 * together with a logical AND.
	 * <p>
	 * API name: {@code conditions}
	 */
	@Nullable
	public List<RuleCondition> conditions() {
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
	@Nullable
	public Map<String, FilterRef> scope() {
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

		if (this.actions != null) {

			generator.writeKey("actions");
			generator.writeStartArray();
			for (RuleAction item0 : this.actions) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.conditions != null) {

			generator.writeKey("conditions");
			generator.writeStartArray();
			for (RuleCondition item0 : this.conditions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.scope != null) {

			generator.writeKey("scope");
			generator.writeStartObject();
			for (Map.Entry<String, FilterRef> item0 : this.scope.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DetectionRule}.
	 */
	public static class Builder implements ObjectBuilder<DetectionRule> {
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
		 */
		public Builder actions(@Nullable List<RuleAction> value) {
			this.actions = value;
			return this;
		}

		/**
		 * The set of actions to be triggered when the rule applies. If more than one
		 * action is specified the effects of all actions are combined.
		 * <p>
		 * API name: {@code actions}
		 */
		public Builder actions(RuleAction... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actions(List)}, creating the list if needed.
		 */
		public Builder addActions(RuleAction value) {
			if (this.actions == null) {
				this.actions = new ArrayList<>();
			}
			this.actions.add(value);
			return this;
		}

		/**
		 * An array of numeric conditions when the rule applies. A rule must either have
		 * a non-empty scope or at least one condition. Multiple conditions are combined
		 * together with a logical AND.
		 * <p>
		 * API name: {@code conditions}
		 */
		public Builder conditions(@Nullable List<RuleCondition> value) {
			this.conditions = value;
			return this;
		}

		/**
		 * An array of numeric conditions when the rule applies. A rule must either have
		 * a non-empty scope or at least one condition. Multiple conditions are combined
		 * together with a logical AND.
		 * <p>
		 * API name: {@code conditions}
		 */
		public Builder conditions(RuleCondition... value) {
			this.conditions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #conditions(List)}, creating the list if needed.
		 */
		public Builder addConditions(RuleCondition value) {
			if (this.conditions == null) {
				this.conditions = new ArrayList<>();
			}
			this.conditions.add(value);
			return this;
		}

		/**
		 * Set {@link #conditions(List)} to a singleton list.
		 */
		public Builder conditions(Function<RuleCondition.Builder, ObjectBuilder<RuleCondition>> fn) {
			return this.conditions(fn.apply(new RuleCondition.Builder()).build());
		}

		/**
		 * Add a value to {@link #conditions(List)}, creating the list if needed.
		 */
		public Builder addConditions(Function<RuleCondition.Builder, ObjectBuilder<RuleCondition>> fn) {
			return this.addConditions(fn.apply(new RuleCondition.Builder()).build());
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
		public Builder scope(@Nullable Map<String, FilterRef> value) {
			this.scope = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #scope(Map)}, creating the map if needed.
		 */
		public Builder putScope(String key, FilterRef value) {
			if (this.scope == null) {
				this.scope = new HashMap<>();
			}
			this.scope.put(key, value);
			return this;
		}

		/**
		 * Set {@link #scope(Map)} to a singleton map.
		 */
		public Builder scope(String key, Function<FilterRef.Builder, ObjectBuilder<FilterRef>> fn) {
			return this.scope(Collections.singletonMap(key, fn.apply(new FilterRef.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #scope(Map)}, creating the map if needed.
		 */
		public Builder putScope(String key, Function<FilterRef.Builder, ObjectBuilder<FilterRef>> fn) {
			return this.putScope(key, fn.apply(new FilterRef.Builder()).build());
		}

		/**
		 * Builds a {@link DetectionRule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DetectionRule build() {

			return new DetectionRule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DetectionRule}
	 */
	public static final JsonpDeserializer<DetectionRule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DetectionRule::setupDetectionRuleDeserializer, Builder::build);

	protected static void setupDetectionRuleDeserializer(DelegatingDeserializer<DetectionRule.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(RuleAction._DESERIALIZER), "actions");
		op.add(Builder::conditions, JsonpDeserializer.arrayDeserializer(RuleCondition._DESERIALIZER), "conditions");
		op.add(Builder::scope, JsonpDeserializer.stringMapDeserializer(FilterRef._DESERIALIZER), "scope");

	}

}
