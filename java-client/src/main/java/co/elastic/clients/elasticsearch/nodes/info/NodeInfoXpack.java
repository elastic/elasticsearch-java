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

import co.elastic.clients.json.JsonData;
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

// typedef: nodes.info.NodeInfoXpack

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.info.NodeInfoXpack">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoXpack implements JsonpSerializable {
	@Nullable
	private final NodeInfoXpackLicense license;

	private final NodeInfoXpackSecurity security;

	private final Map<String, JsonData> notification;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoXpack(Builder builder) {

		this.license = builder.license;
		this.security = ApiTypeHelper.requireNonNull(builder.security, this, "security");
		this.notification = ApiTypeHelper.unmodifiable(builder.notification);

	}

	public static NodeInfoXpack of(Function<Builder, ObjectBuilder<NodeInfoXpack>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code license}
	 */
	@Nullable
	public final NodeInfoXpackLicense license() {
		return this.license;
	}

	/**
	 * Required - API name: {@code security}
	 */
	public final NodeInfoXpackSecurity security() {
		return this.security;
	}

	/**
	 * API name: {@code notification}
	 */
	public final Map<String, JsonData> notification() {
		return this.notification;
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

		if (this.license != null) {
			generator.writeKey("license");
			this.license.serialize(generator, mapper);

		}
		generator.writeKey("security");
		this.security.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.notification)) {
			generator.writeKey("notification");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.notification.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link NodeInfoXpack}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeInfoXpack> {
		@Nullable
		private NodeInfoXpackLicense license;

		private NodeInfoXpackSecurity security;

		@Nullable
		private Map<String, JsonData> notification;

		/**
		 * API name: {@code license}
		 */
		public final Builder license(@Nullable NodeInfoXpackLicense value) {
			this.license = value;
			return this;
		}

		/**
		 * API name: {@code license}
		 */
		public final Builder license(Function<NodeInfoXpackLicense.Builder, ObjectBuilder<NodeInfoXpackLicense>> fn) {
			return this.license(fn.apply(new NodeInfoXpackLicense.Builder()).build());
		}

		/**
		 * Required - API name: {@code security}
		 */
		public final Builder security(NodeInfoXpackSecurity value) {
			this.security = value;
			return this;
		}

		/**
		 * Required - API name: {@code security}
		 */
		public final Builder security(
				Function<NodeInfoXpackSecurity.Builder, ObjectBuilder<NodeInfoXpackSecurity>> fn) {
			return this.security(fn.apply(new NodeInfoXpackSecurity.Builder()).build());
		}

		/**
		 * API name: {@code notification}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>notification</code>.
		 */
		public final Builder notification(Map<String, JsonData> map) {
			this.notification = _mapPutAll(this.notification, map);
			return this;
		}

		/**
		 * API name: {@code notification}
		 * <p>
		 * Adds an entry to <code>notification</code>.
		 */
		public final Builder notification(String key, JsonData value) {
			this.notification = _mapPut(this.notification, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoXpack}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpack build() {
			_checkSingleUse();

			return new NodeInfoXpack(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoXpack}
	 */
	public static final JsonpDeserializer<NodeInfoXpack> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoXpack::setupNodeInfoXpackDeserializer);

	protected static void setupNodeInfoXpackDeserializer(ObjectDeserializer<NodeInfoXpack.Builder> op) {

		op.add(Builder::license, NodeInfoXpackLicense._DESERIALIZER, "license");
		op.add(Builder::security, NodeInfoXpackSecurity._DESERIALIZER, "security");
		op.add(Builder::notification, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "notification");

	}

}
