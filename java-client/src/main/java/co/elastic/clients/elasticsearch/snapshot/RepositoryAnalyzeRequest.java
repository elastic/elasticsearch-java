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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
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

// typedef: snapshot.repository_analyze.Request

/**
 * Analyze a snapshot repository. Analyze the performance characteristics and
 * any incorrect behaviour found in a repository.
 * <p>
 * The response exposes implementation details of the analysis which may change
 * from version to version. The response body format is therefore not considered
 * stable and may be different in newer versions.
 * <p>
 * There are a large number of third-party storage systems available, not all of
 * which are suitable for use as a snapshot repository by Elasticsearch. Some
 * storage systems behave incorrectly, or perform poorly, especially when
 * accessed concurrently by multiple clients as the nodes of an Elasticsearch
 * cluster do. This API performs a collection of read and write operations on
 * your repository which are designed to detect incorrect behaviour and to
 * measure the performance characteristics of your storage system.
 * <p>
 * The default values for the parameters are deliberately low to reduce the
 * impact of running an analysis inadvertently and to provide a sensible
 * starting point for your investigations. Run your first analysis with the
 * default parameter values to check for simple problems. If successful, run a
 * sequence of increasingly large analyses until you encounter a failure or you
 * reach a <code>blob_count</code> of at least <code>2000</code>, a
 * <code>max_blob_size</code> of at least <code>2gb</code>, a
 * <code>max_total_data_size</code> of at least <code>1tb</code>, and a
 * <code>register_operation_count</code> of at least <code>100</code>. Always
 * specify a generous timeout, possibly <code>1h</code> or longer, to allow time
 * for each analysis to run to completion. Perform the analyses using a
 * multi-node cluster of a similar size to your production cluster so that it
 * can detect any problems that only arise when the repository is accessed by
 * many nodes at once.
 * <p>
 * If the analysis fails, Elasticsearch detected that your repository behaved
 * unexpectedly. This usually means you are using a third-party storage system
 * with an incorrect or incompatible implementation of the API it claims to
 * support. If so, this storage system is not suitable for use as a snapshot
 * repository. You will need to work with the supplier of your storage system to
 * address the incompatibilities that Elasticsearch detects.
 * <p>
 * If the analysis is successful, the API returns details of the testing
 * process, optionally including how long each operation took. You can use this
 * information to determine the performance of your storage system. If any
 * operation fails or returns an incorrect result, the API returns an error. If
 * the API returns an error, it may not have removed all the data it wrote to
 * the repository. The error will indicate the location of any leftover data and
 * this path is also recorded in the Elasticsearch logs. You should verify that
 * this location has been cleaned up correctly. If there is still leftover data
 * at the specified location, you should manually remove it.
 * <p>
 * If the connection from your client to Elasticsearch is closed while the
 * client is waiting for the result of the analysis, the test is cancelled. Some
 * clients are configured to close their connection if no response is received
 * within a certain timeout. An analysis takes a long time to complete so you
 * might need to relax any such client-side timeouts. On cancellation the
 * analysis attempts to clean up the data it was writing, but it may not be able
 * to remove it all. The path to the leftover data is recorded in the
 * Elasticsearch logs. You should verify that this location has been cleaned up
 * correctly. If there is still leftover data at the specified location, you
 * should manually remove it.
 * <p>
 * If the analysis is successful then it detected no incorrect behaviour, but
 * this does not mean that correct behaviour is guaranteed. The analysis
 * attempts to detect common bugs but it does not offer 100% coverage.
 * Additionally, it does not test the following:
 * <ul>
 * <li>Your repository must perform durable writes. Once a blob has been written
 * it must remain in place until it is deleted, even after a power loss or
 * similar disaster.</li>
 * <li>Your repository must not suffer from silent data corruption. Once a blob
 * has been written, its contents must remain unchanged until it is deliberately
 * modified or deleted.</li>
 * <li>Your repository must behave correctly even if connectivity from the
 * cluster is disrupted. Reads and writes may fail in this case, but they must
 * not return incorrect results.</li>
 * </ul>
 * <p>
 * IMPORTANT: An analysis writes a substantial amount of data to your repository
 * and then reads it back again. This consumes bandwidth on the network between
 * the cluster and the repository, and storage space and I/O bandwidth on the
 * repository itself. You must ensure this load does not affect other users of
 * these systems. Analyses respect the repository settings
 * <code>max_snapshot_bytes_per_sec</code> and
 * <code>max_restore_bytes_per_sec</code> if available and the cluster setting
 * <code>indices.recovery.max_bytes_per_sec</code> which you can use to limit
 * the bandwidth they consume.
 * <p>
 * NOTE: This API is intended for exploratory use by humans. You should expect
 * the request parameters and the response format to vary in future versions.
 * <p>
 * NOTE: Different versions of Elasticsearch may perform different checks for
 * repository compatibility, with newer versions typically being stricter than
 * older ones. A storage system that passes repository analysis with one version
 * of Elasticsearch may fail with a different version. This indicates it behaves
 * incorrectly in ways that the former version did not detect. You must work
 * with the supplier of your storage system to address the incompatibilities
 * detected by the repository analysis API in any version of Elasticsearch.
 * <p>
 * NOTE: This API may not work correctly in a mixed-version cluster.
 * <p>
 * <em>Implementation details</em>
 * <p>
 * NOTE: This section of documentation describes how the repository analysis API
 * works in this version of Elasticsearch, but you should expect the
 * implementation to vary between versions. The request parameters and response
 * format depend on details of the implementation so may also be different in
 * newer versions.
 * <p>
 * The analysis comprises a number of blob-level tasks, as set by the
 * <code>blob_count</code> parameter and a number of compare-and-exchange
 * operations on linearizable registers, as set by the
 * <code>register_operation_count</code> parameter. These tasks are distributed
 * over the data and master-eligible nodes in the cluster for execution.
 * <p>
 * For most blob-level tasks, the executing node first writes a blob to the
 * repository and then instructs some of the other nodes in the cluster to
 * attempt to read the data it just wrote. The size of the blob is chosen
 * randomly, according to the <code>max_blob_size</code> and
 * <code>max_total_data_size</code> parameters. If any of these reads fails then
 * the repository does not implement the necessary read-after-write semantics
 * that Elasticsearch requires.
 * <p>
 * For some blob-level tasks, the executing node will instruct some of its peers
 * to attempt to read the data before the writing process completes. These reads
 * are permitted to fail, but must not return partial data. If any read returns
 * partial data then the repository does not implement the necessary atomicity
 * semantics that Elasticsearch requires.
 * <p>
 * For some blob-level tasks, the executing node will overwrite the blob while
 * its peers are reading it. In this case the data read may come from either the
 * original or the overwritten blob, but the read operation must not return
 * partial data or a mix of data from the two blobs. If any of these reads
 * returns partial data or a mix of the two blobs then the repository does not
 * implement the necessary atomicity semantics that Elasticsearch requires for
 * overwrites.
 * <p>
 * The executing node will use a variety of different methods to write the blob.
 * For instance, where applicable, it will use both single-part and multi-part
 * uploads. Similarly, the reading nodes will use a variety of different methods
 * to read the data back again. For instance they may read the entire blob from
 * start to end or may read only a subset of the data.
 * <p>
 * For some blob-level tasks, the executing node will cancel the write before it
 * is complete. In this case, it still instructs some of the other nodes in the
 * cluster to attempt to read the blob but all of these reads must fail to find
 * the blob.
 * <p>
 * Linearizable registers are special blobs that Elasticsearch manipulates using
 * an atomic compare-and-exchange operation. This operation ensures correct and
 * strongly-consistent behavior even when the blob is accessed by multiple nodes
 * at the same time. The detailed implementation of the compare-and-exchange
 * operation on linearizable registers varies by repository type. Repository
 * analysis verifies that that uncontended compare-and-exchange operations on a
 * linearizable register blob always succeed. Repository analysis also verifies
 * that contended operations either succeed or report the contention but do not
 * return incorrect results. If an operation fails due to contention,
 * Elasticsearch retries the operation until it succeeds. Most of the
 * compare-and-exchange operations performed by repository analysis atomically
 * increment a counter which is represented as an 8-byte blob. Some operations
 * also verify the behavior on small blobs with sizes other than 8 bytes.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot.repository_analyze.Request">API
 *      specification</a>
 */

public class RepositoryAnalyzeRequest extends RequestBase {
	@Nullable
	private final Integer blobCount;

	@Nullable
	private final Integer concurrency;

	@Nullable
	private final Boolean detailed;

	@Nullable
	private final Integer earlyReadNodeCount;

	@Nullable
	private final String maxBlobSize;

	@Nullable
	private final String maxTotalDataSize;

	private final String name;

	@Nullable
	private final Double rareActionProbability;

	@Nullable
	private final Boolean rarelyAbortWrites;

	@Nullable
	private final Integer readNodeCount;

	@Nullable
	private final Integer registerOperationCount;

	@Nullable
	private final Integer seed;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private RepositoryAnalyzeRequest(Builder builder) {

		this.blobCount = builder.blobCount;
		this.concurrency = builder.concurrency;
		this.detailed = builder.detailed;
		this.earlyReadNodeCount = builder.earlyReadNodeCount;
		this.maxBlobSize = builder.maxBlobSize;
		this.maxTotalDataSize = builder.maxTotalDataSize;
		this.name = ApiTypeHelper.requireNonNullWithDefault(builder.name, this, "name", this.name());
		this.rareActionProbability = builder.rareActionProbability;
		this.rarelyAbortWrites = builder.rarelyAbortWrites;
		this.readNodeCount = builder.readNodeCount;
		this.registerOperationCount = builder.registerOperationCount;
		this.seed = builder.seed;
		this.timeout = builder.timeout;

	}

	public static RepositoryAnalyzeRequest of(Function<Builder, ObjectBuilder<RepositoryAnalyzeRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The total number of blobs to write to the repository during the test. For
	 * realistic experiments, you should set it to at least <code>2000</code>.
	 * <p>
	 * API name: {@code blob_count}
	 */
	@Nullable
	public final Integer blobCount() {
		return this.blobCount;
	}

	/**
	 * The number of operations to run concurrently during the test.
	 * <p>
	 * API name: {@code concurrency}
	 */
	@Nullable
	public final Integer concurrency() {
		return this.concurrency;
	}

	/**
	 * Indicates whether to return detailed results, including timing information
	 * for every operation performed during the analysis. If false, it returns only
	 * a summary of the analysis.
	 * <p>
	 * API name: {@code detailed}
	 */
	@Nullable
	public final Boolean detailed() {
		return this.detailed;
	}

	/**
	 * The number of nodes on which to perform an early read operation while writing
	 * each blob. Early read operations are only rarely performed.
	 * <p>
	 * API name: {@code early_read_node_count}
	 */
	@Nullable
	public final Integer earlyReadNodeCount() {
		return this.earlyReadNodeCount;
	}

	/**
	 * The maximum size of a blob to be written during the test. For realistic
	 * experiments, you should set it to at least <code>2gb</code>.
	 * <p>
	 * API name: {@code max_blob_size}
	 */
	@Nullable
	public final String maxBlobSize() {
		return this.maxBlobSize;
	}

	/**
	 * An upper limit on the total size of all the blobs written during the test.
	 * For realistic experiments, you should set it to at least <code>1tb</code>.
	 * <p>
	 * API name: {@code max_total_data_size}
	 */
	@Nullable
	public final String maxTotalDataSize() {
		return this.maxTotalDataSize;
	}

	/**
	 * Required - The name of the repository.
	 * <p>
	 * API name: {@code repository}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * The probability of performing a rare action such as an early read, an
	 * overwrite, or an aborted write on each blob.
	 * <p>
	 * API name: {@code rare_action_probability}
	 */
	@Nullable
	public final Double rareActionProbability() {
		return this.rareActionProbability;
	}

	/**
	 * Indicates whether to rarely cancel writes before they complete.
	 * <p>
	 * API name: {@code rarely_abort_writes}
	 */
	@Nullable
	public final Boolean rarelyAbortWrites() {
		return this.rarelyAbortWrites;
	}

	/**
	 * The number of nodes on which to read a blob after writing.
	 * <p>
	 * API name: {@code read_node_count}
	 */
	@Nullable
	public final Integer readNodeCount() {
		return this.readNodeCount;
	}

	/**
	 * The minimum number of linearizable register operations to perform in total.
	 * For realistic experiments, you should set it to at least <code>100</code>.
	 * <p>
	 * API name: {@code register_operation_count}
	 */
	@Nullable
	public final Integer registerOperationCount() {
		return this.registerOperationCount;
	}

	/**
	 * The seed for the pseudo-random number generator used to generate the list of
	 * operations performed during the test. To repeat the same set of operations in
	 * multiple experiments, use the same seed in each experiment. Note that the
	 * operations are performed concurrently so might not always happen in the same
	 * order on each run.
	 * <p>
	 * API name: {@code seed}
	 */
	@Nullable
	public final Integer seed() {
		return this.seed;
	}

	/**
	 * The period of time to wait for the test to complete. If no response is
	 * received before the timeout expires, the test is cancelled and returns an
	 * error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositoryAnalyzeRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RepositoryAnalyzeRequest> {
		@Nullable
		private Integer blobCount;

		@Nullable
		private Integer concurrency;

		@Nullable
		private Boolean detailed;

		@Nullable
		private Integer earlyReadNodeCount;

		@Nullable
		private String maxBlobSize;

		@Nullable
		private String maxTotalDataSize;

		private String name;

		@Nullable
		private Double rareActionProbability;

		@Nullable
		private Boolean rarelyAbortWrites;

		@Nullable
		private Integer readNodeCount;

		@Nullable
		private Integer registerOperationCount;

		@Nullable
		private Integer seed;

		@Nullable
		private Time timeout;

		/**
		 * The total number of blobs to write to the repository during the test. For
		 * realistic experiments, you should set it to at least <code>2000</code>.
		 * <p>
		 * API name: {@code blob_count}
		 */
		public final Builder blobCount(@Nullable Integer value) {
			this.blobCount = value;
			return this;
		}

		/**
		 * The number of operations to run concurrently during the test.
		 * <p>
		 * API name: {@code concurrency}
		 */
		public final Builder concurrency(@Nullable Integer value) {
			this.concurrency = value;
			return this;
		}

		/**
		 * Indicates whether to return detailed results, including timing information
		 * for every operation performed during the analysis. If false, it returns only
		 * a summary of the analysis.
		 * <p>
		 * API name: {@code detailed}
		 */
		public final Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
			return this;
		}

		/**
		 * The number of nodes on which to perform an early read operation while writing
		 * each blob. Early read operations are only rarely performed.
		 * <p>
		 * API name: {@code early_read_node_count}
		 */
		public final Builder earlyReadNodeCount(@Nullable Integer value) {
			this.earlyReadNodeCount = value;
			return this;
		}

		/**
		 * The maximum size of a blob to be written during the test. For realistic
		 * experiments, you should set it to at least <code>2gb</code>.
		 * <p>
		 * API name: {@code max_blob_size}
		 */
		public final Builder maxBlobSize(@Nullable String value) {
			this.maxBlobSize = value;
			return this;
		}

		/**
		 * An upper limit on the total size of all the blobs written during the test.
		 * For realistic experiments, you should set it to at least <code>1tb</code>.
		 * <p>
		 * API name: {@code max_total_data_size}
		 */
		public final Builder maxTotalDataSize(@Nullable String value) {
			this.maxTotalDataSize = value;
			return this;
		}

		/**
		 * Required - The name of the repository.
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * The probability of performing a rare action such as an early read, an
		 * overwrite, or an aborted write on each blob.
		 * <p>
		 * API name: {@code rare_action_probability}
		 */
		public final Builder rareActionProbability(@Nullable Double value) {
			this.rareActionProbability = value;
			return this;
		}

		/**
		 * Indicates whether to rarely cancel writes before they complete.
		 * <p>
		 * API name: {@code rarely_abort_writes}
		 */
		public final Builder rarelyAbortWrites(@Nullable Boolean value) {
			this.rarelyAbortWrites = value;
			return this;
		}

		/**
		 * The number of nodes on which to read a blob after writing.
		 * <p>
		 * API name: {@code read_node_count}
		 */
		public final Builder readNodeCount(@Nullable Integer value) {
			this.readNodeCount = value;
			return this;
		}

		/**
		 * The minimum number of linearizable register operations to perform in total.
		 * For realistic experiments, you should set it to at least <code>100</code>.
		 * <p>
		 * API name: {@code register_operation_count}
		 */
		public final Builder registerOperationCount(@Nullable Integer value) {
			this.registerOperationCount = value;
			return this;
		}

		/**
		 * The seed for the pseudo-random number generator used to generate the list of
		 * operations performed during the test. To repeat the same set of operations in
		 * multiple experiments, use the same seed in each experiment. Note that the
		 * operations are performed concurrently so might not always happen in the same
		 * order on each run.
		 * <p>
		 * API name: {@code seed}
		 */
		public final Builder seed(@Nullable Integer value) {
			this.seed = value;
			return this;
		}

		/**
		 * The period of time to wait for the test to complete. If no response is
		 * received before the timeout expires, the test is cancelled and returns an
		 * error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period of time to wait for the test to complete. If no response is
		 * received before the timeout expires, the test is cancelled and returns an
		 * error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RepositoryAnalyzeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoryAnalyzeRequest build() {
			_checkSingleUse();

			return new RepositoryAnalyzeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.repository_analyze}".
	 */
	public static final Endpoint<RepositoryAnalyzeRequest, RepositoryAnalyzeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/snapshot.repository_analyze",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					buf.append("/_analyze");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.rareActionProbability != null) {
					params.put("rare_action_probability", String.valueOf(request.rareActionProbability));
				}
				if (request.seed != null) {
					params.put("seed", String.valueOf(request.seed));
				}
				if (request.detailed != null) {
					params.put("detailed", String.valueOf(request.detailed));
				}
				if (request.maxBlobSize != null) {
					params.put("max_blob_size", request.maxBlobSize);
				}
				if (request.earlyReadNodeCount != null) {
					params.put("early_read_node_count", String.valueOf(request.earlyReadNodeCount));
				}
				if (request.blobCount != null) {
					params.put("blob_count", String.valueOf(request.blobCount));
				}
				if (request.rarelyAbortWrites != null) {
					params.put("rarely_abort_writes", String.valueOf(request.rarelyAbortWrites));
				}
				if (request.maxTotalDataSize != null) {
					params.put("max_total_data_size", request.maxTotalDataSize);
				}
				if (request.readNodeCount != null) {
					params.put("read_node_count", String.valueOf(request.readNodeCount));
				}
				if (request.registerOperationCount != null) {
					params.put("register_operation_count", String.valueOf(request.registerOperationCount));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				if (request.concurrency != null) {
					params.put("concurrency", String.valueOf(request.concurrency));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, RepositoryAnalyzeResponse._DESERIALIZER);
}
