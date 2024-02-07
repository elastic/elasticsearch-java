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

package co.elastic.clients.elasticsearch.searchable_snapshots.cache_stats;

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
import java.lang.Integer;
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

// typedef: searchable_snapshots.cache_stats.Shared

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#searchable_snapshots.cache_stats.Shared">API
 *      specification</a>
 */
@JsonpDeserializable
public class Shared implements JsonpSerializable {
	private final long reads;

	private final String bytesReadInBytes;

	private final long writes;

	private final String bytesWrittenInBytes;

	private final long evictions;

	private final int numRegions;

	private final String sizeInBytes;

	private final String regionSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	private Shared(Builder builder) {

		this.reads = ApiTypeHelper.requireNonNull(builder.reads, this, "reads");
		this.bytesReadInBytes = ApiTypeHelper.requireNonNull(builder.bytesReadInBytes, this, "bytesReadInBytes");
		this.writes = ApiTypeHelper.requireNonNull(builder.writes, this, "writes");
		this.bytesWrittenInBytes = ApiTypeHelper.requireNonNull(builder.bytesWrittenInBytes, this,
				"bytesWrittenInBytes");
		this.evictions = ApiTypeHelper.requireNonNull(builder.evictions, this, "evictions");
		this.numRegions = ApiTypeHelper.requireNonNull(builder.numRegions, this, "numRegions");
		this.sizeInBytes = ApiTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes");
		this.regionSizeInBytes = ApiTypeHelper.requireNonNull(builder.regionSizeInBytes, this, "regionSizeInBytes");

	}

	public static Shared of(Function<Builder, ObjectBuilder<Shared>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code reads}
	 */
	public final long reads() {
		return this.reads;
	}

	/**
	 * Required - API name: {@code bytes_read_in_bytes}
	 */
	public final String bytesReadInBytes() {
		return this.bytesReadInBytes;
	}

	/**
	 * Required - API name: {@code writes}
	 */
	public final long writes() {
		return this.writes;
	}

	/**
	 * Required - API name: {@code bytes_written_in_bytes}
	 */
	public final String bytesWrittenInBytes() {
		return this.bytesWrittenInBytes;
	}

	/**
	 * Required - API name: {@code evictions}
	 */
	public final long evictions() {
		return this.evictions;
	}

	/**
	 * Required - API name: {@code num_regions}
	 */
	public final int numRegions() {
		return this.numRegions;
	}

	/**
	 * Required - API name: {@code size_in_bytes}
	 */
	public final String sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * Required - API name: {@code region_size_in_bytes}
	 */
	public final String regionSizeInBytes() {
		return this.regionSizeInBytes;
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

		generator.writeKey("reads");
		generator.write(this.reads);

		generator.writeKey("bytes_read_in_bytes");
		generator.write(this.bytesReadInBytes);

		generator.writeKey("writes");
		generator.write(this.writes);

		generator.writeKey("bytes_written_in_bytes");
		generator.write(this.bytesWrittenInBytes);

		generator.writeKey("evictions");
		generator.write(this.evictions);

		generator.writeKey("num_regions");
		generator.write(this.numRegions);

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

		generator.writeKey("region_size_in_bytes");
		generator.write(this.regionSizeInBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Shared}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Shared> {
		private Long reads;

		private String bytesReadInBytes;

		private Long writes;

		private String bytesWrittenInBytes;

		private Long evictions;

		private Integer numRegions;

		private String sizeInBytes;

		private String regionSizeInBytes;

		/**
		 * Required - API name: {@code reads}
		 */
		public final Builder reads(long value) {
			this.reads = value;
			return this;
		}

		/**
		 * Required - API name: {@code bytes_read_in_bytes}
		 */
		public final Builder bytesReadInBytes(String value) {
			this.bytesReadInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code writes}
		 */
		public final Builder writes(long value) {
			this.writes = value;
			return this;
		}

		/**
		 * Required - API name: {@code bytes_written_in_bytes}
		 */
		public final Builder bytesWrittenInBytes(String value) {
			this.bytesWrittenInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code evictions}
		 */
		public final Builder evictions(long value) {
			this.evictions = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_regions}
		 */
		public final Builder numRegions(int value) {
			this.numRegions = value;
			return this;
		}

		/**
		 * Required - API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(String value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code region_size_in_bytes}
		 */
		public final Builder regionSizeInBytes(String value) {
			this.regionSizeInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Shared}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Shared build() {
			_checkSingleUse();

			return new Shared(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Shared}
	 */
	public static final JsonpDeserializer<Shared> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Shared::setupSharedDeserializer);

	protected static void setupSharedDeserializer(ObjectDeserializer<Shared.Builder> op) {

		op.add(Builder::reads, JsonpDeserializer.longDeserializer(), "reads");
		op.add(Builder::bytesReadInBytes, JsonpDeserializer.stringDeserializer(), "bytes_read_in_bytes");
		op.add(Builder::writes, JsonpDeserializer.longDeserializer(), "writes");
		op.add(Builder::bytesWrittenInBytes, JsonpDeserializer.stringDeserializer(), "bytes_written_in_bytes");
		op.add(Builder::evictions, JsonpDeserializer.longDeserializer(), "evictions");
		op.add(Builder::numRegions, JsonpDeserializer.integerDeserializer(), "num_regions");
		op.add(Builder::sizeInBytes, JsonpDeserializer.stringDeserializer(), "size_in_bytes");
		op.add(Builder::regionSizeInBytes, JsonpDeserializer.stringDeserializer(), "region_size_in_bytes");

	}

}
