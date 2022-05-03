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

// typedef: nodes.info.NodeInfoDiscover

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.info.NodeInfoDiscover">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoDiscover implements JsonpSerializable {
	private final String seedHosts;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoDiscover(Builder builder) {

		this.seedHosts = ApiTypeHelper.requireNonNull(builder.seedHosts, this, "seedHosts");

	}

	public static NodeInfoDiscover of(Function<Builder, ObjectBuilder<NodeInfoDiscover>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code seed_hosts}
	 */
	public final String seedHosts() {
		return this.seedHosts;
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

		generator.writeKey("seed_hosts");
		generator.write(this.seedHosts);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoDiscover}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeInfoDiscover> {
		private String seedHosts;

		/**
		 * Required - API name: {@code seed_hosts}
		 */
		public final Builder seedHosts(String value) {
			this.seedHosts = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoDiscover}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoDiscover build() {
			_checkSingleUse();

			return new NodeInfoDiscover(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoDiscover}
	 */
	public static final JsonpDeserializer<NodeInfoDiscover> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoDiscover::setupNodeInfoDiscoverDeserializer);

	protected static void setupNodeInfoDiscoverDeserializer(ObjectDeserializer<NodeInfoDiscover.Builder> op) {

		op.add(Builder::seedHosts, JsonpDeserializer.stringDeserializer(), "seed_hosts");

	}

}
