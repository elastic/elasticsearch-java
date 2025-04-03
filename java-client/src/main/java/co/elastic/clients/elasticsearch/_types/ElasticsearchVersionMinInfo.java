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

package co.elastic.clients.elasticsearch._types;

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

// typedef: _types.ElasticsearchVersionMinInfo

/**
 * Reduced (minimal) info ElasticsearchVersion
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#_types.ElasticsearchVersionMinInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class ElasticsearchVersionMinInfo implements JsonpSerializable {
	private final String buildFlavor;

	private final String minimumIndexCompatibilityVersion;

	private final String minimumWireCompatibilityVersion;

	private final String number;

	// ---------------------------------------------------------------------------------------------

	private ElasticsearchVersionMinInfo(Builder builder) {

		this.buildFlavor = ApiTypeHelper.requireNonNull(builder.buildFlavor, this, "buildFlavor");
		this.minimumIndexCompatibilityVersion = ApiTypeHelper.requireNonNull(builder.minimumIndexCompatibilityVersion,
				this, "minimumIndexCompatibilityVersion");
		this.minimumWireCompatibilityVersion = ApiTypeHelper.requireNonNull(builder.minimumWireCompatibilityVersion,
				this, "minimumWireCompatibilityVersion");
		this.number = ApiTypeHelper.requireNonNull(builder.number, this, "number");

	}

	public static ElasticsearchVersionMinInfo of(Function<Builder, ObjectBuilder<ElasticsearchVersionMinInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code build_flavor}
	 */
	public final String buildFlavor() {
		return this.buildFlavor;
	}

	/**
	 * Required - API name: {@code minimum_index_compatibility_version}
	 */
	public final String minimumIndexCompatibilityVersion() {
		return this.minimumIndexCompatibilityVersion;
	}

	/**
	 * Required - API name: {@code minimum_wire_compatibility_version}
	 */
	public final String minimumWireCompatibilityVersion() {
		return this.minimumWireCompatibilityVersion;
	}

	/**
	 * Required - API name: {@code number}
	 */
	public final String number() {
		return this.number;
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

		generator.writeKey("build_flavor");
		generator.write(this.buildFlavor);

		generator.writeKey("minimum_index_compatibility_version");
		generator.write(this.minimumIndexCompatibilityVersion);

		generator.writeKey("minimum_wire_compatibility_version");
		generator.write(this.minimumWireCompatibilityVersion);

		generator.writeKey("number");
		generator.write(this.number);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ElasticsearchVersionMinInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ElasticsearchVersionMinInfo> {
		private String buildFlavor;

		private String minimumIndexCompatibilityVersion;

		private String minimumWireCompatibilityVersion;

		private String number;

		/**
		 * Required - API name: {@code build_flavor}
		 */
		public final Builder buildFlavor(String value) {
			this.buildFlavor = value;
			return this;
		}

		/**
		 * Required - API name: {@code minimum_index_compatibility_version}
		 */
		public final Builder minimumIndexCompatibilityVersion(String value) {
			this.minimumIndexCompatibilityVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code minimum_wire_compatibility_version}
		 */
		public final Builder minimumWireCompatibilityVersion(String value) {
			this.minimumWireCompatibilityVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code number}
		 */
		public final Builder number(String value) {
			this.number = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ElasticsearchVersionMinInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ElasticsearchVersionMinInfo build() {
			_checkSingleUse();

			return new ElasticsearchVersionMinInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ElasticsearchVersionMinInfo}
	 */
	public static final JsonpDeserializer<ElasticsearchVersionMinInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ElasticsearchVersionMinInfo::setupElasticsearchVersionMinInfoDeserializer);

	protected static void setupElasticsearchVersionMinInfoDeserializer(
			ObjectDeserializer<ElasticsearchVersionMinInfo.Builder> op) {

		op.add(Builder::buildFlavor, JsonpDeserializer.stringDeserializer(), "build_flavor");
		op.add(Builder::minimumIndexCompatibilityVersion, JsonpDeserializer.stringDeserializer(),
				"minimum_index_compatibility_version");
		op.add(Builder::minimumWireCompatibilityVersion, JsonpDeserializer.stringDeserializer(),
				"minimum_wire_compatibility_version");
		op.add(Builder::number, JsonpDeserializer.stringDeserializer(), "number");

	}

}
