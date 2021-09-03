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

package co.elastic.clients.elasticsearch.api.features;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.features.GetFeaturesRequest;
import co.elastic.clients.elasticsearch.features.GetFeaturesResponse;
import co.elastic.clients.elasticsearch.features.ResetFeaturesRequest;
import co.elastic.clients.elasticsearch.features.ResetFeaturesResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the features namespace.
 */
public class FeaturesClient extends ApiClient<FeaturesClient> {

	public FeaturesClient(Transport transport) {
		super(transport, null);
	}

	public FeaturesClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: features.get_features

	/**
	 * Gets a list of features which can be included in snapshots using the
	 * feature_states field when creating a snapshot
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-features-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetFeaturesResponse getFeatures(GetFeaturesRequest request) throws IOException {
		return this.transport.performRequest(request, GetFeaturesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Gets a list of features which can be included in snapshots using the
	 * feature_states field when creating a snapshot
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-features-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetFeaturesResponse getFeatures(
			Function<GetFeaturesRequest.Builder, ObjectBuilder<GetFeaturesRequest>> fn) throws IOException {
		return getFeatures(fn.apply(new GetFeaturesRequest.Builder()).build());
	}

	// ----- Endpoint: features.reset_features

	/**
	 * Resets the internal state of features, usually by deleting system indices
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public ResetFeaturesResponse resetFeatures(ResetFeaturesRequest request) throws IOException {
		return this.transport.performRequest(request, ResetFeaturesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Resets the internal state of features, usually by deleting system indices
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ResetFeaturesResponse resetFeatures(
			Function<ResetFeaturesRequest.Builder, ObjectBuilder<ResetFeaturesRequest>> fn) throws IOException {
		return resetFeatures(fn.apply(new ResetFeaturesRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #FeaturesClient} with specific request options.
	 */
	@Override
	public FeaturesClient withRequestOptions(@Nullable RequestOptions options) {
		return new FeaturesClient(transport, options);
	}

	/**
	 * Creates a new {@link #FeaturesClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public FeaturesClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
