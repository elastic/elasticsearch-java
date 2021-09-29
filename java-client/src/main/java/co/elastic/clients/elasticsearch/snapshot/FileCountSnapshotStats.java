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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: snapshot._types.FileCountSnapshotStats
@JsonpDeserializable
public final class FileCountSnapshotStats implements JsonpSerializable {
	private final int fileCount;

	private final long sizeInBytes;

	// ---------------------------------------------------------------------------------------------

	public FileCountSnapshotStats(Builder builder) {

		this.fileCount = Objects.requireNonNull(builder.fileCount, "file_count");
		this.sizeInBytes = Objects.requireNonNull(builder.sizeInBytes, "size_in_bytes");

	}

	public FileCountSnapshotStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code file_count}
	 */
	public int fileCount() {
		return this.fileCount;
	}

	/**
	 * API name: {@code size_in_bytes}
	 */
	public long sizeInBytes() {
		return this.sizeInBytes;
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

		generator.writeKey("file_count");
		generator.write(this.fileCount);

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileCountSnapshotStats}.
	 */
	public static class Builder implements ObjectBuilder<FileCountSnapshotStats> {
		private Integer fileCount;

		private Long sizeInBytes;

		/**
		 * API name: {@code file_count}
		 */
		public Builder fileCount(int value) {
			this.fileCount = value;
			return this;
		}

		/**
		 * API name: {@code size_in_bytes}
		 */
		public Builder sizeInBytes(long value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link FileCountSnapshotStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FileCountSnapshotStats build() {

			return new FileCountSnapshotStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FileCountSnapshotStats}
	 */
	public static final JsonpDeserializer<FileCountSnapshotStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FileCountSnapshotStats::setupFileCountSnapshotStatsDeserializer, Builder::build);

	protected static void setupFileCountSnapshotStatsDeserializer(
			DelegatingDeserializer<FileCountSnapshotStats.Builder> op) {

		op.add(Builder::fileCount, JsonpDeserializer.integerDeserializer(), "file_count");
		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");

	}

}
