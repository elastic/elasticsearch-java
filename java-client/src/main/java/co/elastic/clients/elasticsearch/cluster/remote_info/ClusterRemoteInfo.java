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

package co.elastic.clients.elasticsearch.cluster.remote_info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.remote_info.ClusterRemoteInfo
@JsonpDeserializable
public class ClusterRemoteInfo implements TaggedUnion<JsonpSerializable>, JsonpSerializable {

	public static final String SNIFF = "sniff";
	public static final String PROXY = "proxy";

	// Tagged union implementation

	private final String _type;
	private final JsonpSerializable _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public JsonpSerializable _get() {
		return _value;
	}

	public ClusterRemoteInfo(ClusterRemoteInfoVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	private ClusterRemoteInfo(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	/**
	 * Get the {@code sniff} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sniff} kind.
	 */
	public ClusterRemoteSniffInfo sniff() {
		return TaggedUnionUtils.get(this, SNIFF);
	}

	/**
	 * Get the {@code proxy} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code proxy} kind.
	 */
	public ClusterRemoteProxyInfo proxy() {
		return TaggedUnionUtils.get(this, PROXY);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		_value.serialize(generator, mapper);

	}

	public static class Builder {
		private String _type;
		private JsonpSerializable _value;

		public ObjectBuilder<ClusterRemoteInfo> sniff(ClusterRemoteSniffInfo v) {
			this._type = SNIFF;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<ClusterRemoteInfo> sniff(
				Function<ClusterRemoteSniffInfo.Builder, ObjectBuilder<ClusterRemoteSniffInfo>> f) {
			return this.sniff(f.apply(new ClusterRemoteSniffInfo.Builder()).build());
		}

		public ObjectBuilder<ClusterRemoteInfo> proxy(ClusterRemoteProxyInfo v) {
			this._type = PROXY;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<ClusterRemoteInfo> proxy(
				Function<ClusterRemoteProxyInfo.Builder, ObjectBuilder<ClusterRemoteProxyInfo>> f) {
			return this.proxy(f.apply(new ClusterRemoteProxyInfo.Builder()).build());
		}

		protected ClusterRemoteInfo build() {
			return new ClusterRemoteInfo(this);
		}

	}

	protected static void setupClusterRemoteInfoDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::sniff, ClusterRemoteSniffInfo._DESERIALIZER, "sniff");
		op.add(Builder::proxy, ClusterRemoteProxyInfo._DESERIALIZER, "proxy");

		op.setTypeProperty("mode");
	}

	public static final JsonpDeserializer<ClusterRemoteInfo> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			ClusterRemoteInfo::setupClusterRemoteInfoDeserializer, Builder::build);
}
