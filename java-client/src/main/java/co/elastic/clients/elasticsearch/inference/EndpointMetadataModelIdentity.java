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

// typedef: inference._types.EndpointMetadataModelIdentity

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EndpointMetadataModelIdentity">API
 *      specification</a>
 */
@JsonpDeserializable
public class EndpointMetadataModelIdentity implements JsonpSerializable {
	@Nullable
	private final String creator;

	@Nullable
	private final String family;

	@Nullable
	private final String tier;

	@Nullable
	private final String version;

	// ---------------------------------------------------------------------------------------------

	private EndpointMetadataModelIdentity(Builder builder) {

		this.creator = builder.creator;
		this.family = builder.family;
		this.tier = builder.tier;
		this.version = builder.version;

	}

	public static EndpointMetadataModelIdentity of(Function<Builder, ObjectBuilder<EndpointMetadataModelIdentity>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The model creator or lab, for example <code>anthropic</code>,
	 * <code>openai</code> or <code>jina</code>.
	 * <p>
	 * API name: {@code creator}
	 */
	@Nullable
	public final String creator() {
		return this.creator;
	}

	/**
	 * The model family within the creator, for example <code>claude</code>,
	 * <code>gpt</code> or <code>gemini</code>.
	 * <p>
	 * API name: {@code family}
	 */
	@Nullable
	public final String family() {
		return this.family;
	}

	/**
	 * The performance or size tier within the family, for example
	 * <code>sonnet</code> or <code>mini</code>. It is not set if the model has no
	 * tier variants.
	 * <p>
	 * API name: {@code tier}
	 */
	@Nullable
	public final String tier() {
		return this.tier;
	}

	/**
	 * The version of the model.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
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

		if (this.creator != null) {
			generator.writeKey("creator");
			generator.write(this.creator);

		}
		if (this.family != null) {
			generator.writeKey("family");
			generator.write(this.family);

		}
		if (this.tier != null) {
			generator.writeKey("tier");
			generator.write(this.tier);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EndpointMetadataModelIdentity}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EndpointMetadataModelIdentity> {
		@Nullable
		private String creator;

		@Nullable
		private String family;

		@Nullable
		private String tier;

		@Nullable
		private String version;

		public Builder() {
		}
		private Builder(EndpointMetadataModelIdentity instance) {
			this.creator = instance.creator;
			this.family = instance.family;
			this.tier = instance.tier;
			this.version = instance.version;

		}
		/**
		 * The model creator or lab, for example <code>anthropic</code>,
		 * <code>openai</code> or <code>jina</code>.
		 * <p>
		 * API name: {@code creator}
		 */
		public final Builder creator(@Nullable String value) {
			this.creator = value;
			return this;
		}

		/**
		 * The model family within the creator, for example <code>claude</code>,
		 * <code>gpt</code> or <code>gemini</code>.
		 * <p>
		 * API name: {@code family}
		 */
		public final Builder family(@Nullable String value) {
			this.family = value;
			return this;
		}

		/**
		 * The performance or size tier within the family, for example
		 * <code>sonnet</code> or <code>mini</code>. It is not set if the model has no
		 * tier variants.
		 * <p>
		 * API name: {@code tier}
		 */
		public final Builder tier(@Nullable String value) {
			this.tier = value;
			return this;
		}

		/**
		 * The version of the model.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EndpointMetadataModelIdentity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EndpointMetadataModelIdentity build() {
			_checkSingleUse();

			return new EndpointMetadataModelIdentity(this);
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
	 * Json deserializer for {@link EndpointMetadataModelIdentity}
	 */
	public static final JsonpDeserializer<EndpointMetadataModelIdentity> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EndpointMetadataModelIdentity::setupEndpointMetadataModelIdentityDeserializer);

	protected static void setupEndpointMetadataModelIdentityDeserializer(
			ObjectDeserializer<EndpointMetadataModelIdentity.Builder> op) {

		op.add(Builder::creator, JsonpDeserializer.stringDeserializer(), "creator");
		op.add(Builder::family, JsonpDeserializer.stringDeserializer(), "family");
		op.add(Builder::tier, JsonpDeserializer.stringDeserializer(), "tier");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
