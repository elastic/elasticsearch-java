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
import java.util.List;
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

// typedef: nodes.info.NodeInfoSettingsNetwork

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.NodeInfoSettingsNetwork">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoSettingsNetwork implements JsonpSerializable {
	private final List<String> host;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoSettingsNetwork(Builder builder) {

		this.host = ApiTypeHelper.unmodifiable(builder.host);

	}

	public static NodeInfoSettingsNetwork of(Function<Builder, ObjectBuilder<NodeInfoSettingsNetwork>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code host}
	 */
	public final List<String> host() {
		return this.host;
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

		if (ApiTypeHelper.isDefined(this.host)) {
			generator.writeKey("host");
			generator.writeStartArray();
			for (String item0 : this.host) {
				generator.write(item0);

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
	 * Builder for {@link NodeInfoSettingsNetwork}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NodeInfoSettingsNetwork> {
		@Nullable
		private List<String> host;

		/**
		 * API name: {@code host}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>host</code>.
		 */
		public final Builder host(List<String> list) {
			this.host = _listAddAll(this.host, list);
			return this;
		}

		/**
		 * API name: {@code host}
		 * <p>
		 * Adds one or more values to <code>host</code>.
		 */
		public final Builder host(String value, String... values) {
			this.host = _listAdd(this.host, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsNetwork}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsNetwork build() {
			_checkSingleUse();

			return new NodeInfoSettingsNetwork(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettingsNetwork}
	 */
	public static final JsonpDeserializer<NodeInfoSettingsNetwork> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoSettingsNetwork::setupNodeInfoSettingsNetworkDeserializer);

	protected static void setupNodeInfoSettingsNetworkDeserializer(
			ObjectDeserializer<NodeInfoSettingsNetwork.Builder> op) {

		op.add(Builder::host, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "host");

	}

}
