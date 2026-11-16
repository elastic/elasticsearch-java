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
import java.lang.Boolean;
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

// typedef: inference._types.EndpointMetadata

/**
 * Metadata about an inference endpoint, such as the model it serves, where it
 * is available and what it supports. It is returned for the endpoints of the
 * Elastic Inference Service. The internal fields that Elasticsearch uses to
 * track the metadata are not part of the response.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EndpointMetadata">API
 *      specification</a>
 */
@JsonpDeserializable
public class EndpointMetadata implements JsonpSerializable {
	private final EndpointMetadataHeuristics heuristics;

	private final EndpointMetadataDisplay display;

	@Nullable
	private final EndpointMetadataModelIdentity modelIdentity;

	private final List<EndpointMetadataRegion> regions;

	@Nullable
	private final Boolean deniedByRegionPolicy;

	@Nullable
	private final EndpointMetadataCapabilities capabilities;

	// ---------------------------------------------------------------------------------------------

	private EndpointMetadata(Builder builder) {

		this.heuristics = ApiTypeHelper.requireNonNull(builder.heuristics, this, "heuristics");
		this.display = ApiTypeHelper.requireNonNull(builder.display, this, "display");
		this.modelIdentity = builder.modelIdentity;
		this.regions = ApiTypeHelper.unmodifiable(builder.regions);
		this.deniedByRegionPolicy = builder.deniedByRegionPolicy;
		this.capabilities = builder.capabilities;

	}

	public static EndpointMetadata of(Function<Builder, ObjectBuilder<EndpointMetadata>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Properties of the endpoint that help clients to determine which
	 * model to use.
	 * <p>
	 * API name: {@code heuristics}
	 */
	public final EndpointMetadataHeuristics heuristics() {
		return this.heuristics;
	}

	/**
	 * Required - Information to display for the endpoint.
	 * <p>
	 * API name: {@code display}
	 */
	public final EndpointMetadataDisplay display() {
		return this.display;
	}

	/**
	 * The identity of the model that the endpoint serves.
	 * <p>
	 * API name: {@code model_identity}
	 */
	@Nullable
	public final EndpointMetadataModelIdentity modelIdentity() {
		return this.modelIdentity;
	}

	/**
	 * The regions in which the endpoint is available.
	 * <p>
	 * API name: {@code regions}
	 */
	public final List<EndpointMetadataRegion> regions() {
		return this.regions;
	}

	/**
	 * If <code>true</code>, the region policy of the caller prohibits access to the
	 * endpoint.
	 * <p>
	 * API name: {@code denied_by_region_policy}
	 */
	@Nullable
	public final Boolean deniedByRegionPolicy() {
		return this.deniedByRegionPolicy;
	}

	/**
	 * The capabilities of the endpoint.
	 * <p>
	 * API name: {@code capabilities}
	 */
	@Nullable
	public final EndpointMetadataCapabilities capabilities() {
		return this.capabilities;
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

		generator.writeKey("heuristics");
		this.heuristics.serialize(generator, mapper);

		generator.writeKey("display");
		this.display.serialize(generator, mapper);

		if (this.modelIdentity != null) {
			generator.writeKey("model_identity");
			this.modelIdentity.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.regions)) {
			generator.writeKey("regions");
			generator.writeStartArray();
			for (EndpointMetadataRegion item0 : this.regions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.deniedByRegionPolicy != null) {
			generator.writeKey("denied_by_region_policy");
			generator.write(this.deniedByRegionPolicy);

		}
		if (this.capabilities != null) {
			generator.writeKey("capabilities");
			this.capabilities.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EndpointMetadata}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EndpointMetadata> {
		private EndpointMetadataHeuristics heuristics;

		private EndpointMetadataDisplay display;

		@Nullable
		private EndpointMetadataModelIdentity modelIdentity;

		@Nullable
		private List<EndpointMetadataRegion> regions;

		@Nullable
		private Boolean deniedByRegionPolicy;

		@Nullable
		private EndpointMetadataCapabilities capabilities;

		public Builder() {
		}
		private Builder(EndpointMetadata instance) {
			this.heuristics = instance.heuristics;
			this.display = instance.display;
			this.modelIdentity = instance.modelIdentity;
			this.regions = instance.regions;
			this.deniedByRegionPolicy = instance.deniedByRegionPolicy;
			this.capabilities = instance.capabilities;

		}
		/**
		 * Required - Properties of the endpoint that help clients to determine which
		 * model to use.
		 * <p>
		 * API name: {@code heuristics}
		 */
		public final Builder heuristics(EndpointMetadataHeuristics value) {
			this.heuristics = value;
			return this;
		}

		/**
		 * Required - Properties of the endpoint that help clients to determine which
		 * model to use.
		 * <p>
		 * API name: {@code heuristics}
		 */
		public final Builder heuristics(
				Function<EndpointMetadataHeuristics.Builder, ObjectBuilder<EndpointMetadataHeuristics>> fn) {
			return this.heuristics(fn.apply(new EndpointMetadataHeuristics.Builder()).build());
		}

		/**
		 * Required - Information to display for the endpoint.
		 * <p>
		 * API name: {@code display}
		 */
		public final Builder display(EndpointMetadataDisplay value) {
			this.display = value;
			return this;
		}

		/**
		 * Required - Information to display for the endpoint.
		 * <p>
		 * API name: {@code display}
		 */
		public final Builder display(
				Function<EndpointMetadataDisplay.Builder, ObjectBuilder<EndpointMetadataDisplay>> fn) {
			return this.display(fn.apply(new EndpointMetadataDisplay.Builder()).build());
		}

		/**
		 * The identity of the model that the endpoint serves.
		 * <p>
		 * API name: {@code model_identity}
		 */
		public final Builder modelIdentity(@Nullable EndpointMetadataModelIdentity value) {
			this.modelIdentity = value;
			return this;
		}

		/**
		 * The identity of the model that the endpoint serves.
		 * <p>
		 * API name: {@code model_identity}
		 */
		public final Builder modelIdentity(
				Function<EndpointMetadataModelIdentity.Builder, ObjectBuilder<EndpointMetadataModelIdentity>> fn) {
			return this.modelIdentity(fn.apply(new EndpointMetadataModelIdentity.Builder()).build());
		}

		/**
		 * The regions in which the endpoint is available.
		 * <p>
		 * API name: {@code regions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>regions</code>.
		 */
		public final Builder regions(List<EndpointMetadataRegion> list) {
			this.regions = _listAddAll(this.regions, list);
			return this;
		}

		/**
		 * The regions in which the endpoint is available.
		 * <p>
		 * API name: {@code regions}
		 * <p>
		 * Adds one or more values to <code>regions</code>.
		 */
		public final Builder regions(EndpointMetadataRegion value, EndpointMetadataRegion... values) {
			this.regions = _listAdd(this.regions, value, values);
			return this;
		}

		/**
		 * The regions in which the endpoint is available.
		 * <p>
		 * API name: {@code regions}
		 * <p>
		 * Adds a value to <code>regions</code> using a builder lambda.
		 */
		public final Builder regions(
				Function<EndpointMetadataRegion.Builder, ObjectBuilder<EndpointMetadataRegion>> fn) {
			return regions(fn.apply(new EndpointMetadataRegion.Builder()).build());
		}

		/**
		 * If <code>true</code>, the region policy of the caller prohibits access to the
		 * endpoint.
		 * <p>
		 * API name: {@code denied_by_region_policy}
		 */
		public final Builder deniedByRegionPolicy(@Nullable Boolean value) {
			this.deniedByRegionPolicy = value;
			return this;
		}

		/**
		 * The capabilities of the endpoint.
		 * <p>
		 * API name: {@code capabilities}
		 */
		public final Builder capabilities(@Nullable EndpointMetadataCapabilities value) {
			this.capabilities = value;
			return this;
		}

		/**
		 * The capabilities of the endpoint.
		 * <p>
		 * API name: {@code capabilities}
		 */
		public final Builder capabilities(
				Function<EndpointMetadataCapabilities.Builder, ObjectBuilder<EndpointMetadataCapabilities>> fn) {
			return this.capabilities(fn.apply(new EndpointMetadataCapabilities.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EndpointMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EndpointMetadata build() {
			_checkSingleUse();

			return new EndpointMetadata(this);
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
	 * Json deserializer for {@link EndpointMetadata}
	 */
	public static final JsonpDeserializer<EndpointMetadata> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EndpointMetadata::setupEndpointMetadataDeserializer);

	protected static void setupEndpointMetadataDeserializer(ObjectDeserializer<EndpointMetadata.Builder> op) {

		op.add(Builder::heuristics, EndpointMetadataHeuristics._DESERIALIZER, "heuristics");
		op.add(Builder::display, EndpointMetadataDisplay._DESERIALIZER, "display");
		op.add(Builder::modelIdentity, EndpointMetadataModelIdentity._DESERIALIZER, "model_identity");
		op.add(Builder::regions, JsonpDeserializer.arrayDeserializer(EndpointMetadataRegion._DESERIALIZER), "regions");
		op.add(Builder::deniedByRegionPolicy, JsonpDeserializer.booleanDeserializer(), "denied_by_region_policy");
		op.add(Builder::capabilities, EndpointMetadataCapabilities._DESERIALIZER, "capabilities");

	}

}
