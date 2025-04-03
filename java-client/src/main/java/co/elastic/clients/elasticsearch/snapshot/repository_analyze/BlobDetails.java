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

package co.elastic.clients.elasticsearch.snapshot.repository_analyze;

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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: snapshot.repository_analyze.BlobDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#snapshot.repository_analyze.BlobDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class BlobDetails implements JsonpSerializable {
	private final String name;

	private final boolean overwritten;

	private final boolean readEarly;

	private final long readEnd;

	private final long readStart;

	private final ReadBlobDetails reads;

	private final String size;

	private final long sizeBytes;

	// ---------------------------------------------------------------------------------------------

	private BlobDetails(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.overwritten = ApiTypeHelper.requireNonNull(builder.overwritten, this, "overwritten", false);
		this.readEarly = ApiTypeHelper.requireNonNull(builder.readEarly, this, "readEarly", false);
		this.readEnd = ApiTypeHelper.requireNonNull(builder.readEnd, this, "readEnd", 0);
		this.readStart = ApiTypeHelper.requireNonNull(builder.readStart, this, "readStart", 0);
		this.reads = ApiTypeHelper.requireNonNull(builder.reads, this, "reads");
		this.size = ApiTypeHelper.requireNonNull(builder.size, this, "size");
		this.sizeBytes = ApiTypeHelper.requireNonNull(builder.sizeBytes, this, "sizeBytes", 0);

	}

	public static BlobDetails of(Function<Builder, ObjectBuilder<BlobDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the blob.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - Indicates whether the blob was overwritten while the read
	 * operations were ongoing. /**
	 * <p>
	 * API name: {@code overwritten}
	 */
	public final boolean overwritten() {
		return this.overwritten;
	}

	/**
	 * Required - API name: {@code read_early}
	 */
	public final boolean readEarly() {
		return this.readEarly;
	}

	/**
	 * Required - The position, in bytes, at which read operations completed.
	 * <p>
	 * API name: {@code read_end}
	 */
	public final long readEnd() {
		return this.readEnd;
	}

	/**
	 * Required - The position, in bytes, at which read operations started.
	 * <p>
	 * API name: {@code read_start}
	 */
	public final long readStart() {
		return this.readStart;
	}

	/**
	 * Required - A description of every read operation performed on the blob.
	 * <p>
	 * API name: {@code reads}
	 */
	public final ReadBlobDetails reads() {
		return this.reads;
	}

	/**
	 * Required - The size of the blob.
	 * <p>
	 * API name: {@code size}
	 */
	public final String size() {
		return this.size;
	}

	/**
	 * Required - The size of the blob in bytes.
	 * <p>
	 * API name: {@code size_bytes}
	 */
	public final long sizeBytes() {
		return this.sizeBytes;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("overwritten");
		generator.write(this.overwritten);

		generator.writeKey("read_early");
		generator.write(this.readEarly);

		generator.writeKey("read_end");
		generator.write(this.readEnd);

		generator.writeKey("read_start");
		generator.write(this.readStart);

		generator.writeKey("reads");
		this.reads.serialize(generator, mapper);

		generator.writeKey("size");
		generator.write(this.size);

		generator.writeKey("size_bytes");
		generator.write(this.sizeBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BlobDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<BlobDetails> {
		private String name;

		private Boolean overwritten;

		private Boolean readEarly;

		private Long readEnd;

		private Long readStart;

		private ReadBlobDetails reads;

		private String size;

		private Long sizeBytes;

		/**
		 * Required - The name of the blob.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - Indicates whether the blob was overwritten while the read
		 * operations were ongoing. /**
		 * <p>
		 * API name: {@code overwritten}
		 */
		public final Builder overwritten(boolean value) {
			this.overwritten = value;
			return this;
		}

		/**
		 * Required - API name: {@code read_early}
		 */
		public final Builder readEarly(boolean value) {
			this.readEarly = value;
			return this;
		}

		/**
		 * Required - The position, in bytes, at which read operations completed.
		 * <p>
		 * API name: {@code read_end}
		 */
		public final Builder readEnd(long value) {
			this.readEnd = value;
			return this;
		}

		/**
		 * Required - The position, in bytes, at which read operations started.
		 * <p>
		 * API name: {@code read_start}
		 */
		public final Builder readStart(long value) {
			this.readStart = value;
			return this;
		}

		/**
		 * Required - A description of every read operation performed on the blob.
		 * <p>
		 * API name: {@code reads}
		 */
		public final Builder reads(ReadBlobDetails value) {
			this.reads = value;
			return this;
		}

		/**
		 * Required - A description of every read operation performed on the blob.
		 * <p>
		 * API name: {@code reads}
		 */
		public final Builder reads(Function<ReadBlobDetails.Builder, ObjectBuilder<ReadBlobDetails>> fn) {
			return this.reads(fn.apply(new ReadBlobDetails.Builder()).build());
		}

		/**
		 * Required - The size of the blob.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(String value) {
			this.size = value;
			return this;
		}

		/**
		 * Required - The size of the blob in bytes.
		 * <p>
		 * API name: {@code size_bytes}
		 */
		public final Builder sizeBytes(long value) {
			this.sizeBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BlobDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BlobDetails build() {
			_checkSingleUse();

			return new BlobDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BlobDetails}
	 */
	public static final JsonpDeserializer<BlobDetails> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BlobDetails::setupBlobDetailsDeserializer);

	protected static void setupBlobDetailsDeserializer(ObjectDeserializer<BlobDetails.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::overwritten, JsonpDeserializer.booleanDeserializer(), "overwritten");
		op.add(Builder::readEarly, JsonpDeserializer.booleanDeserializer(), "read_early");
		op.add(Builder::readEnd, JsonpDeserializer.longDeserializer(), "read_end");
		op.add(Builder::readStart, JsonpDeserializer.longDeserializer(), "read_start");
		op.add(Builder::reads, ReadBlobDetails._DESERIALIZER, "reads");
		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::sizeBytes, JsonpDeserializer.longDeserializer(), "size_bytes");

	}

}
