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

package co.elastic.clients.elasticsearch.cat.master;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.master.MasterRecord

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cat.master.MasterRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class MasterRecord implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final String host;

	@Nullable
	private final String ip;

	@Nullable
	private final String node;

	// ---------------------------------------------------------------------------------------------

	private MasterRecord(Builder builder) {

		this.id = builder.id;
		this.host = builder.host;
		this.ip = builder.ip;
		this.node = builder.node;

	}

	public static MasterRecord of(Function<Builder, ObjectBuilder<MasterRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * node id
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * host name
	 * <p>
	 * API name: {@code host}
	 */
	@Nullable
	public final String host() {
		return this.host;
	}

	/**
	 * ip address
	 * <p>
	 * API name: {@code ip}
	 */
	@Nullable
	public final String ip() {
		return this.ip;
	}

	/**
	 * node name
	 * <p>
	 * API name: {@code node}
	 */
	@Nullable
	public final String node() {
		return this.node;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.host != null) {
			generator.writeKey("host");
			generator.write(this.host);

		}
		if (this.ip != null) {
			generator.writeKey("ip");
			generator.write(this.ip);

		}
		if (this.node != null) {
			generator.writeKey("node");
			generator.write(this.node);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MasterRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MasterRecord> {
		@Nullable
		private String id;

		@Nullable
		private String host;

		@Nullable
		private String ip;

		@Nullable
		private String node;

		/**
		 * node id
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * host name
		 * <p>
		 * API name: {@code host}
		 */
		public final Builder host(@Nullable String value) {
			this.host = value;
			return this;
		}

		/**
		 * ip address
		 * <p>
		 * API name: {@code ip}
		 */
		public final Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * node name
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(@Nullable String value) {
			this.node = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MasterRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MasterRecord build() {
			_checkSingleUse();

			return new MasterRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MasterRecord}
	 */
	public static final JsonpDeserializer<MasterRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MasterRecord::setupMasterRecordDeserializer);

	protected static void setupMasterRecordDeserializer(ObjectDeserializer<MasterRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host", "h");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node", "n");

	}

}
