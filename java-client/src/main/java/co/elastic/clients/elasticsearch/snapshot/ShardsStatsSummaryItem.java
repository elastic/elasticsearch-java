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
import java.util.Objects;
import java.util.function.Function;

// typedef: snapshot._types.ShardsStatsSummaryItem

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.ShardsStatsSummaryItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardsStatsSummaryItem implements JsonpSerializable {
	private final long fileCount;

	private final long sizeInBytes;

	// ---------------------------------------------------------------------------------------------

	private ShardsStatsSummaryItem(Builder builder) {

		this.fileCount = ApiTypeHelper.requireNonNull(builder.fileCount, this, "fileCount");
		this.sizeInBytes = ApiTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes");

	}

	public static ShardsStatsSummaryItem of(Function<Builder, ObjectBuilder<ShardsStatsSummaryItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code file_count}
	 */
	public final long fileCount() {
		return this.fileCount;
	}

	/**
	 * Required - API name: {@code size_in_bytes}
	 */
	public final long sizeInBytes() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsStatsSummaryItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ShardsStatsSummaryItem> {
		private Long fileCount;

		private Long sizeInBytes;

		/**
		 * Required - API name: {@code file_count}
		 */
		public final Builder fileCount(long value) {
			this.fileCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(long value) {
			this.sizeInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardsStatsSummaryItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsStatsSummaryItem build() {
			_checkSingleUse();

			return new ShardsStatsSummaryItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsStatsSummaryItem}
	 */
	public static final JsonpDeserializer<ShardsStatsSummaryItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardsStatsSummaryItem::setupShardsStatsSummaryItemDeserializer);

	protected static void setupShardsStatsSummaryItemDeserializer(
			ObjectDeserializer<ShardsStatsSummaryItem.Builder> op) {

		op.add(Builder::fileCount, JsonpDeserializer.longDeserializer(), "file_count");
		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");

	}

}
