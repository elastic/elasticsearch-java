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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: xpack.usage.Ilm

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Ilm">API
 *      specification</a>
 */
@JsonpDeserializable
public class Ilm implements JsonpSerializable {
	private final int policyCount;

	private final List<IlmPolicyStatistics> policyStats;

	// ---------------------------------------------------------------------------------------------

	private Ilm(Builder builder) {

		this.policyCount = ApiTypeHelper.requireNonNull(builder.policyCount, this, "policyCount");
		this.policyStats = ApiTypeHelper.unmodifiableRequired(builder.policyStats, this, "policyStats");

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

		if (ApiTypeHelper.isDefined(this.policyStats)) {
			generator.writeKey("policy_stats");
			generator.writeStartArray();
			for (IlmPolicyStatistics item0 : this.policyStats) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ilm}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Ilm> {
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>policyStats</code>.
		 */
		public final Builder policyStats(List<IlmPolicyStatistics> list) {
			this.policyStats = _listAddAll(this.policyStats, list);
			return this;
		}

		/**
		 * Required - API name: {@code policy_stats}
		 * <p>
		 * Adds one or more values to <code>policyStats</code>.
		 */
		public final Builder policyStats(IlmPolicyStatistics value, IlmPolicyStatistics... values) {
			this.policyStats = _listAdd(this.policyStats, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code policy_stats}
		 * <p>
		 * Adds a value to <code>policyStats</code> using a builder lambda.
		 */
		public final Builder policyStats(Function<IlmPolicyStatistics.Builder, ObjectBuilder<IlmPolicyStatistics>> fn) {
			return policyStats(fn.apply(new IlmPolicyStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
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
			Ilm::setupIlmDeserializer);

	protected static void setupIlmDeserializer(ObjectDeserializer<Ilm.Builder> op) {

		op.add(Builder::policyCount, JsonpDeserializer.integerDeserializer(), "policy_count");
		op.add(Builder::policyStats, JsonpDeserializer.arrayDeserializer(IlmPolicyStatistics._DESERIALIZER),
				"policy_stats");

	}

}
