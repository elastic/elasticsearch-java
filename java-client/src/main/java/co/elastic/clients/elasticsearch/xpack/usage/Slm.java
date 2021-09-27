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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Slm
@JsonpDeserializable
public final class Slm extends Base {
	@Nullable
	private final Integer policyCount;

	@Nullable
	private final Statistics policyStats;

	// ---------------------------------------------------------------------------------------------

	public Slm(Builder builder) {
		super(builder);

		this.policyCount = builder.policyCount;
		this.policyStats = builder.policyStats;

	}

	/**
	 * API name: {@code policy_count}
	 */
	@Nullable
	public Integer policyCount() {
		return this.policyCount;
	}

	/**
	 * API name: {@code policy_stats}
	 */
	@Nullable
	public Statistics policyStats() {
		return this.policyStats;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.policyCount != null) {

			generator.writeKey("policy_count");
			generator.write(this.policyCount);

		}
		if (this.policyStats != null) {

			generator.writeKey("policy_stats");
			this.policyStats.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Slm}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Slm> {
		@Nullable
		private Integer policyCount;

		@Nullable
		private Statistics policyStats;

		/**
		 * API name: {@code policy_count}
		 */
		public Builder policyCount(@Nullable Integer value) {
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
	 * Json deserializer for {@link Slm}
	 */
	public static final JsonpDeserializer<Slm> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Slm::setupSlmDeserializer, Builder::build);

	protected static void setupSlmDeserializer(DelegatingDeserializer<Slm.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::policyCount, JsonpDeserializer.integerDeserializer(), "policy_count");
		op.add(Builder::policyStats, Statistics._DESERIALIZER, "policy_stats");

	}

}
