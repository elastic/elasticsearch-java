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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackSecurityAuthcRealms

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.NodeInfoXpackSecurityAuthcRealms">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoXpackSecurityAuthcRealms implements JsonpSerializable {
	private final Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> file;

	private final Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> native_;

	private final Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> pki;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoXpackSecurityAuthcRealms(Builder builder) {

		this.file = ApiTypeHelper.unmodifiable(builder.file);
		this.native_ = ApiTypeHelper.unmodifiable(builder.native_);
		this.pki = ApiTypeHelper.unmodifiable(builder.pki);

	}

	public static NodeInfoXpackSecurityAuthcRealms of(
			Function<Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealms>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code file}
	 */
	public final Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> file() {
		return this.file;
	}

	/**
	 * API name: {@code native}
	 */
	public final Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> native_() {
		return this.native_;
	}

	/**
	 * API name: {@code pki}
	 */
	public final Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> pki() {
		return this.pki;
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

		if (ApiTypeHelper.isDefined(this.file)) {
			generator.writeKey("file");
			generator.writeStartObject();
			for (Map.Entry<String, NodeInfoXpackSecurityAuthcRealmsStatus> item0 : this.file.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.native_)) {
			generator.writeKey("native");
			generator.writeStartObject();
			for (Map.Entry<String, NodeInfoXpackSecurityAuthcRealmsStatus> item0 : this.native_.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.pki)) {
			generator.writeKey("pki");
			generator.writeStartObject();
			for (Map.Entry<String, NodeInfoXpackSecurityAuthcRealmsStatus> item0 : this.pki.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackSecurityAuthcRealms}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NodeInfoXpackSecurityAuthcRealms> {
		@Nullable
		private Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> file;

		@Nullable
		private Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> native_;

		@Nullable
		private Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> pki;

		/**
		 * API name: {@code file}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>file</code>.
		 */
		public final Builder file(Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> map) {
			this.file = _mapPutAll(this.file, map);
			return this;
		}

		/**
		 * API name: {@code file}
		 * <p>
		 * Adds an entry to <code>file</code>.
		 */
		public final Builder file(String key, NodeInfoXpackSecurityAuthcRealmsStatus value) {
			this.file = _mapPut(this.file, key, value);
			return this;
		}

		/**
		 * API name: {@code file}
		 * <p>
		 * Adds an entry to <code>file</code> using a builder lambda.
		 */
		public final Builder file(String key,
				Function<NodeInfoXpackSecurityAuthcRealmsStatus.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealmsStatus>> fn) {
			return file(key, fn.apply(new NodeInfoXpackSecurityAuthcRealmsStatus.Builder()).build());
		}

		/**
		 * API name: {@code native}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>native_</code>.
		 */
		public final Builder native_(Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> map) {
			this.native_ = _mapPutAll(this.native_, map);
			return this;
		}

		/**
		 * API name: {@code native}
		 * <p>
		 * Adds an entry to <code>native_</code>.
		 */
		public final Builder native_(String key, NodeInfoXpackSecurityAuthcRealmsStatus value) {
			this.native_ = _mapPut(this.native_, key, value);
			return this;
		}

		/**
		 * API name: {@code native}
		 * <p>
		 * Adds an entry to <code>native_</code> using a builder lambda.
		 */
		public final Builder native_(String key,
				Function<NodeInfoXpackSecurityAuthcRealmsStatus.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealmsStatus>> fn) {
			return native_(key, fn.apply(new NodeInfoXpackSecurityAuthcRealmsStatus.Builder()).build());
		}

		/**
		 * API name: {@code pki}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>pki</code>.
		 */
		public final Builder pki(Map<String, NodeInfoXpackSecurityAuthcRealmsStatus> map) {
			this.pki = _mapPutAll(this.pki, map);
			return this;
		}

		/**
		 * API name: {@code pki}
		 * <p>
		 * Adds an entry to <code>pki</code>.
		 */
		public final Builder pki(String key, NodeInfoXpackSecurityAuthcRealmsStatus value) {
			this.pki = _mapPut(this.pki, key, value);
			return this;
		}

		/**
		 * API name: {@code pki}
		 * <p>
		 * Adds an entry to <code>pki</code> using a builder lambda.
		 */
		public final Builder pki(String key,
				Function<NodeInfoXpackSecurityAuthcRealmsStatus.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthcRealmsStatus>> fn) {
			return pki(key, fn.apply(new NodeInfoXpackSecurityAuthcRealmsStatus.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoXpackSecurityAuthcRealms}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackSecurityAuthcRealms build() {
			_checkSingleUse();

			return new NodeInfoXpackSecurityAuthcRealms(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoXpackSecurityAuthcRealms}
	 */
	public static final JsonpDeserializer<NodeInfoXpackSecurityAuthcRealms> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoXpackSecurityAuthcRealms::setupNodeInfoXpackSecurityAuthcRealmsDeserializer);

	protected static void setupNodeInfoXpackSecurityAuthcRealmsDeserializer(
			ObjectDeserializer<NodeInfoXpackSecurityAuthcRealms.Builder> op) {

		op.add(Builder::file,
				JsonpDeserializer.stringMapDeserializer(NodeInfoXpackSecurityAuthcRealmsStatus._DESERIALIZER), "file");
		op.add(Builder::native_,
				JsonpDeserializer.stringMapDeserializer(NodeInfoXpackSecurityAuthcRealmsStatus._DESERIALIZER),
				"native");
		op.add(Builder::pki,
				JsonpDeserializer.stringMapDeserializer(NodeInfoXpackSecurityAuthcRealmsStatus._DESERIALIZER), "pki");

	}

}
