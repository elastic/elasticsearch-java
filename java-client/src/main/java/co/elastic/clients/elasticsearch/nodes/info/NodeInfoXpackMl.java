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
import java.lang.Boolean;
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

// typedef: nodes.info.NodeInfoXpackMl

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.info.NodeInfoXpackMl">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoXpackMl implements JsonpSerializable {
	@Nullable
	private final Boolean useAutoMachineMemoryPercent;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoXpackMl(Builder builder) {

		this.useAutoMachineMemoryPercent = builder.useAutoMachineMemoryPercent;

	}

	public static NodeInfoXpackMl of(Function<Builder, ObjectBuilder<NodeInfoXpackMl>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code use_auto_machine_memory_percent}
	 */
	@Nullable
	public final Boolean useAutoMachineMemoryPercent() {
		return this.useAutoMachineMemoryPercent;
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

		if (this.useAutoMachineMemoryPercent != null) {
			generator.writeKey("use_auto_machine_memory_percent");
			generator.write(this.useAutoMachineMemoryPercent);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackMl}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeInfoXpackMl> {
		@Nullable
		private Boolean useAutoMachineMemoryPercent;

		/**
		 * API name: {@code use_auto_machine_memory_percent}
		 */
		public final Builder useAutoMachineMemoryPercent(@Nullable Boolean value) {
			this.useAutoMachineMemoryPercent = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoXpackMl}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackMl build() {
			_checkSingleUse();

			return new NodeInfoXpackMl(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoXpackMl}
	 */
	public static final JsonpDeserializer<NodeInfoXpackMl> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoXpackMl::setupNodeInfoXpackMlDeserializer);

	protected static void setupNodeInfoXpackMlDeserializer(ObjectDeserializer<NodeInfoXpackMl.Builder> op) {

		op.add(Builder::useAutoMachineMemoryPercent, JsonpDeserializer.booleanDeserializer(),
				"use_auto_machine_memory_percent");

	}

}
