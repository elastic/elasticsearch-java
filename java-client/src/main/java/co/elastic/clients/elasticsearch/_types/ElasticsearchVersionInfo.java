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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.ElasticsearchVersionInfo
@JsonpDeserializable
public final class ElasticsearchVersionInfo implements JsonpSerializable {
	private final String buildDate;

	private final String buildFlavor;

	private final String buildHash;

	private final Boolean buildSnapshot;

	private final String buildType;

	private final String luceneVersion;

	private final String minimumIndexCompatibilityVersion;

	private final String minimumWireCompatibilityVersion;

	private final String number;

	// ---------------------------------------------------------------------------------------------

	public ElasticsearchVersionInfo(Builder builder) {

		this.buildDate = Objects.requireNonNull(builder.buildDate, "build_date");
		this.buildFlavor = Objects.requireNonNull(builder.buildFlavor, "build_flavor");
		this.buildHash = Objects.requireNonNull(builder.buildHash, "build_hash");
		this.buildSnapshot = Objects.requireNonNull(builder.buildSnapshot, "build_snapshot");
		this.buildType = Objects.requireNonNull(builder.buildType, "build_type");
		this.luceneVersion = Objects.requireNonNull(builder.luceneVersion, "lucene_version");
		this.minimumIndexCompatibilityVersion = Objects.requireNonNull(builder.minimumIndexCompatibilityVersion,
				"minimum_index_compatibility_version");
		this.minimumWireCompatibilityVersion = Objects.requireNonNull(builder.minimumWireCompatibilityVersion,
				"minimum_wire_compatibility_version");
		this.number = Objects.requireNonNull(builder.number, "number");

	}

	/**
	 * API name: {@code build_date}
	 */
	public String buildDate() {
		return this.buildDate;
	}

	/**
	 * API name: {@code build_flavor}
	 */
	public String buildFlavor() {
		return this.buildFlavor;
	}

	/**
	 * API name: {@code build_hash}
	 */
	public String buildHash() {
		return this.buildHash;
	}

	/**
	 * API name: {@code build_snapshot}
	 */
	public Boolean buildSnapshot() {
		return this.buildSnapshot;
	}

	/**
	 * API name: {@code build_type}
	 */
	public String buildType() {
		return this.buildType;
	}

	/**
	 * API name: {@code lucene_version}
	 */
	public String luceneVersion() {
		return this.luceneVersion;
	}

	/**
	 * API name: {@code minimum_index_compatibility_version}
	 */
	public String minimumIndexCompatibilityVersion() {
		return this.minimumIndexCompatibilityVersion;
	}

	/**
	 * API name: {@code minimum_wire_compatibility_version}
	 */
	public String minimumWireCompatibilityVersion() {
		return this.minimumWireCompatibilityVersion;
	}

	/**
	 * API name: {@code number}
	 */
	public String number() {
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
		generator.write(this.buildDate);

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ElasticsearchVersionInfo}.
	 */
	public static class Builder implements ObjectBuilder<ElasticsearchVersionInfo> {
		private String buildDate;

		private String buildFlavor;

		private String buildHash;

		private Boolean buildSnapshot;

		private String buildType;

		private String luceneVersion;

		private String minimumIndexCompatibilityVersion;

		private String minimumWireCompatibilityVersion;

		private String number;

		/**
		 * API name: {@code build_date}
		 */
		public Builder buildDate(String value) {
			this.buildDate = value;
			return this;
		}

		/**
		 * API name: {@code build_flavor}
		 */
		public Builder buildFlavor(String value) {
			this.buildFlavor = value;
			return this;
		}

		/**
		 * API name: {@code build_hash}
		 */
		public Builder buildHash(String value) {
			this.buildHash = value;
			return this;
		}

		/**
		 * API name: {@code build_snapshot}
		 */
		public Builder buildSnapshot(Boolean value) {
			this.buildSnapshot = value;
			return this;
		}

		/**
		 * API name: {@code build_type}
		 */
		public Builder buildType(String value) {
			this.buildType = value;
			return this;
		}

		/**
		 * API name: {@code lucene_version}
		 */
		public Builder luceneVersion(String value) {
			this.luceneVersion = value;
			return this;
		}

		/**
		 * API name: {@code minimum_index_compatibility_version}
		 */
		public Builder minimumIndexCompatibilityVersion(String value) {
			this.minimumIndexCompatibilityVersion = value;
			return this;
		}

		/**
		 * API name: {@code minimum_wire_compatibility_version}
		 */
		public Builder minimumWireCompatibilityVersion(String value) {
			this.minimumWireCompatibilityVersion = value;
			return this;
		}

		/**
		 * API name: {@code number}
		 */
		public Builder number(String value) {
			this.number = value;
			return this;
		}

		/**
		 * Builds a {@link ElasticsearchVersionInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ElasticsearchVersionInfo build() {

			return new ElasticsearchVersionInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ElasticsearchVersionInfo}
	 */
	public static final JsonpDeserializer<ElasticsearchVersionInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ElasticsearchVersionInfo::setupElasticsearchVersionInfoDeserializer, Builder::build);

	protected static void setupElasticsearchVersionInfoDeserializer(
			DelegatingDeserializer<ElasticsearchVersionInfo.Builder> op) {

		op.add(Builder::buildDate, JsonpDeserializer.stringDeserializer(), "build_date");
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
