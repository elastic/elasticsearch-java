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

package co.elastic.clients.elasticsearch.rollup.get_rollup_index_caps;

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

// typedef: rollup.get_rollup_index_caps.IndexCapabilities

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#rollup.get_rollup_index_caps.IndexCapabilities">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexCapabilities implements JsonpSerializable {
	private final List<RollupJobSummary> rollupJobs;

	// ---------------------------------------------------------------------------------------------

	private IndexCapabilities(Builder builder) {

		this.rollupJobs = ApiTypeHelper.unmodifiableRequired(builder.rollupJobs, this, "rollupJobs");

	}

	public static IndexCapabilities of(Function<Builder, ObjectBuilder<IndexCapabilities>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code rollup_jobs}
	 */
	public final List<RollupJobSummary> rollupJobs() {
		return this.rollupJobs;
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

		if (ApiTypeHelper.isDefined(this.rollupJobs)) {
			generator.writeKey("rollup_jobs");
			generator.writeStartArray();
			for (RollupJobSummary item0 : this.rollupJobs) {
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
	 * Builder for {@link IndexCapabilities}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndexCapabilities> {
		private List<RollupJobSummary> rollupJobs;

		/**
		 * Required - API name: {@code rollup_jobs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rollupJobs</code>.
		 */
		public final Builder rollupJobs(List<RollupJobSummary> list) {
			this.rollupJobs = _listAddAll(this.rollupJobs, list);
			return this;
		}

		/**
		 * Required - API name: {@code rollup_jobs}
		 * <p>
		 * Adds one or more values to <code>rollupJobs</code>.
		 */
		public final Builder rollupJobs(RollupJobSummary value, RollupJobSummary... values) {
			this.rollupJobs = _listAdd(this.rollupJobs, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code rollup_jobs}
		 * <p>
		 * Adds a value to <code>rollupJobs</code> using a builder lambda.
		 */
		public final Builder rollupJobs(Function<RollupJobSummary.Builder, ObjectBuilder<RollupJobSummary>> fn) {
			return rollupJobs(fn.apply(new RollupJobSummary.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexCapabilities}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexCapabilities build() {
			_checkSingleUse();

			return new IndexCapabilities(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexCapabilities}
	 */
	public static final JsonpDeserializer<IndexCapabilities> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexCapabilities::setupIndexCapabilitiesDeserializer);

	protected static void setupIndexCapabilitiesDeserializer(ObjectDeserializer<IndexCapabilities.Builder> op) {

		op.add(Builder::rollupJobs, JsonpDeserializer.arrayDeserializer(RollupJobSummary._DESERIALIZER), "rollup_jobs");

	}

}
