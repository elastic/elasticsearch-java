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

package co.elastic.clients.elasticsearch.ingest.geo_ip_stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: ingest.geo_ip_stats.GeoIpDownloadStatistics
@JsonpDeserializable
public final class GeoIpDownloadStatistics implements JsonpSerializable {
	private final int successfulDownloads;

	private final int failedDownloads;

	private final int totalDownloadTime;

	private final int databaseCount;

	private final int skippedUpdates;

	// ---------------------------------------------------------------------------------------------

	public GeoIpDownloadStatistics(Builder builder) {

		this.successfulDownloads = Objects.requireNonNull(builder.successfulDownloads, "successful_downloads");
		this.failedDownloads = Objects.requireNonNull(builder.failedDownloads, "failed_downloads");
		this.totalDownloadTime = Objects.requireNonNull(builder.totalDownloadTime, "total_download_time");
		this.databaseCount = Objects.requireNonNull(builder.databaseCount, "database_count");
		this.skippedUpdates = Objects.requireNonNull(builder.skippedUpdates, "skipped_updates");

	}

	public GeoIpDownloadStatistics(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Total number of successful database downloads.
	 * <p>
	 * API name: {@code successful_downloads}
	 */
	public int successfulDownloads() {
		return this.successfulDownloads;
	}

	/**
	 * Required - Total number of failed database downloads.
	 * <p>
	 * API name: {@code failed_downloads}
	 */
	public int failedDownloads() {
		return this.failedDownloads;
	}

	/**
	 * Required - Total milliseconds spent downloading databases.
	 * <p>
	 * API name: {@code total_download_time}
	 */
	public int totalDownloadTime() {
		return this.totalDownloadTime;
	}

	/**
	 * Required - Current number of databases available for use.
	 * <p>
	 * API name: {@code database_count}
	 */
	public int databaseCount() {
		return this.databaseCount;
	}

	/**
	 * Required - Total number of database updates skipped.
	 * <p>
	 * API name: {@code skipped_updates}
	 */
	public int skippedUpdates() {
		return this.skippedUpdates;
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

		generator.writeKey("successful_downloads");
		generator.write(this.successfulDownloads);

		generator.writeKey("failed_downloads");
		generator.write(this.failedDownloads);

		generator.writeKey("total_download_time");
		generator.write(this.totalDownloadTime);

		generator.writeKey("database_count");
		generator.write(this.databaseCount);

		generator.writeKey("skipped_updates");
		generator.write(this.skippedUpdates);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoIpDownloadStatistics}.
	 */
	public static class Builder implements ObjectBuilder<GeoIpDownloadStatistics> {
		private Integer successfulDownloads;

		private Integer failedDownloads;

		private Integer totalDownloadTime;

		private Integer databaseCount;

		private Integer skippedUpdates;

		/**
		 * Required - Total number of successful database downloads.
		 * <p>
		 * API name: {@code successful_downloads}
		 */
		public Builder successfulDownloads(int value) {
			this.successfulDownloads = value;
			return this;
		}

		/**
		 * Required - Total number of failed database downloads.
		 * <p>
		 * API name: {@code failed_downloads}
		 */
		public Builder failedDownloads(int value) {
			this.failedDownloads = value;
			return this;
		}

		/**
		 * Required - Total milliseconds spent downloading databases.
		 * <p>
		 * API name: {@code total_download_time}
		 */
		public Builder totalDownloadTime(int value) {
			this.totalDownloadTime = value;
			return this;
		}

		/**
		 * Required - Current number of databases available for use.
		 * <p>
		 * API name: {@code database_count}
		 */
		public Builder databaseCount(int value) {
			this.databaseCount = value;
			return this;
		}

		/**
		 * Required - Total number of database updates skipped.
		 * <p>
		 * API name: {@code skipped_updates}
		 */
		public Builder skippedUpdates(int value) {
			this.skippedUpdates = value;
			return this;
		}

		/**
		 * Builds a {@link GeoIpDownloadStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoIpDownloadStatistics build() {

			return new GeoIpDownloadStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoIpDownloadStatistics}
	 */
	public static final JsonpDeserializer<GeoIpDownloadStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoIpDownloadStatistics::setupGeoIpDownloadStatisticsDeserializer, Builder::build);

	protected static void setupGeoIpDownloadStatisticsDeserializer(
			DelegatingDeserializer<GeoIpDownloadStatistics.Builder> op) {

		op.add(Builder::successfulDownloads, JsonpDeserializer.integerDeserializer(), "successful_downloads");
		op.add(Builder::failedDownloads, JsonpDeserializer.integerDeserializer(), "failed_downloads");
		op.add(Builder::totalDownloadTime, JsonpDeserializer.integerDeserializer(), "total_download_time");
		op.add(Builder::databaseCount, JsonpDeserializer.integerDeserializer(), "database_count");
		op.add(Builder::skippedUpdates, JsonpDeserializer.integerDeserializer(), "skipped_updates");

	}

}
