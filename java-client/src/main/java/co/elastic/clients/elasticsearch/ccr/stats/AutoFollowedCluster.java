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

package co.elastic.clients.elasticsearch.ccr.stats;

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
import java.lang.Long;
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

// typedef: ccr.stats.AutoFollowedCluster

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ccr.stats.AutoFollowedCluster">API
 *      specification</a>
 */
@JsonpDeserializable
public class AutoFollowedCluster implements JsonpSerializable {
	private final String clusterName;

	private final long lastSeenMetadataVersion;

	private final long timeSinceLastCheckMillis;

	// ---------------------------------------------------------------------------------------------

	private AutoFollowedCluster(Builder builder) {

		this.clusterName = ApiTypeHelper.requireNonNull(builder.clusterName, this, "clusterName");
		this.lastSeenMetadataVersion = ApiTypeHelper.requireNonNull(builder.lastSeenMetadataVersion, this,
				"lastSeenMetadataVersion");
		this.timeSinceLastCheckMillis = ApiTypeHelper.requireNonNull(builder.timeSinceLastCheckMillis, this,
				"timeSinceLastCheckMillis");

	}

	public static AutoFollowedCluster of(Function<Builder, ObjectBuilder<AutoFollowedCluster>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cluster_name}
	 */
	public final String clusterName() {
		return this.clusterName;
	}

	/**
	 * Required - API name: {@code last_seen_metadata_version}
	 */
	public final long lastSeenMetadataVersion() {
		return this.lastSeenMetadataVersion;
	}

	/**
	 * Required - API name: {@code time_since_last_check_millis}
	 */
	public final long timeSinceLastCheckMillis() {
		return this.timeSinceLastCheckMillis;
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

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("last_seen_metadata_version");
		generator.write(this.lastSeenMetadataVersion);

		generator.writeKey("time_since_last_check_millis");
		generator.write(this.timeSinceLastCheckMillis);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoFollowedCluster}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AutoFollowedCluster> {
		private String clusterName;

		private Long lastSeenMetadataVersion;

		private Long timeSinceLastCheckMillis;

		/**
		 * Required - API name: {@code cluster_name}
		 */
		public final Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * Required - API name: {@code last_seen_metadata_version}
		 */
		public final Builder lastSeenMetadataVersion(long value) {
			this.lastSeenMetadataVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_since_last_check_millis}
		 */
		public final Builder timeSinceLastCheckMillis(long value) {
			this.timeSinceLastCheckMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AutoFollowedCluster}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoFollowedCluster build() {
			_checkSingleUse();

			return new AutoFollowedCluster(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoFollowedCluster}
	 */
	public static final JsonpDeserializer<AutoFollowedCluster> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoFollowedCluster::setupAutoFollowedClusterDeserializer);

	protected static void setupAutoFollowedClusterDeserializer(ObjectDeserializer<AutoFollowedCluster.Builder> op) {

		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::lastSeenMetadataVersion, JsonpDeserializer.longDeserializer(), "last_seen_metadata_version");
		op.add(Builder::timeSinceLastCheckMillis, JsonpDeserializer.longDeserializer(), "time_since_last_check_millis");

	}

}
