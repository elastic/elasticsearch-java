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

package co.elastic.clients.elasticsearch.xpack;

import co.elastic.clients.elasticsearch.xpack.info.BuildInformation;
import co.elastic.clients.elasticsearch.xpack.info.Features;
import co.elastic.clients.elasticsearch.xpack.info.MinimalLicenseInformation;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.info.Response
@JsonpDeserializable
public final class InfoResponse implements JsonpSerializable {
	private final BuildInformation build;

	private final Features features;

	private final MinimalLicenseInformation license;

	private final String tagline;

	// ---------------------------------------------------------------------------------------------

	public InfoResponse(Builder builder) {

		this.build = Objects.requireNonNull(builder.build, "build");
		this.features = Objects.requireNonNull(builder.features, "features");
		this.license = Objects.requireNonNull(builder.license, "license");
		this.tagline = Objects.requireNonNull(builder.tagline, "tagline");

	}

	public InfoResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code build}
	 */
	public BuildInformation build() {
		return this.build;
	}

	/**
	 * API name: {@code features}
	 */
	public Features features() {
		return this.features;
	}

	/**
	 * API name: {@code license}
	 */
	public MinimalLicenseInformation license() {
		return this.license;
	}

	/**
	 * API name: {@code tagline}
	 */
	public String tagline() {
		return this.tagline;
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

		generator.writeKey("build");
		this.build.serialize(generator, mapper);

		generator.writeKey("features");
		this.features.serialize(generator, mapper);

		generator.writeKey("license");
		this.license.serialize(generator, mapper);

		generator.writeKey("tagline");
		generator.write(this.tagline);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InfoResponse}.
	 */
	public static class Builder implements ObjectBuilder<InfoResponse> {
		private BuildInformation build;

		private Features features;

		private MinimalLicenseInformation license;

		private String tagline;

		/**
		 * API name: {@code build}
		 */
		public Builder build(BuildInformation value) {
			this.build = value;
			return this;
		}

		/**
		 * API name: {@code build}
		 */
		public Builder build(Function<BuildInformation.Builder, ObjectBuilder<BuildInformation>> fn) {
			return this.build(fn.apply(new BuildInformation.Builder()).build());
		}

		/**
		 * API name: {@code features}
		 */
		public Builder features(Features value) {
			this.features = value;
			return this;
		}

		/**
		 * API name: {@code features}
		 */
		public Builder features(Function<Features.Builder, ObjectBuilder<Features>> fn) {
			return this.features(fn.apply(new Features.Builder()).build());
		}

		/**
		 * API name: {@code license}
		 */
		public Builder license(MinimalLicenseInformation value) {
			this.license = value;
			return this;
		}

		/**
		 * API name: {@code license}
		 */
		public Builder license(
				Function<MinimalLicenseInformation.Builder, ObjectBuilder<MinimalLicenseInformation>> fn) {
			return this.license(fn.apply(new MinimalLicenseInformation.Builder()).build());
		}

		/**
		 * API name: {@code tagline}
		 */
		public Builder tagline(String value) {
			this.tagline = value;
			return this;
		}

		/**
		 * Builds a {@link InfoResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InfoResponse build() {

			return new InfoResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InfoResponse}
	 */
	public static final JsonpDeserializer<InfoResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InfoResponse::setupInfoResponseDeserializer, Builder::build);

	protected static void setupInfoResponseDeserializer(DelegatingDeserializer<InfoResponse.Builder> op) {

		op.add(Builder::build, BuildInformation._DESERIALIZER, "build");
		op.add(Builder::features, Features._DESERIALIZER, "features");
		op.add(Builder::license, MinimalLicenseInformation._DESERIALIZER, "license");
		op.add(Builder::tagline, JsonpDeserializer.stringDeserializer(), "tagline");

	}

}
