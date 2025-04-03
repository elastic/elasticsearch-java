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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.snapshot.repository_analyze.DetailsInfo;
import co.elastic.clients.elasticsearch.snapshot.repository_analyze.SnapshotNodeInfo;
import co.elastic.clients.elasticsearch.snapshot.repository_analyze.SummaryInfo;
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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: snapshot.repository_analyze.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot.repository_analyze.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class RepositoryAnalyzeResponse implements JsonpSerializable {
	private final int blobCount;

	private final String blobPath;

	private final int concurrency;

	private final SnapshotNodeInfo coordinatingNode;

	private final Time deleteElapsed;

	private final long deleteElapsedNanos;

	private final DetailsInfo details;

	private final int earlyReadNodeCount;

	private final List<String> issuesDetected;

	private final Time listingElapsed;

	private final long listingElapsedNanos;

	private final String maxBlobSize;

	private final long maxBlobSizeBytes;

	private final String maxTotalDataSize;

	private final long maxTotalDataSizeBytes;

	private final double rareActionProbability;

	private final int readNodeCount;

	private final String repository;

	private final long seed;

	private final SummaryInfo summary;

	// ---------------------------------------------------------------------------------------------

	private RepositoryAnalyzeResponse(Builder builder) {

		this.blobCount = ApiTypeHelper.requireNonNullWithDefault(builder.blobCount, this, "blobCount",
				this.blobCount());
		this.blobPath = ApiTypeHelper.requireNonNullWithDefault(builder.blobPath, this, "blobPath", this.blobPath());
		this.concurrency = ApiTypeHelper.requireNonNullWithDefault(builder.concurrency, this, "concurrency",
				this.concurrency());
		this.coordinatingNode = ApiTypeHelper.requireNonNullWithDefault(builder.coordinatingNode, this,
				"coordinatingNode", this.coordinatingNode());
		this.deleteElapsed = ApiTypeHelper.requireNonNullWithDefault(builder.deleteElapsed, this, "deleteElapsed",
				this.deleteElapsed());
		this.deleteElapsedNanos = ApiTypeHelper.requireNonNullWithDefault(builder.deleteElapsedNanos, this,
				"deleteElapsedNanos", this.deleteElapsedNanos());
		this.details = ApiTypeHelper.requireNonNullWithDefault(builder.details, this, "details", this.details());
		this.earlyReadNodeCount = ApiTypeHelper.requireNonNullWithDefault(builder.earlyReadNodeCount, this,
				"earlyReadNodeCount", this.earlyReadNodeCount());
		this.issuesDetected = ApiTypeHelper.unmodifiableRequired(builder.issuesDetected, this, "issuesDetected");
		this.listingElapsed = ApiTypeHelper.requireNonNullWithDefault(builder.listingElapsed, this, "listingElapsed",
				this.listingElapsed());
		this.listingElapsedNanos = ApiTypeHelper.requireNonNullWithDefault(builder.listingElapsedNanos, this,
				"listingElapsedNanos", this.listingElapsedNanos());
		this.maxBlobSize = ApiTypeHelper.requireNonNullWithDefault(builder.maxBlobSize, this, "maxBlobSize",
				this.maxBlobSize());
		this.maxBlobSizeBytes = ApiTypeHelper.requireNonNullWithDefault(builder.maxBlobSizeBytes, this,
				"maxBlobSizeBytes", this.maxBlobSizeBytes());
		this.maxTotalDataSize = ApiTypeHelper.requireNonNullWithDefault(builder.maxTotalDataSize, this,
				"maxTotalDataSize", this.maxTotalDataSize());
		this.maxTotalDataSizeBytes = ApiTypeHelper.requireNonNullWithDefault(builder.maxTotalDataSizeBytes, this,
				"maxTotalDataSizeBytes", this.maxTotalDataSizeBytes());
		this.rareActionProbability = ApiTypeHelper.requireNonNullWithDefault(builder.rareActionProbability, this,
				"rareActionProbability", this.rareActionProbability());
		this.readNodeCount = ApiTypeHelper.requireNonNullWithDefault(builder.readNodeCount, this, "readNodeCount",
				this.readNodeCount());
		this.repository = ApiTypeHelper.requireNonNullWithDefault(builder.repository, this, "repository",
				this.repository());
		this.seed = ApiTypeHelper.requireNonNullWithDefault(builder.seed, this, "seed", this.seed());
		this.summary = ApiTypeHelper.requireNonNullWithDefault(builder.summary, this, "summary", this.summary());

	}

	public static RepositoryAnalyzeResponse of(Function<Builder, ObjectBuilder<RepositoryAnalyzeResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of blobs written to the repository during the test.
	 * <p>
	 * API name: {@code blob_count}
	 */
	public final int blobCount() {
		return this.blobCount;
	}

	/**
	 * Required - The path in the repository under which all the blobs were written
	 * during the test.
	 * <p>
	 * API name: {@code blob_path}
	 */
	public final String blobPath() {
		return this.blobPath;
	}

	/**
	 * Required - The number of write operations performed concurrently during the
	 * test.
	 * <p>
	 * API name: {@code concurrency}
	 */
	public final int concurrency() {
		return this.concurrency;
	}

	/**
	 * Required - The node that coordinated the analysis and performed the final
	 * cleanup.
	 * <p>
	 * API name: {@code coordinating_node}
	 */
	public final SnapshotNodeInfo coordinatingNode() {
		return this.coordinatingNode;
	}

	/**
	 * Required - The time it took to delete all the blobs in the container.
	 * <p>
	 * API name: {@code delete_elapsed}
	 */
	public final Time deleteElapsed() {
		return this.deleteElapsed;
	}

	/**
	 * Required - The time it took to delete all the blobs in the container, in
	 * nanoseconds.
	 * <p>
	 * API name: {@code delete_elapsed_nanos}
	 */
	public final long deleteElapsedNanos() {
		return this.deleteElapsedNanos;
	}

	/**
	 * Required - A description of every read and write operation performed during
	 * the test.
	 * <p>
	 * API name: {@code details}
	 */
	public final DetailsInfo details() {
		return this.details;
	}

	/**
	 * Required - The limit on the number of nodes on which early read operations
	 * were performed after writing each blob.
	 * <p>
	 * API name: {@code early_read_node_count}
	 */
	public final int earlyReadNodeCount() {
		return this.earlyReadNodeCount;
	}

	/**
	 * Required - A list of correctness issues detected, which is empty if the API
	 * succeeded. It is included to emphasize that a successful response does not
	 * guarantee correct behaviour in future.
	 * <p>
	 * API name: {@code issues_detected}
	 */
	public final List<String> issuesDetected() {
		return this.issuesDetected;
	}

	/**
	 * Required - The time it took to retrieve a list of all the blobs in the
	 * container.
	 * <p>
	 * API name: {@code listing_elapsed}
	 */
	public final Time listingElapsed() {
		return this.listingElapsed;
	}

	/**
	 * Required - The time it took to retrieve a list of all the blobs in the
	 * container, in nanoseconds.
	 * <p>
	 * API name: {@code listing_elapsed_nanos}
	 */
	public final long listingElapsedNanos() {
		return this.listingElapsedNanos;
	}

	/**
	 * Required - The limit on the size of a blob written during the test.
	 * <p>
	 * API name: {@code max_blob_size}
	 */
	public final String maxBlobSize() {
		return this.maxBlobSize;
	}

	/**
	 * Required - The limit, in bytes, on the size of a blob written during the
	 * test.
	 * <p>
	 * API name: {@code max_blob_size_bytes}
	 */
	public final long maxBlobSizeBytes() {
		return this.maxBlobSizeBytes;
	}

	/**
	 * Required - The limit on the total size of all blob written during the test.
	 * <p>
	 * API name: {@code max_total_data_size}
	 */
	public final String maxTotalDataSize() {
		return this.maxTotalDataSize;
	}

	/**
	 * Required - The limit, in bytes, on the total size of all blob written during
	 * the test.
	 * <p>
	 * API name: {@code max_total_data_size_bytes}
	 */
	public final long maxTotalDataSizeBytes() {
		return this.maxTotalDataSizeBytes;
	}

	/**
	 * Required - The probability of performing rare actions during the test.
	 * <p>
	 * API name: {@code rare_action_probability}
	 */
	public final double rareActionProbability() {
		return this.rareActionProbability;
	}

	/**
	 * Required - The limit on the number of nodes on which read operations were
	 * performed after writing each blob.
	 * <p>
	 * API name: {@code read_node_count}
	 */
	public final int readNodeCount() {
		return this.readNodeCount;
	}

	/**
	 * Required - The name of the repository that was the subject of the analysis.
	 * <p>
	 * API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * Required - The seed for the pseudo-random number generator used to generate
	 * the operations used during the test.
	 * <p>
	 * API name: {@code seed}
	 */
	public final long seed() {
		return this.seed;
	}

	/**
	 * Required - A collection of statistics that summarize the results of the test.
	 * <p>
	 * API name: {@code summary}
	 */
	public final SummaryInfo summary() {
		return this.summary;
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

		generator.writeKey("blob_count");
		generator.write(this.blobCount);

		generator.writeKey("blob_path");
		generator.write(this.blobPath);

		generator.writeKey("concurrency");
		generator.write(this.concurrency);

		generator.writeKey("coordinating_node");
		this.coordinatingNode.serialize(generator, mapper);

		generator.writeKey("delete_elapsed");
		this.deleteElapsed.serialize(generator, mapper);

		generator.writeKey("delete_elapsed_nanos");
		generator.write(this.deleteElapsedNanos);

		generator.writeKey("details");
		this.details.serialize(generator, mapper);

		generator.writeKey("early_read_node_count");
		generator.write(this.earlyReadNodeCount);

		if (ApiTypeHelper.isDefined(this.issuesDetected)) {
			generator.writeKey("issues_detected");
			generator.writeStartArray();
			for (String item0 : this.issuesDetected) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("listing_elapsed");
		this.listingElapsed.serialize(generator, mapper);

		generator.writeKey("listing_elapsed_nanos");
		generator.write(this.listingElapsedNanos);

		generator.writeKey("max_blob_size");
		generator.write(this.maxBlobSize);

		generator.writeKey("max_blob_size_bytes");
		generator.write(this.maxBlobSizeBytes);

		generator.writeKey("max_total_data_size");
		generator.write(this.maxTotalDataSize);

		generator.writeKey("max_total_data_size_bytes");
		generator.write(this.maxTotalDataSizeBytes);

		generator.writeKey("rare_action_probability");
		generator.write(this.rareActionProbability);

		generator.writeKey("read_node_count");
		generator.write(this.readNodeCount);

		generator.writeKey("repository");
		generator.write(this.repository);

		generator.writeKey("seed");
		generator.write(this.seed);

		generator.writeKey("summary");
		this.summary.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositoryAnalyzeResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RepositoryAnalyzeResponse> {
		private Integer blobCount;

		private String blobPath;

		private Integer concurrency;

		private SnapshotNodeInfo coordinatingNode;

		private Time deleteElapsed;

		private Long deleteElapsedNanos;

		private DetailsInfo details;

		private Integer earlyReadNodeCount;

		private List<String> issuesDetected;

		private Time listingElapsed;

		private Long listingElapsedNanos;

		private String maxBlobSize;

		private Long maxBlobSizeBytes;

		private String maxTotalDataSize;

		private Long maxTotalDataSizeBytes;

		private Double rareActionProbability;

		private Integer readNodeCount;

		private String repository;

		private Long seed;

		private SummaryInfo summary;

		/**
		 * Required - The number of blobs written to the repository during the test.
		 * <p>
		 * API name: {@code blob_count}
		 */
		public final Builder blobCount(int value) {
			this.blobCount = value;
			return this;
		}

		/**
		 * Required - The path in the repository under which all the blobs were written
		 * during the test.
		 * <p>
		 * API name: {@code blob_path}
		 */
		public final Builder blobPath(String value) {
			this.blobPath = value;
			return this;
		}

		/**
		 * Required - The number of write operations performed concurrently during the
		 * test.
		 * <p>
		 * API name: {@code concurrency}
		 */
		public final Builder concurrency(int value) {
			this.concurrency = value;
			return this;
		}

		/**
		 * Required - The node that coordinated the analysis and performed the final
		 * cleanup.
		 * <p>
		 * API name: {@code coordinating_node}
		 */
		public final Builder coordinatingNode(SnapshotNodeInfo value) {
			this.coordinatingNode = value;
			return this;
		}

		/**
		 * Required - The node that coordinated the analysis and performed the final
		 * cleanup.
		 * <p>
		 * API name: {@code coordinating_node}
		 */
		public final Builder coordinatingNode(Function<SnapshotNodeInfo.Builder, ObjectBuilder<SnapshotNodeInfo>> fn) {
			return this.coordinatingNode(fn.apply(new SnapshotNodeInfo.Builder()).build());
		}

		/**
		 * Required - The time it took to delete all the blobs in the container.
		 * <p>
		 * API name: {@code delete_elapsed}
		 */
		public final Builder deleteElapsed(Time value) {
			this.deleteElapsed = value;
			return this;
		}

		/**
		 * Required - The time it took to delete all the blobs in the container.
		 * <p>
		 * API name: {@code delete_elapsed}
		 */
		public final Builder deleteElapsed(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.deleteElapsed(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The time it took to delete all the blobs in the container, in
		 * nanoseconds.
		 * <p>
		 * API name: {@code delete_elapsed_nanos}
		 */
		public final Builder deleteElapsedNanos(long value) {
			this.deleteElapsedNanos = value;
			return this;
		}

		/**
		 * Required - A description of every read and write operation performed during
		 * the test.
		 * <p>
		 * API name: {@code details}
		 */
		public final Builder details(DetailsInfo value) {
			this.details = value;
			return this;
		}

		/**
		 * Required - A description of every read and write operation performed during
		 * the test.
		 * <p>
		 * API name: {@code details}
		 */
		public final Builder details(Function<DetailsInfo.Builder, ObjectBuilder<DetailsInfo>> fn) {
			return this.details(fn.apply(new DetailsInfo.Builder()).build());
		}

		/**
		 * Required - The limit on the number of nodes on which early read operations
		 * were performed after writing each blob.
		 * <p>
		 * API name: {@code early_read_node_count}
		 */
		public final Builder earlyReadNodeCount(int value) {
			this.earlyReadNodeCount = value;
			return this;
		}

		/**
		 * Required - A list of correctness issues detected, which is empty if the API
		 * succeeded. It is included to emphasize that a successful response does not
		 * guarantee correct behaviour in future.
		 * <p>
		 * API name: {@code issues_detected}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>issuesDetected</code>.
		 */
		public final Builder issuesDetected(List<String> list) {
			this.issuesDetected = _listAddAll(this.issuesDetected, list);
			return this;
		}

		/**
		 * Required - A list of correctness issues detected, which is empty if the API
		 * succeeded. It is included to emphasize that a successful response does not
		 * guarantee correct behaviour in future.
		 * <p>
		 * API name: {@code issues_detected}
		 * <p>
		 * Adds one or more values to <code>issuesDetected</code>.
		 */
		public final Builder issuesDetected(String value, String... values) {
			this.issuesDetected = _listAdd(this.issuesDetected, value, values);
			return this;
		}

		/**
		 * Required - The time it took to retrieve a list of all the blobs in the
		 * container.
		 * <p>
		 * API name: {@code listing_elapsed}
		 */
		public final Builder listingElapsed(Time value) {
			this.listingElapsed = value;
			return this;
		}

		/**
		 * Required - The time it took to retrieve a list of all the blobs in the
		 * container.
		 * <p>
		 * API name: {@code listing_elapsed}
		 */
		public final Builder listingElapsed(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.listingElapsed(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The time it took to retrieve a list of all the blobs in the
		 * container, in nanoseconds.
		 * <p>
		 * API name: {@code listing_elapsed_nanos}
		 */
		public final Builder listingElapsedNanos(long value) {
			this.listingElapsedNanos = value;
			return this;
		}

		/**
		 * Required - The limit on the size of a blob written during the test.
		 * <p>
		 * API name: {@code max_blob_size}
		 */
		public final Builder maxBlobSize(String value) {
			this.maxBlobSize = value;
			return this;
		}

		/**
		 * Required - The limit, in bytes, on the size of a blob written during the
		 * test.
		 * <p>
		 * API name: {@code max_blob_size_bytes}
		 */
		public final Builder maxBlobSizeBytes(long value) {
			this.maxBlobSizeBytes = value;
			return this;
		}

		/**
		 * Required - The limit on the total size of all blob written during the test.
		 * <p>
		 * API name: {@code max_total_data_size}
		 */
		public final Builder maxTotalDataSize(String value) {
			this.maxTotalDataSize = value;
			return this;
		}

		/**
		 * Required - The limit, in bytes, on the total size of all blob written during
		 * the test.
		 * <p>
		 * API name: {@code max_total_data_size_bytes}
		 */
		public final Builder maxTotalDataSizeBytes(long value) {
			this.maxTotalDataSizeBytes = value;
			return this;
		}

		/**
		 * Required - The probability of performing rare actions during the test.
		 * <p>
		 * API name: {@code rare_action_probability}
		 */
		public final Builder rareActionProbability(double value) {
			this.rareActionProbability = value;
			return this;
		}

		/**
		 * Required - The limit on the number of nodes on which read operations were
		 * performed after writing each blob.
		 * <p>
		 * API name: {@code read_node_count}
		 */
		public final Builder readNodeCount(int value) {
			this.readNodeCount = value;
			return this;
		}

		/**
		 * Required - The name of the repository that was the subject of the analysis.
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - The seed for the pseudo-random number generator used to generate
		 * the operations used during the test.
		 * <p>
		 * API name: {@code seed}
		 */
		public final Builder seed(long value) {
			this.seed = value;
			return this;
		}

		/**
		 * Required - A collection of statistics that summarize the results of the test.
		 * <p>
		 * API name: {@code summary}
		 */
		public final Builder summary(SummaryInfo value) {
			this.summary = value;
			return this;
		}

		/**
		 * Required - A collection of statistics that summarize the results of the test.
		 * <p>
		 * API name: {@code summary}
		 */
		public final Builder summary(Function<SummaryInfo.Builder, ObjectBuilder<SummaryInfo>> fn) {
			return this.summary(fn.apply(new SummaryInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RepositoryAnalyzeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoryAnalyzeResponse build() {
			_checkSingleUse();

			return new RepositoryAnalyzeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RepositoryAnalyzeResponse}
	 */
	public static final JsonpDeserializer<RepositoryAnalyzeResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RepositoryAnalyzeResponse::setupRepositoryAnalyzeResponseDeserializer);

	protected static void setupRepositoryAnalyzeResponseDeserializer(
			ObjectDeserializer<RepositoryAnalyzeResponse.Builder> op) {

		op.add(Builder::blobCount, JsonpDeserializer.integerDeserializer(), "blob_count");
		op.add(Builder::blobPath, JsonpDeserializer.stringDeserializer(), "blob_path");
		op.add(Builder::concurrency, JsonpDeserializer.integerDeserializer(), "concurrency");
		op.add(Builder::coordinatingNode, SnapshotNodeInfo._DESERIALIZER, "coordinating_node");
		op.add(Builder::deleteElapsed, Time._DESERIALIZER, "delete_elapsed");
		op.add(Builder::deleteElapsedNanos, JsonpDeserializer.longDeserializer(), "delete_elapsed_nanos");
		op.add(Builder::details, DetailsInfo._DESERIALIZER, "details");
		op.add(Builder::earlyReadNodeCount, JsonpDeserializer.integerDeserializer(), "early_read_node_count");
		op.add(Builder::issuesDetected, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"issues_detected");
		op.add(Builder::listingElapsed, Time._DESERIALIZER, "listing_elapsed");
		op.add(Builder::listingElapsedNanos, JsonpDeserializer.longDeserializer(), "listing_elapsed_nanos");
		op.add(Builder::maxBlobSize, JsonpDeserializer.stringDeserializer(), "max_blob_size");
		op.add(Builder::maxBlobSizeBytes, JsonpDeserializer.longDeserializer(), "max_blob_size_bytes");
		op.add(Builder::maxTotalDataSize, JsonpDeserializer.stringDeserializer(), "max_total_data_size");
		op.add(Builder::maxTotalDataSizeBytes, JsonpDeserializer.longDeserializer(), "max_total_data_size_bytes");
		op.add(Builder::rareActionProbability, JsonpDeserializer.doubleDeserializer(), "rare_action_probability");
		op.add(Builder::readNodeCount, JsonpDeserializer.integerDeserializer(), "read_node_count");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository");
		op.add(Builder::seed, JsonpDeserializer.longDeserializer(), "seed");
		op.add(Builder::summary, SummaryInfo._DESERIALIZER, "summary");

	}

}
