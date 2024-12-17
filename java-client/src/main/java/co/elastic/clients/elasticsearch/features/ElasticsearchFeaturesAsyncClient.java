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

package co.elastic.clients.elasticsearch.features;

import co.elastic.clients.ApiClient;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
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
 * Client for the features namespace.
 */
public class ElasticsearchFeaturesAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchFeaturesAsyncClient> {

	public ElasticsearchFeaturesAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchFeaturesAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchFeaturesAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchFeaturesAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: features.get_features

	/**
	 * Get the features. Get a list of features that can be included in snapshots
	 * using the <code>feature_states</code> field when creating a snapshot. You can
	 * use this API to determine which feature states to include when taking a
	 * snapshot. By default, all feature states are included in a snapshot if that
	 * snapshot includes the global state, or none if it does not.
	 * <p>
	 * A feature state includes one or more system indices necessary for a given
	 * feature to function. In order to ensure data integrity, all system indices
	 * that comprise a feature state are snapshotted and restored together.
	 * <p>
	 * The features listed by this API are a combination of built-in features and
	 * features defined by plugins. In order for a feature state to be listed in
	 * this API and recognized as a valid feature state by the create snapshot API,
	 * the plugin that defines that feature must be installed on the master node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-features-api.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetFeaturesResponse> getFeatures() {
		return this.transport.performRequestAsync(GetFeaturesRequest._INSTANCE, GetFeaturesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: features.reset_features

	/**
	 * Reset the features. Clear all of the state information stored in system
	 * indices by Elasticsearch features, including the security and machine
	 * learning indices.
	 * <p>
	 * WARNING: Intended for development and testing use only. Do not reset features
	 * on a production cluster.
	 * <p>
	 * Return a cluster to the same state as a new installation by resetting the
	 * feature state for all Elasticsearch features. This deletes all state
	 * information stored in system indices.
	 * <p>
	 * The response code is HTTP 200 if the state is successfully reset for all
	 * features. It is HTTP 500 if the reset operation failed for any feature.
	 * <p>
	 * Note that select features might provide a way to reset particular system
	 * indices. Using this API resets all features, both those that are built-in and
	 * implemented as plugins.
	 * <p>
	 * To list the features that will be affected, use the get features API.
	 * <p>
	 * IMPORTANT: The features installed on the node you submit this request to are
	 * the features that will be reset. Run on the master node if you have any
	 * doubts about which plugins are installed on individual nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<ResetFeaturesResponse> resetFeatures() {
		return this.transport.performRequestAsync(ResetFeaturesRequest._INSTANCE, ResetFeaturesRequest._ENDPOINT,
				this.transportOptions);
	}

}
