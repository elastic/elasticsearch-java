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

// typedef: xpack.info.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#xpack.info.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class XpackInfoResponse implements JsonpSerializable {
	private final BuildInformation build;

	private final Features features;

	private final MinimalLicenseInformation license;

	private final String tagline;

	// ---------------------------------------------------------------------------------------------

	private XpackInfoResponse(Builder builder) {

		this.build = ApiTypeHelper.requireNonNull(builder.build, this, "build");
		this.features = ApiTypeHelper.requireNonNull(builder.features, this, "features");
		this.license = ApiTypeHelper.requireNonNull(builder.license, this, "license");
		this.tagline = ApiTypeHelper.requireNonNull(builder.tagline, this, "tagline");

	}

	public static XpackInfoResponse of(Function<Builder, ObjectBuilder<XpackInfoResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code build}
	 */
	public final BuildInformation build() {
		return this.build;
	}

	/**
	 * Required - API name: {@code features}
	 */
	public final Features features() {
		return this.features;
	}

	/**
	 * Required - API name: {@code license}
	 */
	public final MinimalLicenseInformation license() {
		return this.license;
	}

	/**
	 * Required - API name: {@code tagline}
	 */
	public final String tagline() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link XpackInfoResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<XpackInfoResponse> {
		private BuildInformation build;

		private Features features;

		private MinimalLicenseInformation license;

		private String tagline;

		/**
		 * Required - API name: {@code build}
		 */
		public final Builder build(BuildInformation value) {
			this.build = value;
			return this;
		}

		/**
		 * Required - API name: {@code build}
		 */
		public final Builder build(Function<BuildInformation.Builder, ObjectBuilder<BuildInformation>> fn) {
			return this.build(fn.apply(new BuildInformation.Builder()).build());
		}

		/**
		 * Required - API name: {@code features}
		 */
		public final Builder features(Features value) {
			this.features = value;
			return this;
		}

		/**
		 * Required - API name: {@code features}
		 */
		public final Builder features(Function<Features.Builder, ObjectBuilder<Features>> fn) {
			return this.features(fn.apply(new Features.Builder()).build());
		}

		/**
		 * Required - API name: {@code license}
		 */
		public final Builder license(MinimalLicenseInformation value) {
			this.license = value;
			return this;
		}

		/**
		 * Required - API name: {@code license}
		 */
		public final Builder license(
				Function<MinimalLicenseInformation.Builder, ObjectBuilder<MinimalLicenseInformation>> fn) {
			return this.license(fn.apply(new MinimalLicenseInformation.Builder()).build());
		}

		/**
		 * Required - API name: {@code tagline}
		 */
		public final Builder tagline(String value) {
			this.tagline = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link XpackInfoResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public XpackInfoResponse build() {
			_checkSingleUse();

			return new XpackInfoResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link XpackInfoResponse}
	 */
	public static final JsonpDeserializer<XpackInfoResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, XpackInfoResponse::setupXpackInfoResponseDeserializer);

	protected static void setupXpackInfoResponseDeserializer(ObjectDeserializer<XpackInfoResponse.Builder> op) {

		op.add(Builder::build, BuildInformation._DESERIALIZER, "build");
		op.add(Builder::features, Features._DESERIALIZER, "features");
		op.add(Builder::license, MinimalLicenseInformation._DESERIALIZER, "license");
		op.add(Builder::tagline, JsonpDeserializer.stringDeserializer(), "tagline");

	}

}
