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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSettingsTransport
@JsonpDeserializable
public final class NodeInfoSettingsTransport implements JsonpSerializable {
	private final NodeInfoSettingsTransportType type;

	@Nullable
	private final String typeDefault;

	@Nullable
	private final NodeInfoSettingsTransportFeatures features;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoSettingsTransport(Builder builder) {

		this.type = Objects.requireNonNull(builder.type, "type");
		this.typeDefault = builder.typeDefault;
		this.features = builder.features;

	}

	public NodeInfoSettingsTransport(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code type}
	 */
	public NodeInfoSettingsTransportType type() {
		return this.type;
	}

	/**
	 * API name: {@code type.default}
	 */
	@Nullable
	public String typeDefault() {
		return this.typeDefault;
	}

	/**
	 * API name: {@code features}
	 */
	@Nullable
	public NodeInfoSettingsTransportFeatures features() {
		return this.features;
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

		generator.writeKey("type");
		this.type.serialize(generator, mapper);

		if (this.typeDefault != null) {

			generator.writeKey("type.default");
			generator.write(this.typeDefault);

		}
		if (this.features != null) {

			generator.writeKey("features");
			this.features.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsTransport}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSettingsTransport> {
		private NodeInfoSettingsTransportType type;

		@Nullable
		private String typeDefault;

		@Nullable
		private NodeInfoSettingsTransportFeatures features;

		/**
		 * API name: {@code type}
		 */
		public Builder type(NodeInfoSettingsTransportType value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(
				Function<NodeInfoSettingsTransportType.Builder, ObjectBuilder<NodeInfoSettingsTransportType>> fn) {
			return this.type(fn.apply(new NodeInfoSettingsTransportType.Builder()).build());
		}

		/**
		 * API name: {@code type.default}
		 */
		public Builder typeDefault(@Nullable String value) {
			this.typeDefault = value;
			return this;
		}

		/**
		 * API name: {@code features}
		 */
		public Builder features(@Nullable NodeInfoSettingsTransportFeatures value) {
			this.features = value;
			return this;
		}

		/**
		 * API name: {@code features}
		 */
		public Builder features(
				Function<NodeInfoSettingsTransportFeatures.Builder, ObjectBuilder<NodeInfoSettingsTransportFeatures>> fn) {
			return this.features(fn.apply(new NodeInfoSettingsTransportFeatures.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoSettingsTransport}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsTransport build() {

			return new NodeInfoSettingsTransport(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettingsTransport}
	 */
	public static final JsonpDeserializer<NodeInfoSettingsTransport> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoSettingsTransport::setupNodeInfoSettingsTransportDeserializer, Builder::build);

	protected static void setupNodeInfoSettingsTransportDeserializer(
			DelegatingDeserializer<NodeInfoSettingsTransport.Builder> op) {

		op.add(Builder::type, NodeInfoSettingsTransportType._DESERIALIZER, "type");
		op.add(Builder::typeDefault, JsonpDeserializer.stringDeserializer(), "type.default");
		op.add(Builder::features, NodeInfoSettingsTransportFeatures._DESERIALIZER, "features");

	}

}
