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

package co.elastic.clients.elasticsearch.nodes;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.IoStatDevice

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.IoStatDevice">API
 *      specification</a>
 */
@JsonpDeserializable
public class IoStatDevice implements JsonpSerializable {
	@Nullable
	private final String deviceName;

	@Nullable
	private final Long operations;

	@Nullable
	private final Long readKilobytes;

	@Nullable
	private final Long readOperations;

	@Nullable
	private final Long writeKilobytes;

	@Nullable
	private final Long writeOperations;

	// ---------------------------------------------------------------------------------------------

	private IoStatDevice(Builder builder) {

		this.deviceName = builder.deviceName;
		this.operations = builder.operations;
		this.readKilobytes = builder.readKilobytes;
		this.readOperations = builder.readOperations;
		this.writeKilobytes = builder.writeKilobytes;
		this.writeOperations = builder.writeOperations;

	}

	public static IoStatDevice of(Function<Builder, ObjectBuilder<IoStatDevice>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code device_name}
	 */
	@Nullable
	public final String deviceName() {
		return this.deviceName;
	}

	/**
	 * API name: {@code operations}
	 */
	@Nullable
	public final Long operations() {
		return this.operations;
	}

	/**
	 * API name: {@code read_kilobytes}
	 */
	@Nullable
	public final Long readKilobytes() {
		return this.readKilobytes;
	}

	/**
	 * API name: {@code read_operations}
	 */
	@Nullable
	public final Long readOperations() {
		return this.readOperations;
	}

	/**
	 * API name: {@code write_kilobytes}
	 */
	@Nullable
	public final Long writeKilobytes() {
		return this.writeKilobytes;
	}

	/**
	 * API name: {@code write_operations}
	 */
	@Nullable
	public final Long writeOperations() {
		return this.writeOperations;
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

		if (this.deviceName != null) {
			generator.writeKey("device_name");
			generator.write(this.deviceName);

		}
		if (this.operations != null) {
			generator.writeKey("operations");
			generator.write(this.operations);

		}
		if (this.readKilobytes != null) {
			generator.writeKey("read_kilobytes");
			generator.write(this.readKilobytes);

		}
		if (this.readOperations != null) {
			generator.writeKey("read_operations");
			generator.write(this.readOperations);

		}
		if (this.writeKilobytes != null) {
			generator.writeKey("write_kilobytes");
			generator.write(this.writeKilobytes);

		}
		if (this.writeOperations != null) {
			generator.writeKey("write_operations");
			generator.write(this.writeOperations);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IoStatDevice}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IoStatDevice> {
		@Nullable
		private String deviceName;

		@Nullable
		private Long operations;

		@Nullable
		private Long readKilobytes;

		@Nullable
		private Long readOperations;

		@Nullable
		private Long writeKilobytes;

		@Nullable
		private Long writeOperations;

		/**
		 * API name: {@code device_name}
		 */
		public final Builder deviceName(@Nullable String value) {
			this.deviceName = value;
			return this;
		}

		/**
		 * API name: {@code operations}
		 */
		public final Builder operations(@Nullable Long value) {
			this.operations = value;
			return this;
		}

		/**
		 * API name: {@code read_kilobytes}
		 */
		public final Builder readKilobytes(@Nullable Long value) {
			this.readKilobytes = value;
			return this;
		}

		/**
		 * API name: {@code read_operations}
		 */
		public final Builder readOperations(@Nullable Long value) {
			this.readOperations = value;
			return this;
		}

		/**
		 * API name: {@code write_kilobytes}
		 */
		public final Builder writeKilobytes(@Nullable Long value) {
			this.writeKilobytes = value;
			return this;
		}

		/**
		 * API name: {@code write_operations}
		 */
		public final Builder writeOperations(@Nullable Long value) {
			this.writeOperations = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IoStatDevice}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IoStatDevice build() {
			_checkSingleUse();

			return new IoStatDevice(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IoStatDevice}
	 */
	public static final JsonpDeserializer<IoStatDevice> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IoStatDevice::setupIoStatDeviceDeserializer);

	protected static void setupIoStatDeviceDeserializer(ObjectDeserializer<IoStatDevice.Builder> op) {

		op.add(Builder::deviceName, JsonpDeserializer.stringDeserializer(), "device_name");
		op.add(Builder::operations, JsonpDeserializer.longDeserializer(), "operations");
		op.add(Builder::readKilobytes, JsonpDeserializer.longDeserializer(), "read_kilobytes");
		op.add(Builder::readOperations, JsonpDeserializer.longDeserializer(), "read_operations");
		op.add(Builder::writeKilobytes, JsonpDeserializer.longDeserializer(), "write_kilobytes");
		op.add(Builder::writeOperations, JsonpDeserializer.longDeserializer(), "write_operations");

	}

}
