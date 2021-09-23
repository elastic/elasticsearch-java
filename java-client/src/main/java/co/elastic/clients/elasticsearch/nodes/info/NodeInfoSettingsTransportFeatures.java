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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSettingsTransportFeatures
public final class NodeInfoSettingsTransportFeatures implements JsonpSerializable {
	private final String xPack;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoSettingsTransportFeatures(Builder builder) {

		this.xPack = Objects.requireNonNull(builder.xPack, "x-pack");

	}

	/**
	 * API name: {@code x-pack}
	 */
	public String xPack() {
		return this.xPack;
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

		generator.writeKey("x-pack");
		generator.write(this.xPack);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsTransportFeatures}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSettingsTransportFeatures> {
		private String xPack;

		/**
		 * API name: {@code x-pack}
		 */
		public Builder xPack(String value) {
			this.xPack = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsTransportFeatures}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsTransportFeatures build() {

			return new NodeInfoSettingsTransportFeatures(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettingsTransportFeatures}
	 */
	public static final JsonpDeserializer<NodeInfoSettingsTransportFeatures> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					NodeInfoSettingsTransportFeatures::setupNodeInfoSettingsTransportFeaturesDeserializer);

	protected static void setupNodeInfoSettingsTransportFeaturesDeserializer(
			DelegatingDeserializer<NodeInfoSettingsTransportFeatures.Builder> op) {

		op.add(Builder::xPack, JsonpDeserializer.stringDeserializer(), "x-pack");

	}

}
