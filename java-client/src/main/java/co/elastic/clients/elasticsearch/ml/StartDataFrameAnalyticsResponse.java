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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: ml.start_data_frame_analytics.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.start_data_frame_analytics.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class StartDataFrameAnalyticsResponse extends AcknowledgedResponseBase {
	private final String node;

	// ---------------------------------------------------------------------------------------------

	private StartDataFrameAnalyticsResponse(Builder builder) {
		super(builder);

		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");

	}

	public static StartDataFrameAnalyticsResponse of(
			Function<Builder, ObjectBuilder<StartDataFrameAnalyticsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The ID of the node that the job was started on. If the job is
	 * allowed to open lazily and has not yet been assigned to a node, this value is
	 * an empty string.
	 * <p>
	 * API name: {@code node}
	 */
	public final String node() {
		return this.node;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("node");
		generator.write(this.node);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartDataFrameAnalyticsResponse}.
	 */

	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StartDataFrameAnalyticsResponse> {
		private String node;

		/**
		 * Required - The ID of the node that the job was started on. If the job is
		 * allowed to open lazily and has not yet been assigned to a node, this value is
		 * an empty string.
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(String value) {
			this.node = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StartDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartDataFrameAnalyticsResponse build() {
			_checkSingleUse();

			return new StartDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StartDataFrameAnalyticsResponse}
	 */
	public static final JsonpDeserializer<StartDataFrameAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StartDataFrameAnalyticsResponse::setupStartDataFrameAnalyticsResponseDeserializer);

	protected static void setupStartDataFrameAnalyticsResponseDeserializer(
			ObjectDeserializer<StartDataFrameAnalyticsResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");

	}

}
