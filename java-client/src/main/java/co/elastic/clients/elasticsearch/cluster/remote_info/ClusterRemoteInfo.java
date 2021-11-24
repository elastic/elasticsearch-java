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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: cluster.remote_info.ClusterRemoteInfo
// union type: InternalTag[tag=mode]
@JsonpDeserializable
public class ClusterRemoteInfo
		implements
			TaggedUnion<ClusterRemoteInfo.Kind, ClusterRemoteInfoVariant>,
			JsonpSerializable {

	/**
	 * {@link ClusterRemoteInfo} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Proxy("proxy"),

		Sniff("sniff"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final ClusterRemoteInfoVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final ClusterRemoteInfoVariant _get() {
		return _value;
	}

	public ClusterRemoteInfo(ClusterRemoteInfoVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._clusterRemoteInfoKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private ClusterRemoteInfo(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static ClusterRemoteInfo of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code proxy}?
	 */
	public boolean isProxy() {
		return _kind == Kind.Proxy;
	}

	/**
	 * Get the {@code proxy} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code proxy} kind.
	 */
	public ClusterRemoteProxyInfo proxy() {
		return TaggedUnionUtils.get(this, Kind.Proxy);
	}

	/**
	 * Is this variant instance of kind {@code sniff}?
	 */
	public boolean isSniff() {
		return _kind == Kind.Sniff;
	}

	/**
	 * Get the {@code sniff} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sniff} kind.
	 */
	public ClusterRemoteSniffInfo sniff() {
		return TaggedUnionUtils.get(this, Kind.Sniff);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClusterRemoteInfo> {
		private Kind _kind;
		private ClusterRemoteInfoVariant _value;

		public ObjectBuilder<ClusterRemoteInfo> proxy(ClusterRemoteProxyInfo v) {
			this._kind = Kind.Proxy;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ClusterRemoteInfo> proxy(Consumer<ClusterRemoteProxyInfo.Builder> fn) {
			ClusterRemoteProxyInfo.Builder builder = new ClusterRemoteProxyInfo.Builder();
			fn.accept(builder);
			return this.proxy(builder.build());
		}

		public ObjectBuilder<ClusterRemoteInfo> sniff(ClusterRemoteSniffInfo v) {
			this._kind = Kind.Sniff;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ClusterRemoteInfo> sniff(Consumer<ClusterRemoteSniffInfo.Builder> fn) {
			ClusterRemoteSniffInfo.Builder builder = new ClusterRemoteSniffInfo.Builder();
			fn.accept(builder);
			return this.sniff(builder.build());
		}

		public ClusterRemoteInfo build() {
			_checkSingleUse();
			return new ClusterRemoteInfo(this);
		}

	}

	protected static void setupClusterRemoteInfoDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::proxy, ClusterRemoteProxyInfo._DESERIALIZER, "proxy");
		op.add(Builder::sniff, ClusterRemoteSniffInfo._DESERIALIZER, "sniff");

		op.setTypeProperty("mode", null);

	}

	public static final JsonpDeserializer<ClusterRemoteInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterRemoteInfo::setupClusterRemoteInfoDeserializer, Builder::build);
}
