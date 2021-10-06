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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: nodes.info.NodeProcessInfo
@JsonpDeserializable
public final class NodeProcessInfo implements JsonpSerializable {
	private final long id;

	private final boolean mlockall;

	private final long refreshIntervalInMillis;

	// ---------------------------------------------------------------------------------------------

	public NodeProcessInfo(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.mlockall = Objects.requireNonNull(builder.mlockall, "mlockall");
		this.refreshIntervalInMillis = Objects.requireNonNull(builder.refreshIntervalInMillis,
				"refresh_interval_in_millis");

	}

	public NodeProcessInfo(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Process identifier (PID)
	 * <p>
	 * API name: {@code id}
	 */
	public long id() {
		return this.id;
	}

	/**
	 * Required - Indicates if the process address space has been successfully
	 * locked in memory
	 * <p>
	 * API name: {@code mlockall}
	 */
	public boolean mlockall() {
		return this.mlockall;
	}

	/**
	 * Required - Refresh interval for the process statistics
	 * <p>
	 * API name: {@code refresh_interval_in_millis}
	 */
	public long refreshIntervalInMillis() {
		return this.refreshIntervalInMillis;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("mlockall");
		generator.write(this.mlockall);

		generator.writeKey("refresh_interval_in_millis");
		generator.write(this.refreshIntervalInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeProcessInfo}.
	 */
	public static class Builder implements ObjectBuilder<NodeProcessInfo> {
		private Long id;

		private Boolean mlockall;

		private Long refreshIntervalInMillis;

		/**
		 * Required - Process identifier (PID)
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(long value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - Indicates if the process address space has been successfully
		 * locked in memory
		 * <p>
		 * API name: {@code mlockall}
		 */
		public Builder mlockall(boolean value) {
			this.mlockall = value;
			return this;
		}

		/**
		 * Required - Refresh interval for the process statistics
		 * <p>
		 * API name: {@code refresh_interval_in_millis}
		 */
		public Builder refreshIntervalInMillis(long value) {
			this.refreshIntervalInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link NodeProcessInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeProcessInfo build() {

			return new NodeProcessInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeProcessInfo}
	 */
	public static final JsonpDeserializer<NodeProcessInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeProcessInfo::setupNodeProcessInfoDeserializer, Builder::build);

	protected static void setupNodeProcessInfoDeserializer(DelegatingDeserializer<NodeProcessInfo.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.longDeserializer(), "id");
		op.add(Builder::mlockall, JsonpDeserializer.booleanDeserializer(), "mlockall");
		op.add(Builder::refreshIntervalInMillis, JsonpDeserializer.longDeserializer(), "refresh_interval_in_millis");

	}

}
