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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettingsLifecycleStep

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexSettingsLifecycleStep">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexSettingsLifecycleStep implements JsonpSerializable {
	@Nullable
	private final Time waitTimeThreshold;

	// ---------------------------------------------------------------------------------------------

	private IndexSettingsLifecycleStep(Builder builder) {

		this.waitTimeThreshold = builder.waitTimeThreshold;

	}

	public static IndexSettingsLifecycleStep of(Function<Builder, ObjectBuilder<IndexSettingsLifecycleStep>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Time to wait for the cluster to resolve allocation issues during an ILM
	 * shrink action. Must be greater than 1h (1 hour). See Shard allocation for
	 * shrink.
	 * <p>
	 * API name: {@code wait_time_threshold}
	 */
	@Nullable
	public final Time waitTimeThreshold() {
		return this.waitTimeThreshold;
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

		if (this.waitTimeThreshold != null) {
			generator.writeKey("wait_time_threshold");
			this.waitTimeThreshold.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingsLifecycleStep}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexSettingsLifecycleStep> {
		@Nullable
		private Time waitTimeThreshold;

		/**
		 * Time to wait for the cluster to resolve allocation issues during an ILM
		 * shrink action. Must be greater than 1h (1 hour). See Shard allocation for
		 * shrink.
		 * <p>
		 * API name: {@code wait_time_threshold}
		 */
		public final Builder waitTimeThreshold(@Nullable Time value) {
			this.waitTimeThreshold = value;
			return this;
		}

		/**
		 * Time to wait for the cluster to resolve allocation issues during an ILM
		 * shrink action. Must be greater than 1h (1 hour). See Shard allocation for
		 * shrink.
		 * <p>
		 * API name: {@code wait_time_threshold}
		 */
		public final Builder waitTimeThreshold(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.waitTimeThreshold(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSettingsLifecycleStep}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingsLifecycleStep build() {
			_checkSingleUse();

			return new IndexSettingsLifecycleStep(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexSettingsLifecycleStep}
	 */
	public static final JsonpDeserializer<IndexSettingsLifecycleStep> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexSettingsLifecycleStep::setupIndexSettingsLifecycleStepDeserializer);

	protected static void setupIndexSettingsLifecycleStepDeserializer(
			ObjectDeserializer<IndexSettingsLifecycleStep.Builder> op) {

		op.add(Builder::waitTimeThreshold, Time._DESERIALIZER, "wait_time_threshold");

	}

}
