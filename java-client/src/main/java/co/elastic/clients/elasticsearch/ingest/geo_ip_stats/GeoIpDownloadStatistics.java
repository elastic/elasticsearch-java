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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ingest.geo_ip_stats.GeoIpDownloadStatistics
public final class GeoIpDownloadStatistics implements ToJsonp {
	private final Number successfulDownloads;

	private final Number failedDownloads;

	private final Number totalDownloadTime;

	private final Number databaseCount;

	private final Number skippedUpdates;

	// ---------------------------------------------------------------------------------------------

	protected GeoIpDownloadStatistics(Builder builder) {

		this.successfulDownloads = Objects.requireNonNull(builder.successfulDownloads, "successful_downloads");
		this.failedDownloads = Objects.requireNonNull(builder.failedDownloads, "failed_downloads");
		this.totalDownloadTime = Objects.requireNonNull(builder.totalDownloadTime, "total_download_time");
		this.databaseCount = Objects.requireNonNull(builder.databaseCount, "database_count");
		this.skippedUpdates = Objects.requireNonNull(builder.skippedUpdates, "skipped_updates");

	}

	/**
	 * Total number of successful database downloads.
	 *
	 * API name: {@code successful_downloads}
	 */
	public Number successfulDownloads() {
		return this.successfulDownloads;
	}

	/**
	 * Total number of failed database downloads.
	 *
	 * API name: {@code failed_downloads}
	 */
	public Number failedDownloads() {
		return this.failedDownloads;
	}

	/**
	 * Total milliseconds spent downloading databases.
	 *
	 * API name: {@code total_download_time}
	 */
	public Number totalDownloadTime() {
		return this.totalDownloadTime;
	}

	/**
	 * Current number of databases available for use.
	 *
	 * API name: {@code database_count}
	 */
	public Number databaseCount() {
		return this.databaseCount;
	}

	/**
	 * Total number of database updates skipped.
	 *
	 * API name: {@code skipped_updates}
	 */
	public Number skippedUpdates() {
		return this.skippedUpdates;
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

		generator.writeKey("successful_downloads");
		generator.write(this.successfulDownloads.doubleValue());

		generator.writeKey("failed_downloads");
		generator.write(this.failedDownloads.doubleValue());

		generator.writeKey("total_download_time");
		generator.write(this.totalDownloadTime.doubleValue());

		generator.writeKey("database_count");
		generator.write(this.databaseCount.doubleValue());

		generator.writeKey("skipped_updates");
		generator.write(this.skippedUpdates.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoIpDownloadStatistics}.
	 */
	public static class Builder implements ObjectBuilder<GeoIpDownloadStatistics> {
		private Number successfulDownloads;

		private Number failedDownloads;

		private Number totalDownloadTime;

		private Number databaseCount;

		private Number skippedUpdates;

		/**
		 * Total number of successful database downloads.
		 *
		 * API name: {@code successful_downloads}
		 */
		public Builder successfulDownloads(Number value) {
			this.successfulDownloads = value;
			return this;
		}

		/**
		 * Total number of failed database downloads.
		 *
		 * API name: {@code failed_downloads}
		 */
		public Builder failedDownloads(Number value) {
			this.failedDownloads = value;
			return this;
		}

		/**
		 * Total milliseconds spent downloading databases.
		 *
		 * API name: {@code total_download_time}
		 */
		public Builder totalDownloadTime(Number value) {
			this.totalDownloadTime = value;
			return this;
		}

		/**
		 * Current number of databases available for use.
		 *
		 * API name: {@code database_count}
		 */
		public Builder databaseCount(Number value) {
			this.databaseCount = value;
			return this;
		}

		/**
		 * Total number of database updates skipped.
		 *
		 * API name: {@code skipped_updates}
		 */
		public Builder skippedUpdates(Number value) {
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
	 * Json deserializer for GeoIpDownloadStatistics
	 */
	public static final JsonpDeserializer<GeoIpDownloadStatistics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GeoIpDownloadStatistics::setupGeoIpDownloadStatisticsDeserializer);

	protected static void setupGeoIpDownloadStatisticsDeserializer(
			DelegatingDeserializer<GeoIpDownloadStatistics.Builder> op) {

		op.add(Builder::successfulDownloads, JsonpDeserializer.numberDeserializer(), "successful_downloads");
		op.add(Builder::failedDownloads, JsonpDeserializer.numberDeserializer(), "failed_downloads");
		op.add(Builder::totalDownloadTime, JsonpDeserializer.numberDeserializer(), "total_download_time");
		op.add(Builder::databaseCount, JsonpDeserializer.numberDeserializer(), "database_count");
		op.add(Builder::skippedUpdates, JsonpDeserializer.numberDeserializer(), "skipped_updates");

	}

}
