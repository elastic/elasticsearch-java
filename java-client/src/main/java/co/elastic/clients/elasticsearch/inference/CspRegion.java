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

// typedef: inference._types.CspRegion

/**
 * A cloud service provider region.
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.CspRegion">API
 *      specification</a>
 */
@JsonpDeserializable
public class CspRegion implements JsonpSerializable {
	private final String csp;

	private final String region;

	// ---------------------------------------------------------------------------------------------

	private CspRegion(Builder builder) {

		this.csp = ApiTypeHelper.requireNonNull(builder.csp, this, "csp");
		this.region = ApiTypeHelper.requireNonNull(builder.region, this, "region");

	}

	public static CspRegion of(Function<Builder, ObjectBuilder<CspRegion>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The cloud service provider, for example <code>aws</code>,
	 * <code>gcp</code>, or <code>azure</code>.
	 * <p>
	 * API name: {@code csp}
	 */
	public final String csp() {
		return this.csp;
	}

	/**
	 * Required - The region of the cloud service provider, for example
	 * <code>us-east-1</code>.
	 * <p>
	 * API name: {@code region}
	 */
	public final String region() {
		return this.region;
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

		generator.writeKey("csp");
		generator.write(this.csp);

		generator.writeKey("region");
		generator.write(this.region);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CspRegion}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CspRegion> {
		private String csp;

		private String region;

		public Builder() {
		}
		private Builder(CspRegion instance) {
			this.csp = instance.csp;
			this.region = instance.region;

		}
		/**
		 * Required - The cloud service provider, for example <code>aws</code>,
		 * <code>gcp</code>, or <code>azure</code>.
		 * <p>
		 * API name: {@code csp}
		 */
		public final Builder csp(String value) {
			this.csp = value;
			return this;
		}

		/**
		 * Required - The region of the cloud service provider, for example
		 * <code>us-east-1</code>.
		 * <p>
		 * API name: {@code region}
		 */
		public final Builder region(String value) {
			this.region = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CspRegion}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CspRegion build() {
			_checkSingleUse();

			return new CspRegion(this);
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
	 * Json deserializer for {@link CspRegion}
	 */
	public static final JsonpDeserializer<CspRegion> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CspRegion::setupCspRegionDeserializer);

	protected static void setupCspRegionDeserializer(ObjectDeserializer<CspRegion.Builder> op) {

		op.add(Builder::csp, JsonpDeserializer.stringDeserializer(), "csp");
		op.add(Builder::region, JsonpDeserializer.stringDeserializer(), "region");

	}

}
