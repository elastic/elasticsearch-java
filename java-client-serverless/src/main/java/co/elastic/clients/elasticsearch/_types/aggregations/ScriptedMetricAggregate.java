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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ScriptedMetricAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.ScriptedMetricAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScriptedMetricAggregate extends AggregateBase implements AggregateVariant {
	private final JsonData value;

	// ---------------------------------------------------------------------------------------------

	private ScriptedMetricAggregate(Builder builder) {
		super(builder);

		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static ScriptedMetricAggregate of(Function<Builder, ObjectBuilder<ScriptedMetricAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.ScriptedMetric;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final JsonData value() {
		return this.value;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("value");
		this.value.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptedMetricAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ScriptedMetricAggregate> {
		private JsonData value;

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(JsonData value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScriptedMetricAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptedMetricAggregate build() {
			_checkSingleUse();

			return new ScriptedMetricAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptedMetricAggregate}
	 */
	public static final JsonpDeserializer<ScriptedMetricAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScriptedMetricAggregate::setupScriptedMetricAggregateDeserializer);

	protected static void setupScriptedMetricAggregateDeserializer(
			ObjectDeserializer<ScriptedMetricAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::value, JsonData._DESERIALIZER, "value");

	}

}
