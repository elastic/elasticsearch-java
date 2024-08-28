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

package co.elastic.clients.elasticsearch.ingest.geo_ip_stats;

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
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: ingest.geo_ip_stats.GeoIpDownloadStatistics

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ingest.geo_ip_stats.GeoIpDownloadStatistics">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoIpDownloadStatistics implements JsonpSerializable {
	private final int successfulDownloads;

	private final int failedDownloads;

	private final long totalDownloadTime;

	private final int databasesCount;

	private final int skippedUpdates;

	private final int expiredDatabases;

	// ---------------------------------------------------------------------------------------------

	private GeoIpDownloadStatistics(Builder builder) {

		this.successfulDownloads = ApiTypeHelper.requireNonNull(builder.successfulDownloads, this,
				"successfulDownloads");
		this.failedDownloads = ApiTypeHelper.requireNonNull(builder.failedDownloads, this, "failedDownloads");
		this.totalDownloadTime = ApiTypeHelper.requireNonNull(builder.totalDownloadTime, this, "totalDownloadTime");
		this.databasesCount = ApiTypeHelper.requireNonNull(builder.databasesCount, this, "databasesCount");
		this.skippedUpdates = ApiTypeHelper.requireNonNull(builder.skippedUpdates, this, "skippedUpdates");
		this.expiredDatabases = ApiTypeHelper.requireNonNull(builder.expiredDatabases, this, "expiredDatabases");

	}

	public static GeoIpDownloadStatistics of(Function<Builder, ObjectBuilder<GeoIpDownloadStatistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Total number of successful database downloads.
	 * <p>
	 * API name: {@code successful_downloads}
	 */
	public final int successfulDownloads() {
		return this.successfulDownloads;
	}

	/**
	 * Required - Total number of failed database downloads.
	 * <p>
	 * API name: {@code failed_downloads}
	 */
	public final int failedDownloads() {
		return this.failedDownloads;
	}

	/**
	 * Required - Total milliseconds spent downloading databases.
	 * <p>
	 * API name: {@code total_download_time}
	 */
	public final long totalDownloadTime() {
		return this.totalDownloadTime;
	}

	/**
	 * Required - Current number of databases available for use.
	 * <p>
	 * API name: {@code databases_count}
	 */
	public final int databasesCount() {
		return this.databasesCount;
	}

	/**
	 * Required - Total number of database updates skipped.
	 * <p>
	 * API name: {@code skipped_updates}
	 */
	public final int skippedUpdates() {
		return this.skippedUpdates;
	}

	/**
	 * Required - Total number of databases not updated after 30 days
	 * <p>
	 * API name: {@code expired_databases}
	 */
	public final int expiredDatabases() {
		return this.expiredDatabases;
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

		generator.writeKey("databases_count");
		generator.write(this.databasesCount);

		generator.writeKey("skipped_updates");
		generator.write(this.skippedUpdates);

		generator.writeKey("expired_databases");
		generator.write(this.expiredDatabases);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoIpDownloadStatistics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GeoIpDownloadStatistics> {
		private Integer successfulDownloads;

		private Integer failedDownloads;

		private Long totalDownloadTime;

		private Integer databasesCount;

		private Integer skippedUpdates;

		private Integer expiredDatabases;

		/**
		 * Required - Total number of successful database downloads.
		 * <p>
		 * API name: {@code successful_downloads}
		 */
		public final Builder successfulDownloads(int value) {
			this.successfulDownloads = value;
			return this;
		}

		/**
		 * Required - Total number of failed database downloads.
		 * <p>
		 * API name: {@code failed_downloads}
		 */
		public final Builder failedDownloads(int value) {
			this.failedDownloads = value;
			return this;
		}

		/**
		 * Required - Total milliseconds spent downloading databases.
		 * <p>
		 * API name: {@code total_download_time}
		 */
		public final Builder totalDownloadTime(long value) {
			this.totalDownloadTime = value;
			return this;
		}

		/**
		 * Required - Current number of databases available for use.
		 * <p>
		 * API name: {@code databases_count}
		 */
		public final Builder databasesCount(int value) {
			this.databasesCount = value;
			return this;
		}

		/**
		 * Required - Total number of database updates skipped.
		 * <p>
		 * API name: {@code skipped_updates}
		 */
		public final Builder skippedUpdates(int value) {
			this.skippedUpdates = value;
			return this;
		}

		/**
		 * Required - Total number of databases not updated after 30 days
		 * <p>
		 * API name: {@code expired_databases}
		 */
		public final Builder expiredDatabases(int value) {
			this.expiredDatabases = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoIpDownloadStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoIpDownloadStatistics build() {
			_checkSingleUse();

			return new GeoIpDownloadStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoIpDownloadStatistics}
	 */
	public static final JsonpDeserializer<GeoIpDownloadStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoIpDownloadStatistics::setupGeoIpDownloadStatisticsDeserializer);

	protected static void setupGeoIpDownloadStatisticsDeserializer(
			ObjectDeserializer<GeoIpDownloadStatistics.Builder> op) {

		op.add(Builder::successfulDownloads, JsonpDeserializer.integerDeserializer(), "successful_downloads");
		op.add(Builder::failedDownloads, JsonpDeserializer.integerDeserializer(), "failed_downloads");
		op.add(Builder::totalDownloadTime, JsonpDeserializer.longDeserializer(), "total_download_time");
		op.add(Builder::databasesCount, JsonpDeserializer.integerDeserializer(), "databases_count");
		op.add(Builder::skippedUpdates, JsonpDeserializer.integerDeserializer(), "skipped_updates");
		op.add(Builder::expiredDatabases, JsonpDeserializer.integerDeserializer(), "expired_databases");

	}

}
