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

// typedef: nodes._types.SerializedClusterStateDetail

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes._types.SerializedClusterStateDetail">API
 *      specification</a>
 */
@JsonpDeserializable
public class SerializedClusterStateDetail implements JsonpSerializable {
	@Nullable
	private final Long count;

	@Nullable
	private final String uncompressedSize;

	@Nullable
	private final Long uncompressedSizeInBytes;

	@Nullable
	private final String compressedSize;

	@Nullable
	private final Long compressedSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	private SerializedClusterStateDetail(Builder builder) {

		this.count = builder.count;
		this.uncompressedSize = builder.uncompressedSize;
		this.uncompressedSizeInBytes = builder.uncompressedSizeInBytes;
		this.compressedSize = builder.compressedSize;
		this.compressedSizeInBytes = builder.compressedSizeInBytes;

	}

	public static SerializedClusterStateDetail of(Function<Builder, ObjectBuilder<SerializedClusterStateDetail>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public final Long count() {
		return this.count;
	}

	/**
	 * API name: {@code uncompressed_size}
	 */
	@Nullable
	public final String uncompressedSize() {
		return this.uncompressedSize;
	}

	/**
	 * API name: {@code uncompressed_size_in_bytes}
	 */
	@Nullable
	public final Long uncompressedSizeInBytes() {
		return this.uncompressedSizeInBytes;
	}

	/**
	 * API name: {@code compressed_size}
	 */
	@Nullable
	public final String compressedSize() {
		return this.compressedSize;
	}

	/**
	 * API name: {@code compressed_size_in_bytes}
	 */
	@Nullable
	public final Long compressedSizeInBytes() {
		return this.compressedSizeInBytes;
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

		if (this.count != null) {
			generator.writeKey("count");
			generator.write(this.count);

		}
		if (this.uncompressedSize != null) {
			generator.writeKey("uncompressed_size");
			generator.write(this.uncompressedSize);

		}
		if (this.uncompressedSizeInBytes != null) {
			generator.writeKey("uncompressed_size_in_bytes");
			generator.write(this.uncompressedSizeInBytes);

		}
		if (this.compressedSize != null) {
			generator.writeKey("compressed_size");
			generator.write(this.compressedSize);

		}
		if (this.compressedSizeInBytes != null) {
			generator.writeKey("compressed_size_in_bytes");
			generator.write(this.compressedSizeInBytes);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SerializedClusterStateDetail}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SerializedClusterStateDetail> {
		@Nullable
		private Long count;

		@Nullable
		private String uncompressedSize;

		@Nullable
		private Long uncompressedSizeInBytes;

		@Nullable
		private String compressedSize;

		@Nullable
		private Long compressedSizeInBytes;

		/**
		 * API name: {@code count}
		 */
		public final Builder count(@Nullable Long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code uncompressed_size}
		 */
		public final Builder uncompressedSize(@Nullable String value) {
			this.uncompressedSize = value;
			return this;
		}

		/**
		 * API name: {@code uncompressed_size_in_bytes}
		 */
		public final Builder uncompressedSizeInBytes(@Nullable Long value) {
			this.uncompressedSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code compressed_size}
		 */
		public final Builder compressedSize(@Nullable String value) {
			this.compressedSize = value;
			return this;
		}

		/**
		 * API name: {@code compressed_size_in_bytes}
		 */
		public final Builder compressedSizeInBytes(@Nullable Long value) {
			this.compressedSizeInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SerializedClusterStateDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SerializedClusterStateDetail build() {
			_checkSingleUse();

			return new SerializedClusterStateDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SerializedClusterStateDetail}
	 */
	public static final JsonpDeserializer<SerializedClusterStateDetail> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SerializedClusterStateDetail::setupSerializedClusterStateDetailDeserializer);

	protected static void setupSerializedClusterStateDetailDeserializer(
			ObjectDeserializer<SerializedClusterStateDetail.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::uncompressedSize, JsonpDeserializer.stringDeserializer(), "uncompressed_size");
		op.add(Builder::uncompressedSizeInBytes, JsonpDeserializer.longDeserializer(), "uncompressed_size_in_bytes");
		op.add(Builder::compressedSize, JsonpDeserializer.stringDeserializer(), "compressed_size");
		op.add(Builder::compressedSizeInBytes, JsonpDeserializer.longDeserializer(), "compressed_size_in_bytes");

	}

}
