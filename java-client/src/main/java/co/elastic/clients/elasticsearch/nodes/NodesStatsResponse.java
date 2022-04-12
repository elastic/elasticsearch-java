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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch.nodes.stats.ResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: nodes.stats.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes.stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodesStatsResponse extends ResponseBase {
	// ---------------------------------------------------------------------------------------------

	private NodesStatsResponse(Builder builder) {
		super(builder);

	}

	public static NodesStatsResponse of(Function<Builder, ObjectBuilder<NodesStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesStatsResponse}.
	 */

	public static class Builder extends ResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NodesStatsResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodesStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodesStatsResponse build() {
			_checkSingleUse();

			return new NodesStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodesStatsResponse}
	 */
	public static final JsonpDeserializer<NodesStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodesStatsResponse::setupNodesStatsResponseDeserializer);

	protected static void setupNodesStatsResponseDeserializer(ObjectDeserializer<NodesStatsResponse.Builder> op) {
		ResponseBase.setupResponseBaseDeserializer(op);

	}

}
