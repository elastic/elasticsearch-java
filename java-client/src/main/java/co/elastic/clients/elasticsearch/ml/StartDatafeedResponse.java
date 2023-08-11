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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.start_datafeed.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.start_datafeed.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class StartDatafeedResponse implements JsonpSerializable {
	private final List<String> node;

	private final boolean started;

	// ---------------------------------------------------------------------------------------------

	private StartDatafeedResponse(Builder builder) {

		this.node = ApiTypeHelper.unmodifiableRequired(builder.node, this, "node");
		this.started = ApiTypeHelper.requireNonNull(builder.started, this, "started");

	}

	public static StartDatafeedResponse of(Function<Builder, ObjectBuilder<StartDatafeedResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The ID of the node that the job was started on. In serverless this
	 * will be the &quot;serverless&quot;. If the job is allowed to open lazily and
	 * has not yet been assigned to a node, this value is an empty string.
	 * <p>
	 * API name: {@code node}
	 */
	public final List<String> node() {
		return this.node;
	}

	/**
	 * Required - For a successful response, this value is always <code>true</code>.
	 * On failure, an exception is returned instead.
	 * <p>
	 * API name: {@code started}
	 */
	public final boolean started() {
		return this.started;
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

		if (ApiTypeHelper.isDefined(this.node)) {
			generator.writeKey("node");
			generator.writeStartArray();
			for (String item0 : this.node) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("started");
		generator.write(this.started);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartDatafeedResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<StartDatafeedResponse> {
		private List<String> node;

		private Boolean started;

		/**
		 * Required - The ID of the node that the job was started on. In serverless this
		 * will be the &quot;serverless&quot;. If the job is allowed to open lazily and
		 * has not yet been assigned to a node, this value is an empty string.
		 * <p>
		 * API name: {@code node}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>node</code>.
		 */
		public final Builder node(List<String> list) {
			this.node = _listAddAll(this.node, list);
			return this;
		}

		/**
		 * Required - The ID of the node that the job was started on. In serverless this
		 * will be the &quot;serverless&quot;. If the job is allowed to open lazily and
		 * has not yet been assigned to a node, this value is an empty string.
		 * <p>
		 * API name: {@code node}
		 * <p>
		 * Adds one or more values to <code>node</code>.
		 */
		public final Builder node(String value, String... values) {
			this.node = _listAdd(this.node, value, values);
			return this;
		}

		/**
		 * Required - For a successful response, this value is always <code>true</code>.
		 * On failure, an exception is returned instead.
		 * <p>
		 * API name: {@code started}
		 */
		public final Builder started(boolean value) {
			this.started = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StartDatafeedResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartDatafeedResponse build() {
			_checkSingleUse();

			return new StartDatafeedResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StartDatafeedResponse}
	 */
	public static final JsonpDeserializer<StartDatafeedResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StartDatafeedResponse::setupStartDatafeedResponseDeserializer);

	protected static void setupStartDatafeedResponseDeserializer(ObjectDeserializer<StartDatafeedResponse.Builder> op) {

		op.add(Builder::node, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "node");
		op.add(Builder::started, JsonpDeserializer.booleanDeserializer(), "started");

	}

}
