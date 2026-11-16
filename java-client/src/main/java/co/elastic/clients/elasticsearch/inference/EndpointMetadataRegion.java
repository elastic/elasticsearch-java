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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: inference._types.EndpointMetadataRegion

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EndpointMetadataRegion">API
 *      specification</a>
 */
@JsonpDeserializable
public class EndpointMetadataRegion implements JsonpSerializable {
	@Nullable
	private final String csp;

	@Nullable
	private final String region;

	@Nullable
	private final String geo;

	@Nullable
	private final String regionDisplayName;

	// ---------------------------------------------------------------------------------------------

	private EndpointMetadataRegion(Builder builder) {

		this.csp = builder.csp;
		this.region = builder.region;
		this.geo = builder.geo;
		this.regionDisplayName = builder.regionDisplayName;

	}

	public static EndpointMetadataRegion of(Function<Builder, ObjectBuilder<EndpointMetadataRegion>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The cloud service provider, for example <code>aws</code>, <code>gcp</code> or
	 * <code>azure</code>.
	 * <p>
	 * API name: {@code csp}
	 */
	@Nullable
	public final String csp() {
		return this.csp;
	}

	/**
	 * The region of the cloud service provider, for example <code>us-east-1</code>.
	 * <p>
	 * API name: {@code region}
	 */
	@Nullable
	public final String region() {
		return this.region;
	}

	/**
	 * The geographic area, for example <code>us</code> or <code>eu</code>.
	 * <p>
	 * API name: {@code geo}
	 */
	@Nullable
	public final String geo() {
		return this.geo;
	}

	/**
	 * The human-readable name of the region.
	 * <p>
	 * API name: {@code region_display_name}
	 */
	@Nullable
	public final String regionDisplayName() {
		return this.regionDisplayName;
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

		if (this.csp != null) {
			generator.writeKey("csp");
			generator.write(this.csp);

		}
		if (this.region != null) {
			generator.writeKey("region");
			generator.write(this.region);

		}
		if (this.geo != null) {
			generator.writeKey("geo");
			generator.write(this.geo);

		}
		if (this.regionDisplayName != null) {
			generator.writeKey("region_display_name");
			generator.write(this.regionDisplayName);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EndpointMetadataRegion}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EndpointMetadataRegion> {
		@Nullable
		private String csp;

		@Nullable
		private String region;

		@Nullable
		private String geo;

		@Nullable
		private String regionDisplayName;

		public Builder() {
		}
		private Builder(EndpointMetadataRegion instance) {
			this.csp = instance.csp;
			this.region = instance.region;
			this.geo = instance.geo;
			this.regionDisplayName = instance.regionDisplayName;

		}
		/**
		 * The cloud service provider, for example <code>aws</code>, <code>gcp</code> or
		 * <code>azure</code>.
		 * <p>
		 * API name: {@code csp}
		 */
		public final Builder csp(@Nullable String value) {
			this.csp = value;
			return this;
		}

		/**
		 * The region of the cloud service provider, for example <code>us-east-1</code>.
		 * <p>
		 * API name: {@code region}
		 */
		public final Builder region(@Nullable String value) {
			this.region = value;
			return this;
		}

		/**
		 * The geographic area, for example <code>us</code> or <code>eu</code>.
		 * <p>
		 * API name: {@code geo}
		 */
		public final Builder geo(@Nullable String value) {
			this.geo = value;
			return this;
		}

		/**
		 * The human-readable name of the region.
		 * <p>
		 * API name: {@code region_display_name}
		 */
		public final Builder regionDisplayName(@Nullable String value) {
			this.regionDisplayName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EndpointMetadataRegion}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EndpointMetadataRegion build() {
			_checkSingleUse();

			return new EndpointMetadataRegion(this);
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
	 * Json deserializer for {@link EndpointMetadataRegion}
	 */
	public static final JsonpDeserializer<EndpointMetadataRegion> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EndpointMetadataRegion::setupEndpointMetadataRegionDeserializer);

	protected static void setupEndpointMetadataRegionDeserializer(
			ObjectDeserializer<EndpointMetadataRegion.Builder> op) {

		op.add(Builder::csp, JsonpDeserializer.stringDeserializer(), "csp");
		op.add(Builder::region, JsonpDeserializer.stringDeserializer(), "region");
		op.add(Builder::geo, JsonpDeserializer.stringDeserializer(), "geo");
		op.add(Builder::regionDisplayName, JsonpDeserializer.stringDeserializer(), "region_display_name");

	}

}
