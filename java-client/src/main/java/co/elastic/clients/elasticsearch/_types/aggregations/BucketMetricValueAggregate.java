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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketMetricValueAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BucketMetricValueAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class BucketMetricValueAggregate extends SingleMetricAggregateBase implements AggregateVariant {
	private final List<String> keys;

	// ---------------------------------------------------------------------------------------------

	private BucketMetricValueAggregate(Builder builder) {
		super(builder);

		this.keys = ApiTypeHelper.unmodifiableRequired(builder.keys, this, "keys");

	}

	public static BucketMetricValueAggregate of(Function<Builder, ObjectBuilder<BucketMetricValueAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.BucketMetricValue;
	}

	/**
	 * Required - API name: {@code keys}
	 */
	public final List<String> keys() {
		return this.keys;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.keys)) {
			generator.writeKey("keys");
			generator.writeStartArray();
			for (String item0 : this.keys) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketMetricValueAggregate}.
	 */

	public static class Builder extends SingleMetricAggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BucketMetricValueAggregate> {
		private List<String> keys;

		/**
		 * Required - API name: {@code keys}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>keys</code>.
		 */
		public final Builder keys(List<String> list) {
			this.keys = _listAddAll(this.keys, list);
			return this;
		}

		/**
		 * Required - API name: {@code keys}
		 * <p>
		 * Adds one or more values to <code>keys</code>.
		 */
		public final Builder keys(String value, String... values) {
			this.keys = _listAdd(this.keys, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketMetricValueAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketMetricValueAggregate build() {
			_checkSingleUse();

			return new BucketMetricValueAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketMetricValueAggregate}
	 */
	public static final JsonpDeserializer<BucketMetricValueAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BucketMetricValueAggregate::setupBucketMetricValueAggregateDeserializer);

	protected static void setupBucketMetricValueAggregateDeserializer(
			ObjectDeserializer<BucketMetricValueAggregate.Builder> op) {
		SingleMetricAggregateBase.setupSingleMetricAggregateBaseDeserializer(op);
		op.add(Builder::keys, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "keys");

	}

}
