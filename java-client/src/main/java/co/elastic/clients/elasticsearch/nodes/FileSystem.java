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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.FileSystem

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.FileSystem">API
 *      specification</a>
 */
@JsonpDeserializable
public class FileSystem implements JsonpSerializable {
	private final List<DataPathStats> data;

	@Nullable
	private final Long timestamp;

	@Nullable
	private final FileSystemTotal total;

	@Nullable
	private final IoStats ioStats;

	// ---------------------------------------------------------------------------------------------

	private FileSystem(Builder builder) {

		this.data = ApiTypeHelper.unmodifiable(builder.data);
		this.timestamp = builder.timestamp;
		this.total = builder.total;
		this.ioStats = builder.ioStats;

	}

	public static FileSystem of(Function<Builder, ObjectBuilder<FileSystem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code data}
	 */
	public final List<DataPathStats> data() {
		return this.data;
	}

	/**
	 * API name: {@code timestamp}
	 */
	@Nullable
	public final Long timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final FileSystemTotal total() {
		return this.total;
	}

	/**
	 * API name: {@code io_stats}
	 */
	@Nullable
	public final IoStats ioStats() {
		return this.ioStats;
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

		if (ApiTypeHelper.isDefined(this.data)) {
			generator.writeKey("data");
			generator.writeStartArray();
			for (DataPathStats item0 : this.data) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.timestamp != null) {
			generator.writeKey("timestamp");
			generator.write(this.timestamp);

		}
		if (this.total != null) {
			generator.writeKey("total");
			this.total.serialize(generator, mapper);

		}
		if (this.ioStats != null) {
			generator.writeKey("io_stats");
			this.ioStats.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileSystem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FileSystem> {
		@Nullable
		private List<DataPathStats> data;

		@Nullable
		private Long timestamp;

		@Nullable
		private FileSystemTotal total;

		@Nullable
		private IoStats ioStats;

		/**
		 * API name: {@code data}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>data</code>.
		 */
		public final Builder data(List<DataPathStats> list) {
			this.data = _listAddAll(this.data, list);
			return this;
		}

		/**
		 * API name: {@code data}
		 * <p>
		 * Adds one or more values to <code>data</code>.
		 */
		public final Builder data(DataPathStats value, DataPathStats... values) {
			this.data = _listAdd(this.data, value, values);
			return this;
		}

		/**
		 * API name: {@code data}
		 * <p>
		 * Adds a value to <code>data</code> using a builder lambda.
		 */
		public final Builder data(Function<DataPathStats.Builder, ObjectBuilder<DataPathStats>> fn) {
			return data(fn.apply(new DataPathStats.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(@Nullable Long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable FileSystemTotal value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(Function<FileSystemTotal.Builder, ObjectBuilder<FileSystemTotal>> fn) {
			return this.total(fn.apply(new FileSystemTotal.Builder()).build());
		}

		/**
		 * API name: {@code io_stats}
		 */
		public final Builder ioStats(@Nullable IoStats value) {
			this.ioStats = value;
			return this;
		}

		/**
		 * API name: {@code io_stats}
		 */
		public final Builder ioStats(Function<IoStats.Builder, ObjectBuilder<IoStats>> fn) {
			return this.ioStats(fn.apply(new IoStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FileSystem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FileSystem build() {
			_checkSingleUse();

			return new FileSystem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FileSystem}
	 */
	public static final JsonpDeserializer<FileSystem> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FileSystem::setupFileSystemDeserializer);

	protected static void setupFileSystemDeserializer(ObjectDeserializer<FileSystem.Builder> op) {

		op.add(Builder::data, JsonpDeserializer.arrayDeserializer(DataPathStats._DESERIALIZER), "data");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::total, FileSystemTotal._DESERIALIZER, "total");
		op.add(Builder::ioStats, IoStats._DESERIALIZER, "io_stats");

	}

}
