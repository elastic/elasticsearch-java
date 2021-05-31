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

package co.elastic.clients.elasticsearch.ccr.stats;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ccr.stats.AutoFollowedCluster
public final class AutoFollowedCluster implements ToJsonp {
	private final String clusterName;

	private final Number lastSeenMetadataVersion;

	private final String timeSinceLastCheckMillis;

	// ---------------------------------------------------------------------------------------------

	protected AutoFollowedCluster(Builder builder) {

		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.lastSeenMetadataVersion = Objects.requireNonNull(builder.lastSeenMetadataVersion,
				"last_seen_metadata_version");
		this.timeSinceLastCheckMillis = Objects.requireNonNull(builder.timeSinceLastCheckMillis,
				"time_since_last_check_millis");

	}

	/**
	 * API name: {@code cluster_name}
	 */
	public String clusterName() {
		return this.clusterName;
	}

	/**
	 * API name: {@code last_seen_metadata_version}
	 */
	public Number lastSeenMetadataVersion() {
		return this.lastSeenMetadataVersion;
	}

	/**
	 * API name: {@code time_since_last_check_millis}
	 */
	public String timeSinceLastCheckMillis() {
		return this.timeSinceLastCheckMillis;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("last_seen_metadata_version");
		generator.write(this.lastSeenMetadataVersion.doubleValue());

		generator.writeKey("time_since_last_check_millis");
		generator.write(this.timeSinceLastCheckMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoFollowedCluster}.
	 */
	public static class Builder implements ObjectBuilder<AutoFollowedCluster> {
		private String clusterName;

		private Number lastSeenMetadataVersion;

		private String timeSinceLastCheckMillis;

		/**
		 * API name: {@code cluster_name}
		 */
		public Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * API name: {@code last_seen_metadata_version}
		 */
		public Builder lastSeenMetadataVersion(Number value) {
			this.lastSeenMetadataVersion = value;
			return this;
		}

		/**
		 * API name: {@code time_since_last_check_millis}
		 */
		public Builder timeSinceLastCheckMillis(String value) {
			this.timeSinceLastCheckMillis = value;
			return this;
		}

		/**
		 * Builds a {@link AutoFollowedCluster}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoFollowedCluster build() {

			return new AutoFollowedCluster(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for AutoFollowedCluster
	 */
	public static final JsonpValueParser<AutoFollowedCluster> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, AutoFollowedCluster::setupAutoFollowedClusterParser);

	protected static void setupAutoFollowedClusterParser(DelegatingJsonpValueParser<AutoFollowedCluster.Builder> op) {

		op.add(Builder::clusterName, JsonpValueParser.stringParser(), "cluster_name");
		op.add(Builder::lastSeenMetadataVersion, JsonpValueParser.numberParser(), "last_seen_metadata_version");
		op.add(Builder::timeSinceLastCheckMillis, JsonpValueParser.stringParser(), "time_since_last_check_millis");

	}

}
