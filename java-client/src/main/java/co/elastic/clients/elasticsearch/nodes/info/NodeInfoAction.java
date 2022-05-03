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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoAction

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.info.NodeInfoAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoAction implements JsonpSerializable {
	private final String destructiveRequiresName;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoAction(Builder builder) {

		this.destructiveRequiresName = ApiTypeHelper.requireNonNull(builder.destructiveRequiresName, this,
				"destructiveRequiresName");

	}

	public static NodeInfoAction of(Function<Builder, ObjectBuilder<NodeInfoAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code destructive_requires_name}
	 */
	public final String destructiveRequiresName() {
		return this.destructiveRequiresName;
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

		generator.writeKey("destructive_requires_name");
		generator.write(this.destructiveRequiresName);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeInfoAction> {
		private String destructiveRequiresName;

		/**
		 * Required - API name: {@code destructive_requires_name}
		 */
		public final Builder destructiveRequiresName(String value) {
			this.destructiveRequiresName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoAction build() {
			_checkSingleUse();

			return new NodeInfoAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoAction}
	 */
	public static final JsonpDeserializer<NodeInfoAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoAction::setupNodeInfoActionDeserializer);

	protected static void setupNodeInfoActionDeserializer(ObjectDeserializer<NodeInfoAction.Builder> op) {

		op.add(Builder::destructiveRequiresName, JsonpDeserializer.stringDeserializer(), "destructive_requires_name");

	}

}
