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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackSecuritySsl

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.NodeInfoXpackSecuritySsl">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoXpackSecuritySsl implements JsonpSerializable {
	private final Map<String, String> ssl;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoXpackSecuritySsl(Builder builder) {

		this.ssl = ApiTypeHelper.unmodifiableRequired(builder.ssl, this, "ssl");

	}

	public static NodeInfoXpackSecuritySsl of(Function<Builder, ObjectBuilder<NodeInfoXpackSecuritySsl>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code ssl}
	 */
	public final Map<String, String> ssl() {
		return this.ssl;
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

		if (ApiTypeHelper.isDefined(this.ssl)) {
			generator.writeKey("ssl");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.ssl.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
	 * Builder for {@link NodeInfoXpackSecuritySsl}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NodeInfoXpackSecuritySsl> {
		private Map<String, String> ssl;

		/**
		 * Required - API name: {@code ssl}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>ssl</code>.
		 */
		public final Builder ssl(Map<String, String> map) {
			this.ssl = _mapPutAll(this.ssl, map);
			return this;
		}

		/**
		 * Required - API name: {@code ssl}
		 * <p>
		 * Adds an entry to <code>ssl</code>.
		 */
		public final Builder ssl(String key, String value) {
			this.ssl = _mapPut(this.ssl, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoXpackSecuritySsl}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackSecuritySsl build() {
			_checkSingleUse();

			return new NodeInfoXpackSecuritySsl(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoXpackSecuritySsl}
	 */
	public static final JsonpDeserializer<NodeInfoXpackSecuritySsl> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoXpackSecuritySsl::setupNodeInfoXpackSecuritySslDeserializer);

	protected static void setupNodeInfoXpackSecuritySslDeserializer(
			ObjectDeserializer<NodeInfoXpackSecuritySsl.Builder> op) {

		op.add(Builder::ssl, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "ssl");

	}

}
