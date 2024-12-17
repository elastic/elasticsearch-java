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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.Objects;

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

// typedef: features.get_features.Request

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
 * @see <a href="../doc-files/api-spec.html#features.get_features.Request">API
 *      specification</a>
 */

public class GetFeaturesRequest extends RequestBase {
	public GetFeaturesRequest() {
	}

	/**
	 * Singleton instance for {@link GetFeaturesRequest}.
	 */
	public static final GetFeaturesRequest _INSTANCE = new GetFeaturesRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code features.get_features}".
	 */
	public static final Endpoint<GetFeaturesRequest, GetFeaturesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/features.get_features",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_features";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetFeaturesResponse._DESERIALIZER);
}
