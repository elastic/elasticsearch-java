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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.start_data_frame_analytics.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.start_data_frame_analytics.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class StartDataFrameAnalyticsResponse implements AcknowledgedResponse, JsonpSerializable {
	private final boolean acknowledged;

	private final String node;

	// ---------------------------------------------------------------------------------------------

	private StartDataFrameAnalyticsResponse(Builder builder) {

		this.acknowledged = ApiTypeHelper.requireNonNull(builder.acknowledged, this, "acknowledged");
		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");

	}

	public static StartDataFrameAnalyticsResponse of(
			Function<Builder, ObjectBuilder<StartDataFrameAnalyticsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code acknowledged}
	 */
	public final boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * Required - The ID of the node that the job was started on. If the job is
	 * allowed to open lazily and has not yet been assigned to a node, this value is
	 * an empty string. The node ID of the node the job has been assigned to, or an
	 * empty string if it hasn't been assigned to a node. In serverless if the job
	 * has been assigned to run then the node ID will be &quot;serverless&quot;.
	 * <p>
	 * API name: {@code node}
	 */
	public final String node() {
		return this.node;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		generator.writeKey("node");
		generator.write(this.node);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartDataFrameAnalyticsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<StartDataFrameAnalyticsResponse> {
		private Boolean acknowledged;

		private String node;

		/**
		 * Required - API name: {@code acknowledged}
		 */
		public final Builder acknowledged(boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * Required - The ID of the node that the job was started on. If the job is
		 * allowed to open lazily and has not yet been assigned to a node, this value is
		 * an empty string. The node ID of the node the job has been assigned to, or an
		 * empty string if it hasn't been assigned to a node. In serverless if the job
		 * has been assigned to run then the node ID will be &quot;serverless&quot;.
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

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");

	}

}
