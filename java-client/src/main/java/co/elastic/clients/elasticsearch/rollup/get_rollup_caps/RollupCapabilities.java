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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_caps.RollupCapabilities
@JsonpDeserializable
public class RollupCapabilities implements JsonpSerializable {
	private final List<RollupCapabilitySummary> rollupJobs;

	// ---------------------------------------------------------------------------------------------

	private RollupCapabilities(Builder builder) {

		this.rollupJobs = ModelTypeHelper.unmodifiableRequired(builder.rollupJobs, this, "rollupJobs");

	}

	public static RollupCapabilities of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code rollup_jobs}
	 */
	public final List<RollupCapabilitySummary> rollupJobs() {
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
			for (RollupCapabilitySummary item0 : this.rollupJobs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupCapabilities}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RollupCapabilities> {
		private List<RollupCapabilitySummary> rollupJobs;

		/**
		 * Required - API name: {@code rollup_jobs}
		 */
		public final Builder rollupJobs(List<RollupCapabilitySummary> value) {
			this.rollupJobs = value;
			return this;
		}

		/**
		 * Required - API name: {@code rollup_jobs}
		 */
		public final Builder rollupJobs(RollupCapabilitySummary... value) {
			this.rollupJobs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code rollup_jobs}
		 */
		public final Builder rollupJobs(
				Function<ListBuilder<RollupCapabilitySummary, RollupCapabilitySummary.Builder>, ObjectBuilder<List<RollupCapabilitySummary>>> fn) {
			return rollupJobs(fn.apply(new ListBuilder<>(RollupCapabilitySummary.Builder::new)).build());
		}

		/**
		 * Builds a {@link RollupCapabilities}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupCapabilities build() {
			_checkSingleUse();

			return new RollupCapabilities(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupCapabilities}
	 */
	public static final JsonpDeserializer<RollupCapabilities> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RollupCapabilities::setupRollupCapabilitiesDeserializer);

	protected static void setupRollupCapabilitiesDeserializer(ObjectDeserializer<RollupCapabilities.Builder> op) {

		op.add(Builder::rollupJobs, JsonpDeserializer.arrayDeserializer(RollupCapabilitySummary._DESERIALIZER),
				"rollup_jobs");

	}

}
