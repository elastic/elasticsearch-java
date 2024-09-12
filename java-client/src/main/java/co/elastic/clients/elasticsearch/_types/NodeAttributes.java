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

package co.elastic.clients.elasticsearch._types;

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

// typedef: _types.NodeAttributes

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.NodeAttributes">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeAttributes implements JsonpSerializable {
	private final Map<String, String> attributes;

	private final String ephemeralId;

	@Nullable
	private final String id;

	private final String name;

	private final String transportAddress;

	// ---------------------------------------------------------------------------------------------

	private NodeAttributes(Builder builder) {

		this.attributes = ApiTypeHelper.unmodifiableRequired(builder.attributes, this, "attributes");
		this.ephemeralId = ApiTypeHelper.requireNonNull(builder.ephemeralId, this, "ephemeralId");
		this.id = builder.id;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.transportAddress = ApiTypeHelper.requireNonNull(builder.transportAddress, this, "transportAddress");

	}

	public static NodeAttributes of(Function<Builder, ObjectBuilder<NodeAttributes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Lists node attributes.
	 * <p>
	 * API name: {@code attributes}
	 */
	public final Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * Required - The ephemeral ID of the node.
	 * <p>
	 * API name: {@code ephemeral_id}
	 */
	public final String ephemeralId() {
		return this.ephemeralId;
	}

	/**
	 * The unique identifier of the node.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Required - The unique identifier of the node.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The host and port where transport HTTP connections are accepted.
	 * <p>
	 * API name: {@code transport_address}
	 */
	public final String transportAddress() {
		return this.transportAddress;
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

		if (ApiTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("ephemeral_id");
		generator.write(this.ephemeralId);

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeAttributes}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeAttributes> {
		private Map<String, String> attributes;

		private String ephemeralId;

		@Nullable
		private String id;

		private String name;

		private String transportAddress;

		/**
		 * Required - Lists node attributes.
		 * <p>
		 * API name: {@code attributes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>attributes</code>.
		 */
		public final Builder attributes(Map<String, String> map) {
			this.attributes = _mapPutAll(this.attributes, map);
			return this;
		}

		/**
		 * Required - Lists node attributes.
		 * <p>
		 * API name: {@code attributes}
		 * <p>
		 * Adds an entry to <code>attributes</code>.
		 */
		public final Builder attributes(String key, String value) {
			this.attributes = _mapPut(this.attributes, key, value);
			return this;
		}

		/**
		 * Required - The ephemeral ID of the node.
		 * <p>
		 * API name: {@code ephemeral_id}
		 */
		public final Builder ephemeralId(String value) {
			this.ephemeralId = value;
			return this;
		}

		/**
		 * The unique identifier of the node.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the node.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The host and port where transport HTTP connections are accepted.
		 * <p>
		 * API name: {@code transport_address}
		 */
		public final Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeAttributes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeAttributes build() {
			_checkSingleUse();

			return new NodeAttributes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeAttributes}
	 */
	public static final JsonpDeserializer<NodeAttributes> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeAttributes::setupNodeAttributesDeserializer);

	protected static void setupNodeAttributesDeserializer(ObjectDeserializer<NodeAttributes.Builder> op) {

		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::ephemeralId, JsonpDeserializer.stringDeserializer(), "ephemeral_id");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");

	}

}
