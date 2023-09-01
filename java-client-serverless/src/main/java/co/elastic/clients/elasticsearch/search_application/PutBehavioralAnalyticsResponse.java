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

package co.elastic.clients.elasticsearch.search_application;

import co.elastic.clients.elasticsearch.search_application.put_behavioral_analytics.AnalyticsAcknowledgeResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: search_application.put_behavioral_analytics.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#search_application.put_behavioral_analytics.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutBehavioralAnalyticsResponse extends AnalyticsAcknowledgeResponseBase {
	// ---------------------------------------------------------------------------------------------

	private PutBehavioralAnalyticsResponse(Builder builder) {
		super(builder);

	}

	public static PutBehavioralAnalyticsResponse of(
			Function<Builder, ObjectBuilder<PutBehavioralAnalyticsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutBehavioralAnalyticsResponse}.
	 */

	public static class Builder extends AnalyticsAcknowledgeResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutBehavioralAnalyticsResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutBehavioralAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutBehavioralAnalyticsResponse build() {
			_checkSingleUse();

			return new PutBehavioralAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutBehavioralAnalyticsResponse}
	 */
	public static final JsonpDeserializer<PutBehavioralAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutBehavioralAnalyticsResponse::setupPutBehavioralAnalyticsResponseDeserializer);

	protected static void setupPutBehavioralAnalyticsResponseDeserializer(
			ObjectDeserializer<PutBehavioralAnalyticsResponse.Builder> op) {
		AnalyticsAcknowledgeResponseBase.setupAnalyticsAcknowledgeResponseBaseDeserializer(op);

	}

}
