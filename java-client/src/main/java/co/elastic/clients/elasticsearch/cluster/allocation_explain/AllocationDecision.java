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

package co.elastic.clients.elasticsearch.cluster.allocation_explain;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.AllocationDecision

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.allocation_explain.AllocationDecision">API
 *      specification</a>
 */
@JsonpDeserializable
public class AllocationDecision implements JsonpSerializable {
	private final String decider;

	private final AllocationExplainDecision decision;

	private final String explanation;

	// ---------------------------------------------------------------------------------------------

	private AllocationDecision(Builder builder) {

		this.decider = ApiTypeHelper.requireNonNull(builder.decider, this, "decider");
		this.decision = ApiTypeHelper.requireNonNull(builder.decision, this, "decision");
		this.explanation = ApiTypeHelper.requireNonNull(builder.explanation, this, "explanation");

	}

	public static AllocationDecision of(Function<Builder, ObjectBuilder<AllocationDecision>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code decider}
	 */
	public final String decider() {
		return this.decider;
	}

	/**
	 * Required - API name: {@code decision}
	 */
	public final AllocationExplainDecision decision() {
		return this.decision;
	}

	/**
	 * Required - API name: {@code explanation}
	 */
	public final String explanation() {
		return this.explanation;
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

		generator.writeKey("decider");
		generator.write(this.decider);

		generator.writeKey("decision");
		this.decision.serialize(generator, mapper);
		generator.writeKey("explanation");
		generator.write(this.explanation);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationDecision}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AllocationDecision> {
		private String decider;

		private AllocationExplainDecision decision;

		private String explanation;

		/**
		 * Required - API name: {@code decider}
		 */
		public final Builder decider(String value) {
			this.decider = value;
			return this;
		}

		/**
		 * Required - API name: {@code decision}
		 */
		public final Builder decision(AllocationExplainDecision value) {
			this.decision = value;
			return this;
		}

		/**
		 * Required - API name: {@code explanation}
		 */
		public final Builder explanation(String value) {
			this.explanation = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AllocationDecision}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationDecision build() {
			_checkSingleUse();

			return new AllocationDecision(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AllocationDecision}
	 */
	public static final JsonpDeserializer<AllocationDecision> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AllocationDecision::setupAllocationDecisionDeserializer);

	protected static void setupAllocationDecisionDeserializer(ObjectDeserializer<AllocationDecision.Builder> op) {

		op.add(Builder::decider, JsonpDeserializer.stringDeserializer(), "decider");
		op.add(Builder::decision, AllocationExplainDecision._DESERIALIZER, "decision");
		op.add(Builder::explanation, JsonpDeserializer.stringDeserializer(), "explanation");

	}

}
