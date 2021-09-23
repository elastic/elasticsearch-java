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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterJvmVersion
public final class ClusterJvmVersion implements JsonpSerializable {
	private final Boolean bundledJdk;

	private final Number count;

	private final Boolean usingBundledJdk;

	private final String version;

	private final String vmName;

	private final String vmVendor;

	private final String vmVersion;

	// ---------------------------------------------------------------------------------------------

	public ClusterJvmVersion(Builder builder) {

		this.bundledJdk = Objects.requireNonNull(builder.bundledJdk, "bundled_jdk");
		this.count = Objects.requireNonNull(builder.count, "count");
		this.usingBundledJdk = Objects.requireNonNull(builder.usingBundledJdk, "using_bundled_jdk");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.vmName = Objects.requireNonNull(builder.vmName, "vm_name");
		this.vmVendor = Objects.requireNonNull(builder.vmVendor, "vm_vendor");
		this.vmVersion = Objects.requireNonNull(builder.vmVersion, "vm_version");

	}

	/**
	 * API name: {@code bundled_jdk}
	 */
	public Boolean bundledJdk() {
		return this.bundledJdk;
	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code using_bundled_jdk}
	 */
	public Boolean usingBundledJdk() {
		return this.usingBundledJdk;
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code vm_name}
	 */
	public String vmName() {
		return this.vmName;
	}

	/**
	 * API name: {@code vm_vendor}
	 */
	public String vmVendor() {
		return this.vmVendor;
	}

	/**
	 * API name: {@code vm_version}
	 */
	public String vmVersion() {
		return this.vmVersion;
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

		generator.writeKey("bundled_jdk");
		generator.write(this.bundledJdk);

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("using_bundled_jdk");
		generator.write(this.usingBundledJdk);

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("vm_name");
		generator.write(this.vmName);

		generator.writeKey("vm_vendor");
		generator.write(this.vmVendor);

		generator.writeKey("vm_version");
		generator.write(this.vmVersion);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterJvmVersion}.
	 */
	public static class Builder implements ObjectBuilder<ClusterJvmVersion> {
		private Boolean bundledJdk;

		private Number count;

		private Boolean usingBundledJdk;

		private String version;

		private String vmName;

		private String vmVendor;

		private String vmVersion;

		/**
		 * API name: {@code bundled_jdk}
		 */
		public Builder bundledJdk(Boolean value) {
			this.bundledJdk = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code using_bundled_jdk}
		 */
		public Builder usingBundledJdk(Boolean value) {
			this.usingBundledJdk = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code vm_name}
		 */
		public Builder vmName(String value) {
			this.vmName = value;
			return this;
		}

		/**
		 * API name: {@code vm_vendor}
		 */
		public Builder vmVendor(String value) {
			this.vmVendor = value;
			return this;
		}

		/**
		 * API name: {@code vm_version}
		 */
		public Builder vmVersion(String value) {
			this.vmVersion = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterJvmVersion}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterJvmVersion build() {

			return new ClusterJvmVersion(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterJvmVersion}
	 */
	public static final JsonpDeserializer<ClusterJvmVersion> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterJvmVersion::setupClusterJvmVersionDeserializer);

	protected static void setupClusterJvmVersionDeserializer(DelegatingDeserializer<ClusterJvmVersion.Builder> op) {

		op.add(Builder::bundledJdk, JsonpDeserializer.booleanDeserializer(), "bundled_jdk");
		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::usingBundledJdk, JsonpDeserializer.booleanDeserializer(), "using_bundled_jdk");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::vmName, JsonpDeserializer.stringDeserializer(), "vm_name");
		op.add(Builder::vmVendor, JsonpDeserializer.stringDeserializer(), "vm_vendor");
		op.add(Builder::vmVersion, JsonpDeserializer.stringDeserializer(), "vm_version");

	}

}
