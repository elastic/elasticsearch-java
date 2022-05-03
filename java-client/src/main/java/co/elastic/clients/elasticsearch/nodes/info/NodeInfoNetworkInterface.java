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

// typedef: nodes.info.NodeInfoNetworkInterface

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.NodeInfoNetworkInterface">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoNetworkInterface implements JsonpSerializable {
	private final String address;

	private final String macAddress;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoNetworkInterface(Builder builder) {

		this.address = ApiTypeHelper.requireNonNull(builder.address, this, "address");
		this.macAddress = ApiTypeHelper.requireNonNull(builder.macAddress, this, "macAddress");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static NodeInfoNetworkInterface of(Function<Builder, ObjectBuilder<NodeInfoNetworkInterface>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code address}
	 */
	public final String address() {
		return this.address;
	}

	/**
	 * Required - API name: {@code mac_address}
	 */
	public final String macAddress() {
		return this.macAddress;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
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

		generator.writeKey("address");
		generator.write(this.address);

		generator.writeKey("mac_address");
		generator.write(this.macAddress);

		generator.writeKey("name");
		generator.write(this.name);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoNetworkInterface}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NodeInfoNetworkInterface> {
		private String address;

		private String macAddress;

		private String name;

		/**
		 * Required - API name: {@code address}
		 */
		public final Builder address(String value) {
			this.address = value;
			return this;
		}

		/**
		 * Required - API name: {@code mac_address}
		 */
		public final Builder macAddress(String value) {
			this.macAddress = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoNetworkInterface}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoNetworkInterface build() {
			_checkSingleUse();

			return new NodeInfoNetworkInterface(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoNetworkInterface}
	 */
	public static final JsonpDeserializer<NodeInfoNetworkInterface> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoNetworkInterface::setupNodeInfoNetworkInterfaceDeserializer);

	protected static void setupNodeInfoNetworkInterfaceDeserializer(
			ObjectDeserializer<NodeInfoNetworkInterface.Builder> op) {

		op.add(Builder::address, JsonpDeserializer.stringDeserializer(), "address");
		op.add(Builder::macAddress, JsonpDeserializer.stringDeserializer(), "mac_address");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
