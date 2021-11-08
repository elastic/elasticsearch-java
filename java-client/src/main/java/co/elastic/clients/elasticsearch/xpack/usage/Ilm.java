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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Ilm
@JsonpDeserializable
public class Ilm implements JsonpSerializable {
	private final int policyCount;

	private final List<IlmPolicyStatistics> policyStats;

	// ---------------------------------------------------------------------------------------------

	private Ilm(Builder builder) {

		this.policyCount = ModelTypeHelper.requireNonNull(builder.policyCount, this, "policyCount");
		this.policyStats = ModelTypeHelper.unmodifiableRequired(builder.policyStats, this, "policyStats");

	}

	public static Ilm of(Function<Builder, ObjectBuilder<Ilm>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code policy_count}
	 */
	public final int policyCount() {
		return this.policyCount;
	}

	/**
	 * Required - API name: {@code policy_stats}
	 */
	public final List<IlmPolicyStatistics> policyStats() {
		return this.policyStats;
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

		generator.writeKey("policy_count");
		generator.write(this.policyCount);

		if (ModelTypeHelper.isDefined(this.policyStats)) {
			generator.writeKey("policy_stats");
			generator.writeStartArray();
			for (IlmPolicyStatistics item0 : this.policyStats) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ilm}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Ilm> {
		private Integer policyCount;

		private List<IlmPolicyStatistics> policyStats;

		/**
		 * Required - API name: {@code policy_count}
		 */
		public final Builder policyCount(int value) {
			this.policyCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy_stats}
		 */
		public final Builder policyStats(List<IlmPolicyStatistics> value) {
			this.policyStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy_stats}
		 */
		public final Builder policyStats(IlmPolicyStatistics... value) {
			this.policyStats = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code policy_stats}
		 */
		@SafeVarargs
		public final Builder policyStats(
				Function<IlmPolicyStatistics.Builder, ObjectBuilder<IlmPolicyStatistics>>... fns) {
			this.policyStats = new ArrayList<>(fns.length);
			for (Function<IlmPolicyStatistics.Builder, ObjectBuilder<IlmPolicyStatistics>> fn : fns) {
				this.policyStats.add(fn.apply(new IlmPolicyStatistics.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link Ilm}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ilm build() {
			_checkSingleUse();

			return new Ilm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Ilm}
	 */
	public static final JsonpDeserializer<Ilm> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Ilm::setupIlmDeserializer, Builder::build);

	protected static void setupIlmDeserializer(DelegatingDeserializer<Ilm.Builder> op) {

		op.add(Builder::policyCount, JsonpDeserializer.integerDeserializer(), "policy_count");
		op.add(Builder::policyStats, JsonpDeserializer.arrayDeserializer(IlmPolicyStatistics._DESERIALIZER),
				"policy_stats");

	}

}
