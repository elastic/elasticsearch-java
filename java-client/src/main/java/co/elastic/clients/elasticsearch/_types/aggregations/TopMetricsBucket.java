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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TopMetricsBucket
@JsonpDeserializable
public class TopMetricsBucket extends MultiBucketBase {
	private final List<TopMetrics> top;

	// ---------------------------------------------------------------------------------------------

	private TopMetricsBucket(Builder builder) {
		super(builder);

		this.top = ModelTypeHelper.unmodifiableRequired(builder.top, this, "top");

	}

	public static TopMetricsBucket of(Function<Builder, ObjectBuilder<TopMetricsBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code top}
	 */
	public final List<TopMetrics> top() {
		return this.top;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.top)) {
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
	 * Builder for {@link TopMetricsBucket}.
	 */
	public static class Builder extends MultiBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TopMetricsBucket> {
		private List<TopMetrics> top;

		/**
		 * Required - API name: {@code top}
		 */
		public final Builder top(List<TopMetrics> value) {
			this.top = value;
			return this;
		}

		/**
		 * Required - API name: {@code top}
		 */
		public final Builder top(TopMetrics... value) {
			this.top = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code top}
		 */
		@SafeVarargs
		public final Builder top(Function<TopMetrics.Builder, ObjectBuilder<TopMetrics>>... fns) {
			this.top = new ArrayList<>(fns.length);
			for (Function<TopMetrics.Builder, ObjectBuilder<TopMetrics>> fn : fns) {
				this.top.add(fn.apply(new TopMetrics.Builder()).build());
			}
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TopMetricsBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopMetricsBucket build() {
			_checkSingleUse();

			return new TopMetricsBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopMetricsBucket}
	 */
	public static final JsonpDeserializer<TopMetricsBucket> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TopMetricsBucket::setupTopMetricsBucketDeserializer, Builder::build);

	protected static void setupTopMetricsBucketDeserializer(DelegatingDeserializer<TopMetricsBucket.Builder> op) {
		MultiBucketBase.setupMultiBucketBaseDeserializer(op);
		op.add(Builder::top, JsonpDeserializer.arrayDeserializer(TopMetrics._DESERIALIZER), "top");

	}

}
