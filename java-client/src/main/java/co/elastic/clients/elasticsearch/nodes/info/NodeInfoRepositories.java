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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoRepositories
@JsonpDeserializable
public class NodeInfoRepositories implements JsonpSerializable {
	private final NodeInfoRepositoriesUrl url;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoRepositories(Builder builder) {

		this.url = ModelTypeHelper.requireNonNull(builder.url, this, "url");

	}

	public static NodeInfoRepositories of(Function<Builder, ObjectBuilder<NodeInfoRepositories>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code url}
	 */
	public final NodeInfoRepositoriesUrl url() {
		return this.url;
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

		generator.writeKey("url");
		this.url.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoRepositories}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoRepositories> {
		private NodeInfoRepositoriesUrl url;

		/**
		 * Required - API name: {@code url}
		 */
		public final Builder url(NodeInfoRepositoriesUrl value) {
			this.url = value;
			return this;
		}

		/**
		 * Required - API name: {@code url}
		 */
		public final Builder url(Function<NodeInfoRepositoriesUrl.Builder, ObjectBuilder<NodeInfoRepositoriesUrl>> fn) {
			return this.url(fn.apply(new NodeInfoRepositoriesUrl.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoRepositories}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoRepositories build() {
			_checkSingleUse();

			return new NodeInfoRepositories(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoRepositories}
	 */
	public static final JsonpDeserializer<NodeInfoRepositories> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoRepositories::setupNodeInfoRepositoriesDeserializer, Builder::build);

	protected static void setupNodeInfoRepositoriesDeserializer(
			DelegatingDeserializer<NodeInfoRepositories.Builder> op) {

		op.add(Builder::url, NodeInfoRepositoriesUrl._DESERIALIZER, "url");

	}

}
