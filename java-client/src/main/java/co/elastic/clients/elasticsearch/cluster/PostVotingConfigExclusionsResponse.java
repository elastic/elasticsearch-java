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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster.post_voting_config_exclusions.Response

public final class PostVotingConfigExclusionsResponse {
	public PostVotingConfigExclusionsResponse() {
	}

	/**
	 * Singleton instance for {@link PostVotingConfigExclusionsResponse}.
	 */
	public static final PostVotingConfigExclusionsResponse _INSTANCE = new PostVotingConfigExclusionsResponse();

	public static final JsonpDeserializer<PostVotingConfigExclusionsResponse> _DESERIALIZER = JsonpDeserializer
			.fixedValue(PostVotingConfigExclusionsResponse._INSTANCE);

}
