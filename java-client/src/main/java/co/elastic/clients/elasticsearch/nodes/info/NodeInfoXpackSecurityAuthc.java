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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: nodes.info.NodeInfoXpackSecurityAuthc

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.NodeInfoXpackSecurityAuthc">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoXpackSecurityAuthc implements JsonpSerializable {
	@Nullable
	private final NodeInfoXpackSecurityAuthcRealms realms;

	@Nullable
	private final NodeInfoXpackSecurityAuthcToken token;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoXpackSecurityAuthc(Builder builder) {

		this.realms = builder.realms;
		this.token = builder.token;

	}

	public static NodeInfoXpackSecurityAuthc of(Function<Builder, ObjectBuilder<NodeInfoXpackSecurityAuthc>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code realms}
	 */
	@Nullable
	public final NodeInfoXpackSecurityAuthcRealms realms() {
		return this.realms;
	}

	/**
	 * API name: {@code token}
	 */
	@Nullable
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

		if (this.realms != null) {
			generator.writeKey("realms");
			this.realms.serialize(generator, mapper);

		}
		if (this.token != null) {
			generator.writeKey("token");
			this.token.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackSecurityAuthc}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NodeInfoXpackSecurityAuthc> {
		@Nullable
		private NodeInfoXpackSecurityAuthcRealms realms;

		@Nullable
		private NodeInfoXpackSecurityAuthcToken token;

		/**
		 * API name: {@code realms}
		 */
		public final Builder realms(@Nullable NodeInfoXpackSecurityAuthcRealms value) {
			this.realms = value;
			return this;
		}

		/**
		 * API name: {@code realms}
		 */
		public final Builder realms(
				Function<NodeInfoXpackSecurityAuthcRealms.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealms>> fn) {
			return this.realms(fn.apply(new NodeInfoXpackSecurityAuthcRealms.Builder()).build());
		}

		/**
		 * API name: {@code token}
		 */
		public final Builder token(@Nullable NodeInfoXpackSecurityAuthcToken value) {
			this.token = value;
			return this;
		}

		/**
		 * API name: {@code token}
		 */
		public final Builder token(
				Function<NodeInfoXpackSecurityAuthcToken.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcToken>> fn) {
			return this.token(fn.apply(new NodeInfoXpackSecurityAuthcToken.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
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
