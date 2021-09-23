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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Analytics
public final class Analytics extends Base {
	private final AnalyticsStatistics stats;

	// ---------------------------------------------------------------------------------------------

	public Analytics(Builder builder) {
		super(builder);

		this.stats = Objects.requireNonNull(builder.stats, "stats");

	}

	/**
	 * API name: {@code stats}
	 */
	public AnalyticsStatistics stats() {
		return this.stats;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Analytics}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Analytics> {
		private AnalyticsStatistics stats;

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(AnalyticsStatistics value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(Function<AnalyticsStatistics.Builder, ObjectBuilder<AnalyticsStatistics>> fn) {
			return this.stats(fn.apply(new AnalyticsStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Analytics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Analytics build() {

			return new Analytics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Analytics}
	 */
	public static final JsonpDeserializer<Analytics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Analytics::setupAnalyticsDeserializer);

	protected static void setupAnalyticsDeserializer(DelegatingDeserializer<Analytics.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::stats, AnalyticsStatistics.DESERIALIZER, "stats");

	}

}
