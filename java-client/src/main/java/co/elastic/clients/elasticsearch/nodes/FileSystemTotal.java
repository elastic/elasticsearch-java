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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.FileSystemTotal
@JsonpDeserializable
public class FileSystemTotal implements JsonpSerializable {
	private final String available;

	private final long availableInBytes;

	private final String free;

	private final long freeInBytes;

	private final String total;

	private final long totalInBytes;

	// ---------------------------------------------------------------------------------------------

	private FileSystemTotal(Builder builder) {

		this.available = ModelTypeHelper.requireNonNull(builder.available, this, "available");
		this.availableInBytes = ModelTypeHelper.requireNonNull(builder.availableInBytes, this, "availableInBytes");
		this.free = ModelTypeHelper.requireNonNull(builder.free, this, "free");
		this.freeInBytes = ModelTypeHelper.requireNonNull(builder.freeInBytes, this, "freeInBytes");
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.totalInBytes = ModelTypeHelper.requireNonNull(builder.totalInBytes, this, "totalInBytes");

	}

	public static FileSystemTotal of(Function<Builder, ObjectBuilder<FileSystemTotal>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code available}
	 */
	public final String available() {
		return this.available;
	}

	/**
	 * Required - API name: {@code available_in_bytes}
	 */
	public final long availableInBytes() {
		return this.availableInBytes;
	}

	/**
	 * Required - API name: {@code free}
	 */
	public final String free() {
		return this.free;
	}

	/**
	 * Required - API name: {@code free_in_bytes}
	 */
	public final long freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final String total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code total_in_bytes}
	 */
	public final long totalInBytes() {
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

		generator.writeKey("available");
		generator.write(this.available);

		generator.writeKey("available_in_bytes");
		generator.write(this.availableInBytes);

		generator.writeKey("free");
		generator.write(this.free);

		generator.writeKey("free_in_bytes");
		generator.write(this.freeInBytes);

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileSystemTotal}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FileSystemTotal> {
		private String available;

		private Long availableInBytes;

		private String free;

		private Long freeInBytes;

		private String total;

		private Long totalInBytes;

		/**
		 * Required - API name: {@code available}
		 */
		public final Builder available(String value) {
			this.available = value;
			return this;
		}

		/**
		 * Required - API name: {@code available_in_bytes}
		 */
		public final Builder availableInBytes(long value) {
			this.availableInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code free}
		 */
		public final Builder free(String value) {
			this.free = value;
			return this;
		}

		/**
		 * Required - API name: {@code free_in_bytes}
		 */
		public final Builder freeInBytes(long value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(String value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_in_bytes}
		 */
		public final Builder totalInBytes(long value) {
			this.totalInBytes = value;
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
			FileSystemTotal::setupFileSystemTotalDeserializer, Builder::build);

	protected static void setupFileSystemTotalDeserializer(DelegatingDeserializer<FileSystemTotal.Builder> op) {

		op.add(Builder::available, JsonpDeserializer.stringDeserializer(), "available");
		op.add(Builder::availableInBytes, JsonpDeserializer.longDeserializer(), "available_in_bytes");
		op.add(Builder::free, JsonpDeserializer.stringDeserializer(), "free");
		op.add(Builder::freeInBytes, JsonpDeserializer.longDeserializer(), "free_in_bytes");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::totalInBytes, JsonpDeserializer.longDeserializer(), "total_in_bytes");

	}

}
