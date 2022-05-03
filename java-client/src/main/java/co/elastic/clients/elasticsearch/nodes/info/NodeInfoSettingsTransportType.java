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

// typedef: nodes.info.NodeInfoSettingsTransportType

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.NodeInfoSettingsTransportType">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoSettingsTransportType implements JsonpSerializable {
	private final String default_;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoSettingsTransportType(Builder builder) {

		this.default_ = ApiTypeHelper.requireNonNull(builder.default_, this, "default_");

	}

	public static NodeInfoSettingsTransportType of(Function<Builder, ObjectBuilder<NodeInfoSettingsTransportType>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code default}
	 */
	public final String default_() {
		return this.default_;
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

		generator.writeKey("default");
		generator.write(this.default_);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsTransportType}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NodeInfoSettingsTransportType> {
		private String default_;

		/**
		 * Required - API name: {@code default}
		 */
		public final Builder default_(String value) {
			this.default_ = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsTransportType}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsTransportType build() {
			_checkSingleUse();

			return new NodeInfoSettingsTransportType(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettingsTransportType}
	 */
	public static final JsonpDeserializer<NodeInfoSettingsTransportType> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoSettingsTransportType::setupNodeInfoSettingsTransportTypeDeserializer);

	protected static void setupNodeInfoSettingsTransportTypeDeserializer(
			ObjectDeserializer<NodeInfoSettingsTransportType.Builder> op) {

		op.add(Builder::default_, JsonpDeserializer.stringDeserializer(), "default");

		op.shortcutProperty("default");

	}

}
