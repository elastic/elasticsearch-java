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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: snapshot._types.ShardsStatsSummaryItem
public final class ShardsStatsSummaryItem implements JsonpSerializable {
	private final Number fileCount;

	private final Number sizeInBytes;

	// ---------------------------------------------------------------------------------------------

	public ShardsStatsSummaryItem(Builder builder) {

		this.fileCount = Objects.requireNonNull(builder.fileCount, "file_count");
		this.sizeInBytes = Objects.requireNonNull(builder.sizeInBytes, "size_in_bytes");

	}

	/**
	 * API name: {@code file_count}
	 */
	public Number fileCount() {
		return this.fileCount;
	}

	/**
	 * API name: {@code size_in_bytes}
	 */
	public Number sizeInBytes() {
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
		generator.write(this.fileCount.doubleValue());

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsStatsSummaryItem}.
	 */
	public static class Builder implements ObjectBuilder<ShardsStatsSummaryItem> {
		private Number fileCount;

		private Number sizeInBytes;

		/**
		 * API name: {@code file_count}
		 */
		public Builder fileCount(Number value) {
			this.fileCount = value;
			return this;
		}

		/**
		 * API name: {@code size_in_bytes}
		 */
		public Builder sizeInBytes(Number value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link ShardsStatsSummaryItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsStatsSummaryItem build() {

			return new ShardsStatsSummaryItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsStatsSummaryItem}
	 */
	public static final JsonpDeserializer<ShardsStatsSummaryItem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardsStatsSummaryItem::setupShardsStatsSummaryItemDeserializer);

	protected static void setupShardsStatsSummaryItemDeserializer(
			DelegatingDeserializer<ShardsStatsSummaryItem.Builder> op) {

		op.add(Builder::fileCount, JsonpDeserializer.numberDeserializer(), "file_count");
		op.add(Builder::sizeInBytes, JsonpDeserializer.numberDeserializer(), "size_in_bytes");

	}

}
