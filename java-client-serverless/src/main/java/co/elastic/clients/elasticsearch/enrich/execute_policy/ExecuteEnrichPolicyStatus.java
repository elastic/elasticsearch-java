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

package co.elastic.clients.elasticsearch.enrich.execute_policy;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.execute_policy.ExecuteEnrichPolicyStatus

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#enrich.execute_policy.ExecuteEnrichPolicyStatus">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecuteEnrichPolicyStatus implements JsonpSerializable {
	private final EnrichPolicyPhase phase;

	// ---------------------------------------------------------------------------------------------

	private ExecuteEnrichPolicyStatus(Builder builder) {

		this.phase = ApiTypeHelper.requireNonNull(builder.phase, this, "phase");

	}

	public static ExecuteEnrichPolicyStatus of(Function<Builder, ObjectBuilder<ExecuteEnrichPolicyStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code phase}
	 */
	public final EnrichPolicyPhase phase() {
		return this.phase;
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

		generator.writeKey("phase");
		this.phase.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteEnrichPolicyStatus}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExecuteEnrichPolicyStatus> {
		private EnrichPolicyPhase phase;

		/**
		 * Required - API name: {@code phase}
		 */
		public final Builder phase(EnrichPolicyPhase value) {
			this.phase = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecuteEnrichPolicyStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteEnrichPolicyStatus build() {
			_checkSingleUse();

			return new ExecuteEnrichPolicyStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecuteEnrichPolicyStatus}
	 */
	public static final JsonpDeserializer<ExecuteEnrichPolicyStatus> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecuteEnrichPolicyStatus::setupExecuteEnrichPolicyStatusDeserializer);

	protected static void setupExecuteEnrichPolicyStatusDeserializer(
			ObjectDeserializer<ExecuteEnrichPolicyStatus.Builder> op) {

		op.add(Builder::phase, EnrichPolicyPhase._DESERIALIZER, "phase");

	}

}
