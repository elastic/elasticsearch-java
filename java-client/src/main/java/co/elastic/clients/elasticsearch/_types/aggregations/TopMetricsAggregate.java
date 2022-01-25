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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TopMetricsAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.TopMetricsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class TopMetricsAggregate extends AggregateBase implements AggregateVariant {
	private final List<TopMetrics> top;

	// ---------------------------------------------------------------------------------------------

	private TopMetricsAggregate(Builder builder) {
		super(builder);

		this.top = ApiTypeHelper.unmodifiableRequired(builder.top, this, "top");

	}

	public static TopMetricsAggregate of(Function<Builder, ObjectBuilder<TopMetricsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.TopMetrics;
	}

	/**
	 * Required - API name: {@code top}
	 */
	public final List<TopMetrics> top() {
		return this.top;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.top)) {
			generator.writeKey("top");
			generator.writeStartArray();
			for (TopMetrics item0 : this.top) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopMetricsAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TopMetricsAggregate> {
		private List<TopMetrics> top;

		/**
		 * Required - API name: {@code top}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>top</code>.
		 */
		public final Builder top(List<TopMetrics> list) {
			this.top = _listAddAll(this.top, list);
			return this;
		}

		/**
		 * Required - API name: {@code top}
		 * <p>
		 * Adds one or more values to <code>top</code>.
		 */
		public final Builder top(TopMetrics value, TopMetrics... values) {
			this.top = _listAdd(this.top, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code top}
		 * <p>
		 * Adds a value to <code>top</code> using a builder lambda.
		 */
		public final Builder top(Function<TopMetrics.Builder, ObjectBuilder<TopMetrics>> fn) {
			return top(fn.apply(new TopMetrics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TopMetricsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopMetricsAggregate build() {
			_checkSingleUse();

			return new TopMetricsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopMetricsAggregate}
	 */
	public static final JsonpDeserializer<TopMetricsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TopMetricsAggregate::setupTopMetricsAggregateDeserializer);

	protected static void setupTopMetricsAggregateDeserializer(ObjectDeserializer<TopMetricsAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::top, JsonpDeserializer.arrayDeserializer(TopMetrics._DESERIALIZER), "top");

	}

}
