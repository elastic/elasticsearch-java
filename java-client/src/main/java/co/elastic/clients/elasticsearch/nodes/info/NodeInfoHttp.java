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
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoHttp

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.info.NodeInfoHttp">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoHttp implements JsonpSerializable {
	private final List<String> boundAddress;

	@Nullable
	private final String maxContentLength;

	private final long maxContentLengthInBytes;

	private final String publishAddress;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoHttp(Builder builder) {

		this.boundAddress = ApiTypeHelper.unmodifiableRequired(builder.boundAddress, this, "boundAddress");
		this.maxContentLength = builder.maxContentLength;
		this.maxContentLengthInBytes = ApiTypeHelper.requireNonNull(builder.maxContentLengthInBytes, this,
				"maxContentLengthInBytes");
		this.publishAddress = ApiTypeHelper.requireNonNull(builder.publishAddress, this, "publishAddress");

	}

	public static NodeInfoHttp of(Function<Builder, ObjectBuilder<NodeInfoHttp>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code bound_address}
	 */
	public final List<String> boundAddress() {
		return this.boundAddress;
	}

	/**
	 * API name: {@code max_content_length}
	 */
	@Nullable
	public final String maxContentLength() {
		return this.maxContentLength;
	}

	/**
	 * Required - API name: {@code max_content_length_in_bytes}
	 */
	public final long maxContentLengthInBytes() {
		return this.maxContentLengthInBytes;
	}

	/**
	 * Required - API name: {@code publish_address}
	 */
	public final String publishAddress() {
		return this.publishAddress;
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

		if (ApiTypeHelper.isDefined(this.boundAddress)) {
			generator.writeKey("bound_address");
			generator.writeStartArray();
			for (String item0 : this.boundAddress) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.maxContentLength != null) {
			generator.writeKey("max_content_length");
			generator.write(this.maxContentLength);

		}
		generator.writeKey("max_content_length_in_bytes");
		generator.write(this.maxContentLengthInBytes);

		generator.writeKey("publish_address");
		generator.write(this.publishAddress);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoHttp}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeInfoHttp> {
		private List<String> boundAddress;

		@Nullable
		private String maxContentLength;

		private Long maxContentLengthInBytes;

		private String publishAddress;

		/**
		 * Required - API name: {@code bound_address}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>boundAddress</code>.
		 */
		public final Builder boundAddress(List<String> list) {
			this.boundAddress = _listAddAll(this.boundAddress, list);
			return this;
		}

		/**
		 * Required - API name: {@code bound_address}
		 * <p>
		 * Adds one or more values to <code>boundAddress</code>.
		 */
		public final Builder boundAddress(String value, String... values) {
			this.boundAddress = _listAdd(this.boundAddress, value, values);
			return this;
		}

		/**
		 * API name: {@code max_content_length}
		 */
		public final Builder maxContentLength(@Nullable String value) {
			this.maxContentLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_content_length_in_bytes}
		 */
		public final Builder maxContentLengthInBytes(long value) {
			this.maxContentLengthInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code publish_address}
		 */
		public final Builder publishAddress(String value) {
			this.publishAddress = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoHttp}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoHttp build() {
			_checkSingleUse();

			return new NodeInfoHttp(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoHttp}
	 */
	public static final JsonpDeserializer<NodeInfoHttp> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoHttp::setupNodeInfoHttpDeserializer);

	protected static void setupNodeInfoHttpDeserializer(ObjectDeserializer<NodeInfoHttp.Builder> op) {

		op.add(Builder::boundAddress, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"bound_address");
		op.add(Builder::maxContentLength, JsonpDeserializer.stringDeserializer(), "max_content_length");
		op.add(Builder::maxContentLengthInBytes, JsonpDeserializer.longDeserializer(), "max_content_length_in_bytes");
		op.add(Builder::publishAddress, JsonpDeserializer.stringDeserializer(), "publish_address");

	}

}
