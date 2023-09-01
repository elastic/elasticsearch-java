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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ElasticsearchVersionInfo

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.ElasticsearchVersionInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class ElasticsearchVersionInfo implements JsonpSerializable {
	private final DateTime buildDate;

	private final String buildFlavor;

	private final String buildHash;

	private final boolean buildSnapshot;

	private final String buildType;

	private final String luceneVersion;

	private final String minimumIndexCompatibilityVersion;

	private final String minimumWireCompatibilityVersion;

	private final String number;

	// ---------------------------------------------------------------------------------------------

	private ElasticsearchVersionInfo(Builder builder) {

		this.buildDate = ApiTypeHelper.requireNonNull(builder.buildDate, this, "buildDate");
		this.buildFlavor = ApiTypeHelper.requireNonNull(builder.buildFlavor, this, "buildFlavor");
		this.buildHash = ApiTypeHelper.requireNonNull(builder.buildHash, this, "buildHash");
		this.buildSnapshot = ApiTypeHelper.requireNonNull(builder.buildSnapshot, this, "buildSnapshot");
		this.buildType = ApiTypeHelper.requireNonNull(builder.buildType, this, "buildType");
		this.luceneVersion = ApiTypeHelper.requireNonNull(builder.luceneVersion, this, "luceneVersion");
		this.minimumIndexCompatibilityVersion = ApiTypeHelper.requireNonNull(builder.minimumIndexCompatibilityVersion,
				this, "minimumIndexCompatibilityVersion");
		this.minimumWireCompatibilityVersion = ApiTypeHelper.requireNonNull(builder.minimumWireCompatibilityVersion,
				this, "minimumWireCompatibilityVersion");
		this.number = ApiTypeHelper.requireNonNull(builder.number, this, "number");

	}

	public static ElasticsearchVersionInfo of(Function<Builder, ObjectBuilder<ElasticsearchVersionInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code build_date}
	 */
	public final DateTime buildDate() {
		return this.buildDate;
	}

	/**
	 * Required - API name: {@code build_flavor}
	 */
	public final String buildFlavor() {
		return this.buildFlavor;
	}

	/**
	 * Required - API name: {@code build_hash}
	 */
	public final String buildHash() {
		return this.buildHash;
	}

	/**
	 * Required - API name: {@code build_snapshot}
	 */
	public final boolean buildSnapshot() {
		return this.buildSnapshot;
	}

	/**
	 * Required - API name: {@code build_type}
	 */
	public final String buildType() {
		return this.buildType;
	}

	/**
	 * Required - API name: {@code lucene_version}
	 */
	public final String luceneVersion() {
		return this.luceneVersion;
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

		generator.writeKey("build_date");
		this.buildDate.serialize(generator, mapper);
		generator.writeKey("build_flavor");
		generator.write(this.buildFlavor);

		generator.writeKey("build_hash");
		generator.write(this.buildHash);

		generator.writeKey("build_snapshot");
		generator.write(this.buildSnapshot);

		generator.writeKey("build_type");
		generator.write(this.buildType);

		generator.writeKey("lucene_version");
		generator.write(this.luceneVersion);

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
	 * Builder for {@link ElasticsearchVersionInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ElasticsearchVersionInfo> {
		private DateTime buildDate;

		private String buildFlavor;

		private String buildHash;

		private Boolean buildSnapshot;

		private String buildType;

		private String luceneVersion;

		private String minimumIndexCompatibilityVersion;

		private String minimumWireCompatibilityVersion;

		private String number;

		/**
		 * Required - API name: {@code build_date}
		 */
		public final Builder buildDate(DateTime value) {
			this.buildDate = value;
			return this;
		}

		/**
		 * Required - API name: {@code build_flavor}
		 */
		public final Builder buildFlavor(String value) {
			this.buildFlavor = value;
			return this;
		}

		/**
		 * Required - API name: {@code build_hash}
		 */
		public final Builder buildHash(String value) {
			this.buildHash = value;
			return this;
		}

		/**
		 * Required - API name: {@code build_snapshot}
		 */
		public final Builder buildSnapshot(boolean value) {
			this.buildSnapshot = value;
			return this;
		}

		/**
		 * Required - API name: {@code build_type}
		 */
		public final Builder buildType(String value) {
			this.buildType = value;
			return this;
		}

		/**
		 * Required - API name: {@code lucene_version}
		 */
		public final Builder luceneVersion(String value) {
			this.luceneVersion = value;
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
		 * Builds a {@link ElasticsearchVersionInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ElasticsearchVersionInfo build() {
			_checkSingleUse();

			return new ElasticsearchVersionInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ElasticsearchVersionInfo}
	 */
	public static final JsonpDeserializer<ElasticsearchVersionInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ElasticsearchVersionInfo::setupElasticsearchVersionInfoDeserializer);

	protected static void setupElasticsearchVersionInfoDeserializer(
			ObjectDeserializer<ElasticsearchVersionInfo.Builder> op) {

		op.add(Builder::buildDate, DateTime._DESERIALIZER, "build_date");
		op.add(Builder::buildFlavor, JsonpDeserializer.stringDeserializer(), "build_flavor");
		op.add(Builder::buildHash, JsonpDeserializer.stringDeserializer(), "build_hash");
		op.add(Builder::buildSnapshot, JsonpDeserializer.booleanDeserializer(), "build_snapshot");
		op.add(Builder::buildType, JsonpDeserializer.stringDeserializer(), "build_type");
		op.add(Builder::luceneVersion, JsonpDeserializer.stringDeserializer(), "lucene_version");
		op.add(Builder::minimumIndexCompatibilityVersion, JsonpDeserializer.stringDeserializer(),
				"minimum_index_compatibility_version");
		op.add(Builder::minimumWireCompatibilityVersion, JsonpDeserializer.stringDeserializer(),
				"minimum_wire_compatibility_version");
		op.add(Builder::number, JsonpDeserializer.stringDeserializer(), "number");

	}

}
