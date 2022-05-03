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

package co.elastic.clients.elasticsearch.nodes.info;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoIngest

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.info.NodeInfoIngest">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoIngest implements JsonpSerializable {
	private final List<NodeInfoIngestProcessor> processors;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoIngest(Builder builder) {

		this.processors = ApiTypeHelper.unmodifiableRequired(builder.processors, this, "processors");

	}

	public static NodeInfoIngest of(Function<Builder, ObjectBuilder<NodeInfoIngest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code processors}
	 */
	public final List<NodeInfoIngestProcessor> processors() {
		return this.processors;
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

		if (ApiTypeHelper.isDefined(this.processors)) {
			generator.writeKey("processors");
			generator.writeStartArray();
			for (NodeInfoIngestProcessor item0 : this.processors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoIngest}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeInfoIngest> {
		private List<NodeInfoIngestProcessor> processors;

		/**
		 * Required - API name: {@code processors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>processors</code>.
		 */
		public final Builder processors(List<NodeInfoIngestProcessor> list) {
			this.processors = _listAddAll(this.processors, list);
			return this;
		}

		/**
		 * Required - API name: {@code processors}
		 * <p>
		 * Adds one or more values to <code>processors</code>.
		 */
		public final Builder processors(NodeInfoIngestProcessor value, NodeInfoIngestProcessor... values) {
			this.processors = _listAdd(this.processors, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code processors}
		 * <p>
		 * Adds a value to <code>processors</code> using a builder lambda.
		 */
		public final Builder processors(
				Function<NodeInfoIngestProcessor.Builder, ObjectBuilder<NodeInfoIngestProcessor>> fn) {
			return processors(fn.apply(new NodeInfoIngestProcessor.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoIngest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoIngest build() {
			_checkSingleUse();

			return new NodeInfoIngest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoIngest}
	 */
	public static final JsonpDeserializer<NodeInfoIngest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoIngest::setupNodeInfoIngestDeserializer);

	protected static void setupNodeInfoIngestDeserializer(ObjectDeserializer<NodeInfoIngest.Builder> op) {

		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(NodeInfoIngestProcessor._DESERIALIZER),
				"processors");

	}

}
