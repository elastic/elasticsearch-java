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

package co.elastic.clients.elasticsearch;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch.async_search.ElasticsearchAsyncSearchClient;
import co.elastic.clients.elasticsearch.autoscaling.ElasticsearchAutoscalingClient;
import co.elastic.clients.elasticsearch.cat.ElasticsearchCatClient;
import co.elastic.clients.elasticsearch.ccr.ElasticsearchCcrClient;
import co.elastic.clients.elasticsearch.cluster.ElasticsearchClusterClient;
import co.elastic.clients.elasticsearch.connector.ElasticsearchConnectorClient;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.ClearScrollRequest;
import co.elastic.clients.elasticsearch.core.ClearScrollResponse;
import co.elastic.clients.elasticsearch.core.ClosePointInTimeRequest;
import co.elastic.clients.elasticsearch.core.ClosePointInTimeResponse;
import co.elastic.clients.elasticsearch.core.CountRequest;
import co.elastic.clients.elasticsearch.core.CountResponse;
import co.elastic.clients.elasticsearch.core.CreateRequest;
import co.elastic.clients.elasticsearch.core.CreateResponse;
import co.elastic.clients.elasticsearch.core.DeleteByQueryRequest;
import co.elastic.clients.elasticsearch.core.DeleteByQueryResponse;
import co.elastic.clients.elasticsearch.core.DeleteByQueryRethrottleRequest;
import co.elastic.clients.elasticsearch.core.DeleteByQueryRethrottleResponse;
import co.elastic.clients.elasticsearch.core.DeleteRequest;
import co.elastic.clients.elasticsearch.core.DeleteResponse;
import co.elastic.clients.elasticsearch.core.DeleteScriptRequest;
import co.elastic.clients.elasticsearch.core.DeleteScriptResponse;
import co.elastic.clients.elasticsearch.core.ExistsRequest;
import co.elastic.clients.elasticsearch.core.ExistsSourceRequest;
import co.elastic.clients.elasticsearch.core.ExplainRequest;
import co.elastic.clients.elasticsearch.core.ExplainResponse;
import co.elastic.clients.elasticsearch.core.FieldCapsRequest;
import co.elastic.clients.elasticsearch.core.FieldCapsResponse;
import co.elastic.clients.elasticsearch.core.GetRequest;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.GetScriptContextRequest;
import co.elastic.clients.elasticsearch.core.GetScriptContextResponse;
import co.elastic.clients.elasticsearch.core.GetScriptLanguagesRequest;
import co.elastic.clients.elasticsearch.core.GetScriptLanguagesResponse;
import co.elastic.clients.elasticsearch.core.GetScriptRequest;
import co.elastic.clients.elasticsearch.core.GetScriptResponse;
import co.elastic.clients.elasticsearch.core.GetSourceRequest;
import co.elastic.clients.elasticsearch.core.GetSourceResponse;
import co.elastic.clients.elasticsearch.core.HealthReportRequest;
import co.elastic.clients.elasticsearch.core.HealthReportResponse;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.InfoRequest;
import co.elastic.clients.elasticsearch.core.InfoResponse;
import co.elastic.clients.elasticsearch.core.MgetRequest;
import co.elastic.clients.elasticsearch.core.MgetResponse;
import co.elastic.clients.elasticsearch.core.MsearchRequest;
import co.elastic.clients.elasticsearch.core.MsearchResponse;
import co.elastic.clients.elasticsearch.core.MsearchTemplateRequest;
import co.elastic.clients.elasticsearch.core.MsearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.MtermvectorsRequest;
import co.elastic.clients.elasticsearch.core.MtermvectorsResponse;
import co.elastic.clients.elasticsearch.core.OpenPointInTimeRequest;
import co.elastic.clients.elasticsearch.core.OpenPointInTimeResponse;
import co.elastic.clients.elasticsearch.core.PingRequest;
import co.elastic.clients.elasticsearch.core.PutScriptRequest;
import co.elastic.clients.elasticsearch.core.PutScriptResponse;
import co.elastic.clients.elasticsearch.core.RankEvalRequest;
import co.elastic.clients.elasticsearch.core.RankEvalResponse;
import co.elastic.clients.elasticsearch.core.ReindexRequest;
import co.elastic.clients.elasticsearch.core.ReindexResponse;
import co.elastic.clients.elasticsearch.core.ReindexRethrottleRequest;
import co.elastic.clients.elasticsearch.core.ReindexRethrottleResponse;
import co.elastic.clients.elasticsearch.core.RenderSearchTemplateRequest;
import co.elastic.clients.elasticsearch.core.RenderSearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.ScriptsPainlessExecuteRequest;
import co.elastic.clients.elasticsearch.core.ScriptsPainlessExecuteResponse;
import co.elastic.clients.elasticsearch.core.ScrollRequest;
import co.elastic.clients.elasticsearch.core.ScrollResponse;
import co.elastic.clients.elasticsearch.core.SearchMvtRequest;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.SearchShardsRequest;
import co.elastic.clients.elasticsearch.core.SearchShardsResponse;
import co.elastic.clients.elasticsearch.core.SearchTemplateRequest;
import co.elastic.clients.elasticsearch.core.SearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.TermsEnumRequest;
import co.elastic.clients.elasticsearch.core.TermsEnumResponse;
import co.elastic.clients.elasticsearch.core.TermvectorsRequest;
import co.elastic.clients.elasticsearch.core.TermvectorsResponse;
import co.elastic.clients.elasticsearch.core.UpdateByQueryRequest;
import co.elastic.clients.elasticsearch.core.UpdateByQueryResponse;
import co.elastic.clients.elasticsearch.core.UpdateByQueryRethrottleRequest;
import co.elastic.clients.elasticsearch.core.UpdateByQueryRethrottleResponse;
import co.elastic.clients.elasticsearch.core.UpdateRequest;
import co.elastic.clients.elasticsearch.core.UpdateResponse;
import co.elastic.clients.elasticsearch.dangling_indices.ElasticsearchDanglingIndicesClient;
import co.elastic.clients.elasticsearch.enrich.ElasticsearchEnrichClient;
import co.elastic.clients.elasticsearch.eql.ElasticsearchEqlClient;
import co.elastic.clients.elasticsearch.esql.ElasticsearchEsqlClient;
import co.elastic.clients.elasticsearch.features.ElasticsearchFeaturesClient;
import co.elastic.clients.elasticsearch.fleet.ElasticsearchFleetClient;
import co.elastic.clients.elasticsearch.graph.ElasticsearchGraphClient;
import co.elastic.clients.elasticsearch.ilm.ElasticsearchIlmClient;
import co.elastic.clients.elasticsearch.indices.ElasticsearchIndicesClient;
import co.elastic.clients.elasticsearch.inference.ElasticsearchInferenceClient;
import co.elastic.clients.elasticsearch.ingest.ElasticsearchIngestClient;
import co.elastic.clients.elasticsearch.license.ElasticsearchLicenseClient;
import co.elastic.clients.elasticsearch.logstash.ElasticsearchLogstashClient;
import co.elastic.clients.elasticsearch.migration.ElasticsearchMigrationClient;
import co.elastic.clients.elasticsearch.ml.ElasticsearchMlClient;
import co.elastic.clients.elasticsearch.monitoring.ElasticsearchMonitoringClient;
import co.elastic.clients.elasticsearch.nodes.ElasticsearchNodesClient;
import co.elastic.clients.elasticsearch.query_rules.ElasticsearchQueryRulesClient;
import co.elastic.clients.elasticsearch.rollup.ElasticsearchRollupClient;
import co.elastic.clients.elasticsearch.search_application.ElasticsearchSearchApplicationClient;
import co.elastic.clients.elasticsearch.searchable_snapshots.ElasticsearchSearchableSnapshotsClient;
import co.elastic.clients.elasticsearch.security.ElasticsearchSecurityClient;
import co.elastic.clients.elasticsearch.shutdown.ElasticsearchShutdownClient;
import co.elastic.clients.elasticsearch.simulate.ElasticsearchSimulateClient;
import co.elastic.clients.elasticsearch.slm.ElasticsearchSlmClient;
import co.elastic.clients.elasticsearch.snapshot.ElasticsearchSnapshotClient;
import co.elastic.clients.elasticsearch.sql.ElasticsearchSqlClient;
import co.elastic.clients.elasticsearch.ssl.ElasticsearchSslClient;
import co.elastic.clients.elasticsearch.synonyms.ElasticsearchSynonymsClient;
import co.elastic.clients.elasticsearch.tasks.ElasticsearchTasksClient;
import co.elastic.clients.elasticsearch.text_structure.ElasticsearchTextStructureClient;
import co.elastic.clients.elasticsearch.transform.ElasticsearchTransformClient;
import co.elastic.clients.elasticsearch.watcher.ElasticsearchWatcherClient;
import co.elastic.clients.elasticsearch.xpack.ElasticsearchXpackClient;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.ElasticsearchTransportConfig;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.lang.reflect.Type;
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

/**
 * Client for the namespace.
 */
public class ElasticsearchClient extends ApiClient<ElasticsearchTransport, ElasticsearchClient> {

	/**
	 * Creates a client from a {@link ElasticsearchTransportConfig.Default}}
	 * configuration created with an inline lambda expression.
	 */
	public static ElasticsearchClient of(
			Function<ElasticsearchTransportConfig.Builder, ElasticsearchTransportConfig.Builder> fn) {
		return new ElasticsearchClient(fn.apply(new ElasticsearchTransportConfig.Builder()).build().buildTransport());
	}

	/**
	 * Creates a client from an {@link ElasticsearchTransportConfig}.
	 */
	public ElasticsearchClient(ElasticsearchTransportConfig config) {
		this(config.buildTransport());
	}

	public ElasticsearchClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchClient(this.transport, transportOptions);
	}

	// ----- Child clients

	public ElasticsearchAsyncSearchClient asyncSearch() {
		return new ElasticsearchAsyncSearchClient(this.transport, this.transportOptions);
	}

	public ElasticsearchAutoscalingClient autoscaling() {
		return new ElasticsearchAutoscalingClient(this.transport, this.transportOptions);
	}

	public ElasticsearchCatClient cat() {
		return new ElasticsearchCatClient(this.transport, this.transportOptions);
	}

	public ElasticsearchCcrClient ccr() {
		return new ElasticsearchCcrClient(this.transport, this.transportOptions);
	}

	public ElasticsearchClusterClient cluster() {
		return new ElasticsearchClusterClient(this.transport, this.transportOptions);
	}

	public ElasticsearchConnectorClient connector() {
		return new ElasticsearchConnectorClient(this.transport, this.transportOptions);
	}

	public ElasticsearchDanglingIndicesClient danglingIndices() {
		return new ElasticsearchDanglingIndicesClient(this.transport, this.transportOptions);
	}

	public ElasticsearchEnrichClient enrich() {
		return new ElasticsearchEnrichClient(this.transport, this.transportOptions);
	}

	public ElasticsearchEqlClient eql() {
		return new ElasticsearchEqlClient(this.transport, this.transportOptions);
	}

	public ElasticsearchEsqlClient esql() {
		return new ElasticsearchEsqlClient(this.transport, this.transportOptions);
	}

	public ElasticsearchFeaturesClient features() {
		return new ElasticsearchFeaturesClient(this.transport, this.transportOptions);
	}

	public ElasticsearchFleetClient fleet() {
		return new ElasticsearchFleetClient(this.transport, this.transportOptions);
	}

	public ElasticsearchGraphClient graph() {
		return new ElasticsearchGraphClient(this.transport, this.transportOptions);
	}

	public ElasticsearchIlmClient ilm() {
		return new ElasticsearchIlmClient(this.transport, this.transportOptions);
	}

	public ElasticsearchIndicesClient indices() {
		return new ElasticsearchIndicesClient(this.transport, this.transportOptions);
	}

	public ElasticsearchInferenceClient inference() {
		return new ElasticsearchInferenceClient(this.transport, this.transportOptions);
	}

	public ElasticsearchIngestClient ingest() {
		return new ElasticsearchIngestClient(this.transport, this.transportOptions);
	}

	public ElasticsearchLicenseClient license() {
		return new ElasticsearchLicenseClient(this.transport, this.transportOptions);
	}

	public ElasticsearchLogstashClient logstash() {
		return new ElasticsearchLogstashClient(this.transport, this.transportOptions);
	}

	public ElasticsearchMigrationClient migration() {
		return new ElasticsearchMigrationClient(this.transport, this.transportOptions);
	}

	public ElasticsearchMlClient ml() {
		return new ElasticsearchMlClient(this.transport, this.transportOptions);
	}

	public ElasticsearchMonitoringClient monitoring() {
		return new ElasticsearchMonitoringClient(this.transport, this.transportOptions);
	}

	public ElasticsearchNodesClient nodes() {
		return new ElasticsearchNodesClient(this.transport, this.transportOptions);
	}

	public ElasticsearchQueryRulesClient queryRules() {
		return new ElasticsearchQueryRulesClient(this.transport, this.transportOptions);
	}

	public ElasticsearchRollupClient rollup() {
		return new ElasticsearchRollupClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSearchApplicationClient searchApplication() {
		return new ElasticsearchSearchApplicationClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSearchableSnapshotsClient searchableSnapshots() {
		return new ElasticsearchSearchableSnapshotsClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSecurityClient security() {
		return new ElasticsearchSecurityClient(this.transport, this.transportOptions);
	}

	public ElasticsearchShutdownClient shutdown() {
		return new ElasticsearchShutdownClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSimulateClient simulate() {
		return new ElasticsearchSimulateClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSlmClient slm() {
		return new ElasticsearchSlmClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSnapshotClient snapshot() {
		return new ElasticsearchSnapshotClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSqlClient sql() {
		return new ElasticsearchSqlClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSslClient ssl() {
		return new ElasticsearchSslClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSynonymsClient synonyms() {
		return new ElasticsearchSynonymsClient(this.transport, this.transportOptions);
	}

	public ElasticsearchTasksClient tasks() {
		return new ElasticsearchTasksClient(this.transport, this.transportOptions);
	}

	public ElasticsearchTextStructureClient textStructure() {
		return new ElasticsearchTextStructureClient(this.transport, this.transportOptions);
	}

	public ElasticsearchTransformClient transform() {
		return new ElasticsearchTransformClient(this.transport, this.transportOptions);
	}

	public ElasticsearchWatcherClient watcher() {
		return new ElasticsearchWatcherClient(this.transport, this.transportOptions);
	}

	public ElasticsearchXpackClient xpack() {
		return new ElasticsearchXpackClient(this.transport, this.transportOptions);
	}

	// ----- Endpoint: bulk

	/**
	 * Bulk index or delete documents. Perform multiple <code>index</code>,
	 * <code>create</code>, <code>delete</code>, and <code>update</code> actions in
	 * a single request. This reduces overhead and can greatly increase indexing
	 * speed.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or index alias:
	 * <ul>
	 * <li>To use the <code>create</code> action, you must have the
	 * <code>create_doc</code>, <code>create</code>, <code>index</code>, or
	 * <code>write</code> index privilege. Data streams support only the
	 * <code>create</code> action.</li>
	 * <li>To use the <code>index</code> action, you must have the
	 * <code>create</code>, <code>index</code>, or <code>write</code> index
	 * privilege.</li>
	 * <li>To use the <code>delete</code> action, you must have the
	 * <code>delete</code> or <code>write</code> index privilege.</li>
	 * <li>To use the <code>update</code> action, you must have the
	 * <code>index</code> or <code>write</code> index privilege.</li>
	 * <li>To automatically create a data stream or index with a bulk API request,
	 * you must have the <code>auto_configure</code>, <code>create_index</code>, or
	 * <code>manage</code> index privilege.</li>
	 * <li>To make the result of a bulk operation visible to search using the
	 * <code>refresh</code> parameter, you must have the <code>maintenance</code> or
	 * <code>manage</code> index privilege.</li>
	 * </ul>
	 * <p>
	 * Automatic data stream creation requires a matching index template with data
	 * stream enabled.
	 * <p>
	 * The actions are specified in the request body using a newline delimited JSON
	 * (NDJSON) structure:
	 * 
	 * <pre>
	 * <code>action_and_meta_data\n
	 * optional_source\n
	 * action_and_meta_data\n
	 * optional_source\n
	 * ....
	 * action_and_meta_data\n
	 * optional_source\n
	 * </code>
	 * </pre>
	 * <p>
	 * The <code>index</code> and <code>create</code> actions expect a source on the
	 * next line and have the same semantics as the <code>op_type</code> parameter
	 * in the standard index API. A <code>create</code> action fails if a document
	 * with the same ID already exists in the target An <code>index</code> action
	 * adds or replaces a document as necessary.
	 * <p>
	 * NOTE: Data streams support only the <code>create</code> action. To update or
	 * delete a document in a data stream, you must target the backing index
	 * containing the document.
	 * <p>
	 * An <code>update</code> action expects that the partial doc, upsert, and
	 * script and its options are specified on the next line.
	 * <p>
	 * A <code>delete</code> action does not expect a source on the next line and
	 * has the same semantics as the standard delete API.
	 * <p>
	 * NOTE: The final line of data must end with a newline character
	 * (<code>\n</code>). Each newline character may be preceded by a carriage
	 * return (<code>\r</code>). When sending NDJSON data to the <code>_bulk</code>
	 * endpoint, use a <code>Content-Type</code> header of
	 * <code>application/json</code> or <code>application/x-ndjson</code>. Because
	 * this format uses literal newline characters (<code>\n</code>) as delimiters,
	 * make sure that the JSON actions and sources are not pretty printed.
	 * <p>
	 * If you provide a target in the request path, it is used for any actions that
	 * don't explicitly specify an <code>_index</code> argument.
	 * <p>
	 * A note on the format: the idea here is to make processing as fast as
	 * possible. As some of the actions are redirected to other shards on other
	 * nodes, only <code>action_meta_data</code> is parsed on the receiving node
	 * side.
	 * <p>
	 * Client libraries using this protocol should try and strive to do something
	 * similar on the client side, and reduce buffering as much as possible.
	 * <p>
	 * There is no &quot;correct&quot; number of actions to perform in a single bulk
	 * request. Experiment with different settings to find the optimal size for your
	 * particular workload. Note that Elasticsearch limits the maximum size of a
	 * HTTP request to 100mb by default so clients must ensure that no request
	 * exceeds this size. It is not possible to index a single document that exceeds
	 * the size limit, so you must pre-process any such documents into smaller
	 * pieces before sending them to Elasticsearch. For instance, split documents
	 * into pages or chapters before indexing them, or store raw binary data in a
	 * system outside Elasticsearch and replace the raw data with a link to the
	 * external system in the documents that you send to Elasticsearch.
	 * <p>
	 * <strong>Client suppport for bulk requests</strong>
	 * <p>
	 * Some of the officially supported clients provide helpers to assist with bulk
	 * requests and reindexing:
	 * <ul>
	 * <li>Go: Check out <code>esutil.BulkIndexer</code></li>
	 * <li>Perl: Check out <code>Search::Elasticsearch::Client::5_0::Bulk</code> and
	 * <code>Search::Elasticsearch::Client::5_0::Scroll</code></li>
	 * <li>Python: Check out <code>elasticsearch.helpers.*</code></li>
	 * <li>JavaScript: Check out <code>client.helpers.*</code></li>
	 * <li>.NET: Check out <code>BulkAllObservable</code></li>
	 * <li>PHP: Check out bulk indexing.</li>
	 * </ul>
	 * <p>
	 * <strong>Submitting bulk requests with cURL</strong>
	 * <p>
	 * If you're providing text file input to <code>curl</code>, you must use the
	 * <code>--data-binary</code> flag instead of plain <code>-d</code>. The latter
	 * doesn't preserve newlines. For example:
	 * 
	 * <pre>
	 * <code>$ cat requests
	 * { &quot;index&quot; : { &quot;_index&quot; : &quot;test&quot;, &quot;_id&quot; : &quot;1&quot; } }
	 * { &quot;field1&quot; : &quot;value1&quot; }
	 * $ curl -s -H &quot;Content-Type: application/x-ndjson&quot; -XPOST localhost:9200/_bulk --data-binary &quot;@requests&quot;; echo
	 * {&quot;took&quot;:7, &quot;errors&quot;: false, &quot;items&quot;:[{&quot;index&quot;:{&quot;_index&quot;:&quot;test&quot;,&quot;_id&quot;:&quot;1&quot;,&quot;_version&quot;:1,&quot;result&quot;:&quot;created&quot;,&quot;forced_refresh&quot;:false}}]}
	 * </code>
	 * </pre>
	 * <p>
	 * <strong>Optimistic concurrency control</strong>
	 * <p>
	 * Each <code>index</code> and <code>delete</code> action within a bulk API call
	 * may include the <code>if_seq_no</code> and <code>if_primary_term</code>
	 * parameters in their respective action and meta data lines. The
	 * <code>if_seq_no</code> and <code>if_primary_term</code> parameters control
	 * how operations are run, based on the last modification to existing documents.
	 * See Optimistic concurrency control for more details.
	 * <p>
	 * <strong>Versioning</strong>
	 * <p>
	 * Each bulk item can include the version value using the <code>version</code>
	 * field. It automatically follows the behavior of the index or delete operation
	 * based on the <code>_version</code> mapping. It also support the
	 * <code>version_type</code>.
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * Each bulk item can include the routing value using the <code>routing</code>
	 * field. It automatically follows the behavior of the index or delete operation
	 * based on the <code>_routing</code> mapping.
	 * <p>
	 * NOTE: Data streams do not support custom routing unless they were created
	 * with the <code>allow_custom_routing</code> setting enabled in the template.
	 * <p>
	 * <strong>Wait for active shards</strong>
	 * <p>
	 * When making bulk calls, you can set the <code>wait_for_active_shards</code>
	 * parameter to require a minimum number of shard copies to be active before
	 * starting to process the bulk request.
	 * <p>
	 * <strong>Refresh</strong>
	 * <p>
	 * Control when the changes made by this request are visible to search.
	 * <p>
	 * NOTE: Only the shards that receive the bulk request will be affected by
	 * refresh. Imagine a <code>_bulk?refresh=wait_for</code> request with three
	 * documents in it that happen to be routed to different shards in an index with
	 * five shards. The request will only wait for those three shards to refresh.
	 * The other two shards that make up the index do not participate in the
	 * <code>_bulk</code> request at all.
	 * <p>
	 * You might want to disable the refresh interval temporarily to improve
	 * indexing throughput for large bulk requests. Refer to the linked
	 * documentation for step-by-step instructions using the index settings API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-bulk">Documentation
	 *      on elastic.co</a>
	 */

	public BulkResponse bulk(BulkRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<BulkRequest, BulkResponse, ErrorResponse> endpoint = (JsonEndpoint<BulkRequest, BulkResponse, ErrorResponse>) BulkRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Bulk index or delete documents. Perform multiple <code>index</code>,
	 * <code>create</code>, <code>delete</code>, and <code>update</code> actions in
	 * a single request. This reduces overhead and can greatly increase indexing
	 * speed.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or index alias:
	 * <ul>
	 * <li>To use the <code>create</code> action, you must have the
	 * <code>create_doc</code>, <code>create</code>, <code>index</code>, or
	 * <code>write</code> index privilege. Data streams support only the
	 * <code>create</code> action.</li>
	 * <li>To use the <code>index</code> action, you must have the
	 * <code>create</code>, <code>index</code>, or <code>write</code> index
	 * privilege.</li>
	 * <li>To use the <code>delete</code> action, you must have the
	 * <code>delete</code> or <code>write</code> index privilege.</li>
	 * <li>To use the <code>update</code> action, you must have the
	 * <code>index</code> or <code>write</code> index privilege.</li>
	 * <li>To automatically create a data stream or index with a bulk API request,
	 * you must have the <code>auto_configure</code>, <code>create_index</code>, or
	 * <code>manage</code> index privilege.</li>
	 * <li>To make the result of a bulk operation visible to search using the
	 * <code>refresh</code> parameter, you must have the <code>maintenance</code> or
	 * <code>manage</code> index privilege.</li>
	 * </ul>
	 * <p>
	 * Automatic data stream creation requires a matching index template with data
	 * stream enabled.
	 * <p>
	 * The actions are specified in the request body using a newline delimited JSON
	 * (NDJSON) structure:
	 * 
	 * <pre>
	 * <code>action_and_meta_data\n
	 * optional_source\n
	 * action_and_meta_data\n
	 * optional_source\n
	 * ....
	 * action_and_meta_data\n
	 * optional_source\n
	 * </code>
	 * </pre>
	 * <p>
	 * The <code>index</code> and <code>create</code> actions expect a source on the
	 * next line and have the same semantics as the <code>op_type</code> parameter
	 * in the standard index API. A <code>create</code> action fails if a document
	 * with the same ID already exists in the target An <code>index</code> action
	 * adds or replaces a document as necessary.
	 * <p>
	 * NOTE: Data streams support only the <code>create</code> action. To update or
	 * delete a document in a data stream, you must target the backing index
	 * containing the document.
	 * <p>
	 * An <code>update</code> action expects that the partial doc, upsert, and
	 * script and its options are specified on the next line.
	 * <p>
	 * A <code>delete</code> action does not expect a source on the next line and
	 * has the same semantics as the standard delete API.
	 * <p>
	 * NOTE: The final line of data must end with a newline character
	 * (<code>\n</code>). Each newline character may be preceded by a carriage
	 * return (<code>\r</code>). When sending NDJSON data to the <code>_bulk</code>
	 * endpoint, use a <code>Content-Type</code> header of
	 * <code>application/json</code> or <code>application/x-ndjson</code>. Because
	 * this format uses literal newline characters (<code>\n</code>) as delimiters,
	 * make sure that the JSON actions and sources are not pretty printed.
	 * <p>
	 * If you provide a target in the request path, it is used for any actions that
	 * don't explicitly specify an <code>_index</code> argument.
	 * <p>
	 * A note on the format: the idea here is to make processing as fast as
	 * possible. As some of the actions are redirected to other shards on other
	 * nodes, only <code>action_meta_data</code> is parsed on the receiving node
	 * side.
	 * <p>
	 * Client libraries using this protocol should try and strive to do something
	 * similar on the client side, and reduce buffering as much as possible.
	 * <p>
	 * There is no &quot;correct&quot; number of actions to perform in a single bulk
	 * request. Experiment with different settings to find the optimal size for your
	 * particular workload. Note that Elasticsearch limits the maximum size of a
	 * HTTP request to 100mb by default so clients must ensure that no request
	 * exceeds this size. It is not possible to index a single document that exceeds
	 * the size limit, so you must pre-process any such documents into smaller
	 * pieces before sending them to Elasticsearch. For instance, split documents
	 * into pages or chapters before indexing them, or store raw binary data in a
	 * system outside Elasticsearch and replace the raw data with a link to the
	 * external system in the documents that you send to Elasticsearch.
	 * <p>
	 * <strong>Client suppport for bulk requests</strong>
	 * <p>
	 * Some of the officially supported clients provide helpers to assist with bulk
	 * requests and reindexing:
	 * <ul>
	 * <li>Go: Check out <code>esutil.BulkIndexer</code></li>
	 * <li>Perl: Check out <code>Search::Elasticsearch::Client::5_0::Bulk</code> and
	 * <code>Search::Elasticsearch::Client::5_0::Scroll</code></li>
	 * <li>Python: Check out <code>elasticsearch.helpers.*</code></li>
	 * <li>JavaScript: Check out <code>client.helpers.*</code></li>
	 * <li>.NET: Check out <code>BulkAllObservable</code></li>
	 * <li>PHP: Check out bulk indexing.</li>
	 * </ul>
	 * <p>
	 * <strong>Submitting bulk requests with cURL</strong>
	 * <p>
	 * If you're providing text file input to <code>curl</code>, you must use the
	 * <code>--data-binary</code> flag instead of plain <code>-d</code>. The latter
	 * doesn't preserve newlines. For example:
	 * 
	 * <pre>
	 * <code>$ cat requests
	 * { &quot;index&quot; : { &quot;_index&quot; : &quot;test&quot;, &quot;_id&quot; : &quot;1&quot; } }
	 * { &quot;field1&quot; : &quot;value1&quot; }
	 * $ curl -s -H &quot;Content-Type: application/x-ndjson&quot; -XPOST localhost:9200/_bulk --data-binary &quot;@requests&quot;; echo
	 * {&quot;took&quot;:7, &quot;errors&quot;: false, &quot;items&quot;:[{&quot;index&quot;:{&quot;_index&quot;:&quot;test&quot;,&quot;_id&quot;:&quot;1&quot;,&quot;_version&quot;:1,&quot;result&quot;:&quot;created&quot;,&quot;forced_refresh&quot;:false}}]}
	 * </code>
	 * </pre>
	 * <p>
	 * <strong>Optimistic concurrency control</strong>
	 * <p>
	 * Each <code>index</code> and <code>delete</code> action within a bulk API call
	 * may include the <code>if_seq_no</code> and <code>if_primary_term</code>
	 * parameters in their respective action and meta data lines. The
	 * <code>if_seq_no</code> and <code>if_primary_term</code> parameters control
	 * how operations are run, based on the last modification to existing documents.
	 * See Optimistic concurrency control for more details.
	 * <p>
	 * <strong>Versioning</strong>
	 * <p>
	 * Each bulk item can include the version value using the <code>version</code>
	 * field. It automatically follows the behavior of the index or delete operation
	 * based on the <code>_version</code> mapping. It also support the
	 * <code>version_type</code>.
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * Each bulk item can include the routing value using the <code>routing</code>
	 * field. It automatically follows the behavior of the index or delete operation
	 * based on the <code>_routing</code> mapping.
	 * <p>
	 * NOTE: Data streams do not support custom routing unless they were created
	 * with the <code>allow_custom_routing</code> setting enabled in the template.
	 * <p>
	 * <strong>Wait for active shards</strong>
	 * <p>
	 * When making bulk calls, you can set the <code>wait_for_active_shards</code>
	 * parameter to require a minimum number of shard copies to be active before
	 * starting to process the bulk request.
	 * <p>
	 * <strong>Refresh</strong>
	 * <p>
	 * Control when the changes made by this request are visible to search.
	 * <p>
	 * NOTE: Only the shards that receive the bulk request will be affected by
	 * refresh. Imagine a <code>_bulk?refresh=wait_for</code> request with three
	 * documents in it that happen to be routed to different shards in an index with
	 * five shards. The request will only wait for those three shards to refresh.
	 * The other two shards that make up the index do not participate in the
	 * <code>_bulk</code> request at all.
	 * <p>
	 * You might want to disable the refresh interval temporarily to improve
	 * indexing throughput for large bulk requests. Refer to the linked
	 * documentation for step-by-step instructions using the index settings API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link BulkRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-bulk">Documentation
	 *      on elastic.co</a>
	 */

	public final BulkResponse bulk(Function<BulkRequest.Builder, ObjectBuilder<BulkRequest>> fn)
			throws IOException, ElasticsearchException {
		return bulk(fn.apply(new BulkRequest.Builder()).build());
	}

	/**
	 * Bulk index or delete documents. Perform multiple <code>index</code>,
	 * <code>create</code>, <code>delete</code>, and <code>update</code> actions in
	 * a single request. This reduces overhead and can greatly increase indexing
	 * speed.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or index alias:
	 * <ul>
	 * <li>To use the <code>create</code> action, you must have the
	 * <code>create_doc</code>, <code>create</code>, <code>index</code>, or
	 * <code>write</code> index privilege. Data streams support only the
	 * <code>create</code> action.</li>
	 * <li>To use the <code>index</code> action, you must have the
	 * <code>create</code>, <code>index</code>, or <code>write</code> index
	 * privilege.</li>
	 * <li>To use the <code>delete</code> action, you must have the
	 * <code>delete</code> or <code>write</code> index privilege.</li>
	 * <li>To use the <code>update</code> action, you must have the
	 * <code>index</code> or <code>write</code> index privilege.</li>
	 * <li>To automatically create a data stream or index with a bulk API request,
	 * you must have the <code>auto_configure</code>, <code>create_index</code>, or
	 * <code>manage</code> index privilege.</li>
	 * <li>To make the result of a bulk operation visible to search using the
	 * <code>refresh</code> parameter, you must have the <code>maintenance</code> or
	 * <code>manage</code> index privilege.</li>
	 * </ul>
	 * <p>
	 * Automatic data stream creation requires a matching index template with data
	 * stream enabled.
	 * <p>
	 * The actions are specified in the request body using a newline delimited JSON
	 * (NDJSON) structure:
	 * 
	 * <pre>
	 * <code>action_and_meta_data\n
	 * optional_source\n
	 * action_and_meta_data\n
	 * optional_source\n
	 * ....
	 * action_and_meta_data\n
	 * optional_source\n
	 * </code>
	 * </pre>
	 * <p>
	 * The <code>index</code> and <code>create</code> actions expect a source on the
	 * next line and have the same semantics as the <code>op_type</code> parameter
	 * in the standard index API. A <code>create</code> action fails if a document
	 * with the same ID already exists in the target An <code>index</code> action
	 * adds or replaces a document as necessary.
	 * <p>
	 * NOTE: Data streams support only the <code>create</code> action. To update or
	 * delete a document in a data stream, you must target the backing index
	 * containing the document.
	 * <p>
	 * An <code>update</code> action expects that the partial doc, upsert, and
	 * script and its options are specified on the next line.
	 * <p>
	 * A <code>delete</code> action does not expect a source on the next line and
	 * has the same semantics as the standard delete API.
	 * <p>
	 * NOTE: The final line of data must end with a newline character
	 * (<code>\n</code>). Each newline character may be preceded by a carriage
	 * return (<code>\r</code>). When sending NDJSON data to the <code>_bulk</code>
	 * endpoint, use a <code>Content-Type</code> header of
	 * <code>application/json</code> or <code>application/x-ndjson</code>. Because
	 * this format uses literal newline characters (<code>\n</code>) as delimiters,
	 * make sure that the JSON actions and sources are not pretty printed.
	 * <p>
	 * If you provide a target in the request path, it is used for any actions that
	 * don't explicitly specify an <code>_index</code> argument.
	 * <p>
	 * A note on the format: the idea here is to make processing as fast as
	 * possible. As some of the actions are redirected to other shards on other
	 * nodes, only <code>action_meta_data</code> is parsed on the receiving node
	 * side.
	 * <p>
	 * Client libraries using this protocol should try and strive to do something
	 * similar on the client side, and reduce buffering as much as possible.
	 * <p>
	 * There is no &quot;correct&quot; number of actions to perform in a single bulk
	 * request. Experiment with different settings to find the optimal size for your
	 * particular workload. Note that Elasticsearch limits the maximum size of a
	 * HTTP request to 100mb by default so clients must ensure that no request
	 * exceeds this size. It is not possible to index a single document that exceeds
	 * the size limit, so you must pre-process any such documents into smaller
	 * pieces before sending them to Elasticsearch. For instance, split documents
	 * into pages or chapters before indexing them, or store raw binary data in a
	 * system outside Elasticsearch and replace the raw data with a link to the
	 * external system in the documents that you send to Elasticsearch.
	 * <p>
	 * <strong>Client suppport for bulk requests</strong>
	 * <p>
	 * Some of the officially supported clients provide helpers to assist with bulk
	 * requests and reindexing:
	 * <ul>
	 * <li>Go: Check out <code>esutil.BulkIndexer</code></li>
	 * <li>Perl: Check out <code>Search::Elasticsearch::Client::5_0::Bulk</code> and
	 * <code>Search::Elasticsearch::Client::5_0::Scroll</code></li>
	 * <li>Python: Check out <code>elasticsearch.helpers.*</code></li>
	 * <li>JavaScript: Check out <code>client.helpers.*</code></li>
	 * <li>.NET: Check out <code>BulkAllObservable</code></li>
	 * <li>PHP: Check out bulk indexing.</li>
	 * </ul>
	 * <p>
	 * <strong>Submitting bulk requests with cURL</strong>
	 * <p>
	 * If you're providing text file input to <code>curl</code>, you must use the
	 * <code>--data-binary</code> flag instead of plain <code>-d</code>. The latter
	 * doesn't preserve newlines. For example:
	 * 
	 * <pre>
	 * <code>$ cat requests
	 * { &quot;index&quot; : { &quot;_index&quot; : &quot;test&quot;, &quot;_id&quot; : &quot;1&quot; } }
	 * { &quot;field1&quot; : &quot;value1&quot; }
	 * $ curl -s -H &quot;Content-Type: application/x-ndjson&quot; -XPOST localhost:9200/_bulk --data-binary &quot;@requests&quot;; echo
	 * {&quot;took&quot;:7, &quot;errors&quot;: false, &quot;items&quot;:[{&quot;index&quot;:{&quot;_index&quot;:&quot;test&quot;,&quot;_id&quot;:&quot;1&quot;,&quot;_version&quot;:1,&quot;result&quot;:&quot;created&quot;,&quot;forced_refresh&quot;:false}}]}
	 * </code>
	 * </pre>
	 * <p>
	 * <strong>Optimistic concurrency control</strong>
	 * <p>
	 * Each <code>index</code> and <code>delete</code> action within a bulk API call
	 * may include the <code>if_seq_no</code> and <code>if_primary_term</code>
	 * parameters in their respective action and meta data lines. The
	 * <code>if_seq_no</code> and <code>if_primary_term</code> parameters control
	 * how operations are run, based on the last modification to existing documents.
	 * See Optimistic concurrency control for more details.
	 * <p>
	 * <strong>Versioning</strong>
	 * <p>
	 * Each bulk item can include the version value using the <code>version</code>
	 * field. It automatically follows the behavior of the index or delete operation
	 * based on the <code>_version</code> mapping. It also support the
	 * <code>version_type</code>.
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * Each bulk item can include the routing value using the <code>routing</code>
	 * field. It automatically follows the behavior of the index or delete operation
	 * based on the <code>_routing</code> mapping.
	 * <p>
	 * NOTE: Data streams do not support custom routing unless they were created
	 * with the <code>allow_custom_routing</code> setting enabled in the template.
	 * <p>
	 * <strong>Wait for active shards</strong>
	 * <p>
	 * When making bulk calls, you can set the <code>wait_for_active_shards</code>
	 * parameter to require a minimum number of shard copies to be active before
	 * starting to process the bulk request.
	 * <p>
	 * <strong>Refresh</strong>
	 * <p>
	 * Control when the changes made by this request are visible to search.
	 * <p>
	 * NOTE: Only the shards that receive the bulk request will be affected by
	 * refresh. Imagine a <code>_bulk?refresh=wait_for</code> request with three
	 * documents in it that happen to be routed to different shards in an index with
	 * five shards. The request will only wait for those three shards to refresh.
	 * The other two shards that make up the index do not participate in the
	 * <code>_bulk</code> request at all.
	 * <p>
	 * You might want to disable the refresh interval temporarily to improve
	 * indexing throughput for large bulk requests. Refer to the linked
	 * documentation for step-by-step instructions using the index settings API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-bulk">Documentation
	 *      on elastic.co</a>
	 */

	public BulkResponse bulk() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new BulkRequest.Builder().build(), BulkRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: clear_scroll

	/**
	 * Clear a scrolling search. Clear the search context and results for a
	 * scrolling search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-clear-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public ClearScrollResponse clearScroll(ClearScrollRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearScrollRequest, ClearScrollResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearScrollRequest, ClearScrollResponse, ErrorResponse>) ClearScrollRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear a scrolling search. Clear the search context and results for a
	 * scrolling search.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearScrollRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-clear-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearScrollResponse clearScroll(
			Function<ClearScrollRequest.Builder, ObjectBuilder<ClearScrollRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearScroll(fn.apply(new ClearScrollRequest.Builder()).build());
	}

	/**
	 * Clear a scrolling search. Clear the search context and results for a
	 * scrolling search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-clear-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public ClearScrollResponse clearScroll() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ClearScrollRequest.Builder().build(), ClearScrollRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: close_point_in_time

	/**
	 * Close a point in time. A point in time must be opened explicitly before being
	 * used in search requests. The <code>keep_alive</code> parameter tells
	 * Elasticsearch how long it should persist. A point in time is automatically
	 * closed when the <code>keep_alive</code> period has elapsed. However, keeping
	 * points in time has a cost; close them as soon as they are no longer required
	 * for search requests.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-open-point-in-time">Documentation
	 *      on elastic.co</a>
	 */

	public ClosePointInTimeResponse closePointInTime(ClosePointInTimeRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClosePointInTimeRequest, ClosePointInTimeResponse, ErrorResponse> endpoint = (JsonEndpoint<ClosePointInTimeRequest, ClosePointInTimeResponse, ErrorResponse>) ClosePointInTimeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Close a point in time. A point in time must be opened explicitly before being
	 * used in search requests. The <code>keep_alive</code> parameter tells
	 * Elasticsearch how long it should persist. A point in time is automatically
	 * closed when the <code>keep_alive</code> period has elapsed. However, keeping
	 * points in time has a cost; close them as soon as they are no longer required
	 * for search requests.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClosePointInTimeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-open-point-in-time">Documentation
	 *      on elastic.co</a>
	 */

	public final ClosePointInTimeResponse closePointInTime(
			Function<ClosePointInTimeRequest.Builder, ObjectBuilder<ClosePointInTimeRequest>> fn)
			throws IOException, ElasticsearchException {
		return closePointInTime(fn.apply(new ClosePointInTimeRequest.Builder()).build());
	}

	// ----- Endpoint: count

	/**
	 * Count search results. Get the number of documents matching a query.
	 * <p>
	 * The query can be provided either by using a simple query string as a
	 * parameter, or by defining Query DSL within the request body. The query is
	 * optional. When no query is provided, the API uses <code>match_all</code> to
	 * count all the documents.
	 * <p>
	 * The count API supports multi-target syntax. You can run a single count API
	 * search across multiple data streams and indices.
	 * <p>
	 * The operation is broadcast across all shards. For each shard ID group, a
	 * replica is chosen and the search is run against it. This means that replicas
	 * increase the scalability of the count.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-count">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count(CountRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CountRequest, CountResponse, ErrorResponse> endpoint = (JsonEndpoint<CountRequest, CountResponse, ErrorResponse>) CountRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Count search results. Get the number of documents matching a query.
	 * <p>
	 * The query can be provided either by using a simple query string as a
	 * parameter, or by defining Query DSL within the request body. The query is
	 * optional. When no query is provided, the API uses <code>match_all</code> to
	 * count all the documents.
	 * <p>
	 * The count API supports multi-target syntax. You can run a single count API
	 * search across multiple data streams and indices.
	 * <p>
	 * The operation is broadcast across all shards. For each shard ID group, a
	 * replica is chosen and the search is run against it. This means that replicas
	 * increase the scalability of the count.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CountRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-count">Documentation
	 *      on elastic.co</a>
	 */

	public final CountResponse count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
			throws IOException, ElasticsearchException {
		return count(fn.apply(new CountRequest.Builder()).build());
	}

	/**
	 * Count search results. Get the number of documents matching a query.
	 * <p>
	 * The query can be provided either by using a simple query string as a
	 * parameter, or by defining Query DSL within the request body. The query is
	 * optional. When no query is provided, the API uses <code>match_all</code> to
	 * count all the documents.
	 * <p>
	 * The count API supports multi-target syntax. You can run a single count API
	 * search across multiple data streams and indices.
	 * <p>
	 * The operation is broadcast across all shards. For each shard ID group, a
	 * replica is chosen and the search is run against it. This means that replicas
	 * increase the scalability of the count.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-count">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new CountRequest.Builder().build(), CountRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: create

	/**
	 * Create a new document in the index.
	 * <p>
	 * You can index a new JSON document with the <code>/&lt;target&gt;/_doc/</code>
	 * or <code>/&lt;target&gt;/_create/&lt;_id&gt;</code> APIs Using
	 * <code>_create</code> guarantees that the document is indexed only if it does
	 * not already exist. It returns a 409 response when a document with a same ID
	 * already exists in the index. To update an existing document, you must use the
	 * <code>/&lt;target&gt;/_doc/</code> API.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or index alias:
	 * <ul>
	 * <li>To add a document using the
	 * <code>PUT /&lt;target&gt;/_create/&lt;_id&gt;</code> or
	 * <code>POST /&lt;target&gt;/_create/&lt;_id&gt;</code> request formats, you
	 * must have the <code>create_doc</code>, <code>create</code>,
	 * <code>index</code>, or <code>write</code> index privilege.</li>
	 * <li>To automatically create a data stream or index with this API request, you
	 * must have the <code>auto_configure</code>, <code>create_index</code>, or
	 * <code>manage</code> index privilege.</li>
	 * </ul>
	 * <p>
	 * Automatic data stream creation requires a matching index template with data
	 * stream enabled.
	 * <p>
	 * <strong>Automatically create data streams and indices</strong>
	 * <p>
	 * If the request's target doesn't exist and matches an index template with a
	 * <code>data_stream</code> definition, the index operation automatically
	 * creates the data stream.
	 * <p>
	 * If the target doesn't exist and doesn't match a data stream template, the
	 * operation automatically creates the index and applies any matching index
	 * templates.
	 * <p>
	 * NOTE: Elasticsearch includes several built-in index templates. To avoid
	 * naming collisions with these templates, refer to index pattern documentation.
	 * <p>
	 * If no mapping exists, the index operation creates a dynamic mapping. By
	 * default, new fields and objects are automatically added to the mapping if
	 * needed.
	 * <p>
	 * Automatic index creation is controlled by the
	 * <code>action.auto_create_index</code> setting. If it is <code>true</code>,
	 * any index can be created automatically. You can modify this setting to
	 * explicitly allow or block automatic creation of indices that match specified
	 * patterns or set it to <code>false</code> to turn off automatic index creation
	 * entirely. Specify a comma-separated list of patterns you want to allow or
	 * prefix each pattern with <code>+</code> or <code>-</code> to indicate whether
	 * it should be allowed or blocked. When a list is specified, the default
	 * behaviour is to disallow.
	 * <p>
	 * NOTE: The <code>action.auto_create_index</code> setting affects the automatic
	 * creation of indices only. It does not affect the creation of data streams.
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * By default, shard placement — or routing — is controlled by using a hash of
	 * the document's ID value. For more explicit control, the value fed into the
	 * hash function used by the router can be directly specified on a per-operation
	 * basis using the <code>routing</code> parameter.
	 * <p>
	 * When setting up explicit mapping, you can also use the <code>_routing</code>
	 * field to direct the index operation to extract the routing value from the
	 * document itself. This does come at the (very minimal) cost of an additional
	 * document parsing pass. If the <code>_routing</code> mapping is defined and
	 * set to be required, the index operation will fail if no routing value is
	 * provided or extracted.
	 * <p>
	 * NOTE: Data streams do not support custom routing unless they were created
	 * with the <code>allow_custom_routing</code> setting enabled in the template.
	 * <p>
	 * <strong>Distributed</strong>
	 * <p>
	 * The index operation is directed to the primary shard based on its route and
	 * performed on the actual node containing this shard. After the primary shard
	 * completes the operation, if needed, the update is distributed to applicable
	 * replicas.
	 * <p>
	 * <strong>Active shards</strong>
	 * <p>
	 * To improve the resiliency of writes to the system, indexing operations can be
	 * configured to wait for a certain number of active shard copies before
	 * proceeding with the operation. If the requisite number of active shard copies
	 * are not available, then the write operation must wait and retry, until either
	 * the requisite shard copies have started or a timeout occurs. By default,
	 * write operations only wait for the primary shards to be active before
	 * proceeding (that is to say <code>wait_for_active_shards</code> is
	 * <code>1</code>). This default can be overridden in the index settings
	 * dynamically by setting <code>index.write.wait_for_active_shards</code>. To
	 * alter this behavior per operation, use the
	 * <code>wait_for_active_shards request</code> parameter.
	 * <p>
	 * Valid values are all or any positive integer up to the total number of
	 * configured copies per shard in the index (which is
	 * <code>number_of_replicas</code>+1). Specifying a negative value or a number
	 * greater than the number of shard copies will throw an error.
	 * <p>
	 * For example, suppose you have a cluster of three nodes, A, B, and C and you
	 * create an index index with the number of replicas set to 3 (resulting in 4
	 * shard copies, one more copy than there are nodes). If you attempt an indexing
	 * operation, by default the operation will only ensure the primary copy of each
	 * shard is available before proceeding. This means that even if B and C went
	 * down and A hosted the primary shard copies, the indexing operation would
	 * still proceed with only one copy of the data. If
	 * <code>wait_for_active_shards</code> is set on the request to <code>3</code>
	 * (and all three nodes are up), the indexing operation will require 3 active
	 * shard copies before proceeding. This requirement should be met because there
	 * are 3 active nodes in the cluster, each one holding a copy of the shard.
	 * However, if you set <code>wait_for_active_shards</code> to <code>all</code>
	 * (or to <code>4</code>, which is the same in this situation), the indexing
	 * operation will not proceed as you do not have all 4 copies of each shard
	 * active in the index. The operation will timeout unless a new node is brought
	 * up in the cluster to host the fourth copy of the shard.
	 * <p>
	 * It is important to note that this setting greatly reduces the chances of the
	 * write operation not writing to the requisite number of shard copies, but it
	 * does not completely eliminate the possibility, because this check occurs
	 * before the write operation starts. After the write operation is underway, it
	 * is still possible for replication to fail on any number of shard copies but
	 * still succeed on the primary. The <code>_shards</code> section of the API
	 * response reveals the number of shard copies on which replication succeeded
	 * and failed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-create">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CreateResponse create(CreateRequest<TDocument> request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateRequest<?>, CreateResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateRequest<?>, CreateResponse, ErrorResponse>) CreateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a new document in the index.
	 * <p>
	 * You can index a new JSON document with the <code>/&lt;target&gt;/_doc/</code>
	 * or <code>/&lt;target&gt;/_create/&lt;_id&gt;</code> APIs Using
	 * <code>_create</code> guarantees that the document is indexed only if it does
	 * not already exist. It returns a 409 response when a document with a same ID
	 * already exists in the index. To update an existing document, you must use the
	 * <code>/&lt;target&gt;/_doc/</code> API.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or index alias:
	 * <ul>
	 * <li>To add a document using the
	 * <code>PUT /&lt;target&gt;/_create/&lt;_id&gt;</code> or
	 * <code>POST /&lt;target&gt;/_create/&lt;_id&gt;</code> request formats, you
	 * must have the <code>create_doc</code>, <code>create</code>,
	 * <code>index</code>, or <code>write</code> index privilege.</li>
	 * <li>To automatically create a data stream or index with this API request, you
	 * must have the <code>auto_configure</code>, <code>create_index</code>, or
	 * <code>manage</code> index privilege.</li>
	 * </ul>
	 * <p>
	 * Automatic data stream creation requires a matching index template with data
	 * stream enabled.
	 * <p>
	 * <strong>Automatically create data streams and indices</strong>
	 * <p>
	 * If the request's target doesn't exist and matches an index template with a
	 * <code>data_stream</code> definition, the index operation automatically
	 * creates the data stream.
	 * <p>
	 * If the target doesn't exist and doesn't match a data stream template, the
	 * operation automatically creates the index and applies any matching index
	 * templates.
	 * <p>
	 * NOTE: Elasticsearch includes several built-in index templates. To avoid
	 * naming collisions with these templates, refer to index pattern documentation.
	 * <p>
	 * If no mapping exists, the index operation creates a dynamic mapping. By
	 * default, new fields and objects are automatically added to the mapping if
	 * needed.
	 * <p>
	 * Automatic index creation is controlled by the
	 * <code>action.auto_create_index</code> setting. If it is <code>true</code>,
	 * any index can be created automatically. You can modify this setting to
	 * explicitly allow or block automatic creation of indices that match specified
	 * patterns or set it to <code>false</code> to turn off automatic index creation
	 * entirely. Specify a comma-separated list of patterns you want to allow or
	 * prefix each pattern with <code>+</code> or <code>-</code> to indicate whether
	 * it should be allowed or blocked. When a list is specified, the default
	 * behaviour is to disallow.
	 * <p>
	 * NOTE: The <code>action.auto_create_index</code> setting affects the automatic
	 * creation of indices only. It does not affect the creation of data streams.
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * By default, shard placement — or routing — is controlled by using a hash of
	 * the document's ID value. For more explicit control, the value fed into the
	 * hash function used by the router can be directly specified on a per-operation
	 * basis using the <code>routing</code> parameter.
	 * <p>
	 * When setting up explicit mapping, you can also use the <code>_routing</code>
	 * field to direct the index operation to extract the routing value from the
	 * document itself. This does come at the (very minimal) cost of an additional
	 * document parsing pass. If the <code>_routing</code> mapping is defined and
	 * set to be required, the index operation will fail if no routing value is
	 * provided or extracted.
	 * <p>
	 * NOTE: Data streams do not support custom routing unless they were created
	 * with the <code>allow_custom_routing</code> setting enabled in the template.
	 * <p>
	 * <strong>Distributed</strong>
	 * <p>
	 * The index operation is directed to the primary shard based on its route and
	 * performed on the actual node containing this shard. After the primary shard
	 * completes the operation, if needed, the update is distributed to applicable
	 * replicas.
	 * <p>
	 * <strong>Active shards</strong>
	 * <p>
	 * To improve the resiliency of writes to the system, indexing operations can be
	 * configured to wait for a certain number of active shard copies before
	 * proceeding with the operation. If the requisite number of active shard copies
	 * are not available, then the write operation must wait and retry, until either
	 * the requisite shard copies have started or a timeout occurs. By default,
	 * write operations only wait for the primary shards to be active before
	 * proceeding (that is to say <code>wait_for_active_shards</code> is
	 * <code>1</code>). This default can be overridden in the index settings
	 * dynamically by setting <code>index.write.wait_for_active_shards</code>. To
	 * alter this behavior per operation, use the
	 * <code>wait_for_active_shards request</code> parameter.
	 * <p>
	 * Valid values are all or any positive integer up to the total number of
	 * configured copies per shard in the index (which is
	 * <code>number_of_replicas</code>+1). Specifying a negative value or a number
	 * greater than the number of shard copies will throw an error.
	 * <p>
	 * For example, suppose you have a cluster of three nodes, A, B, and C and you
	 * create an index index with the number of replicas set to 3 (resulting in 4
	 * shard copies, one more copy than there are nodes). If you attempt an indexing
	 * operation, by default the operation will only ensure the primary copy of each
	 * shard is available before proceeding. This means that even if B and C went
	 * down and A hosted the primary shard copies, the indexing operation would
	 * still proceed with only one copy of the data. If
	 * <code>wait_for_active_shards</code> is set on the request to <code>3</code>
	 * (and all three nodes are up), the indexing operation will require 3 active
	 * shard copies before proceeding. This requirement should be met because there
	 * are 3 active nodes in the cluster, each one holding a copy of the shard.
	 * However, if you set <code>wait_for_active_shards</code> to <code>all</code>
	 * (or to <code>4</code>, which is the same in this situation), the indexing
	 * operation will not proceed as you do not have all 4 copies of each shard
	 * active in the index. The operation will timeout unless a new node is brought
	 * up in the cluster to host the fourth copy of the shard.
	 * <p>
	 * It is important to note that this setting greatly reduces the chances of the
	 * write operation not writing to the requisite number of shard copies, but it
	 * does not completely eliminate the possibility, because this check occurs
	 * before the write operation starts. After the write operation is underway, it
	 * is still possible for replication to fail on any number of shard copies but
	 * still succeed on the primary. The <code>_shards</code> section of the API
	 * response reveals the number of shard copies on which replication succeeded
	 * and failed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-create">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CreateResponse create(
			Function<CreateRequest.Builder<TDocument>, ObjectBuilder<CreateRequest<TDocument>>> fn)
			throws IOException, ElasticsearchException {
		return create(fn.apply(new CreateRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: delete

	/**
	 * Delete a document.
	 * <p>
	 * Remove a JSON document from the specified index.
	 * <p>
	 * NOTE: You cannot send deletion requests directly to a data stream. To delete
	 * a document in a data stream, you must target the backing index containing the
	 * document.
	 * <p>
	 * <strong>Optimistic concurrency control</strong>
	 * <p>
	 * Delete operations can be made conditional and only be performed if the last
	 * modification to the document was assigned the sequence number and primary
	 * term specified by the <code>if_seq_no</code> and <code>if_primary_term</code>
	 * parameters. If a mismatch is detected, the operation will result in a
	 * <code>VersionConflictException</code> and a status code of <code>409</code>.
	 * <p>
	 * <strong>Versioning</strong>
	 * <p>
	 * Each document indexed is versioned. When deleting a document, the version can
	 * be specified to make sure the relevant document you are trying to delete is
	 * actually being deleted and it has not changed in the meantime. Every write
	 * operation run on a document, deletes included, causes its version to be
	 * incremented. The version number of a deleted document remains available for a
	 * short time after deletion to allow for control of concurrent operations. The
	 * length of time for which a deleted document's version remains available is
	 * determined by the <code>index.gc_deletes</code> index setting.
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * If routing is used during indexing, the routing value also needs to be
	 * specified to delete a document.
	 * <p>
	 * If the <code>_routing</code> mapping is set to <code>required</code> and no
	 * routing value is specified, the delete API throws a
	 * <code>RoutingMissingException</code> and rejects the request.
	 * <p>
	 * For example:
	 * 
	 * <pre>
	 * <code>DELETE /my-index-000001/_doc/1?routing=shard-1
	 * </code>
	 * </pre>
	 * <p>
	 * This request deletes the document with ID 1, but it is routed based on the
	 * user. The document is not deleted if the correct routing is not specified.
	 * <p>
	 * <strong>Distributed</strong>
	 * <p>
	 * The delete operation gets hashed into a specific shard ID. It then gets
	 * redirected into the primary shard within that ID group and replicated (if
	 * needed) to shard replicas within that ID group.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-delete">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteResponse delete(DeleteRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRequest, DeleteResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRequest, DeleteResponse, ErrorResponse>) DeleteRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a document.
	 * <p>
	 * Remove a JSON document from the specified index.
	 * <p>
	 * NOTE: You cannot send deletion requests directly to a data stream. To delete
	 * a document in a data stream, you must target the backing index containing the
	 * document.
	 * <p>
	 * <strong>Optimistic concurrency control</strong>
	 * <p>
	 * Delete operations can be made conditional and only be performed if the last
	 * modification to the document was assigned the sequence number and primary
	 * term specified by the <code>if_seq_no</code> and <code>if_primary_term</code>
	 * parameters. If a mismatch is detected, the operation will result in a
	 * <code>VersionConflictException</code> and a status code of <code>409</code>.
	 * <p>
	 * <strong>Versioning</strong>
	 * <p>
	 * Each document indexed is versioned. When deleting a document, the version can
	 * be specified to make sure the relevant document you are trying to delete is
	 * actually being deleted and it has not changed in the meantime. Every write
	 * operation run on a document, deletes included, causes its version to be
	 * incremented. The version number of a deleted document remains available for a
	 * short time after deletion to allow for control of concurrent operations. The
	 * length of time for which a deleted document's version remains available is
	 * determined by the <code>index.gc_deletes</code> index setting.
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * If routing is used during indexing, the routing value also needs to be
	 * specified to delete a document.
	 * <p>
	 * If the <code>_routing</code> mapping is set to <code>required</code> and no
	 * routing value is specified, the delete API throws a
	 * <code>RoutingMissingException</code> and rejects the request.
	 * <p>
	 * For example:
	 * 
	 * <pre>
	 * <code>DELETE /my-index-000001/_doc/1?routing=shard-1
	 * </code>
	 * </pre>
	 * <p>
	 * This request deletes the document with ID 1, but it is routed based on the
	 * user. The document is not deleted if the correct routing is not specified.
	 * <p>
	 * <strong>Distributed</strong>
	 * <p>
	 * The delete operation gets hashed into a specific shard ID. It then gets
	 * redirected into the primary shard within that ID group and replicated (if
	 * needed) to shard replicas within that ID group.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-delete">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteResponse delete(Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteRequest.Builder()).build());
	}

	// ----- Endpoint: delete_by_query

	/**
	 * Delete documents.
	 * <p>
	 * Deletes documents that match the specified query.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or alias:
	 * <ul>
	 * <li><code>read</code></li>
	 * <li><code>delete</code> or <code>write</code></li>
	 * </ul>
	 * <p>
	 * You can specify the query criteria in the request URI or the request body
	 * using the same syntax as the search API. When you submit a delete by query
	 * request, Elasticsearch gets a snapshot of the data stream or index when it
	 * begins processing the request and deletes matching documents using internal
	 * versioning. If a document changes between the time that the snapshot is taken
	 * and the delete operation is processed, it results in a version conflict and
	 * the delete operation fails.
	 * <p>
	 * NOTE: Documents with a version equal to 0 cannot be deleted using delete by
	 * query because internal versioning does not support 0 as a valid version
	 * number.
	 * <p>
	 * While processing a delete by query request, Elasticsearch performs multiple
	 * search requests sequentially to find all of the matching documents to delete.
	 * A bulk delete request is performed for each batch of matching documents. If a
	 * search or bulk request is rejected, the requests are retried up to 10 times,
	 * with exponential back off. If the maximum retry limit is reached, processing
	 * halts and all failed requests are returned in the response. Any delete
	 * requests that completed successfully still stick, they are not rolled back.
	 * <p>
	 * You can opt to count version conflicts instead of halting and returning by
	 * setting <code>conflicts</code> to <code>proceed</code>. Note that if you opt
	 * to count version conflicts the operation could attempt to delete more
	 * documents from the source than <code>max_docs</code> until it has
	 * successfully deleted <code>max_docs documents</code>, or it has gone through
	 * every document in the source query.
	 * <p>
	 * <strong>Throttling delete requests</strong>
	 * <p>
	 * To control the rate at which delete by query issues batches of delete
	 * operations, you can set <code>requests_per_second</code> to any positive
	 * decimal number. This pads each batch with a wait time to throttle the rate.
	 * Set <code>requests_per_second</code> to <code>-1</code> to disable
	 * throttling.
	 * <p>
	 * Throttling uses a wait time between batches so that the internal scroll
	 * requests can be given a timeout that takes the request padding into account.
	 * The padding time is the difference between the batch size divided by the
	 * <code>requests_per_second</code> and the time spent writing. By default the
	 * batch size is <code>1000</code>, so if <code>requests_per_second</code> is
	 * set to <code>500</code>:
	 * 
	 * <pre>
	 * <code>target_time = 1000 / 500 per second = 2 seconds
	 * wait_time = target_time - write_time = 2 seconds - .5 seconds = 1.5 seconds
	 * </code>
	 * </pre>
	 * <p>
	 * Since the batch is issued as a single <code>_bulk</code> request, large batch
	 * sizes cause Elasticsearch to create many requests and wait before starting
	 * the next set. This is &quot;bursty&quot; instead of &quot;smooth&quot;.
	 * <p>
	 * <strong>Slicing</strong>
	 * <p>
	 * Delete by query supports sliced scroll to parallelize the delete process.
	 * This can improve efficiency and provide a convenient way to break the request
	 * down into smaller parts.
	 * <p>
	 * Setting <code>slices</code> to <code>auto</code> lets Elasticsearch choose
	 * the number of slices to use. This setting will use one slice per shard, up to
	 * a certain limit. If there are multiple source data streams or indices, it
	 * will choose the number of slices based on the index or backing index with the
	 * smallest number of shards. Adding slices to the delete by query operation
	 * creates sub-requests which means it has some quirks:
	 * <ul>
	 * <li>You can see these requests in the tasks APIs. These sub-requests are
	 * &quot;child&quot; tasks of the task for the request with slices.</li>
	 * <li>Fetching the status of the task for the request with slices only contains
	 * the status of completed slices.</li>
	 * <li>These sub-requests are individually addressable for things like
	 * cancellation and rethrottling.</li>
	 * <li>Rethrottling the request with <code>slices</code> will rethrottle the
	 * unfinished sub-request proportionally.</li>
	 * <li>Canceling the request with <code>slices</code> will cancel each
	 * sub-request.</li>
	 * <li>Due to the nature of <code>slices</code> each sub-request won't get a
	 * perfectly even portion of the documents. All documents will be addressed, but
	 * some slices may be larger than others. Expect larger slices to have a more
	 * even distribution.</li>
	 * <li>Parameters like <code>requests_per_second</code> and
	 * <code>max_docs</code> on a request with <code>slices</code> are distributed
	 * proportionally to each sub-request. Combine that with the earlier point about
	 * distribution being uneven and you should conclude that using
	 * <code>max_docs</code> with <code>slices</code> might not result in exactly
	 * <code>max_docs</code> documents being deleted.</li>
	 * <li>Each sub-request gets a slightly different snapshot of the source data
	 * stream or index though these are all taken at approximately the same
	 * time.</li>
	 * </ul>
	 * <p>
	 * If you're slicing manually or otherwise tuning automatic slicing, keep in
	 * mind that:
	 * <ul>
	 * <li>Query performance is most efficient when the number of slices is equal to
	 * the number of shards in the index or backing index. If that number is large
	 * (for example, 500), choose a lower number as too many <code>slices</code>
	 * hurts performance. Setting <code>slices</code> higher than the number of
	 * shards generally does not improve efficiency and adds overhead.</li>
	 * <li>Delete performance scales linearly across available resources with the
	 * number of slices.</li>
	 * </ul>
	 * <p>
	 * Whether query or delete performance dominates the runtime depends on the
	 * documents being reindexed and cluster resources.
	 * <p>
	 * <strong>Cancel a delete by query operation</strong>
	 * <p>
	 * Any delete by query can be canceled using the task cancel API. For example:
	 * 
	 * <pre>
	 * <code>POST _tasks/r1A2WoRbTwKZ516z6NEs5A:36619/_cancel
	 * </code>
	 * </pre>
	 * <p>
	 * The task ID can be found by using the get tasks API.
	 * <p>
	 * Cancellation should happen quickly but might take a few seconds. The get task
	 * status API will continue to list the delete by query task until this task
	 * checks that it has been cancelled and terminates itself.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-delete-by-query">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteByQueryResponse deleteByQuery(DeleteByQueryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteByQueryRequest, DeleteByQueryResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteByQueryRequest, DeleteByQueryResponse, ErrorResponse>) DeleteByQueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete documents.
	 * <p>
	 * Deletes documents that match the specified query.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or alias:
	 * <ul>
	 * <li><code>read</code></li>
	 * <li><code>delete</code> or <code>write</code></li>
	 * </ul>
	 * <p>
	 * You can specify the query criteria in the request URI or the request body
	 * using the same syntax as the search API. When you submit a delete by query
	 * request, Elasticsearch gets a snapshot of the data stream or index when it
	 * begins processing the request and deletes matching documents using internal
	 * versioning. If a document changes between the time that the snapshot is taken
	 * and the delete operation is processed, it results in a version conflict and
	 * the delete operation fails.
	 * <p>
	 * NOTE: Documents with a version equal to 0 cannot be deleted using delete by
	 * query because internal versioning does not support 0 as a valid version
	 * number.
	 * <p>
	 * While processing a delete by query request, Elasticsearch performs multiple
	 * search requests sequentially to find all of the matching documents to delete.
	 * A bulk delete request is performed for each batch of matching documents. If a
	 * search or bulk request is rejected, the requests are retried up to 10 times,
	 * with exponential back off. If the maximum retry limit is reached, processing
	 * halts and all failed requests are returned in the response. Any delete
	 * requests that completed successfully still stick, they are not rolled back.
	 * <p>
	 * You can opt to count version conflicts instead of halting and returning by
	 * setting <code>conflicts</code> to <code>proceed</code>. Note that if you opt
	 * to count version conflicts the operation could attempt to delete more
	 * documents from the source than <code>max_docs</code> until it has
	 * successfully deleted <code>max_docs documents</code>, or it has gone through
	 * every document in the source query.
	 * <p>
	 * <strong>Throttling delete requests</strong>
	 * <p>
	 * To control the rate at which delete by query issues batches of delete
	 * operations, you can set <code>requests_per_second</code> to any positive
	 * decimal number. This pads each batch with a wait time to throttle the rate.
	 * Set <code>requests_per_second</code> to <code>-1</code> to disable
	 * throttling.
	 * <p>
	 * Throttling uses a wait time between batches so that the internal scroll
	 * requests can be given a timeout that takes the request padding into account.
	 * The padding time is the difference between the batch size divided by the
	 * <code>requests_per_second</code> and the time spent writing. By default the
	 * batch size is <code>1000</code>, so if <code>requests_per_second</code> is
	 * set to <code>500</code>:
	 * 
	 * <pre>
	 * <code>target_time = 1000 / 500 per second = 2 seconds
	 * wait_time = target_time - write_time = 2 seconds - .5 seconds = 1.5 seconds
	 * </code>
	 * </pre>
	 * <p>
	 * Since the batch is issued as a single <code>_bulk</code> request, large batch
	 * sizes cause Elasticsearch to create many requests and wait before starting
	 * the next set. This is &quot;bursty&quot; instead of &quot;smooth&quot;.
	 * <p>
	 * <strong>Slicing</strong>
	 * <p>
	 * Delete by query supports sliced scroll to parallelize the delete process.
	 * This can improve efficiency and provide a convenient way to break the request
	 * down into smaller parts.
	 * <p>
	 * Setting <code>slices</code> to <code>auto</code> lets Elasticsearch choose
	 * the number of slices to use. This setting will use one slice per shard, up to
	 * a certain limit. If there are multiple source data streams or indices, it
	 * will choose the number of slices based on the index or backing index with the
	 * smallest number of shards. Adding slices to the delete by query operation
	 * creates sub-requests which means it has some quirks:
	 * <ul>
	 * <li>You can see these requests in the tasks APIs. These sub-requests are
	 * &quot;child&quot; tasks of the task for the request with slices.</li>
	 * <li>Fetching the status of the task for the request with slices only contains
	 * the status of completed slices.</li>
	 * <li>These sub-requests are individually addressable for things like
	 * cancellation and rethrottling.</li>
	 * <li>Rethrottling the request with <code>slices</code> will rethrottle the
	 * unfinished sub-request proportionally.</li>
	 * <li>Canceling the request with <code>slices</code> will cancel each
	 * sub-request.</li>
	 * <li>Due to the nature of <code>slices</code> each sub-request won't get a
	 * perfectly even portion of the documents. All documents will be addressed, but
	 * some slices may be larger than others. Expect larger slices to have a more
	 * even distribution.</li>
	 * <li>Parameters like <code>requests_per_second</code> and
	 * <code>max_docs</code> on a request with <code>slices</code> are distributed
	 * proportionally to each sub-request. Combine that with the earlier point about
	 * distribution being uneven and you should conclude that using
	 * <code>max_docs</code> with <code>slices</code> might not result in exactly
	 * <code>max_docs</code> documents being deleted.</li>
	 * <li>Each sub-request gets a slightly different snapshot of the source data
	 * stream or index though these are all taken at approximately the same
	 * time.</li>
	 * </ul>
	 * <p>
	 * If you're slicing manually or otherwise tuning automatic slicing, keep in
	 * mind that:
	 * <ul>
	 * <li>Query performance is most efficient when the number of slices is equal to
	 * the number of shards in the index or backing index. If that number is large
	 * (for example, 500), choose a lower number as too many <code>slices</code>
	 * hurts performance. Setting <code>slices</code> higher than the number of
	 * shards generally does not improve efficiency and adds overhead.</li>
	 * <li>Delete performance scales linearly across available resources with the
	 * number of slices.</li>
	 * </ul>
	 * <p>
	 * Whether query or delete performance dominates the runtime depends on the
	 * documents being reindexed and cluster resources.
	 * <p>
	 * <strong>Cancel a delete by query operation</strong>
	 * <p>
	 * Any delete by query can be canceled using the task cancel API. For example:
	 * 
	 * <pre>
	 * <code>POST _tasks/r1A2WoRbTwKZ516z6NEs5A:36619/_cancel
	 * </code>
	 * </pre>
	 * <p>
	 * The task ID can be found by using the get tasks API.
	 * <p>
	 * Cancellation should happen quickly but might take a few seconds. The get task
	 * status API will continue to list the delete by query task until this task
	 * checks that it has been cancelled and terminates itself.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteByQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-delete-by-query">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteByQueryResponse deleteByQuery(
			Function<DeleteByQueryRequest.Builder, ObjectBuilder<DeleteByQueryRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteByQuery(fn.apply(new DeleteByQueryRequest.Builder()).build());
	}

	// ----- Endpoint: delete_by_query_rethrottle

	/**
	 * Throttle a delete by query operation.
	 * <p>
	 * Change the number of requests per second for a particular delete by query
	 * operation. Rethrottling that speeds up the query takes effect immediately but
	 * rethrotting that slows down the query takes effect after completing the
	 * current batch to prevent scroll timeouts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-delete-by-query-rethrottle">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteByQueryRethrottleResponse deleteByQueryRethrottle(DeleteByQueryRethrottleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteByQueryRethrottleRequest, DeleteByQueryRethrottleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteByQueryRethrottleRequest, DeleteByQueryRethrottleResponse, ErrorResponse>) DeleteByQueryRethrottleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Throttle a delete by query operation.
	 * <p>
	 * Change the number of requests per second for a particular delete by query
	 * operation. Rethrottling that speeds up the query takes effect immediately but
	 * rethrotting that slows down the query takes effect after completing the
	 * current batch to prevent scroll timeouts.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteByQueryRethrottleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-delete-by-query-rethrottle">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteByQueryRethrottleResponse deleteByQueryRethrottle(
			Function<DeleteByQueryRethrottleRequest.Builder, ObjectBuilder<DeleteByQueryRethrottleRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteByQueryRethrottle(fn.apply(new DeleteByQueryRethrottleRequest.Builder()).build());
	}

	// ----- Endpoint: delete_script

	/**
	 * Delete a script or search template. Deletes a stored script or search
	 * template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-delete-script">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteScriptResponse deleteScript(DeleteScriptRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteScriptRequest, DeleteScriptResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteScriptRequest, DeleteScriptResponse, ErrorResponse>) DeleteScriptRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a script or search template. Deletes a stored script or search
	 * template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-delete-script">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteScriptResponse deleteScript(
			Function<DeleteScriptRequest.Builder, ObjectBuilder<DeleteScriptRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteScript(fn.apply(new DeleteScriptRequest.Builder()).build());
	}

	// ----- Endpoint: exists

	/**
	 * Check a document.
	 * <p>
	 * Verify that a document exists. For example, check to see if a document with
	 * the <code>_id</code> 0 exists:
	 * 
	 * <pre>
	 * <code>HEAD my-index-000001/_doc/0
	 * </code>
	 * </pre>
	 * <p>
	 * If the document exists, the API returns a status code of
	 * <code>200 - OK</code>. If the document doesn’t exist, the API returns
	 * <code>404 - Not Found</code>.
	 * <p>
	 * <strong>Versioning support</strong>
	 * <p>
	 * You can use the <code>version</code> parameter to check the document only if
	 * its current version is equal to the specified one.
	 * <p>
	 * Internally, Elasticsearch has marked the old document as deleted and added an
	 * entirely new document. The old version of the document doesn't disappear
	 * immediately, although you won't be able to access it. Elasticsearch cleans up
	 * deleted documents in the background as you continue to index more data.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse exists(ExistsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsRequest, BooleanResponse, ErrorResponse>) ExistsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check a document.
	 * <p>
	 * Verify that a document exists. For example, check to see if a document with
	 * the <code>_id</code> 0 exists:
	 * 
	 * <pre>
	 * <code>HEAD my-index-000001/_doc/0
	 * </code>
	 * </pre>
	 * <p>
	 * If the document exists, the API returns a status code of
	 * <code>200 - OK</code>. If the document doesn’t exist, the API returns
	 * <code>404 - Not Found</code>.
	 * <p>
	 * <strong>Versioning support</strong>
	 * <p>
	 * You can use the <code>version</code> parameter to check the document only if
	 * its current version is equal to the specified one.
	 * <p>
	 * Internally, Elasticsearch has marked the old document as deleted and added an
	 * entirely new document. The old version of the document doesn't disappear
	 * immediately, although you won't be able to access it. Elasticsearch cleans up
	 * deleted documents in the background as you continue to index more data.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
			throws IOException, ElasticsearchException {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: exists_source

	/**
	 * Check for a document source.
	 * <p>
	 * Check whether a document source exists in an index. For example:
	 * 
	 * <pre>
	 * <code>HEAD my-index-000001/_source/1
	 * </code>
	 * </pre>
	 * <p>
	 * A document's source is not available if it is disabled in the mapping.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsSource(ExistsSourceRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsSourceRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsSourceRequest, BooleanResponse, ErrorResponse>) ExistsSourceRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check for a document source.
	 * <p>
	 * Check whether a document source exists in an index. For example:
	 * 
	 * <pre>
	 * <code>HEAD my-index-000001/_source/1
	 * </code>
	 * </pre>
	 * <p>
	 * A document's source is not available if it is disabled in the mapping.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsSource(
			Function<ExistsSourceRequest.Builder, ObjectBuilder<ExistsSourceRequest>> fn)
			throws IOException, ElasticsearchException {
		return existsSource(fn.apply(new ExistsSourceRequest.Builder()).build());
	}

	// ----- Endpoint: explain

	/**
	 * Explain a document match result. Get information about why a specific
	 * document matches, or doesn't match, a query. It computes a score explanation
	 * for a query and a specific document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-explain">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> ExplainResponse<TDocument> explain(ExplainRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse>) ExplainRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.explain.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Explain a document match result. Get information about why a specific
	 * document matches, or doesn't match, a query. It computes a score explanation
	 * for a query and a specific document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExplainRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-explain">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> ExplainResponse<TDocument> explain(
			Function<ExplainRequest.Builder, ObjectBuilder<ExplainRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return explain(fn.apply(new ExplainRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #explain(ExplainRequest, Class)}, where Class is defined
	 * as Void, meaning the documents will not be deserialized.
	 */

	public ExplainResponse<Void> explain(ExplainRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExplainRequest, ExplainResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<ExplainRequest, ExplainResponse<Void>, ErrorResponse>) ExplainRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #explain(Function, Class)}, where Class is defined as
	 * Void, meaning the documents will not be deserialized.
	 */

	public final ExplainResponse<Void> explain(Function<ExplainRequest.Builder, ObjectBuilder<ExplainRequest>> fn)
			throws IOException, ElasticsearchException {
		return explain(fn.apply(new ExplainRequest.Builder()).build(), Void.class);
	}

	/**
	 * Explain a document match result. Get information about why a specific
	 * document matches, or doesn't match, a query. It computes a score explanation
	 * for a query and a specific document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-explain">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> ExplainResponse<TDocument> explain(ExplainRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse>) ExplainRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.explain.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Explain a document match result. Get information about why a specific
	 * document matches, or doesn't match, a query. It computes a score explanation
	 * for a query and a specific document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExplainRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-explain">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> ExplainResponse<TDocument> explain(
			Function<ExplainRequest.Builder, ObjectBuilder<ExplainRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return explain(fn.apply(new ExplainRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: field_caps

	/**
	 * Get the field capabilities.
	 * <p>
	 * Get information about the capabilities of fields among multiple indices.
	 * <p>
	 * For data streams, the API returns field capabilities among the stream’s
	 * backing indices. It returns runtime fields like any other field. For example,
	 * a runtime field with a type of keyword is returned the same as any other
	 * field that belongs to the <code>keyword</code> family.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-field-caps">Documentation
	 *      on elastic.co</a>
	 */

	public FieldCapsResponse fieldCaps(FieldCapsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FieldCapsRequest, FieldCapsResponse, ErrorResponse> endpoint = (JsonEndpoint<FieldCapsRequest, FieldCapsResponse, ErrorResponse>) FieldCapsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the field capabilities.
	 * <p>
	 * Get information about the capabilities of fields among multiple indices.
	 * <p>
	 * For data streams, the API returns field capabilities among the stream’s
	 * backing indices. It returns runtime fields like any other field. For example,
	 * a runtime field with a type of keyword is returned the same as any other
	 * field that belongs to the <code>keyword</code> family.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FieldCapsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-field-caps">Documentation
	 *      on elastic.co</a>
	 */

	public final FieldCapsResponse fieldCaps(Function<FieldCapsRequest.Builder, ObjectBuilder<FieldCapsRequest>> fn)
			throws IOException, ElasticsearchException {
		return fieldCaps(fn.apply(new FieldCapsRequest.Builder()).build());
	}

	/**
	 * Get the field capabilities.
	 * <p>
	 * Get information about the capabilities of fields among multiple indices.
	 * <p>
	 * For data streams, the API returns field capabilities among the stream’s
	 * backing indices. It returns runtime fields like any other field. For example,
	 * a runtime field with a type of keyword is returned the same as any other
	 * field that belongs to the <code>keyword</code> family.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-field-caps">Documentation
	 *      on elastic.co</a>
	 */

	public FieldCapsResponse fieldCaps() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new FieldCapsRequest.Builder().build(), FieldCapsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: get

	/**
	 * Get a document by its ID.
	 * <p>
	 * Get a document and its source or stored fields from an index.
	 * <p>
	 * By default, this API is realtime and is not affected by the refresh rate of
	 * the index (when data will become visible for search). In the case where
	 * stored fields are requested with the <code>stored_fields</code> parameter and
	 * the document has been updated but is not yet refreshed, the API will have to
	 * parse and analyze the source to extract the stored fields. To turn off
	 * realtime behavior, set the <code>realtime</code> parameter to false.
	 * <p>
	 * <strong>Source filtering</strong>
	 * <p>
	 * By default, the API returns the contents of the <code>_source</code> field
	 * unless you have used the <code>stored_fields</code> parameter or the
	 * <code>_source</code> field is turned off. You can turn off
	 * <code>_source</code> retrieval by using the <code>_source</code> parameter:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source=false
	 * </code>
	 * </pre>
	 * <p>
	 * If you only need one or two fields from the <code>_source</code>, use the
	 * <code>_source_includes</code> or <code>_source_excludes</code> parameters to
	 * include or filter out particular fields. This can be helpful with large
	 * documents where partial retrieval can save on network overhead Both
	 * parameters take a comma separated list of fields or wildcard expressions. For
	 * example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source_includes=*.id&amp;_source_excludes=entities
	 * </code>
	 * </pre>
	 * <p>
	 * If you only want to specify includes, you can use a shorter notation:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source=*.id
	 * </code>
	 * </pre>
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * If routing is used during indexing, the routing value also needs to be
	 * specified to retrieve a document. For example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/2?routing=user1
	 * </code>
	 * </pre>
	 * <p>
	 * This request gets the document with ID 2, but it is routed based on the user.
	 * The document is not fetched if the correct routing is not specified.
	 * <p>
	 * <strong>Distributed</strong>
	 * <p>
	 * The GET operation is hashed into a specific shard ID. It is then redirected
	 * to one of the replicas within that shard ID and returns the result. The
	 * replicas are the primary shard and its replicas within that shard ID group.
	 * This means that the more replicas you have, the better your GET scaling will
	 * be.
	 * <p>
	 * <strong>Versioning support</strong>
	 * <p>
	 * You can use the <code>version</code> parameter to retrieve the document only
	 * if its current version is equal to the specified one.
	 * <p>
	 * Internally, Elasticsearch has marked the old document as deleted and added an
	 * entirely new document. The old version of the document doesn't disappear
	 * immediately, although you won't be able to access it. Elasticsearch cleans up
	 * deleted documents in the background as you continue to index more data.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetResponse<TDocument> get(GetRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse>) GetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a document by its ID.
	 * <p>
	 * Get a document and its source or stored fields from an index.
	 * <p>
	 * By default, this API is realtime and is not affected by the refresh rate of
	 * the index (when data will become visible for search). In the case where
	 * stored fields are requested with the <code>stored_fields</code> parameter and
	 * the document has been updated but is not yet refreshed, the API will have to
	 * parse and analyze the source to extract the stored fields. To turn off
	 * realtime behavior, set the <code>realtime</code> parameter to false.
	 * <p>
	 * <strong>Source filtering</strong>
	 * <p>
	 * By default, the API returns the contents of the <code>_source</code> field
	 * unless you have used the <code>stored_fields</code> parameter or the
	 * <code>_source</code> field is turned off. You can turn off
	 * <code>_source</code> retrieval by using the <code>_source</code> parameter:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source=false
	 * </code>
	 * </pre>
	 * <p>
	 * If you only need one or two fields from the <code>_source</code>, use the
	 * <code>_source_includes</code> or <code>_source_excludes</code> parameters to
	 * include or filter out particular fields. This can be helpful with large
	 * documents where partial retrieval can save on network overhead Both
	 * parameters take a comma separated list of fields or wildcard expressions. For
	 * example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source_includes=*.id&amp;_source_excludes=entities
	 * </code>
	 * </pre>
	 * <p>
	 * If you only want to specify includes, you can use a shorter notation:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source=*.id
	 * </code>
	 * </pre>
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * If routing is used during indexing, the routing value also needs to be
	 * specified to retrieve a document. For example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/2?routing=user1
	 * </code>
	 * </pre>
	 * <p>
	 * This request gets the document with ID 2, but it is routed based on the user.
	 * The document is not fetched if the correct routing is not specified.
	 * <p>
	 * <strong>Distributed</strong>
	 * <p>
	 * The GET operation is hashed into a specific shard ID. It is then redirected
	 * to one of the replicas within that shard ID and returns the result. The
	 * replicas are the primary shard and its replicas within that shard ID group.
	 * This means that the more replicas you have, the better your GET scaling will
	 * be.
	 * <p>
	 * <strong>Versioning support</strong>
	 * <p>
	 * You can use the <code>version</code> parameter to retrieve the document only
	 * if its current version is equal to the specified one.
	 * <p>
	 * Internally, Elasticsearch has marked the old document as deleted and added an
	 * entirely new document. The old version of the document doesn't disappear
	 * immediately, although you won't be able to access it. Elasticsearch cleans up
	 * deleted documents in the background as you continue to index more data.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetResponse<TDocument> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return get(fn.apply(new GetRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #get(GetRequest, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public GetResponse<Void> get(GetRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRequest, GetResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<GetRequest, GetResponse<Void>, ErrorResponse>) GetRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #get(Function, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public final GetResponse<Void> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetRequest.Builder()).build(), Void.class);
	}

	/**
	 * Get a document by its ID.
	 * <p>
	 * Get a document and its source or stored fields from an index.
	 * <p>
	 * By default, this API is realtime and is not affected by the refresh rate of
	 * the index (when data will become visible for search). In the case where
	 * stored fields are requested with the <code>stored_fields</code> parameter and
	 * the document has been updated but is not yet refreshed, the API will have to
	 * parse and analyze the source to extract the stored fields. To turn off
	 * realtime behavior, set the <code>realtime</code> parameter to false.
	 * <p>
	 * <strong>Source filtering</strong>
	 * <p>
	 * By default, the API returns the contents of the <code>_source</code> field
	 * unless you have used the <code>stored_fields</code> parameter or the
	 * <code>_source</code> field is turned off. You can turn off
	 * <code>_source</code> retrieval by using the <code>_source</code> parameter:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source=false
	 * </code>
	 * </pre>
	 * <p>
	 * If you only need one or two fields from the <code>_source</code>, use the
	 * <code>_source_includes</code> or <code>_source_excludes</code> parameters to
	 * include or filter out particular fields. This can be helpful with large
	 * documents where partial retrieval can save on network overhead Both
	 * parameters take a comma separated list of fields or wildcard expressions. For
	 * example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source_includes=*.id&amp;_source_excludes=entities
	 * </code>
	 * </pre>
	 * <p>
	 * If you only want to specify includes, you can use a shorter notation:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source=*.id
	 * </code>
	 * </pre>
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * If routing is used during indexing, the routing value also needs to be
	 * specified to retrieve a document. For example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/2?routing=user1
	 * </code>
	 * </pre>
	 * <p>
	 * This request gets the document with ID 2, but it is routed based on the user.
	 * The document is not fetched if the correct routing is not specified.
	 * <p>
	 * <strong>Distributed</strong>
	 * <p>
	 * The GET operation is hashed into a specific shard ID. It is then redirected
	 * to one of the replicas within that shard ID and returns the result. The
	 * replicas are the primary shard and its replicas within that shard ID group.
	 * This means that the more replicas you have, the better your GET scaling will
	 * be.
	 * <p>
	 * <strong>Versioning support</strong>
	 * <p>
	 * You can use the <code>version</code> parameter to retrieve the document only
	 * if its current version is equal to the specified one.
	 * <p>
	 * Internally, Elasticsearch has marked the old document as deleted and added an
	 * entirely new document. The old version of the document doesn't disappear
	 * immediately, although you won't be able to access it. Elasticsearch cleans up
	 * deleted documents in the background as you continue to index more data.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetResponse<TDocument> get(GetRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse>) GetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a document by its ID.
	 * <p>
	 * Get a document and its source or stored fields from an index.
	 * <p>
	 * By default, this API is realtime and is not affected by the refresh rate of
	 * the index (when data will become visible for search). In the case where
	 * stored fields are requested with the <code>stored_fields</code> parameter and
	 * the document has been updated but is not yet refreshed, the API will have to
	 * parse and analyze the source to extract the stored fields. To turn off
	 * realtime behavior, set the <code>realtime</code> parameter to false.
	 * <p>
	 * <strong>Source filtering</strong>
	 * <p>
	 * By default, the API returns the contents of the <code>_source</code> field
	 * unless you have used the <code>stored_fields</code> parameter or the
	 * <code>_source</code> field is turned off. You can turn off
	 * <code>_source</code> retrieval by using the <code>_source</code> parameter:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source=false
	 * </code>
	 * </pre>
	 * <p>
	 * If you only need one or two fields from the <code>_source</code>, use the
	 * <code>_source_includes</code> or <code>_source_excludes</code> parameters to
	 * include or filter out particular fields. This can be helpful with large
	 * documents where partial retrieval can save on network overhead Both
	 * parameters take a comma separated list of fields or wildcard expressions. For
	 * example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source_includes=*.id&amp;_source_excludes=entities
	 * </code>
	 * </pre>
	 * <p>
	 * If you only want to specify includes, you can use a shorter notation:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/0?_source=*.id
	 * </code>
	 * </pre>
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * If routing is used during indexing, the routing value also needs to be
	 * specified to retrieve a document. For example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_doc/2?routing=user1
	 * </code>
	 * </pre>
	 * <p>
	 * This request gets the document with ID 2, but it is routed based on the user.
	 * The document is not fetched if the correct routing is not specified.
	 * <p>
	 * <strong>Distributed</strong>
	 * <p>
	 * The GET operation is hashed into a specific shard ID. It is then redirected
	 * to one of the replicas within that shard ID and returns the result. The
	 * replicas are the primary shard and its replicas within that shard ID group.
	 * This means that the more replicas you have, the better your GET scaling will
	 * be.
	 * <p>
	 * <strong>Versioning support</strong>
	 * <p>
	 * You can use the <code>version</code> parameter to retrieve the document only
	 * if its current version is equal to the specified one.
	 * <p>
	 * Internally, Elasticsearch has marked the old document as deleted and added an
	 * entirely new document. The old version of the document doesn't disappear
	 * immediately, although you won't be able to access it. Elasticsearch cleans up
	 * deleted documents in the background as you continue to index more data.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetResponse<TDocument> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn,
			Type tDocumentType) throws IOException, ElasticsearchException {
		return get(fn.apply(new GetRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: get_script

	/**
	 * Get a script or search template. Retrieves a stored script or search
	 * template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get-script">Documentation
	 *      on elastic.co</a>
	 */

	public GetScriptResponse getScript(GetScriptRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetScriptRequest, GetScriptResponse, ErrorResponse> endpoint = (JsonEndpoint<GetScriptRequest, GetScriptResponse, ErrorResponse>) GetScriptRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a script or search template. Retrieves a stored script or search
	 * template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get-script">Documentation
	 *      on elastic.co</a>
	 */

	public final GetScriptResponse getScript(Function<GetScriptRequest.Builder, ObjectBuilder<GetScriptRequest>> fn)
			throws IOException, ElasticsearchException {
		return getScript(fn.apply(new GetScriptRequest.Builder()).build());
	}

	// ----- Endpoint: get_script_context

	/**
	 * Get script contexts.
	 * <p>
	 * Get a list of supported script contexts and their methods.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get-script-context">Documentation
	 *      on elastic.co</a>
	 */
	public GetScriptContextResponse getScriptContext() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetScriptContextRequest._INSTANCE, GetScriptContextRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: get_script_languages

	/**
	 * Get script languages.
	 * <p>
	 * Get a list of available script types, languages, and contexts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get-script-languages">Documentation
	 *      on elastic.co</a>
	 */
	public GetScriptLanguagesResponse getScriptLanguages() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetScriptLanguagesRequest._INSTANCE, GetScriptLanguagesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: get_source

	/**
	 * Get a document's source.
	 * <p>
	 * Get the source of a document. For example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_source/1
	 * </code>
	 * </pre>
	 * <p>
	 * You can use the source filtering parameters to control which parts of the
	 * <code>_source</code> are returned:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_source/1/?_source_includes=*.id&amp;_source_excludes=entities
	 * </code>
	 * </pre>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetSourceResponse<TDocument> getSource(GetSourceRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse>) GetSourceRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get_source.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a document's source.
	 * <p>
	 * Get the source of a document. For example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_source/1
	 * </code>
	 * </pre>
	 * <p>
	 * You can use the source filtering parameters to control which parts of the
	 * <code>_source</code> are returned:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_source/1/?_source_includes=*.id&amp;_source_excludes=entities
	 * </code>
	 * </pre>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetSourceResponse<TDocument> getSource(
			Function<GetSourceRequest.Builder, ObjectBuilder<GetSourceRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return getSource(fn.apply(new GetSourceRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #getSource(GetSourceRequest, Class)}, where Class is
	 * defined as Void, meaning the documents will not be deserialized.
	 */

	public GetSourceResponse<Void> getSource(GetSourceRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSourceRequest, GetSourceResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<GetSourceRequest, GetSourceResponse<Void>, ErrorResponse>) GetSourceRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #getSource(Function, Class)}, where Class is defined as
	 * Void, meaning the documents will not be deserialized.
	 */

	public final GetSourceResponse<Void> getSource(
			Function<GetSourceRequest.Builder, ObjectBuilder<GetSourceRequest>> fn)
			throws IOException, ElasticsearchException {
		return getSource(fn.apply(new GetSourceRequest.Builder()).build(), Void.class);
	}

	/**
	 * Get a document's source.
	 * <p>
	 * Get the source of a document. For example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_source/1
	 * </code>
	 * </pre>
	 * <p>
	 * You can use the source filtering parameters to control which parts of the
	 * <code>_source</code> are returned:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_source/1/?_source_includes=*.id&amp;_source_excludes=entities
	 * </code>
	 * </pre>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetSourceResponse<TDocument> getSource(GetSourceRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse>) GetSourceRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get_source.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a document's source.
	 * <p>
	 * Get the source of a document. For example:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_source/1
	 * </code>
	 * </pre>
	 * <p>
	 * You can use the source filtering parameters to control which parts of the
	 * <code>_source</code> are returned:
	 * 
	 * <pre>
	 * <code>GET my-index-000001/_source/1/?_source_includes=*.id&amp;_source_excludes=entities
	 * </code>
	 * </pre>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-get">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetSourceResponse<TDocument> getSource(
			Function<GetSourceRequest.Builder, ObjectBuilder<GetSourceRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return getSource(fn.apply(new GetSourceRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: health_report

	/**
	 * Get the cluster health. Get a report with the health status of an
	 * Elasticsearch cluster. The report contains a list of indicators that compose
	 * Elasticsearch functionality.
	 * <p>
	 * Each indicator has a health status of: green, unknown, yellow or red. The
	 * indicator will provide an explanation and metadata describing the reason for
	 * its current health status.
	 * <p>
	 * The cluster’s status is controlled by the worst indicator status.
	 * <p>
	 * In the event that an indicator’s status is non-green, a list of impacts may
	 * be present in the indicator result which detail the functionalities that are
	 * negatively affected by the health issue. Each impact carries with it a
	 * severity level, an area of the system that is affected, and a simple
	 * description of the impact on the system.
	 * <p>
	 * Some health indicators can determine the root cause of a health problem and
	 * prescribe a set of steps that can be performed in order to improve the health
	 * of the system. The root cause and remediation steps are encapsulated in a
	 * diagnosis. A diagnosis contains a cause detailing a root cause analysis, an
	 * action containing a brief description of the steps to take to fix the
	 * problem, the list of affected resources (if applicable), and a detailed
	 * step-by-step troubleshooting guide to fix the diagnosed problem.
	 * <p>
	 * NOTE: The health indicators perform root cause analysis of non-green health
	 * statuses. This can be computationally expensive when called frequently. When
	 * setting up automated polling of the API for health status, set verbose to
	 * false to disable the more expensive analysis logic.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-health-report">Documentation
	 *      on elastic.co</a>
	 */

	public HealthReportResponse healthReport(HealthReportRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HealthReportRequest, HealthReportResponse, ErrorResponse> endpoint = (JsonEndpoint<HealthReportRequest, HealthReportResponse, ErrorResponse>) HealthReportRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the cluster health. Get a report with the health status of an
	 * Elasticsearch cluster. The report contains a list of indicators that compose
	 * Elasticsearch functionality.
	 * <p>
	 * Each indicator has a health status of: green, unknown, yellow or red. The
	 * indicator will provide an explanation and metadata describing the reason for
	 * its current health status.
	 * <p>
	 * The cluster’s status is controlled by the worst indicator status.
	 * <p>
	 * In the event that an indicator’s status is non-green, a list of impacts may
	 * be present in the indicator result which detail the functionalities that are
	 * negatively affected by the health issue. Each impact carries with it a
	 * severity level, an area of the system that is affected, and a simple
	 * description of the impact on the system.
	 * <p>
	 * Some health indicators can determine the root cause of a health problem and
	 * prescribe a set of steps that can be performed in order to improve the health
	 * of the system. The root cause and remediation steps are encapsulated in a
	 * diagnosis. A diagnosis contains a cause detailing a root cause analysis, an
	 * action containing a brief description of the steps to take to fix the
	 * problem, the list of affected resources (if applicable), and a detailed
	 * step-by-step troubleshooting guide to fix the diagnosed problem.
	 * <p>
	 * NOTE: The health indicators perform root cause analysis of non-green health
	 * statuses. This can be computationally expensive when called frequently. When
	 * setting up automated polling of the API for health status, set verbose to
	 * false to disable the more expensive analysis logic.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HealthReportRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-health-report">Documentation
	 *      on elastic.co</a>
	 */

	public final HealthReportResponse healthReport(
			Function<HealthReportRequest.Builder, ObjectBuilder<HealthReportRequest>> fn)
			throws IOException, ElasticsearchException {
		return healthReport(fn.apply(new HealthReportRequest.Builder()).build());
	}

	/**
	 * Get the cluster health. Get a report with the health status of an
	 * Elasticsearch cluster. The report contains a list of indicators that compose
	 * Elasticsearch functionality.
	 * <p>
	 * Each indicator has a health status of: green, unknown, yellow or red. The
	 * indicator will provide an explanation and metadata describing the reason for
	 * its current health status.
	 * <p>
	 * The cluster’s status is controlled by the worst indicator status.
	 * <p>
	 * In the event that an indicator’s status is non-green, a list of impacts may
	 * be present in the indicator result which detail the functionalities that are
	 * negatively affected by the health issue. Each impact carries with it a
	 * severity level, an area of the system that is affected, and a simple
	 * description of the impact on the system.
	 * <p>
	 * Some health indicators can determine the root cause of a health problem and
	 * prescribe a set of steps that can be performed in order to improve the health
	 * of the system. The root cause and remediation steps are encapsulated in a
	 * diagnosis. A diagnosis contains a cause detailing a root cause analysis, an
	 * action containing a brief description of the steps to take to fix the
	 * problem, the list of affected resources (if applicable), and a detailed
	 * step-by-step troubleshooting guide to fix the diagnosed problem.
	 * <p>
	 * NOTE: The health indicators perform root cause analysis of non-green health
	 * statuses. This can be computationally expensive when called frequently. When
	 * setting up automated polling of the API for health status, set verbose to
	 * false to disable the more expensive analysis logic.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-health-report">Documentation
	 *      on elastic.co</a>
	 */

	public HealthReportResponse healthReport() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new HealthReportRequest.Builder().build(), HealthReportRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: index

	/**
	 * Create or update a document in an index.
	 * <p>
	 * Add a JSON document to the specified data stream or index and make it
	 * searchable. If the target is an index and the document already exists, the
	 * request updates the document and increments its version.
	 * <p>
	 * NOTE: You cannot use this API to send update requests for existing documents
	 * in a data stream.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or index alias:
	 * <ul>
	 * <li>To add or overwrite a document using the
	 * <code>PUT /&lt;target&gt;/_doc/&lt;_id&gt;</code> request format, you must
	 * have the <code>create</code>, <code>index</code>, or <code>write</code> index
	 * privilege.</li>
	 * <li>To add a document using the <code>POST /&lt;target&gt;/_doc/</code>
	 * request format, you must have the <code>create_doc</code>,
	 * <code>create</code>, <code>index</code>, or <code>write</code> index
	 * privilege.</li>
	 * <li>To automatically create a data stream or index with this API request, you
	 * must have the <code>auto_configure</code>, <code>create_index</code>, or
	 * <code>manage</code> index privilege.</li>
	 * </ul>
	 * <p>
	 * Automatic data stream creation requires a matching index template with data
	 * stream enabled.
	 * <p>
	 * NOTE: Replica shards might not all be started when an indexing operation
	 * returns successfully. By default, only the primary is required. Set
	 * <code>wait_for_active_shards</code> to change this default behavior.
	 * <p>
	 * <strong>Automatically create data streams and indices</strong>
	 * <p>
	 * If the request's target doesn't exist and matches an index template with a
	 * <code>data_stream</code> definition, the index operation automatically
	 * creates the data stream.
	 * <p>
	 * If the target doesn't exist and doesn't match a data stream template, the
	 * operation automatically creates the index and applies any matching index
	 * templates.
	 * <p>
	 * NOTE: Elasticsearch includes several built-in index templates. To avoid
	 * naming collisions with these templates, refer to index pattern documentation.
	 * <p>
	 * If no mapping exists, the index operation creates a dynamic mapping. By
	 * default, new fields and objects are automatically added to the mapping if
	 * needed.
	 * <p>
	 * Automatic index creation is controlled by the
	 * <code>action.auto_create_index</code> setting. If it is <code>true</code>,
	 * any index can be created automatically. You can modify this setting to
	 * explicitly allow or block automatic creation of indices that match specified
	 * patterns or set it to <code>false</code> to turn off automatic index creation
	 * entirely. Specify a comma-separated list of patterns you want to allow or
	 * prefix each pattern with <code>+</code> or <code>-</code> to indicate whether
	 * it should be allowed or blocked. When a list is specified, the default
	 * behaviour is to disallow.
	 * <p>
	 * NOTE: The <code>action.auto_create_index</code> setting affects the automatic
	 * creation of indices only. It does not affect the creation of data streams.
	 * <p>
	 * <strong>Optimistic concurrency control</strong>
	 * <p>
	 * Index operations can be made conditional and only be performed if the last
	 * modification to the document was assigned the sequence number and primary
	 * term specified by the <code>if_seq_no</code> and <code>if_primary_term</code>
	 * parameters. If a mismatch is detected, the operation will result in a
	 * <code>VersionConflictException</code> and a status code of <code>409</code>.
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * By default, shard placement — or routing — is controlled by using a hash of
	 * the document's ID value. For more explicit control, the value fed into the
	 * hash function used by the router can be directly specified on a per-operation
	 * basis using the <code>routing</code> parameter.
	 * <p>
	 * When setting up explicit mapping, you can also use the <code>_routing</code>
	 * field to direct the index operation to extract the routing value from the
	 * document itself. This does come at the (very minimal) cost of an additional
	 * document parsing pass. If the <code>_routing</code> mapping is defined and
	 * set to be required, the index operation will fail if no routing value is
	 * provided or extracted.
	 * <p>
	 * NOTE: Data streams do not support custom routing unless they were created
	 * with the <code>allow_custom_routing</code> setting enabled in the template.
	 * <p>
	 * <strong>Distributed</strong>
	 * <p>
	 * The index operation is directed to the primary shard based on its route and
	 * performed on the actual node containing this shard. After the primary shard
	 * completes the operation, if needed, the update is distributed to applicable
	 * replicas.
	 * <p>
	 * <strong>Active shards</strong>
	 * <p>
	 * To improve the resiliency of writes to the system, indexing operations can be
	 * configured to wait for a certain number of active shard copies before
	 * proceeding with the operation. If the requisite number of active shard copies
	 * are not available, then the write operation must wait and retry, until either
	 * the requisite shard copies have started or a timeout occurs. By default,
	 * write operations only wait for the primary shards to be active before
	 * proceeding (that is to say <code>wait_for_active_shards</code> is
	 * <code>1</code>). This default can be overridden in the index settings
	 * dynamically by setting <code>index.write.wait_for_active_shards</code>. To
	 * alter this behavior per operation, use the
	 * <code>wait_for_active_shards request</code> parameter.
	 * <p>
	 * Valid values are all or any positive integer up to the total number of
	 * configured copies per shard in the index (which is
	 * <code>number_of_replicas</code>+1). Specifying a negative value or a number
	 * greater than the number of shard copies will throw an error.
	 * <p>
	 * For example, suppose you have a cluster of three nodes, A, B, and C and you
	 * create an index index with the number of replicas set to 3 (resulting in 4
	 * shard copies, one more copy than there are nodes). If you attempt an indexing
	 * operation, by default the operation will only ensure the primary copy of each
	 * shard is available before proceeding. This means that even if B and C went
	 * down and A hosted the primary shard copies, the indexing operation would
	 * still proceed with only one copy of the data. If
	 * <code>wait_for_active_shards</code> is set on the request to <code>3</code>
	 * (and all three nodes are up), the indexing operation will require 3 active
	 * shard copies before proceeding. This requirement should be met because there
	 * are 3 active nodes in the cluster, each one holding a copy of the shard.
	 * However, if you set <code>wait_for_active_shards</code> to <code>all</code>
	 * (or to <code>4</code>, which is the same in this situation), the indexing
	 * operation will not proceed as you do not have all 4 copies of each shard
	 * active in the index. The operation will timeout unless a new node is brought
	 * up in the cluster to host the fourth copy of the shard.
	 * <p>
	 * It is important to note that this setting greatly reduces the chances of the
	 * write operation not writing to the requisite number of shard copies, but it
	 * does not completely eliminate the possibility, because this check occurs
	 * before the write operation starts. After the write operation is underway, it
	 * is still possible for replication to fail on any number of shard copies but
	 * still succeed on the primary. The <code>_shards</code> section of the API
	 * response reveals the number of shard copies on which replication succeeded
	 * and failed.
	 * <p>
	 * <strong>No operation (noop) updates</strong>
	 * <p>
	 * When updating a document by using this API, a new version of the document is
	 * always created even if the document hasn't changed. If this isn't acceptable
	 * use the <code>_update</code> API with <code>detect_noop</code> set to
	 * <code>true</code>. The <code>detect_noop</code> option isn't available on
	 * this API because it doesn’t fetch the old source and isn't able to compare it
	 * against the new source.
	 * <p>
	 * There isn't a definitive rule for when noop updates aren't acceptable. It's a
	 * combination of lots of factors like how frequently your data source sends
	 * updates that are actually noops and how many queries per second Elasticsearch
	 * runs on the shard receiving the updates.
	 * <p>
	 * <strong>Versioning</strong>
	 * <p>
	 * Each indexed document is given a version number. By default, internal
	 * versioning is used that starts at 1 and increments with each update, deletes
	 * included. Optionally, the version number can be set to an external value (for
	 * example, if maintained in a database). To enable this functionality,
	 * <code>version_type</code> should be set to <code>external</code>. The value
	 * provided must be a numeric, long value greater than or equal to 0, and less
	 * than around <code>9.2e+18</code>.
	 * <p>
	 * NOTE: Versioning is completely real time, and is not affected by the near
	 * real time aspects of search operations. If no version is provided, the
	 * operation runs without any version checks.
	 * <p>
	 * When using the external version type, the system checks to see if the version
	 * number passed to the index request is greater than the version of the
	 * currently stored document. If true, the document will be indexed and the new
	 * version number used. If the value provided is less than or equal to the
	 * stored document's version number, a version conflict will occur and the index
	 * operation will fail. For example:
	 * 
	 * <pre>
	 * <code>PUT my-index-000001/_doc/1?version=2&amp;version_type=external
	 * {
	 *   &quot;user&quot;: {
	 *     &quot;id&quot;: &quot;elkbee&quot;
	 *   }
	 * }
	 *
	 * In this example, the operation will succeed since the supplied version of 2 is higher than the current document version of 1.
	 * If the document was already updated and its version was set to 2 or higher, the indexing command will fail and result in a conflict (409 HTTP status code).
	 *
	 * A nice side effect is that there is no need to maintain strict ordering of async indexing operations run as a result of changes to a source database, as long as version numbers from the source database are used.
	 * Even the simple case of updating the Elasticsearch index using data from a database is simplified if external versioning is used, as only the latest version will be used if the index operations arrive out of order.
	 * </code>
	 * </pre>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-create">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> IndexResponse index(IndexRequest<TDocument> request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<IndexRequest<?>, IndexResponse, ErrorResponse> endpoint = (JsonEndpoint<IndexRequest<?>, IndexResponse, ErrorResponse>) IndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a document in an index.
	 * <p>
	 * Add a JSON document to the specified data stream or index and make it
	 * searchable. If the target is an index and the document already exists, the
	 * request updates the document and increments its version.
	 * <p>
	 * NOTE: You cannot use this API to send update requests for existing documents
	 * in a data stream.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or index alias:
	 * <ul>
	 * <li>To add or overwrite a document using the
	 * <code>PUT /&lt;target&gt;/_doc/&lt;_id&gt;</code> request format, you must
	 * have the <code>create</code>, <code>index</code>, or <code>write</code> index
	 * privilege.</li>
	 * <li>To add a document using the <code>POST /&lt;target&gt;/_doc/</code>
	 * request format, you must have the <code>create_doc</code>,
	 * <code>create</code>, <code>index</code>, or <code>write</code> index
	 * privilege.</li>
	 * <li>To automatically create a data stream or index with this API request, you
	 * must have the <code>auto_configure</code>, <code>create_index</code>, or
	 * <code>manage</code> index privilege.</li>
	 * </ul>
	 * <p>
	 * Automatic data stream creation requires a matching index template with data
	 * stream enabled.
	 * <p>
	 * NOTE: Replica shards might not all be started when an indexing operation
	 * returns successfully. By default, only the primary is required. Set
	 * <code>wait_for_active_shards</code> to change this default behavior.
	 * <p>
	 * <strong>Automatically create data streams and indices</strong>
	 * <p>
	 * If the request's target doesn't exist and matches an index template with a
	 * <code>data_stream</code> definition, the index operation automatically
	 * creates the data stream.
	 * <p>
	 * If the target doesn't exist and doesn't match a data stream template, the
	 * operation automatically creates the index and applies any matching index
	 * templates.
	 * <p>
	 * NOTE: Elasticsearch includes several built-in index templates. To avoid
	 * naming collisions with these templates, refer to index pattern documentation.
	 * <p>
	 * If no mapping exists, the index operation creates a dynamic mapping. By
	 * default, new fields and objects are automatically added to the mapping if
	 * needed.
	 * <p>
	 * Automatic index creation is controlled by the
	 * <code>action.auto_create_index</code> setting. If it is <code>true</code>,
	 * any index can be created automatically. You can modify this setting to
	 * explicitly allow or block automatic creation of indices that match specified
	 * patterns or set it to <code>false</code> to turn off automatic index creation
	 * entirely. Specify a comma-separated list of patterns you want to allow or
	 * prefix each pattern with <code>+</code> or <code>-</code> to indicate whether
	 * it should be allowed or blocked. When a list is specified, the default
	 * behaviour is to disallow.
	 * <p>
	 * NOTE: The <code>action.auto_create_index</code> setting affects the automatic
	 * creation of indices only. It does not affect the creation of data streams.
	 * <p>
	 * <strong>Optimistic concurrency control</strong>
	 * <p>
	 * Index operations can be made conditional and only be performed if the last
	 * modification to the document was assigned the sequence number and primary
	 * term specified by the <code>if_seq_no</code> and <code>if_primary_term</code>
	 * parameters. If a mismatch is detected, the operation will result in a
	 * <code>VersionConflictException</code> and a status code of <code>409</code>.
	 * <p>
	 * <strong>Routing</strong>
	 * <p>
	 * By default, shard placement — or routing — is controlled by using a hash of
	 * the document's ID value. For more explicit control, the value fed into the
	 * hash function used by the router can be directly specified on a per-operation
	 * basis using the <code>routing</code> parameter.
	 * <p>
	 * When setting up explicit mapping, you can also use the <code>_routing</code>
	 * field to direct the index operation to extract the routing value from the
	 * document itself. This does come at the (very minimal) cost of an additional
	 * document parsing pass. If the <code>_routing</code> mapping is defined and
	 * set to be required, the index operation will fail if no routing value is
	 * provided or extracted.
	 * <p>
	 * NOTE: Data streams do not support custom routing unless they were created
	 * with the <code>allow_custom_routing</code> setting enabled in the template.
	 * <p>
	 * <strong>Distributed</strong>
	 * <p>
	 * The index operation is directed to the primary shard based on its route and
	 * performed on the actual node containing this shard. After the primary shard
	 * completes the operation, if needed, the update is distributed to applicable
	 * replicas.
	 * <p>
	 * <strong>Active shards</strong>
	 * <p>
	 * To improve the resiliency of writes to the system, indexing operations can be
	 * configured to wait for a certain number of active shard copies before
	 * proceeding with the operation. If the requisite number of active shard copies
	 * are not available, then the write operation must wait and retry, until either
	 * the requisite shard copies have started or a timeout occurs. By default,
	 * write operations only wait for the primary shards to be active before
	 * proceeding (that is to say <code>wait_for_active_shards</code> is
	 * <code>1</code>). This default can be overridden in the index settings
	 * dynamically by setting <code>index.write.wait_for_active_shards</code>. To
	 * alter this behavior per operation, use the
	 * <code>wait_for_active_shards request</code> parameter.
	 * <p>
	 * Valid values are all or any positive integer up to the total number of
	 * configured copies per shard in the index (which is
	 * <code>number_of_replicas</code>+1). Specifying a negative value or a number
	 * greater than the number of shard copies will throw an error.
	 * <p>
	 * For example, suppose you have a cluster of three nodes, A, B, and C and you
	 * create an index index with the number of replicas set to 3 (resulting in 4
	 * shard copies, one more copy than there are nodes). If you attempt an indexing
	 * operation, by default the operation will only ensure the primary copy of each
	 * shard is available before proceeding. This means that even if B and C went
	 * down and A hosted the primary shard copies, the indexing operation would
	 * still proceed with only one copy of the data. If
	 * <code>wait_for_active_shards</code> is set on the request to <code>3</code>
	 * (and all three nodes are up), the indexing operation will require 3 active
	 * shard copies before proceeding. This requirement should be met because there
	 * are 3 active nodes in the cluster, each one holding a copy of the shard.
	 * However, if you set <code>wait_for_active_shards</code> to <code>all</code>
	 * (or to <code>4</code>, which is the same in this situation), the indexing
	 * operation will not proceed as you do not have all 4 copies of each shard
	 * active in the index. The operation will timeout unless a new node is brought
	 * up in the cluster to host the fourth copy of the shard.
	 * <p>
	 * It is important to note that this setting greatly reduces the chances of the
	 * write operation not writing to the requisite number of shard copies, but it
	 * does not completely eliminate the possibility, because this check occurs
	 * before the write operation starts. After the write operation is underway, it
	 * is still possible for replication to fail on any number of shard copies but
	 * still succeed on the primary. The <code>_shards</code> section of the API
	 * response reveals the number of shard copies on which replication succeeded
	 * and failed.
	 * <p>
	 * <strong>No operation (noop) updates</strong>
	 * <p>
	 * When updating a document by using this API, a new version of the document is
	 * always created even if the document hasn't changed. If this isn't acceptable
	 * use the <code>_update</code> API with <code>detect_noop</code> set to
	 * <code>true</code>. The <code>detect_noop</code> option isn't available on
	 * this API because it doesn’t fetch the old source and isn't able to compare it
	 * against the new source.
	 * <p>
	 * There isn't a definitive rule for when noop updates aren't acceptable. It's a
	 * combination of lots of factors like how frequently your data source sends
	 * updates that are actually noops and how many queries per second Elasticsearch
	 * runs on the shard receiving the updates.
	 * <p>
	 * <strong>Versioning</strong>
	 * <p>
	 * Each indexed document is given a version number. By default, internal
	 * versioning is used that starts at 1 and increments with each update, deletes
	 * included. Optionally, the version number can be set to an external value (for
	 * example, if maintained in a database). To enable this functionality,
	 * <code>version_type</code> should be set to <code>external</code>. The value
	 * provided must be a numeric, long value greater than or equal to 0, and less
	 * than around <code>9.2e+18</code>.
	 * <p>
	 * NOTE: Versioning is completely real time, and is not affected by the near
	 * real time aspects of search operations. If no version is provided, the
	 * operation runs without any version checks.
	 * <p>
	 * When using the external version type, the system checks to see if the version
	 * number passed to the index request is greater than the version of the
	 * currently stored document. If true, the document will be indexed and the new
	 * version number used. If the value provided is less than or equal to the
	 * stored document's version number, a version conflict will occur and the index
	 * operation will fail. For example:
	 * 
	 * <pre>
	 * <code>PUT my-index-000001/_doc/1?version=2&amp;version_type=external
	 * {
	 *   &quot;user&quot;: {
	 *     &quot;id&quot;: &quot;elkbee&quot;
	 *   }
	 * }
	 *
	 * In this example, the operation will succeed since the supplied version of 2 is higher than the current document version of 1.
	 * If the document was already updated and its version was set to 2 or higher, the indexing command will fail and result in a conflict (409 HTTP status code).
	 *
	 * A nice side effect is that there is no need to maintain strict ordering of async indexing operations run as a result of changes to a source database, as long as version numbers from the source database are used.
	 * Even the simple case of updating the Elasticsearch index using data from a database is simplified if external versioning is used, as only the latest version will be used if the index operations arrive out of order.
	 * </code>
	 * </pre>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-create">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> IndexResponse index(
			Function<IndexRequest.Builder<TDocument>, ObjectBuilder<IndexRequest<TDocument>>> fn)
			throws IOException, ElasticsearchException {
		return index(fn.apply(new IndexRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: info

	/**
	 * Get cluster info. Get basic build, version, and cluster information.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-info">Documentation
	 *      on elastic.co</a>
	 */
	public InfoResponse info() throws IOException, ElasticsearchException {
		return this.transport.performRequest(InfoRequest._INSTANCE, InfoRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: mget

	/**
	 * Get multiple documents.
	 * <p>
	 * Get multiple JSON documents by ID from one or more indices. If you specify an
	 * index in the request URI, you only need to specify the document IDs in the
	 * request body. To ensure fast responses, this multi get (mget) API responds
	 * with partial results if one or more shards fail.
	 * <p>
	 * <strong>Filter source fields</strong>
	 * <p>
	 * By default, the <code>_source</code> field is returned for every document (if
	 * stored). Use the <code>_source</code> and <code>_source_include</code> or
	 * <code>source_exclude</code> attributes to filter what fields are returned for
	 * a particular document. You can include the <code>_source</code>,
	 * <code>_source_includes</code>, and <code>_source_excludes</code> query
	 * parameters in the request URI to specify the defaults to use when there are
	 * no per-document instructions.
	 * <p>
	 * <strong>Get stored fields</strong>
	 * <p>
	 * Use the <code>stored_fields</code> attribute to specify the set of stored
	 * fields you want to retrieve. Any requested fields that are not stored are
	 * ignored. You can include the <code>stored_fields</code> query parameter in
	 * the request URI to specify the defaults to use when there are no per-document
	 * instructions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-mget">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MgetResponse<TDocument> mget(MgetRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse>) MgetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.mget.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get multiple documents.
	 * <p>
	 * Get multiple JSON documents by ID from one or more indices. If you specify an
	 * index in the request URI, you only need to specify the document IDs in the
	 * request body. To ensure fast responses, this multi get (mget) API responds
	 * with partial results if one or more shards fail.
	 * <p>
	 * <strong>Filter source fields</strong>
	 * <p>
	 * By default, the <code>_source</code> field is returned for every document (if
	 * stored). Use the <code>_source</code> and <code>_source_include</code> or
	 * <code>source_exclude</code> attributes to filter what fields are returned for
	 * a particular document. You can include the <code>_source</code>,
	 * <code>_source_includes</code>, and <code>_source_excludes</code> query
	 * parameters in the request URI to specify the defaults to use when there are
	 * no per-document instructions.
	 * <p>
	 * <strong>Get stored fields</strong>
	 * <p>
	 * Use the <code>stored_fields</code> attribute to specify the set of stored
	 * fields you want to retrieve. Any requested fields that are not stored are
	 * ignored. You can include the <code>stored_fields</code> query parameter in
	 * the request URI to specify the defaults to use when there are no per-document
	 * instructions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MgetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-mget">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MgetResponse<TDocument> mget(Function<MgetRequest.Builder, ObjectBuilder<MgetRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return mget(fn.apply(new MgetRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #mget(MgetRequest, Class)}, where Class is defined as
	 * Void, meaning the documents will not be deserialized.
	 */

	public MgetResponse<Void> mget(MgetRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MgetRequest, MgetResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<MgetRequest, MgetResponse<Void>, ErrorResponse>) MgetRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #mget(Function, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public final MgetResponse<Void> mget(Function<MgetRequest.Builder, ObjectBuilder<MgetRequest>> fn)
			throws IOException, ElasticsearchException {
		return mget(fn.apply(new MgetRequest.Builder()).build(), Void.class);
	}

	/**
	 * Get multiple documents.
	 * <p>
	 * Get multiple JSON documents by ID from one or more indices. If you specify an
	 * index in the request URI, you only need to specify the document IDs in the
	 * request body. To ensure fast responses, this multi get (mget) API responds
	 * with partial results if one or more shards fail.
	 * <p>
	 * <strong>Filter source fields</strong>
	 * <p>
	 * By default, the <code>_source</code> field is returned for every document (if
	 * stored). Use the <code>_source</code> and <code>_source_include</code> or
	 * <code>source_exclude</code> attributes to filter what fields are returned for
	 * a particular document. You can include the <code>_source</code>,
	 * <code>_source_includes</code>, and <code>_source_excludes</code> query
	 * parameters in the request URI to specify the defaults to use when there are
	 * no per-document instructions.
	 * <p>
	 * <strong>Get stored fields</strong>
	 * <p>
	 * Use the <code>stored_fields</code> attribute to specify the set of stored
	 * fields you want to retrieve. Any requested fields that are not stored are
	 * ignored. You can include the <code>stored_fields</code> query parameter in
	 * the request URI to specify the defaults to use when there are no per-document
	 * instructions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-mget">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MgetResponse<TDocument> mget(MgetRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse>) MgetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.mget.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get multiple documents.
	 * <p>
	 * Get multiple JSON documents by ID from one or more indices. If you specify an
	 * index in the request URI, you only need to specify the document IDs in the
	 * request body. To ensure fast responses, this multi get (mget) API responds
	 * with partial results if one or more shards fail.
	 * <p>
	 * <strong>Filter source fields</strong>
	 * <p>
	 * By default, the <code>_source</code> field is returned for every document (if
	 * stored). Use the <code>_source</code> and <code>_source_include</code> or
	 * <code>source_exclude</code> attributes to filter what fields are returned for
	 * a particular document. You can include the <code>_source</code>,
	 * <code>_source_includes</code>, and <code>_source_excludes</code> query
	 * parameters in the request URI to specify the defaults to use when there are
	 * no per-document instructions.
	 * <p>
	 * <strong>Get stored fields</strong>
	 * <p>
	 * Use the <code>stored_fields</code> attribute to specify the set of stored
	 * fields you want to retrieve. Any requested fields that are not stored are
	 * ignored. You can include the <code>stored_fields</code> query parameter in
	 * the request URI to specify the defaults to use when there are no per-document
	 * instructions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MgetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-mget">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MgetResponse<TDocument> mget(Function<MgetRequest.Builder, ObjectBuilder<MgetRequest>> fn,
			Type tDocumentType) throws IOException, ElasticsearchException {
		return mget(fn.apply(new MgetRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: msearch

	/**
	 * Run multiple searches.
	 * <p>
	 * The format of the request is similar to the bulk API format and makes use of
	 * the newline delimited JSON (NDJSON) format. The structure is as follows:
	 * 
	 * <pre>
	 * <code>header\n
	 * body\n
	 * header\n
	 * body\n
	 * </code>
	 * </pre>
	 * <p>
	 * This structure is specifically optimized to reduce parsing if a specific
	 * search ends up redirected to another node.
	 * <p>
	 * IMPORTANT: The final line of data must end with a newline character
	 * <code>\n</code>. Each newline character may be preceded by a carriage return
	 * <code>\r</code>. When sending requests to this endpoint the
	 * <code>Content-Type</code> header should be set to
	 * <code>application/x-ndjson</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-msearch">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MsearchResponse<TDocument> msearch(MsearchRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse>) MsearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run multiple searches.
	 * <p>
	 * The format of the request is similar to the bulk API format and makes use of
	 * the newline delimited JSON (NDJSON) format. The structure is as follows:
	 * 
	 * <pre>
	 * <code>header\n
	 * body\n
	 * header\n
	 * body\n
	 * </code>
	 * </pre>
	 * <p>
	 * This structure is specifically optimized to reduce parsing if a specific
	 * search ends up redirected to another node.
	 * <p>
	 * IMPORTANT: The final line of data must end with a newline character
	 * <code>\n</code>. Each newline character may be preceded by a carriage return
	 * <code>\r</code>. When sending requests to this endpoint the
	 * <code>Content-Type</code> header should be set to
	 * <code>application/x-ndjson</code>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MsearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-msearch">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MsearchResponse<TDocument> msearch(
			Function<MsearchRequest.Builder, ObjectBuilder<MsearchRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return msearch(fn.apply(new MsearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #msearch(MsearchRequest, Class)}, where Class is defined
	 * as Void, meaning the documents will not be deserialized.
	 */

	public MsearchResponse<Void> msearch(MsearchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchRequest, MsearchResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<MsearchRequest, MsearchResponse<Void>, ErrorResponse>) MsearchRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #msearch(Function, Class)}, where Class is defined as
	 * Void, meaning the documents will not be deserialized.
	 */

	public final MsearchResponse<Void> msearch(Function<MsearchRequest.Builder, ObjectBuilder<MsearchRequest>> fn)
			throws IOException, ElasticsearchException {
		return msearch(fn.apply(new MsearchRequest.Builder()).build(), Void.class);
	}

	/**
	 * Run multiple searches.
	 * <p>
	 * The format of the request is similar to the bulk API format and makes use of
	 * the newline delimited JSON (NDJSON) format. The structure is as follows:
	 * 
	 * <pre>
	 * <code>header\n
	 * body\n
	 * header\n
	 * body\n
	 * </code>
	 * </pre>
	 * <p>
	 * This structure is specifically optimized to reduce parsing if a specific
	 * search ends up redirected to another node.
	 * <p>
	 * IMPORTANT: The final line of data must end with a newline character
	 * <code>\n</code>. Each newline character may be preceded by a carriage return
	 * <code>\r</code>. When sending requests to this endpoint the
	 * <code>Content-Type</code> header should be set to
	 * <code>application/x-ndjson</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-msearch">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MsearchResponse<TDocument> msearch(MsearchRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse>) MsearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run multiple searches.
	 * <p>
	 * The format of the request is similar to the bulk API format and makes use of
	 * the newline delimited JSON (NDJSON) format. The structure is as follows:
	 * 
	 * <pre>
	 * <code>header\n
	 * body\n
	 * header\n
	 * body\n
	 * </code>
	 * </pre>
	 * <p>
	 * This structure is specifically optimized to reduce parsing if a specific
	 * search ends up redirected to another node.
	 * <p>
	 * IMPORTANT: The final line of data must end with a newline character
	 * <code>\n</code>. Each newline character may be preceded by a carriage return
	 * <code>\r</code>. When sending requests to this endpoint the
	 * <code>Content-Type</code> header should be set to
	 * <code>application/x-ndjson</code>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MsearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-msearch">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MsearchResponse<TDocument> msearch(
			Function<MsearchRequest.Builder, ObjectBuilder<MsearchRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return msearch(fn.apply(new MsearchRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: msearch_template

	/**
	 * Run multiple templated searches.
	 * <p>
	 * Run multiple templated searches with a single request. If you are providing a
	 * text file or text input to <code>curl</code>, use the
	 * <code>--data-binary</code> flag instead of <code>-d</code> to preserve
	 * newlines. For example:
	 * 
	 * <pre>
	 * <code>$ cat requests
	 * { &quot;index&quot;: &quot;my-index&quot; }
	 * { &quot;id&quot;: &quot;my-search-template&quot;, &quot;params&quot;: { &quot;query_string&quot;: &quot;hello world&quot;, &quot;from&quot;: 0, &quot;size&quot;: 10 }}
	 * { &quot;index&quot;: &quot;my-other-index&quot; }
	 * { &quot;id&quot;: &quot;my-other-search-template&quot;, &quot;params&quot;: { &quot;query_type&quot;: &quot;match_all&quot; }}
	 *
	 * $ curl -H &quot;Content-Type: application/x-ndjson&quot; -XGET localhost:9200/_msearch/template --data-binary &quot;@requests&quot;; echo
	 * </code>
	 * </pre>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-msearch-template">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(MsearchTemplateRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse>) MsearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch_template.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run multiple templated searches.
	 * <p>
	 * Run multiple templated searches with a single request. If you are providing a
	 * text file or text input to <code>curl</code>, use the
	 * <code>--data-binary</code> flag instead of <code>-d</code> to preserve
	 * newlines. For example:
	 * 
	 * <pre>
	 * <code>$ cat requests
	 * { &quot;index&quot;: &quot;my-index&quot; }
	 * { &quot;id&quot;: &quot;my-search-template&quot;, &quot;params&quot;: { &quot;query_string&quot;: &quot;hello world&quot;, &quot;from&quot;: 0, &quot;size&quot;: 10 }}
	 * { &quot;index&quot;: &quot;my-other-index&quot; }
	 * { &quot;id&quot;: &quot;my-other-search-template&quot;, &quot;params&quot;: { &quot;query_type&quot;: &quot;match_all&quot; }}
	 *
	 * $ curl -H &quot;Content-Type: application/x-ndjson&quot; -XGET localhost:9200/_msearch/template --data-binary &quot;@requests&quot;; echo
	 * </code>
	 * </pre>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MsearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-msearch-template">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(
			Function<MsearchTemplateRequest.Builder, ObjectBuilder<MsearchTemplateRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return msearchTemplate(fn.apply(new MsearchTemplateRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #msearchTemplate(MsearchTemplateRequest, Class)}, where
	 * Class is defined as Void, meaning the documents will not be deserialized.
	 */

	public MsearchTemplateResponse<Void> msearchTemplate(MsearchTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<Void>, ErrorResponse>) MsearchTemplateRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #msearchTemplate(Function, Class)}, where Class is defined
	 * as Void, meaning the documents will not be deserialized.
	 */

	public final MsearchTemplateResponse<Void> msearchTemplate(
			Function<MsearchTemplateRequest.Builder, ObjectBuilder<MsearchTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return msearchTemplate(fn.apply(new MsearchTemplateRequest.Builder()).build(), Void.class);
	}

	/**
	 * Run multiple templated searches.
	 * <p>
	 * Run multiple templated searches with a single request. If you are providing a
	 * text file or text input to <code>curl</code>, use the
	 * <code>--data-binary</code> flag instead of <code>-d</code> to preserve
	 * newlines. For example:
	 * 
	 * <pre>
	 * <code>$ cat requests
	 * { &quot;index&quot;: &quot;my-index&quot; }
	 * { &quot;id&quot;: &quot;my-search-template&quot;, &quot;params&quot;: { &quot;query_string&quot;: &quot;hello world&quot;, &quot;from&quot;: 0, &quot;size&quot;: 10 }}
	 * { &quot;index&quot;: &quot;my-other-index&quot; }
	 * { &quot;id&quot;: &quot;my-other-search-template&quot;, &quot;params&quot;: { &quot;query_type&quot;: &quot;match_all&quot; }}
	 *
	 * $ curl -H &quot;Content-Type: application/x-ndjson&quot; -XGET localhost:9200/_msearch/template --data-binary &quot;@requests&quot;; echo
	 * </code>
	 * </pre>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-msearch-template">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(MsearchTemplateRequest request,
			Type tDocumentType) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse>) MsearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch_template.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run multiple templated searches.
	 * <p>
	 * Run multiple templated searches with a single request. If you are providing a
	 * text file or text input to <code>curl</code>, use the
	 * <code>--data-binary</code> flag instead of <code>-d</code> to preserve
	 * newlines. For example:
	 * 
	 * <pre>
	 * <code>$ cat requests
	 * { &quot;index&quot;: &quot;my-index&quot; }
	 * { &quot;id&quot;: &quot;my-search-template&quot;, &quot;params&quot;: { &quot;query_string&quot;: &quot;hello world&quot;, &quot;from&quot;: 0, &quot;size&quot;: 10 }}
	 * { &quot;index&quot;: &quot;my-other-index&quot; }
	 * { &quot;id&quot;: &quot;my-other-search-template&quot;, &quot;params&quot;: { &quot;query_type&quot;: &quot;match_all&quot; }}
	 *
	 * $ curl -H &quot;Content-Type: application/x-ndjson&quot; -XGET localhost:9200/_msearch/template --data-binary &quot;@requests&quot;; echo
	 * </code>
	 * </pre>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MsearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-msearch-template">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(
			Function<MsearchTemplateRequest.Builder, ObjectBuilder<MsearchTemplateRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return msearchTemplate(fn.apply(new MsearchTemplateRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: mtermvectors

	/**
	 * Get multiple term vectors.
	 * <p>
	 * Get multiple term vectors with a single request. You can specify existing
	 * documents by index and ID or provide artificial documents in the body of the
	 * request. You can specify the index in the request body or request URI. The
	 * response contains a <code>docs</code> array with all the fetched termvectors.
	 * Each element has the structure provided by the termvectors API.
	 * <p>
	 * <strong>Artificial documents</strong>
	 * <p>
	 * You can also use <code>mtermvectors</code> to generate term vectors for
	 * artificial documents provided in the body of the request. The mapping used is
	 * determined by the specified <code>_index</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-mtermvectors">Documentation
	 *      on elastic.co</a>
	 */

	public MtermvectorsResponse mtermvectors(MtermvectorsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MtermvectorsRequest, MtermvectorsResponse, ErrorResponse> endpoint = (JsonEndpoint<MtermvectorsRequest, MtermvectorsResponse, ErrorResponse>) MtermvectorsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get multiple term vectors.
	 * <p>
	 * Get multiple term vectors with a single request. You can specify existing
	 * documents by index and ID or provide artificial documents in the body of the
	 * request. You can specify the index in the request body or request URI. The
	 * response contains a <code>docs</code> array with all the fetched termvectors.
	 * Each element has the structure provided by the termvectors API.
	 * <p>
	 * <strong>Artificial documents</strong>
	 * <p>
	 * You can also use <code>mtermvectors</code> to generate term vectors for
	 * artificial documents provided in the body of the request. The mapping used is
	 * determined by the specified <code>_index</code>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MtermvectorsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-mtermvectors">Documentation
	 *      on elastic.co</a>
	 */

	public final MtermvectorsResponse mtermvectors(
			Function<MtermvectorsRequest.Builder, ObjectBuilder<MtermvectorsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mtermvectors(fn.apply(new MtermvectorsRequest.Builder()).build());
	}

	/**
	 * Get multiple term vectors.
	 * <p>
	 * Get multiple term vectors with a single request. You can specify existing
	 * documents by index and ID or provide artificial documents in the body of the
	 * request. You can specify the index in the request body or request URI. The
	 * response contains a <code>docs</code> array with all the fetched termvectors.
	 * Each element has the structure provided by the termvectors API.
	 * <p>
	 * <strong>Artificial documents</strong>
	 * <p>
	 * You can also use <code>mtermvectors</code> to generate term vectors for
	 * artificial documents provided in the body of the request. The mapping used is
	 * determined by the specified <code>_index</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-mtermvectors">Documentation
	 *      on elastic.co</a>
	 */

	public MtermvectorsResponse mtermvectors() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MtermvectorsRequest.Builder().build(), MtermvectorsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: open_point_in_time

	/**
	 * Open a point in time.
	 * <p>
	 * A search request by default runs against the most recent visible data of the
	 * target indices, which is called point in time. Elasticsearch pit (point in
	 * time) is a lightweight view into the state of the data as it existed when
	 * initiated. In some cases, it’s preferred to perform multiple search requests
	 * using the same point in time. For example, if refreshes happen between
	 * <code>search_after</code> requests, then the results of those requests might
	 * not be consistent as changes happening between searches are only visible to
	 * the more recent point in time.
	 * <p>
	 * A point in time must be opened explicitly before being used in search
	 * requests.
	 * <p>
	 * A subsequent search request with the <code>pit</code> parameter must not
	 * specify <code>index</code>, <code>routing</code>, or <code>preference</code>
	 * values as these parameters are copied from the point in time.
	 * <p>
	 * Just like regular searches, you can use <code>from</code> and
	 * <code>size</code> to page through point in time search results, up to the
	 * first 10,000 hits. If you want to retrieve more hits, use PIT with
	 * <code>search_after</code>.
	 * <p>
	 * IMPORTANT: The open point in time request and each subsequent search request
	 * can return different identifiers; always use the most recently received ID
	 * for the next search request.
	 * <p>
	 * When a PIT that contains shard failures is used in a search request, the
	 * missing are always reported in the search response as a
	 * <code>NoShardAvailableActionException</code> exception. To get rid of these
	 * exceptions, a new PIT needs to be created so that shards missing from the
	 * previous PIT can be handled, assuming they become available in the meantime.
	 * <p>
	 * <strong>Keeping point in time alive</strong>
	 * <p>
	 * The <code>keep_alive</code> parameter, which is passed to a open point in
	 * time request and search request, extends the time to live of the
	 * corresponding point in time. The value does not need to be long enough to
	 * process all data — it just needs to be long enough for the next request.
	 * <p>
	 * Normally, the background merge process optimizes the index by merging
	 * together smaller segments to create new, bigger segments. Once the smaller
	 * segments are no longer needed they are deleted. However, open point-in-times
	 * prevent the old segments from being deleted since they are still in use.
	 * <p>
	 * TIP: Keeping older segments alive means that more disk space and file handles
	 * are needed. Ensure that you have configured your nodes to have ample free
	 * file handles.
	 * <p>
	 * Additionally, if a segment contains deleted or updated documents then the
	 * point in time must keep track of whether each document in the segment was
	 * live at the time of the initial search request. Ensure that your nodes have
	 * sufficient heap space if you have many open point-in-times on an index that
	 * is subject to ongoing deletes or updates. Note that a point-in-time doesn't
	 * prevent its associated indices from being deleted. You can check how many
	 * point-in-times (that is, search contexts) are open with the nodes stats API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-open-point-in-time">Documentation
	 *      on elastic.co</a>
	 */

	public OpenPointInTimeResponse openPointInTime(OpenPointInTimeRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse> endpoint = (JsonEndpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse>) OpenPointInTimeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Open a point in time.
	 * <p>
	 * A search request by default runs against the most recent visible data of the
	 * target indices, which is called point in time. Elasticsearch pit (point in
	 * time) is a lightweight view into the state of the data as it existed when
	 * initiated. In some cases, it’s preferred to perform multiple search requests
	 * using the same point in time. For example, if refreshes happen between
	 * <code>search_after</code> requests, then the results of those requests might
	 * not be consistent as changes happening between searches are only visible to
	 * the more recent point in time.
	 * <p>
	 * A point in time must be opened explicitly before being used in search
	 * requests.
	 * <p>
	 * A subsequent search request with the <code>pit</code> parameter must not
	 * specify <code>index</code>, <code>routing</code>, or <code>preference</code>
	 * values as these parameters are copied from the point in time.
	 * <p>
	 * Just like regular searches, you can use <code>from</code> and
	 * <code>size</code> to page through point in time search results, up to the
	 * first 10,000 hits. If you want to retrieve more hits, use PIT with
	 * <code>search_after</code>.
	 * <p>
	 * IMPORTANT: The open point in time request and each subsequent search request
	 * can return different identifiers; always use the most recently received ID
	 * for the next search request.
	 * <p>
	 * When a PIT that contains shard failures is used in a search request, the
	 * missing are always reported in the search response as a
	 * <code>NoShardAvailableActionException</code> exception. To get rid of these
	 * exceptions, a new PIT needs to be created so that shards missing from the
	 * previous PIT can be handled, assuming they become available in the meantime.
	 * <p>
	 * <strong>Keeping point in time alive</strong>
	 * <p>
	 * The <code>keep_alive</code> parameter, which is passed to a open point in
	 * time request and search request, extends the time to live of the
	 * corresponding point in time. The value does not need to be long enough to
	 * process all data — it just needs to be long enough for the next request.
	 * <p>
	 * Normally, the background merge process optimizes the index by merging
	 * together smaller segments to create new, bigger segments. Once the smaller
	 * segments are no longer needed they are deleted. However, open point-in-times
	 * prevent the old segments from being deleted since they are still in use.
	 * <p>
	 * TIP: Keeping older segments alive means that more disk space and file handles
	 * are needed. Ensure that you have configured your nodes to have ample free
	 * file handles.
	 * <p>
	 * Additionally, if a segment contains deleted or updated documents then the
	 * point in time must keep track of whether each document in the segment was
	 * live at the time of the initial search request. Ensure that your nodes have
	 * sufficient heap space if you have many open point-in-times on an index that
	 * is subject to ongoing deletes or updates. Note that a point-in-time doesn't
	 * prevent its associated indices from being deleted. You can check how many
	 * point-in-times (that is, search contexts) are open with the nodes stats API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OpenPointInTimeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-open-point-in-time">Documentation
	 *      on elastic.co</a>
	 */

	public final OpenPointInTimeResponse openPointInTime(
			Function<OpenPointInTimeRequest.Builder, ObjectBuilder<OpenPointInTimeRequest>> fn)
			throws IOException, ElasticsearchException {
		return openPointInTime(fn.apply(new OpenPointInTimeRequest.Builder()).build());
	}

	// ----- Endpoint: ping

	/**
	 * Ping the cluster. Get information about whether the cluster is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-cluster">Documentation
	 *      on elastic.co</a>
	 */
	public BooleanResponse ping() throws IOException, ElasticsearchException {
		return this.transport.performRequest(PingRequest._INSTANCE, PingRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: put_script

	/**
	 * Create or update a script or search template. Creates or updates a stored
	 * script or search template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-put-script">Documentation
	 *      on elastic.co</a>
	 */

	public PutScriptResponse putScript(PutScriptRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutScriptRequest, PutScriptResponse, ErrorResponse> endpoint = (JsonEndpoint<PutScriptRequest, PutScriptResponse, ErrorResponse>) PutScriptRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a script or search template. Creates or updates a stored
	 * script or search template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-put-script">Documentation
	 *      on elastic.co</a>
	 */

	public final PutScriptResponse putScript(Function<PutScriptRequest.Builder, ObjectBuilder<PutScriptRequest>> fn)
			throws IOException, ElasticsearchException {
		return putScript(fn.apply(new PutScriptRequest.Builder()).build());
	}

	// ----- Endpoint: rank_eval

	/**
	 * Evaluate ranked search results.
	 * <p>
	 * Evaluate the quality of ranked search results over a set of typical search
	 * queries.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-rank-eval">Documentation
	 *      on elastic.co</a>
	 */

	public RankEvalResponse rankEval(RankEvalRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RankEvalRequest, RankEvalResponse, ErrorResponse> endpoint = (JsonEndpoint<RankEvalRequest, RankEvalResponse, ErrorResponse>) RankEvalRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Evaluate ranked search results.
	 * <p>
	 * Evaluate the quality of ranked search results over a set of typical search
	 * queries.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RankEvalRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-rank-eval">Documentation
	 *      on elastic.co</a>
	 */

	public final RankEvalResponse rankEval(Function<RankEvalRequest.Builder, ObjectBuilder<RankEvalRequest>> fn)
			throws IOException, ElasticsearchException {
		return rankEval(fn.apply(new RankEvalRequest.Builder()).build());
	}

	// ----- Endpoint: reindex

	/**
	 * Reindex documents.
	 * <p>
	 * Copy documents from a source to a destination. You can copy all documents to
	 * the destination index or reindex a subset of the documents. The source can be
	 * any existing index, alias, or data stream. The destination must differ from
	 * the source. For example, you cannot reindex a data stream into itself.
	 * <p>
	 * IMPORTANT: Reindex requires <code>_source</code> to be enabled for all
	 * documents in the source. The destination should be configured as wanted
	 * before calling the reindex API. Reindex does not copy the settings from the
	 * source or its associated template. Mappings, shard counts, and replicas, for
	 * example, must be configured ahead of time.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following security privileges:
	 * <ul>
	 * <li>The <code>read</code> index privilege for the source data stream, index,
	 * or alias.</li>
	 * <li>The <code>write</code> index privilege for the destination data stream,
	 * index, or index alias.</li>
	 * <li>To automatically create a data stream or index with a reindex API
	 * request, you must have the <code>auto_configure</code>,
	 * <code>create_index</code>, or <code>manage</code> index privilege for the
	 * destination data stream, index, or alias.</li>
	 * <li>If reindexing from a remote cluster, the <code>source.remote.user</code>
	 * must have the <code>monitor</code> cluster privilege and the
	 * <code>read</code> index privilege for the source data stream, index, or
	 * alias.</li>
	 * </ul>
	 * <p>
	 * If reindexing from a remote cluster, you must explicitly allow the remote
	 * host in the <code>reindex.remote.whitelist</code> setting. Automatic data
	 * stream creation requires a matching index template with data stream enabled.
	 * <p>
	 * The <code>dest</code> element can be configured like the index API to control
	 * optimistic concurrency control. Omitting <code>version_type</code> or setting
	 * it to <code>internal</code> causes Elasticsearch to blindly dump documents
	 * into the destination, overwriting any that happen to have the same ID.
	 * <p>
	 * Setting <code>version_type</code> to <code>external</code> causes
	 * Elasticsearch to preserve the <code>version</code> from the source, create
	 * any documents that are missing, and update any documents that have an older
	 * version in the destination than they do in the source.
	 * <p>
	 * Setting <code>op_type</code> to <code>create</code> causes the reindex API to
	 * create only missing documents in the destination. All existing documents will
	 * cause a version conflict.
	 * <p>
	 * IMPORTANT: Because data streams are append-only, any reindex request to a
	 * destination data stream must have an <code>op_type</code> of
	 * <code>create</code>. A reindex can only add new documents to a destination
	 * data stream. It cannot update existing documents in a destination data
	 * stream.
	 * <p>
	 * By default, version conflicts abort the reindex process. To continue
	 * reindexing if there are conflicts, set the <code>conflicts</code> request
	 * body property to <code>proceed</code>. In this case, the response includes a
	 * count of the version conflicts that were encountered. Note that the handling
	 * of other error types is unaffected by the <code>conflicts</code> property.
	 * Additionally, if you opt to count version conflicts, the operation could
	 * attempt to reindex more documents from the source than <code>max_docs</code>
	 * until it has successfully indexed <code>max_docs</code> documents into the
	 * target or it has gone through every document in the source query.
	 * <p>
	 * Refer to the linked documentation for examples of how to reindex documents.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-reindex">Documentation
	 *      on elastic.co</a>
	 */

	public ReindexResponse reindex(ReindexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ReindexRequest, ReindexResponse, ErrorResponse> endpoint = (JsonEndpoint<ReindexRequest, ReindexResponse, ErrorResponse>) ReindexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Reindex documents.
	 * <p>
	 * Copy documents from a source to a destination. You can copy all documents to
	 * the destination index or reindex a subset of the documents. The source can be
	 * any existing index, alias, or data stream. The destination must differ from
	 * the source. For example, you cannot reindex a data stream into itself.
	 * <p>
	 * IMPORTANT: Reindex requires <code>_source</code> to be enabled for all
	 * documents in the source. The destination should be configured as wanted
	 * before calling the reindex API. Reindex does not copy the settings from the
	 * source or its associated template. Mappings, shard counts, and replicas, for
	 * example, must be configured ahead of time.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following security privileges:
	 * <ul>
	 * <li>The <code>read</code> index privilege for the source data stream, index,
	 * or alias.</li>
	 * <li>The <code>write</code> index privilege for the destination data stream,
	 * index, or index alias.</li>
	 * <li>To automatically create a data stream or index with a reindex API
	 * request, you must have the <code>auto_configure</code>,
	 * <code>create_index</code>, or <code>manage</code> index privilege for the
	 * destination data stream, index, or alias.</li>
	 * <li>If reindexing from a remote cluster, the <code>source.remote.user</code>
	 * must have the <code>monitor</code> cluster privilege and the
	 * <code>read</code> index privilege for the source data stream, index, or
	 * alias.</li>
	 * </ul>
	 * <p>
	 * If reindexing from a remote cluster, you must explicitly allow the remote
	 * host in the <code>reindex.remote.whitelist</code> setting. Automatic data
	 * stream creation requires a matching index template with data stream enabled.
	 * <p>
	 * The <code>dest</code> element can be configured like the index API to control
	 * optimistic concurrency control. Omitting <code>version_type</code> or setting
	 * it to <code>internal</code> causes Elasticsearch to blindly dump documents
	 * into the destination, overwriting any that happen to have the same ID.
	 * <p>
	 * Setting <code>version_type</code> to <code>external</code> causes
	 * Elasticsearch to preserve the <code>version</code> from the source, create
	 * any documents that are missing, and update any documents that have an older
	 * version in the destination than they do in the source.
	 * <p>
	 * Setting <code>op_type</code> to <code>create</code> causes the reindex API to
	 * create only missing documents in the destination. All existing documents will
	 * cause a version conflict.
	 * <p>
	 * IMPORTANT: Because data streams are append-only, any reindex request to a
	 * destination data stream must have an <code>op_type</code> of
	 * <code>create</code>. A reindex can only add new documents to a destination
	 * data stream. It cannot update existing documents in a destination data
	 * stream.
	 * <p>
	 * By default, version conflicts abort the reindex process. To continue
	 * reindexing if there are conflicts, set the <code>conflicts</code> request
	 * body property to <code>proceed</code>. In this case, the response includes a
	 * count of the version conflicts that were encountered. Note that the handling
	 * of other error types is unaffected by the <code>conflicts</code> property.
	 * Additionally, if you opt to count version conflicts, the operation could
	 * attempt to reindex more documents from the source than <code>max_docs</code>
	 * until it has successfully indexed <code>max_docs</code> documents into the
	 * target or it has gone through every document in the source query.
	 * <p>
	 * Refer to the linked documentation for examples of how to reindex documents.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReindexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-reindex">Documentation
	 *      on elastic.co</a>
	 */

	public final ReindexResponse reindex(Function<ReindexRequest.Builder, ObjectBuilder<ReindexRequest>> fn)
			throws IOException, ElasticsearchException {
		return reindex(fn.apply(new ReindexRequest.Builder()).build());
	}

	// ----- Endpoint: reindex_rethrottle

	/**
	 * Throttle a reindex operation.
	 * <p>
	 * Change the number of requests per second for a particular reindex operation.
	 * For example:
	 * 
	 * <pre>
	 * <code>POST _reindex/r1A2WoRbTwKZ516z6NEs5A:36619/_rethrottle?requests_per_second=-1
	 * </code>
	 * </pre>
	 * <p>
	 * Rethrottling that speeds up the query takes effect immediately. Rethrottling
	 * that slows down the query will take effect after completing the current
	 * batch. This behavior prevents scroll timeouts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-reindex">Documentation
	 *      on elastic.co</a>
	 */

	public ReindexRethrottleResponse reindexRethrottle(ReindexRethrottleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ReindexRethrottleRequest, ReindexRethrottleResponse, ErrorResponse> endpoint = (JsonEndpoint<ReindexRethrottleRequest, ReindexRethrottleResponse, ErrorResponse>) ReindexRethrottleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Throttle a reindex operation.
	 * <p>
	 * Change the number of requests per second for a particular reindex operation.
	 * For example:
	 * 
	 * <pre>
	 * <code>POST _reindex/r1A2WoRbTwKZ516z6NEs5A:36619/_rethrottle?requests_per_second=-1
	 * </code>
	 * </pre>
	 * <p>
	 * Rethrottling that speeds up the query takes effect immediately. Rethrottling
	 * that slows down the query will take effect after completing the current
	 * batch. This behavior prevents scroll timeouts.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReindexRethrottleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-reindex">Documentation
	 *      on elastic.co</a>
	 */

	public final ReindexRethrottleResponse reindexRethrottle(
			Function<ReindexRethrottleRequest.Builder, ObjectBuilder<ReindexRethrottleRequest>> fn)
			throws IOException, ElasticsearchException {
		return reindexRethrottle(fn.apply(new ReindexRethrottleRequest.Builder()).build());
	}

	// ----- Endpoint: render_search_template

	/**
	 * Render a search template.
	 * <p>
	 * Render a search template as a search request body.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-render-search-template">Documentation
	 *      on elastic.co</a>
	 */

	public RenderSearchTemplateResponse renderSearchTemplate(RenderSearchTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RenderSearchTemplateRequest, RenderSearchTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<RenderSearchTemplateRequest, RenderSearchTemplateResponse, ErrorResponse>) RenderSearchTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Render a search template.
	 * <p>
	 * Render a search template as a search request body.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RenderSearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-render-search-template">Documentation
	 *      on elastic.co</a>
	 */

	public final RenderSearchTemplateResponse renderSearchTemplate(
			Function<RenderSearchTemplateRequest.Builder, ObjectBuilder<RenderSearchTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return renderSearchTemplate(fn.apply(new RenderSearchTemplateRequest.Builder()).build());
	}

	/**
	 * Render a search template.
	 * <p>
	 * Render a search template as a search request body.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-render-search-template">Documentation
	 *      on elastic.co</a>
	 */

	public RenderSearchTemplateResponse renderSearchTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new RenderSearchTemplateRequest.Builder().build(),
				RenderSearchTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: scripts_painless_execute

	/**
	 * Run a script.
	 * <p>
	 * Runs a script and returns a result. Use this API to build and test scripts,
	 * such as when defining a script for a runtime field. This API requires very
	 * few dependencies and is especially useful if you don't have permissions to
	 * write documents on a cluster.
	 * <p>
	 * The API uses several <em>contexts</em>, which control how scripts are run,
	 * what variables are available at runtime, and what the return type is.
	 * <p>
	 * Each context requires a script, but additional parameters depend on the
	 * context you're using for that script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/reference/scripting-languages/painless/painless-api-examples">Documentation
	 *      on elastic.co</a>
	 */

	public <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
			ScriptsPainlessExecuteRequest request, Class<TResult> tResultClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse> endpoint = (JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse>) ScriptsPainlessExecuteRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scripts_painless_execute.Response.TResult",
				getDeserializer(tResultClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a script.
	 * <p>
	 * Runs a script and returns a result. Use this API to build and test scripts,
	 * such as when defining a script for a runtime field. This API requires very
	 * few dependencies and is especially useful if you don't have permissions to
	 * write documents on a cluster.
	 * <p>
	 * The API uses several <em>contexts</em>, which control how scripts are run,
	 * what variables are available at runtime, and what the return type is.
	 * <p>
	 * Each context requires a script, but additional parameters depend on the
	 * context you're using for that script.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScriptsPainlessExecuteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/reference/scripting-languages/painless/painless-api-examples">Documentation
	 *      on elastic.co</a>
	 */

	public final <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
			Function<ScriptsPainlessExecuteRequest.Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn,
			Class<TResult> tResultClass) throws IOException, ElasticsearchException {
		return scriptsPainlessExecute(fn.apply(new ScriptsPainlessExecuteRequest.Builder()).build(), tResultClass);
	}

	/**
	 * Overload of
	 * {@link #scriptsPainlessExecute(ScriptsPainlessExecuteRequest, Class)}, where
	 * Class is defined as Void, meaning the documents will not be deserialized.
	 */

	public ScriptsPainlessExecuteResponse<Void> scriptsPainlessExecute(ScriptsPainlessExecuteRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<Void>, ErrorResponse>) ScriptsPainlessExecuteRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #scriptsPainlessExecute(Function, Class)}, where Class is
	 * defined as Void, meaning the documents will not be deserialized.
	 */

	public final ScriptsPainlessExecuteResponse<Void> scriptsPainlessExecute(
			Function<ScriptsPainlessExecuteRequest.Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn)
			throws IOException, ElasticsearchException {
		return scriptsPainlessExecute(fn.apply(new ScriptsPainlessExecuteRequest.Builder()).build(), Void.class);
	}

	/**
	 * Run a script.
	 * <p>
	 * Runs a script and returns a result. Use this API to build and test scripts,
	 * such as when defining a script for a runtime field. This API requires very
	 * few dependencies and is especially useful if you don't have permissions to
	 * write documents on a cluster.
	 * <p>
	 * The API uses several <em>contexts</em>, which control how scripts are run,
	 * what variables are available at runtime, and what the return type is.
	 * <p>
	 * Each context requires a script, but additional parameters depend on the
	 * context you're using for that script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/reference/scripting-languages/painless/painless-api-examples">Documentation
	 *      on elastic.co</a>
	 */

	public <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
			ScriptsPainlessExecuteRequest request, Type tResultType) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse> endpoint = (JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse>) ScriptsPainlessExecuteRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scripts_painless_execute.Response.TResult",
				getDeserializer(tResultType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a script.
	 * <p>
	 * Runs a script and returns a result. Use this API to build and test scripts,
	 * such as when defining a script for a runtime field. This API requires very
	 * few dependencies and is especially useful if you don't have permissions to
	 * write documents on a cluster.
	 * <p>
	 * The API uses several <em>contexts</em>, which control how scripts are run,
	 * what variables are available at runtime, and what the return type is.
	 * <p>
	 * Each context requires a script, but additional parameters depend on the
	 * context you're using for that script.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScriptsPainlessExecuteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/reference/scripting-languages/painless/painless-api-examples">Documentation
	 *      on elastic.co</a>
	 */

	public final <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
			Function<ScriptsPainlessExecuteRequest.Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn,
			Type tResultType) throws IOException, ElasticsearchException {
		return scriptsPainlessExecute(fn.apply(new ScriptsPainlessExecuteRequest.Builder()).build(), tResultType);
	}

	// ----- Endpoint: scroll

	/**
	 * Run a scrolling search.
	 * <p>
	 * IMPORTANT: The scroll API is no longer recommend for deep pagination. If you
	 * need to preserve the index state while paging through more than 10,000 hits,
	 * use the <code>search_after</code> parameter with a point in time (PIT).
	 * <p>
	 * The scroll API gets large sets of results from a single scrolling search
	 * request. To get the necessary scroll ID, submit a search API request that
	 * includes an argument for the <code>scroll</code> query parameter. The
	 * <code>scroll</code> parameter indicates how long Elasticsearch should retain
	 * the search context for the request. The search response returns a scroll ID
	 * in the <code>_scroll_id</code> response body parameter. You can then use the
	 * scroll ID with the scroll API to retrieve the next batch of results for the
	 * request. If the Elasticsearch security features are enabled, the access to
	 * the results of a specific scroll ID is restricted to the user or API key that
	 * submitted the search.
	 * <p>
	 * You can also use the scroll API to specify a new scroll parameter that
	 * extends or shortens the retention period for the search context.
	 * <p>
	 * IMPORTANT: Results from a scrolling search reflect the state of the index at
	 * the time of the initial search request. Subsequent indexing or document
	 * changes only affect later search and scroll requests.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> ScrollResponse<TDocument> scroll(ScrollRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse>) ScrollRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scroll.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a scrolling search.
	 * <p>
	 * IMPORTANT: The scroll API is no longer recommend for deep pagination. If you
	 * need to preserve the index state while paging through more than 10,000 hits,
	 * use the <code>search_after</code> parameter with a point in time (PIT).
	 * <p>
	 * The scroll API gets large sets of results from a single scrolling search
	 * request. To get the necessary scroll ID, submit a search API request that
	 * includes an argument for the <code>scroll</code> query parameter. The
	 * <code>scroll</code> parameter indicates how long Elasticsearch should retain
	 * the search context for the request. The search response returns a scroll ID
	 * in the <code>_scroll_id</code> response body parameter. You can then use the
	 * scroll ID with the scroll API to retrieve the next batch of results for the
	 * request. If the Elasticsearch security features are enabled, the access to
	 * the results of a specific scroll ID is restricted to the user or API key that
	 * submitted the search.
	 * <p>
	 * You can also use the scroll API to specify a new scroll parameter that
	 * extends or shortens the retention period for the search context.
	 * <p>
	 * IMPORTANT: Results from a scrolling search reflect the state of the index at
	 * the time of the initial search request. Subsequent indexing or document
	 * changes only affect later search and scroll requests.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScrollRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> ScrollResponse<TDocument> scroll(
			Function<ScrollRequest.Builder, ObjectBuilder<ScrollRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return scroll(fn.apply(new ScrollRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #scroll(ScrollRequest, Class)}, where Class is defined as
	 * Void, meaning the documents will not be deserialized.
	 */

	public ScrollResponse<Void> scroll(ScrollRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScrollRequest, ScrollResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<ScrollRequest, ScrollResponse<Void>, ErrorResponse>) ScrollRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #scroll(Function, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public final ScrollResponse<Void> scroll(Function<ScrollRequest.Builder, ObjectBuilder<ScrollRequest>> fn)
			throws IOException, ElasticsearchException {
		return scroll(fn.apply(new ScrollRequest.Builder()).build(), Void.class);
	}

	/**
	 * Run a scrolling search.
	 * <p>
	 * IMPORTANT: The scroll API is no longer recommend for deep pagination. If you
	 * need to preserve the index state while paging through more than 10,000 hits,
	 * use the <code>search_after</code> parameter with a point in time (PIT).
	 * <p>
	 * The scroll API gets large sets of results from a single scrolling search
	 * request. To get the necessary scroll ID, submit a search API request that
	 * includes an argument for the <code>scroll</code> query parameter. The
	 * <code>scroll</code> parameter indicates how long Elasticsearch should retain
	 * the search context for the request. The search response returns a scroll ID
	 * in the <code>_scroll_id</code> response body parameter. You can then use the
	 * scroll ID with the scroll API to retrieve the next batch of results for the
	 * request. If the Elasticsearch security features are enabled, the access to
	 * the results of a specific scroll ID is restricted to the user or API key that
	 * submitted the search.
	 * <p>
	 * You can also use the scroll API to specify a new scroll parameter that
	 * extends or shortens the retention period for the search context.
	 * <p>
	 * IMPORTANT: Results from a scrolling search reflect the state of the index at
	 * the time of the initial search request. Subsequent indexing or document
	 * changes only affect later search and scroll requests.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> ScrollResponse<TDocument> scroll(ScrollRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse>) ScrollRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scroll.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a scrolling search.
	 * <p>
	 * IMPORTANT: The scroll API is no longer recommend for deep pagination. If you
	 * need to preserve the index state while paging through more than 10,000 hits,
	 * use the <code>search_after</code> parameter with a point in time (PIT).
	 * <p>
	 * The scroll API gets large sets of results from a single scrolling search
	 * request. To get the necessary scroll ID, submit a search API request that
	 * includes an argument for the <code>scroll</code> query parameter. The
	 * <code>scroll</code> parameter indicates how long Elasticsearch should retain
	 * the search context for the request. The search response returns a scroll ID
	 * in the <code>_scroll_id</code> response body parameter. You can then use the
	 * scroll ID with the scroll API to retrieve the next batch of results for the
	 * request. If the Elasticsearch security features are enabled, the access to
	 * the results of a specific scroll ID is restricted to the user or API key that
	 * submitted the search.
	 * <p>
	 * You can also use the scroll API to specify a new scroll parameter that
	 * extends or shortens the retention period for the search context.
	 * <p>
	 * IMPORTANT: Results from a scrolling search reflect the state of the index at
	 * the time of the initial search request. Subsequent indexing or document
	 * changes only affect later search and scroll requests.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScrollRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> ScrollResponse<TDocument> scroll(
			Function<ScrollRequest.Builder, ObjectBuilder<ScrollRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return scroll(fn.apply(new ScrollRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: search

	/**
	 * Run a search.
	 * <p>
	 * Get search hits that match the query defined in the request. You can provide
	 * search queries using the <code>q</code> query string parameter or the request
	 * body. If both are specified, only the query parameter is used.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the read
	 * index privilege for the target data stream, index, or alias. For
	 * cross-cluster search, refer to the documentation about configuring CCS
	 * privileges. To search a point in time (PIT) for an alias, you must have the
	 * <code>read</code> index privilege for the alias's data streams or indices.
	 * <p>
	 * <strong>Search slicing</strong>
	 * <p>
	 * When paging through a large number of documents, it can be helpful to split
	 * the search into multiple slices to consume them independently with the
	 * <code>slice</code> and <code>pit</code> properties. By default the splitting
	 * is done first on the shards, then locally on each shard. The local splitting
	 * partitions the shard into contiguous ranges based on Lucene document IDs.
	 * <p>
	 * For instance if the number of shards is equal to 2 and you request 4 slices,
	 * the slices 0 and 2 are assigned to the first shard and the slices 1 and 3 are
	 * assigned to the second shard.
	 * <p>
	 * IMPORTANT: The same point-in-time ID should be used for all slices. If
	 * different PIT IDs are used, slices can overlap and miss documents. This
	 * situation can occur because the splitting criterion is based on Lucene
	 * document IDs, which are not stable across changes to the index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchResponse<TDocument> search(SearchRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse>) SearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a search.
	 * <p>
	 * Get search hits that match the query defined in the request. You can provide
	 * search queries using the <code>q</code> query string parameter or the request
	 * body. If both are specified, only the query parameter is used.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the read
	 * index privilege for the target data stream, index, or alias. For
	 * cross-cluster search, refer to the documentation about configuring CCS
	 * privileges. To search a point in time (PIT) for an alias, you must have the
	 * <code>read</code> index privilege for the alias's data streams or indices.
	 * <p>
	 * <strong>Search slicing</strong>
	 * <p>
	 * When paging through a large number of documents, it can be helpful to split
	 * the search into multiple slices to consume them independently with the
	 * <code>slice</code> and <code>pit</code> properties. By default the splitting
	 * is done first on the shards, then locally on each shard. The local splitting
	 * partitions the shard into contiguous ranges based on Lucene document IDs.
	 * <p>
	 * For instance if the number of shards is equal to 2 and you request 4 slices,
	 * the slices 0 and 2 are assigned to the first shard and the slices 1 and 3 are
	 * assigned to the second shard.
	 * <p>
	 * IMPORTANT: The same point-in-time ID should be used for all slices. If
	 * different PIT IDs are used, slices can overlap and miss documents. This
	 * situation can occur because the splitting criterion is based on Lucene
	 * document IDs, which are not stable across changes to the index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchResponse<TDocument> search(
			Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return search(fn.apply(new SearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #search(SearchRequest, Class)}, where Class is defined as
	 * Void, meaning the documents will not be deserialized.
	 */

	public SearchResponse<Void> search(SearchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchRequest, SearchResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<SearchRequest, SearchResponse<Void>, ErrorResponse>) SearchRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #search(Function, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public final SearchResponse<Void> search(Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn)
			throws IOException, ElasticsearchException {
		return search(fn.apply(new SearchRequest.Builder()).build(), Void.class);
	}

	/**
	 * Run a search.
	 * <p>
	 * Get search hits that match the query defined in the request. You can provide
	 * search queries using the <code>q</code> query string parameter or the request
	 * body. If both are specified, only the query parameter is used.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the read
	 * index privilege for the target data stream, index, or alias. For
	 * cross-cluster search, refer to the documentation about configuring CCS
	 * privileges. To search a point in time (PIT) for an alias, you must have the
	 * <code>read</code> index privilege for the alias's data streams or indices.
	 * <p>
	 * <strong>Search slicing</strong>
	 * <p>
	 * When paging through a large number of documents, it can be helpful to split
	 * the search into multiple slices to consume them independently with the
	 * <code>slice</code> and <code>pit</code> properties. By default the splitting
	 * is done first on the shards, then locally on each shard. The local splitting
	 * partitions the shard into contiguous ranges based on Lucene document IDs.
	 * <p>
	 * For instance if the number of shards is equal to 2 and you request 4 slices,
	 * the slices 0 and 2 are assigned to the first shard and the slices 1 and 3 are
	 * assigned to the second shard.
	 * <p>
	 * IMPORTANT: The same point-in-time ID should be used for all slices. If
	 * different PIT IDs are used, slices can overlap and miss documents. This
	 * situation can occur because the splitting criterion is based on Lucene
	 * document IDs, which are not stable across changes to the index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchResponse<TDocument> search(SearchRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse>) SearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a search.
	 * <p>
	 * Get search hits that match the query defined in the request. You can provide
	 * search queries using the <code>q</code> query string parameter or the request
	 * body. If both are specified, only the query parameter is used.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the read
	 * index privilege for the target data stream, index, or alias. For
	 * cross-cluster search, refer to the documentation about configuring CCS
	 * privileges. To search a point in time (PIT) for an alias, you must have the
	 * <code>read</code> index privilege for the alias's data streams or indices.
	 * <p>
	 * <strong>Search slicing</strong>
	 * <p>
	 * When paging through a large number of documents, it can be helpful to split
	 * the search into multiple slices to consume them independently with the
	 * <code>slice</code> and <code>pit</code> properties. By default the splitting
	 * is done first on the shards, then locally on each shard. The local splitting
	 * partitions the shard into contiguous ranges based on Lucene document IDs.
	 * <p>
	 * For instance if the number of shards is equal to 2 and you request 4 slices,
	 * the slices 0 and 2 are assigned to the first shard and the slices 1 and 3 are
	 * assigned to the second shard.
	 * <p>
	 * IMPORTANT: The same point-in-time ID should be used for all slices. If
	 * different PIT IDs are used, slices can overlap and miss documents. This
	 * situation can occur because the splitting criterion is based on Lucene
	 * document IDs, which are not stable across changes to the index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchResponse<TDocument> search(
			Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return search(fn.apply(new SearchRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: search_mvt

	/**
	 * Search a vector tile.
	 * <p>
	 * Search a vector tile for geospatial values. Before using this API, you should
	 * be familiar with the Mapbox vector tile specification. The API returns
	 * results as a binary mapbox vector tile.
	 * <p>
	 * Internally, Elasticsearch translates a vector tile search API request into a
	 * search containing:
	 * <ul>
	 * <li>A <code>geo_bounding_box</code> query on the <code>&lt;field&gt;</code>.
	 * The query uses the <code>&lt;zoom&gt;/&lt;x&gt;/&lt;y&gt;</code> tile as a
	 * bounding box.</li>
	 * <li>A <code>geotile_grid</code> or <code>geohex_grid</code> aggregation on
	 * the <code>&lt;field&gt;</code>. The <code>grid_agg</code> parameter
	 * determines the aggregation type. The aggregation uses the
	 * <code>&lt;zoom&gt;/&lt;x&gt;/&lt;y&gt;</code> tile as a bounding box.</li>
	 * <li>Optionally, a <code>geo_bounds</code> aggregation on the
	 * <code>&lt;field&gt;</code>. The search only includes this aggregation if the
	 * <code>exact_bounds</code> parameter is <code>true</code>.</li>
	 * <li>If the optional parameter <code>with_labels</code> is <code>true</code>,
	 * the internal search will include a dynamic runtime field that calls the
	 * <code>getLabelPosition</code> function of the geometry doc value. This
	 * enables the generation of new point features containing suggested geometry
	 * labels, so that, for example, multi-polygons will have only one label.</li>
	 * </ul>
	 * <p>
	 * The API returns results as a binary Mapbox vector tile. Mapbox vector tiles
	 * are encoded as Google Protobufs (PBF). By default, the tile contains three
	 * layers:
	 * <ul>
	 * <li>A <code>hits</code> layer containing a feature for each
	 * <code>&lt;field&gt;</code> value matching the <code>geo_bounding_box</code>
	 * query.</li>
	 * <li>An <code>aggs</code> layer containing a feature for each cell of the
	 * <code>geotile_grid</code> or <code>geohex_grid</code>. The layer only
	 * contains features for cells with matching data.</li>
	 * <li>A meta layer containing:
	 * <ul>
	 * <li>A feature containing a bounding box. By default, this is the bounding box
	 * of the tile.</li>
	 * <li>Value ranges for any sub-aggregations on the <code>geotile_grid</code> or
	 * <code>geohex_grid</code>.</li>
	 * <li>Metadata for the search.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 * <p>
	 * The API only returns features that can display at its zoom level. For
	 * example, if a polygon feature has no area at its zoom level, the API omits
	 * it. The API returns errors as UTF-8 encoded JSON.
	 * <p>
	 * IMPORTANT: You can specify several options for this API as either a query
	 * parameter or request body parameter. If you specify both parameters, the
	 * query parameter takes precedence.
	 * <p>
	 * <strong>Grid precision for geotile</strong>
	 * <p>
	 * For a <code>grid_agg</code> of <code>geotile</code>, you can use cells in the
	 * <code>aggs</code> layer as tiles for lower zoom levels.
	 * <code>grid_precision</code> represents the additional zoom levels available
	 * through these cells. The final precision is computed by as follows:
	 * <code>&lt;zoom&gt; + grid_precision</code>. For example, if
	 * <code>&lt;zoom&gt;</code> is 7 and <code>grid_precision</code> is 8, then the
	 * <code>geotile_grid</code> aggregation will use a precision of 15. The maximum
	 * final precision is 29. The <code>grid_precision</code> also determines the
	 * number of cells for the grid as follows:
	 * <code>(2^grid_precision) x (2^grid_precision)</code>. For example, a value of
	 * 8 divides the tile into a grid of 256 x 256 cells. The <code>aggs</code>
	 * layer only contains features for cells with matching data.
	 * <p>
	 * <strong>Grid precision for geohex</strong>
	 * <p>
	 * For a <code>grid_agg</code> of <code>geohex</code>, Elasticsearch uses
	 * <code>&lt;zoom&gt;</code> and <code>grid_precision</code> to calculate a
	 * final precision as follows: <code>&lt;zoom&gt; + grid_precision</code>.
	 * <p>
	 * This precision determines the H3 resolution of the hexagonal cells produced
	 * by the <code>geohex</code> aggregation. The following table maps the H3
	 * resolution for each precision. For example, if <code>&lt;zoom&gt;</code> is 3
	 * and <code>grid_precision</code> is 3, the precision is 6. At a precision of
	 * 6, hexagonal cells have an H3 resolution of 2. If <code>&lt;zoom&gt;</code>
	 * is 3 and <code>grid_precision</code> is 4, the precision is 7. At a precision
	 * of 7, hexagonal cells have an H3 resolution of 3.
	 * <table>
	 * <thead>
	 * <tr>
	 * <th>Precision</th>
	 * <th>Unique tile bins</th>
	 * <th>H3 resolution</th>
	 * <th>Unique hex bins</th>
	 * <th>Ratio</th>
	 * </tr>
	 * </thead> <tbody>
	 * <tr>
	 * <td>1</td>
	 * <td>4</td>
	 * <td>0</td>
	 * <td>122</td>
	 * <td>30.5</td>
	 * </tr>
	 * <tr>
	 * <td>2</td>
	 * <td>16</td>
	 * <td>0</td>
	 * <td>122</td>
	 * <td>7.625</td>
	 * </tr>
	 * <tr>
	 * <td>3</td>
	 * <td>64</td>
	 * <td>1</td>
	 * <td>842</td>
	 * <td>13.15625</td>
	 * </tr>
	 * <tr>
	 * <td>4</td>
	 * <td>256</td>
	 * <td>1</td>
	 * <td>842</td>
	 * <td>3.2890625</td>
	 * </tr>
	 * <tr>
	 * <td>5</td>
	 * <td>1024</td>
	 * <td>2</td>
	 * <td>5882</td>
	 * <td>5.744140625</td>
	 * </tr>
	 * <tr>
	 * <td>6</td>
	 * <td>4096</td>
	 * <td>2</td>
	 * <td>5882</td>
	 * <td>1.436035156</td>
	 * </tr>
	 * <tr>
	 * <td>7</td>
	 * <td>16384</td>
	 * <td>3</td>
	 * <td>41162</td>
	 * <td>2.512329102</td>
	 * </tr>
	 * <tr>
	 * <td>8</td>
	 * <td>65536</td>
	 * <td>3</td>
	 * <td>41162</td>
	 * <td>0.6280822754</td>
	 * </tr>
	 * <tr>
	 * <td>9</td>
	 * <td>262144</td>
	 * <td>4</td>
	 * <td>288122</td>
	 * <td>1.099098206</td>
	 * </tr>
	 * <tr>
	 * <td>10</td>
	 * <td>1048576</td>
	 * <td>4</td>
	 * <td>288122</td>
	 * <td>0.2747745514</td>
	 * </tr>
	 * <tr>
	 * <td>11</td>
	 * <td>4194304</td>
	 * <td>5</td>
	 * <td>2016842</td>
	 * <td>0.4808526039</td>
	 * </tr>
	 * <tr>
	 * <td>12</td>
	 * <td>16777216</td>
	 * <td>6</td>
	 * <td>14117882</td>
	 * <td>0.8414913416</td>
	 * </tr>
	 * <tr>
	 * <td>13</td>
	 * <td>67108864</td>
	 * <td>6</td>
	 * <td>14117882</td>
	 * <td>0.2103728354</td>
	 * </tr>
	 * <tr>
	 * <td>14</td>
	 * <td>268435456</td>
	 * <td>7</td>
	 * <td>98825162</td>
	 * <td>0.3681524172</td>
	 * </tr>
	 * <tr>
	 * <td>15</td>
	 * <td>1073741824</td>
	 * <td>8</td>
	 * <td>691776122</td>
	 * <td>0.644266719</td>
	 * </tr>
	 * <tr>
	 * <td>16</td>
	 * <td>4294967296</td>
	 * <td>8</td>
	 * <td>691776122</td>
	 * <td>0.1610666797</td>
	 * </tr>
	 * <tr>
	 * <td>17</td>
	 * <td>17179869184</td>
	 * <td>9</td>
	 * <td>4842432842</td>
	 * <td>0.2818666889</td>
	 * </tr>
	 * <tr>
	 * <td>18</td>
	 * <td>68719476736</td>
	 * <td>10</td>
	 * <td>33897029882</td>
	 * <td>0.4932667053</td>
	 * </tr>
	 * <tr>
	 * <td>19</td>
	 * <td>274877906944</td>
	 * <td>11</td>
	 * <td>237279209162</td>
	 * <td>0.8632167343</td>
	 * </tr>
	 * <tr>
	 * <td>20</td>
	 * <td>1099511627776</td>
	 * <td>11</td>
	 * <td>237279209162</td>
	 * <td>0.2158041836</td>
	 * </tr>
	 * <tr>
	 * <td>21</td>
	 * <td>4398046511104</td>
	 * <td>12</td>
	 * <td>1660954464122</td>
	 * <td>0.3776573213</td>
	 * </tr>
	 * <tr>
	 * <td>22</td>
	 * <td>17592186044416</td>
	 * <td>13</td>
	 * <td>11626681248842</td>
	 * <td>0.6609003122</td>
	 * </tr>
	 * <tr>
	 * <td>23</td>
	 * <td>70368744177664</td>
	 * <td>13</td>
	 * <td>11626681248842</td>
	 * <td>0.165225078</td>
	 * </tr>
	 * <tr>
	 * <td>24</td>
	 * <td>281474976710656</td>
	 * <td>14</td>
	 * <td>81386768741882</td>
	 * <td>0.2891438866</td>
	 * </tr>
	 * <tr>
	 * <td>25</td>
	 * <td>1125899906842620</td>
	 * <td>15</td>
	 * <td>569707381193162</td>
	 * <td>0.5060018015</td>
	 * </tr>
	 * <tr>
	 * <td>26</td>
	 * <td>4503599627370500</td>
	 * <td>15</td>
	 * <td>569707381193162</td>
	 * <td>0.1265004504</td>
	 * </tr>
	 * <tr>
	 * <td>27</td>
	 * <td>18014398509482000</td>
	 * <td>15</td>
	 * <td>569707381193162</td>
	 * <td>0.03162511259</td>
	 * </tr>
	 * <tr>
	 * <td>28</td>
	 * <td>72057594037927900</td>
	 * <td>15</td>
	 * <td>569707381193162</td>
	 * <td>0.007906278149</td>
	 * </tr>
	 * <tr>
	 * <td>29</td>
	 * <td>288230376151712000</td>
	 * <td>15</td>
	 * <td>569707381193162</td>
	 * <td>0.001976569537</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * <p>
	 * Hexagonal cells don't align perfectly on a vector tile. Some cells may
	 * intersect more than one vector tile. To compute the H3 resolution for each
	 * precision, Elasticsearch compares the average density of hexagonal bins at
	 * each resolution with the average density of tile bins at each zoom level.
	 * Elasticsearch uses the H3 resolution that is closest to the corresponding
	 * geotile density.
	 * <p>
	 * Learn how to use the vector tile search API with practical examples in the
	 * <a href=
	 * "https://www.elastic.co/docs/reference/elasticsearch/rest-apis/vector-tile-search">Vector
	 * tile search examples</a> guide.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-mvt">Documentation
	 *      on elastic.co</a>
	 */

	public BinaryResponse searchMvt(SearchMvtRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SearchMvtRequest, BinaryResponse, ErrorResponse> endpoint = (Endpoint<SearchMvtRequest, BinaryResponse, ErrorResponse>) SearchMvtRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Search a vector tile.
	 * <p>
	 * Search a vector tile for geospatial values. Before using this API, you should
	 * be familiar with the Mapbox vector tile specification. The API returns
	 * results as a binary mapbox vector tile.
	 * <p>
	 * Internally, Elasticsearch translates a vector tile search API request into a
	 * search containing:
	 * <ul>
	 * <li>A <code>geo_bounding_box</code> query on the <code>&lt;field&gt;</code>.
	 * The query uses the <code>&lt;zoom&gt;/&lt;x&gt;/&lt;y&gt;</code> tile as a
	 * bounding box.</li>
	 * <li>A <code>geotile_grid</code> or <code>geohex_grid</code> aggregation on
	 * the <code>&lt;field&gt;</code>. The <code>grid_agg</code> parameter
	 * determines the aggregation type. The aggregation uses the
	 * <code>&lt;zoom&gt;/&lt;x&gt;/&lt;y&gt;</code> tile as a bounding box.</li>
	 * <li>Optionally, a <code>geo_bounds</code> aggregation on the
	 * <code>&lt;field&gt;</code>. The search only includes this aggregation if the
	 * <code>exact_bounds</code> parameter is <code>true</code>.</li>
	 * <li>If the optional parameter <code>with_labels</code> is <code>true</code>,
	 * the internal search will include a dynamic runtime field that calls the
	 * <code>getLabelPosition</code> function of the geometry doc value. This
	 * enables the generation of new point features containing suggested geometry
	 * labels, so that, for example, multi-polygons will have only one label.</li>
	 * </ul>
	 * <p>
	 * The API returns results as a binary Mapbox vector tile. Mapbox vector tiles
	 * are encoded as Google Protobufs (PBF). By default, the tile contains three
	 * layers:
	 * <ul>
	 * <li>A <code>hits</code> layer containing a feature for each
	 * <code>&lt;field&gt;</code> value matching the <code>geo_bounding_box</code>
	 * query.</li>
	 * <li>An <code>aggs</code> layer containing a feature for each cell of the
	 * <code>geotile_grid</code> or <code>geohex_grid</code>. The layer only
	 * contains features for cells with matching data.</li>
	 * <li>A meta layer containing:
	 * <ul>
	 * <li>A feature containing a bounding box. By default, this is the bounding box
	 * of the tile.</li>
	 * <li>Value ranges for any sub-aggregations on the <code>geotile_grid</code> or
	 * <code>geohex_grid</code>.</li>
	 * <li>Metadata for the search.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 * <p>
	 * The API only returns features that can display at its zoom level. For
	 * example, if a polygon feature has no area at its zoom level, the API omits
	 * it. The API returns errors as UTF-8 encoded JSON.
	 * <p>
	 * IMPORTANT: You can specify several options for this API as either a query
	 * parameter or request body parameter. If you specify both parameters, the
	 * query parameter takes precedence.
	 * <p>
	 * <strong>Grid precision for geotile</strong>
	 * <p>
	 * For a <code>grid_agg</code> of <code>geotile</code>, you can use cells in the
	 * <code>aggs</code> layer as tiles for lower zoom levels.
	 * <code>grid_precision</code> represents the additional zoom levels available
	 * through these cells. The final precision is computed by as follows:
	 * <code>&lt;zoom&gt; + grid_precision</code>. For example, if
	 * <code>&lt;zoom&gt;</code> is 7 and <code>grid_precision</code> is 8, then the
	 * <code>geotile_grid</code> aggregation will use a precision of 15. The maximum
	 * final precision is 29. The <code>grid_precision</code> also determines the
	 * number of cells for the grid as follows:
	 * <code>(2^grid_precision) x (2^grid_precision)</code>. For example, a value of
	 * 8 divides the tile into a grid of 256 x 256 cells. The <code>aggs</code>
	 * layer only contains features for cells with matching data.
	 * <p>
	 * <strong>Grid precision for geohex</strong>
	 * <p>
	 * For a <code>grid_agg</code> of <code>geohex</code>, Elasticsearch uses
	 * <code>&lt;zoom&gt;</code> and <code>grid_precision</code> to calculate a
	 * final precision as follows: <code>&lt;zoom&gt; + grid_precision</code>.
	 * <p>
	 * This precision determines the H3 resolution of the hexagonal cells produced
	 * by the <code>geohex</code> aggregation. The following table maps the H3
	 * resolution for each precision. For example, if <code>&lt;zoom&gt;</code> is 3
	 * and <code>grid_precision</code> is 3, the precision is 6. At a precision of
	 * 6, hexagonal cells have an H3 resolution of 2. If <code>&lt;zoom&gt;</code>
	 * is 3 and <code>grid_precision</code> is 4, the precision is 7. At a precision
	 * of 7, hexagonal cells have an H3 resolution of 3.
	 * <table>
	 * <thead>
	 * <tr>
	 * <th>Precision</th>
	 * <th>Unique tile bins</th>
	 * <th>H3 resolution</th>
	 * <th>Unique hex bins</th>
	 * <th>Ratio</th>
	 * </tr>
	 * </thead> <tbody>
	 * <tr>
	 * <td>1</td>
	 * <td>4</td>
	 * <td>0</td>
	 * <td>122</td>
	 * <td>30.5</td>
	 * </tr>
	 * <tr>
	 * <td>2</td>
	 * <td>16</td>
	 * <td>0</td>
	 * <td>122</td>
	 * <td>7.625</td>
	 * </tr>
	 * <tr>
	 * <td>3</td>
	 * <td>64</td>
	 * <td>1</td>
	 * <td>842</td>
	 * <td>13.15625</td>
	 * </tr>
	 * <tr>
	 * <td>4</td>
	 * <td>256</td>
	 * <td>1</td>
	 * <td>842</td>
	 * <td>3.2890625</td>
	 * </tr>
	 * <tr>
	 * <td>5</td>
	 * <td>1024</td>
	 * <td>2</td>
	 * <td>5882</td>
	 * <td>5.744140625</td>
	 * </tr>
	 * <tr>
	 * <td>6</td>
	 * <td>4096</td>
	 * <td>2</td>
	 * <td>5882</td>
	 * <td>1.436035156</td>
	 * </tr>
	 * <tr>
	 * <td>7</td>
	 * <td>16384</td>
	 * <td>3</td>
	 * <td>41162</td>
	 * <td>2.512329102</td>
	 * </tr>
	 * <tr>
	 * <td>8</td>
	 * <td>65536</td>
	 * <td>3</td>
	 * <td>41162</td>
	 * <td>0.6280822754</td>
	 * </tr>
	 * <tr>
	 * <td>9</td>
	 * <td>262144</td>
	 * <td>4</td>
	 * <td>288122</td>
	 * <td>1.099098206</td>
	 * </tr>
	 * <tr>
	 * <td>10</td>
	 * <td>1048576</td>
	 * <td>4</td>
	 * <td>288122</td>
	 * <td>0.2747745514</td>
	 * </tr>
	 * <tr>
	 * <td>11</td>
	 * <td>4194304</td>
	 * <td>5</td>
	 * <td>2016842</td>
	 * <td>0.4808526039</td>
	 * </tr>
	 * <tr>
	 * <td>12</td>
	 * <td>16777216</td>
	 * <td>6</td>
	 * <td>14117882</td>
	 * <td>0.8414913416</td>
	 * </tr>
	 * <tr>
	 * <td>13</td>
	 * <td>67108864</td>
	 * <td>6</td>
	 * <td>14117882</td>
	 * <td>0.2103728354</td>
	 * </tr>
	 * <tr>
	 * <td>14</td>
	 * <td>268435456</td>
	 * <td>7</td>
	 * <td>98825162</td>
	 * <td>0.3681524172</td>
	 * </tr>
	 * <tr>
	 * <td>15</td>
	 * <td>1073741824</td>
	 * <td>8</td>
	 * <td>691776122</td>
	 * <td>0.644266719</td>
	 * </tr>
	 * <tr>
	 * <td>16</td>
	 * <td>4294967296</td>
	 * <td>8</td>
	 * <td>691776122</td>
	 * <td>0.1610666797</td>
	 * </tr>
	 * <tr>
	 * <td>17</td>
	 * <td>17179869184</td>
	 * <td>9</td>
	 * <td>4842432842</td>
	 * <td>0.2818666889</td>
	 * </tr>
	 * <tr>
	 * <td>18</td>
	 * <td>68719476736</td>
	 * <td>10</td>
	 * <td>33897029882</td>
	 * <td>0.4932667053</td>
	 * </tr>
	 * <tr>
	 * <td>19</td>
	 * <td>274877906944</td>
	 * <td>11</td>
	 * <td>237279209162</td>
	 * <td>0.8632167343</td>
	 * </tr>
	 * <tr>
	 * <td>20</td>
	 * <td>1099511627776</td>
	 * <td>11</td>
	 * <td>237279209162</td>
	 * <td>0.2158041836</td>
	 * </tr>
	 * <tr>
	 * <td>21</td>
	 * <td>4398046511104</td>
	 * <td>12</td>
	 * <td>1660954464122</td>
	 * <td>0.3776573213</td>
	 * </tr>
	 * <tr>
	 * <td>22</td>
	 * <td>17592186044416</td>
	 * <td>13</td>
	 * <td>11626681248842</td>
	 * <td>0.6609003122</td>
	 * </tr>
	 * <tr>
	 * <td>23</td>
	 * <td>70368744177664</td>
	 * <td>13</td>
	 * <td>11626681248842</td>
	 * <td>0.165225078</td>
	 * </tr>
	 * <tr>
	 * <td>24</td>
	 * <td>281474976710656</td>
	 * <td>14</td>
	 * <td>81386768741882</td>
	 * <td>0.2891438866</td>
	 * </tr>
	 * <tr>
	 * <td>25</td>
	 * <td>1125899906842620</td>
	 * <td>15</td>
	 * <td>569707381193162</td>
	 * <td>0.5060018015</td>
	 * </tr>
	 * <tr>
	 * <td>26</td>
	 * <td>4503599627370500</td>
	 * <td>15</td>
	 * <td>569707381193162</td>
	 * <td>0.1265004504</td>
	 * </tr>
	 * <tr>
	 * <td>27</td>
	 * <td>18014398509482000</td>
	 * <td>15</td>
	 * <td>569707381193162</td>
	 * <td>0.03162511259</td>
	 * </tr>
	 * <tr>
	 * <td>28</td>
	 * <td>72057594037927900</td>
	 * <td>15</td>
	 * <td>569707381193162</td>
	 * <td>0.007906278149</td>
	 * </tr>
	 * <tr>
	 * <td>29</td>
	 * <td>288230376151712000</td>
	 * <td>15</td>
	 * <td>569707381193162</td>
	 * <td>0.001976569537</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * <p>
	 * Hexagonal cells don't align perfectly on a vector tile. Some cells may
	 * intersect more than one vector tile. To compute the H3 resolution for each
	 * precision, Elasticsearch compares the average density of hexagonal bins at
	 * each resolution with the average density of tile bins at each zoom level.
	 * Elasticsearch uses the H3 resolution that is closest to the corresponding
	 * geotile density.
	 * <p>
	 * Learn how to use the vector tile search API with practical examples in the
	 * <a href=
	 * "https://www.elastic.co/docs/reference/elasticsearch/rest-apis/vector-tile-search">Vector
	 * tile search examples</a> guide.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchMvtRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-mvt">Documentation
	 *      on elastic.co</a>
	 */

	public final BinaryResponse searchMvt(Function<SearchMvtRequest.Builder, ObjectBuilder<SearchMvtRequest>> fn)
			throws IOException, ElasticsearchException {
		return searchMvt(fn.apply(new SearchMvtRequest.Builder()).build());
	}

	// ----- Endpoint: search_shards

	/**
	 * Get the search shards.
	 * <p>
	 * Get the indices and shards that a search request would be run against. This
	 * information can be useful for working out issues or planning optimizations
	 * with routing and shard preferences. When filtered aliases are used, the
	 * filter is returned as part of the <code>indices</code> section.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * <code>view_index_metadata</code> or <code>manage</code> index privilege for
	 * the target data stream, index, or alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-shards">Documentation
	 *      on elastic.co</a>
	 */

	public SearchShardsResponse searchShards(SearchShardsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchShardsRequest, SearchShardsResponse, ErrorResponse> endpoint = (JsonEndpoint<SearchShardsRequest, SearchShardsResponse, ErrorResponse>) SearchShardsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the search shards.
	 * <p>
	 * Get the indices and shards that a search request would be run against. This
	 * information can be useful for working out issues or planning optimizations
	 * with routing and shard preferences. When filtered aliases are used, the
	 * filter is returned as part of the <code>indices</code> section.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * <code>view_index_metadata</code> or <code>manage</code> index privilege for
	 * the target data stream, index, or alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchShardsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-shards">Documentation
	 *      on elastic.co</a>
	 */

	public final SearchShardsResponse searchShards(
			Function<SearchShardsRequest.Builder, ObjectBuilder<SearchShardsRequest>> fn)
			throws IOException, ElasticsearchException {
		return searchShards(fn.apply(new SearchShardsRequest.Builder()).build());
	}

	/**
	 * Get the search shards.
	 * <p>
	 * Get the indices and shards that a search request would be run against. This
	 * information can be useful for working out issues or planning optimizations
	 * with routing and shard preferences. When filtered aliases are used, the
	 * filter is returned as part of the <code>indices</code> section.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * <code>view_index_metadata</code> or <code>manage</code> index privilege for
	 * the target data stream, index, or alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-shards">Documentation
	 *      on elastic.co</a>
	 */

	public SearchShardsResponse searchShards() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SearchShardsRequest.Builder().build(), SearchShardsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: search_template

	/**
	 * Run a search with a search template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-template">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchTemplateResponse<TDocument> searchTemplate(SearchTemplateRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse>) SearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search_template.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a search with a search template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-template">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchTemplateResponse<TDocument> searchTemplate(
			Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return searchTemplate(fn.apply(new SearchTemplateRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #searchTemplate(SearchTemplateRequest, Class)}, where
	 * Class is defined as Void, meaning the documents will not be deserialized.
	 */

	public SearchTemplateResponse<Void> searchTemplate(SearchTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<Void>, ErrorResponse>) SearchTemplateRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #searchTemplate(Function, Class)}, where Class is defined
	 * as Void, meaning the documents will not be deserialized.
	 */

	public final SearchTemplateResponse<Void> searchTemplate(
			Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return searchTemplate(fn.apply(new SearchTemplateRequest.Builder()).build(), Void.class);
	}

	/**
	 * Run a search with a search template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-template">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchTemplateResponse<TDocument> searchTemplate(SearchTemplateRequest request,
			Type tDocumentType) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse>) SearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search_template.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a search with a search template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-template">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchTemplateResponse<TDocument> searchTemplate(
			Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return searchTemplate(fn.apply(new SearchTemplateRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: terms_enum

	/**
	 * Get terms in an index.
	 * <p>
	 * Discover terms that match a partial string in an index. This API is designed
	 * for low-latency look-ups used in auto-complete scenarios. <blockquote>
	 * <p>
	 * info The terms enum API may return terms from deleted documents. Deleted
	 * documents are initially only marked as deleted. It is not until their
	 * segments are merged that documents are actually deleted. Until that happens,
	 * the terms enum API will return terms from these documents.
	 * </p>
	 * </blockquote>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-terms-enum">Documentation
	 *      on elastic.co</a>
	 */

	public TermsEnumResponse termsEnum(TermsEnumRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TermsEnumRequest, TermsEnumResponse, ErrorResponse> endpoint = (JsonEndpoint<TermsEnumRequest, TermsEnumResponse, ErrorResponse>) TermsEnumRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get terms in an index.
	 * <p>
	 * Discover terms that match a partial string in an index. This API is designed
	 * for low-latency look-ups used in auto-complete scenarios. <blockquote>
	 * <p>
	 * info The terms enum API may return terms from deleted documents. Deleted
	 * documents are initially only marked as deleted. It is not until their
	 * segments are merged that documents are actually deleted. Until that happens,
	 * the terms enum API will return terms from these documents.
	 * </p>
	 * </blockquote>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TermsEnumRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-terms-enum">Documentation
	 *      on elastic.co</a>
	 */

	public final TermsEnumResponse termsEnum(Function<TermsEnumRequest.Builder, ObjectBuilder<TermsEnumRequest>> fn)
			throws IOException, ElasticsearchException {
		return termsEnum(fn.apply(new TermsEnumRequest.Builder()).build());
	}

	// ----- Endpoint: termvectors

	/**
	 * Get term vector information.
	 * <p>
	 * Get information and statistics about terms in the fields of a particular
	 * document.
	 * <p>
	 * You can retrieve term vectors for documents stored in the index or for
	 * artificial documents passed in the body of the request. You can specify the
	 * fields you are interested in through the <code>fields</code> parameter or by
	 * adding the fields to the request body. For example:
	 * 
	 * <pre>
	 * <code>GET /my-index-000001/_termvectors/1?fields=message
	 * </code>
	 * </pre>
	 * <p>
	 * Fields can be specified using wildcards, similar to the multi match query.
	 * <p>
	 * Term vectors are real-time by default, not near real-time. This can be
	 * changed by setting <code>realtime</code> parameter to <code>false</code>.
	 * <p>
	 * You can request three types of values: <em>term information</em>, <em>term
	 * statistics</em>, and <em>field statistics</em>. By default, all term
	 * information and field statistics are returned for all fields but term
	 * statistics are excluded.
	 * <p>
	 * <strong>Term information</strong>
	 * <ul>
	 * <li>term frequency in the field (always returned)</li>
	 * <li>term positions (<code>positions: true</code>)</li>
	 * <li>start and end offsets (<code>offsets: true</code>)</li>
	 * <li>term payloads (<code>payloads: true</code>), as base64 encoded bytes</li>
	 * </ul>
	 * <p>
	 * If the requested information wasn't stored in the index, it will be computed
	 * on the fly if possible. Additionally, term vectors could be computed for
	 * documents not even existing in the index, but instead provided by the user.
	 * <blockquote>
	 * <p>
	 * warn Start and end offsets assume UTF-16 encoding is being used. If you want
	 * to use these offsets in order to get the original text that produced this
	 * token, you should make sure that the string you are taking a sub-string of is
	 * also encoded using UTF-16.
	 * </p>
	 * </blockquote>
	 * <p>
	 * <strong>Behaviour</strong>
	 * <p>
	 * The term and field statistics are not accurate. Deleted documents are not
	 * taken into account. The information is only retrieved for the shard the
	 * requested document resides in. The term and field statistics are therefore
	 * only useful as relative measures whereas the absolute numbers have no meaning
	 * in this context. By default, when requesting term vectors of artificial
	 * documents, a shard to get the statistics from is randomly selected. Use
	 * <code>routing</code> only to hit a particular shard. Refer to the linked
	 * documentation for detailed examples of how to use this API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-termvectors">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> TermvectorsResponse termvectors(TermvectorsRequest<TDocument> request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TermvectorsRequest<?>, TermvectorsResponse, ErrorResponse> endpoint = (JsonEndpoint<TermvectorsRequest<?>, TermvectorsResponse, ErrorResponse>) TermvectorsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get term vector information.
	 * <p>
	 * Get information and statistics about terms in the fields of a particular
	 * document.
	 * <p>
	 * You can retrieve term vectors for documents stored in the index or for
	 * artificial documents passed in the body of the request. You can specify the
	 * fields you are interested in through the <code>fields</code> parameter or by
	 * adding the fields to the request body. For example:
	 * 
	 * <pre>
	 * <code>GET /my-index-000001/_termvectors/1?fields=message
	 * </code>
	 * </pre>
	 * <p>
	 * Fields can be specified using wildcards, similar to the multi match query.
	 * <p>
	 * Term vectors are real-time by default, not near real-time. This can be
	 * changed by setting <code>realtime</code> parameter to <code>false</code>.
	 * <p>
	 * You can request three types of values: <em>term information</em>, <em>term
	 * statistics</em>, and <em>field statistics</em>. By default, all term
	 * information and field statistics are returned for all fields but term
	 * statistics are excluded.
	 * <p>
	 * <strong>Term information</strong>
	 * <ul>
	 * <li>term frequency in the field (always returned)</li>
	 * <li>term positions (<code>positions: true</code>)</li>
	 * <li>start and end offsets (<code>offsets: true</code>)</li>
	 * <li>term payloads (<code>payloads: true</code>), as base64 encoded bytes</li>
	 * </ul>
	 * <p>
	 * If the requested information wasn't stored in the index, it will be computed
	 * on the fly if possible. Additionally, term vectors could be computed for
	 * documents not even existing in the index, but instead provided by the user.
	 * <blockquote>
	 * <p>
	 * warn Start and end offsets assume UTF-16 encoding is being used. If you want
	 * to use these offsets in order to get the original text that produced this
	 * token, you should make sure that the string you are taking a sub-string of is
	 * also encoded using UTF-16.
	 * </p>
	 * </blockquote>
	 * <p>
	 * <strong>Behaviour</strong>
	 * <p>
	 * The term and field statistics are not accurate. Deleted documents are not
	 * taken into account. The information is only retrieved for the shard the
	 * requested document resides in. The term and field statistics are therefore
	 * only useful as relative measures whereas the absolute numbers have no meaning
	 * in this context. By default, when requesting term vectors of artificial
	 * documents, a shard to get the statistics from is randomly selected. Use
	 * <code>routing</code> only to hit a particular shard. Refer to the linked
	 * documentation for detailed examples of how to use this API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TermvectorsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-termvectors">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> TermvectorsResponse termvectors(
			Function<TermvectorsRequest.Builder<TDocument>, ObjectBuilder<TermvectorsRequest<TDocument>>> fn)
			throws IOException, ElasticsearchException {
		return termvectors(fn.apply(new TermvectorsRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: update

	/**
	 * Update a document.
	 * <p>
	 * Update a document by running a script or passing a partial document.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * <code>index</code> or <code>write</code> index privilege for the target index
	 * or index alias.
	 * <p>
	 * The script can update, delete, or skip modifying the document. The API also
	 * supports passing a partial document, which is merged into the existing
	 * document. To fully replace an existing document, use the index API. This
	 * operation:
	 * <ul>
	 * <li>Gets the document (collocated with the shard) from the index.</li>
	 * <li>Runs the specified script.</li>
	 * <li>Indexes the result.</li>
	 * </ul>
	 * <p>
	 * The document must still be reindexed, but using this API removes some network
	 * roundtrips and reduces chances of version conflicts between the GET and the
	 * index operation.
	 * <p>
	 * The <code>_source</code> field must be enabled to use this API. In addition
	 * to <code>_source</code>, you can access the following variables through the
	 * <code>ctx</code> map: <code>_index</code>, <code>_type</code>,
	 * <code>_id</code>, <code>_version</code>, <code>_routing</code>, and
	 * <code>_now</code> (the current timestamp). For usage examples such as partial
	 * updates, upserts, and scripted updates, see the External documentation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-update">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
			UpdateRequest<TDocument, TPartialDocument> request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse>) UpdateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.update.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a document.
	 * <p>
	 * Update a document by running a script or passing a partial document.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * <code>index</code> or <code>write</code> index privilege for the target index
	 * or index alias.
	 * <p>
	 * The script can update, delete, or skip modifying the document. The API also
	 * supports passing a partial document, which is merged into the existing
	 * document. To fully replace an existing document, use the index API. This
	 * operation:
	 * <ul>
	 * <li>Gets the document (collocated with the shard) from the index.</li>
	 * <li>Runs the specified script.</li>
	 * <li>Indexes the result.</li>
	 * </ul>
	 * <p>
	 * The document must still be reindexed, but using this API removes some network
	 * roundtrips and reduces chances of version conflicts between the GET and the
	 * index operation.
	 * <p>
	 * The <code>_source</code> field must be enabled to use this API. In addition
	 * to <code>_source</code>, you can access the following variables through the
	 * <code>ctx</code> map: <code>_index</code>, <code>_type</code>,
	 * <code>_id</code>, <code>_version</code>, <code>_routing</code>, and
	 * <code>_now</code> (the current timestamp). For usage examples such as partial
	 * updates, upserts, and scripted updates, see the External documentation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-update">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
			Function<UpdateRequest.Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return update(fn.apply(new UpdateRequest.Builder<TDocument, TPartialDocument>()).build(), tDocumentClass);
	}

	/**
	 * Update a document.
	 * <p>
	 * Update a document by running a script or passing a partial document.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * <code>index</code> or <code>write</code> index privilege for the target index
	 * or index alias.
	 * <p>
	 * The script can update, delete, or skip modifying the document. The API also
	 * supports passing a partial document, which is merged into the existing
	 * document. To fully replace an existing document, use the index API. This
	 * operation:
	 * <ul>
	 * <li>Gets the document (collocated with the shard) from the index.</li>
	 * <li>Runs the specified script.</li>
	 * <li>Indexes the result.</li>
	 * </ul>
	 * <p>
	 * The document must still be reindexed, but using this API removes some network
	 * roundtrips and reduces chances of version conflicts between the GET and the
	 * index operation.
	 * <p>
	 * The <code>_source</code> field must be enabled to use this API. In addition
	 * to <code>_source</code>, you can access the following variables through the
	 * <code>ctx</code> map: <code>_index</code>, <code>_type</code>,
	 * <code>_id</code>, <code>_version</code>, <code>_routing</code>, and
	 * <code>_now</code> (the current timestamp). For usage examples such as partial
	 * updates, upserts, and scripted updates, see the External documentation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-update">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
			UpdateRequest<TDocument, TPartialDocument> request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse>) UpdateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.update.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a document.
	 * <p>
	 * Update a document by running a script or passing a partial document.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * <code>index</code> or <code>write</code> index privilege for the target index
	 * or index alias.
	 * <p>
	 * The script can update, delete, or skip modifying the document. The API also
	 * supports passing a partial document, which is merged into the existing
	 * document. To fully replace an existing document, use the index API. This
	 * operation:
	 * <ul>
	 * <li>Gets the document (collocated with the shard) from the index.</li>
	 * <li>Runs the specified script.</li>
	 * <li>Indexes the result.</li>
	 * </ul>
	 * <p>
	 * The document must still be reindexed, but using this API removes some network
	 * roundtrips and reduces chances of version conflicts between the GET and the
	 * index operation.
	 * <p>
	 * The <code>_source</code> field must be enabled to use this API. In addition
	 * to <code>_source</code>, you can access the following variables through the
	 * <code>ctx</code> map: <code>_index</code>, <code>_type</code>,
	 * <code>_id</code>, <code>_version</code>, <code>_routing</code>, and
	 * <code>_now</code> (the current timestamp). For usage examples such as partial
	 * updates, upserts, and scripted updates, see the External documentation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-update">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
			Function<UpdateRequest.Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>>> fn,
			Type tDocumentType) throws IOException, ElasticsearchException {
		return update(fn.apply(new UpdateRequest.Builder<TDocument, TPartialDocument>()).build(), tDocumentType);
	}

	// ----- Endpoint: update_by_query

	/**
	 * Update documents. Updates documents that match the specified query. If no
	 * query is specified, performs an update on every document in the data stream
	 * or index without modifying the source, which is useful for picking up mapping
	 * changes.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or alias:
	 * <ul>
	 * <li><code>read</code></li>
	 * <li><code>index</code> or <code>write</code></li>
	 * </ul>
	 * <p>
	 * You can specify the query criteria in the request URI or the request body
	 * using the same syntax as the search API.
	 * <p>
	 * When you submit an update by query request, Elasticsearch gets a snapshot of
	 * the data stream or index when it begins processing the request and updates
	 * matching documents using internal versioning. When the versions match, the
	 * document is updated and the version number is incremented. If a document
	 * changes between the time that the snapshot is taken and the update operation
	 * is processed, it results in a version conflict and the operation fails. You
	 * can opt to count version conflicts instead of halting and returning by
	 * setting <code>conflicts</code> to <code>proceed</code>. Note that if you opt
	 * to count version conflicts, the operation could attempt to update more
	 * documents from the source than <code>max_docs</code> until it has
	 * successfully updated <code>max_docs</code> documents or it has gone through
	 * every document in the source query.
	 * <p>
	 * NOTE: Documents with a version equal to 0 cannot be updated using update by
	 * query because internal versioning does not support 0 as a valid version
	 * number.
	 * <p>
	 * While processing an update by query request, Elasticsearch performs multiple
	 * search requests sequentially to find all of the matching documents. A bulk
	 * update request is performed for each batch of matching documents. Any query
	 * or update failures cause the update by query request to fail and the failures
	 * are shown in the response. Any update requests that completed successfully
	 * still stick, they are not rolled back.
	 * <p>
	 * <strong>Refreshing shards</strong>
	 * <p>
	 * Specifying the <code>refresh</code> parameter refreshes all shards once the
	 * request completes. This is different to the update API's <code>refresh</code>
	 * parameter, which causes only the shard that received the request to be
	 * refreshed. Unlike the update API, it does not support <code>wait_for</code>.
	 * <p>
	 * <strong>Running update by query asynchronously</strong>
	 * <p>
	 * If the request contains <code>wait_for_completion=false</code>, Elasticsearch
	 * performs some preflight checks, launches the request, and returns a <a href=
	 * "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-tasks">task</a>
	 * you can use to cancel or get the status of the task. Elasticsearch creates a
	 * record of this task as a document at <code>.tasks/task/${taskId}</code>.
	 * <p>
	 * <strong>Waiting for active shards</strong>
	 * <p>
	 * <code>wait_for_active_shards</code> controls how many copies of a shard must
	 * be active before proceeding with the request. See <a href=
	 * "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-create#operation-create-wait_for_active_shards"><code>wait_for_active_shards</code></a>
	 * for details. <code>timeout</code> controls how long each write request waits
	 * for unavailable shards to become available. Both work exactly the way they
	 * work in the <a href=
	 * "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-bulk">Bulk
	 * API</a>. Update by query uses scrolled searches, so you can also specify the
	 * <code>scroll</code> parameter to control how long it keeps the search context
	 * alive, for example <code>?scroll=10m</code>. The default is 5 minutes.
	 * <p>
	 * <strong>Throttling update requests</strong>
	 * <p>
	 * To control the rate at which update by query issues batches of update
	 * operations, you can set <code>requests_per_second</code> to any positive
	 * decimal number. This pads each batch with a wait time to throttle the rate.
	 * Set <code>requests_per_second</code> to <code>-1</code> to turn off
	 * throttling.
	 * <p>
	 * Throttling uses a wait time between batches so that the internal scroll
	 * requests can be given a timeout that takes the request padding into account.
	 * The padding time is the difference between the batch size divided by the
	 * <code>requests_per_second</code> and the time spent writing. By default the
	 * batch size is 1000, so if <code>requests_per_second</code> is set to
	 * <code>500</code>:
	 * 
	 * <pre>
	 * <code>target_time = 1000 / 500 per second = 2 seconds
	 * wait_time = target_time - write_time = 2 seconds - .5 seconds = 1.5 seconds
	 * </code>
	 * </pre>
	 * <p>
	 * Since the batch is issued as a single _bulk request, large batch sizes cause
	 * Elasticsearch to create many requests and wait before starting the next set.
	 * This is &quot;bursty&quot; instead of &quot;smooth&quot;.
	 * <p>
	 * <strong>Slicing</strong>
	 * <p>
	 * Update by query supports sliced scroll to parallelize the update process.
	 * This can improve efficiency and provide a convenient way to break the request
	 * down into smaller parts.
	 * <p>
	 * Setting <code>slices</code> to <code>auto</code> chooses a reasonable number
	 * for most data streams and indices. This setting will use one slice per shard,
	 * up to a certain limit. If there are multiple source data streams or indices,
	 * it will choose the number of slices based on the index or backing index with
	 * the smallest number of shards.
	 * <p>
	 * Adding <code>slices</code> to <code>_update_by_query</code> just automates
	 * the manual process of creating sub-requests, which means it has some quirks:
	 * <ul>
	 * <li>You can see these requests in the tasks APIs. These sub-requests are
	 * &quot;child&quot; tasks of the task for the request with slices.</li>
	 * <li>Fetching the status of the task for the request with <code>slices</code>
	 * only contains the status of completed slices.</li>
	 * <li>These sub-requests are individually addressable for things like
	 * cancellation and rethrottling.</li>
	 * <li>Rethrottling the request with <code>slices</code> will rethrottle the
	 * unfinished sub-request proportionally.</li>
	 * <li>Canceling the request with slices will cancel each sub-request.</li>
	 * <li>Due to the nature of slices each sub-request won't get a perfectly even
	 * portion of the documents. All documents will be addressed, but some slices
	 * may be larger than others. Expect larger slices to have a more even
	 * distribution.</li>
	 * <li>Parameters like <code>requests_per_second</code> and
	 * <code>max_docs</code> on a request with slices are distributed proportionally
	 * to each sub-request. Combine that with the point above about distribution
	 * being uneven and you should conclude that using <code>max_docs</code> with
	 * <code>slices</code> might not result in exactly <code>max_docs</code>
	 * documents being updated.</li>
	 * <li>Each sub-request gets a slightly different snapshot of the source data
	 * stream or index though these are all taken at approximately the same
	 * time.</li>
	 * </ul>
	 * <p>
	 * If you're slicing manually or otherwise tuning automatic slicing, keep in
	 * mind that:
	 * <ul>
	 * <li>Query performance is most efficient when the number of slices is equal to
	 * the number of shards in the index or backing index. If that number is large
	 * (for example, 500), choose a lower number as too many slices hurts
	 * performance. Setting slices higher than the number of shards generally does
	 * not improve efficiency and adds overhead.</li>
	 * <li>Update performance scales linearly across available resources with the
	 * number of slices.</li>
	 * </ul>
	 * <p>
	 * Whether query or update performance dominates the runtime depends on the
	 * documents being reindexed and cluster resources. Refer to the linked
	 * documentation for examples of how to update documents using the
	 * <code>_update_by_query</code> API:
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-update-by-query">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateByQueryResponse updateByQuery(UpdateByQueryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateByQueryRequest, UpdateByQueryResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateByQueryRequest, UpdateByQueryResponse, ErrorResponse>) UpdateByQueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update documents. Updates documents that match the specified query. If no
	 * query is specified, performs an update on every document in the data stream
	 * or index without modifying the source, which is useful for picking up mapping
	 * changes.
	 * <p>
	 * If the Elasticsearch security features are enabled, you must have the
	 * following index privileges for the target data stream, index, or alias:
	 * <ul>
	 * <li><code>read</code></li>
	 * <li><code>index</code> or <code>write</code></li>
	 * </ul>
	 * <p>
	 * You can specify the query criteria in the request URI or the request body
	 * using the same syntax as the search API.
	 * <p>
	 * When you submit an update by query request, Elasticsearch gets a snapshot of
	 * the data stream or index when it begins processing the request and updates
	 * matching documents using internal versioning. When the versions match, the
	 * document is updated and the version number is incremented. If a document
	 * changes between the time that the snapshot is taken and the update operation
	 * is processed, it results in a version conflict and the operation fails. You
	 * can opt to count version conflicts instead of halting and returning by
	 * setting <code>conflicts</code> to <code>proceed</code>. Note that if you opt
	 * to count version conflicts, the operation could attempt to update more
	 * documents from the source than <code>max_docs</code> until it has
	 * successfully updated <code>max_docs</code> documents or it has gone through
	 * every document in the source query.
	 * <p>
	 * NOTE: Documents with a version equal to 0 cannot be updated using update by
	 * query because internal versioning does not support 0 as a valid version
	 * number.
	 * <p>
	 * While processing an update by query request, Elasticsearch performs multiple
	 * search requests sequentially to find all of the matching documents. A bulk
	 * update request is performed for each batch of matching documents. Any query
	 * or update failures cause the update by query request to fail and the failures
	 * are shown in the response. Any update requests that completed successfully
	 * still stick, they are not rolled back.
	 * <p>
	 * <strong>Refreshing shards</strong>
	 * <p>
	 * Specifying the <code>refresh</code> parameter refreshes all shards once the
	 * request completes. This is different to the update API's <code>refresh</code>
	 * parameter, which causes only the shard that received the request to be
	 * refreshed. Unlike the update API, it does not support <code>wait_for</code>.
	 * <p>
	 * <strong>Running update by query asynchronously</strong>
	 * <p>
	 * If the request contains <code>wait_for_completion=false</code>, Elasticsearch
	 * performs some preflight checks, launches the request, and returns a <a href=
	 * "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-tasks">task</a>
	 * you can use to cancel or get the status of the task. Elasticsearch creates a
	 * record of this task as a document at <code>.tasks/task/${taskId}</code>.
	 * <p>
	 * <strong>Waiting for active shards</strong>
	 * <p>
	 * <code>wait_for_active_shards</code> controls how many copies of a shard must
	 * be active before proceeding with the request. See <a href=
	 * "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-create#operation-create-wait_for_active_shards"><code>wait_for_active_shards</code></a>
	 * for details. <code>timeout</code> controls how long each write request waits
	 * for unavailable shards to become available. Both work exactly the way they
	 * work in the <a href=
	 * "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-bulk">Bulk
	 * API</a>. Update by query uses scrolled searches, so you can also specify the
	 * <code>scroll</code> parameter to control how long it keeps the search context
	 * alive, for example <code>?scroll=10m</code>. The default is 5 minutes.
	 * <p>
	 * <strong>Throttling update requests</strong>
	 * <p>
	 * To control the rate at which update by query issues batches of update
	 * operations, you can set <code>requests_per_second</code> to any positive
	 * decimal number. This pads each batch with a wait time to throttle the rate.
	 * Set <code>requests_per_second</code> to <code>-1</code> to turn off
	 * throttling.
	 * <p>
	 * Throttling uses a wait time between batches so that the internal scroll
	 * requests can be given a timeout that takes the request padding into account.
	 * The padding time is the difference between the batch size divided by the
	 * <code>requests_per_second</code> and the time spent writing. By default the
	 * batch size is 1000, so if <code>requests_per_second</code> is set to
	 * <code>500</code>:
	 * 
	 * <pre>
	 * <code>target_time = 1000 / 500 per second = 2 seconds
	 * wait_time = target_time - write_time = 2 seconds - .5 seconds = 1.5 seconds
	 * </code>
	 * </pre>
	 * <p>
	 * Since the batch is issued as a single _bulk request, large batch sizes cause
	 * Elasticsearch to create many requests and wait before starting the next set.
	 * This is &quot;bursty&quot; instead of &quot;smooth&quot;.
	 * <p>
	 * <strong>Slicing</strong>
	 * <p>
	 * Update by query supports sliced scroll to parallelize the update process.
	 * This can improve efficiency and provide a convenient way to break the request
	 * down into smaller parts.
	 * <p>
	 * Setting <code>slices</code> to <code>auto</code> chooses a reasonable number
	 * for most data streams and indices. This setting will use one slice per shard,
	 * up to a certain limit. If there are multiple source data streams or indices,
	 * it will choose the number of slices based on the index or backing index with
	 * the smallest number of shards.
	 * <p>
	 * Adding <code>slices</code> to <code>_update_by_query</code> just automates
	 * the manual process of creating sub-requests, which means it has some quirks:
	 * <ul>
	 * <li>You can see these requests in the tasks APIs. These sub-requests are
	 * &quot;child&quot; tasks of the task for the request with slices.</li>
	 * <li>Fetching the status of the task for the request with <code>slices</code>
	 * only contains the status of completed slices.</li>
	 * <li>These sub-requests are individually addressable for things like
	 * cancellation and rethrottling.</li>
	 * <li>Rethrottling the request with <code>slices</code> will rethrottle the
	 * unfinished sub-request proportionally.</li>
	 * <li>Canceling the request with slices will cancel each sub-request.</li>
	 * <li>Due to the nature of slices each sub-request won't get a perfectly even
	 * portion of the documents. All documents will be addressed, but some slices
	 * may be larger than others. Expect larger slices to have a more even
	 * distribution.</li>
	 * <li>Parameters like <code>requests_per_second</code> and
	 * <code>max_docs</code> on a request with slices are distributed proportionally
	 * to each sub-request. Combine that with the point above about distribution
	 * being uneven and you should conclude that using <code>max_docs</code> with
	 * <code>slices</code> might not result in exactly <code>max_docs</code>
	 * documents being updated.</li>
	 * <li>Each sub-request gets a slightly different snapshot of the source data
	 * stream or index though these are all taken at approximately the same
	 * time.</li>
	 * </ul>
	 * <p>
	 * If you're slicing manually or otherwise tuning automatic slicing, keep in
	 * mind that:
	 * <ul>
	 * <li>Query performance is most efficient when the number of slices is equal to
	 * the number of shards in the index or backing index. If that number is large
	 * (for example, 500), choose a lower number as too many slices hurts
	 * performance. Setting slices higher than the number of shards generally does
	 * not improve efficiency and adds overhead.</li>
	 * <li>Update performance scales linearly across available resources with the
	 * number of slices.</li>
	 * </ul>
	 * <p>
	 * Whether query or update performance dominates the runtime depends on the
	 * documents being reindexed and cluster resources. Refer to the linked
	 * documentation for examples of how to update documents using the
	 * <code>_update_by_query</code> API:
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateByQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-update-by-query">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateByQueryResponse updateByQuery(
			Function<UpdateByQueryRequest.Builder, ObjectBuilder<UpdateByQueryRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateByQuery(fn.apply(new UpdateByQueryRequest.Builder()).build());
	}

	// ----- Endpoint: update_by_query_rethrottle

	/**
	 * Throttle an update by query operation.
	 * <p>
	 * Change the number of requests per second for a particular update by query
	 * operation. Rethrottling that speeds up the query takes effect immediately but
	 * rethrotting that slows down the query takes effect after completing the
	 * current batch to prevent scroll timeouts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-update-by-query-rethrottle">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateByQueryRethrottleResponse updateByQueryRethrottle(UpdateByQueryRethrottleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateByQueryRethrottleRequest, UpdateByQueryRethrottleResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateByQueryRethrottleRequest, UpdateByQueryRethrottleResponse, ErrorResponse>) UpdateByQueryRethrottleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Throttle an update by query operation.
	 * <p>
	 * Change the number of requests per second for a particular update by query
	 * operation. Rethrottling that speeds up the query takes effect immediately but
	 * rethrotting that slows down the query takes effect after completing the
	 * current batch to prevent scroll timeouts.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateByQueryRethrottleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-update-by-query-rethrottle">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateByQueryRethrottleResponse updateByQueryRethrottle(
			Function<UpdateByQueryRethrottleRequest.Builder, ObjectBuilder<UpdateByQueryRethrottleRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateByQueryRethrottle(fn.apply(new UpdateByQueryRethrottleRequest.Builder()).build());
	}

}
