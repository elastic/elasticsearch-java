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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterJvmVersion

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterJvmVersion">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterJvmVersion implements JsonpSerializable {
	private final boolean bundledJdk;

	private final int count;

	private final boolean usingBundledJdk;

	private final String version;

	private final String vmName;

	private final String vmVendor;

	private final String vmVersion;

	// ---------------------------------------------------------------------------------------------

	private ClusterJvmVersion(Builder builder) {

		this.bundledJdk = ApiTypeHelper.requireNonNull(builder.bundledJdk, this, "bundledJdk");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.usingBundledJdk = ApiTypeHelper.requireNonNull(builder.usingBundledJdk, this, "usingBundledJdk");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.vmName = ApiTypeHelper.requireNonNull(builder.vmName, this, "vmName");
		this.vmVendor = ApiTypeHelper.requireNonNull(builder.vmVendor, this, "vmVendor");
		this.vmVersion = ApiTypeHelper.requireNonNull(builder.vmVersion, this, "vmVersion");

	}

	public static ClusterJvmVersion of(Function<Builder, ObjectBuilder<ClusterJvmVersion>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Always <code>true</code>. All distributions come with a bundled
	 * Java Development Kit (JDK).
	 * <p>
	 * API name: {@code bundled_jdk}
	 */
	public final boolean bundledJdk() {
		return this.bundledJdk;
	}

	/**
	 * Required - Total number of selected nodes using JVM.
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - If <code>true</code>, a bundled JDK is in use by JVM.
	 * <p>
	 * API name: {@code using_bundled_jdk}
	 */
	public final boolean usingBundledJdk() {
		return this.usingBundledJdk;
	}

	/**
	 * Required - Version of JVM used by one or more selected nodes.
	 * <p>
	 * API name: {@code version}
	 */
	public final String version() {
		return this.version;
	}

	/**
	 * Required - Name of the JVM.
	 * <p>
	 * API name: {@code vm_name}
	 */
	public final String vmName() {
		return this.vmName;
	}

	/**
	 * Required - Vendor of the JVM.
	 * <p>
	 * API name: {@code vm_vendor}
	 */
	public final String vmVendor() {
		return this.vmVendor;
	}

	/**
	 * Required - Full version number of JVM. The full version number includes a
	 * plus sign (+) followed by the build number.
	 * <p>
	 * API name: {@code vm_version}
	 */
	public final String vmVersion() {
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
		generator.write(this.count);

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterJvmVersion}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ClusterJvmVersion> {
		private Boolean bundledJdk;

		private Integer count;

		private Boolean usingBundledJdk;

		private String version;

		private String vmName;

		private String vmVendor;

		private String vmVersion;

		/**
		 * Required - Always <code>true</code>. All distributions come with a bundled
		 * Java Development Kit (JDK).
		 * <p>
		 * API name: {@code bundled_jdk}
		 */
		public final Builder bundledJdk(boolean value) {
			this.bundledJdk = value;
			return this;
		}

		/**
		 * Required - Total number of selected nodes using JVM.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - If <code>true</code>, a bundled JDK is in use by JVM.
		 * <p>
		 * API name: {@code using_bundled_jdk}
		 */
		public final Builder usingBundledJdk(boolean value) {
			this.usingBundledJdk = value;
			return this;
		}

		/**
		 * Required - Version of JVM used by one or more selected nodes.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - Name of the JVM.
		 * <p>
		 * API name: {@code vm_name}
		 */
		public final Builder vmName(String value) {
			this.vmName = value;
			return this;
		}

		/**
		 * Required - Vendor of the JVM.
		 * <p>
		 * API name: {@code vm_vendor}
		 */
		public final Builder vmVendor(String value) {
			this.vmVendor = value;
			return this;
		}

		/**
		 * Required - Full version number of JVM. The full version number includes a
		 * plus sign (+) followed by the build number.
		 * <p>
		 * API name: {@code vm_version}
		 */
		public final Builder vmVersion(String value) {
			this.vmVersion = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterJvmVersion}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterJvmVersion build() {
			_checkSingleUse();

			return new ClusterJvmVersion(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterJvmVersion}
	 */
	public static final JsonpDeserializer<ClusterJvmVersion> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterJvmVersion::setupClusterJvmVersionDeserializer);

	protected static void setupClusterJvmVersionDeserializer(ObjectDeserializer<ClusterJvmVersion.Builder> op) {

		op.add(Builder::bundledJdk, JsonpDeserializer.booleanDeserializer(), "bundled_jdk");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::usingBundledJdk, JsonpDeserializer.booleanDeserializer(), "using_bundled_jdk");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::vmName, JsonpDeserializer.stringDeserializer(), "vm_name");
		op.add(Builder::vmVendor, JsonpDeserializer.stringDeserializer(), "vm_vendor");
		op.add(Builder::vmVersion, JsonpDeserializer.stringDeserializer(), "vm_version");

	}

}
