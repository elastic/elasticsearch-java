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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.FileSystem

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/nodes/_types/Stats.ts#L138-L142">API
 *      specification</a>
 */
@JsonpDeserializable
public class FileSystem implements JsonpSerializable {
	private final List<DataPathStats> data;

	private final long timestamp;

	private final FileSystemTotal total;

	// ---------------------------------------------------------------------------------------------

	private FileSystem(Builder builder) {

		this.data = ApiTypeHelper.unmodifiableRequired(builder.data, this, "data");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static FileSystem of(Function<Builder, ObjectBuilder<FileSystem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code data}
	 */
	public final List<DataPathStats> data() {
		return this.data;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final FileSystemTotal total() {
		return this.total;
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
		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileSystem}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FileSystem> {
		private List<DataPathStats> data;

		private Long timestamp;

		private FileSystemTotal total;

		/**
		 * Required - API name: {@code data}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>data</code>.
		 */
		public final Builder data(List<DataPathStats> list) {
			this.data = _listAddAll(this.data, list);
			return this;
		}

		/**
		 * Required - API name: {@code data}
		 * <p>
		 * Adds one or more values to <code>data</code>.
		 */
		public final Builder data(DataPathStats value, DataPathStats... values) {
			this.data = _listAdd(this.data, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code data}
		 * <p>
		 * Adds a value to <code>data</code> using a builder lambda.
		 */
		public final Builder data(Function<DataPathStats.Builder, ObjectBuilder<DataPathStats>> fn) {
			return data(fn.apply(new DataPathStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(FileSystemTotal value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(Function<FileSystemTotal.Builder, ObjectBuilder<FileSystemTotal>> fn) {
			return this.total(fn.apply(new FileSystemTotal.Builder()).build());
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

	}

}
