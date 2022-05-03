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

// typedef: nodes._types.FileSystemTotal

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.FileSystemTotal">API
 *      specification</a>
 */
@JsonpDeserializable
public class FileSystemTotal implements JsonpSerializable {
	@Nullable
	private final String available;

	@Nullable
	private final Long availableInBytes;

	@Nullable
	private final String free;

	@Nullable
	private final Long freeInBytes;

	@Nullable
	private final String total;

	@Nullable
	private final Long totalInBytes;

	// ---------------------------------------------------------------------------------------------

	private FileSystemTotal(Builder builder) {

		this.available = builder.available;
		this.availableInBytes = builder.availableInBytes;
		this.free = builder.free;
		this.freeInBytes = builder.freeInBytes;
		this.total = builder.total;
		this.totalInBytes = builder.totalInBytes;

	}

	public static FileSystemTotal of(Function<Builder, ObjectBuilder<FileSystemTotal>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code available}
	 */
	@Nullable
	public final String available() {
		return this.available;
	}

	/**
	 * API name: {@code available_in_bytes}
	 */
	@Nullable
	public final Long availableInBytes() {
		return this.availableInBytes;
	}

	/**
	 * API name: {@code free}
	 */
	@Nullable
	public final String free() {
		return this.free;
	}

	/**
	 * API name: {@code free_in_bytes}
	 */
	@Nullable
	public final Long freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final String total() {
		return this.total;
	}

	/**
	 * API name: {@code total_in_bytes}
	 */
	@Nullable
	public final Long totalInBytes() {
		return this.totalInBytes;
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

		if (this.available != null) {
			generator.writeKey("available");
			generator.write(this.available);

		}
		if (this.availableInBytes != null) {
			generator.writeKey("available_in_bytes");
			generator.write(this.availableInBytes);

		}
		if (this.free != null) {
			generator.writeKey("free");
			generator.write(this.free);

		}
		if (this.freeInBytes != null) {
			generator.writeKey("free_in_bytes");
			generator.write(this.freeInBytes);

		}
		if (this.total != null) {
			generator.writeKey("total");
			generator.write(this.total);

		}
		if (this.totalInBytes != null) {
			generator.writeKey("total_in_bytes");
			generator.write(this.totalInBytes);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileSystemTotal}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FileSystemTotal> {
		@Nullable
		private String available;

		@Nullable
		private Long availableInBytes;

		@Nullable
		private String free;

		@Nullable
		private Long freeInBytes;

		@Nullable
		private String total;

		@Nullable
		private Long totalInBytes;

		/**
		 * API name: {@code available}
		 */
		public final Builder available(@Nullable String value) {
			this.available = value;
			return this;
		}

		/**
		 * API name: {@code available_in_bytes}
		 */
		public final Builder availableInBytes(@Nullable Long value) {
			this.availableInBytes = value;
			return this;
		}

		/**
		 * API name: {@code free}
		 */
		public final Builder free(@Nullable String value) {
			this.free = value;
			return this;
		}

		/**
		 * API name: {@code free_in_bytes}
		 */
		public final Builder freeInBytes(@Nullable Long value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable String value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_in_bytes}
		 */
		public final Builder totalInBytes(@Nullable Long value) {
			this.totalInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FileSystemTotal}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FileSystemTotal build() {
			_checkSingleUse();

			return new FileSystemTotal(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FileSystemTotal}
	 */
	public static final JsonpDeserializer<FileSystemTotal> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FileSystemTotal::setupFileSystemTotalDeserializer);

	protected static void setupFileSystemTotalDeserializer(ObjectDeserializer<FileSystemTotal.Builder> op) {

		op.add(Builder::available, JsonpDeserializer.stringDeserializer(), "available");
		op.add(Builder::availableInBytes, JsonpDeserializer.longDeserializer(), "available_in_bytes");
		op.add(Builder::free, JsonpDeserializer.stringDeserializer(), "free");
		op.add(Builder::freeInBytes, JsonpDeserializer.longDeserializer(), "free_in_bytes");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::totalInBytes, JsonpDeserializer.longDeserializer(), "total_in_bytes");

	}

}
