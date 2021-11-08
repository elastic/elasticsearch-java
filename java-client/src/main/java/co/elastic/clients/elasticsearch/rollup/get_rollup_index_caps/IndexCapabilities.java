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

package co.elastic.clients.elasticsearch.rollup.get_rollup_index_caps;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_index_caps.IndexCapabilities
@JsonpDeserializable
public class IndexCapabilities implements JsonpSerializable {
	private final List<RollupJobSummary> rollupJobs;

	// ---------------------------------------------------------------------------------------------

	private IndexCapabilities(Builder builder) {

		this.rollupJobs = ModelTypeHelper.unmodifiableRequired(builder.rollupJobs, this, "rollupJobs");

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

		if (ModelTypeHelper.isDefined(this.rollupJobs)) {
			generator.writeKey("rollup_jobs");
			generator.writeStartArray();
			for (RollupJobSummary item0 : this.rollupJobs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexCapabilities}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexCapabilities> {
		private List<RollupJobSummary> rollupJobs;

		/**
		 * Required - API name: {@code rollup_jobs}
		 */
		public final Builder rollupJobs(List<RollupJobSummary> value) {
			this.rollupJobs = value;
			return this;
		}

		/**
		 * Required - API name: {@code rollup_jobs}
		 */
		public final Builder rollupJobs(RollupJobSummary... value) {
			this.rollupJobs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code rollup_jobs}
		 */
		@SafeVarargs
		public final Builder rollupJobs(Function<RollupJobSummary.Builder, ObjectBuilder<RollupJobSummary>>... fns) {
			this.rollupJobs = new ArrayList<>(fns.length);
			for (Function<RollupJobSummary.Builder, ObjectBuilder<RollupJobSummary>> fn : fns) {
				this.rollupJobs.add(fn.apply(new RollupJobSummary.Builder()).build());
			}
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
			.lazy(Builder::new, IndexCapabilities::setupIndexCapabilitiesDeserializer, Builder::build);

	protected static void setupIndexCapabilitiesDeserializer(DelegatingDeserializer<IndexCapabilities.Builder> op) {

		op.add(Builder::rollupJobs, JsonpDeserializer.arrayDeserializer(RollupJobSummary._DESERIALIZER), "rollup_jobs");

	}

}
