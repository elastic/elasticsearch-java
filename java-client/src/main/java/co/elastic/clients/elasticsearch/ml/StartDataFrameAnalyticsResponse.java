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

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.start_data_frame_analytics.Response
@JsonpDeserializable
public final class StartDataFrameAnalyticsResponse extends AcknowledgedResponseBase {
	private final String node;

	// ---------------------------------------------------------------------------------------------

	public StartDataFrameAnalyticsResponse(Builder builder) {
		super(builder);

		this.node = Objects.requireNonNull(builder.node, "node");

	}

	public StartDataFrameAnalyticsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The ID of the node that the job was started on. If the job is
	 * allowed to open lazily and has not yet been assigned to a node, this value is
	 * an empty string.
	 * <p>
	 * API name: {@code node}
	 */
	public String node() {
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
		public Builder node(String value) {
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

			return new StartDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StartDataFrameAnalyticsResponse}
	 */
	public static final JsonpDeserializer<StartDataFrameAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StartDataFrameAnalyticsResponse::setupStartDataFrameAnalyticsResponseDeserializer,
					Builder::build);

	protected static void setupStartDataFrameAnalyticsResponseDeserializer(
			DelegatingDeserializer<StartDataFrameAnalyticsResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");

	}

}
