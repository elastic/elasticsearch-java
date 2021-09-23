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

package co.elastic.clients.elasticsearch.rollup.get_rollup_caps;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_caps.RollupCapabilities
public final class RollupCapabilities implements JsonpSerializable {
	private final List<RollupCapabilitySummary> rollupJobs;

	// ---------------------------------------------------------------------------------------------

	public RollupCapabilities(Builder builder) {

		this.rollupJobs = Objects.requireNonNull(builder.rollupJobs, "rollup_jobs");

	}

	/**
	 * API name: {@code rollup_jobs}
	 */
	public List<RollupCapabilitySummary> rollupJobs() {
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

		generator.writeKey("rollup_jobs");
		generator.writeStartArray();
		for (RollupCapabilitySummary item0 : this.rollupJobs) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupCapabilities}.
	 */
	public static class Builder implements ObjectBuilder<RollupCapabilities> {
		private List<RollupCapabilitySummary> rollupJobs;

		/**
		 * API name: {@code rollup_jobs}
		 */
		public Builder rollupJobs(List<RollupCapabilitySummary> value) {
			this.rollupJobs = value;
			return this;
		}

		/**
		 * API name: {@code rollup_jobs}
		 */
		public Builder rollupJobs(RollupCapabilitySummary... value) {
			this.rollupJobs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #rollupJobs(List)}, creating the list if needed.
		 */
		public Builder addRollupJobs(RollupCapabilitySummary value) {
			if (this.rollupJobs == null) {
				this.rollupJobs = new ArrayList<>();
			}
			this.rollupJobs.add(value);
			return this;
		}

		/**
		 * Set {@link #rollupJobs(List)} to a singleton list.
		 */
		public Builder rollupJobs(
				Function<RollupCapabilitySummary.Builder, ObjectBuilder<RollupCapabilitySummary>> fn) {
			return this.rollupJobs(fn.apply(new RollupCapabilitySummary.Builder()).build());
		}

		/**
		 * Add a value to {@link #rollupJobs(List)}, creating the list if needed.
		 */
		public Builder addRollupJobs(
				Function<RollupCapabilitySummary.Builder, ObjectBuilder<RollupCapabilitySummary>> fn) {
			return this.addRollupJobs(fn.apply(new RollupCapabilitySummary.Builder()).build());
		}

		/**
		 * Builds a {@link RollupCapabilities}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupCapabilities build() {

			return new RollupCapabilities(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupCapabilities}
	 */
	public static final JsonpDeserializer<RollupCapabilities> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RollupCapabilities::setupRollupCapabilitiesDeserializer);

	protected static void setupRollupCapabilitiesDeserializer(DelegatingDeserializer<RollupCapabilities.Builder> op) {

		op.add(Builder::rollupJobs, JsonpDeserializer.arrayDeserializer(RollupCapabilitySummary.DESERIALIZER),
				"rollup_jobs");

	}

}
