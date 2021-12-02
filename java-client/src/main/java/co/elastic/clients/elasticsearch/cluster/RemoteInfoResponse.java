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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch.cluster.remote_info.ClusterRemoteInfo;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.endpoints.DictionaryResponse;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster.remote_info.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/cluster/remote_info/ClusterRemoteInfoResponse.ts#L24-L27">API
 *      specification</a>
 */
@JsonpDeserializable
public class RemoteInfoResponse extends DictionaryResponse<String, ClusterRemoteInfo> {
	// ---------------------------------------------------------------------------------------------

	private RemoteInfoResponse(Builder builder) {
		super(builder);

	}

	public static RemoteInfoResponse of(Function<Builder, ObjectBuilder<RemoteInfoResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoteInfoResponse}.
	 */

	public static class Builder extends DictionaryResponse.AbstractBuilder<String, ClusterRemoteInfo, Builder>
			implements
				ObjectBuilder<RemoteInfoResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RemoteInfoResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoteInfoResponse build() {
			_checkSingleUse();
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new RemoteInfoResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemoteInfoResponse}
	 */
	public static final JsonpDeserializer<RemoteInfoResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RemoteInfoResponse::setupRemoteInfoResponseDeserializer);

	protected static void setupRemoteInfoResponseDeserializer(ObjectDeserializer<RemoteInfoResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				ClusterRemoteInfo._DESERIALIZER);

	}

}
