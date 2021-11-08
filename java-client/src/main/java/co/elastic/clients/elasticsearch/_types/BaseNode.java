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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _spec_utils.BaseNode

public abstract class BaseNode implements JsonpSerializable {
	private final Map<String, String> attributes;

	private final String host;

	private final String ip;

	private final String name;

	private final List<NodeRole> roles;

	private final String transportAddress;

	// ---------------------------------------------------------------------------------------------

	protected BaseNode(AbstractBuilder<?> builder) {

		this.attributes = ModelTypeHelper.unmodifiableRequired(builder.attributes, this, "attributes");
		this.host = ModelTypeHelper.requireNonNull(builder.host, this, "host");
		this.ip = ModelTypeHelper.requireNonNull(builder.ip, this, "ip");
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.roles = ModelTypeHelper.unmodifiable(builder.roles);
		this.transportAddress = ModelTypeHelper.requireNonNull(builder.transportAddress, this, "transportAddress");

	}

	/**
	 * Required - API name: {@code attributes}
	 */
	public final Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * Required - API name: {@code host}
	 */
	public final String host() {
		return this.host;
	}

	/**
	 * Required - API name: {@code ip}
	 */
	public final String ip() {
		return this.ip;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code roles}
	 */
	public final List<NodeRole> roles() {
		return this.roles;
	}

	/**
	 * Required - API name: {@code transport_address}
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

		if (ModelTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("host");
		generator.write(this.host);

		generator.writeKey("ip");
		generator.write(this.ip);

		generator.writeKey("name");
		generator.write(this.name);

		if (ModelTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (NodeRole item0 : this.roles) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
		private Map<String, String> attributes;

		private String host;

		private String ip;

		private String name;

		@Nullable
		private List<NodeRole> roles;

		private String transportAddress;

		/**
		 * Required - API name: {@code attributes}
		 */
		public final BuilderT attributes(Map<String, String> value) {
			this.attributes = value;
			return self();
		}

		/**
		 * Required - API name: {@code host}
		 */
		public final BuilderT host(String value) {
			this.host = value;
			return self();
		}

		/**
		 * Required - API name: {@code ip}
		 */
		public final BuilderT ip(String value) {
			this.ip = value;
			return self();
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final BuilderT name(String value) {
			this.name = value;
			return self();
		}

		/**
		 * API name: {@code roles}
		 */
		public final BuilderT roles(@Nullable List<NodeRole> value) {
			this.roles = value;
			return self();
		}

		/**
		 * API name: {@code roles}
		 */
		public final BuilderT roles(NodeRole... value) {
			this.roles = Arrays.asList(value);
			return self();
		}

		/**
		 * Required - API name: {@code transport_address}
		 */
		public final BuilderT transportAddress(String value) {
			this.transportAddress = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupBaseNodeDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::attributes,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "attributes");
		op.add(AbstractBuilder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(AbstractBuilder::ip, JsonpDeserializer.stringDeserializer(), "ip");
		op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(AbstractBuilder::roles, JsonpDeserializer.arrayDeserializer(NodeRole._DESERIALIZER), "roles");
		op.add(AbstractBuilder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");

	}

}
