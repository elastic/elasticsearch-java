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

// typedef: nodes.info.NodeInfoScript

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.info.NodeInfoScript">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoScript implements JsonpSerializable {
	private final String allowedTypes;

	private final String disableMaxCompilationsRate;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoScript(Builder builder) {

		this.allowedTypes = ApiTypeHelper.requireNonNull(builder.allowedTypes, this, "allowedTypes");
		this.disableMaxCompilationsRate = ApiTypeHelper.requireNonNull(builder.disableMaxCompilationsRate, this,
				"disableMaxCompilationsRate");

	}

	public static NodeInfoScript of(Function<Builder, ObjectBuilder<NodeInfoScript>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code allowed_types}
	 */
	public final String allowedTypes() {
		return this.allowedTypes;
	}

	/**
	 * Required - API name: {@code disable_max_compilations_rate}
	 */
	public final String disableMaxCompilationsRate() {
		return this.disableMaxCompilationsRate;
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

		generator.writeKey("allowed_types");
		generator.write(this.allowedTypes);

		generator.writeKey("disable_max_compilations_rate");
		generator.write(this.disableMaxCompilationsRate);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoScript}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeInfoScript> {
		private String allowedTypes;

		private String disableMaxCompilationsRate;

		/**
		 * Required - API name: {@code allowed_types}
		 */
		public final Builder allowedTypes(String value) {
			this.allowedTypes = value;
			return this;
		}

		/**
		 * Required - API name: {@code disable_max_compilations_rate}
		 */
		public final Builder disableMaxCompilationsRate(String value) {
			this.disableMaxCompilationsRate = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoScript}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoScript build() {
			_checkSingleUse();

			return new NodeInfoScript(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoScript}
	 */
	public static final JsonpDeserializer<NodeInfoScript> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoScript::setupNodeInfoScriptDeserializer);

	protected static void setupNodeInfoScriptDeserializer(ObjectDeserializer<NodeInfoScript.Builder> op) {

		op.add(Builder::allowedTypes, JsonpDeserializer.stringDeserializer(), "allowed_types");
		op.add(Builder::disableMaxCompilationsRate, JsonpDeserializer.stringDeserializer(),
				"disable_max_compilations_rate");

	}

}
