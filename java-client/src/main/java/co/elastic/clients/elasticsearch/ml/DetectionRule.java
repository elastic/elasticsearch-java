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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
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
public final class DetectionRule implements ToJsonp {
	@Nullable
	private final List<JsonValue> actions;

	private final List<RuleCondition> conditions;

	@Nullable
	private final Map<String, FilterRef> scope;

	// ---------------------------------------------------------------------------------------------

	protected DetectionRule(Builder builder) {

		this.actions = builder.actions;
		this.conditions = Objects.requireNonNull(builder.conditions, "conditions");
		this.scope = builder.scope;

	}

	/**
	 * API name: {@code actions}
	 */
	@Nullable
	public List<JsonValue> actions() {
		return this.actions;
	}

	/**
	 * API name: {@code conditions}
	 */
	public List<RuleCondition> conditions() {
		return this.conditions;
	}

	/**
	 * API name: {@code scope}
	 */
	@Nullable
	public Map<String, FilterRef> scope() {
		return this.scope;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.actions != null) {

			generator.writeKey("actions");
			generator.writeStartArray();
			for (JsonValue item0 : this.actions) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("conditions");
		generator.writeStartArray();
		for (RuleCondition item0 : this.conditions) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		if (this.scope != null) {

			generator.writeKey("scope");
			generator.writeStartObject();
			for (Map.Entry<String, FilterRef> item0 : this.scope.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

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
		private List<JsonValue> actions;

		private List<RuleCondition> conditions;

		@Nullable
		private Map<String, FilterRef> scope;

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(@Nullable List<JsonValue> value) {
			this.actions = value;
			return this;
		}

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(JsonValue... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actions(List)}, creating the list if needed.
		 */
		public Builder addActions(JsonValue value) {
			if (this.actions == null) {
				this.actions = new ArrayList<>();
			}
			this.actions.add(value);
			return this;
		}

		/**
		 * API name: {@code conditions}
		 */
		public Builder conditions(List<RuleCondition> value) {
			this.conditions = value;
			return this;
		}

		/**
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
	 * Json parser for DetectionRule
	 */
	public static final JsonpValueParser<DetectionRule> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, DetectionRule::setupDetectionRuleParser);

	protected static void setupDetectionRuleParser(DelegatingJsonpValueParser<DetectionRule.Builder> op) {

		op.add(Builder::actions, JsonpValueParser.arrayParser(JsonpValueParser.jsonValueParser()), "actions");
		op.add(Builder::conditions, JsonpValueParser.arrayParser(RuleCondition.JSONP_PARSER), "conditions");
		op.add(Builder::scope, JsonpValueParser.stringMapParser(FilterRef.JSONP_PARSER), "scope");

	}

}
