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

// typedef: nodes.info.NodeInfoIngestDownloader

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.NodeInfoIngestDownloader">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoIngestDownloader implements JsonpSerializable {
	private final String enabled;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoIngestDownloader(Builder builder) {

		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled");

	}

	public static NodeInfoIngestDownloader of(Function<Builder, ObjectBuilder<NodeInfoIngestDownloader>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public final String enabled() {
		return this.enabled;
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

		generator.writeKey("enabled");
		generator.write(this.enabled);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoIngestDownloader}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NodeInfoIngestDownloader> {
		private String enabled;

		/**
		 * Required - API name: {@code enabled}
		 */
		public final Builder enabled(String value) {
			this.enabled = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoIngestDownloader}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoIngestDownloader build() {
			_checkSingleUse();

			return new NodeInfoIngestDownloader(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoIngestDownloader}
	 */
	public static final JsonpDeserializer<NodeInfoIngestDownloader> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoIngestDownloader::setupNodeInfoIngestDownloaderDeserializer);

	protected static void setupNodeInfoIngestDownloaderDeserializer(
			ObjectDeserializer<NodeInfoIngestDownloader.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.stringDeserializer(), "enabled");

	}

}
