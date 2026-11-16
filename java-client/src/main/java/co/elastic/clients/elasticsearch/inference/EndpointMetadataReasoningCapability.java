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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference._types.EndpointMetadataReasoningCapability

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EndpointMetadataReasoningCapability">API
 *      specification</a>
 */
@JsonpDeserializable
public class EndpointMetadataReasoningCapability implements JsonpSerializable {
	private final List<ReasoningEffort> supportedEffortLevels;

	@Nullable
	private final ReasoningEffort defaultEffortLevel;

	// ---------------------------------------------------------------------------------------------

	private EndpointMetadataReasoningCapability(Builder builder) {

		this.supportedEffortLevels = ApiTypeHelper.unmodifiableRequired(builder.supportedEffortLevels, this,
				"supportedEffortLevels");
		this.defaultEffortLevel = builder.defaultEffortLevel;

	}

	public static EndpointMetadataReasoningCapability of(
			Function<Builder, ObjectBuilder<EndpointMetadataReasoningCapability>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The reasoning effort levels that the endpoint supports.
	 * <p>
	 * API name: {@code supported_effort_levels}
	 */
	public final List<ReasoningEffort> supportedEffortLevels() {
		return this.supportedEffortLevels;
	}

	/**
	 * The reasoning effort level that the endpoint uses by default.
	 * <p>
	 * API name: {@code default_effort_level}
	 */
	@Nullable
	public final ReasoningEffort defaultEffortLevel() {
		return this.defaultEffortLevel;
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

		if (ApiTypeHelper.isDefined(this.supportedEffortLevels)) {
			generator.writeKey("supported_effort_levels");
			generator.writeStartArray();
			for (ReasoningEffort item0 : this.supportedEffortLevels) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.defaultEffortLevel != null) {
			generator.writeKey("default_effort_level");
			this.defaultEffortLevel.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EndpointMetadataReasoningCapability}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EndpointMetadataReasoningCapability> {
		private List<ReasoningEffort> supportedEffortLevels;

		@Nullable
		private ReasoningEffort defaultEffortLevel;

		public Builder() {
		}
		private Builder(EndpointMetadataReasoningCapability instance) {
			this.supportedEffortLevels = instance.supportedEffortLevels;
			this.defaultEffortLevel = instance.defaultEffortLevel;

		}
		/**
		 * Required - The reasoning effort levels that the endpoint supports.
		 * <p>
		 * API name: {@code supported_effort_levels}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>supportedEffortLevels</code>.
		 */
		public final Builder supportedEffortLevels(List<ReasoningEffort> list) {
			this.supportedEffortLevels = _listAddAll(this.supportedEffortLevels, list);
			return this;
		}

		/**
		 * Required - The reasoning effort levels that the endpoint supports.
		 * <p>
		 * API name: {@code supported_effort_levels}
		 * <p>
		 * Adds one or more values to <code>supportedEffortLevels</code>.
		 */
		public final Builder supportedEffortLevels(ReasoningEffort value, ReasoningEffort... values) {
			this.supportedEffortLevels = _listAdd(this.supportedEffortLevels, value, values);
			return this;
		}

		/**
		 * The reasoning effort level that the endpoint uses by default.
		 * <p>
		 * API name: {@code default_effort_level}
		 */
		public final Builder defaultEffortLevel(@Nullable ReasoningEffort value) {
			this.defaultEffortLevel = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EndpointMetadataReasoningCapability}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EndpointMetadataReasoningCapability build() {
			_checkSingleUse();

			return new EndpointMetadataReasoningCapability(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EndpointMetadataReasoningCapability}
	 */
	public static final JsonpDeserializer<EndpointMetadataReasoningCapability> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					EndpointMetadataReasoningCapability::setupEndpointMetadataReasoningCapabilityDeserializer);

	protected static void setupEndpointMetadataReasoningCapabilityDeserializer(
			ObjectDeserializer<EndpointMetadataReasoningCapability.Builder> op) {

		op.add(Builder::supportedEffortLevels, JsonpDeserializer.arrayDeserializer(ReasoningEffort._DESERIALIZER),
				"supported_effort_levels");
		op.add(Builder::defaultEffortLevel, ReasoningEffort._DESERIALIZER, "default_effort_level");

	}

}
