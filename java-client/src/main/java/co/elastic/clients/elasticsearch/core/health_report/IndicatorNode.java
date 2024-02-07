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

package co.elastic.clients.elasticsearch.core.health_report;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
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

// typedef: _global.health_report.IndicatorNode

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.IndicatorNode">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicatorNode implements JsonpSerializable {
	@Nullable
	private final String name;

	@Nullable
	private final String nodeId;

	// ---------------------------------------------------------------------------------------------

	private IndicatorNode(Builder builder) {

		this.name = builder.name;
		this.nodeId = builder.nodeId;

	}

	public static IndicatorNode of(Function<Builder, ObjectBuilder<IndicatorNode>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code node_id}
	 */
	@Nullable
	public final String nodeId() {
		return this.nodeId;
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

		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.nodeId != null) {
			generator.writeKey("node_id");
			generator.write(this.nodeId);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicatorNode}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndicatorNode> {
		@Nullable
		private String name;

		@Nullable
		private String nodeId;

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndicatorNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicatorNode build() {
			_checkSingleUse();

			return new IndicatorNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicatorNode}
	 */
	public static final JsonpDeserializer<IndicatorNode> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndicatorNode::setupIndicatorNodeDeserializer);

	protected static void setupIndicatorNodeDeserializer(ObjectDeserializer<IndicatorNode.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");

	}

}
