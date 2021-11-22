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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackSecurityAuthc
@JsonpDeserializable
public class NodeInfoXpackSecurityAuthc implements JsonpSerializable {
	private final NodeInfoXpackSecurityAuthcRealms realms;

	private final NodeInfoXpackSecurityAuthcToken token;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoXpackSecurityAuthc(Builder builder) {

		this.realms = ModelTypeHelper.requireNonNull(builder.realms, this, "realms");
		this.token = ModelTypeHelper.requireNonNull(builder.token, this, "token");

	}

	public static NodeInfoXpackSecurityAuthc of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code realms}
	 */
	public final NodeInfoXpackSecurityAuthcRealms realms() {
		return this.realms;
	}

	/**
	 * Required - API name: {@code token}
	 */
	public final NodeInfoXpackSecurityAuthcToken token() {
		return this.token;
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

		generator.writeKey("realms");
		this.realms.serialize(generator, mapper);

		generator.writeKey("token");
		this.token.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackSecurityAuthc}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoXpackSecurityAuthc> {
		private NodeInfoXpackSecurityAuthcRealms realms;

		private NodeInfoXpackSecurityAuthcToken token;

		/**
		 * Required - API name: {@code realms}
		 */
		public final Builder realms(NodeInfoXpackSecurityAuthcRealms value) {
			this.realms = value;
			return this;
		}

		/**
		 * Required - API name: {@code realms}
		 */
		public final Builder realms(Consumer<NodeInfoXpackSecurityAuthcRealms.Builder> fn) {
			NodeInfoXpackSecurityAuthcRealms.Builder builder = new NodeInfoXpackSecurityAuthcRealms.Builder();
			fn.accept(builder);
			return this.realms(builder.build());
		}

		/**
		 * Required - API name: {@code token}
		 */
		public final Builder token(NodeInfoXpackSecurityAuthcToken value) {
			this.token = value;
			return this;
		}

		/**
		 * Required - API name: {@code token}
		 */
		public final Builder token(Consumer<NodeInfoXpackSecurityAuthcToken.Builder> fn) {
			NodeInfoXpackSecurityAuthcToken.Builder builder = new NodeInfoXpackSecurityAuthcToken.Builder();
			fn.accept(builder);
			return this.token(builder.build());
		}

		/**
		 * Builds a {@link NodeInfoXpackSecurityAuthc}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackSecurityAuthc build() {
			_checkSingleUse();

			return new NodeInfoXpackSecurityAuthc(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoXpackSecurityAuthc}
	 */
	public static final JsonpDeserializer<NodeInfoXpackSecurityAuthc> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoXpackSecurityAuthc::setupNodeInfoXpackSecurityAuthcDeserializer);

	protected static void setupNodeInfoXpackSecurityAuthcDeserializer(
			ObjectDeserializer<NodeInfoXpackSecurityAuthc.Builder> op) {

		op.add(Builder::realms, NodeInfoXpackSecurityAuthcRealms._DESERIALIZER, "realms");
		op.add(Builder::token, NodeInfoXpackSecurityAuthcToken._DESERIALIZER, "token");

	}

}
