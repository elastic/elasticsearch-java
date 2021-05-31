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

import co.elastic.clients.elasticsearch.slm.Statistics;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Slm
public final class Slm extends Base {
	@Nullable
	private final Number policyCount;

	@Nullable
	private final Statistics policyStats;

	// ---------------------------------------------------------------------------------------------

	protected Slm(Builder builder) {
		super(builder);
		this.policyCount = builder.policyCount;
		this.policyStats = builder.policyStats;

	}

	/**
	 * API name: {@code policy_count}
	 */
	@Nullable
	public Number policyCount() {
		return this.policyCount;
	}

	/**
	 * API name: {@code policy_stats}
	 */
	@Nullable
	public Statistics policyStats() {
		return this.policyStats;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.policyCount != null) {

			generator.writeKey("policy_count");
			generator.write(this.policyCount.doubleValue());

		}
		if (this.policyStats != null) {

			generator.writeKey("policy_stats");
			this.policyStats.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Slm}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Slm> {
		@Nullable
		private Number policyCount;

		@Nullable
		private Statistics policyStats;

		/**
		 * API name: {@code policy_count}
		 */
		public Builder policyCount(@Nullable Number value) {
			this.policyCount = value;
			return this;
		}

		/**
		 * API name: {@code policy_stats}
		 */
		public Builder policyStats(@Nullable Statistics value) {
			this.policyStats = value;
			return this;
		}

		/**
		 * API name: {@code policy_stats}
		 */
		public Builder policyStats(Function<Statistics.Builder, ObjectBuilder<Statistics>> fn) {
			return this.policyStats(fn.apply(new Statistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Slm}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Slm build() {

			return new Slm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for Slm
	 */
	public static final JsonpValueParser<Slm> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			Slm::setupSlmParser);

	protected static void setupSlmParser(DelegatingJsonpValueParser<Slm.Builder> op) {
		Base.setupBaseParser(op);
		op.add(Builder::policyCount, JsonpValueParser.numberParser(), "policy_count");
		op.add(Builder::policyStats, Statistics.JSONP_PARSER, "policy_stats");

	}

}
