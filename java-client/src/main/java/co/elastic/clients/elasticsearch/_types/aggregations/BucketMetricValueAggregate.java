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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketMetricValueAggregate
@JsonpDeserializable
public class BucketMetricValueAggregate extends SingleMetricAggregateBase implements AggregateVariant {
	private final List<String> keys;

	// ---------------------------------------------------------------------------------------------

	private BucketMetricValueAggregate(Builder builder) {
		super(builder);

		this.keys = ModelTypeHelper.unmodifiableRequired(builder.keys, this, "keys");

	}

	public static BucketMetricValueAggregate of(Function<Builder, ObjectBuilder<BucketMetricValueAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "bucket_metric_value";
	}

	/**
	 * Required - API name: {@code keys}
	 */
	public final List<String> keys() {
		return this.keys;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.keys)) {
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
		 */
		public final Builder keys(List<String> value) {
			this.keys = value;
			return this;
		}

		/**
		 * Required - API name: {@code keys}
		 */
		public final Builder keys(String... value) {
			this.keys = Arrays.asList(value);
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
	public static final JsonpDeserializer<BucketMetricValueAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, BucketMetricValueAggregate::setupBucketMetricValueAggregateDeserializer, Builder::build);

	protected static void setupBucketMetricValueAggregateDeserializer(
			DelegatingDeserializer<BucketMetricValueAggregate.Builder> op) {
		SingleMetricAggregateBase.setupSingleMetricAggregateBaseDeserializer(op);
		op.add(Builder::keys, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "keys");

	}

}
